package android.support.v4.view;

import android.os.Bundle;
import android.support.v4.view.a.al;
import android.support.v4.view.a.g;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;

class dd
  extends a
{
  dd(ViewPager paramViewPager) {}
  
  private boolean b()
  {
    return (ViewPager.access$200(this.b) != null) && (ViewPager.access$200(this.b).getCount() > 1);
  }
  
  public void a(View paramView, g paramg)
  {
    super.a(paramView, paramg);
    paramg.b(ViewPager.class.getName());
    paramg.i(b());
    if (this.b.canScrollHorizontally(1)) {
      paramg.a(4096);
    }
    if (this.b.canScrollHorizontally(-1)) {
      paramg.a(8192);
    }
  }
  
  public boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    if (super.a(paramView, paramInt, paramBundle)) {
      return true;
    }
    switch (paramInt)
    {
    default: 
      return false;
    case 4096: 
      if (this.b.canScrollHorizontally(1))
      {
        this.b.setCurrentItem(ViewPager.access$300(this.b) + 1);
        return true;
      }
      return false;
    }
    if (this.b.canScrollHorizontally(-1))
    {
      this.b.setCurrentItem(ViewPager.access$300(this.b) - 1);
      return true;
    }
    return false;
  }
  
  public void d(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    super.d(paramView, paramAccessibilityEvent);
    paramAccessibilityEvent.setClassName(ViewPager.class.getName());
    paramView = al.a();
    paramView.a(b());
    if ((paramAccessibilityEvent.getEventType() == 4096) && (ViewPager.access$200(this.b) != null))
    {
      paramView.a(ViewPager.access$200(this.b).getCount());
      paramView.b(ViewPager.access$300(this.b));
      paramView.c(ViewPager.access$300(this.b));
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\view\dd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */