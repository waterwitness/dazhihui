package com.baidu.location.b;

import android.content.Context;
import android.location.Location;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.NetworkInfo.State;
import android.os.Environment;
import android.text.TextUtils;
import com.baidu.location.BDLocation;
import com.baidu.location.f;
import com.baidu.location.h.a;
import com.baidu.location.h.g;
import com.baidu.location.h.n;
import com.baidu.location.h.p;
import java.io.File;
import java.io.FileInputStream;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.util.Calendar;
import java.util.Locale;

public class l
{
  public static int A = 3;
  public static int B = 10;
  public static int C = 2;
  public static int D = 7;
  public static int E = 20;
  public static int F = 70;
  public static int G = 120;
  public static float H = 2.0F;
  public static float I = 10.0F;
  public static float J = 50.0F;
  public static float K = 200.0F;
  public static int L = 16;
  public static float M = 0.9F;
  public static int N = 10000;
  public static float O = 0.5F;
  public static float P = 0.0F;
  public static float Q = 0.1F;
  public static int R = 30;
  public static int S = 100;
  public static int T = 420000;
  public static boolean U = true;
  public static boolean V = true;
  public static int W = 20;
  public static int X = 300;
  public static int Y = 1000;
  public static long Z = 900000L;
  public static boolean a = false;
  public static long aa = 420000L;
  public static long ab = 180000L;
  public static long ac = 0L;
  public static long ad = 15L;
  public static long ae = 300000L;
  public static int af = 1000;
  public static int ag = 0;
  public static int ah = 30000;
  public static int ai = 30000;
  public static float aj = 10.0F;
  public static float ak = 6.0F;
  public static float al = 10.0F;
  public static int am = 60;
  public static int an = 70;
  public static int ao = 6;
  private static String ap;
  private static String aq;
  private static String ar;
  private static String as;
  private static String at;
  private static String au;
  private static String av;
  public static boolean b = false;
  public static boolean c = false;
  public static int d = 0;
  public static String e;
  public static String f;
  public static boolean g;
  public static boolean h;
  public static boolean i;
  public static boolean j;
  public static boolean k;
  public static String l;
  public static boolean m;
  public static int n;
  public static double o;
  public static double p;
  public static double q;
  public static double r;
  public static int s;
  public static byte[] t;
  public static boolean u;
  public static int v;
  public static float w;
  public static float x;
  public static float y;
  public static float z;
  
  static
  {
    ap = "http://loc.map.baidu.com/sdk.php";
    e = "http://loc.map.baidu.com/sdk_ep.php";
    aq = "http://loc.map.baidu.com/user_err.php";
    ar = "http://loc.map.baidu.com/oqur.php";
    as = "http://loc.map.baidu.com/tcu.php";
    at = "http://loc.map.baidu.com/iofd.php";
    au = "https://sapi.skyhookwireless.com/wps2/location";
    av = "http://loc.map.baidu.com/wloc";
    f = "no";
    g = false;
    h = false;
    i = false;
    j = false;
    k = false;
    l = "gcj02";
    m = true;
    n = 3;
    o = 0.0D;
    p = 0.0D;
    q = 0.0D;
    r = 0.0D;
    s = 0;
    t = null;
    u = false;
    v = 0;
    w = 1.1F;
    x = 2.2F;
    y = 2.3F;
    z = 3.8F;
  }
  
  public static int a(String paramString1, String paramString2, String paramString3)
  {
    if ((paramString1 == null) || (paramString1.equals(""))) {}
    int i1;
    do
    {
      int i2;
      do
      {
        do
        {
          return Integer.MIN_VALUE;
          i1 = paramString1.indexOf(paramString2);
        } while (i1 == -1);
        i1 += paramString2.length();
        i2 = paramString1.indexOf(paramString3, i1);
      } while (i2 == -1);
      paramString1 = paramString1.substring(i1, i2);
    } while ((paramString1 == null) || (paramString1.equals("")));
    try
    {
      i1 = Integer.parseInt(paramString1);
      return i1;
    }
    catch (NumberFormatException paramString1) {}
    return Integer.MIN_VALUE;
  }
  
  public static String a()
  {
    Calendar localCalendar = Calendar.getInstance();
    int i1 = localCalendar.get(5);
    int i2 = localCalendar.get(1);
    int i3 = localCalendar.get(2);
    int i4 = localCalendar.get(11);
    int i5 = localCalendar.get(12);
    int i6 = localCalendar.get(13);
    return String.format(Locale.CHINA, "%d-%02d-%02d %02d:%02d:%02d", new Object[] { Integer.valueOf(i2), Integer.valueOf(i3 + 1), Integer.valueOf(i1), Integer.valueOf(i4), Integer.valueOf(i5), Integer.valueOf(i6) });
  }
  
  public static String a(n paramn, com.baidu.location.h.l paraml, Location paramLocation, String paramString, int paramInt)
  {
    StringBuffer localStringBuffer = new StringBuffer(1024);
    String str;
    if (paramn != null)
    {
      str = com.baidu.location.h.e.a().b(paramn);
      if (str != null) {
        localStringBuffer.append(str);
      }
    }
    if (paraml != null)
    {
      if (paramInt != 0) {
        break label299;
      }
      str = paraml.b();
    }
    for (;;)
    {
      if (str != null) {
        localStringBuffer.append(str);
      }
      if (paramLocation != null)
      {
        if ((d == 0) || (paramInt == 0)) {
          break label308;
        }
        str = a.c(paramLocation);
        label87:
        if (str != null) {
          localStringBuffer.append(str);
        }
      }
      boolean bool = false;
      if (paramInt == 0) {
        bool = true;
      }
      str = b.a().a(bool);
      if (str != null) {
        localStringBuffer.append(str);
      }
      if (paramString != null) {
        localStringBuffer.append(paramString);
      }
      paramString = com.baidu.location.e.e.a().d();
      if (!TextUtils.isEmpty(paramString)) {
        localStringBuffer.append("&bc=").append(paramString);
      }
      if ((paramInt != 0) || (paramn != null))
      {
        paramn = g.a().a(paramn);
        if ((paramn != null) && (paramn.length() + localStringBuffer.length() < 750)) {
          localStringBuffer.append(paramn);
        }
      }
      paramn = localStringBuffer.toString();
      if ((paramLocation == null) || (paraml == null)) {
        break label378;
      }
      try
      {
        float f1 = paramLocation.getSpeed();
        paramInt = d;
        int i1 = paraml.d();
        int i2 = paraml.a();
        bool = paraml.e();
        if ((f1 < ak) && ((paramInt == 1) || (paramInt == 0)) && ((i1 < am) || (bool == true)))
        {
          n = 1;
          return paramn;
          label299:
          str = paraml.c();
          continue;
          label308:
          str = a.b(paramLocation);
          break label87;
        }
        else if ((f1 < al) && ((paramInt == 1) || (paramInt == 0) || (paramInt == 3)) && ((i1 < an) || (i2 > ao)))
        {
          n = 2;
          return paramn;
        }
      }
      catch (Exception paraml)
      {
        n = 3;
        return paramn;
      }
    }
    n = 3;
    return paramn;
    label378:
    n = 3;
    return paramn;
  }
  
  public static String a(File paramFile)
  {
    if (!paramFile.isFile()) {
      return null;
    }
    byte[] arrayOfByte = new byte['Ѐ'];
    MessageDigest localMessageDigest;
    try
    {
      localMessageDigest = MessageDigest.getInstance("MD5");
      paramFile = new FileInputStream(paramFile);
      for (;;)
      {
        int i1 = paramFile.read(arrayOfByte, 0, 1024);
        if (i1 == -1) {
          break;
        }
        localMessageDigest.update(arrayOfByte, 0, i1);
      }
      paramFile.close();
    }
    catch (Exception paramFile)
    {
      paramFile.printStackTrace();
      return null;
    }
    return new BigInteger(1, localMessageDigest.digest()).toString(16);
  }
  
  public static boolean a(Context paramContext)
  {
    boolean bool2 = false;
    paramContext = (ConnectivityManager)paramContext.getSystemService("connectivity");
    boolean bool1 = bool2;
    int i1;
    if (paramContext != null)
    {
      paramContext = paramContext.getAllNetworkInfo();
      bool1 = bool2;
      if (paramContext != null) {
        i1 = 0;
      }
    }
    for (;;)
    {
      bool1 = bool2;
      if (i1 < paramContext.length)
      {
        if (paramContext[i1].getState() == NetworkInfo.State.CONNECTED) {
          bool1 = true;
        }
      }
      else {
        return bool1;
      }
      i1 += 1;
    }
  }
  
  public static boolean a(BDLocation paramBDLocation)
  {
    int i1 = paramBDLocation.h();
    return (i1 > 100) && (i1 < 200);
  }
  
  public static String b()
  {
    return ap;
  }
  
  public static String c()
  {
    return au;
  }
  
  public static String d()
  {
    return as;
  }
  
  public static String e()
  {
    if (Environment.getExternalStorageState().equals("mounted")) {}
    try
    {
      String str = Environment.getExternalStorageDirectory().getPath();
      File localFile = new File(str + "/baidu/tempdata");
      if (!localFile.exists()) {
        localFile.mkdirs();
      }
      return str;
    }
    catch (Exception localException) {}
    return null;
    return null;
  }
  
  public static String f()
  {
    String str = e();
    if (str == null) {
      return null;
    }
    return str + "/baidu/tempdata";
  }
  
  public static String g()
  {
    try
    {
      Object localObject = new File(f.b().getFilesDir() + File.separator + "lldt");
      if (!((File)localObject).exists()) {
        ((File)localObject).mkdirs();
      }
      localObject = ((File)localObject).getAbsolutePath();
      return (String)localObject;
    }
    catch (Exception localException) {}
    return null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\b\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */