package com.baidu.location.h;

import java.util.Locale;

public class n
{
  public int a = -1;
  public int b = -1;
  public int c = -1;
  public int d = -1;
  public int e = Integer.MAX_VALUE;
  public int f = Integer.MAX_VALUE;
  public long g = 0L;
  public int h = -1;
  public char i = '\000';
  private boolean j = false;
  
  public n()
  {
    this.g = System.currentTimeMillis();
  }
  
  public n(int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, char paramChar)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramInt4;
    this.h = paramInt5;
    this.i = paramChar;
    this.g = System.currentTimeMillis();
  }
  
  public n(n paramn)
  {
    this(paramn.a, paramn.b, paramn.c, paramn.d, paramn.h, paramn.i);
  }
  
  public int a()
  {
    int m = 2;
    int k = m;
    if (this.c > 0)
    {
      k = m;
      if (c())
      {
        if ((this.c != 460) && (this.c != 454) && (this.c != 455) && (this.c != 466)) {
          break label64;
        }
        k = 1;
      }
    }
    return k;
    label64:
    return 0;
  }
  
  public boolean a(n paramn)
  {
    return (this.a == paramn.a) && (this.b == paramn.b) && (this.d == paramn.d) && (this.c == paramn.c);
  }
  
  public boolean b()
  {
    return System.currentTimeMillis() - this.g < 3000L;
  }
  
  public boolean c()
  {
    return (this.a > -1) && (this.b > 0);
  }
  
  public boolean d()
  {
    return (this.a == -1) && (this.b == -1) && (this.d == -1) && (this.c == -1);
  }
  
  public boolean e()
  {
    return (this.a > -1) && (this.b > -1) && (this.d == -1) && (this.c == -1);
  }
  
  public boolean f()
  {
    return (this.a > -1) && (this.b > -1) && (this.d > -1) && (this.c > -1);
  }
  
  public void g()
  {
    this.j = true;
  }
  
  public String h()
  {
    StringBuffer localStringBuffer = new StringBuffer(128);
    localStringBuffer.append(this.b + 23);
    localStringBuffer.append("H");
    localStringBuffer.append(this.a + 45);
    localStringBuffer.append("K");
    localStringBuffer.append(this.d + 54);
    localStringBuffer.append("Q");
    localStringBuffer.append(this.c + 203);
    return localStringBuffer.toString();
  }
  
  public String i()
  {
    if (c()) {
      return String.format(Locale.CHINA, "<cell-tower>\n<mcc>%d</mcc><mnc>%d</mnc><lac>%d</lac><ci>%d</ci><rssi>%d</rssi></cell-tower>", new Object[] { Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.h) });
    }
    return null;
  }
  
  public String j()
  {
    StringBuffer localStringBuffer = new StringBuffer(128);
    localStringBuffer.append("&nw=");
    localStringBuffer.append(this.i);
    localStringBuffer.append(String.format(Locale.CHINA, "&cl=%d|%d|%d|%d&cl_s=%d", new Object[] { Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.a), Integer.valueOf(this.b), Integer.valueOf(this.h) }));
    if (this.j) {
      localStringBuffer.append("&newcl=1");
    }
    return localStringBuffer.toString();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\h\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */