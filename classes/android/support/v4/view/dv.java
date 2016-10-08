package android.support.v4.view;

import android.view.View;
import java.util.WeakHashMap;

class dv
  extends dt
{
  WeakHashMap<View, Integer> b = null;
  
  public void a(dr paramdr, View paramView)
  {
    ec.a(paramView);
  }
  
  public void a(dr paramdr, View paramView, float paramFloat)
  {
    ec.a(paramView, paramFloat);
  }
  
  public void a(dr paramdr, View paramView, long paramLong)
  {
    ec.a(paramView, paramLong);
  }
  
  public void a(dr paramdr, View paramView, eg parameg)
  {
    paramView.setTag(2113929216, parameg);
    ec.a(paramView, new dw(paramdr));
  }
  
  public void b(dr paramdr, View paramView, float paramFloat)
  {
    ec.b(paramView, paramFloat);
  }
  
  public void c(dr paramdr, View paramView, float paramFloat)
  {
    ec.c(paramView, paramFloat);
  }
  
  public void cancel(dr paramdr, View paramView)
  {
    ec.cancel(paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\view\dv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */