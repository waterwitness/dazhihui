package com.handmark.pulltorefresh.library;

public enum j
{
  public static j f = b;
  public static j g = c;
  private int h;
  
  private j(int paramInt)
  {
    this.h = paramInt;
  }
  
  static j a()
  {
    return b;
  }
  
  static j a(int paramInt)
  {
    j[] arrayOfj = values();
    int k = arrayOfj.length;
    int j = 0;
    while (j < k)
    {
      j localj = arrayOfj[j];
      if (paramInt == localj.e()) {
        return localj;
      }
      j += 1;
    }
    return a();
  }
  
  boolean b()
  {
    return (this != a) && (this != e);
  }
  
  public boolean c()
  {
    return (this == b) || (this == d);
  }
  
  public boolean d()
  {
    return (this == c) || (this == d) || (this == e);
  }
  
  int e()
  {
    return this.h;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\handmark\pulltorefresh\library\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */