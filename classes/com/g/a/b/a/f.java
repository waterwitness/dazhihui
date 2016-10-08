package com.g.a.b.a;

public class f
{
  private final int a;
  private final int b;
  
  public f(int paramInt1, int paramInt2)
  {
    this.a = paramInt1;
    this.b = paramInt2;
  }
  
  public f(int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramInt3 % 180 == 0)
    {
      this.a = paramInt1;
      this.b = paramInt2;
      return;
    }
    this.a = paramInt2;
    this.b = paramInt1;
  }
  
  public int a()
  {
    return this.a;
  }
  
  public f a(float paramFloat)
  {
    return new f((int)(this.a * paramFloat), (int)(this.b * paramFloat));
  }
  
  public f a(int paramInt)
  {
    return new f(this.a / paramInt, this.b / paramInt);
  }
  
  public int b()
  {
    return this.b;
  }
  
  public String toString()
  {
    return 9 + this.a + "x" + this.b;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\g\a\b\a\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */