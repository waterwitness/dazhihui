package com.baidu.location.e;

import android.location.Location;
import com.baidu.location.BDLocation;
import com.baidu.location.Jni;
import com.baidu.location.c.k;
import com.baidu.location.f;
import com.baidu.location.h.a;
import com.baidu.location.h.n;
import com.baidu.location.h.q;
import com.baidu.location.h.r;
import java.io.File;
import java.io.RandomAccessFile;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class y
{
  private static y A = null;
  private static ArrayList b = new ArrayList();
  private static ArrayList c = new ArrayList();
  private static ArrayList d = new ArrayList();
  private static String e = com.baidu.location.b.e.a + "/yo.dat";
  private static final String f = com.baidu.location.b.e.a + "/yoh.dat";
  private static final String g = com.baidu.location.b.e.a + "/yom.dat";
  private static final String h = com.baidu.location.b.e.a + "/yol.dat";
  private static final String i = com.baidu.location.b.e.a + "/yor.dat";
  private static File j = null;
  private static int k = 8;
  private static int l = 8;
  private static int m = 16;
  private static int n = 1024;
  private static double o = 0.0D;
  private static double p = 0.1D;
  private static double q = 30.0D;
  private static double r = 100.0D;
  private static int s = 0;
  private static int t = 64;
  private static int u = 128;
  private static Location v = null;
  private static Location w = null;
  private static Location x = null;
  private static com.baidu.location.h.l y = null;
  private int B = 0;
  long a = 0L;
  private z z = null;
  
  private static int a(List paramList, int paramInt)
  {
    if ((paramList == null) || (paramInt > 256) || (paramInt < 0)) {
      return -1;
    }
    for (;;)
    {
      int i2;
      int i1;
      try
      {
        if (j == null)
        {
          j = new File(e);
          if (!j.exists())
          {
            j = null;
            return -2;
          }
        }
        RandomAccessFile localRandomAccessFile = new RandomAccessFile(j, "rw");
        if (localRandomAccessFile.length() < 1L)
        {
          localRandomAccessFile.close();
          return -3;
        }
        localRandomAccessFile.seek(paramInt);
        int i3 = localRandomAccessFile.readInt();
        i2 = localRandomAccessFile.readInt();
        int i4 = localRandomAccessFile.readInt();
        int i5 = localRandomAccessFile.readInt();
        long l1 = localRandomAccessFile.readLong();
        if ((!a(i3, i2, i4, i5, l1)) || (i2 < 1))
        {
          localRandomAccessFile.close();
          return -4;
        }
        byte[] arrayOfByte = new byte[n];
        i1 = k;
        if ((i1 > 0) && (i2 > 0))
        {
          localRandomAccessFile.seek((i3 + i2 - 1) % i4 * i5 + l1);
          int i6 = localRandomAccessFile.readInt();
          if ((i6 > 0) && (i6 < i5))
          {
            localRandomAccessFile.read(arrayOfByte, 0, i6);
            if (arrayOfByte[(i6 - 1)] == 0) {
              paramList.add(new String(arrayOfByte, 0, i6 - 1));
            }
          }
        }
        else
        {
          localRandomAccessFile.seek(paramInt);
          localRandomAccessFile.writeInt(i3);
          localRandomAccessFile.writeInt(i2);
          localRandomAccessFile.writeInt(i4);
          localRandomAccessFile.writeInt(i5);
          localRandomAccessFile.writeLong(l1);
          localRandomAccessFile.close();
          paramInt = k;
          return paramInt - i1;
        }
      }
      catch (Exception paramList)
      {
        paramList.printStackTrace();
        return -5;
      }
      i1 -= 1;
      i2 -= 1;
    }
  }
  
  public static y a()
  {
    if (A == null) {
      A = new y();
    }
    return A;
  }
  
  public static String a(int paramInt)
  {
    Object localObject3 = null;
    Object localObject2;
    ArrayList localArrayList;
    if (paramInt == 1)
    {
      localObject2 = f;
      localArrayList = b;
    }
    while (localArrayList == null)
    {
      do
      {
        return null;
        if (paramInt == 2)
        {
          localObject2 = g;
          localArrayList = c;
          break;
        }
        if (paramInt == 3)
        {
          localObject2 = h;
          localArrayList = d;
          break;
        }
      } while (paramInt != 4);
      localObject2 = i;
      localArrayList = d;
    }
    if (localArrayList.size() < 1) {
      a((String)localObject2, localArrayList);
    }
    try
    {
      paramInt = localArrayList.size();
      localObject2 = localObject3;
      if (paramInt > 0)
      {
        localObject2 = (String)localArrayList.get(paramInt - 1);
        localArrayList.remove(paramInt - 1);
      }
      return (String)localObject2;
    }
    finally {}
  }
  
  public static void a(int paramInt, boolean paramBoolean)
  {
    Object localObject1;
    ArrayList localArrayList;
    label18:
    Object localObject2;
    if (paramInt == 1)
    {
      localObject1 = f;
      if (paramBoolean) {
        return;
      }
      localArrayList = b;
      localObject2 = new File((String)localObject1);
      if (!((File)localObject2).exists()) {
        a((String)localObject1);
      }
    }
    for (;;)
    {
      try
      {
        localObject1 = new RandomAccessFile((File)localObject2, "rw");
        ((RandomAccessFile)localObject1).seek(4L);
        int i6 = ((RandomAccessFile)localObject1).readInt();
        int i7 = ((RandomAccessFile)localObject1).readInt();
        i2 = ((RandomAccessFile)localObject1).readInt();
        i3 = ((RandomAccessFile)localObject1).readInt();
        i1 = ((RandomAccessFile)localObject1).readInt();
        i4 = localArrayList.size();
        if (i4 <= l) {
          break label460;
        }
        if (!paramBoolean) {
          break label457;
        }
        i1 += 1;
        if (i2 < i6)
        {
          ((RandomAccessFile)localObject1).seek(i7 * i2 + 128);
          localObject2 = ((String)localArrayList.get(0) + '\000').getBytes();
          ((RandomAccessFile)localObject1).writeInt(localObject2.length);
          ((RandomAccessFile)localObject1).write((byte[])localObject2, 0, localObject2.length);
          localArrayList.remove(0);
          i5 = i2 + 1;
          i2 = i3;
          i3 = i5;
          i5 = i4 - 1;
          i4 = i3;
          i3 = i2;
          i2 = i4;
          i4 = i5;
          continue;
          if (paramInt == 2)
          {
            localObject1 = g;
            if (paramBoolean)
            {
              localArrayList = b;
              break label18;
            }
            localArrayList = c;
            break label18;
          }
          if (paramInt == 3)
          {
            localObject1 = h;
            if (paramBoolean)
            {
              localArrayList = c;
              break label18;
            }
            localArrayList = d;
            break label18;
          }
          if (paramInt != 4) {
            break;
          }
          localObject1 = i;
          if (!paramBoolean) {
            break;
          }
          localArrayList = d;
          break label18;
        }
        if (!paramBoolean) {
          break label481;
        }
        long l1 = i3 * i7 + 128;
        ((RandomAccessFile)localObject1).seek(l1);
        localObject2 = ((String)localArrayList.get(0) + '\000').getBytes();
        ((RandomAccessFile)localObject1).writeInt(localObject2.length);
        ((RandomAccessFile)localObject1).write((byte[])localObject2, 0, localObject2.length);
        localArrayList.remove(0);
        i5 = i3 + 1;
        i3 = i5;
        if (i5 <= i2) {
          break label466;
        }
        i3 = 0;
      }
      catch (Exception localException)
      {
        int i1;
        return;
      }
      ((RandomAccessFile)localObject1).seek(12L);
      ((RandomAccessFile)localObject1).writeInt(i2);
      ((RandomAccessFile)localObject1).writeInt(i3);
      ((RandomAccessFile)localObject1).writeInt(i1);
      ((RandomAccessFile)localObject1).close();
      if ((i4 == 0) || (paramInt >= 4)) {
        break;
      }
      a(paramInt + 1, true);
      return;
      label457:
      continue;
      label460:
      int i4 = 0;
      continue;
      label466:
      int i5 = i2;
      int i2 = i3;
      int i3 = i5;
      continue;
      label481:
      i4 = 1;
    }
  }
  
  public static void a(n paramn, com.baidu.location.h.l paraml, Location paramLocation, String paramString)
  {
    if (!i.a().a)
    {
      break label9;
      break label9;
      break label9;
      break label9;
      break label9;
      break label9;
    }
    label9:
    while ((com.baidu.location.b.l.s == 3) && (!a(paramLocation, paraml)) && (!a(paramLocation, false))) {
      return;
    }
    BDLocation localBDLocation = com.baidu.location.c.e.a().a(true);
    Object localObject = paramString;
    if (localBDLocation.h() == 66) {
      localObject = paramString + String.format(Locale.CHINA, "&ofrt=%f|%f|%d", new Object[] { Double.valueOf(localBDLocation.d()), Double.valueOf(localBDLocation.c()), Integer.valueOf((int)localBDLocation.f()) });
    }
    if (com.baidu.location.b.l.a(f.b())) {}
    for (paramString = com.baidu.location.c.i.a().a(paramn, paraml, null, com.baidu.location.c.l.a, k.b);; paramString = com.baidu.location.c.i.a().a(paramn, paraml, null, com.baidu.location.c.l.b, k.b))
    {
      if ((paramString != null) && (paramString.h() != 67)) {
        break label281;
      }
      paramString = (String)localObject + String.format(Locale.CHINA, "&ofl=%s|0", new Object[] { "1" });
      if ((paramn == null) || (!paramn.b())) {
        break label399;
      }
      localObject = paraml;
      if (!a(paramLocation, paraml)) {
        localObject = null;
      }
      paramn = com.baidu.location.b.l.a(paramn, (com.baidu.location.h.l)localObject, paramLocation, paramString, 1);
      if (paramn == null) {
        break;
      }
      c(Jni.a(paramn));
      w = paramLocation;
      v = paramLocation;
      if (localObject == null) {
        break;
      }
      y = (com.baidu.location.h.l)localObject;
      return;
    }
    label281:
    int i1 = 0;
    if (paramString.r().equals("cl")) {
      i1 = 1;
    }
    for (;;)
    {
      paramString = (String)localObject + String.format(Locale.CHINA, "&ofl=%s|%d|%f|%f|%d", new Object[] { "1", Integer.valueOf(i1), Double.valueOf(paramString.d()), Double.valueOf(paramString.c()), Integer.valueOf((int)paramString.f()) });
      break;
      if (paramString.r().equals("wf")) {
        i1 = 2;
      }
    }
    label399:
    if ((paraml != null) && (paraml.h()) && (a(paramLocation, paraml)))
    {
      if ((!a(paramLocation)) && (!com.baidu.location.h.e.a().d())) {
        localObject = "&cfr=1" + paramString;
      }
      for (;;)
      {
        paramn = com.baidu.location.b.l.a(paramn, paraml, paramLocation, (String)localObject, 2);
        if (paramn == null) {
          break;
        }
        d(Jni.a(paramn));
        x = paramLocation;
        v = paramLocation;
        if (paraml == null) {
          break;
        }
        y = paraml;
        return;
        if ((!a(paramLocation)) && (com.baidu.location.h.e.a().d()))
        {
          localObject = "&cfr=3" + paramString;
        }
        else
        {
          localObject = paramString;
          if (com.baidu.location.h.e.a().d()) {
            localObject = "&cfr=2" + paramString;
          }
        }
      }
    }
    if ((!a(paramLocation)) && (!com.baidu.location.h.e.a().d())) {
      localObject = "&cfr=1" + paramString;
    }
    for (;;)
    {
      paramString = paraml;
      if (!a(paramLocation, paraml)) {
        paramString = null;
      }
      if ((paramn == null) && (paramString == null)) {
        break;
      }
      paramn = com.baidu.location.b.l.a(paramn, paramString, paramLocation, (String)localObject, 3);
      if (paramn == null) {
        break;
      }
      e(Jni.a(paramn));
      v = paramLocation;
      if (paramString == null) {
        break;
      }
      y = paramString;
      return;
      if ((!a(paramLocation)) && (com.baidu.location.h.e.a().d()))
      {
        localObject = "&cfr=3" + paramString;
      }
      else
      {
        localObject = paramString;
        if (com.baidu.location.h.e.a().d()) {
          localObject = "&cfr=2" + paramString;
        }
      }
    }
  }
  
  public static void a(String paramString)
  {
    try
    {
      File localFile = new File(paramString);
      if (!localFile.exists())
      {
        paramString = new File(com.baidu.location.b.e.a);
        if (!paramString.exists()) {
          paramString.mkdirs();
        }
        paramString = localFile;
        if (!localFile.createNewFile()) {
          paramString = null;
        }
        paramString = new RandomAccessFile(paramString, "rw");
        paramString.seek(0L);
        paramString.writeInt(32);
        paramString.writeInt(2048);
        paramString.writeInt(1040);
        paramString.writeInt(0);
        paramString.writeInt(0);
        paramString.writeInt(0);
        paramString.close();
      }
      return;
    }
    catch (Exception paramString) {}
  }
  
  private static boolean a(int paramInt1, int paramInt2, int paramInt3, int paramInt4, long paramLong)
  {
    if ((paramInt1 < 0) || (paramInt1 >= paramInt3)) {}
    while ((paramInt2 < 0) || (paramInt2 > paramInt3) || (paramInt3 < 0) || (paramInt3 > 1024) || (paramInt4 < 128) || (paramInt4 > 1024)) {
      return false;
    }
    return true;
  }
  
  private static boolean a(Location paramLocation)
  {
    boolean bool = true;
    if (paramLocation == null) {
      bool = false;
    }
    double d1;
    double d2;
    double d3;
    double d4;
    do
    {
      return bool;
      if ((w == null) || (v == null))
      {
        w = paramLocation;
        return true;
      }
      d1 = paramLocation.distanceTo(w);
      d2 = com.baidu.location.b.l.P;
      d3 = com.baidu.location.b.l.Q;
      d4 = com.baidu.location.b.l.R;
    } while (paramLocation.distanceTo(v) > d1 * d3 + d2 * d1 * d1 + d4);
    return false;
  }
  
  private static boolean a(Location paramLocation, com.baidu.location.h.l paraml)
  {
    if ((paramLocation == null) || (paraml == null) || (paraml.a == null) || (paraml.a.isEmpty())) {}
    while (paraml.b(y)) {
      return false;
    }
    if (x == null)
    {
      x = paramLocation;
      return true;
    }
    return true;
  }
  
  public static boolean a(Location paramLocation, boolean paramBoolean)
  {
    return a.a(v, paramLocation, paramBoolean);
  }
  
  public static boolean a(String paramString, List paramList)
  {
    paramString = new File(paramString);
    if (!paramString.exists()) {
      return false;
    }
    for (;;)
    {
      int i1;
      int i2;
      int i3;
      boolean bool2;
      try
      {
        paramString = new RandomAccessFile(paramString, "rw");
        paramString.seek(8L);
        int i5 = paramString.readInt();
        i1 = paramString.readInt();
        i4 = paramString.readInt();
        byte[] arrayOfByte = new byte[n];
        i2 = l;
        i2 += 1;
        bool1 = false;
        long l1;
        if ((i2 > 0) && (i1 > 0))
        {
          i3 = i4;
          if (i1 < i4) {
            i3 = 0;
          }
          l1 = (i1 - 1) * i5 + 128;
        }
        try
        {
          paramString.seek(l1);
          i4 = paramString.readInt();
          bool2 = bool1;
          if (i4 <= 0) {
            break label220;
          }
          bool2 = bool1;
          if (i4 >= i5) {
            break label220;
          }
          paramString.read(arrayOfByte, 0, i4);
          bool2 = bool1;
          if (arrayOfByte[(i4 - 1)] != 0) {
            break label220;
          }
          paramList.add(0, new String(arrayOfByte, 0, i4 - 1));
          bool2 = true;
        }
        catch (Exception paramString)
        {
          return bool1;
        }
        paramString.seek(12L);
        paramString.writeInt(i1);
        paramString.writeInt(i4);
        paramString.close();
        return bool1;
      }
      catch (Exception paramString)
      {
        return false;
      }
      label220:
      i2 -= 1;
      i1 -= 1;
      boolean bool1 = bool2;
      int i4 = i3;
    }
  }
  
  public static String b()
  {
    return d();
  }
  
  /* Error */
  public static void b(String paramString)
  {
    // Byte code:
    //   0: ldc 2
    //   2: monitorenter
    //   3: getstatic 429	com/baidu/location/b/l:n	I
    //   6: istore_2
    //   7: iload_2
    //   8: iconst_1
    //   9: if_icmpne +15 -> 24
    //   12: getstatic 51	com/baidu/location/e/y:b	Ljava/util/ArrayList;
    //   15: astore_1
    //   16: aload_1
    //   17: ifnonnull +31 -> 48
    //   20: ldc 2
    //   22: monitorexit
    //   23: return
    //   24: iload_2
    //   25: iconst_2
    //   26: if_icmpne +10 -> 36
    //   29: getstatic 53	com/baidu/location/e/y:c	Ljava/util/ArrayList;
    //   32: astore_1
    //   33: goto -17 -> 16
    //   36: iload_2
    //   37: iconst_3
    //   38: if_icmpne -18 -> 20
    //   41: getstatic 55	com/baidu/location/e/y:d	Ljava/util/ArrayList;
    //   44: astore_1
    //   45: goto -29 -> 16
    //   48: aload_1
    //   49: invokeinterface 214 1 0
    //   54: getstatic 98	com/baidu/location/e/y:m	I
    //   57: if_icmpgt +11 -> 68
    //   60: aload_1
    //   61: aload_0
    //   62: invokeinterface 198 2 0
    //   67: pop
    //   68: aload_1
    //   69: invokeinterface 214 1 0
    //   74: getstatic 98	com/baidu/location/e/y:m	I
    //   77: if_icmplt +8 -> 85
    //   80: iload_2
    //   81: iconst_0
    //   82: invokestatic 243	com/baidu/location/e/y:a	(IZ)V
    //   85: aload_1
    //   86: invokeinterface 214 1 0
    //   91: getstatic 98	com/baidu/location/e/y:m	I
    //   94: if_icmple -74 -> 20
    //   97: aload_1
    //   98: iconst_0
    //   99: invokeinterface 224 2 0
    //   104: pop
    //   105: goto -20 -> 85
    //   108: astore_0
    //   109: ldc 2
    //   111: monitorexit
    //   112: aload_0
    //   113: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	114	0	paramString	String
    //   15	83	1	localArrayList	ArrayList
    //   6	75	2	i1	int
    // Exception table:
    //   from	to	target	type
    //   3	7	108	finally
    //   12	16	108	finally
    //   29	33	108	finally
    //   41	45	108	finally
    //   48	68	108	finally
    //   68	85	108	finally
    //   85	105	108	finally
  }
  
  private static void c(String paramString)
  {
    b(paramString);
  }
  
  public static String d()
  {
    String str1 = null;
    int i1 = 1;
    String str2;
    if (i1 < 5)
    {
      str1 = a(i1);
      if (str1 != null) {
        str2 = str1;
      }
    }
    do
    {
      do
      {
        do
        {
          return str2;
          i1 += 1;
          break;
          a(d, t);
          if (d.size() > 0)
          {
            str1 = (String)d.get(0);
            d.remove(0);
          }
          str2 = str1;
        } while (str1 != null);
        a(d, s);
        if (d.size() > 0)
        {
          str1 = (String)d.get(0);
          d.remove(0);
        }
        str2 = str1;
      } while (str1 != null);
      a(d, u);
      str2 = str1;
    } while (d.size() <= 0);
    str1 = (String)d.get(0);
    d.remove(0);
    return str1;
  }
  
  private static void d(String paramString)
  {
    b(paramString);
  }
  
  public static void e()
  {
    l = 0;
    a(1, false);
    a(2, false);
    a(3, false);
    l = 8;
  }
  
  private static void e(String paramString)
  {
    b(paramString);
  }
  
  public static String f()
  {
    Object localObject5 = null;
    Object localObject3 = null;
    Object localObject6 = new File(g);
    Object localObject1 = localObject3;
    if (((File)localObject6).exists()) {
      localObject1 = localObject5;
    }
    try
    {
      localObject6 = new RandomAccessFile((File)localObject6, "rw");
      localObject1 = localObject5;
      ((RandomAccessFile)localObject6).seek(20L);
      localObject1 = localObject5;
      i1 = ((RandomAccessFile)localObject6).readInt();
      if (i1 > 128)
      {
        localObject1 = localObject5;
        localObject3 = "&p1=" + i1;
        localObject1 = localObject3;
        ((RandomAccessFile)localObject6).seek(20L);
        localObject1 = localObject3;
        ((RandomAccessFile)localObject6).writeInt(0);
        localObject1 = localObject3;
        ((RandomAccessFile)localObject6).close();
        return (String)localObject3;
      }
      localObject1 = localObject5;
      ((RandomAccessFile)localObject6).close();
      localObject1 = localObject3;
    }
    catch (Exception localException3)
    {
      int i1;
      Object localObject2;
      Object localObject4;
      for (;;) {}
      return localException3;
    }
    localObject5 = new File(h);
    localObject3 = localObject1;
    if (((File)localObject5).exists())
    {
      localObject3 = localObject1;
      try
      {
        localObject5 = new RandomAccessFile((File)localObject5, "rw");
        localObject3 = localObject1;
        ((RandomAccessFile)localObject5).seek(20L);
        localObject3 = localObject1;
        i1 = ((RandomAccessFile)localObject5).readInt();
        if (i1 > 256)
        {
          localObject3 = localObject1;
          localObject1 = "&p2=" + i1;
          localObject3 = localObject1;
          ((RandomAccessFile)localObject5).seek(20L);
          localObject3 = localObject1;
          ((RandomAccessFile)localObject5).writeInt(0);
          localObject3 = localObject1;
          ((RandomAccessFile)localObject5).close();
          return (String)localObject1;
        }
      }
      catch (Exception localException1) {}
    }
    for (;;)
    {
      localObject5 = new File(i);
      if (!((File)localObject5).exists()) {
        return localObject3;
      }
      localObject2 = localObject3;
      try
      {
        localObject5 = new RandomAccessFile((File)localObject5, "rw");
        localObject2 = localObject3;
        ((RandomAccessFile)localObject5).seek(20L);
        localObject2 = localObject3;
        i1 = ((RandomAccessFile)localObject5).readInt();
        if (i1 <= 512) {
          break;
        }
        localObject2 = localObject3;
        localObject3 = "&p3=" + i1;
        localObject2 = localObject3;
        ((RandomAccessFile)localObject5).seek(20L);
        localObject2 = localObject3;
        ((RandomAccessFile)localObject5).writeInt(0);
        localObject2 = localObject3;
        ((RandomAccessFile)localObject5).close();
        return (String)localObject3;
      }
      catch (Exception localException2)
      {
        return (String)localObject2;
      }
      localObject4 = localObject2;
      ((RandomAccessFile)localObject5).close();
      localObject4 = localObject2;
    }
    localObject2 = localObject4;
    ((RandomAccessFile)localObject5).close();
    return (String)localObject4;
  }
  
  public void c()
  {
    if (!r.a().g()) {
      return;
    }
    this.z.b();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\e\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */