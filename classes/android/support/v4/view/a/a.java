package android.support.v4.view.a;

import android.os.Build.VERSION;
import android.view.accessibility.AccessibilityEvent;

public class a
{
  private static final e a = new d();
  
  static
  {
    if (Build.VERSION.SDK_INT >= 19)
    {
      a = new c();
      return;
    }
    if (Build.VERSION.SDK_INT >= 14)
    {
      a = new b();
      return;
    }
  }
  
  public static al a(AccessibilityEvent paramAccessibilityEvent)
  {
    return new al(paramAccessibilityEvent);
  }
  
  public static void a(AccessibilityEvent paramAccessibilityEvent, int paramInt)
  {
    a.a(paramAccessibilityEvent, paramInt);
  }
  
  public static int b(AccessibilityEvent paramAccessibilityEvent)
  {
    return a.a(paramAccessibilityEvent);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\view\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */