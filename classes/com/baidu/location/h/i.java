package com.baidu.location.h;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.net.wifi.ScanResult;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build.VERSION;
import com.baidu.location.f;
import java.lang.reflect.Method;
import java.util.List;

public class i
  extends q
{
  public static long a = 0L;
  private static i b = null;
  private WifiManager c = null;
  private k d = null;
  private l e = null;
  private long f = 0L;
  private long g = 0L;
  private boolean h = false;
  private Object i = null;
  private Method j = null;
  private boolean k = true;
  
  public static i a()
  {
    if (b == null) {
      b = new i();
    }
    return b;
  }
  
  public static boolean a(l paraml1, l paraml2, float paramFloat)
  {
    if ((paraml1 == null) || (paraml2 == null)) {
      return false;
    }
    paraml1 = paraml1.a;
    paraml2 = paraml2.a;
    if (paraml1 == paraml2) {
      return true;
    }
    if ((paraml1 == null) || (paraml2 == null)) {
      return false;
    }
    int i2 = paraml1.size();
    int i3 = paraml2.size();
    float f1 = i2 + i3;
    if ((i2 == 0) && (i3 == 0)) {
      return true;
    }
    if ((i2 == 0) || (i3 == 0)) {
      return false;
    }
    int n = 0;
    int m = 0;
    String str;
    if (n < i2)
    {
      str = ((ScanResult)paraml1.get(n)).BSSID;
      if (str != null) {}
    }
    for (;;)
    {
      n += 1;
      break;
      int i1 = 0;
      for (;;)
      {
        if (i1 < i3)
        {
          if (str.equals(((ScanResult)paraml2.get(i1)).BSSID))
          {
            m += 1;
            break;
          }
          i1 += 1;
          continue;
          return m * 2 >= f1 * paramFloat;
        }
      }
    }
  }
  
  private void n()
  {
    if (this.c == null) {}
    for (;;)
    {
      return;
      try
      {
        Object localObject = this.c.getScanResults();
        localObject = new l((List)localObject, this.f);
        if ((this.e == null) || (!((l)localObject).a(this.e)))
        {
          this.e = ((l)localObject);
          return;
        }
      }
      catch (Exception localException) {}
    }
  }
  
  public boolean a(String paramString)
  {
    return super.a(paramString);
  }
  
  /* Error */
  public void b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 45	com/baidu/location/h/i:h	Z
    //   6: istore_2
    //   7: iload_2
    //   8: iconst_1
    //   9: if_icmpne +6 -> 15
    //   12: aload_0
    //   13: monitorexit
    //   14: return
    //   15: getstatic 106	com/baidu/location/f:f	Z
    //   18: ifeq -6 -> 12
    //   21: aload_0
    //   22: invokestatic 109	com/baidu/location/f:b	()Landroid/content/Context;
    //   25: ldc 111
    //   27: invokevirtual 117	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   30: checkcast 89	android/net/wifi/WifiManager
    //   33: putfield 35	com/baidu/location/h/i:c	Landroid/net/wifi/WifiManager;
    //   36: aload_0
    //   37: new 119	com/baidu/location/h/k
    //   40: dup
    //   41: aload_0
    //   42: aconst_null
    //   43: invokespecial 122	com/baidu/location/h/k:<init>	(Lcom/baidu/location/h/i;Lcom/baidu/location/h/j;)V
    //   46: putfield 37	com/baidu/location/h/i:d	Lcom/baidu/location/h/k;
    //   49: invokestatic 109	com/baidu/location/f:b	()Landroid/content/Context;
    //   52: aload_0
    //   53: getfield 37	com/baidu/location/h/i:d	Lcom/baidu/location/h/k;
    //   56: new 124	android/content/IntentFilter
    //   59: dup
    //   60: ldc 126
    //   62: invokespecial 129	android/content/IntentFilter:<init>	(Ljava/lang/String;)V
    //   65: invokevirtual 133	android/content/Context:registerReceiver	(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
    //   68: pop
    //   69: aload_0
    //   70: iconst_1
    //   71: putfield 45	com/baidu/location/h/i:h	Z
    //   74: ldc -121
    //   76: invokestatic 141	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   79: ldc -113
    //   81: invokevirtual 147	java/lang/Class:getDeclaredField	(Ljava/lang/String;)Ljava/lang/reflect/Field;
    //   84: astore_1
    //   85: aload_1
    //   86: ifnull -74 -> 12
    //   89: aload_1
    //   90: iconst_1
    //   91: invokevirtual 153	java/lang/reflect/Field:setAccessible	(Z)V
    //   94: aload_0
    //   95: aload_1
    //   96: aload_0
    //   97: getfield 35	com/baidu/location/h/i:c	Landroid/net/wifi/WifiManager;
    //   100: invokevirtual 156	java/lang/reflect/Field:get	(Ljava/lang/Object;)Ljava/lang/Object;
    //   103: putfield 47	com/baidu/location/h/i:i	Ljava/lang/Object;
    //   106: aload_0
    //   107: getfield 47	com/baidu/location/h/i:i	Ljava/lang/Object;
    //   110: invokevirtual 162	java/lang/Object:getClass	()Ljava/lang/Class;
    //   113: pop
    //   114: goto -102 -> 12
    //   117: astore_1
    //   118: goto -106 -> 12
    //   121: astore_1
    //   122: aload_0
    //   123: monitorexit
    //   124: aload_1
    //   125: athrow
    //   126: astore_1
    //   127: goto -58 -> 69
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	130	0	this	i
    //   84	12	1	localField	java.lang.reflect.Field
    //   117	1	1	localException1	Exception
    //   121	4	1	localObject	Object
    //   126	1	1	localException2	Exception
    //   6	4	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   74	85	117	java/lang/Exception
    //   89	114	117	java/lang/Exception
    //   2	7	121	finally
    //   15	49	121	finally
    //   49	69	121	finally
    //   69	74	121	finally
    //   74	85	121	finally
    //   89	114	121	finally
    //   49	69	126	java/lang/Exception
  }
  
  /* Error */
  public void c()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 45	com/baidu/location/h/i:h	Z
    //   6: istore_2
    //   7: iload_2
    //   8: ifne +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: invokestatic 109	com/baidu/location/f:b	()Landroid/content/Context;
    //   17: aload_0
    //   18: getfield 37	com/baidu/location/h/i:d	Lcom/baidu/location/h/k;
    //   21: invokevirtual 166	android/content/Context:unregisterReceiver	(Landroid/content/BroadcastReceiver;)V
    //   24: lconst_0
    //   25: putstatic 29	com/baidu/location/h/i:a	J
    //   28: aload_0
    //   29: aconst_null
    //   30: putfield 37	com/baidu/location/h/i:d	Lcom/baidu/location/h/k;
    //   33: aload_0
    //   34: aconst_null
    //   35: putfield 35	com/baidu/location/h/i:c	Landroid/net/wifi/WifiManager;
    //   38: aload_0
    //   39: iconst_0
    //   40: putfield 45	com/baidu/location/h/i:h	Z
    //   43: goto -32 -> 11
    //   46: astore_1
    //   47: aload_0
    //   48: monitorexit
    //   49: aload_1
    //   50: athrow
    //   51: astore_1
    //   52: goto -24 -> 28
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	55	0	this	i
    //   46	4	1	localObject	Object
    //   51	1	1	localException	Exception
    //   6	2	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	7	46	finally
    //   14	28	46	finally
    //   28	43	46	finally
    //   14	28	51	java/lang/Exception
  }
  
  public boolean d()
  {
    long l = System.currentTimeMillis();
    if (l - this.g <= 5000L) {
      return false;
    }
    this.g = l;
    return e();
  }
  
  public boolean e()
  {
    if (this.c == null) {}
    while (System.currentTimeMillis() - this.f <= 3000L) {
      return false;
    }
    return f();
  }
  
  public boolean f()
  {
    for (;;)
    {
      try
      {
        if ((!this.c.isWifiEnabled()) && ((Build.VERSION.SDK_INT <= 17) || (!this.c.isScanAlwaysAvailable()))) {
          break label121;
        }
        if (this.j == null) {
          continue;
        }
        Object localObject = this.i;
        if (localObject == null) {
          continue;
        }
      }
      catch (NoSuchMethodError localNoSuchMethodError)
      {
        this.c.startScan();
        this.f = System.currentTimeMillis();
        return true;
        this.c.startScan();
        continue;
      }
      catch (Exception localException2) {}
      try
      {
        this.j.invoke(this.i, new Object[] { Boolean.valueOf(this.k) });
        this.f = System.currentTimeMillis();
        return true;
      }
      catch (Exception localException1)
      {
        this.c.startScan();
      }
    }
    label121:
    return false;
  }
  
  public boolean g()
  {
    try
    {
      NetworkInfo localNetworkInfo = ((ConnectivityManager)f.b().getSystemService("connectivity")).getActiveNetworkInfo();
      if (localNetworkInfo != null)
      {
        int m = localNetworkInfo.getType();
        if (m == 1) {
          return true;
        }
      }
      return false;
    }
    catch (Exception localException) {}
    return false;
  }
  
  public int h()
  {
    if (this.c == null) {}
    for (;;)
    {
      return -1;
      Object localObject = this.c.getConnectionInfo();
      if (localObject != null) {
        try
        {
          String str = ((WifiInfo)localObject).getBSSID();
          int n = ((WifiInfo)localObject).getRssi();
          int m = n;
          if (n < 0) {
            m = -n;
          }
          if (str != null)
          {
            localObject = str.replace(":", "");
            if (!"000000000000".equals(localObject))
            {
              boolean bool = "".equals(localObject);
              if (bool) {}
            }
          }
          else
          {
            return m;
          }
        }
        catch (Exception localException) {}
      }
    }
    return -1;
  }
  
  public String i()
  {
    if (this.c == null) {}
    Object localObject1;
    do
    {
      return null;
      localObject1 = this.c.getConnectionInfo();
    } while (localObject1 == null);
    for (;;)
    {
      try
      {
        localObject1 = ((WifiInfo)localObject1).getBSSID();
        if (localObject1 != null)
        {
          localObject1 = ((String)localObject1).replace(":", "");
          if ("000000000000".equals(localObject1)) {
            break;
          }
          boolean bool = "".equals(localObject1);
          if (bool) {
            break;
          }
          return (String)localObject1;
        }
      }
      catch (Exception localException)
      {
        return null;
      }
      Object localObject2 = null;
    }
  }
  
  public l j()
  {
    if ((this.e == null) || (!this.e.f())) {
      return l();
    }
    return this.e;
  }
  
  public l k()
  {
    if ((this.e == null) || (!this.e.g())) {
      return l();
    }
    return this.e;
  }
  
  public l l()
  {
    if (this.c != null) {
      try
      {
        l locall = new l(this.c.getScanResults(), this.f);
        return locall;
      }
      catch (Exception localException) {}
    }
    return new l(null, 0L);
  }
  
  public String m()
  {
    String str = null;
    try
    {
      WifiInfo localWifiInfo = this.c.getConnectionInfo();
      if (localWifiInfo != null) {
        str = localWifiInfo.getMacAddress();
      }
      return str;
    }
    catch (Exception localException) {}
    return null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\h\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */