package android.support.v4.view;

import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v4.view.a.y;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;

public class a
{
  private static final d b;
  private static final Object c;
  final Object a = b.a(this);
  
  static
  {
    if (Build.VERSION.SDK_INT >= 16) {
      b = new e();
    }
    for (;;)
    {
      c = b.a();
      return;
      if (Build.VERSION.SDK_INT >= 14) {
        b = new b();
      } else {
        b = new g();
      }
    }
  }
  
  public y a(View paramView)
  {
    return b.a(c, paramView);
  }
  
  Object a()
  {
    return this.a;
  }
  
  public void a(View paramView, int paramInt)
  {
    b.a(c, paramView, paramInt);
  }
  
  public void a(View paramView, android.support.v4.view.a.g paramg)
  {
    b.a(c, paramView, paramg);
  }
  
  public void a(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    b.d(c, paramView, paramAccessibilityEvent);
  }
  
  public boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    return b.a(c, paramView, paramInt, paramBundle);
  }
  
  public boolean a(ViewGroup paramViewGroup, View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return b.a(c, paramViewGroup, paramView, paramAccessibilityEvent);
  }
  
  public boolean b(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    return b.a(c, paramView, paramAccessibilityEvent);
  }
  
  public void c(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    b.c(c, paramView, paramAccessibilityEvent);
  }
  
  public void d(View paramView, AccessibilityEvent paramAccessibilityEvent)
  {
    b.b(c, paramView, paramAccessibilityEvent);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\view\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */