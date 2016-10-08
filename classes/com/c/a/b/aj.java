package com.c.a.b;

class aj
  implements CharSequence
{
  char[] a;
  
  public char charAt(int paramInt)
  {
    return this.a[paramInt];
  }
  
  public int length()
  {
    return this.a.length;
  }
  
  public CharSequence subSequence(int paramInt1, int paramInt2)
  {
    return new String(this.a, paramInt1, paramInt2 - paramInt1);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\a\b\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */