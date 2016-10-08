package com.baidu.location.h;

import android.content.Context;
import android.location.GpsSatellite;
import android.location.GpsStatus;
import android.location.Location;
import android.location.LocationManager;
import android.os.Bundle;
import android.os.Handler;
import com.baidu.location.Jni;
import com.baidu.location.b.g;
import com.baidu.location.e.f;
import com.baidu.location.e.y;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map.Entry;
import java.util.Set;

public class a
  extends m
{
  private static a c = null;
  private static int k = 0;
  private static String r = null;
  private final long a = 1000L;
  private final long b = 9000L;
  private Context d;
  private LocationManager e = null;
  private Location f;
  private c g = null;
  private d h = null;
  private GpsStatus i;
  private b j = null;
  private long l = 0L;
  private boolean m = false;
  private boolean n = false;
  private String o = null;
  private boolean p = false;
  private long q = 0L;
  private Handler s = null;
  private final int t = 1;
  private final int u = 2;
  private final int v = 3;
  private final int w = 4;
  private int x;
  private int y;
  private HashMap z;
  
  private int a(s params, int paramInt)
  {
    if (k >= com.baidu.location.b.l.B) {}
    do
    {
      double d1;
      do
      {
        do
        {
          return 1;
          if (k <= com.baidu.location.b.l.A) {
            return 4;
          }
          d1 = params.c();
        } while (d1 <= com.baidu.location.b.l.w);
        if (d1 >= com.baidu.location.b.l.x) {
          return 4;
        }
        d1 = params.b();
      } while (d1 <= com.baidu.location.b.l.y);
      if (d1 >= com.baidu.location.b.l.z) {
        return 4;
      }
    } while (paramInt >= com.baidu.location.b.l.D);
    if (paramInt <= com.baidu.location.b.l.C) {
      return 4;
    }
    if (this.z != null) {
      return a(this.z);
    }
    return 3;
  }
  
  private int a(HashMap paramHashMap)
  {
    ArrayList localArrayList1;
    ArrayList localArrayList2;
    int i1;
    Object localObject;
    int i2;
    if (this.x > 4)
    {
      localArrayList1 = new ArrayList();
      localArrayList2 = new ArrayList();
      paramHashMap = paramHashMap.entrySet().iterator();
      i1 = 0;
      if (paramHashMap.hasNext())
      {
        localObject = (List)((Map.Entry)paramHashMap.next()).getValue();
        if (localObject == null) {
          break label301;
        }
        localObject = a((List)localObject);
        if (localObject == null) {
          break label301;
        }
        localArrayList1.add(localObject);
        i2 = i1 + 1;
        localArrayList2.add(Integer.valueOf(i1));
        i1 = i2;
      }
    }
    label301:
    for (;;)
    {
      break;
      if (!localArrayList1.isEmpty())
      {
        paramHashMap = new double[2];
        i2 = localArrayList1.size();
        i1 = 0;
        while (i1 < i2)
        {
          localObject = (double[])localArrayList1.get(i1);
          int i3 = ((Integer)localArrayList2.get(i1)).intValue();
          localObject[0] *= i3;
          localObject[1] *= i3;
          paramHashMap[0] += localObject[0];
          double d1 = paramHashMap[1];
          localObject[1] += d1;
          i1 += 1;
        }
        paramHashMap[0] /= i2;
        paramHashMap[1] /= i2;
        paramHashMap = b(paramHashMap[0], paramHashMap[1]);
        if (paramHashMap[0] <= com.baidu.location.b.l.F) {
          return 1;
        }
        if (paramHashMap[0] >= com.baidu.location.b.l.G) {
          return 4;
        }
      }
      return 3;
    }
  }
  
  public static a a()
  {
    if (c == null) {
      c = new a();
    }
    return c;
  }
  
  private String a(GpsSatellite paramGpsSatellite, HashMap paramHashMap)
  {
    int i2 = (int)Math.floor(paramGpsSatellite.getAzimuth() / 6.0F);
    float f1 = paramGpsSatellite.getElevation();
    int i3 = (int)Math.floor(f1 / 1.5D);
    float f2 = paramGpsSatellite.getSnr();
    int i4 = Math.round(f2 / 5.0F);
    int i1 = paramGpsSatellite.getPrn();
    if (i1 >= 65) {
      i1 -= 32;
    }
    for (;;)
    {
      if ((f2 >= 10.0F) && (f1 >= 1.0F))
      {
        List localList = (List)paramHashMap.get(Integer.valueOf(i4));
        Object localObject = localList;
        if (localList == null) {
          localObject = new ArrayList();
        }
        ((List)localObject).add(paramGpsSatellite);
        paramHashMap.put(Integer.valueOf(i4), localObject);
        this.x += 1;
      }
      if ((i2 < 64) || ((i3 < 64) || (i1 >= 65))) {}
      return null;
    }
  }
  
  public static String a(Location paramLocation)
  {
    float f3 = -1.0F;
    if (paramLocation == null) {
      return null;
    }
    float f1 = (float)(paramLocation.getSpeed() * 3.6D);
    if (!paramLocation.hasSpeed()) {
      f1 = -1.0F;
    }
    float f2;
    int i1;
    if (paramLocation.hasAccuracy())
    {
      f2 = paramLocation.getAccuracy();
      i1 = (int)f2;
      if (!paramLocation.hasAltitude()) {
        break label175;
      }
    }
    label175:
    for (double d1 = paramLocation.getAltitude();; d1 = 555.0D)
    {
      f2 = f3;
      if (paramLocation.hasBearing()) {
        f2 = paramLocation.getBearing();
      }
      return String.format(Locale.CHINA, "&ll=%.5f|%.5f&s=%.1f&d=%.1f&ll_r=%d&ll_n=%d&ll_h=%.2f&ll_t=%d", new Object[] { Double.valueOf(paramLocation.getLongitude()), Double.valueOf(paramLocation.getLatitude()), Float.valueOf(f1), Float.valueOf(f2), Integer.valueOf(i1), Integer.valueOf(k), Double.valueOf(d1), Long.valueOf(paramLocation.getTime() / 1000L) });
      f2 = -1.0F;
      break;
    }
  }
  
  private void a(double paramDouble1, double paramDouble2, float paramFloat)
  {
    int i2 = 0;
    if (!com.baidu.location.e.i.a().f) {}
    for (;;)
    {
      return;
      int i1 = i2;
      if (paramDouble1 >= 73.146973D)
      {
        i1 = i2;
        if (paramDouble1 <= 135.252686D)
        {
          i1 = i2;
          if (paramDouble2 <= 54.258807D)
          {
            i1 = i2;
            if (paramDouble2 >= 14.604847D)
            {
              if (paramFloat <= 18.0F) {
                break label88;
              }
              i1 = i2;
            }
          }
        }
      }
      while (com.baidu.location.b.l.s != i1)
      {
        com.baidu.location.b.l.s = i1;
        return;
        label88:
        double d1 = com.baidu.location.b.l.q;
        double d2 = com.baidu.location.b.l.r;
        i1 = (int)((paramDouble1 - d1) * 1000.0D);
        int i3 = (int)((d2 - paramDouble2) * 1000.0D);
        if ((i1 > 0) && (i1 < 50) && (i3 > 0) && (i3 < 50))
        {
          i3 = i1 + i3 * 50;
          i1 = i2;
          if (com.baidu.location.b.l.u) {
            i1 = com.baidu.location.b.l.t[(i3 >> 2)] >> (i3 & 0x3) * 2 & 0x3;
          }
        }
        else
        {
          String str = String.format(Locale.CHINA, "&ll=%.5f|%.5f", new Object[] { Double.valueOf(paramDouble1), Double.valueOf(paramDouble2) });
          str = str + "&im=" + com.baidu.location.b.b.a().b();
          com.baidu.location.b.l.o = paramDouble1;
          com.baidu.location.b.l.p = paramDouble2;
          com.baidu.location.e.i.a().a(str);
          i1 = i2;
        }
      }
    }
  }
  
  private void a(String paramString, Location paramLocation)
  {
    if (paramLocation == null) {}
    boolean bool;
    do
    {
      return;
      paramString = paramString + f.a().c();
      bool = i.a().d();
      com.baidu.location.e.a.a(new n(e.a().f()));
      com.baidu.location.e.a.a(System.currentTimeMillis());
      com.baidu.location.e.a.a(new Location(paramLocation));
      com.baidu.location.e.a.a(paramString);
    } while (bool);
    y.a(com.baidu.location.e.a.c(), null, com.baidu.location.e.a.d(), paramString);
  }
  
  public static boolean a(Location paramLocation1, Location paramLocation2, boolean paramBoolean)
  {
    boolean bool2 = true;
    boolean bool1;
    if (paramLocation1 == paramLocation2) {
      bool1 = false;
    }
    float f2;
    do
    {
      do
      {
        float f1;
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
              } while (paramLocation1 == null);
              bool1 = bool2;
            } while (paramLocation2 == null);
            f1 = paramLocation2.getSpeed();
            if ((!paramBoolean) || ((com.baidu.location.b.l.s != 3) && (g.a().a(paramLocation2.getLongitude(), paramLocation2.getLatitude())))) {
              break;
            }
            bool1 = bool2;
          } while (f1 < 5.0F);
          f2 = paramLocation2.distanceTo(paramLocation1);
          if (f1 <= com.baidu.location.b.l.I) {
            break;
          }
          bool1 = bool2;
        } while (f2 > com.baidu.location.b.l.K);
        return false;
        if (f1 <= com.baidu.location.b.l.H) {
          break;
        }
        bool1 = bool2;
      } while (f2 > com.baidu.location.b.l.J);
      return false;
      bool1 = bool2;
    } while (f2 > 5.0F);
    return false;
  }
  
  private double[] a(double paramDouble1, double paramDouble2)
  {
    return new double[] { Math.sin(Math.toRadians(paramDouble2)) * paramDouble1, Math.cos(Math.toRadians(paramDouble2)) * paramDouble1 };
  }
  
  private double[] a(List paramList)
  {
    if ((paramList == null) || (paramList.isEmpty())) {
      return null;
    }
    double[] arrayOfDouble = new double[2];
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (GpsSatellite)localIterator.next();
      if (localObject != null)
      {
        localObject = a(90.0F - ((GpsSatellite)localObject).getElevation(), ((GpsSatellite)localObject).getAzimuth());
        arrayOfDouble[0] += localObject[0];
        arrayOfDouble[1] += localObject[1];
      }
    }
    int i1 = paramList.size();
    arrayOfDouble[0] /= i1;
    arrayOfDouble[1] /= i1;
    return arrayOfDouble;
  }
  
  public static String b(Location paramLocation)
  {
    String str = a(paramLocation);
    paramLocation = str;
    if (str != null) {
      paramLocation = str + "&g_tp=0";
    }
    return paramLocation;
  }
  
  private void b(boolean paramBoolean)
  {
    this.p = paramBoolean;
    if ((paramBoolean) && (!j())) {}
  }
  
  private double[] b(double paramDouble1, double paramDouble2)
  {
    double d1 = 0.0D;
    if (paramDouble2 == 0.0D) {
      if (paramDouble1 > 0.0D) {
        d1 = 90.0D;
      }
    }
    for (;;)
    {
      return new double[] { Math.sqrt(paramDouble1 * paramDouble1 + paramDouble2 * paramDouble2), d1 };
      if (paramDouble1 < 0.0D)
      {
        d1 = 270.0D;
        continue;
        d1 = Math.toDegrees(Math.atan(paramDouble1 / paramDouble2));
      }
    }
  }
  
  public static String c(Location paramLocation)
  {
    String str = a(paramLocation);
    paramLocation = str;
    if (str != null) {
      paramLocation = str + r;
    }
    return paramLocation;
  }
  
  private void d(Location paramLocation)
  {
    paramLocation = this.s.obtainMessage(1, paramLocation);
    this.s.sendMessage(paramLocation);
  }
  
  private void e(Location paramLocation)
  {
    int i2;
    int i1;
    if (paramLocation != null)
    {
      i2 = k;
      i1 = i2;
      if (i2 != 0) {}
    }
    try
    {
      i1 = paramLocation.getExtras().getInt("satellites");
      if ((i1 == 0) && (!com.baidu.location.b.l.k)) {}
      for (;;)
      {
        return;
        this.f = null;
        return;
        this.f = paramLocation;
        if (this.f == null) {
          this.o = null;
        }
        try
        {
          com.baidu.location.e.s.a().a(this.f);
          if (this.f != null) {
            com.baidu.location.e.l.a().a(this.f);
          }
          if ((!j()) || (this.f == null)) {
            continue;
          }
          f.a().a(g());
          if ((k <= 2) || (!y.a(this.f, true))) {
            continue;
          }
          boolean bool = i.a().d();
          com.baidu.location.e.a.a(new n(e.a().f()));
          com.baidu.location.e.a.a(System.currentTimeMillis());
          com.baidu.location.e.a.a(new Location(this.f));
          com.baidu.location.e.a.a(f.a().c());
          if (bool) {
            continue;
          }
          y.a(com.baidu.location.e.a.c(), null, com.baidu.location.e.a.d(), f.a().c());
          return;
          l1 = System.currentTimeMillis();
          this.f.setTime(l1);
          f1 = (float)(this.f.getSpeed() * 3.6D);
          if (!this.f.hasSpeed()) {
            f1 = -1.0F;
          }
          i2 = k;
          i1 = i2;
          if (i2 != 0) {}
        }
        catch (Exception paramLocation)
        {
          try
          {
            for (;;)
            {
              long l1;
              float f1;
              i1 = this.f.getExtras().getInt("satellites");
              this.o = String.format(Locale.CHINA, "&ll=%.5f|%.5f&s=%.1f&d=%.1f&ll_n=%d&ll_t=%d", new Object[] { Double.valueOf(this.f.getLongitude()), Double.valueOf(this.f.getLatitude()), Float.valueOf(f1), Float.valueOf(this.f.getBearing()), Integer.valueOf(i1), Long.valueOf(l1) });
              a(this.f.getLongitude(), this.f.getLatitude(), f1);
            }
            paramLocation = paramLocation;
          }
          catch (Exception paramLocation)
          {
            for (;;)
            {
              i1 = i2;
            }
          }
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        i1 = i2;
      }
    }
  }
  
  public void a(boolean paramBoolean)
  {
    if (paramBoolean)
    {
      c();
      return;
    }
    d();
  }
  
  /* Error */
  public void b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: getstatic 582	com/baidu/location/f:f	Z
    //   5: istore_2
    //   6: iload_2
    //   7: ifne +6 -> 13
    //   10: aload_0
    //   11: monitorexit
    //   12: return
    //   13: aload_0
    //   14: invokestatic 585	com/baidu/location/f:b	()Landroid/content/Context;
    //   17: putfield 587	com/baidu/location/h/a:d	Landroid/content/Context;
    //   20: aload_0
    //   21: aload_0
    //   22: getfield 587	com/baidu/location/h/a:d	Landroid/content/Context;
    //   25: ldc_w 589
    //   28: invokevirtual 595	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   31: checkcast 597	android/location/LocationManager
    //   34: putfield 66	com/baidu/location/h/a:e	Landroid/location/LocationManager;
    //   37: aload_0
    //   38: new 599	com/baidu/location/h/b
    //   41: dup
    //   42: aload_0
    //   43: aconst_null
    //   44: invokespecial 602	com/baidu/location/h/b:<init>	(Lcom/baidu/location/h/a;Lcom/baidu/location/h/o;)V
    //   47: putfield 72	com/baidu/location/h/a:j	Lcom/baidu/location/h/b;
    //   50: aload_0
    //   51: getfield 66	com/baidu/location/h/a:e	Landroid/location/LocationManager;
    //   54: aload_0
    //   55: getfield 72	com/baidu/location/h/a:j	Lcom/baidu/location/h/b;
    //   58: invokevirtual 606	android/location/LocationManager:addGpsStatusListener	(Landroid/location/GpsStatus$Listener;)Z
    //   61: pop
    //   62: aload_0
    //   63: new 608	com/baidu/location/h/d
    //   66: dup
    //   67: aload_0
    //   68: aconst_null
    //   69: invokespecial 609	com/baidu/location/h/d:<init>	(Lcom/baidu/location/h/a;Lcom/baidu/location/h/o;)V
    //   72: putfield 70	com/baidu/location/h/a:h	Lcom/baidu/location/h/d;
    //   75: aload_0
    //   76: getfield 66	com/baidu/location/h/a:e	Landroid/location/LocationManager;
    //   79: ldc_w 611
    //   82: ldc2_w 61
    //   85: fconst_0
    //   86: aload_0
    //   87: getfield 70	com/baidu/location/h/a:h	Lcom/baidu/location/h/d;
    //   90: invokevirtual 615	android/location/LocationManager:requestLocationUpdates	(Ljava/lang/String;JFLandroid/location/LocationListener;)V
    //   93: aload_0
    //   94: new 617	com/baidu/location/h/o
    //   97: dup
    //   98: aload_0
    //   99: invokespecial 620	com/baidu/location/h/o:<init>	(Lcom/baidu/location/h/a;)V
    //   102: putfield 86	com/baidu/location/h/a:s	Landroid/os/Handler;
    //   105: goto -95 -> 10
    //   108: astore_1
    //   109: aload_0
    //   110: monitorexit
    //   111: aload_1
    //   112: athrow
    //   113: astore_1
    //   114: goto -21 -> 93
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	117	0	this	a
    //   108	4	1	localObject	Object
    //   113	1	1	localException	Exception
    //   5	2	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	6	108	finally
    //   13	20	108	finally
    //   20	93	108	finally
    //   93	105	108	finally
    //   20	93	113	java/lang/Exception
  }
  
  public void c()
  {
    b();
    if (this.n) {
      return;
    }
    try
    {
      this.g = new c(this, null);
      this.e.requestLocationUpdates("gps", 1000L, 0.0F, this.g);
      this.e.addNmeaListener(this.j);
      this.n = true;
      return;
    }
    catch (Exception localException) {}
  }
  
  public void d()
  {
    if (!this.n) {
      return;
    }
    if (this.e != null) {}
    try
    {
      if (this.g != null) {
        this.e.removeUpdates(this.g);
      }
      if (this.j != null) {
        this.e.removeNmeaListener(this.j);
      }
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
    com.baidu.location.b.l.d = 0;
    com.baidu.location.b.l.s = 0;
    this.g = null;
    this.n = false;
    b(false);
  }
  
  public void e()
  {
    for (;;)
    {
      try
      {
        d();
        LocationManager localLocationManager = this.e;
        if (localLocationManager == null) {
          return;
        }
      }
      finally {}
      try
      {
        if (this.j != null) {
          this.e.removeGpsStatusListener(this.j);
        }
        this.e.removeUpdates(this.h);
      }
      catch (Exception localException)
      {
        continue;
      }
      this.j = null;
      this.e = null;
    }
  }
  
  public String f()
  {
    if ((j()) && (this.f != null)) {
      return a(this.f);
    }
    return null;
  }
  
  public String g()
  {
    Object localObject = null;
    String str;
    float f1;
    int i2;
    int i1;
    if (this.f != null)
    {
      str = "{\"result\":{\"time\":\"" + com.baidu.location.b.l.a() + "\",\"error\":\"61\"},\"content\":{\"point\":{\"x\":" + "\"%f\",\"y\":\"%f\"},\"radius\":\"%d\",\"d\":\"%f\"," + "\"s\":\"%f\",\"n\":\"%d\"";
      if (!this.f.hasAccuracy()) {
        break label334;
      }
      f1 = this.f.getAccuracy();
      i2 = (int)f1;
      f1 = (float)(this.f.getSpeed() * 3.6D);
      if (!this.f.hasSpeed()) {
        f1 = -1.0F;
      }
      if (!g.a().a(this.f.getLongitude(), this.f.getLatitude())) {
        break label340;
      }
      localObject = Jni.a(this.f.getLongitude(), this.f.getLatitude(), "gps2gcj");
      if ((localObject[0] > 0.0D) || (localObject[1] > 0.0D)) {
        break label391;
      }
      localObject[0] = this.f.getLongitude();
      localObject[1] = this.f.getLatitude();
      i1 = 1;
    }
    for (;;)
    {
      str = String.format(Locale.CHINA, str, new Object[] { Double.valueOf(localObject[0]), Double.valueOf(localObject[1]), Integer.valueOf(i2), Float.valueOf(this.f.getBearing()), Float.valueOf(f1), Integer.valueOf(k) });
      localObject = str;
      if (i1 == 0) {
        localObject = str + ",\"in_cn\":\"0\"";
      }
      if (this.f.hasAltitude())
      {
        localObject = (String)localObject + String.format(Locale.CHINA, ",\"h\":%.2f}}", new Object[] { Double.valueOf(this.f.getAltitude()) });
        return (String)localObject;
        label334:
        f1 = 10.0F;
        break;
        label340:
        localObject = new double[] { this.f.getLongitude(), this.f.getLatitude() };
        i1 = 0;
        continue;
      }
      return (String)localObject + "}}";
      label391:
      i1 = 1;
    }
  }
  
  public Location h()
  {
    return this.f;
  }
  
  public boolean i()
  {
    return (this.f != null) && (this.f.getLatitude() != 0.0D) && (this.f.getLongitude() != 0.0D);
  }
  
  public boolean j()
  {
    if (!i()) {}
    while (System.currentTimeMillis() - this.q > 10000L) {
      return false;
    }
    long l1 = System.currentTimeMillis();
    if ((this.m) && (l1 - this.l < 3000L)) {
      return true;
    }
    return this.p;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\h\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */