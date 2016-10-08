package com.android.dazhihui.d.b;

import com.android.dazhihui.a.b.x;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.PrintStream;
import java.util.Vector;

public class b
{
  static m[] g = { new m(0, 1, 0, 69, 0, 0), new m(1, 2, 2, 98, 2, 0), new m(3, 3, 4, 98, 4, 1), new m(7, 4, 8, 98, 8, 9), new m(15, 5, 16, 98, 16, 137), new m(31, 5, 32, 68, 0, 0) };
  static m[] h = { new m(1, 2, 4, 66, 4, 0), new m(0, 1, 8, 66, 8, 16), new m(3, 3, 12, 66, 12, 272), new m(7, 4, 16, 66, 16, 4368), new m(15, 5, 24, 66, 24, 69904), new m(31, 5, 32, 68, 0, 0) };
  static i i = new i();
  static m[] j = { new m(0, 1, 0, 88, 0, 0), new m(1, 2, 3, 66, 3, 0), new m(3, 2, 32, 68, 0, 0) };
  static m[] k = { new m(0, 1, 0, 88, 0, 0), new m(1, 2, 5, 75, 5, 0), new m(3, 2, 32, 68, 0, 0) };
  static m[] l = { new m(1, 2, 8, 98, 8, 0), new m(0, 1, 16, 98, 16, 128), new m(3, 3, 24, 98, 24, 32896), new m(7, 3, 32, 68, 0, 0) };
  static m[] m = { new m(1, 2, 8, 66, 8, 0), new m(0, 1, 16, 66, 16, 256), new m(3, 3, 24, 66, 24, 65792), new m(7, 3, 32, 68, 0, 0) };
  static m[] n = { new m(1, 2, 12, 98, 12, 0), new m(0, 1, 16, 98, 16, 2048), new m(3, 3, 24, 98, 24, 34816), new m(7, 3, 32, 68, 0, 0) };
  static m[] o = { new m(3, 3, 12, 98, 12, 0), new m(1, 2, 16, 98, 16, 2048), new m(0, 1, 24, 98, 24, 34816), new m(7, 3, 32, 68, 0, 0) };
  static h p = new h();
  static l q = new l();
  static m[] r = { new m(0, 1, 4, 98, 4, 0), new m(1, 2, 8, 98, 8, 8), new m(3, 3, 12, 98, 12, 136), new m(7, 4, 16, 98, 16, 2184), new m(15, 4, 32, 68, 0, 0) };
  public byte[] a;
  public int b;
  public int c;
  public int d;
  m[] e;
  public int f;
  
  public b()
  {
    this.a = null;
    this.b = 0;
    this.c = 0;
    this.d = 0;
    this.e = null;
    this.f = 0;
  }
  
  public b(byte[] paramArrayOfByte, int paramInt)
  {
    a(paramArrayOfByte, paramInt);
  }
  
  static int a(long paramLong1, long paramLong2)
  {
    paramLong2 = paramLong1 + paramLong2;
    paramLong1 = paramLong2;
    if (paramLong2 > -1L) {
      paramLong1 = paramLong2 + 1L - 1L;
    }
    return (int)paramLong1;
  }
  
  static int a(b paramb, int paramInt1, int paramInt2)
  {
    k localk = new k();
    j localj = new j();
    localj.a = 0;
    if (paramb.a(16, localk) > 0)
    {
      int i1 = localk.b.intValue();
      if ((i1 & 0x1) == 0)
      {
        paramb.b(1);
        localj.a = paramInt1;
        paramInt1 = localj.a() + paramInt2;
        if (paramInt1 >= 60)
        {
          localj.a(paramInt1 - 60);
          localj.b(localj.b() + 1);
        }
      }
      for (;;)
      {
        return localj.a;
        localj.a(paramInt1);
        continue;
        if ((i1 & 0x3) != 3) {
          break;
        }
        paramb.b(2);
        localj.a = paramb.a(32);
      }
      throw new Exception("expand min date error");
    }
    throw new Exception("expand min date error:no data");
  }
  
  static int a(short paramShort, f paramf, short[] paramArrayOfShort)
  {
    int i3 = 0;
    for (int i1 = 0;; i1 = (short)(i1 + 1))
    {
      int i2 = i3;
      if (i1 < paramf.c)
      {
        if (paramShort < paramArrayOfShort[i1])
        {
          i2 = paramShort;
          if (i1 > 0) {
            i2 = (short)((short)(paramShort - paramArrayOfShort[(i1 - 1)]) + 1);
          }
          paramf = (n)paramf.d.elementAt(i1);
          i2 = ((paramf.a % 100 + i2 % 60) / 60 + paramf.a / 100 + i2 / 60) % 24 * 100 + (paramf.a % 100 + i2 % 60) % 60;
        }
      }
      else {
        return i2;
      }
    }
  }
  
  public static short a(DataInputStream paramDataInputStream)
  {
    try
    {
      int i1 = paramDataInputStream.readShort();
      return (short)((i1 & 0xFF00) >>> 8 | (short)((i1 & 0xFF) << 8));
    }
    catch (Exception paramDataInputStream) {}
    return 0;
  }
  
  public static byte[] a(byte[] paramArrayOfByte)
  {
    DataInputStream localDataInputStream;
    x localx;
    int i3;
    int i4;
    int i5;
    int i6;
    int i7;
    int i2;
    f localf;
    int i1;
    Object localObject;
    b localb;
    short[] arrayOfShort;
    try
    {
      localDataInputStream = new DataInputStream(new ByteArrayInputStream(paramArrayOfByte));
      localx = new x(0);
      i3 = paramArrayOfByte.length;
      if (i3 > d.a + g.a + f.a)
      {
        i4 = localDataInputStream.readByte();
        localx.b(i4);
        localx.b(localDataInputStream.readByte());
        localx.b(localDataInputStream.readByte());
        localx.c(a(localDataInputStream));
        localx.c(a(localDataInputStream));
        i5 = a(localDataInputStream);
        i6 = a(localDataInputStream);
        i7 = localDataInputStream.readByte();
        localx.b(i7);
        i2 = localDataInputStream.readByte();
        localf = new f();
        localf.b = a(localDataInputStream);
        localf.c = a(localDataInputStream);
        localx.c(localf.c);
        i1 = 0;
        while (i1 < localf.c)
        {
          short s1 = a(localDataInputStream);
          short s2 = a(localDataInputStream);
          localObject = new n(s1, s2);
          localf.d.addElement(localObject);
          localx.c(s1);
          localx.c(s2);
          i1 += 1;
        }
        i1 = d.a;
        int i8 = g.a;
        i3 = i3 - d.a - g.a - i2;
        if (d.a + i.a * (i5 + i6) > 0)
        {
          int i9 = d.a;
          localObject = new byte[i3];
          System.arraycopy(paramArrayOfByte, i1 + i8 + i2, localObject, 0, i3);
          localb = new b((byte[])localObject, i3);
          paramArrayOfByte = i;
          arrayOfShort = new short[8];
          i1 = 0;
          if ((i1 >= localf.c) || (i1 >= 8)) {
            break label888;
          }
          localObject = (n)localf.d.elementAt(i1);
          if (((n)localObject).b < ((n)localObject).a) {
            arrayOfShort[i1] = ((short)((((n)localObject).b / 100 + 24 - ((n)localObject).a / 100) * 60 + ((n)localObject).b % 100 - ((n)localObject).a % 100));
          } else {
            arrayOfShort[i1] = ((short)((((n)localObject).b / 100 - ((n)localObject).a / 100) * 60 + ((n)localObject).b % 100 - ((n)localObject).a % 100));
          }
        }
      }
    }
    catch (Exception paramArrayOfByte)
    {
      System.out.println(paramArrayOfByte);
    }
    return null;
    label476:
    arrayOfShort[i1] = ((short)(arrayOfShort[i1] + 1));
    break label878;
    label492:
    if (i2 < i5)
    {
      localObject = new i();
      ((i)localObject).b = a((short)(i2 * i7), localf, arrayOfShort);
      localx.d(((i)localObject).b);
      localb.a(g, 6);
      ((i)localObject).c = localb.a(paramArrayOfByte.c, false);
      localx.d(((i)localObject).c);
      localb.a(h, 6);
      ((i)localObject).d = localb.a(paramArrayOfByte.d, false);
      localx.d(((i)localObject).d);
      localb.a(g, 6);
      ((i)localObject).e = localb.a(paramArrayOfByte.e, false);
      localx.d(((i)localObject).e);
      if (i4 == 1)
      {
        ((i)localObject).f = localb.a(paramArrayOfByte.f, false);
        localx.d(((i)localObject).f);
      }
    }
    for (;;)
    {
      label664:
      if ((i6 != 0) && ((localb.a() + 7) / 8 + i6 * 4 * i2 <= i3))
      {
        localDataInputStream.skip(i3 - i2 * (i6 * 4));
        i3 = 0;
        i2 = i1;
      }
      for (i1 = i3;; i1 = (short)(i1 + 1))
      {
        if (i1 < i6)
        {
          paramArrayOfByte = new i();
          paramArrayOfByte.b = a((short)((i5 + i1) * i7), localf, arrayOfShort);
          localx.d(paramArrayOfByte.b);
          paramArrayOfByte.c = b(localDataInputStream);
          localx.d(paramArrayOfByte.c);
          paramArrayOfByte.d = b(localDataInputStream);
          localx.d(paramArrayOfByte.d);
          paramArrayOfByte.e = b(localDataInputStream);
          localx.d(paramArrayOfByte.e);
          if (i4 == 1)
          {
            paramArrayOfByte.f = b(localDataInputStream);
            localx.d(paramArrayOfByte.f);
          }
        }
        else
        {
          paramArrayOfByte = localx.b();
          return paramArrayOfByte;
          if (i1 <= 0) {
            break label476;
          }
          arrayOfShort[i1] = ((short)(arrayOfShort[i1] + arrayOfShort[(i1 - 1)]));
          label878:
          i1 = (short)(i1 + 1);
          break;
          label888:
          i2 = 0;
          i1 = 0;
          break label492;
          i1 = (short)(i1 + 1);
          i2 = (short)(i2 + 1);
          paramArrayOfByte = (byte[])localObject;
          break label492;
          if (i4 != 1) {
            break label945;
          }
          i2 = 4;
          break label664;
        }
        i2 = (short)(i2 + 1);
      }
      label945:
      i2 = 3;
    }
  }
  
  static int b(b paramb, int paramInt1, int paramInt2)
  {
    k localk = new k();
    if (paramb.a(16, localk) > 0)
    {
      int i1 = localk.b.intValue();
      if ((i1 & 0x1) == 0)
      {
        paramb.b(1);
        return paramInt1 + paramInt2;
      }
      if ((i1 & 0x3) == 1)
      {
        paramb.b(7);
        return (i1 >>> 2 & 0x1F) + (paramInt1 / 100 + 1) * 100;
      }
      if ((i1 & 0x3) == 3)
      {
        paramb.b(2);
        return paramb.a(32);
      }
      throw new Exception("expand day date error");
    }
    throw new Exception("expand day date error:no data");
  }
  
  public static int b(DataInputStream paramDataInputStream)
  {
    try
    {
      int i1 = paramDataInputStream.readInt();
      i1 = (i1 & 0xFF000000) >>> 8 | (i1 & 0xFF) << 8 | (0xFF00 & i1) >>> 8 | (0xFF0000 & i1) << 8;
      return 0x0 | (0xFFFF & i1) << 16 | (i1 & 0xFFFF0000) >>> 16;
    }
    catch (Exception paramDataInputStream) {}
    return 0;
  }
  
  public static byte[] b(byte[] paramArrayOfByte)
  {
    try
    {
      localObject = new DataInputStream(new ByteArrayInputStream(paramArrayOfByte));
      new ByteArrayOutputStream();
      localx = new x(0);
      i1 = paramArrayOfByte.length;
      if (i1 <= e.a + 3) {
        break label482;
      }
      i2 = (short)(i1 - 3);
      i4 = ((DataInputStream)localObject).readByte();
      a((DataInputStream)localObject);
      i5 = a((DataInputStream)localObject);
      i6 = ((DataInputStream)localObject).readByte();
      localx.b(i4);
      localx.c(i5);
      if (h.a * i5 + 2 <= 0) {
        break label472;
      }
      switch (i6)
      {
      }
    }
    catch (Exception paramArrayOfByte)
    {
      for (;;)
      {
        Object localObject;
        x localx;
        int i4;
        int i5;
        int i6;
        b localb;
        label472:
        label482:
        System.out.println("err klineExpand");
        continue;
        int i1 = 0;
        continue;
        int i3 = (short)(i3 + 1);
        int i2 = (short)(i2 + 1);
        paramArrayOfByte = (byte[])localObject;
        continue;
        i1 = 1;
        continue;
        i1 = 5;
        continue;
        i1 = 15;
        continue;
        i1 = 30;
        continue;
        i1 = 60;
        continue;
        i1 = 1;
        continue;
        i1 = 7;
        continue;
        i1 = 100;
      }
    }
    localObject = new byte[i2 - e.a];
    System.arraycopy(paramArrayOfByte, e.a + 3, localObject, 0, i2 - e.a);
    localb = new b((byte[])localObject, i2 - e.a);
    try
    {
      paramArrayOfByte = p;
      i2 = 0;
      i3 = 0;
      if (i2 < i5)
      {
        localObject = new h();
        if (i6 <= 5) {}
        for (((h)localObject).b = a(localb, paramArrayOfByte.b, i1);; ((h)localObject).b = b(localb, paramArrayOfByte.b, i1))
        {
          localb.a(l, 4);
          ((h)localObject).c = localb.a(paramArrayOfByte.f, false);
          localb.a(m, 4);
          ((h)localObject).d = localb.a(((h)localObject).c, false);
          ((h)localObject).e = localb.a(((h)localObject).c, true);
          ((h)localObject).f = localb.a(((h)localObject).e, false);
          localb.a(n, 4);
          ((h)localObject).g = localb.a(paramArrayOfByte.g, false);
          localb.a(o, 4);
          ((h)localObject).h = localb.a(paramArrayOfByte.h, false);
          if (i4 == 1) {
            ((h)localObject).i = localb.a(paramArrayOfByte.i, false);
          }
          localx.d(((h)localObject).b);
          localx.d(((h)localObject).c);
          localx.d(((h)localObject).d);
          localx.d(((h)localObject).e);
          localx.d(((h)localObject).f);
          localx.d(((h)localObject).g);
          localx.d(((h)localObject).h);
          if (i4 != 1) {
            break;
          }
          localx.d(((h)localObject).i);
          break;
        }
      }
      return localx.b();
    }
    catch (Exception paramArrayOfByte)
    {
      System.out.println("err");
    }
    i1 = c.a;
    i1 = h.a;
    return null;
  }
  
  public static long c(DataInputStream paramDataInputStream)
  {
    return d(b(paramDataInputStream));
  }
  
  public static byte[] c(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte.length > 16)
    {
      x localx = new x(0);
      b localb = new b(paramArrayOfByte, paramArrayOfByte.length);
      int i2 = localb.a(16);
      if (i2 > 0)
      {
        localx.c(i2);
        localb.a(r, 5);
        paramArrayOfByte = new a();
        a locala = new a();
        int i1 = 0;
        while (i1 < i2)
        {
          locala.a = localb.a(3);
          locala.b = localb.a(paramArrayOfByte.b, false);
          locala.c = localb.a(paramArrayOfByte.c, false);
          locala.d = localb.a(paramArrayOfByte.d, false);
          locala.e = localb.a(paramArrayOfByte.e, false);
          locala.f = localb.a(0, false);
          localx.b(locala.a);
          localx.d(locala.b);
          localx.d(locala.c);
          localx.d(locala.d);
          localx.d(locala.e);
          localx.c(locala.f);
          i1 += 1;
          paramArrayOfByte = locala;
        }
        return localx.b();
      }
    }
    return null;
  }
  
  static long d(int paramInt)
  {
    long l2 = paramInt;
    long l1 = l2;
    if (l2 < 0L) {
      l1 = l2 + 4294967295L + 1L;
    }
    return l1;
  }
  
  public int a()
  {
    return this.c;
  }
  
  public int a(int paramInt)
  {
    k localk = new k();
    this.c = (a(paramInt, localk) + this.c);
    return localk.b.intValue();
  }
  
  int a(int paramInt, k paramk)
  {
    int i2 = 0;
    DataInputStream localDataInputStream = new DataInputStream(new ByteArrayInputStream(this.a));
    if ((paramInt < 0) || (paramInt > 32)) {
      throw new Exception("Get Bit Len Error");
    }
    if (this.b <= this.c) {
      throw new Exception("Get Pos Out of Range");
    }
    int i1 = paramInt;
    int i3;
    int i4;
    if (paramInt > 0)
    {
      i1 = paramInt;
      if (paramInt > this.b - this.c) {
        i1 = this.b - this.c;
      }
      paramInt = this.c / 8;
      i2 = paramInt + 1;
      localDataInputStream.skip(paramInt);
      paramInt = localDataInputStream.readUnsignedByte();
      i3 = 8 - this.c % 8;
      i4 = paramInt >>> 8 - i3;
      paramInt = i1 - i3;
      if (paramInt <= 0) {
        break label314;
      }
      if (this.c + i3 + 32 > this.b) {
        break label311;
      }
      localDataInputStream = new DataInputStream(new ByteArrayInputStream(this.a));
      localDataInputStream.skip(i2);
      paramInt = (int)(c(localDataInputStream) << i3 | i4);
      d(paramInt);
    }
    for (;;)
    {
      i2 = -1 >>> 32 - i1 & paramInt;
      paramk.b = new Integer(i2);
      return i1;
      label244:
      i2 += 1;
      label311:
      for (;;)
      {
        localDataInputStream = new DataInputStream(new ByteArrayInputStream(this.a));
        localDataInputStream.skip(i2);
        i4 = localDataInputStream.readUnsignedByte() << i3 | i4;
        i3 += 8;
        paramInt -= 8;
        if (paramInt > 0) {
          break label244;
        }
        paramInt = i4;
        break;
      }
      label314:
      paramInt = i4;
    }
  }
  
  public int a(int paramInt, boolean paramBoolean)
  {
    k localk = new k();
    m localm = a(localk);
    long l1 = localk.a.longValue();
    if ((localm != null) && (!localm.a()) && (paramInt > 0))
    {
      if (paramBoolean) {
        return (int)(paramInt - l1);
      }
      return a(l1, paramInt);
    }
    return (int)l1;
  }
  
  m a(k paramk)
  {
    int i3 = 0;
    Object localObject1;
    int i2;
    int i1;
    label74:
    label104:
    label200:
    long l1;
    label203:
    long l2;
    Object localObject2;
    if (this.e != null)
    {
      localObject1 = new k();
      a(16, (k)localObject1);
      i2 = ((k)localObject1).b.intValue();
      i1 = 0;
      if (i1 < this.f)
      {
        localObject1 = this.e[i1];
        if (((m)localObject1).a == (-1 >>> 32 - ((m)localObject1).b & i2))
        {
          if (localObject1 == null) {
            break label499;
          }
          b(((m)localObject1).b);
          if (((m)localObject1).c <= 0) {
            break label526;
          }
          i1 = a(((m)localObject1).c);
          switch (((m)localObject1).d)
          {
          default: 
            l1 = 0L;
            if ((((0xFFFFFFFF80000000 & l1) > 0L) && (((m)localObject1).d == 98)) || (((m)localObject1).d == 109))
            {
              l2 = l1 - ((m)localObject1).f;
              localObject2 = localObject1;
              i2 = i1;
            }
            break;
          }
        }
      }
    }
    for (;;)
    {
      if (l2 != 0L)
      {
        paramk.a = new Long(l2);
        return (m)localObject2;
        i1 += 1;
        break;
        l1 = 0L;
        break label203;
        if ((1 << ((m)localObject1).c - 1 & i1) <= 0) {
          break label200;
        }
        i1 |= -1 << ((m)localObject1).c;
        l1 = d(i1);
        break label203;
        i1 |= -1 << ((m)localObject1).c;
        l1 = 0L;
        break label203;
        i1 <<= (((m)localObject1).e & 0xFFFF0000);
        l1 = 0L;
        break label203;
        i1 = ((m)localObject1).e;
        l1 = 0L;
        break label203;
        i2 = (i1 >>> 2) + ((m)localObject1).f;
        while (i3 <= (i1 & 0x3))
        {
          i2 *= 10;
          i3 += 1;
        }
        i1 = i2;
        l1 = 0L;
        break label203;
        i1 = 1 << i1;
        l1 = 0L;
        break label203;
        l2 = l1;
        i2 = i1;
        localObject2 = localObject1;
        if (((m)localObject1).a()) {
          continue;
        }
        l2 = l1;
        i2 = i1;
        localObject2 = localObject1;
        if (((m)localObject1).d == 90) {
          continue;
        }
        l2 = l1;
        i2 = i1;
        localObject2 = localObject1;
        if (((m)localObject1).d == 115) {
          continue;
        }
        i2 = i1 + ((m)localObject1).f;
        l2 = l1;
        localObject2 = localObject1;
        continue;
        label499:
        throw new Exception("Decode Cannot Find Match");
      }
      paramk.a = new Long(i2);
      return (m)localObject2;
      label526:
      i1 = 0;
      break label104;
      localObject1 = null;
      break label74;
      localObject2 = null;
      i2 = 0;
      l2 = 0L;
    }
  }
  
  public void a(byte[] paramArrayOfByte, int paramInt)
  {
    this.a = paramArrayOfByte;
    this.b = (paramInt * 8);
    this.c = 0;
    this.e = null;
    this.f = 0;
  }
  
  void a(m[] paramArrayOfm, int paramInt)
  {
    this.e = paramArrayOfm;
    this.f = paramInt;
  }
  
  public int b(int paramInt)
  {
    return c(this.c + paramInt);
  }
  
  public int c(int paramInt)
  {
    this.c = paramInt;
    if ((this.c < 0) || (this.c > this.b)) {
      throw new Exception("Move To Pos Out of Range");
    }
    return this.c;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\d\b\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */