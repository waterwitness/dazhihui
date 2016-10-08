package com.handmark.pulltorefresh.library;

public enum r
{
  private int g;
  
  private r(int paramInt)
  {
    this.g = paramInt;
  }
  
  static r a(int paramInt)
  {
    r[] arrayOfr = values();
    int j = arrayOfr.length;
    int i = 0;
    while (i < j)
    {
      r localr = arrayOfr[i];
      if (paramInt == localr.a()) {
        return localr;
      }
      i += 1;
    }
    return a;
  }
  
  int a()
  {
    return this.g;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\handmark\pulltorefresh\library\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */