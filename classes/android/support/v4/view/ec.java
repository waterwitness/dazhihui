package android.support.v4.view;

import android.view.View;
import android.view.ViewPropertyAnimator;

class ec
{
  public static void a(View paramView)
  {
    paramView.animate().start();
  }
  
  public static void a(View paramView, float paramFloat)
  {
    paramView.animate().alpha(paramFloat);
  }
  
  public static void a(View paramView, long paramLong)
  {
    paramView.animate().setDuration(paramLong);
  }
  
  public static void a(View paramView, eg parameg)
  {
    if (parameg != null)
    {
      paramView.animate().setListener(new ed(parameg, paramView));
      return;
    }
    paramView.animate().setListener(null);
  }
  
  public static void b(View paramView, float paramFloat)
  {
    paramView.animate().translationX(paramFloat);
  }
  
  public static void c(View paramView, float paramFloat)
  {
    paramView.animate().translationY(paramFloat);
  }
  
  public static void cancel(View paramView)
  {
    paramView.animate().cancel();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\view\ec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */