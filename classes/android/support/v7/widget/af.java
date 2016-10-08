package android.support.v7.widget;

import android.view.View;

final class af
  extends ad
{
  af(aw paramaw)
  {
    super(paramaw, null);
  }
  
  public int a(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    return this.a.h(paramView) - localLayoutParams.topMargin;
  }
  
  public void a(int paramInt)
  {
    this.a.j(paramInt);
  }
  
  public int b(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    int i = this.a.j(paramView);
    return localLayoutParams.bottomMargin + i;
  }
  
  public int c()
  {
    return this.a.v();
  }
  
  public int c(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    int i = this.a.f(paramView);
    int j = localLayoutParams.topMargin;
    return localLayoutParams.bottomMargin + (i + j);
  }
  
  public int d()
  {
    return this.a.t() - this.a.x();
  }
  
  public int d(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    int i = this.a.e(paramView);
    int j = localLayoutParams.leftMargin;
    return localLayoutParams.rightMargin + (i + j);
  }
  
  public int e()
  {
    return this.a.t();
  }
  
  public int f()
  {
    return this.a.t() - this.a.v() - this.a.x();
  }
  
  public int g()
  {
    return this.a.x();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v7\widget\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */