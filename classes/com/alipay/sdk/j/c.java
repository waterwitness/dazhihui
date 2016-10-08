package com.alipay.sdk.j;

public enum c
{
  public String p;
  private int q;
  
  private c(int paramInt, String paramString)
  {
    this.q = paramInt;
    this.p = paramString;
  }
  
  public static c a(int paramInt)
  {
    c[] arrayOfc = values();
    int i2 = arrayOfc.length;
    int i1 = 0;
    while (i1 < i2)
    {
      c localc = arrayOfc[i1];
      if (localc.q == paramInt) {
        return localc;
      }
      i1 += 1;
    }
    return o;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\sdk\j\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */