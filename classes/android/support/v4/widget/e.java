package android.support.v4.widget;

import android.graphics.Rect;
import android.support.v4.view.a;
import android.support.v4.view.a.g;
import android.support.v4.view.a.h;
import android.support.v4.view.bn;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

class e
  extends a
{
  private final Rect c = new Rect();
  
  e(DrawerLayout paramDrawerLayout) {}
  
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
  }
  
  private void a(g paramg, ViewGroup paramViewGroup)
  {
    int j = paramViewGroup.getChildCount();
    int i = 0;
    while (i < j)
    {
      View localView = paramViewGroup.getChildAt(i);
      if (DrawerLayout.l(localView)) {
        paramg.b(localView);
      }
      i += 1;
    }
  }
  
  public void a(View paramView, g paramg)
  {
    if (DrawerLayout.e()) {
      super.a(paramView, paramg);
    }
    for (;;)
    {
      paramg.b(DrawerLayout.class.getName());
      paramg.a(false);
      paramg.b(false);
      paramg.a(h.a);
      paramg.a(h.b);
      return;
      g localg = g.a(paramg);
      super.a(paramView, localg);
      paramg.a(paramView);
      ViewParent localViewParent = bn.i(paramView);
      if ((localViewParent instanceof View)) {
        paramg.c((View)localViewParent);
      }
      a(paramg, localg);
      localg.t();
      a(paramg, (ViewGroup)paramView);
    }
  }
  
  public boolean a(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    if ((DrawerLayout.e()) || (DrawerLayout.l(paramView))) {
      return super.a(paramViewGroup, paramView, paramAccessibilityEvent);
    }
    return false;
  }
  
  public boolean b(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    if (paramAccessibilityEvent.getEventType() == 32)
    {
      paramView = paramAccessibilityEvent.getText();
      paramAccessibilityEvent = DrawerLayout.a(this.b);
      if (paramAccessibilityEvent != null)
      {
        int i = this.b.e(paramAccessibilityEvent);
        paramAccessibilityEvent = this.b.a(i);
        if (paramAccessibilityEvent != null) {
          paramView.add(paramAccessibilityEvent);
        }
      }
      return true;
    }
    return super.b(paramView, paramAccessibilityEvent);
  }
  
  public void d(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.d(paramView, paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(DrawerLayout.class.getName());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\widget\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */