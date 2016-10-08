package com.baidu.location.b;

import android.content.Context;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import com.baidu.location.f;
import com.baidu.location.f.a.a;

public class b
{
  public static String c = null;
  public static String d = null;
  public static String e = null;
  public static String f = null;
  private static b g = null;
  public String a = null;
  public String b = null;
  private boolean h = false;
  
  private b()
  {
    if (f.b() != null) {
      a(f.b());
    }
  }
  
  public static b a()
  {
    if (g == null) {
      g = new b();
    }
    return g;
  }
  
  public String a(boolean paramBoolean)
  {
    return a(paramBoolean, null);
  }
  
  public String a(boolean paramBoolean, String paramString)
  {
    StringBuffer localStringBuffer = new StringBuffer(256);
    localStringBuffer.append("&sdk=");
    localStringBuffer.append(6.12F);
    if (paramBoolean)
    {
      if (l.f.equals("all")) {
        localStringBuffer.append("&addr=all");
      }
      if ((l.g) || (l.i) || (l.j) || (l.h))
      {
        localStringBuffer.append("&sema=");
        if (l.g) {
          localStringBuffer.append("aptag|");
        }
        if (l.h) {
          localStringBuffer.append("aptagd|");
        }
        if (l.i) {
          localStringBuffer.append("poiregion|");
        }
        if (l.j) {
          localStringBuffer.append("regular");
        }
      }
    }
    if (paramBoolean)
    {
      if (paramString == null) {
        localStringBuffer.append("&coor=gcj02");
      }
    }
    else
    {
      if (this.b != null) {
        break label327;
      }
      localStringBuffer.append("&im=");
      localStringBuffer.append(this.a);
    }
    for (;;)
    {
      localStringBuffer.append("&fw=");
      localStringBuffer.append(f.a());
      localStringBuffer.append("&lt=1");
      localStringBuffer.append("&mb=");
      localStringBuffer.append(Build.MODEL);
      localStringBuffer.append("&resid=");
      localStringBuffer.append("12");
      localStringBuffer.append("&os=A");
      localStringBuffer.append(Build.VERSION.SDK);
      if (paramBoolean)
      {
        localStringBuffer.append("&sv=");
        String str = Build.VERSION.RELEASE;
        paramString = str;
        if (str != null)
        {
          paramString = str;
          if (str.length() > 6) {
            paramString = str.substring(0, 6);
          }
        }
        localStringBuffer.append(paramString);
      }
      return localStringBuffer.toString();
      localStringBuffer.append("&coor=");
      localStringBuffer.append(paramString);
      break;
      label327:
      localStringBuffer.append("&cu=");
      localStringBuffer.append(this.b);
    }
  }
  
  public void a(Context paramContext)
  {
    if ((paramContext == null) || (this.h)) {
      return;
    }
    try
    {
      this.a = ((TelephonyManager)paramContext.getSystemService("phone")).getDeviceId();
    }
    catch (Exception localException2)
    {
      try
      {
        this.b = a.a(paramContext);
      }
      catch (Exception localException2)
      {
        try
        {
          for (;;)
          {
            c = paramContext.getPackageName();
            this.h = true;
            return;
            localException1 = localException1;
            this.a = "NULL";
            continue;
            localException2 = localException2;
            this.b = null;
          }
        }
        catch (Exception paramContext)
        {
          for (;;)
          {
            c = null;
          }
        }
      }
    }
  }
  
  public void a(String paramString1, String paramString2)
  {
    d = paramString1;
    c = paramString2;
  }
  
  public String b()
  {
    if (this.b != null) {
      return "v6.12|" + this.b + "|" + Build.MODEL;
    }
    return "v6.12|" + this.a + "|" + Build.MODEL;
  }
  
  public String c()
  {
    if (c != null) {
      return b() + "|" + c;
    }
    return b();
  }
  
  public String d()
  {
    StringBuffer localStringBuffer = new StringBuffer();
    if (this.b == null)
    {
      localStringBuffer.append("&im=");
      localStringBuffer.append(this.a);
    }
    for (;;)
    {
      localStringBuffer.append("&mb=");
      localStringBuffer.append(Build.MODEL);
      localStringBuffer.append("&os=A");
      localStringBuffer.append(Build.VERSION.SDK);
      localStringBuffer.append("&prod=");
      localStringBuffer.append(d + ":" + c);
      localStringBuffer.append("&resid=");
      localStringBuffer.append("12");
      return localStringBuffer.toString();
      localStringBuffer.append("&cu=");
      localStringBuffer.append(this.b);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */