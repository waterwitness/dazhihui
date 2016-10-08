package com.android.dazhihui.ui.delegate.b;

import android.content.Context;
import android.widget.Toast;
import java.util.Random;
import java.util.Vector;

public class u
{
  public static String a;
  public static String b;
  public static byte[] c;
  private static byte[] d;
  private static int e = 0;
  private static int f = 0;
  private static String g = null;
  private static byte[] h = null;
  private static String i;
  private static final Random p = new Random();
  private static byte[] q;
  private static int r = 0;
  private int j;
  private byte[] k;
  private int l;
  private int m;
  private int n;
  private int o;
  
  private u() {}
  
  public u(int paramInt, byte[] paramArrayOfByte)
  {
    this.j = paramInt;
    this.k = paramArrayOfByte;
  }
  
  public u(byte[] paramArrayOfByte)
  {
    this(12, paramArrayOfByte);
  }
  
  public static void a()
  {
    d = null;
    e = 0;
    f = 0;
    a = null;
    b = null;
    c = null;
    i = null;
    r = 0;
    j.a();
    a.a();
  }
  
  public static void a(byte[] paramArrayOfByte, int paramInt)
  {
    d = paramArrayOfByte;
    e = paramInt;
    g = com.android.dazhihui.g.a().H();
  }
  
  public static boolean a(u paramu, Context paramContext)
  {
    if (paramu == null)
    {
      paramu = Toast.makeText(paramContext, "　　连接失败，请重试。", 0);
      paramu.setGravity(17, 0, 0);
      paramu.show();
      return false;
    }
    return true;
  }
  
  public static boolean a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    int i1 = 0;
    while (i1 < paramArrayOfByte1.length)
    {
      if (paramArrayOfByte1[i1] != paramArrayOfByte2[i1]) {
        return false;
      }
      i1 += 1;
    }
    return true;
  }
  
  public static byte[] a(String paramString, int paramInt)
  {
    paramString = g.b(paramString);
    byte[] arrayOfByte = new byte[paramInt];
    System.arraycopy(paramString, 0, arrayOfByte, 0, Math.min(paramString.length, paramInt));
    return arrayOfByte;
  }
  
  public static byte[] a(u[] paramArrayOfu, com.android.dazhihui.a.b.u paramu)
  {
    g localg1 = new g();
    e += 1;
    int i1 = 0;
    if (i1 < paramArrayOfu.length)
    {
      u localu = paramArrayOfu[i1];
      byte[] arrayOfByte;
      g localg2;
      int i2;
      if (localu.j == 12)
      {
        if (!o.a) {
          break label346;
        }
        arrayOfByte = localu.k;
        localg2 = new g();
        localg2.d(20);
        localg2.g(r);
        localg2.e(0);
        localg2.g(arrayOfByte.length);
        localg2.g(arrayOfByte.length);
        localg2.a(arrayOfByte);
        i2 = arrayOfByte.length + 33;
        if (i2 % 16 != 0) {
          localg2.d((i2 / 16 + 1) * 16 - i2);
        }
        if (q == null) {
          q = j.a((a + b + j()).getBytes());
        }
        localg2.a(0, j.c(localg2.b(20)));
        localu.m = r;
        localu.k = a.b(localg2.a(), localu.m);
        r += 1;
      }
      for (;;)
      {
        paramu.b(localu.m);
        localu.l = f;
        localu.n = localu.k.length;
        localg1.d(4);
        localg1.e(localu.o);
        localg1.e(localu.j);
        localg1.g(localu.l);
        localg1.g(localu.m);
        localg1.g(localu.n);
        localg1.g(localu.k.length);
        localg1.a(localu.k);
        d.a(localg1.b(4));
        localg1.b(0, d.a(localg1.b(4)));
        i1 += 1;
        break;
        label346:
        arrayOfByte = localu.k;
        localg2 = new g();
        localg2.d(16);
        localg2.g(e);
        localg2.e(0);
        localg2.g(arrayOfByte.length);
        localg2.g(arrayOfByte.length);
        localg2.a(arrayOfByte);
        i2 = arrayOfByte.length + 13;
        if (i2 % 16 != 0) {
          localg2.d((i2 / 16 + 1) * 16 - i2);
        }
        localg2.a(0, j.a(localg2.b(16)));
        if (d != null) {
          try
          {
            localu.k = a.a(localg2.a(), d);
          }
          catch (Exception paramArrayOfu)
          {
            paramArrayOfu.printStackTrace();
            return null;
          }
        }
      }
      return null;
    }
    return localg1.a();
  }
  
  public static u[] a(byte[] paramArrayOfByte)
  {
    Object localObject = new g();
    if ((h == null) || (h.length == 0))
    {
      ((g)localObject).a(paramArrayOfByte);
      ((g)localObject).a(0);
      paramArrayOfByte = new Vector(1);
    }
    label341:
    do
    {
      i1 = ((g)localObject).b();
      u localu = new u();
      int i2 = ((g)localObject).f();
      int i3 = ((g)localObject).b();
      localu.o = ((g)localObject).d();
      localu.j = ((g)localObject).d();
      localu.l = ((g)localObject).f();
      localu.m = ((g)localObject).f();
      localu.n = ((g)localObject).f();
      int i4 = ((g)localObject).f();
      if (!((g)localObject).c(i4))
      {
        h = ((g)localObject).b(i1);
        return null;
        ((g)localObject).a(h);
        ((g)localObject).a(paramArrayOfByte);
        break;
      }
      h = null;
      localu.k = ((g)localObject).h(i4);
      if (d.a(((g)localObject).a(i3, ((g)localObject).b() - i3)) != i2)
      {
        h = null;
        return null;
      }
      f = localu.l;
      if (localu.o != 0) {
        localu.k = v.a(localu.k, localu.n);
      }
      if (localu.j == 12)
      {
        if (o.a) {}
        g localg;
        byte[] arrayOfByte;
        for (localu.k = a.d(localu.k, localu.m);; localu.k = a.b(localu.k, d))
        {
          localg = new g(localu.k);
          arrayOfByte = localg.h(16);
          if (!o.a) {
            break;
          }
          localg.f();
          if (a(arrayOfByte, j.c(localg.b(20)))) {
            break label341;
          }
          return null;
          if (d == null) {
            return null;
          }
        }
        if (!a(arrayOfByte, j.a(localg.b(16)))) {
          return null;
        }
        localg.f();
        i1 = localg.d();
        i2 = localg.f();
        localu.k = localg.h(localg.f());
        if (i1 != 0) {
          localu.k = v.a(localu.k, i2);
        }
      }
      paramArrayOfByte.addElement(localu);
    } while (((g)localObject).c());
    localObject = new u[paramArrayOfByte.size()];
    int i1 = 0;
    while (i1 < localObject.length)
    {
      localObject[i1] = ((u)paramArrayOfByte.elementAt(i1));
      i1 += 1;
    }
    return (u[])localObject;
  }
  
  public static boolean b()
  {
    boolean bool2 = false;
    boolean bool1 = bool2;
    if (g != null)
    {
      bool1 = bool2;
      if (g.equals(com.android.dazhihui.g.a().H())) {
        bool1 = true;
      }
    }
    return bool1;
  }
  
  public static byte[] b(int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    int i1 = 0;
    while (i1 < paramInt)
    {
      arrayOfByte[i1] = ((byte)(Math.abs(p.nextInt()) % 256));
      i1 += 1;
    }
    return arrayOfByte;
  }
  
  public static boolean c()
  {
    return d != null;
  }
  
  public static void g()
  {
    h = null;
  }
  
  public static int h()
  {
    int i2 = Math.abs(p.nextInt());
    int i1 = i2;
    if (i2 >= 10000000) {
      i1 = i2 % 10000000;
    }
    i2 = i1;
    if (i1 <= 10000000) {
      i2 = i1 + 10000000;
    }
    return i2;
  }
  
  public static byte[] i()
  {
    return q;
  }
  
  public static String j()
  {
    return i;
  }
  
  public u a(int paramInt)
  {
    this.m = paramInt;
    return this;
  }
  
  public int d()
  {
    return this.j;
  }
  
  public byte[] e()
  {
    return this.k;
  }
  
  public int f()
  {
    return this.m;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\b\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */