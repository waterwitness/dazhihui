package android.support.v4.view;

import android.view.View;
import android.view.ViewPropertyAnimator;

class ee
{
  public static void a(View paramView, eg parameg)
  {
    if (parameg != null)
    {
      paramView.animate().setListener(new ef(parameg, paramView));
      return;
    }
    paramView.animate().setListener(null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\view\ee.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */