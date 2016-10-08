package com.android.dazhihui.a.b;

import android.util.Log;
import com.android.dazhihui.d.b.b;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class o
  implements j
{
  private static o b = null;
  private static List<Integer> c = new ArrayList();
  protected byte a = -1;
  private boolean d = false;
  private p e = null;
  private int f = 0;
  private boolean g = false;
  private boolean h = false;
  private byte[] i = null;
  private int j = 0;
  private Object k;
  
  static
  {
    c.add(Integer.valueOf(0));
    c.add(Integer.valueOf(1000));
    c.add(Integer.valueOf(1003));
    c.add(Integer.valueOf(1085));
    c.add(Integer.valueOf(1137));
    c.add(Integer.valueOf(1138));
    c.add(Integer.valueOf(1139));
    c.add(Integer.valueOf(1140));
    c.add(Integer.valueOf(1141));
    c.add(Integer.valueOf(1142));
    c.add(Integer.valueOf(1143));
    c.add(Integer.valueOf(1144));
    c.add(Integer.valueOf(1156));
    c.add(Integer.valueOf(1157));
    c.add(Integer.valueOf(1158));
    c.add(Integer.valueOf(1904));
    c.add(Integer.valueOf(2204));
    c.add(Integer.valueOf(2206));
    c.add(Integer.valueOf(2207));
    c.add(Integer.valueOf(2300));
    c.add(Integer.valueOf(2301));
    c.add(Integer.valueOf(2310));
    c.add(Integer.valueOf(2311));
    c.add(Integer.valueOf(2312));
    c.add(Integer.valueOf(2313));
    c.add(Integer.valueOf(2314));
    c.add(Integer.valueOf(2315));
    c.add(Integer.valueOf(2316));
    c.add(Integer.valueOf(2331));
    c.add(Integer.valueOf(2602));
    c.add(Integer.valueOf(2907));
    c.add(Integer.valueOf(2915));
    c.add(Integer.valueOf(2916));
    c.add(Integer.valueOf(2917));
    c.add(Integer.valueOf(2918));
    c.add(Integer.valueOf(2919));
    c.add(Integer.valueOf(2920));
    c.add(Integer.valueOf(2922));
    c.add(Integer.valueOf(2923));
    c.add(Integer.valueOf(2924));
    c.add(Integer.valueOf(2925));
    c.add(Integer.valueOf(2928));
    c.add(Integer.valueOf(2929));
    c.add(Integer.valueOf(2930));
    c.add(Integer.valueOf(2931));
    c.add(Integer.valueOf(2933));
    c.add(Integer.valueOf(2938));
    c.add(Integer.valueOf(2939));
    c.add(Integer.valueOf(2940));
    c.add(Integer.valueOf(2941));
    c.add(Integer.valueOf(2942));
    c.add(Integer.valueOf(2943));
    c.add(Integer.valueOf(2944));
    c.add(Integer.valueOf(2946));
    c.add(Integer.valueOf(2948));
    c.add(Integer.valueOf(2951));
    c.add(Integer.valueOf(2952));
    c.add(Integer.valueOf(2955));
    c.add(Integer.valueOf(2956));
    c.add(Integer.valueOf(2954));
    c.add(Integer.valueOf(2957));
    c.add(Integer.valueOf(2958));
    c.add(Integer.valueOf(2960));
    c.add(Integer.valueOf(2963));
    c.add(Integer.valueOf(2965));
    c.add(Integer.valueOf(2972));
    c.add(Integer.valueOf(2973));
    c.add(Integer.valueOf(2974));
    c.add(Integer.valueOf(2976));
    c.add(Integer.valueOf(2977));
    c.add(Integer.valueOf(2978));
    c.add(Integer.valueOf(2981));
    c.add(Integer.valueOf(2984));
    c.add(Integer.valueOf(2986));
    c.add(Integer.valueOf(2987));
    c.add(Integer.valueOf(2988));
    c.add(Integer.valueOf(2989));
    c.add(Integer.valueOf(2990));
    c.add(Integer.valueOf(2991));
    c.add(Integer.valueOf(2992));
    c.add(Integer.valueOf(2993));
    c.add(Integer.valueOf(2994));
    c.add(Integer.valueOf(2996));
    c.add(Integer.valueOf(2997));
    c.add(Integer.valueOf(3000));
    c.add(Integer.valueOf(3001));
    c.add(Integer.valueOf(3003));
    c.add(Integer.valueOf(3004));
    c.add(Integer.valueOf(3005));
    c.add(Integer.valueOf(3007));
    c.add(Integer.valueOf(3008));
    c.add(Integer.valueOf(3009));
    c.add(Integer.valueOf(3010));
    c.add(Integer.valueOf(10000));
  }
  
  public o() {}
  
  public o(int paramInt, byte paramByte)
  {
    this.f = paramInt;
    this.a = paramByte;
  }
  
  private static boolean b(int paramInt)
  {
    Iterator localIterator = c.iterator();
    while (localIterator.hasNext()) {
      if (paramInt == ((Integer)localIterator.next()).intValue()) {
        return true;
      }
    }
    return false;
  }
  
  public static List<o> d(byte[] paramArrayOfByte)
  {
    label305:
    label393:
    label404:
    label430:
    label470:
    label655:
    label705:
    label735:
    label753:
    for (;;)
    {
      ArrayList localArrayList;
      int m;
      byte[] arrayOfByte2;
      boolean bool;
      byte b1;
      try
      {
        localArrayList = new ArrayList();
        Log.d("Protocol", "response length: " + paramArrayOfByte.length + "   ");
        paramArrayOfByte = new q(paramArrayOfByte);
        m = paramArrayOfByte.c();
        n = m;
        if (b != null)
        {
          if (m < b.l()) {
            continue;
          }
          n = 1;
          if (n == 0) {
            continue;
          }
          i1 = b.l();
        }
        try
        {
          byte[] arrayOfByte1 = paramArrayOfByte.a(i1);
          arrayOfByte2 = new byte[b.k().length + arrayOfByte1.length];
          System.arraycopy(b.k(), 0, arrayOfByte2, 0, b.k().length);
          System.arraycopy(arrayOfByte1, 0, arrayOfByte2, b.k().length, arrayOfByte1.length);
          if (n == 0) {
            break label404;
          }
          bool = b.g;
          if (!bool) {
            break label393;
          }
        }
        catch (IOException paramArrayOfByte)
        {
          paramArrayOfByte.printStackTrace();
          b = null;
          continue;
        }
        try
        {
          n = b.e();
          if (n != 2942) {
            continue;
          }
          b.c(b.a(arrayOfByte2));
        }
        catch (Exception localException1)
        {
          localException1.printStackTrace();
          continue;
        }
        localArrayList.add(b);
        b = null;
        n = m;
        if (n <= 0) {
          break label753;
        }
      }
      finally {}
      try
      {
        m = paramArrayOfByte.b();
        b1 = (byte)m;
        Log.d("Tag", "response tag: " + b1 + "   ");
        n = paramArrayOfByte.e();
        Log.d("Protocol", "response protocol: " + n + "   ");
        if (n != 0) {
          break label430;
        }
        b = null;
      }
      catch (RuntimeException paramArrayOfByte)
      {
        continue;
        m = 1;
      }
      return localArrayList;
      int n = 0;
      continue;
      int i1 = m;
      continue;
      if (n == 2944)
      {
        b.c(b.b(arrayOfByte2));
      }
      else if (n == 2933)
      {
        b.c(b.c(arrayOfByte2));
        continue;
        b.c(arrayOfByte2);
        continue;
        b.b(arrayOfByte2);
        b.a(b.l() - m);
        continue;
        m = paramArrayOfByte.e();
        i1 = m & 0x2;
        if ((m & 0x8) != 8) {
          if (n == 2956) {
            break label735;
          }
        }
        for (;;)
        {
          b = null;
          bool = true;
          o localo = new o(n, b1);
          localo.a(bool);
          m = paramArrayOfByte.c(m);
          if ((m < 0) || (!b(n)))
          {
            b = null;
            break label753;
          }
          int i2 = paramArrayOfByte.c();
          if (i2 < m)
          {
            if (i1 == 2) {
              localo.b(true);
            }
            b = localo;
            try
            {
              b.b(paramArrayOfByte.a(i2));
              b.a(m - i2);
            }
            catch (IOException paramArrayOfByte)
            {
              paramArrayOfByte.printStackTrace();
              b = null;
            }
            break label305;
          }
          for (;;)
          {
            try
            {
              arrayOfByte2 = paramArrayOfByte.a(m);
              if (i1 != 2) {
                break label705;
              }
              localo.b(true);
            }
            catch (IOException paramArrayOfByte)
            {
              paramArrayOfByte.printStackTrace();
              b = null;
            }
            try
            {
              localo.c(b.a(arrayOfByte2));
              if (n != 2942) {
                break label655;
              }
              localo.c(b.a(arrayOfByte2));
            }
            catch (Exception localException2)
            {
              localException2.printStackTrace();
              continue;
              if (n != 2933) {
                continue;
              }
              localo.c(b.c(localException2));
              continue;
            }
            localArrayList.add(localo);
            n = paramArrayOfByte.c();
            break;
            break label305;
            if (n == 2944)
            {
              localo.c(b.b(arrayOfByte2));
            }
            else
            {
              localo.b(false);
              localo.c(localException2);
            }
          }
          do
          {
            bool = false;
            break label470;
            m = 0;
            if (b1 == 0) {
              break;
            }
          } while (n != 2907);
        }
      }
    }
  }
  
  public static void d()
  {
    try
    {
      b = null;
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  public void a(int paramInt)
  {
    this.j = paramInt;
  }
  
  public void a(Object paramObject)
  {
    this.k = paramObject;
  }
  
  public void a(boolean paramBoolean)
  {
    this.d = paramBoolean;
  }
  
  public void b(boolean paramBoolean)
  {
    this.g = paramBoolean;
  }
  
  public void b(byte[] paramArrayOfByte)
  {
    this.i = paramArrayOfByte;
  }
  
  public void c(boolean paramBoolean)
  {
    this.h = paramBoolean;
  }
  
  public void c(byte[] paramArrayOfByte)
  {
    this.e = new p(this, this.f, paramArrayOfByte);
  }
  
  public int e()
  {
    return this.f;
  }
  
  public byte f()
  {
    return this.a;
  }
  
  public boolean g()
  {
    return this.d;
  }
  
  public p h()
  {
    return this.e;
  }
  
  public boolean i()
  {
    return this.g;
  }
  
  public boolean j()
  {
    return this.h;
  }
  
  public byte[] k()
  {
    return this.i;
  }
  
  public int l()
  {
    return this.j;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\a\b\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */