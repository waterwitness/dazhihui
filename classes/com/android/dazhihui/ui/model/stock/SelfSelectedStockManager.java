package com.android.dazhihui.ui.model.stock;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.util.Log;
import android.util.Pair;
import android.widget.Toast;
import com.android.dazhihui.DzhApplication;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.i;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.m;
import com.android.dazhihui.a.b.n;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.c.a.f;
import com.android.dazhihui.d.c;
import com.android.dazhihui.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Vector;

public class SelfSelectedStockManager
  implements i
{
  public static final String ACTION_SELF_STOCK_CHANGED = "com.android.dazhihui.action.SELF_STOCK_CHANGED";
  public static final int BROWSE_TYPE = 1;
  public static final int INDEX_TYPE = 3;
  private static final int RESET_SELF_STOCK_MSG = 0;
  public static final int SELF_STOCK_ACTION_ADD = 0;
  public static final int SELF_STOCK_ACTION_DEL = 1;
  public static final int SELF_STOCK_ACTION_REPLACE = 2;
  public static final int SELF_STOCK_SYNC_DISABLE = 2;
  public static final int SELF_STOCK_SYNC_ENABLE = 1;
  public static final int SELF_TYPE = 0;
  public static final int SPECIAL_BROWSE_TYPE = 2;
  private static final int UPLOAD_DEFAULT_MSG = 1;
  private static SelfSelectedStockManager s_Instance;
  private Vector<SelfStock> mBrowseStockVec = new Vector();
  private Context mContext;
  public volatile boolean mDataBaseError = false;
  private d mDb = d.a();
  private Handler mHandler = new SelfSelectedStockManager.1(this, Looper.getMainLooper());
  private Vector<SelfStock> mIndexStockVec = new Vector();
  private m mResetRequest = null;
  private Vector<SelfStock> mSelfStockVec = new Vector();
  private long mSelfStockVersion = 0L;
  private f mSelfstockDB = f.a();
  private Vector<SelfStock> mSpecialBrowseStockVec = new Vector();
  private int needSynchro = 2;
  private SelfSelectedStockManager.SynchroType synchroType = SelfSelectedStockManager.SynchroType.LOCAL_MERGE_SERVER;
  
  private boolean canAddBrowseStock(String paramString)
  {
    if (TextUtils.isEmpty(paramString)) {}
    while ((!paramString.startsWith("SH")) && (!paramString.startsWith("SZ")) && (!paramString.startsWith("BI")) && (!paramString.startsWith("HK"))) {
      return false;
    }
    return true;
  }
  
  private void clearLocalSelfStockVector()
  {
    this.mSelfStockVec.clear();
    this.mSelfstockDB.a(String.valueOf(0));
    sendSelfStockChangedBroadCast();
  }
  
  public static boolean getBoolean(String paramString1, Context paramContext, String paramString2, boolean paramBoolean)
  {
    return paramContext.getSharedPreferences(paramString1, 0).getBoolean(paramString2, paramBoolean);
  }
  
  public static SelfSelectedStockManager getInstance()
  {
    if (s_Instance == null) {}
    try
    {
      if (s_Instance == null) {
        s_Instance = new SelfSelectedStockManager();
      }
      return s_Instance;
    }
    finally {}
  }
  
  public static long getLong(String paramString1, Context paramContext, String paramString2, long paramLong)
  {
    return paramContext.getSharedPreferences(paramString1, 0).getLong(paramString2, paramLong);
  }
  
  private void loadSelfDataFromDB()
  {
    this.mSelfStockVec = this.mSelfstockDB.b(String.valueOf(0));
    this.mBrowseStockVec = this.mSelfstockDB.b(String.valueOf(1));
    this.mSpecialBrowseStockVec = this.mSelfstockDB.b(String.valueOf(2));
    this.mIndexStockVec = this.mSelfstockDB.b(String.valueOf(3));
    int i = this.mDb.b("first_self_stock", 1);
    boolean bool = getBoolean("first_self_stock", DzhApplication.a().getApplicationContext(), "first_self_stock", true);
    if ((i == 1) && (this.mSelfStockVec.size() <= 0) && (bool))
    {
      Vector localVector = new Vector();
      i = c.a.length - 1;
      while (i >= 0)
      {
        addSelfStockToLocal(c.a[i], c.b[i]);
        i -= 1;
      }
      i = 0;
      while (i < c.a.length)
      {
        localVector.add(c.a[i]);
        i += 1;
      }
      Message localMessage = Message.obtain();
      localMessage.obj = localVector;
      localMessage.what = 1;
      this.mHandler.sendMessageDelayed(localMessage, 15000L);
    }
    for (;;)
    {
      setBoolean("first_self_stock", DzhApplication.a().getApplicationContext(), "first_self_stock", false);
      return;
      if (bool)
      {
        if (this.mSelfStockVec.size() <= 0)
        {
          this.mSelfStockVec = this.mDb.a(String.valueOf(0));
          this.mSelfstockDB.a(this.mSelfStockVec);
        }
        if (this.mBrowseStockVec.size() <= 0)
        {
          this.mBrowseStockVec = this.mDb.a(String.valueOf(1));
          this.mSelfstockDB.a(this.mBrowseStockVec);
        }
        if (this.mSpecialBrowseStockVec.size() <= 0)
        {
          this.mSpecialBrowseStockVec = this.mDb.a(String.valueOf(2));
          this.mSelfstockDB.a(this.mSpecialBrowseStockVec);
        }
      }
    }
  }
  
  public static void println(String paramString1, String paramString2) {}
  
  private void removeSelfStockFromLocal(SelfStock paramSelfStock)
  {
    paramSelfStock = paramSelfStock.getCode();
    int i = 0;
    for (;;)
    {
      if (i < this.mSelfStockVec.size())
      {
        if (((SelfStock)this.mSelfStockVec.get(i)).getCode().equals(paramSelfStock))
        {
          this.mSelfStockVec.remove(i);
          this.mSelfstockDB.a(paramSelfStock, String.valueOf(0));
          sendSelfStockChangedBroadCast();
        }
      }
      else {
        return;
      }
      i += 1;
    }
  }
  
  private void resetDeviceSelfStock()
  {
    x localx1 = new x(3003);
    localx1.b(2);
    x localx2 = new x(111);
    localx2.a(com.android.dazhihui.g.a().v());
    localx2.b(com.android.dazhihui.g.a().ac());
    localx1.a(localx2);
    this.mResetRequest = new m(localx1);
    this.mResetRequest.a(n.a);
    this.mResetRequest.a(this);
    com.android.dazhihui.a.g.a().a(this.mResetRequest);
  }
  
  public static void setBoolean(String paramString1, Context paramContext, String paramString2, boolean paramBoolean)
  {
    paramContext.getSharedPreferences(paramString1, 0).edit().putBoolean(paramString2, paramBoolean).commit();
  }
  
  public static void setLong(String paramString1, Context paramContext, String paramString2, long paramLong)
  {
    paramContext.getSharedPreferences(paramString1, 0).edit().putLong(paramString2, paramLong).commit();
  }
  
  public void addBrowseStock(String paramString1, String paramString2, int paramInt)
  {
    if (TextUtils.isEmpty(paramString1)) {}
    int i;
    label68:
    do
    {
      do
      {
        return;
        addSpecialBrowseStock(paramString1, paramString2);
      } while (!canAddBrowseStock(paramString1));
      i = 0;
      for (;;)
      {
        if (i >= this.mSelfStockVec.size()) {
          break label68;
        }
        if (((SelfStock)this.mSelfStockVec.get(i)).getCode().equals(paramString1)) {
          break;
        }
        i += 1;
      }
      i = 0;
      if (i >= this.mBrowseStockVec.size()) {
        break label271;
      }
      if (!((SelfStock)this.mBrowseStockVec.get(i)).getCode().equals(paramString1)) {
        break;
      }
    } while (i == 0);
    SelfStock localSelfStock1 = (SelfStock)this.mBrowseStockVec.remove(i);
    this.mSelfstockDB.a(paramString1, String.valueOf(1));
    for (;;)
    {
      if (this.mBrowseStockVec.size() >= 100)
      {
        i = this.mBrowseStockVec.size() - 1;
        for (;;)
        {
          if (i >= 100)
          {
            SelfStock localSelfStock2 = (SelfStock)this.mBrowseStockVec.remove(i);
            this.mSelfstockDB.a(localSelfStock2.getCode(), String.valueOf(1));
            i -= 1;
            continue;
            i += 1;
            break;
          }
        }
      }
      if (localSelfStock1 != null) {
        this.mBrowseStockVec.add(0, localSelfStock1);
      }
      for (;;)
      {
        this.mSelfstockDB.a(localSelfStock1);
        return;
        localSelfStock1 = new SelfStock(paramString2, paramString1, 1);
        localSelfStock1.setType(paramInt);
        this.mBrowseStockVec.add(0, localSelfStock1);
      }
      label271:
      localSelfStock1 = null;
    }
  }
  
  public boolean addSelfStock(String paramString1, String paramString2)
  {
    if (TextUtils.isEmpty(paramString1)) {
      return false;
    }
    boolean bool = addSelfStockToLocal(paramString1, paramString2);
    paramString2 = new Vector();
    paramString2.add(paramString1);
    requestSyncSelfStockToServerByType(0, paramString2);
    return bool;
  }
  
  public boolean addSelfStockToLocal(String paramString1, String paramString2)
  {
    if (TextUtils.isEmpty(paramString1)) {}
    label50:
    long l;
    do
    {
      return false;
      int i = 0;
      for (;;)
      {
        if (i >= this.mSelfStockVec.size()) {
          break label50;
        }
        if (((SelfStock)this.mSelfStockVec.elementAt(i)).getCode().equals(paramString1)) {
          break;
        }
        i += 1;
      }
      removeBrowseStock(paramString1);
      paramString1 = new SelfStock(paramString2, paramString1, 0);
      i = 0;
      for (;;)
      {
        if (i < this.mSelfStockVec.size())
        {
          paramString2 = (SelfStock)this.mSelfStockVec.get(i);
          if ((paramString2 != null) && (paramString2.getPingTop())) {}
        }
        else
        {
          this.mSelfStockVec.add(i, paramString1);
          l = this.mSelfstockDB.a(paramString1);
          if (this.mSelfStockVec.size() <= 100) {
            break;
          }
          i = this.mSelfStockVec.size() - 1;
          while (i >= 100)
          {
            paramString1 = (SelfStock)this.mSelfStockVec.remove(i);
            this.mSelfstockDB.a(paramString1.getCode(), String.valueOf(0));
            i -= 1;
          }
        }
        i += 1;
      }
      sendSelfStockChangedBroadCast();
    } while (l == -1L);
    return true;
  }
  
  public void addSpecialBrowseStock(String paramString1, String paramString2)
  {
    if (TextUtils.isEmpty(paramString1)) {}
    int i;
    do
    {
      do
      {
        return;
      } while ((!paramString1.startsWith("SH")) && (!paramString1.startsWith("SZ")) && (!paramString1.startsWith("BI")));
      i = 0;
      if (i >= this.mSpecialBrowseStockVec.size()) {
        break label226;
      }
      if (!((SelfStock)this.mSpecialBrowseStockVec.get(i)).getCode().equals(paramString1)) {
        break;
      }
    } while (i == 0);
    SelfStock localSelfStock1 = (SelfStock)this.mSpecialBrowseStockVec.remove(i);
    this.mSelfstockDB.a(paramString1, String.valueOf(2));
    for (;;)
    {
      if (this.mSpecialBrowseStockVec.size() >= 19)
      {
        i = this.mSpecialBrowseStockVec.size() - 1;
        for (;;)
        {
          if (i >= 19)
          {
            SelfStock localSelfStock2 = (SelfStock)this.mSpecialBrowseStockVec.remove(i);
            this.mSelfstockDB.a(localSelfStock2.getCode(), String.valueOf(2));
            i -= 1;
            continue;
            i += 1;
            break;
          }
        }
      }
      if (localSelfStock1 != null) {
        this.mSpecialBrowseStockVec.add(0, localSelfStock1);
      }
      for (;;)
      {
        this.mSelfstockDB.a(localSelfStock1);
        return;
        localSelfStock1 = new SelfStock(paramString2, paramString1, 2);
        this.mSpecialBrowseStockVec.add(0, localSelfStock1);
      }
      label226:
      localSelfStock1 = null;
    }
  }
  
  public String appendSpecialBrowseStockVector(String paramString)
  {
    Vector localVector = getInstance().getSpecialBrowseStockVector();
    String str = "";
    int i = 0;
    if (i < localVector.size())
    {
      if (i == 0) {}
      for (str = ((SelfStock)localVector.get(i)).getCode();; str = str + "," + ((SelfStock)localVector.get(i)).getCode())
      {
        i += 1;
        break;
      }
    }
    if ((paramString != null) && (paramString.contains("?"))) {}
    for (paramString = paramString + "&code=" + str;; paramString = paramString + "?code=" + str)
    {
      if (com.android.dazhihui.g.a().L()) {
        Log.i("GUH", "慧投顾 url=" + paramString);
      }
      return paramString;
    }
  }
  
  public void clear()
  {
    this.mSelfStockVec.clear();
    this.mBrowseStockVec.clear();
    this.mSpecialBrowseStockVec.clear();
  }
  
  public void clearBrowseStockVector()
  {
    this.mBrowseStockVec.clear();
    this.mSelfstockDB.a(String.valueOf(1));
  }
  
  public void clearSpecialBrowseStockVector()
  {
    this.mSpecialBrowseStockVec.clear();
    this.mSelfstockDB.a(String.valueOf(2));
  }
  
  public boolean exitSelfStock(String paramString)
  {
    boolean bool2 = false;
    int i = 0;
    for (;;)
    {
      boolean bool1 = bool2;
      if (i < this.mSelfStockVec.size())
      {
        if (((SelfStock)this.mSelfStockVec.get(i)).getCode().equals(paramString)) {
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
      i += 1;
    }
  }
  
  public Vector<String> getBrowseStockCodeVector()
  {
    Vector localVector = new Vector();
    Iterator localIterator = this.mBrowseStockVec.iterator();
    while (localIterator.hasNext()) {
      localVector.add(((SelfStock)localIterator.next()).getCode());
    }
    return localVector;
  }
  
  public Vector<String> getBrowseStockCodeVector(int paramInt1, int paramInt2)
  {
    Vector localVector = new Vector();
    while ((paramInt1 <= paramInt2) && (paramInt1 < this.mBrowseStockVec.size()))
    {
      localVector.add(((SelfStock)this.mBrowseStockVec.get(paramInt1)).getCode());
      paramInt1 += 1;
    }
    return localVector;
  }
  
  public Vector<SelfStock> getBrowseStockVector()
  {
    return this.mBrowseStockVec;
  }
  
  public Vector<SelfStock> getBrowseStockVector(int paramInt1, int paramInt2)
  {
    Vector localVector = new Vector();
    while ((paramInt1 <= paramInt2) && (paramInt1 < this.mBrowseStockVec.size()))
    {
      localVector.add(this.mBrowseStockVec.get(paramInt1));
      paramInt1 += 1;
    }
    return localVector;
  }
  
  public Vector<SelfStock> getBrowserStockVectorByShallowCopy()
  {
    Vector localVector = new Vector();
    Iterator localIterator = this.mBrowseStockVec.iterator();
    while (localIterator.hasNext()) {
      localVector.add((SelfStock)localIterator.next());
    }
    return localVector;
  }
  
  public Vector<SelfStock> getIndexStockVector()
  {
    if (this.mIndexStockVec == null) {
      this.mIndexStockVec = new Vector();
    }
    if (com.android.dazhihui.g.a().L()) {
      Log.i("index", "getIndexStockVector=" + this.mIndexStockVec.size());
    }
    return this.mIndexStockVec;
  }
  
  public int getNeedSynchro()
  {
    return this.needSynchro;
  }
  
  public SelfSelectedStockManager.SynchroType getNeedSynchroType()
  {
    return this.synchroType;
  }
  
  public Vector<String> getSelfStockCodeVector()
  {
    Vector localVector = new Vector();
    Iterator localIterator = this.mSelfStockVec.iterator();
    while (localIterator.hasNext()) {
      localVector.add(((SelfStock)localIterator.next()).getCode());
    }
    return localVector;
  }
  
  public Vector<String> getSelfStockCodeVector(int paramInt1, int paramInt2)
  {
    Vector localVector = new Vector();
    while ((paramInt1 <= paramInt2) && (paramInt1 < this.mSelfStockVec.size()))
    {
      localVector.add(((SelfStock)this.mSelfStockVec.get(paramInt1)).getCode());
      paramInt1 += 1;
    }
    return localVector;
  }
  
  public Vector<SelfStock> getSelfStockVector()
  {
    return this.mSelfStockVec;
  }
  
  public Vector<SelfStock> getSelfStockVectorByShallowCopy()
  {
    Vector localVector = new Vector();
    Iterator localIterator = this.mSelfStockVec.iterator();
    while (localIterator.hasNext()) {
      localVector.add((SelfStock)localIterator.next());
    }
    return localVector;
  }
  
  public int getSelfStockVectorSize()
  {
    return this.mSelfStockVec.size();
  }
  
  public long getSelfStockVersion()
  {
    return this.mSelfStockVersion;
  }
  
  public Vector<SelfStock> getSpecialBrowseStockVector()
  {
    return this.mSpecialBrowseStockVec;
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    paramj = ((o)paramj).h();
    if ((paramj != null) && (paramj.a == 3003))
    {
      paramj = new q(paramj.b);
      switch (paramj.b())
      {
      }
    }
    do
    {
      int i;
      Object localObject1;
      do
      {
        int j;
        Object localObject2;
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  do
                  {
                    do
                    {
                      do
                      {
                        return;
                        i = paramj.e();
                        paramj.e();
                        paramj.e();
                        switch (i)
                        {
                        case 107: 
                        case 108: 
                        case 109: 
                        default: 
                          return;
                        }
                      } while (paramj.b() != 0);
                      paramj.b();
                      paramj.b();
                      paramj.b();
                      setSelfStockVersion(paramj.k());
                      paramh = (SelfSelectedStockManager.ExtraObject)paramh.j();
                    } while (paramh == null);
                    if (paramh.action != 0) {
                      break;
                    }
                    paramh = (List)paramh.obj;
                  } while ((paramh == null) || (paramh.size() <= 0));
                  paramh = paramh.iterator();
                  while (paramh.hasNext())
                  {
                    paramj = (Pair)paramh.next();
                    addSelfStockToLocal((String)paramj.first, (String)paramj.second);
                  }
                  if (paramh.action != 1) {
                    break;
                  }
                  paramh = (List)paramh.obj;
                } while ((paramh == null) || (paramh.size() <= 0));
                paramh = paramh.iterator();
                while (paramh.hasNext()) {
                  removeSelfStockFromLocal((SelfStock)paramh.next());
                }
              } while (paramh.action != 2);
              paramj = (Vector)paramh.obj;
              if ((paramj == null) || (paramj.size() == 0))
              {
                clearLocalSelfStockVector();
                sendSelfStockChangedBroadCast();
                return;
              }
            } while (!paramh.sync);
            paramh = new Vector();
            j = Math.min(paramj.size(), 100);
            i = 0;
            while (i < j)
            {
              paramh.add(new SelfStock("", (String)paramj.get(i), 0));
              i += 1;
            }
            paramj = new Vector();
            paramj.addAll(paramh);
            i = this.mSelfStockVec.size() - 1;
            while (i >= 0)
            {
              localObject1 = (SelfStock)this.mSelfStockVec.get(i);
              if ((localObject1 == null) || (!((SelfStock)localObject1).getPingTop()))
              {
                i -= 1;
              }
              else
              {
                localObject2 = paramh.iterator();
                while (((Iterator)localObject2).hasNext())
                {
                  SelfStock localSelfStock = (SelfStock)((Iterator)localObject2).next();
                  if ((localSelfStock != null) && (localSelfStock.getCode() != null) && (localSelfStock.getCode().equals(((SelfStock)localObject1).getCode())))
                  {
                    localSelfStock.setPingTop(true);
                    paramj.remove(localSelfStock);
                    paramj.insertElementAt(localSelfStock, 0);
                  }
                }
              }
            }
            setLocalSelfStockVector(paramj);
            return;
          } while (paramj.b() != 0);
          paramj.b();
          paramj.b();
          paramj.b();
          setSelfStockVersion(paramj.k());
          paramj.l();
          paramh = paramj.n();
          paramj = new Vector();
          j = Math.min(paramh.size(), 100);
          i = 0;
          while (i < j)
          {
            removeBrowseStock((String)paramh.get(i));
            paramj.add(new SelfStock("", (String)paramh.get(i), 0));
            i += 1;
          }
          setLocalSelfStockVector(paramj);
          return;
          i = paramj.b();
          if (i != 0) {
            break;
          }
          paramh = (SelfSelectedStockManager.SynchroType)paramh.j();
        } while ((paramh == null) || (paramh == SelfSelectedStockManager.SynchroType.LOCAL_COVER_SERVER) || ((paramh != SelfSelectedStockManager.SynchroType.SERVER_COVER_LOCAL) && (paramh != SelfSelectedStockManager.SynchroType.LOCAL_MERGE_SERVER)));
        localObject1 = new Vector();
        int k = paramj.b();
        if (k > 0)
        {
          i = 0;
          while (i < k)
          {
            paramj.b();
            paramj.b();
            setSelfStockVersion(paramj.k());
            paramj.l();
            localObject2 = paramj.n();
            int m = Math.min(((Vector)localObject2).size(), 100);
            j = 0;
            while (j < m)
            {
              ((Vector)localObject1).add(new SelfStock("", (String)((Vector)localObject2).get(j), 0));
              j += 1;
            }
            i += 1;
          }
        }
        Log.i("asdzxc", "同步返回 type=" + paramh + " size=" + ((Vector)localObject1).size());
      } while ((((Vector)localObject1).size() <= 0) || (this.needSynchro != 1));
      setLocalSelfStockVector((Vector)localObject1);
      return;
      if (i == 1)
      {
        Toast.makeText(this.mContext, 2131166335, 0).show();
        return;
      }
      if (i == 2)
      {
        Toast.makeText(this.mContext, 2131166336, 0).show();
        return;
      }
      Toast.makeText(this.mContext, 2131166337, 0).show();
      return;
    } while (paramj.b() == 0);
    Toast.makeText(this.mContext, "Reset self_stock error!", 0);
  }
  
  public void handleTimeout(h paramh)
  {
    if (this.mResetRequest == paramh) {
      this.mHandler.sendEmptyMessageDelayed(0, 300000L);
    }
    if ((paramh != null) && ((paramh instanceof m)))
    {
      Log.i("asdzxc", "handleTimeout " + ((m)paramh).v());
      if (("开启自选股同步110".equals(((m)paramh).v())) && (this.mContext != null)) {
        Toast.makeText(this.mContext, "自选股同步超时!", 1).show();
      }
    }
  }
  
  public void loadDataFromLocal()
  {
    clear();
    int i = this.mDb.b("first_self_stock", 1);
    boolean bool = getBoolean("first_self_stock", DzhApplication.a().getApplicationContext(), "first_self_stock", true);
    if ((i == 1) && (bool))
    {
      Object localObject1 = this.mDb.e("STOCK_LATER");
      if (localObject1 != null)
      {
        localObject1 = new q((byte[])localObject1).n();
        if ((localObject1 != null) && (((Vector)localObject1).size() > 0))
        {
          i = ((Vector)localObject1).size() - 1;
          while (i >= 0)
          {
            addBrowseStock((String)((Vector)localObject1).get(i), "", 1);
            i -= 1;
          }
        }
      }
      localObject1 = this.mDb.e("STOCK_FREE");
      if (localObject1 != null)
      {
        Object localObject2 = new q((byte[])localObject1).n();
        if ((localObject2 != null) && (((Vector)localObject2).size() > 0))
        {
          localObject1 = new Vector();
          i = ((Vector)localObject2).size() - 1;
          while (i >= 0)
          {
            String str = (String)((Vector)localObject2).get(i);
            addSelfStockToLocal(str, "");
            ((Vector)localObject1).add(str);
            i -= 1;
          }
          localObject2 = Message.obtain();
          ((Message)localObject2).obj = localObject1;
          ((Message)localObject2).what = 1;
          this.mHandler.sendMessageDelayed((Message)localObject2, 15000L);
        }
      }
      if ((this.mSelfStockVec != null) && (this.mSelfStockVec.size() > 0))
      {
        this.mSelfstockDB.a(this.mSelfStockVec);
        setBoolean("first_self_stock", DzhApplication.a().getApplicationContext(), "first_self_stock", false);
        return;
      }
      loadSelfDataFromDB();
      return;
    }
    loadSelfDataFromDB();
  }
  
  public void netException(h paramh, Exception paramException)
  {
    if (this.mResetRequest == paramh) {
      this.mHandler.sendEmptyMessageDelayed(0, 300000L);
    }
    if ((paramh != null) && ((paramh instanceof m)))
    {
      Log.i("asdzxc", "netException " + ((m)paramh).v());
      if (("开启自选股同步110".equals(((m)paramh).v())) && (this.mContext != null)) {
        Toast.makeText(this.mContext, "自选股同步时网络异常!", 1).show();
      }
    }
  }
  
  public void removeBrowseStock(String paramString)
  {
    int i = 0;
    for (;;)
    {
      if (i < this.mBrowseStockVec.size())
      {
        if (((SelfStock)this.mBrowseStockVec.get(i)).getCode().equals(paramString))
        {
          this.mBrowseStockVec.remove(i);
          this.mSelfstockDB.a(paramString, String.valueOf(1));
        }
      }
      else
      {
        removeSpecialBrowseStock(paramString);
        return;
      }
      i += 1;
    }
  }
  
  public void removeBrowseStockByIndex(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < this.mBrowseStockVec.size()))
    {
      removeBrowseStock(((SelfStock)this.mBrowseStockVec.get(paramInt)).getCode());
      sendSelfStockChangedBroadCast();
    }
  }
  
  public void removeSelfStock(String paramString)
  {
    int i = 0;
    for (;;)
    {
      if (i < this.mSelfStockVec.size())
      {
        if (((SelfStock)this.mSelfStockVec.get(i)).getCode().equals(paramString))
        {
          Object localObject1 = (SelfStock)this.mSelfStockVec.get(i);
          removeSelfStockFromLocal((SelfStock)localObject1);
          Object localObject2 = new Vector();
          ((Vector)localObject2).add(paramString);
          paramString = requestSyncSelfStockToServerByType(1, (Vector)localObject2);
          localObject2 = new ArrayList();
          ((List)localObject2).add(localObject1);
          localObject1 = new SelfSelectedStockManager.ExtraObject();
          ((SelfSelectedStockManager.ExtraObject)localObject1).subprotocol = 105;
          ((SelfSelectedStockManager.ExtraObject)localObject1).action = 1;
          ((SelfSelectedStockManager.ExtraObject)localObject1).obj = localObject2;
          paramString.a(localObject1);
        }
      }
      else {
        return;
      }
      i += 1;
    }
  }
  
  public void removeSelfStockByIndex(int paramInt)
  {
    if ((paramInt >= 0) && (paramInt < this.mSelfStockVec.size()))
    {
      SelfStock localSelfStock = (SelfStock)this.mSelfStockVec.get(paramInt);
      Object localObject = new Vector();
      ((Vector)localObject).add(localSelfStock.getCode());
      localObject = requestSyncSelfStockToServerByType(1, (Vector)localObject);
      ArrayList localArrayList = new ArrayList();
      localArrayList.add(localSelfStock);
      SelfSelectedStockManager.ExtraObject localExtraObject = new SelfSelectedStockManager.ExtraObject();
      localExtraObject.subprotocol = 105;
      localExtraObject.action = 1;
      localExtraObject.obj = localArrayList;
      ((m)localObject).a(localExtraObject);
      removeSelfStockFromLocal(localSelfStock);
    }
  }
  
  public void removeSpecialBrowseStock(String paramString)
  {
    int i = 0;
    for (;;)
    {
      if (i < this.mSpecialBrowseStockVec.size())
      {
        if (((SelfStock)this.mSpecialBrowseStockVec.get(i)).getCode().equals(paramString))
        {
          this.mSpecialBrowseStockVec.remove(i);
          this.mSelfstockDB.a(paramString, String.valueOf(2));
        }
      }
      else {
        return;
      }
      i += 1;
    }
  }
  
  @Deprecated
  public void requestDownloadSelfStock()
  {
    if (this.needSynchro != 1) {
      return;
    }
    Object localObject = new x(3003);
    ((x)localObject).b(2);
    x localx = new x(106);
    if (w.a().l())
    {
      localx.a(w.a().f());
      localx.a("");
      String str = com.android.dazhihui.g.a().v();
      if ((!TextUtils.isEmpty(str)) && (!str.startsWith("0000000000000"))) {
        break label177;
      }
      localx.a(com.android.dazhihui.g.a().u());
    }
    for (;;)
    {
      localx.a(com.android.dazhihui.g.a().v());
      localx.b(com.android.dazhihui.g.a().ac());
      localx.b(1);
      localx.b(1);
      localx.a(this.mSelfStockVersion);
      ((x)localObject).a(localx);
      localObject = new m((x)localObject);
      ((m)localObject).a(n.a);
      ((m)localObject).a(this);
      com.android.dazhihui.a.g.a().a((h)localObject);
      return;
      localx.a("");
      break;
      label177:
      localx.a(com.android.dazhihui.g.a().v());
    }
  }
  
  public m requestSyncSelfStockToServerByType(int paramInt, Vector<String> paramVector)
  {
    x localx1 = new x(3003);
    localx1.b(2);
    x localx2 = new x(105);
    if (this.needSynchro == 1) {
      if (w.a().l())
      {
        localx2.a(w.a().f());
        localx2.a("");
        String str = com.android.dazhihui.g.a().v();
        if ((!TextUtils.isEmpty(str)) && (!str.startsWith("0000000000000"))) {
          break label233;
        }
        localx2.a(com.android.dazhihui.g.a().u());
      }
    }
    for (;;)
    {
      localx2.a(com.android.dazhihui.g.a().v());
      localx2.b(com.android.dazhihui.g.a().ac());
      localx2.a(com.android.dazhihui.g.a().u());
      localx2.a(w.a().k());
      localx2.b(1);
      localx2.b(1);
      localx2.b(1);
      localx2.b(paramInt);
      localx2.b(paramVector);
      localx1.a(localx2);
      paramVector = new m(localx1);
      paramVector.a(n.a);
      paramVector.a(this);
      com.android.dazhihui.a.g.a().a(paramVector);
      return paramVector;
      localx2.a("");
      break;
      localx2.a("");
      break;
      label233:
      localx2.a(com.android.dazhihui.g.a().v());
    }
  }
  
  public void resetServerSelfStock()
  {
    if (getBoolean("FIRST_VIEW", DzhApplication.a().getApplicationContext(), "FIRST_VIEW", true))
    {
      setBoolean("FIRST_VIEW", DzhApplication.a().getApplicationContext(), "FIRST_VIEW", false);
      if (this.mDb.b("FIRST_VIEW", 1) == 1) {
        this.mHandler.sendEmptyMessage(0);
      }
    }
  }
  
  public void saveIndexStockToDB()
  {
    if ((this.mIndexStockVec != null) && (this.mIndexStockVec.size() > 0))
    {
      d.a();
      Iterator localIterator = this.mIndexStockVec.iterator();
      while (localIterator.hasNext())
      {
        SelfStock localSelfStock = (SelfStock)localIterator.next();
        if ((localSelfStock != null) && (localSelfStock.getSelfType() == 3) && (this.mSelfstockDB.b(localSelfStock) == 0)) {
          this.mSelfstockDB.a(localSelfStock);
        }
      }
    }
  }
  
  public void sendSelfStockChangedBroadCast()
  {
    if (this.mContext != null) {
      this.mContext.sendBroadcast(new Intent("com.android.dazhihui.action.SELF_STOCK_CHANGED"));
    }
  }
  
  public void setBrowseStockVector(Vector<SelfStock> paramVector)
  {
    if (paramVector != null)
    {
      int i = 0;
      while (i < this.mBrowseStockVec.size())
      {
        removeSpecialBrowseStock(((SelfStock)this.mBrowseStockVec.get(i)).getCode());
        i += 1;
      }
      this.mBrowseStockVec.clear();
      this.mSelfstockDB.a(String.valueOf(1));
      this.mBrowseStockVec = paramVector;
      i = this.mBrowseStockVec.size() - 1;
      while (i >= 0)
      {
        this.mSelfstockDB.a((SelfStock)this.mBrowseStockVec.get(i));
        i -= 1;
      }
    }
  }
  
  public void setContext(Context paramContext)
  {
    this.mContext = paramContext;
  }
  
  public void setLocalSelfStockVector(Vector<SelfStock> paramVector)
  {
    if (paramVector != null)
    {
      this.mSelfStockVec.clear();
      this.mSelfstockDB.a(String.valueOf(0));
      this.mSelfStockVec = paramVector;
      this.mSelfstockDB.a(paramVector);
      Vector localVector = this.mSelfstockDB.b(String.valueOf(0));
      if ((localVector == null) || (localVector.size() != paramVector.size())) {
        break label68;
      }
    }
    for (;;)
    {
      sendSelfStockChangedBroadCast();
      return;
      label68:
      this.mSelfstockDB.a(String.valueOf(0));
      int i = this.mSelfStockVec.size() - 1;
      while (i >= 0)
      {
        this.mSelfstockDB.a((SelfStock)paramVector.get(i));
        i -= 1;
      }
    }
  }
  
  public void setNeedSynchro(int paramInt)
  {
    this.needSynchro = paramInt;
  }
  
  public void setNeedSynchroType(SelfSelectedStockManager.SynchroType paramSynchroType)
  {
    this.synchroType = paramSynchroType;
  }
  
  public void setSelfStockVersion(long paramLong)
  {
    this.mSelfStockVersion = paramLong;
    setLong("STOCK_VERSION", DzhApplication.a().getApplicationContext(), "STOCK_VERSION", paramLong);
  }
  
  public void setSpecialBrowseStockVector(Vector<SelfStock> paramVector)
  {
    if (paramVector != null)
    {
      this.mSpecialBrowseStockVec.clear();
      this.mSelfstockDB.a(String.valueOf(2));
      this.mSpecialBrowseStockVec = paramVector;
      int i = this.mSpecialBrowseStockVec.size() - 1;
      while (i >= 0)
      {
        this.mSelfstockDB.a((SelfStock)this.mSpecialBrowseStockVec.get(i));
        i -= 1;
      }
    }
  }
  
  public void syncSelfStockByLoginSuccess()
  {
    setNeedSynchroType(SelfSelectedStockManager.SynchroType.LOCAL_MERGE_SERVER);
    Log.i("asdzxc", "自动登录自动开启同步 type=" + getNeedSynchroType());
    syncSelfStockByProtocol_3003_110();
  }
  
  public void syncSelfStockByProtocol_3003_110()
  {
    if (this.needSynchro != 1) {
      return;
    }
    x localx1 = new x(3003);
    m localm = new m(localx1);
    localx1.b(2);
    x localx2 = new x(110);
    if (w.a().l())
    {
      localx2.a(w.a().f());
      String str = com.android.dazhihui.g.a().v();
      if ((!TextUtils.isEmpty(str)) && (!str.startsWith("0000000000000"))) {
        break label214;
      }
      localx2.a(com.android.dazhihui.g.a().u());
      label100:
      localx2.b(com.android.dazhihui.g.a().ac());
      localx2.a(com.android.dazhihui.g.a().u());
      if (this.synchroType != SelfSelectedStockManager.SynchroType.LOCAL_COVER_SERVER) {
        break label227;
      }
      localx2.b(0);
      localx2.b(1);
      localx2.b(1);
      localx2.b(1);
      localx2.b(getSelfStockCodeVector());
      localm.a(SelfSelectedStockManager.SynchroType.LOCAL_COVER_SERVER);
    }
    for (;;)
    {
      localx1.a(localx2);
      localm.a(n.a);
      localm.a(this);
      localm.a(20000L);
      localm.a("开启自选股同步110");
      com.android.dazhihui.a.g.a().a(localm);
      return;
      localx2.a("");
      break;
      label214:
      localx2.a(com.android.dazhihui.g.a().v());
      break label100;
      label227:
      if (this.synchroType == SelfSelectedStockManager.SynchroType.SERVER_COVER_LOCAL)
      {
        localx2.b(1);
        localm.a(SelfSelectedStockManager.SynchroType.SERVER_COVER_LOCAL);
      }
      else if (this.synchroType == SelfSelectedStockManager.SynchroType.LOCAL_MERGE_SERVER)
      {
        localx2.b(2);
        localm.a(SelfSelectedStockManager.SynchroType.LOCAL_MERGE_SERVER);
      }
    }
  }
  
  public void synchronizeSelfStockToDB()
  {
    if ((this.mSelfStockVec.size() > 0) || (this.mBrowseStockVec.size() > 0)) {
      this.mSelfstockDB.a(this.mSelfStockVec, this.mBrowseStockVec);
    }
  }
  
  public void updateBrowseStock(SelfStock paramSelfStock)
  {
    int i;
    if (paramSelfStock != null) {
      i = 0;
    }
    for (;;)
    {
      if (i < this.mBrowseStockVec.size())
      {
        SelfStock localSelfStock = (SelfStock)this.mBrowseStockVec.get(i);
        if (localSelfStock.getCode().equals(paramSelfStock.getCode())) {
          localSelfStock.update(paramSelfStock);
        }
      }
      else
      {
        return;
      }
      i += 1;
    }
  }
  
  public boolean updateBrowseStock(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    int i;
    if (paramString != null) {
      i = 0;
    }
    for (;;)
    {
      bool1 = bool2;
      if (i < this.mBrowseStockVec.size())
      {
        SelfStock localSelfStock = (SelfStock)this.mBrowseStockVec.get(i);
        if (localSelfStock.getCode().equals(paramString))
        {
          localSelfStock.update(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
          bool1 = true;
        }
      }
      else
      {
        return bool1;
      }
      i += 1;
    }
  }
  
  public void updateIndexStock(SelfStock paramSelfStock)
  {
    int k = 0;
    int i;
    if ((paramSelfStock != null) && (this.mIndexStockVec != null) && (!TextUtils.isEmpty(paramSelfStock.getCode()))) {
      i = 0;
    }
    for (;;)
    {
      int j = k;
      if (i < this.mIndexStockVec.size())
      {
        SelfStock localSelfStock = (SelfStock)this.mIndexStockVec.get(i);
        if ((localSelfStock != null) && (paramSelfStock.getCode().equals(localSelfStock.getCode())))
        {
          localSelfStock.update(paramSelfStock);
          j = 1;
        }
      }
      else
      {
        if (j == 0) {
          this.mIndexStockVec.add(paramSelfStock);
        }
        return;
      }
      i += 1;
    }
  }
  
  public void updateSelfStock(SelfStock paramSelfStock)
  {
    int i;
    if (paramSelfStock != null) {
      i = 0;
    }
    for (;;)
    {
      if (i < this.mSelfStockVec.size())
      {
        SelfStock localSelfStock = (SelfStock)this.mSelfStockVec.get(i);
        if (localSelfStock.getCode().equals(paramSelfStock.getCode())) {
          localSelfStock.update(paramSelfStock);
        }
      }
      else
      {
        return;
      }
      i += 1;
    }
  }
  
  public boolean updateSelfStock(String paramString, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    int i;
    if (paramString != null) {
      i = 0;
    }
    for (;;)
    {
      bool1 = bool2;
      if (i < this.mSelfStockVec.size())
      {
        SelfStock localSelfStock = (SelfStock)this.mSelfStockVec.get(i);
        if (localSelfStock.getCode().equals(paramString))
        {
          localSelfStock.update(paramInt1, paramInt2, paramInt3, paramInt4, paramInt5, paramInt6);
          bool1 = true;
        }
      }
      else
      {
        return bool1;
      }
      i += 1;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\stock\SelfSelectedStockManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */