package com.android.dazhihui.ui.a;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.text.TextUtils;
import android.text.format.DateFormat;
import android.util.Log;
import com.android.dazhihui.DzhApplication;
import com.android.dazhihui.a.b.f;
import com.android.dazhihui.a.b.h;
import com.android.dazhihui.a.b.j;
import com.android.dazhihui.a.b.m;
import com.android.dazhihui.a.b.n;
import com.android.dazhihui.a.b.o;
import com.android.dazhihui.a.b.q;
import com.android.dazhihui.a.b.x;
import com.android.dazhihui.ui.model.stock.AdvertVo;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvHeader;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvItem;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvertBitmap;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvertData;
import com.android.dazhihui.ui.model.stock.GroupAdvertVo;
import com.android.dazhihui.ui.model.stock.GroupAdvertVo.Adv;
import com.android.dazhihui.ui.model.stock.GroupAdvertVo.Data;
import com.android.dazhihui.ui.model.stock.GroupAdvertVo.Infos;
import com.android.dazhihui.ui.widget.a.r;
import com.android.dazhihui.ui.widget.adv.ah;
import com.c.a.k;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.json.JSONArray;
import org.json.JSONObject;

public class a
{
  private static a c;
  public int a;
  public HashMap<String, Boolean> b = new HashMap();
  private Context d;
  private AdvertVo e;
  private d f = new d(this);
  private String g;
  private GroupAdvertVo h;
  private c i;
  private List<c> j = new ArrayList();
  
  public static String a(String paramString)
  {
    if (paramString != null) {
      Pattern.compile("\\s*|\t|\r|\n").matcher(paramString).replaceAll("");
    }
    return paramString;
  }
  
  private boolean a(k paramk, String paramString1, String paramString2, long paramLong, boolean paramBoolean)
  {
    boolean bool2 = false;
    Log.i("xyf", "xyf-------->" + paramString2);
    boolean bool1;
    if (TextUtils.isEmpty(paramString2)) {
      bool1 = a(paramString1, paramLong, paramBoolean);
    }
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
                return bool1;
                bool1 = bool2;
              } while (!paramString2.startsWith("["));
              bool1 = bool2;
            } while (!paramString2.endsWith("]"));
            paramString2 = paramString2.substring(paramString2.indexOf("[") + 1, paramString2.lastIndexOf("]"));
            try
            {
              if (new JSONObject(paramString2).optJSONArray("data").length() == 0)
              {
                bool1 = a(paramString1, paramLong, paramBoolean);
                return bool1;
              }
            }
            catch (Exception paramString1)
            {
              paramk = (AdvertVo)paramk.a(paramString2, AdvertVo.class);
              bool1 = bool2;
            }
          } while (paramk == null);
          bool1 = bool2;
        } while (paramk.data == null);
        bool1 = bool2;
      } while (paramk.data.size() == 0);
      paramString1 = (AdvertVo.AdvertData)paramk.data.get(0);
      bool1 = bool2;
    } while (paramString1 == null);
    paramString1.vs = paramk.header.vs;
    paramString1.manageVs = paramLong;
    label227:
    int k;
    if ("1".equals(paramk.header.dsp))
    {
      bool1 = true;
      paramString1.isDSP = bool1;
      if (this.e == null)
      {
        this.e = new AdvertVo();
        this.e.data = new ArrayList();
        this.e.header = new AdvertVo.AdvHeader();
      }
      if (this.e.data == null) {
        this.e.data = new ArrayList();
      }
      k = 0;
      label306:
      if (k >= this.e.data.size()) {
        break label444;
      }
      if (!((AdvertVo.AdvertData)this.e.data.get(k)).pcode.equals(paramString1.pcode)) {
        break label421;
      }
    }
    for (;;)
    {
      if (k != -1)
      {
        if (!paramBoolean)
        {
          bool1 = bool2;
          if (((AdvertVo.AdvertData)this.e.data.get(k)).manageVs >= paramLong) {
            break;
          }
        }
        this.e.data.remove(k);
        this.e.data.add(paramString1);
        return true;
        bool1 = false;
        break label227;
        label421:
        k += 1;
        break label306;
      }
      this.e.data.add(paramString1);
      return true;
      label444:
      k = -1;
    }
  }
  
  private boolean a(String paramString, long paramLong, boolean paramBoolean)
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    int k;
    if (this.e != null)
    {
      bool1 = bool2;
      if (this.e.data != null)
      {
        k = 0;
        if (k >= this.e.data.size()) {
          break label141;
        }
        if (!((AdvertVo.AdvertData)this.e.data.get(k)).pcode.equals(paramString)) {
          break label132;
        }
      }
    }
    for (;;)
    {
      bool1 = bool2;
      if (k != -1) {
        if (!paramBoolean)
        {
          bool1 = bool2;
          if (((AdvertVo.AdvertData)this.e.data.get(k)).manageVs >= paramLong) {}
        }
        else
        {
          this.e.data.remove(k);
          bool1 = true;
        }
      }
      return bool1;
      label132:
      k += 1;
      break;
      label141:
      k = -1;
    }
  }
  
  public static boolean b(GroupAdvertVo paramGroupAdvertVo)
  {
    if ((paramGroupAdvertVo == null) || (paramGroupAdvertVo.data == null) || ((paramGroupAdvertVo.data.infos == null) && (paramGroupAdvertVo.data.adv == null))) {}
    while ((paramGroupAdvertVo.data.infos != null) && ((paramGroupAdvertVo.data.infos.tradings == null) || (paramGroupAdvertVo.data.infos.tradings.size() == 0)) && (paramGroupAdvertVo.data.adv != null) && ((paramGroupAdvertVo.data.adv.advList == null) || (paramGroupAdvertVo.data.adv.advList.size() == 0))) {
      return true;
    }
    return false;
  }
  
  public static a c()
  {
    if (c == null) {
      c = new a();
    }
    return c;
  }
  
  public AdvertVo.AdvertBitmap a(int paramInt, boolean paramBoolean)
  {
    Object localObject1 = b();
    AdvertVo.AdvertData localAdvertData;
    AdvertVo.AdvItem localAdvItem;
    String str1;
    Object localObject2;
    if (localObject1 != null)
    {
      localAdvertData = ((AdvertVo)localObject1).getAdvert(paramInt);
      if ((localAdvertData != null) && (localAdvertData.advList != null) && (localAdvertData.advList.size() != 0))
      {
        localAdvItem = (AdvertVo.AdvItem)localAdvertData.advList.get(0);
        str1 = localAdvItem.getMatchImg()[0];
        if ((paramInt == 109) && (paramBoolean))
        {
          localObject1 = localAdvertData.advList.iterator();
          while (((Iterator)localObject1).hasNext())
          {
            localObject2 = (AdvertVo.AdvItem)((Iterator)localObject1).next();
            if (((AdvertVo.AdvItem)localObject2).getMatchImg() != null)
            {
              localObject2 = localObject2.getMatchImg()[0];
              r.a(this.d).a((String)localObject2, null);
            }
          }
        }
        localObject2 = r.a(this.d).a(str1);
        if (paramInt != 109) {}
      }
    }
    try
    {
      String str2 = DateFormat.format("yyyy-MM-dd", System.currentTimeMillis()).toString();
      if (localObject2 != null) {
        break label240;
      }
      localObject1 = "不存在图片";
      DzhApplication.a().b().a(str2, "PushAd", "存在109广告-->" + (String)localObject1, 7);
    }
    catch (Exception localException)
    {
      label240:
      for (;;) {}
    }
    if ((localObject2 == null) && (paramBoolean)) {
      r.a(this.d).a(str1, null);
    }
    while (localObject2 == null)
    {
      return null;
      localObject1 = "存在图片";
      break;
    }
    localObject1 = new AdvertVo.AdvertBitmap();
    ((AdvertVo.AdvertBitmap)localObject1).bytes = ((byte[])localObject2);
    ((AdvertVo.AdvertBitmap)localObject1).advData = localAdvertData;
    ((AdvertVo.AdvertBitmap)localObject1).advItem = localAdvItem;
    return (AdvertVo.AdvertBitmap)localObject1;
  }
  
  public GroupAdvertVo a()
  {
    return this.h;
  }
  
  public void a(Context paramContext)
  {
    this.d = paramContext;
    b(this.d, null);
    c(this.d, null);
    this.f.sendEmptyMessageDelayed(0, 15000L);
  }
  
  public void a(Context paramContext, Map<String, com.android.dazhihui.service.p> paramMap, boolean paramBoolean)
  {
    int n = 0;
    if (paramMap == null) {}
    for (;;)
    {
      return;
      k localk = new k();
      Iterator localIterator = paramMap.keySet().iterator();
      int m = 1;
      int k = 0;
      for (;;)
      {
        if (localIterator.hasNext())
        {
          String str1 = (String)localIterator.next();
          String str2 = ((com.android.dazhihui.service.p)paramMap.get(str1)).b();
          try
          {
            bool = a(localk, str1, str2, Long.parseLong(((com.android.dazhihui.service.p)paramMap.get(str1)).a()), paramBoolean);
            if (bool) {
              k = 1;
            }
          }
          catch (Exception localException)
          {
            for (;;)
            {
              boolean bool = false;
              continue;
              m = 0;
            }
          }
        }
      }
      if ((m == 0) || (k != 0))
      {
        paramMap = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date());
        this.e.updataTime = paramMap;
        paramContext.getSharedPreferences("AdvertJson", 0).edit().putString("AdvertJson", localk.a(this.e)).commit();
        a(109, true);
        a(499, true);
        k = n;
        while (k < this.j.size())
        {
          ((c)this.j.get(k)).a();
          k += 1;
        }
      }
    }
  }
  
  public void a(j paramj)
  {
    paramj = (o)paramj;
    int k;
    int m;
    if ((paramj.h() != null) && (paramj.h().b != null))
    {
      paramj = new q(paramj.h().b);
      k = paramj.e();
      m = paramj.h();
      paramj = paramj.l();
      if ((k & 0x1) != 1) {
        break label61;
      }
    }
    for (;;)
    {
      return;
      label61:
      if ((k & 0x2) == 2)
      {
        f localf = new f();
        localf.c(paramj);
        localf.a(new b(this, m));
        com.android.dazhihui.a.g.a().a(localf);
        return;
      }
      if ((k & 0x4) != 4) {
        continue;
      }
      this.d.getSharedPreferences("AdvertCrc", 0).edit().putInt("AdvertCrc", m).commit();
      this.a = m;
      try
      {
        bool = c(this.d, paramj);
        if ((!bool) || (this.i == null)) {
          continue;
        }
        this.i.a();
        return;
      }
      catch (Exception paramj)
      {
        for (;;)
        {
          paramj.getMessage();
          boolean bool = false;
        }
      }
    }
  }
  
  public void a(c paramc)
  {
    this.i = paramc;
  }
  
  public void a(AdvertVo paramAdvertVo)
  {
    this.e = paramAdvertVo;
  }
  
  public void a(GroupAdvertVo paramGroupAdvertVo)
  {
    this.h = paramGroupAdvertVo;
  }
  
  public boolean a(Context paramContext, String paramString)
  {
    boolean bool2 = false;
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("AdvertJson", 0);
    paramContext = c().b();
    k localk = new k();
    boolean bool1 = bool2;
    if (paramContext == null)
    {
      paramContext = localSharedPreferences.getString("AdvertJson", "");
      bool1 = bool2;
      if (!paramContext.isEmpty())
      {
        paramContext = (AdvertVo)localk.a(paramContext, AdvertVo.class);
        c().a(paramContext);
        bool1 = true;
      }
    }
    Object localObject = null;
    paramContext = (Context)localObject;
    if (paramString != null)
    {
      paramContext = (Context)localObject;
      if (!paramString.isEmpty())
      {
        paramContext = a(paramString);
        paramContext = (AdvertVo)localk.a(paramContext.substring(paramContext.indexOf("{"), paramContext.lastIndexOf("}") + 1), AdvertVo.class);
      }
    }
    if (paramContext != null)
    {
      paramString = c().b();
      if ((paramString == null) || (!paramString.header.vs.equals(paramContext.header.vs)))
      {
        paramContext.updataTime = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault()).format(new Date());
        paramContext.jsonUrl = this.g;
        c().a(paramContext);
        localSharedPreferences.edit().putString("AdvertJson", localk.a(paramContext)).commit();
        return true;
      }
    }
    return bool1;
  }
  
  public AdvertVo b()
  {
    return this.e;
  }
  
  public void b(Context paramContext, String paramString)
  {
    int k = 0;
    Object localObject = paramContext.getSharedPreferences("RedRecord", 0);
    if (paramString != null)
    {
      paramContext = a(paramString);
      paramString = paramContext.substring(paramContext.indexOf("{"), paramContext.lastIndexOf("}") + 1);
      paramContext = paramString;
      if (paramString != null)
      {
        paramContext = paramString;
        if (!paramString.isEmpty())
        {
          ((SharedPreferences)localObject).edit().putString("RedJson", paramString).commit();
          paramContext = paramString;
        }
      }
      if ((paramContext != null) && (!paramContext.isEmpty())) {
        break label107;
      }
    }
    for (;;)
    {
      return;
      paramContext = ((SharedPreferences)localObject).getString("RedJson", "");
      break;
      try
      {
        label107:
        paramContext = new JSONObject(paramContext).optJSONArray("data");
        while (k < paramContext.length())
        {
          localObject = paramContext.getJSONObject(k);
          paramString = ((JSONObject)localObject).optString("countid", "");
          localObject = ((JSONObject)localObject).optString("vs", "0");
          ah.a().a(Integer.parseInt(paramString), (String)localObject);
          k += 1;
        }
        return;
      }
      catch (Exception paramContext)
      {
        paramContext.printStackTrace();
      }
    }
  }
  
  public void b(c paramc)
  {
    if ((paramc != null) && (!this.j.contains(paramc))) {
      this.j.add(paramc);
    }
  }
  
  public void c(c paramc)
  {
    this.j.remove(paramc);
  }
  
  public boolean c(Context paramContext, String paramString)
  {
    SharedPreferences localSharedPreferences = paramContext.getSharedPreferences("GroupAdvertJson", 0);
    paramContext = c().a();
    k localk = new k();
    if (paramContext == null)
    {
      paramContext = localSharedPreferences.getString("GroupAdvertJson", "");
      if (!paramContext.isEmpty())
      {
        paramContext = (GroupAdvertVo)localk.a(paramContext, GroupAdvertVo.class);
        c().a(paramContext);
      }
    }
    for (boolean bool = true;; bool = false)
    {
      if ((paramString != null) && (!paramString.isEmpty())) {
        paramContext = a(paramString);
      }
      for (paramContext = (GroupAdvertVo)localk.a(paramContext.substring(paramContext.indexOf("{"), paramContext.lastIndexOf("}") + 1), GroupAdvertVo.class);; paramContext = null)
      {
        if ((paramContext != null) && (paramContext.data != null) && (paramContext.header != null))
        {
          paramString = c().a();
          if ((paramString == null) || ((paramString.data == null) && (paramString.header == null)))
          {
            c().a(paramContext);
            localSharedPreferences.edit().putString("GroupAdvertJson", localk.a(paramContext)).commit();
            return true;
          }
          if (paramContext.data.adv == null) {
            paramContext.data.adv = paramString.data.adv;
          }
          if (paramContext.data.infos == null) {
            paramContext.data.infos = paramString.data.infos;
          }
          if ((paramContext.data.infos != null) && (paramContext.data.infos.tradings != null))
          {
            List localList = paramContext.data.infos.tradings;
            if ((paramString.data != null) && (paramString.data.infos != null) && (paramString.data.infos.tradings != null)) {
              localList.addAll(0, paramString.data.infos.tradings);
            }
            int k = localList.size() - 18;
            if (k > 0)
            {
              k -= 1;
              while (k >= 0)
              {
                localList.remove(k);
                k -= 1;
              }
            }
          }
          c().a(paramContext);
          localSharedPreferences.edit().putString("GroupAdvertJson", localk.a(paramContext)).commit();
          bool = true;
        }
        for (;;)
        {
          return bool;
        }
      }
    }
  }
  
  public void d()
  {
    this.f.sendEmptyMessageDelayed(0, 15000L);
  }
  
  public void e()
  {
    this.b.clear();
    r.a(this.d).a();
  }
  
  public void f()
  {
    x localx = new x(2988);
    localx.c(1);
    localx.c(7);
    localx.c(1);
    String str2 = com.android.dazhihui.g.a().r();
    int k;
    String str1;
    Object localObject;
    if ((!TextUtils.isEmpty(str2)) && (str2.contains(".")))
    {
      k = str2.indexOf(".");
      str1 = str2.substring(0, k);
      if (!TextUtils.isEmpty(str1)) {
        if (str1.length() > 2)
        {
          localObject = str1.substring(str1.length() - 2, str1.length());
          str2 = str2.substring(k, str2.length());
          if (TextUtils.isEmpty(str2)) {
            break label316;
          }
          if (str2.length() <= 2) {
            break label282;
          }
          str1 = str2.substring(str2.length() - 2, str2.length());
          label143:
          localObject = (String)localObject + str1;
        }
      }
    }
    for (;;)
    {
      try
      {
        k = Integer.parseInt((String)localObject);
        localx.c(k);
        if (this.a == 0) {
          this.a = this.d.getSharedPreferences("AdvertCrc", 0).getInt("AdvertCrc", 0);
        }
        localx.d(this.a);
        localObject = new m(localx, n.a);
        ((m)localObject).d(false);
        com.android.dazhihui.a.g.a().a((h)localObject);
        return;
        localObject = str1;
        if (str1.length() != 1) {
          break;
        }
        localObject = "0" + str1;
        break;
        localObject = "00";
        break;
        label282:
        str1 = str2;
        if (str2.length() != 1) {
          break label143;
        }
        str1 = str2 + "0";
        break label143;
        label316:
        str1 = "00";
      }
      catch (Exception localException)
      {
        k = 0;
        continue;
      }
      k = 0;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */