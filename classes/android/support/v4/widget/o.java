package android.support.v4.widget;

import android.view.View;
import android.view.View.OnApplyWindowInsetsListener;
import android.view.WindowInsets;

class o
  implements View.OnApplyWindowInsetsListener
{
  public WindowInsets onApplyWindowInsets(View paramView, WindowInsets paramWindowInsets)
  {
    paramView = (p)paramView;
    if (paramWindowInsets.getSystemWindowInsetTop() > 0) {}
    for (boolean bool = true;; bool = false)
    {
      paramView.a(paramWindowInsets, bool);
      return paramWindowInsets.consumeSystemWindowInsets();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\widget\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */