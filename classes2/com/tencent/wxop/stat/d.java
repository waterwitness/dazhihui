package com.tencent.wxop.stat;

public enum d
{
  int aI;
  
  private d(int paramInt)
  {
    this.aI = paramInt;
  }
  
  public static d a(int paramInt)
  {
    d[] arrayOfd = values();
    int j = arrayOfd.length;
    int i = 0;
    while (i < j)
    {
      d locald = arrayOfd[i];
      if (paramInt == locald.aI) {
        return locald;
      }
      i += 1;
    }
    return null;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\wxop\stat\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */