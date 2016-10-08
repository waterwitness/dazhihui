package com.baidu.location.e;

import java.util.Locale;

class ad
{
  public int a = -1;
  public int b = -1;
  public int c = -1;
  public int d = -1;
  public char e = '\000';
  
  private ad(aa paramaa) {}
  
  private boolean b()
  {
    return (this.a > -1) && (this.b > 0);
  }
  
  public String a()
  {
    if (!b()) {
      return null;
    }
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
  
  public String toString()
  {
    if (!b()) {
      return null;
    }
    StringBuffer localStringBuffer = new StringBuffer(128);
    localStringBuffer.append("&nw=");
    localStringBuffer.append(this.e);
    localStringBuffer.append(String.format(Locale.CHINA, "&cl=%d|%d|%d|%d", new Object[] { Integer.valueOf(this.c), Integer.valueOf(this.d), Integer.valueOf(this.a), Integer.valueOf(this.b) }));
    return localStringBuffer.toString();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\e\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */