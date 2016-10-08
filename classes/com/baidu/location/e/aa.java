package com.baidu.location.e;

import android.content.Context;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Build.VERSION;
import android.telephony.TelephonyManager;
import android.text.TextUtils;
import com.baidu.location.BDLocation;
import com.baidu.location.Jni;
import com.baidu.location.c.e;
import com.baidu.location.f.a.a;
import com.baidu.location.k;
import java.lang.reflect.Method;

public class aa
{
  private static Method e = null;
  private static Method f = null;
  private static Method g = null;
  private static Class h = null;
  af a = new af(this);
  private Context b = null;
  private TelephonyManager c = null;
  private ad d = new ad(this, null);
  private WifiManager i = null;
  private ae j = null;
  private String k = null;
  private k l;
  private ac m;
  private String n = null;
  
  public aa(Context paramContext, k paramk, ac paramac)
  {
    this.b = paramContext.getApplicationContext();
    this.l = paramk;
    this.m = paramac;
    String str = this.b.getPackageName();
    try
    {
      this.c = ((TelephonyManager)this.b.getSystemService("phone"));
      paramContext = this.c.getDeviceId();
    }
    catch (Exception paramContext)
    {
      try
      {
        for (;;)
        {
          paramac = a.a(this.b);
          if (paramac == null) {
            break;
          }
          this.k = ("&prod=" + this.l.f + ":" + str + "|&cu=" + paramac + "&coor=" + paramk.a());
          paramContext = new StringBuffer(256);
          paramContext.append("&fw=");
          paramContext.append("6.12");
          paramContext.append("&lt=1");
          paramContext.append("&mb=");
          paramContext.append(Build.MODEL);
          paramContext.append("&resid=");
          paramContext.append("12");
          if ((paramk.b() == null) || ((paramk.b() != null) && (paramk.b().equals("all")))) {
            this.k += "&addr=all";
          }
          if ((paramk.o == true) || (paramk.p == true))
          {
            this.k += "&sema=";
            if (paramk.o == true) {
              this.k += "aptag|";
            }
            if (paramk.p == true) {
              this.k += "aptagd|";
            }
          }
          paramContext.append("&first=1");
          paramContext.append(Build.VERSION.SDK);
          this.k += paramContext.toString();
          this.i = ((WifiManager)this.b.getSystemService("wifi"));
          paramk = a();
          paramContext = paramk;
          if (!TextUtils.isEmpty(paramk)) {
            paramContext = paramk.replace(":", "");
          }
          if (!TextUtils.isEmpty(paramContext)) {
            this.k = (this.k + "&mac=" + paramContext);
          }
          b();
          return;
          paramContext = paramContext;
          paramContext = null;
        }
      }
      catch (Exception paramac)
      {
        for (;;)
        {
          paramac = null;
          continue;
          this.k = ("&prod=" + this.l.f + ":" + str + "|&im=" + paramContext + "&coor=" + paramk.a());
        }
      }
    }
  }
  
  private String a(int paramInt)
  {
    int i1 = paramInt;
    if (paramInt < 3) {
      i1 = 3;
    }
    try
    {
      a(this.c.getCellLocation());
      str1 = this.d.toString();
    }
    catch (Exception localException1)
    {
      try
      {
        for (;;)
        {
          String str1;
          this.j = null;
          this.j = new ae(this, this.i.getScanResults());
          String str3 = this.j.a(i1);
          if ((str1 != null) || (str3 != null)) {
            break;
          }
          this.n = null;
          return null;
          localException1 = localException1;
          str2 = null;
        }
      }
      catch (Exception localException2)
      {
        String str5;
        do
        {
          String str2;
          String str4;
          for (;;)
          {
            str4 = null;
          }
          str5 = str2;
          if (str4 != null) {
            str5 = str2 + str4;
          }
        } while (str5 == null);
        this.n = (str5 + this.k);
        return str5 + this.k;
      }
    }
  }
  
  /* Error */
  private void a(android.telephony.CellLocation paramCellLocation)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 6
    //   3: iconst_0
    //   4: istore 7
    //   6: aload_1
    //   7: ifnull +10 -> 17
    //   10: aload_0
    //   11: getfield 50	com/baidu/location/e/aa:c	Landroid/telephony/TelephonyManager;
    //   14: ifnonnull +4 -> 18
    //   17: return
    //   18: new 52	com/baidu/location/e/ad
    //   21: dup
    //   22: aload_0
    //   23: aconst_null
    //   24: invokespecial 55	com/baidu/location/e/ad:<init>	(Lcom/baidu/location/e/aa;Lcom/baidu/location/e/ab;)V
    //   27: astore_2
    //   28: aload_0
    //   29: getfield 50	com/baidu/location/e/aa:c	Landroid/telephony/TelephonyManager;
    //   32: invokevirtual 230	android/telephony/TelephonyManager:getNetworkOperator	()Ljava/lang/String;
    //   35: astore_3
    //   36: aload_3
    //   37: ifnull +142 -> 179
    //   40: aload_3
    //   41: invokevirtual 234	java/lang/String:length	()I
    //   44: ifle +135 -> 179
    //   47: aload_3
    //   48: invokevirtual 234	java/lang/String:length	()I
    //   51: iconst_3
    //   52: if_icmplt +41 -> 93
    //   55: aload_3
    //   56: iconst_0
    //   57: iconst_3
    //   58: invokevirtual 238	java/lang/String:substring	(II)Ljava/lang/String;
    //   61: invokestatic 244	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   64: invokevirtual 247	java/lang/Integer:intValue	()I
    //   67: istore 8
    //   69: iload 8
    //   71: istore 5
    //   73: iload 8
    //   75: ifge +12 -> 87
    //   78: aload_0
    //   79: getfield 57	com/baidu/location/e/aa:d	Lcom/baidu/location/e/ad;
    //   82: getfield 250	com/baidu/location/e/ad:c	I
    //   85: istore 5
    //   87: aload_2
    //   88: iload 5
    //   90: putfield 250	com/baidu/location/e/ad:c	I
    //   93: aload_3
    //   94: iconst_3
    //   95: invokevirtual 252	java/lang/String:substring	(I)Ljava/lang/String;
    //   98: astore_3
    //   99: aload_3
    //   100: ifnull +40 -> 140
    //   103: aload_3
    //   104: invokevirtual 256	java/lang/String:toCharArray	()[C
    //   107: astore 4
    //   109: iload 7
    //   111: istore 5
    //   113: iload 5
    //   115: istore 6
    //   117: iload 5
    //   119: aload 4
    //   121: arraylength
    //   122: if_icmpge +18 -> 140
    //   125: aload 4
    //   127: iload 5
    //   129: caload
    //   130: invokestatic 262	java/lang/Character:isDigit	(C)Z
    //   133: ifne +94 -> 227
    //   136: iload 5
    //   138: istore 6
    //   140: aload_3
    //   141: iconst_0
    //   142: iload 6
    //   144: invokevirtual 238	java/lang/String:substring	(II)Ljava/lang/String;
    //   147: invokestatic 244	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   150: invokevirtual 247	java/lang/Integer:intValue	()I
    //   153: istore 6
    //   155: iload 6
    //   157: istore 5
    //   159: iload 6
    //   161: ifge +12 -> 173
    //   164: aload_0
    //   165: getfield 57	com/baidu/location/e/aa:d	Lcom/baidu/location/e/ad;
    //   168: getfield 264	com/baidu/location/e/ad:d	I
    //   171: istore 5
    //   173: aload_2
    //   174: iload 5
    //   176: putfield 264	com/baidu/location/e/ad:d	I
    //   179: aload_1
    //   180: instanceof 266
    //   183: ifeq +53 -> 236
    //   186: aload_2
    //   187: aload_1
    //   188: checkcast 266	android/telephony/gsm/GsmCellLocation
    //   191: invokevirtual 269	android/telephony/gsm/GsmCellLocation:getLac	()I
    //   194: putfield 271	com/baidu/location/e/ad:a	I
    //   197: aload_2
    //   198: aload_1
    //   199: checkcast 266	android/telephony/gsm/GsmCellLocation
    //   202: invokevirtual 274	android/telephony/gsm/GsmCellLocation:getCid	()I
    //   205: putfield 276	com/baidu/location/e/ad:b	I
    //   208: aload_2
    //   209: bipush 103
    //   211: putfield 279	com/baidu/location/e/ad:e	C
    //   214: aload_2
    //   215: invokestatic 282	com/baidu/location/e/ad:a	(Lcom/baidu/location/e/ad;)Z
    //   218: ifeq -201 -> 17
    //   221: aload_0
    //   222: aload_2
    //   223: putfield 57	com/baidu/location/e/aa:d	Lcom/baidu/location/e/ad;
    //   226: return
    //   227: iload 5
    //   229: iconst_1
    //   230: iadd
    //   231: istore 5
    //   233: goto -120 -> 113
    //   236: aload_1
    //   237: instanceof 284
    //   240: ifeq -26 -> 214
    //   243: aload_2
    //   244: bipush 99
    //   246: putfield 279	com/baidu/location/e/ad:e	C
    //   249: getstatic 39	com/baidu/location/e/aa:h	Ljava/lang/Class;
    //   252: ifnonnull +60 -> 312
    //   255: ldc_w 286
    //   258: invokestatic 292	java/lang/Class:forName	(Ljava/lang/String;)Ljava/lang/Class;
    //   261: putstatic 39	com/baidu/location/e/aa:h	Ljava/lang/Class;
    //   264: getstatic 39	com/baidu/location/e/aa:h	Ljava/lang/Class;
    //   267: ldc_w 294
    //   270: iconst_0
    //   271: anewarray 288	java/lang/Class
    //   274: invokevirtual 298	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   277: putstatic 33	com/baidu/location/e/aa:e	Ljava/lang/reflect/Method;
    //   280: getstatic 39	com/baidu/location/e/aa:h	Ljava/lang/Class;
    //   283: ldc_w 300
    //   286: iconst_0
    //   287: anewarray 288	java/lang/Class
    //   290: invokevirtual 298	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   293: putstatic 35	com/baidu/location/e/aa:f	Ljava/lang/reflect/Method;
    //   296: getstatic 39	com/baidu/location/e/aa:h	Ljava/lang/Class;
    //   299: ldc_w 302
    //   302: iconst_0
    //   303: anewarray 288	java/lang/Class
    //   306: invokevirtual 298	java/lang/Class:getMethod	(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
    //   309: putstatic 37	com/baidu/location/e/aa:g	Ljava/lang/reflect/Method;
    //   312: getstatic 39	com/baidu/location/e/aa:h	Ljava/lang/Class;
    //   315: ifnull -101 -> 214
    //   318: getstatic 39	com/baidu/location/e/aa:h	Ljava/lang/Class;
    //   321: aload_1
    //   322: invokevirtual 305	java/lang/Class:isInstance	(Ljava/lang/Object;)Z
    //   325: ifeq -111 -> 214
    //   328: getstatic 37	com/baidu/location/e/aa:g	Ljava/lang/reflect/Method;
    //   331: aload_1
    //   332: iconst_0
    //   333: anewarray 4	java/lang/Object
    //   336: invokevirtual 311	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   339: checkcast 240	java/lang/Integer
    //   342: invokevirtual 247	java/lang/Integer:intValue	()I
    //   345: istore 6
    //   347: iload 6
    //   349: istore 5
    //   351: iload 6
    //   353: ifge +12 -> 365
    //   356: aload_0
    //   357: getfield 57	com/baidu/location/e/aa:d	Lcom/baidu/location/e/ad;
    //   360: getfield 264	com/baidu/location/e/ad:d	I
    //   363: istore 5
    //   365: aload_2
    //   366: iload 5
    //   368: putfield 264	com/baidu/location/e/ad:d	I
    //   371: aload_2
    //   372: getstatic 33	com/baidu/location/e/aa:e	Ljava/lang/reflect/Method;
    //   375: aload_1
    //   376: iconst_0
    //   377: anewarray 4	java/lang/Object
    //   380: invokevirtual 311	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   383: checkcast 240	java/lang/Integer
    //   386: invokevirtual 247	java/lang/Integer:intValue	()I
    //   389: putfield 276	com/baidu/location/e/ad:b	I
    //   392: aload_2
    //   393: getstatic 35	com/baidu/location/e/aa:f	Ljava/lang/reflect/Method;
    //   396: aload_1
    //   397: iconst_0
    //   398: anewarray 4	java/lang/Object
    //   401: invokevirtual 311	java/lang/reflect/Method:invoke	(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
    //   404: checkcast 240	java/lang/Integer
    //   407: invokevirtual 247	java/lang/Integer:intValue	()I
    //   410: putfield 271	com/baidu/location/e/ad:a	I
    //   413: goto -199 -> 214
    //   416: astore_1
    //   417: return
    //   418: astore_1
    //   419: aconst_null
    //   420: putstatic 39	com/baidu/location/e/aa:h	Ljava/lang/Class;
    //   423: return
    //   424: astore_3
    //   425: goto -246 -> 179
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	428	0	this	aa
    //   0	428	1	paramCellLocation	android.telephony.CellLocation
    //   27	366	2	localad	ad
    //   35	106	3	str	String
    //   424	1	3	localException	Exception
    //   107	19	4	arrayOfChar	char[]
    //   71	296	5	i1	int
    //   1	351	6	i2	int
    //   4	106	7	i3	int
    //   67	7	8	i4	int
    // Exception table:
    //   from	to	target	type
    //   328	347	416	java/lang/Exception
    //   356	365	416	java/lang/Exception
    //   365	413	416	java/lang/Exception
    //   255	312	418	java/lang/Exception
    //   47	69	424	java/lang/Exception
    //   78	87	424	java/lang/Exception
    //   87	93	424	java/lang/Exception
    //   93	99	424	java/lang/Exception
    //   103	109	424	java/lang/Exception
    //   117	136	424	java/lang/Exception
    //   140	155	424	java/lang/Exception
    //   164	173	424	java/lang/Exception
    //   173	179	424	java/lang/Exception
  }
  
  public String a()
  {
    String str = null;
    try
    {
      WifiInfo localWifiInfo = this.i.getConnectionInfo();
      if (localWifiInfo != null) {
        str = localWifiInfo.getMacAddress();
      }
      return str;
    }
    catch (Exception localException) {}
    return null;
  }
  
  public String b()
  {
    try
    {
      String str = a(15);
      return str;
    }
    catch (Exception localException) {}
    return null;
  }
  
  public void c()
  {
    if (this.n == null) {}
    Object localObject;
    do
    {
      return;
      BDLocation localBDLocation = null;
      localObject = localBDLocation;
      if (this.l.d >= 1000)
      {
        localObject = localBDLocation;
        if (!this.l.b().equals("all"))
        {
          localObject = localBDLocation;
          if (!this.l.o)
          {
            localObject = localBDLocation;
            if (!this.l.p)
            {
              localBDLocation = e.a().a(this.d.a(), this.i.getScanResults(), false);
              if (!this.l.a.equals("gcj02"))
              {
                double d1 = localBDLocation.d();
                double d2 = localBDLocation.c();
                if ((d1 != Double.MIN_VALUE) && (d2 != Double.MIN_VALUE))
                {
                  localObject = Jni.a(d1, d2, this.l.a);
                  localBDLocation.b(localObject[0]);
                  localBDLocation.a(localObject[1]);
                  localBDLocation.b(this.l.a);
                }
              }
              localObject = localBDLocation;
              if (localBDLocation.h() == 66)
              {
                this.m.a(localBDLocation);
                localObject = localBDLocation;
              }
            }
          }
        }
      }
    } while (localObject != null);
    this.a.a(this.n);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\e\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */