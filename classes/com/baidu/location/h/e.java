package com.baidu.location.h;

import android.content.Context;
import android.os.Build.VERSION;
import android.os.SystemClock;
import android.telephony.CellIdentityCdma;
import android.telephony.CellIdentityGsm;
import android.telephony.CellIdentityLte;
import android.telephony.CellIdentityWcdma;
import android.telephony.CellInfo;
import android.telephony.CellInfoCdma;
import android.telephony.CellInfoGsm;
import android.telephony.CellInfoLte;
import android.telephony.CellInfoWcdma;
import android.telephony.CellLocation;
import android.telephony.CellSignalStrengthCdma;
import android.telephony.CellSignalStrengthGsm;
import android.telephony.CellSignalStrengthLte;
import android.telephony.CellSignalStrengthWcdma;
import android.telephony.NeighboringCellInfo;
import android.telephony.TelephonyManager;
import android.telephony.cdma.CdmaCellLocation;
import android.telephony.gsm.GsmCellLocation;
import com.baidu.location.b.l;
import java.io.File;
import java.io.RandomAccessFile;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Locale;

public class e
  extends p
{
  public static int a = 0;
  public static int b = 0;
  private static e c = null;
  private static Method j = null;
  private static Method k = null;
  private static Method l = null;
  private static Method m = null;
  private static Method n = null;
  private static Class o = null;
  private TelephonyManager d = null;
  private n e = new n();
  private n f = null;
  private List g = null;
  private f h = null;
  private boolean i = false;
  private boolean p = false;
  
  private int a(int paramInt)
  {
    int i1 = paramInt;
    if (paramInt == Integer.MAX_VALUE) {
      i1 = -1;
    }
    return i1;
  }
  
  public static e a()
  {
    if (c == null) {
      c = new e();
    }
    return c;
  }
  
  private n a(CellInfo paramCellInfo)
  {
    int i2 = Integer.valueOf(Build.VERSION.SDK_INT).intValue();
    if (i2 < 17) {
      return null;
    }
    n localn = new n();
    int i1 = 0;
    Object localObject;
    if ((paramCellInfo instanceof CellInfoGsm))
    {
      localObject = ((CellInfoGsm)paramCellInfo).getCellIdentity();
      localn.c = a(((CellIdentityGsm)localObject).getMcc());
      localn.d = a(((CellIdentityGsm)localObject).getMnc());
      localn.a = a(((CellIdentityGsm)localObject).getLac());
      localn.b = a(((CellIdentityGsm)localObject).getCid());
      localn.i = 'g';
      localn.h = ((CellInfoGsm)paramCellInfo).getCellSignalStrength().getAsuLevel();
      i1 = 1;
    }
    for (;;)
    {
      if ((i2 >= 18) && (i1 == 0)) {}
      try
      {
        if ((paramCellInfo instanceof CellInfoWcdma))
        {
          localObject = ((CellInfoWcdma)paramCellInfo).getCellIdentity();
          localn.c = a(((CellIdentityWcdma)localObject).getMcc());
          localn.d = a(((CellIdentityWcdma)localObject).getMnc());
          localn.a = a(((CellIdentityWcdma)localObject).getLac());
          localn.b = a(((CellIdentityWcdma)localObject).getCid());
          localn.i = 'g';
          localn.h = ((CellInfoWcdma)paramCellInfo).getCellSignalStrength().getAsuLevel();
        }
        try
        {
          long l1 = (SystemClock.elapsedRealtimeNanos() - paramCellInfo.getTimeStamp()) / 1000000L;
          localn.g = (System.currentTimeMillis() - l1);
          return localn;
          if ((paramCellInfo instanceof CellInfoCdma))
          {
            localObject = ((CellInfoCdma)paramCellInfo).getCellIdentity();
            localn.e = ((CellIdentityCdma)localObject).getLatitude();
            localn.f = ((CellIdentityCdma)localObject).getLongitude();
            localn.d = a(((CellIdentityCdma)localObject).getSystemId());
            localn.a = a(((CellIdentityCdma)localObject).getNetworkId());
            localn.b = a(((CellIdentityCdma)localObject).getBasestationId());
            localn.i = 'c';
            localn.h = ((CellInfoCdma)paramCellInfo).getCellSignalStrength().getCdmaDbm();
            i1 = 1;
            continue;
          }
          if (!(paramCellInfo instanceof CellInfoLte)) {
            continue;
          }
          localObject = ((CellInfoLte)paramCellInfo).getCellIdentity();
          localn.c = a(((CellIdentityLte)localObject).getMcc());
          localn.d = a(((CellIdentityLte)localObject).getMnc());
          localn.a = a(((CellIdentityLte)localObject).getTac());
          localn.b = a(((CellIdentityLte)localObject).getCi());
          localn.i = 'g';
          localn.h = ((CellInfoLte)paramCellInfo).getCellSignalStrength().getAsuLevel();
          i1 = 1;
        }
        catch (Error paramCellInfo)
        {
          for (;;)
          {
            localn.g = System.currentTimeMillis();
          }
        }
      }
      catch (Exception localException)
      {
        for (;;) {}
      }
    }
  }
  
  private n a(CellLocation paramCellLocation)
  {
    i2 = 0;
    int i3 = 0;
    if ((paramCellLocation == null) || (this.d == null)) {
      return null;
    }
    localn = new n();
    localn.g = System.currentTimeMillis();
    for (;;)
    {
      try
      {
        String str = this.d.getNetworkOperator();
        if ((str != null) && (str.length() > 0))
        {
          if (str.length() >= 3)
          {
            int i4 = Integer.valueOf(str.substring(0, 3)).intValue();
            i1 = i4;
            if (i4 < 0) {
              i1 = this.e.c;
            }
            localn.c = i1;
          }
          str = str.substring(3);
          if (str != null)
          {
            char[] arrayOfChar = str.toCharArray();
            i1 = i3;
            i2 = i1;
            if (i1 < arrayOfChar.length)
            {
              if (Character.isDigit(arrayOfChar[i1])) {
                continue;
              }
              i2 = i1;
            }
          }
          i2 = Integer.valueOf(str.substring(0, i2)).intValue();
          i1 = i2;
          if (i2 < 0) {
            i1 = this.e.d;
          }
          localn.d = i1;
        }
        a = this.d.getSimState();
      }
      catch (Exception localException)
      {
        int i1;
        b = 1;
        continue;
        if (!(paramCellLocation instanceof CdmaCellLocation)) {
          continue;
        }
        localn.i = 'c';
        if (Integer.valueOf(Build.VERSION.SDK_INT).intValue() >= 5) {
          continue;
        }
        return localn;
        if (o != null) {
          continue;
        }
        try
        {
          o = Class.forName("android.telephony.cdma.CdmaCellLocation");
          j = o.getMethod("getBaseStationId", new Class[0]);
          k = o.getMethod("getNetworkId", new Class[0]);
          l = o.getMethod("getSystemId", new Class[0]);
          m = o.getMethod("getBaseStationLatitude", new Class[0]);
          n = o.getMethod("getBaseStationLongitude", new Class[0]);
          if ((o == null) || (!o.isInstance(paramCellLocation))) {
            continue;
          }
          try
          {
            i2 = ((Integer)l.invoke(paramCellLocation, new Object[0])).intValue();
            i1 = i2;
            if (i2 < 0) {
              i1 = this.e.d;
            }
            localn.d = i1;
            localn.b = ((Integer)j.invoke(paramCellLocation, new Object[0])).intValue();
            localn.a = ((Integer)k.invoke(paramCellLocation, new Object[0])).intValue();
            Object localObject = m.invoke(paramCellLocation, new Object[0]);
            if (((Integer)localObject).intValue() < Integer.MAX_VALUE) {
              localn.e = ((Integer)localObject).intValue();
            }
            paramCellLocation = n.invoke(paramCellLocation, new Object[0]);
            if (((Integer)paramCellLocation).intValue() >= Integer.MAX_VALUE) {
              continue;
            }
            localn.f = ((Integer)paramCellLocation).intValue();
          }
          catch (Exception paramCellLocation)
          {
            b = 3;
            return localn;
          }
          return localn;
        }
        catch (Exception paramCellLocation)
        {
          o = null;
          b = 2;
        }
      }
      if (!(paramCellLocation instanceof GsmCellLocation)) {
        continue;
      }
      localn.a = ((GsmCellLocation)paramCellLocation).getLac();
      localn.b = ((GsmCellLocation)paramCellLocation).getCid();
      localn.i = 'g';
      c(localn);
      return localn;
      i1 += 1;
    }
  }
  
  private void c(n paramn)
  {
    if ((paramn.c()) && ((this.e == null) || (!this.e.a(paramn))))
    {
      this.e = paramn;
      if (!paramn.c()) {
        break label152;
      }
      i1 = this.g.size();
      if (i1 != 0) {
        break label133;
      }
      paramn = null;
      if ((paramn == null) || (paramn.b != this.e.b) || (paramn.a != this.e.a))
      {
        this.g.add(this.e);
        if (this.g.size() > 3) {
          this.g.remove(0);
        }
        i();
        this.p = false;
      }
    }
    label133:
    label152:
    while (this.g == null) {
      for (;;)
      {
        int i1;
        return;
        paramn = (n)this.g.get(i1 - 1);
      }
    }
    this.g.clear();
  }
  
  private String d(n paramn)
  {
    localStringBuilder = new StringBuilder();
    if (Integer.valueOf(Build.VERSION.SDK_INT).intValue() >= 17) {
      for (;;)
      {
        try
        {
          localObject1 = this.d.getAllCellInfo();
          if ((localObject1 == null) || (((List)localObject1).size() <= 0)) {
            continue;
          }
          localStringBuilder.append("&nc=");
          localObject1 = ((List)localObject1).iterator();
        }
        catch (Exception paramn)
        {
          Object localObject1;
          Object localObject2;
          return localStringBuilder.toString();
          localStringBuilder.append("|" + ((n)localObject2).b + "|" + ((n)localObject2).h + ";");
          continue;
        }
        catch (NoSuchMethodError paramn)
        {
          continue;
        }
        if (!((Iterator)localObject1).hasNext()) {
          continue;
        }
        localObject2 = (CellInfo)((Iterator)localObject1).next();
        if (!((CellInfo)localObject2).isRegistered())
        {
          localObject2 = a((CellInfo)localObject2);
          if ((localObject2 != null) && (((n)localObject2).a != -1) && (((n)localObject2).b != -1))
          {
            if (paramn.a == ((n)localObject2).a) {
              continue;
            }
            localStringBuilder.append(((n)localObject2).a + "|" + ((n)localObject2).b + "|" + ((n)localObject2).h + ";");
          }
        }
      }
    }
  }
  
  private void h()
  {
    Object localObject = l.f();
    if (localObject == null) {}
    do
    {
      return;
      localObject = new File((String)localObject + File.separator + "lcvif.dat");
    } while (!((File)localObject).exists());
    long l1;
    try
    {
      RandomAccessFile localRandomAccessFile = new RandomAccessFile((File)localObject, "rw");
      localRandomAccessFile.seek(0L);
      l1 = localRandomAccessFile.readLong();
      if (System.currentTimeMillis() - l1 > 60000L)
      {
        localRandomAccessFile.close();
        ((File)localObject).delete();
        return;
      }
    }
    catch (Exception localException)
    {
      ((File)localObject).delete();
      return;
    }
    localException.readInt();
    int i1 = 0;
    for (;;)
    {
      int i2;
      int i3;
      int i4;
      int i5;
      int i6;
      char c1;
      if (i1 < 3)
      {
        l1 = localException.readLong();
        i2 = localException.readInt();
        i3 = localException.readInt();
        i4 = localException.readInt();
        i5 = localException.readInt();
        i6 = localException.readInt();
        c1 = '\000';
        if (i6 != 1) {
          break label226;
        }
        c1 = 'g';
      }
      label226:
      do
      {
        n localn = new n(i4, i5, i2, i3, 0, c1);
        localn.g = l1;
        if (!localn.c()) {
          break;
        }
        this.p = true;
        this.g.add(localn);
        break;
        localException.close();
        return;
        if (i6 == 2) {
          c1 = 'c';
        }
      } while (l1 != 0L);
      i1 += 1;
    }
  }
  
  private void i()
  {
    int i3 = 0;
    if ((this.g == null) && (this.f == null)) {}
    do
    {
      return;
      if ((this.g == null) && (this.f != null))
      {
        this.g = new LinkedList();
        this.g.add(this.f);
      }
      localObject = l.f();
    } while (localObject == null);
    Object localObject = new File((String)localObject + File.separator + "lcvif.dat");
    int i4 = this.g.size();
    try
    {
      if (((File)localObject).exists()) {
        ((File)localObject).delete();
      }
      ((File)localObject).createNewFile();
      localObject = new RandomAccessFile((File)localObject, "rw");
      ((RandomAccessFile)localObject).seek(0L);
      ((RandomAccessFile)localObject).writeLong(((n)this.g.get(i4 - 1)).g);
      ((RandomAccessFile)localObject).writeInt(i4);
      int i1 = 0;
      int i2;
      for (;;)
      {
        i2 = i3;
        if (i1 >= 3 - i4) {
          break;
        }
        ((RandomAccessFile)localObject).writeLong(0L);
        ((RandomAccessFile)localObject).writeInt(-1);
        ((RandomAccessFile)localObject).writeInt(-1);
        ((RandomAccessFile)localObject).writeInt(-1);
        ((RandomAccessFile)localObject).writeInt(-1);
        ((RandomAccessFile)localObject).writeInt(2);
        i1 += 1;
      }
      for (;;)
      {
        if (i2 < i4)
        {
          ((RandomAccessFile)localObject).writeLong(((n)this.g.get(i2)).g);
          ((RandomAccessFile)localObject).writeInt(((n)this.g.get(i2)).c);
          ((RandomAccessFile)localObject).writeInt(((n)this.g.get(i2)).d);
          ((RandomAccessFile)localObject).writeInt(((n)this.g.get(i2)).a);
          ((RandomAccessFile)localObject).writeInt(((n)this.g.get(i2)).b);
          if (((n)this.g.get(i2)).i == 'g') {
            ((RandomAccessFile)localObject).writeInt(1);
          } else if (((n)this.g.get(i2)).i == 'c') {
            ((RandomAccessFile)localObject).writeInt(2);
          } else {
            ((RandomAccessFile)localObject).writeInt(3);
          }
        }
        else
        {
          ((RandomAccessFile)localObject).close();
          return;
        }
        i2 += 1;
      }
      return;
    }
    catch (Exception localException) {}
  }
  
  private void j()
  {
    n localn = k();
    if (localn != null) {
      c(localn);
    }
    if ((localn == null) || (!localn.c())) {
      a(this.d.getCellLocation());
    }
  }
  
  /* Error */
  private n k()
  {
    // Byte code:
    //   0: getstatic 84	android/os/Build$VERSION:SDK_INT	I
    //   3: invokestatic 90	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   6: invokevirtual 94	java/lang/Integer:intValue	()I
    //   9: bipush 17
    //   11: if_icmpge +5 -> 16
    //   14: aconst_null
    //   15: areturn
    //   16: aload_0
    //   17: getfield 55	com/baidu/location/h/e:d	Landroid/telephony/TelephonyManager;
    //   20: invokevirtual 345	android/telephony/TelephonyManager:getAllCellInfo	()Ljava/util/List;
    //   23: astore_1
    //   24: aload_1
    //   25: ifnull -11 -> 14
    //   28: aload_1
    //   29: invokeinterface 320 1 0
    //   34: ifle -20 -> 14
    //   37: aload_1
    //   38: invokeinterface 355 1 0
    //   43: astore_3
    //   44: aconst_null
    //   45: astore_1
    //   46: aload_3
    //   47: invokeinterface 360 1 0
    //   52: ifeq +66 -> 118
    //   55: aload_3
    //   56: invokeinterface 364 1 0
    //   61: checkcast 161	android/telephony/CellInfo
    //   64: astore_2
    //   65: aload_2
    //   66: invokevirtual 367	android/telephony/CellInfo:isRegistered	()Z
    //   69: ifeq -23 -> 46
    //   72: aload_0
    //   73: aload_2
    //   74: invokespecial 369	com/baidu/location/h/e:a	(Landroid/telephony/CellInfo;)Lcom/baidu/location/h/n;
    //   77: astore_2
    //   78: aload_2
    //   79: astore_1
    //   80: aload_1
    //   81: ifnonnull +6 -> 87
    //   84: goto -38 -> 46
    //   87: aload_1
    //   88: invokevirtual 312	com/baidu/location/h/n:c	()Z
    //   91: ifne +8 -> 99
    //   94: aconst_null
    //   95: astore_1
    //   96: goto +24 -> 120
    //   99: aload_1
    //   100: invokevirtual 449	com/baidu/location/h/n:g	()V
    //   103: goto +17 -> 120
    //   106: astore_2
    //   107: aload_1
    //   108: areturn
    //   109: astore_1
    //   110: aconst_null
    //   111: areturn
    //   112: astore_1
    //   113: aconst_null
    //   114: areturn
    //   115: astore_2
    //   116: aload_1
    //   117: areturn
    //   118: aload_1
    //   119: areturn
    //   120: aload_1
    //   121: areturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	122	0	this	e
    //   23	85	1	localObject1	Object
    //   109	1	1	localNoSuchMethodError	NoSuchMethodError
    //   112	9	1	localException1	Exception
    //   64	15	2	localObject2	Object
    //   106	1	2	localException2	Exception
    //   115	1	2	localException3	Exception
    //   43	13	3	localIterator	Iterator
    // Exception table:
    //   from	to	target	type
    //   87	94	106	java/lang/Exception
    //   99	103	106	java/lang/Exception
    //   16	24	109	java/lang/NoSuchMethodError
    //   28	44	109	java/lang/NoSuchMethodError
    //   46	78	109	java/lang/NoSuchMethodError
    //   87	94	109	java/lang/NoSuchMethodError
    //   99	103	109	java/lang/NoSuchMethodError
    //   16	24	112	java/lang/Exception
    //   28	44	112	java/lang/Exception
    //   46	78	115	java/lang/Exception
  }
  
  public String a(n paramn)
  {
    Object localObject1;
    for (;;)
    {
      try
      {
        Object localObject2 = d(paramn);
        if ((localObject2 != null) && (!((String)localObject2).equals("")) && (!((String)localObject2).equals("&nc="))) {
          return (String)localObject2;
        }
        localObject3 = this.d.getNeighboringCellInfo();
        localObject1 = localObject2;
        if (localObject3 == null) {
          continue;
        }
        localObject1 = localObject2;
        if (((List)localObject3).isEmpty()) {
          continue;
        }
        localObject1 = "&nc=";
        localObject2 = ((List)localObject3).iterator();
        i1 = 0;
        if (!((Iterator)localObject2).hasNext()) {
          continue;
        }
        localObject3 = (NeighboringCellInfo)((Iterator)localObject2).next();
        int i2 = ((NeighboringCellInfo)localObject3).getLac();
        if ((i2 == -1) || (((NeighboringCellInfo)localObject3).getCid() == -1)) {
          continue;
        }
        if (paramn.a == i2) {
          continue;
        }
        localObject1 = (String)localObject1 + i2 + "|" + ((NeighboringCellInfo)localObject3).getCid() + "|" + ((NeighboringCellInfo)localObject3).getRssi() + ";";
      }
      catch (Exception paramn)
      {
        Object localObject3;
        int i1;
        paramn.printStackTrace();
        localObject1 = "";
        continue;
        continue;
        continue;
      }
      i1 += 1;
      if (i1 >= 8)
      {
        if ((localObject1 == null) || (!((String)localObject1).equals("&nc="))) {
          return localObject1;
        }
        return null;
        localObject1 = (String)localObject1 + "|" + ((NeighboringCellInfo)localObject3).getCid() + "|" + ((NeighboringCellInfo)localObject3).getRssi() + ";";
      }
    }
    return (String)localObject1;
  }
  
  public String b(n paramn)
  {
    StringBuffer localStringBuffer = new StringBuffer(128);
    localStringBuffer.append("&nw=");
    localStringBuffer.append(paramn.i);
    localStringBuffer.append(String.format(Locale.CHINA, "&cl=%d|%d|%d|%d&cl_s=%d", new Object[] { Integer.valueOf(paramn.c), Integer.valueOf(paramn.d), Integer.valueOf(paramn.a), Integer.valueOf(paramn.b), Integer.valueOf(paramn.h) }));
    if ((paramn.e < Integer.MAX_VALUE) && (paramn.f < Integer.MAX_VALUE)) {
      localStringBuffer.append(String.format(Locale.CHINA, "&cdmall=%.6f|%.6f", new Object[] { Double.valueOf(paramn.f / 14400.0D), Double.valueOf(paramn.e / 14400.0D) }));
    }
    localStringBuffer.append("&cl_t=");
    localStringBuffer.append(paramn.g);
    if ((this.g != null) && (this.g.size() > 0))
    {
      i2 = this.g.size();
      localStringBuffer.append("&clt=");
      i1 = 0;
      while (i1 < i2)
      {
        n localn = (n)this.g.get(i1);
        if (localn.c != paramn.c) {
          localStringBuffer.append(localn.c);
        }
        localStringBuffer.append("|");
        if (localn.d != paramn.d) {
          localStringBuffer.append(localn.d);
        }
        localStringBuffer.append("|");
        if (localn.a != paramn.a) {
          localStringBuffer.append(localn.a);
        }
        localStringBuffer.append("|");
        if (localn.b != paramn.b) {
          localStringBuffer.append(localn.b);
        }
        localStringBuffer.append("|");
        localStringBuffer.append((System.currentTimeMillis() - localn.g) / 1000L);
        localStringBuffer.append(";");
        i1 += 1;
      }
    }
    if (a > 100) {
      a = 0;
    }
    int i1 = b;
    int i2 = a;
    localStringBuffer.append("&cs=" + ((i1 << 8) + i2));
    return localStringBuffer.toString();
  }
  
  /* Error */
  public void b()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 68	com/baidu/location/h/e:i	Z
    //   6: istore_2
    //   7: iload_2
    //   8: iconst_1
    //   9: if_icmpne +6 -> 15
    //   12: aload_0
    //   13: monitorexit
    //   14: return
    //   15: getstatic 524	com/baidu/location/f:f	Z
    //   18: ifeq -6 -> 12
    //   21: aload_0
    //   22: invokestatic 527	com/baidu/location/f:b	()Landroid/content/Context;
    //   25: ldc_w 529
    //   28: invokevirtual 535	android/content/Context:getSystemService	(Ljava/lang/String;)Ljava/lang/Object;
    //   31: checkcast 232	android/telephony/TelephonyManager
    //   34: putfield 55	com/baidu/location/h/e:d	Landroid/telephony/TelephonyManager;
    //   37: aload_0
    //   38: new 427	java/util/LinkedList
    //   41: dup
    //   42: invokespecial 428	java/util/LinkedList:<init>	()V
    //   45: putfield 64	com/baidu/location/h/e:g	Ljava/util/List;
    //   48: aload_0
    //   49: new 537	com/baidu/location/h/f
    //   52: dup
    //   53: aload_0
    //   54: invokespecial 539	com/baidu/location/h/f:<init>	(Lcom/baidu/location/h/e;)V
    //   57: putfield 66	com/baidu/location/h/e:h	Lcom/baidu/location/h/f;
    //   60: aload_0
    //   61: invokespecial 541	com/baidu/location/h/e:h	()V
    //   64: aload_0
    //   65: getfield 55	com/baidu/location/h/e:d	Landroid/telephony/TelephonyManager;
    //   68: ifnull -56 -> 12
    //   71: aload_0
    //   72: getfield 66	com/baidu/location/h/e:h	Lcom/baidu/location/h/f;
    //   75: astore_1
    //   76: aload_1
    //   77: ifnull -65 -> 12
    //   80: aload_0
    //   81: getfield 55	com/baidu/location/h/e:d	Landroid/telephony/TelephonyManager;
    //   84: aload_0
    //   85: getfield 66	com/baidu/location/h/e:h	Lcom/baidu/location/h/f;
    //   88: sipush 272
    //   91: invokevirtual 545	android/telephony/TelephonyManager:listen	(Landroid/telephony/PhoneStateListener;I)V
    //   94: aload_0
    //   95: iconst_1
    //   96: putfield 68	com/baidu/location/h/e:i	Z
    //   99: goto -87 -> 12
    //   102: astore_1
    //   103: aload_0
    //   104: monitorexit
    //   105: aload_1
    //   106: athrow
    //   107: astore_1
    //   108: goto -14 -> 94
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	111	0	this	e
    //   75	2	1	localf	f
    //   102	4	1	localObject	Object
    //   107	1	1	localException	Exception
    //   6	4	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	7	102	finally
    //   15	76	102	finally
    //   80	94	102	finally
    //   94	99	102	finally
    //   80	94	107	java/lang/Exception
  }
  
  /* Error */
  public void c()
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 68	com/baidu/location/h/e:i	Z
    //   6: istore_2
    //   7: iload_2
    //   8: ifne +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: getfield 66	com/baidu/location/h/e:h	Lcom/baidu/location/h/f;
    //   18: ifnull +22 -> 40
    //   21: aload_0
    //   22: getfield 55	com/baidu/location/h/e:d	Landroid/telephony/TelephonyManager;
    //   25: ifnull +15 -> 40
    //   28: aload_0
    //   29: getfield 55	com/baidu/location/h/e:d	Landroid/telephony/TelephonyManager;
    //   32: aload_0
    //   33: getfield 66	com/baidu/location/h/e:h	Lcom/baidu/location/h/f;
    //   36: iconst_0
    //   37: invokevirtual 545	android/telephony/TelephonyManager:listen	(Landroid/telephony/PhoneStateListener;I)V
    //   40: aload_0
    //   41: aconst_null
    //   42: putfield 66	com/baidu/location/h/e:h	Lcom/baidu/location/h/f;
    //   45: aload_0
    //   46: aconst_null
    //   47: putfield 55	com/baidu/location/h/e:d	Landroid/telephony/TelephonyManager;
    //   50: aload_0
    //   51: getfield 64	com/baidu/location/h/e:g	Ljava/util/List;
    //   54: invokeinterface 335 1 0
    //   59: aload_0
    //   60: aconst_null
    //   61: putfield 64	com/baidu/location/h/e:g	Ljava/util/List;
    //   64: aload_0
    //   65: invokespecial 329	com/baidu/location/h/e:i	()V
    //   68: aload_0
    //   69: iconst_0
    //   70: putfield 68	com/baidu/location/h/e:i	Z
    //   73: goto -62 -> 11
    //   76: astore_1
    //   77: aload_0
    //   78: monitorexit
    //   79: aload_1
    //   80: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	81	0	this	e
    //   76	4	1	localObject	Object
    //   6	2	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	7	76	finally
    //   14	40	76	finally
    //   40	73	76	finally
  }
  
  public boolean d()
  {
    return this.p;
  }
  
  public int e()
  {
    if (this.d == null) {
      return 0;
    }
    try
    {
      int i1 = this.d.getNetworkType();
      return i1;
    }
    catch (Exception localException) {}
    return 0;
  }
  
  public n f()
  {
    if (((this.e == null) || (!this.e.b()) || (!this.e.c())) && (this.d != null)) {}
    try
    {
      j();
      if (this.e.f())
      {
        this.f = null;
        this.f = new n(this.e.a, this.e.b, this.e.c, this.e.d, this.e.h, this.e.i);
      }
      if ((this.e.e()) && (this.f != null) && (this.e.i == 'g'))
      {
        this.e.d = this.f.d;
        this.e.c = this.f.c;
      }
      return this.e;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public int g()
  {
    Object localObject1 = (TelephonyManager)com.baidu.location.f.b().getSystemService("phone");
    try
    {
      localObject1 = ((TelephonyManager)localObject1).getSubscriberId();
      if (localObject1 != null) {
        if ((((String)localObject1).startsWith("46000")) || (((String)localObject1).startsWith("46002")) || (((String)localObject1).startsWith("46007"))) {
          return 1;
        }
      }
    }
    catch (Exception localException)
    {
      Object localObject2;
      for (;;)
      {
        localObject2 = null;
      }
      if (((String)localObject2).startsWith("46001")) {
        return 2;
      }
      if (((String)localObject2).startsWith("46003")) {
        return 3;
      }
    }
    return 0;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\h\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */