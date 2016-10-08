package android.support.v7.widget;

import android.view.View;

public abstract class ad
{
  protected final aw a;
  private int b = Integer.MIN_VALUE;
  
  private ad(aw paramaw)
  {
    this.a = paramaw;
  }
  
  public static ad a(aw paramaw)
  {
    return new ae(paramaw);
  }
  
  public static ad a(aw paramaw, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      throw new IllegalArgumentException("invalid orientation");
    case 0: 
      return a(paramaw);
    }
    return b(paramaw);
  }
  
  public static ad b(aw paramaw)
  {
    return new af(paramaw);
  }
  
  public abstract int a(View paramView);
  
  public void a()
  {
    this.b = f();
  }
  
  public abstract void a(int paramInt);
  
  public int b()
  {
    if (Integer.MIN_VALUE == this.b) {
      return 0;
    }
    return f() - this.b;
  }
  
  public abstract int b(View paramView);
  
  public abstract int c();
  
  public abstract int c(View paramView);
  
  public abstract int d();
  
  public abstract int d(View paramView);
  
  public abstract int e();
  
  public abstract int f();
  
  public abstract int g();
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v7\widget\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */