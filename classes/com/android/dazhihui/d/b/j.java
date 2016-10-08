package com.android.dazhihui.d.b;

class j
{
  public int a;
  
  public int a()
  {
    return this.a & 0x3F;
  }
  
  public void a(int paramInt)
  {
    this.a = (this.a & 0xFFFFFFC0 | paramInt);
  }
  
  public int b()
  {
    return this.a >> 6 & 0x1F;
  }
  
  public void b(int paramInt)
  {
    this.a = (this.a & 0xF83F | paramInt << 6);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\d\b\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */