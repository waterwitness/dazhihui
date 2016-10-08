package com.d.a;

class bh
  extends bk
{
  bi<byte[]> a;
  
  public bh(int paramInt, bi<byte[]> parambi)
  {
    super(paramInt);
    if (paramInt <= 0) {
      throw new IllegalArgumentException("length should be > 0");
    }
    this.a = parambi;
  }
  
  public bk a(al paramal, ai paramai)
  {
    paramal = new byte[this.c];
    paramai.a(paramal);
    this.a.a(paramal);
    return null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\d\a\bh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */