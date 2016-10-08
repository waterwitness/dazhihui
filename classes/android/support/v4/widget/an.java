package android.support.v4.widget;

import android.graphics.Rect;
import android.support.v4.view.a;
import android.support.v4.view.a.g;
import android.support.v4.view.bn;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

class an
  extends a
{
  private final Rect c = new Rect();
  
  an(SlidingPaneLayout paramSlidingPaneLayout) {}
  
  private void a(g paramg1, g paramg2)
  {
    Rect localRect = this.c;
    paramg2.a(localRect);
    paramg1.b(localRect);
    paramg2.c(localRect);
    paramg1.d(localRect);
    paramg1.c(paramg2.h());
    paramg1.a(paramg2.p());
    paramg1.b(paramg2.q());
    paramg1.c(paramg2.s());
    paramg1.h(paramg2.m());
    paramg1.f(paramg2.k());
    paramg1.a(paramg2.f());
    paramg1.b(paramg2.g());
    paramg1.d(paramg2.i());
    paramg1.e(paramg2.j());
    paramg1.g(paramg2.l());
    paramg1.a(paramg2.b());
    paramg1.b(paramg2.c());
  }
  
  public void a(View paramView, g paramg)
  {
    g localg = g.a(paramg);
    super.a(paramView, localg);
    a(paramg, localg);
    localg.t();
    paramg.b(SlidingPaneLayout.class.getName());
    paramg.a(paramView);
    paramView = bn.i(paramView);
    if ((paramView instanceof View)) {
      paramg.c((View)paramView);
    }
    int j = this.b.getChildCount();
    int i = 0;
    while (i < j)
    {
      paramView = this.b.getChildAt(i);
      if ((!b(paramView)) && (paramView.getVisibility() == 0))
      {
        bn.c(paramView, 1);
        paramg.b(paramView);
      }
      i += 1;
    }
  }
  
  public boolean a(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    if (!b(paramView)) {
      return super.a(paramViewGroup, paramView, paramAccessibilityEvent);
    }
    return false;
  }
  
  public boolean b(View paramView)
  {
    return this.b.e(paramView);
  }
  
  public void d(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.d(paramView, paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(SlidingPaneLayout.class.getName());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\widget\an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */