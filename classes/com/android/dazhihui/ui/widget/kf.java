package com.android.dazhihui.ui.widget;

public class kf
{
  public int a;
  public int b;
  public int c;
  public int d;
  public kf e = null;
  
  public kf()
  {
    this(0, 0, 0, 0);
  }
  
  public kf(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.d = paramInt4;
  }
  
  public int a()
  {
    return this.a;
  }
  
  public void a(kf paramkf)
  {
    this.c = paramkf.c();
    this.d = paramkf.d();
    this.a = paramkf.a();
    this.b = paramkf.b();
  }
  
  public boolean a(int paramInt1, int paramInt2)
  {
    return b(paramInt1, paramInt2);
  }
  
  public int b()
  {
    return this.b;
  }
  
  public boolean b(int paramInt1, int paramInt2)
  {
    int m = this.c;
    int k = this.d;
    if ((m | k) < 0) {}
    int i;
    int j;
    do
    {
      do
      {
        return false;
        i = this.a;
        j = this.b;
      } while ((paramInt1 < i) || (paramInt2 < j));
      m += i;
      k += j;
    } while (((m >= i) && (m <= paramInt1)) || ((k >= j) && (k <= paramInt2)));
    return true;
  }
  
  public int c()
  {
    return this.c;
  }
  
  public int d()
  {
    return this.d;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\kf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */