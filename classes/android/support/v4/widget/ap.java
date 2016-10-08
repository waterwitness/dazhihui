package android.support.v4.widget;

import android.view.View;

class ap
  extends bi
{
  private ap(SlidingPaneLayout paramSlidingPaneLayout) {}
  
  public int a(View paramView)
  {
    return SlidingPaneLayout.f(this.a);
  }
  
  public int a(View paramView, int paramInt1, int paramInt2)
  {
    paramView = (SlidingPaneLayout.LayoutParams)SlidingPaneLayout.d(this.a).getLayoutParams();
    if (SlidingPaneLayout.e(this.a))
    {
      paramInt2 = this.a.getWidth();
      i = this.a.getPaddingRight();
      paramInt2 -= paramView.rightMargin + i + SlidingPaneLayout.d(this.a).getWidth();
      i = SlidingPaneLayout.f(this.a);
      return Math.max(Math.min(paramInt1, paramInt2), paramInt2 - i);
    }
    paramInt2 = this.a.getPaddingLeft();
    paramInt2 = paramView.leftMargin + paramInt2;
    int i = SlidingPaneLayout.f(this.a);
    return Math.min(Math.max(paramInt1, paramInt2), i + paramInt2);
  }
  
  public void a(int paramInt)
  {
    if (SlidingPaneLayout.b(this.a).a() == 0)
    {
      if (SlidingPaneLayout.c(this.a) == 0.0F)
      {
        this.a.d(SlidingPaneLayout.d(this.a));
        this.a.c(SlidingPaneLayout.d(this.a));
        SlidingPaneLayout.a(this.a, false);
      }
    }
    else {
      return;
    }
    this.a.b(SlidingPaneLayout.d(this.a));
    SlidingPaneLayout.a(this.a, true);
  }
  
  public void a(View paramView, float paramFloat1, float paramFloat2)
  {
    SlidingPaneLayout.LayoutParams localLayoutParams = (SlidingPaneLayout.LayoutParams)paramView.getLayoutParams();
    int i;
    int j;
    if (SlidingPaneLayout.e(this.a))
    {
      i = this.a.getPaddingRight();
      j = localLayoutParams.rightMargin + i;
      if (paramFloat1 >= 0.0F)
      {
        i = j;
        if (paramFloat1 == 0.0F)
        {
          i = j;
          if (SlidingPaneLayout.c(this.a) <= 0.5F) {}
        }
      }
      else
      {
        i = j + SlidingPaneLayout.f(this.a);
      }
      j = SlidingPaneLayout.d(this.a).getWidth();
      i = this.a.getWidth() - i - j;
    }
    for (;;)
    {
      SlidingPaneLayout.b(this.a).a(i, paramView.getTop());
      this.a.invalidate();
      return;
      i = this.a.getPaddingLeft();
      j = localLayoutParams.leftMargin + i;
      if (paramFloat1 <= 0.0F)
      {
        i = j;
        if (paramFloat1 == 0.0F)
        {
          i = j;
          if (SlidingPaneLayout.c(this.a) <= 0.5F) {}
        }
      }
      else
      {
        i = j + SlidingPaneLayout.f(this.a);
      }
    }
  }
  
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    SlidingPaneLayout.a(this.a, paramInt1);
    this.a.invalidate();
  }
  
  public boolean a(View paramView, int paramInt)
  {
    if (SlidingPaneLayout.a(this.a)) {
      return false;
    }
    return ((SlidingPaneLayout.LayoutParams)paramView.getLayoutParams()).b;
  }
  
  public int b(View paramView, int paramInt1, int paramInt2)
  {
    return paramView.getTop();
  }
  
  public void b(int paramInt1, int paramInt2)
  {
    SlidingPaneLayout.b(this.a).a(SlidingPaneLayout.d(this.a), paramInt2);
  }
  
  public void b(View paramView, int paramInt)
  {
    this.a.a();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\widget\ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */