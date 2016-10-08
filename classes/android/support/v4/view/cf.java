package android.support.v4.view;

import android.view.View;
import android.view.View.AccessibilityDelegate;

class cf
{
  public static void a(View paramView, Object paramObject)
  {
    paramView.setAccessibilityDelegate((View.AccessibilityDelegate)paramObject);
  }
  
  public static boolean a(View paramView, int paramInt)
  {
    return paramView.canScrollHorizontally(paramInt);
  }
  
  public static boolean b(View paramView, int paramInt)
  {
    return paramView.canScrollVertically(paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\view\cf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */