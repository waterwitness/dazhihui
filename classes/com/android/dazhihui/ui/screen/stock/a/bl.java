package com.android.dazhihui.ui.screen.stock.a;

import android.content.BroadcastReceiver;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.Paint.Align;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.a.b.p;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.g;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager;
import com.android.dazhihui.ui.model.stock.Stock2955Vo;
import com.android.dazhihui.ui.screen.y;
import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.mh;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class bl
  extends l
{
  private int R = -1;
  private TableLayoutGroup S;
  private List<mh> T = new LinkedList();
  private SelfSelectedStockManager U = SelfSelectedStockManager.getInstance();
  private View V;
  private com.android.dazhihui.a.b.m W;
  private BroadcastReceiver X = new bm(this);
  public int a = 107;
  private int b = 33273;
  private String[] c = null;
  private boolean[] d;
  private byte e;
  
  private mh a(String paramString)
  {
    Object localObject2 = this.T.iterator();
    Object localObject1;
    do
    {
      if (!((Iterator)localObject2).hasNext()) {
        break;
      }
      localObject1 = (mh)((Iterator)localObject2).next();
    } while (!paramString.equals(localObject1.k[0]));
    for (;;)
    {
      localObject2 = localObject1;
      if (localObject1 == null)
      {
        localObject2 = new mh();
        ((mh)localObject2).k = new Object[] { paramString };
        paramString = new String[this.c.length];
        localObject1 = new int[this.c.length];
        ((mh)localObject2).a = paramString;
        ((mh)localObject2).b = ((int[])localObject1);
        this.T.add(localObject2);
      }
      Arrays.fill(((mh)localObject2).a, "--");
      Arrays.fill(((mh)localObject2).b, -1);
      return (mh)localObject2;
      localObject1 = null;
    }
  }
  
  private void a(mh parammh)
  {
    if ((this.R < 0) || (this.R >= this.d.length) || (this.d[this.R] == 0)) {}
    for (;;)
    {
      return;
      int j = this.T.indexOf(parammh);
      int i = 0;
      String str1;
      double d1;
      double d2;
      label357:
      label388:
      while (i < j)
      {
        String str2 = ((mh)this.T.get(i)).a[this.R];
        str1 = parammh.a[this.R];
        for (;;)
        {
          try
          {
            if (str2.endsWith("万"))
            {
              d1 = Double.parseDouble(str2.substring(0, str2.length() - 1));
              d1 *= 10000.0D;
              d2 = d1;
            }
          }
          catch (NumberFormatException localNumberFormatException2)
          {
            d2 = 0.0D;
            continue;
            if (str1.endsWith("亿"))
            {
              d1 = Double.parseDouble(str1.substring(0, str1.length() - 1)) * 1.0E8D;
              continue;
            }
            if (str1.endsWith("%"))
            {
              d1 = Double.parseDouble(str1.substring(0, str1.length() - 1));
              continue;
            }
            d1 = Double.parseDouble(str1);
            continue;
          }
          try
          {
            if (!str1.endsWith("万")) {
              continue;
            }
            d1 = Double.parseDouble(str1.substring(0, str1.length() - 1));
            d1 *= 10000.0D;
          }
          catch (NumberFormatException localNumberFormatException1)
          {
            d1 = 0.0D;
            continue;
            if (d2 <= d1) {
              break label388;
            }
            this.T.remove(parammh);
            this.T.add(i, parammh);
            return;
            i += 1;
          }
          if (this.e != 0) {
            break label357;
          }
          if (d2 >= d1) {
            break label388;
          }
          this.T.remove(parammh);
          this.T.add(i, parammh);
          return;
          if (str2.endsWith("亿")) {
            d1 = Double.parseDouble(str2.substring(0, str2.length() - 1)) * 1.0E8D;
          } else if (str2.endsWith("%")) {
            d1 = Double.parseDouble(str2.substring(0, str2.length() - 1));
          } else {
            d1 = Double.parseDouble(str2);
          }
        }
      }
    }
  }
  
  private void f()
  {
    boolean bool = false;
    if (this.S == null) {
      return;
    }
    TableLayoutGroup localTableLayoutGroup;
    int i;
    if (this.a == 101)
    {
      com.android.dazhihui.d.n.a("", 1001);
      this.b = 33273;
      this.R = -1;
      this.d = new boolean[] { 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 1, 1, 1, 1, 1 };
      this.c = getResources().getStringArray(2131361799);
      this.T.clear();
      this.S.b();
      this.S.setHeaderColumn(this.c);
      this.S.setColumnClickable(this.d);
      this.e = 0;
      localTableLayoutGroup = this.S;
      i = this.R;
      if (this.e != 0) {
        break label416;
      }
    }
    for (;;)
    {
      localTableLayoutGroup.a(i, bool);
      return;
      if (this.a == 106)
      {
        com.android.dazhihui.d.n.a("", 1126);
        this.b = 34944;
        this.R = -1;
        this.c = getResources().getStringArray(2131361837);
        this.d = new boolean[] { 0, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
        break;
      }
      if (this.a != 107) {
        break;
      }
      com.android.dazhihui.d.n.a("", 1125);
      this.b = 38032;
      this.R = -1;
      this.c = getResources().getStringArray(2131361923);
      this.d = new boolean[] { 0, 1, 1, 1, 1, 1, 1, 1 };
      break;
      label416:
      bool = true;
    }
  }
  
  private void g()
  {
    if ((this.R < 0) || (this.R >= this.d.length) || (this.d[this.R] == 0)) {
      return;
    }
    int i = 0;
    while (i < this.T.size() - 1)
    {
      int j = i + 1;
      Object localObject;
      double d1;
      double d2;
      if (j < this.T.size())
      {
        String str = ((mh)this.T.get(i)).a[this.R];
        localObject = ((mh)this.T.get(j)).a[this.R];
        for (;;)
        {
          try
          {
            if (str.endsWith("万"))
            {
              d1 = Double.parseDouble(str.substring(0, str.length() - 1));
              d1 *= 10000.0D;
              d2 = d1;
            }
          }
          catch (NumberFormatException localNumberFormatException2)
          {
            d2 = 0.0D;
            continue;
            if (((String)localObject).endsWith("亿"))
            {
              d1 = Double.parseDouble(((String)localObject).substring(0, ((String)localObject).length() - 1)) * 1.0E8D;
              continue;
            }
            if (((String)localObject).endsWith("%"))
            {
              d1 = Double.parseDouble(((String)localObject).substring(0, ((String)localObject).length() - 1));
              continue;
            }
            d1 = Double.parseDouble((String)localObject);
            continue;
          }
          try
          {
            if (!((String)localObject).endsWith("万")) {
              continue;
            }
            d1 = Double.parseDouble(((String)localObject).substring(0, ((String)localObject).length() - 1));
            d1 *= 10000.0D;
          }
          catch (NumberFormatException localNumberFormatException1)
          {
            d1 = 0.0D;
            continue;
            if (d2 <= d1) {
              continue;
            }
            mh localmh = (mh)this.T.get(i);
            this.T.set(i, this.T.get(j));
            this.T.set(j, localmh);
            continue;
          }
          if (this.e != 0) {
            break label422;
          }
          if (d2 < d1)
          {
            localObject = (mh)this.T.get(i);
            this.T.set(i, this.T.get(j));
            this.T.set(j, localObject);
          }
          j += 1;
          break;
          if (str.endsWith("亿")) {
            d1 = Double.parseDouble(str.substring(0, str.length() - 1)) * 1.0E8D;
          } else if (str.endsWith("%")) {
            d1 = Double.parseDouble(str.substring(0, str.length() - 1));
          } else {
            d1 = Double.parseDouble(str);
          }
        }
      }
      label422:
      i += 1;
    }
    this.S.a(this.T, 0);
  }
  
  public void a()
  {
    if ((this.S == null) || (this.U.getSelfStockVectorSize() <= 0)) {}
    int j;
    int k;
    do
    {
      return;
      j = com.android.dazhihui.ui.a.m.a().u();
      i = j;
      if (j == 0) {
        i = 5;
      }
      setAutoRequestPeriod(i * 1000);
      k = this.U.getSelfStockVectorSize();
    } while (k <= 0);
    ArrayList localArrayList = new ArrayList();
    int i = 0;
    do
    {
      x localx = new x(2955);
      localx.c(107);
      localx.c(this.b);
      localx.a(this.U.getSelfStockCodeVector(i, i + 50 - 1));
      localx.c("自选-资金-列表-index=" + i + " mode=" + this.a);
      localArrayList.add(localx);
      j = i + 50;
      i = j;
    } while (j < k);
    this.W = new com.android.dazhihui.a.b.m();
    this.W.a(com.android.dazhihui.a.b.n.a);
    registRequestListener(this.W);
    this.W.a(localArrayList);
    setAutoRequest(this.W);
    sendRequest(this.W);
  }
  
  public void changeLookFace(y paramy)
  {
    super.changeLookFace(paramy);
    if (paramy != null) {
      switch (bq.a[paramy.ordinal()])
      {
      }
    }
    do
    {
      do
      {
        return;
      } while (this.S == null);
      this.S.setBackgroundColor(getResources().getColor(2131493542));
      this.S.a(paramy);
      return;
    } while (this.S == null);
    this.S.setBackgroundColor(getResources().getColor(2131493605));
    this.S.a(paramy);
  }
  
  public void handleResponse(h paramh, j paramj)
  {
    paramh = (o)paramj;
    if (paramh == null) {
      return;
    }
    for (;;)
    {
      try
      {
        paramh = paramh.h();
        if (paramh == null) {
          break;
        }
        if (paramh.a == 2955)
        {
          paramh = new q(paramh.b);
          int j = paramh.e();
          int k = paramh.e();
          if (j != 107) {
            break;
          }
          paramh.e();
          int m = paramh.e();
          paramj = new Stock2955Vo();
          if (((k == 33273) && (this.a == 101)) || ((k == 34944) && (this.a == 106))) {
            break label305;
          }
          if ((k == 38032) && (this.a == 107))
          {
            break label305;
            if (i < m)
            {
              paramj.decode(paramh, j, k);
              mh localmh = a(paramj.code);
              String[] arrayOfString = localmh.a;
              int[] arrayOfInt = localmh.b;
              paramj.getData(this.c, arrayOfString, arrayOfInt, 0);
              localmh.a = arrayOfString;
              localmh.b = arrayOfInt;
              localmh.d = com.android.dazhihui.d.n.e(paramj.code);
              localmh.g = paramj.type;
              if (paramj.ggsm <= 0) {
                break label311;
              }
              bool = true;
              localmh.i = bool;
              if (j == 10) {
                localmh.j = true;
              }
              localmh.h = paramj.isLoanable;
              localmh.k = new Object[] { paramj.code };
              a(localmh);
              i += 1;
              continue;
            }
          }
        }
        if (this.U.getSelfStockVectorSize() <= 0) {
          break;
        }
        this.S.a(this.T, 0);
        return;
      }
      catch (Exception paramh)
      {
        paramh.printStackTrace();
        return;
      }
      label305:
      int i = 0;
      continue;
      label311:
      boolean bool = false;
    }
  }
  
  public void handleTimeout(h paramh)
  {
    super.handleTimeout(paramh);
    if (g.a().L()) {
      showShortToast(2131166193);
    }
  }
  
  public void netException(h paramh, Exception paramException)
  {
    super.netException(paramh, paramException);
    showShortToast(2131166192);
  }
  
  public View onCreateView(LayoutInflater paramLayoutInflater, ViewGroup paramViewGroup, Bundle paramBundle)
  {
    this.V = paramLayoutInflater.inflate(2130903408, null);
    this.S = ((TableLayoutGroup)this.V.findViewById(2131559838));
    this.S.setContinuousLoading(true);
    this.S.setColumnAlign(Paint.Align.CENTER);
    this.S.setFirstColumnHeadAlign(Paint.Align.CENTER);
    this.S.setOnLoadingListener(new bn(this));
    this.S.setOnContentScrollChangeListener(new bo(this));
    this.S.setOnTableLayoutClickListener(new bp(this));
    paramLayoutInflater = getActivity().getIntent();
    if (paramLayoutInflater != null) {
      this.a = paramLayoutInflater.getIntExtra("mode", 107);
    }
    f();
    getActivity().registerReceiver(this.X, new IntentFilter("com.android.dazhihui.action.SELF_STOCK_CHANGED"));
    changeLookFace(this.mLookFace);
    return this.V;
  }
  
  public void onDestroy()
  {
    getActivity().unregisterReceiver(this.X);
    super.onDestroy();
  }
  
  public void onHiddenChanged(boolean paramBoolean)
  {
    super.onHiddenChanged(paramBoolean);
  }
  
  public void onResume()
  {
    super.onResume();
  }
  
  public void refresh()
  {
    f();
    a();
  }
  
  public void setUserVisibleHint(boolean paramBoolean)
  {
    super.setUserVisibleHint(paramBoolean);
  }
  
  public void show()
  {
    refresh();
    super.show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\a\bl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */