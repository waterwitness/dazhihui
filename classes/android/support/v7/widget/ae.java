package android.support.v7.widget;

import android.view.View;

final class ae
  extends ad
{
  ae(aw paramaw)
  {
    super(paramaw, null);
  }
  
  public int a(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    return this.a.g(paramView) - localLayoutParams.leftMargin;
  }
  
  public void a(int paramInt)
  {
    this.a.i(paramInt);
  }
  
  public int b(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    int i = this.a.i(paramView);
    return localLayoutParams.rightMargin + i;
  }
  
  public int c()
  {
    return this.a.u();
  }
  
  public int c(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    int i = this.a.e(paramView);
    int j = localLayoutParams.leftMargin;
    return localLayoutParams.rightMargin + (i + j);
  }
  
  public int d()
  {
    return this.a.s() - this.a.w();
  }
  
  public int d(View paramView)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    int i = this.a.f(paramView);
    int j = localLayoutParams.topMargin;
    return localLayoutParams.bottomMargin + (i + j);
  }
  
  public int e()
  {
    return this.a.s();
  }
  
  public int f()
  {
    return this.a.s() - this.a.u() - this.a.w();
  }
  
  public int g()
  {
    return this.a.w();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v7\widget\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */