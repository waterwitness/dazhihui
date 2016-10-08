package com.alipay.c.a;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import com.alipay.c.d.e;
import com.alipay.c.f.g;
import com.alipay.c.f.h;
import com.alipay.c.f.i;
import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Map;

public final class a
{
  private Context a;
  private com.alipay.c.b.a b = com.alipay.c.b.a.a();
  private int c = 4;
  
  public a(Context paramContext)
  {
    this.a = paramContext;
  }
  
  public static String a(Context paramContext)
  {
    String str2 = b(paramContext);
    String str1 = str2;
    if (com.alipay.d.a.a.a.a.a(str2)) {
      str1 = h.c(paramContext);
    }
    return str1;
  }
  
  public static String a(Context paramContext, String paramString)
  {
    try
    {
      String str = i.a(paramString);
      if (!com.alipay.d.a.a.a.a.a(str)) {
        return str;
      }
      paramContext = g.a(paramContext, paramString);
      i.a(paramString, paramContext);
      boolean bool = com.alipay.d.a.a.a.a.a(paramContext);
      if (!bool) {
        return paramContext;
      }
    }
    catch (Throwable paramContext)
    {
      for (;;) {}
    }
    return "";
    return paramContext;
  }
  
  private static boolean a()
  {
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    int j = (int)(Math.random() * 24.0D * 60.0D * 60.0D);
    int i = 0;
    while (i < 2) {
      try
      {
        Object localObject = new String[] { "2016-11-10 2016-11-11", "2016-12-11 2016-12-12" }[i].split(" ");
        if ((localObject != null) && (localObject.length == 2))
        {
          Date localDate1 = new Date();
          Date localDate2 = localSimpleDateFormat.parse(localObject[0] + " 00:00:00");
          localObject = localSimpleDateFormat.parse(localObject[1] + " 23:59:59");
          Calendar localCalendar = Calendar.getInstance();
          localCalendar.setTime((Date)localObject);
          localCalendar.add(13, j * 1);
          localObject = localCalendar.getTime();
          if (localDate1.after(localDate2))
          {
            boolean bool = localDate1.before((Date)localObject);
            if (bool) {
              return true;
            }
          }
        }
        i += 1;
      }
      catch (Exception localException) {}
    }
    return false;
  }
  
  private com.alipay.d.a.a.c.a.b b(Map<String, String> paramMap)
  {
    try
    {
      Context localContext = this.a;
      com.alipay.d.a.a.c.a.c localc = new com.alipay.d.a.a.c.a.c();
      Object localObject2 = "";
      Object localObject5 = "";
      Object localObject1 = "";
      String str1 = com.alipay.c.e.a.a();
      String str2 = com.alipay.d.a.a.a.a.a(paramMap, "rpcVersion", "");
      String str3 = a(localContext, com.alipay.d.a.a.a.a.a(paramMap, "appName", ""));
      Object localObject3 = com.alipay.c.f.d.c(localContext);
      com.alipay.c.f.c localc1 = com.alipay.c.f.d.b();
      if (localObject3 != null)
      {
        localObject2 = ((com.alipay.c.f.c)localObject3).a();
        localObject1 = ((com.alipay.c.f.c)localObject3).c();
      }
      Object localObject4 = localObject1;
      localObject3 = localObject2;
      if (com.alipay.d.a.a.a.a.a((String)localObject2))
      {
        com.alipay.c.f.b localb = com.alipay.c.f.a.c(localContext);
        localObject4 = localObject1;
        localObject3 = localObject2;
        if (localb != null)
        {
          localObject3 = localb.a();
          localObject4 = localb.c();
        }
      }
      localObject1 = localObject5;
      if (localc1 != null) {
        localObject1 = localc1.a();
      }
      localObject2 = localObject1;
      if (com.alipay.d.a.a.a.a.a((String)localObject1))
      {
        localObject5 = com.alipay.c.f.a.b();
        localObject2 = localObject1;
        if (localObject5 != null) {
          localObject2 = ((com.alipay.c.f.b)localObject5).a();
        }
      }
      localc.a("android");
      localc.c((String)localObject3);
      localc.b((String)localObject2);
      localc.d(str3);
      localc.e(str1);
      localc.g((String)localObject4);
      localc.f(str2);
      localc.a(e.a(localContext, paramMap));
      paramMap = com.alipay.d.a.a.c.d.a(this.a, this.b.c()).a(localc);
      return paramMap;
    }
    catch (Throwable paramMap)
    {
      com.alipay.c.c.a.a(paramMap);
    }
    return null;
  }
  
  private static String b(Context paramContext)
  {
    Object localObject;
    try
    {
      localObject = i.b();
      if (!com.alipay.d.a.a.a.a.a((String)localObject)) {
        return (String)localObject;
      }
      localObject = com.alipay.c.f.d.b(paramContext);
      if (localObject != null)
      {
        i.a((com.alipay.c.f.c)localObject);
        String str = ((com.alipay.c.f.c)localObject).a();
        localObject = str;
        if (com.alipay.d.a.a.a.a.b(str)) {
          return localObject;
        }
      }
      paramContext = com.alipay.c.f.a.b(paramContext);
      if (paramContext != null)
      {
        i.a(paramContext);
        localObject = paramContext.a();
        boolean bool = com.alipay.d.a.a.a.a.b((String)localObject);
        if (bool) {
          return localObject;
        }
      }
    }
    catch (Throwable paramContext)
    {
      for (;;) {}
    }
    return "";
    return (String)localObject;
  }
  
  public final int a(Map<String, String> paramMap)
  {
    int k = 2;
    int j = 1;
    for (;;)
    {
      int i;
      try
      {
        com.alipay.c.c.a.a(this.a, com.alipay.d.a.a.a.a.a(paramMap, "tid", ""), com.alipay.d.a.a.a.a.a(paramMap, "utdid", ""), a(this.a));
        localObject2 = com.alipay.d.a.a.a.a.a(paramMap, "appName", "");
        b(this.a);
        a(this.a, (String)localObject2);
        i.a();
        if (!a()) {
          continue;
        }
        if (!com.alipay.d.a.a.a.a.a(a(this.a, (String)localObject2))) {
          continue;
        }
        i = 1;
        break label805;
      }
      catch (Exception paramMap)
      {
        Object localObject2;
        Object localObject1;
        Object localObject3;
        Context localContext;
        paramMap = paramMap;
        com.alipay.c.c.a.a(paramMap);
        continue;
      }
      finally {}
      this.c = i;
      localObject1 = com.alipay.d.a.a.c.d.a(this.a, this.b.c());
      localObject2 = this.a;
      paramMap = (ConnectivityManager)((Context)localObject2).getSystemService("connectivity");
      if (paramMap != null)
      {
        paramMap = paramMap.getActiveNetworkInfo();
        if ((paramMap != null) && (paramMap.isConnected()) && (paramMap.getType() == 1))
        {
          i = j;
          if ((i != 0) && (h.b((Context)localObject2))) {
            new com.alipay.d.a.a.e.b(((Context)localObject2).getFilesDir().getAbsolutePath() + "/log/ap", (com.alipay.d.a.a.c.b.a)localObject1).a();
          }
          return this.c;
          if (!com.alipay.d.a.a.a.a.a(b(this.a))) {
            break label816;
          }
          i = 1;
          break label805;
          e.a();
          if (com.alipay.d.a.a.a.a.a(e.b(this.a, paramMap), i.c())) {
            break label833;
          }
          i = 1;
          break label822;
          label258:
          localObject1 = com.alipay.d.a.a.a.a.a(paramMap, "tid", "");
          localObject3 = com.alipay.d.a.a.a.a.a(paramMap, "utdid", "");
          if ((com.alipay.d.a.a.a.a.b((String)localObject1)) && (!com.alipay.d.a.a.a.a.a((String)localObject1, i.d())))
          {
            i = 1;
          }
          else if ((com.alipay.d.a.a.a.a.b((String)localObject3)) && (!com.alipay.d.a.a.a.a.a((String)localObject3, i.e())))
          {
            i = 1;
          }
          else if (!i.a(this.a, (String)localObject2))
          {
            i = 1;
          }
          else if (com.alipay.d.a.a.a.a.a(a(this.a, (String)localObject2)))
          {
            i = 1;
          }
          else
          {
            if (!com.alipay.d.a.a.a.a.a(b(this.a))) {
              break label839;
            }
            i = 1;
            break label805;
            localObject1 = this.a;
            com.alipay.c.b.a.a().b();
            com.alipay.c.e.a.b();
            localObject3 = b(paramMap);
            i = k;
            if (localObject3 == null) {
              break label845;
            }
            if (((com.alipay.d.a.a.c.a.b)localObject3).a)
            {
              i = k;
              if (com.alipay.d.a.a.a.a.a(((com.alipay.d.a.a.c.a.b)localObject3).c)) {
                break label845;
              }
              i = 1;
              break label845;
              if (localObject3 != null)
              {
                com.alipay.c.c.a.a("Server error, result:" + ((com.alipay.d.a.a.c.a.a)localObject3).b);
                if (!com.alipay.d.a.a.a.a.a(a(this.a, (String)localObject2))) {
                  break label875;
                }
                i = 4;
              }
            }
            else
            {
              i = k;
              if (!"APPKEY_ERROR".equals(((com.alipay.d.a.a.c.a.b)localObject3).b)) {
                break label845;
              }
              i = 3;
              break label845;
              h.a(this.a, "1".equals(((com.alipay.d.a.a.c.a.b)localObject3).h));
              localContext = this.a;
              if (((com.alipay.d.a.a.c.a.b)localObject3).j == null)
              {
                localObject1 = "0";
                h.b(localContext, (String)localObject1);
                i.c(e.b(this.a, paramMap));
                i.a((String)localObject2, ((com.alipay.d.a.a.c.a.b)localObject3).d);
                i.b(((com.alipay.d.a.a.c.a.b)localObject3).c);
                i.d(((com.alipay.d.a.a.c.a.b)localObject3).e);
                localObject1 = com.alipay.d.a.a.a.a.a(paramMap, "tid", "");
                if ((com.alipay.d.a.a.a.a.b((String)localObject1)) && (!com.alipay.d.a.a.a.a.a((String)localObject1, i.d())))
                {
                  i.e((String)localObject1);
                  i.e((String)localObject1);
                  paramMap = com.alipay.d.a.a.a.a.a(paramMap, "utdid", "");
                  if ((!com.alipay.d.a.a.a.a.b(paramMap)) || (com.alipay.d.a.a.a.a.a(paramMap, i.e()))) {
                    continue;
                  }
                  i.f(paramMap);
                  i.f(paramMap);
                  i.a();
                  paramMap = i.g();
                  com.alipay.c.f.d.a(this.a, paramMap);
                  paramMap = this.a;
                  com.alipay.c.f.d.a();
                  com.alipay.c.f.a.a(this.a, new com.alipay.c.f.b(i.b(), i.c(), i.f()));
                  paramMap = this.a;
                  com.alipay.c.f.a.a();
                  paramMap = i.a((String)localObject2);
                  g.a(this.a, (String)localObject2, paramMap);
                  paramMap = this.a;
                  g.a();
                  h.a(this.a, (String)localObject2, System.currentTimeMillis());
                  break label875;
                }
              }
              else
              {
                localObject1 = ((com.alipay.d.a.a.c.a.b)localObject3).j;
                continue;
              }
              localObject1 = i.d();
              continue;
              paramMap = i.e();
              continue;
            }
            com.alipay.c.c.a.a("Server error, returned null");
            continue;
          }
        }
        else
        {
          i = 0;
          continue;
        }
      }
      else
      {
        paramMap = null;
        continue;
      }
      for (;;)
      {
        label805:
        if (i != 0) {
          break label843;
        }
        i = 0;
        break;
        label816:
        i = 0;
        continue;
        for (;;)
        {
          label822:
          if (i == 0) {
            break label837;
          }
          i = 1;
          break;
          label833:
          i = 0;
        }
        label837:
        break label258;
        label839:
        i = 0;
      }
      label843:
      continue;
      switch (i)
      {
      case 2: 
      case 1: 
      default: 
        continue;
        i = 0;
        break;
      case 3: 
        label845:
        label875:
        i = 1;
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\c\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */