package android.support.v4.view;

import android.view.View;
import java.util.WeakHashMap;

class dt
  implements eb
{
  WeakHashMap<View, Runnable> a = null;
  
  private void a(View paramView)
  {
    if (this.a != null)
    {
      Runnable localRunnable = (Runnable)this.a.get(paramView);
      if (localRunnable != null) {
        paramView.removeCallbacks(localRunnable);
      }
    }
  }
  
  private void b(dr paramdr, View paramView)
  {
    Object localObject = paramView.getTag(2113929216);
    if ((localObject instanceof eg)) {}
    for (localObject = (eg)localObject;; localObject = null)
    {
      Runnable localRunnable = dr.a(paramdr);
      paramdr = dr.b(paramdr);
      if (localRunnable != null) {
        localRunnable.run();
      }
      if (localObject != null)
      {
        ((eg)localObject).a(paramView);
        ((eg)localObject).b(paramView);
      }
      if (paramdr != null) {
        paramdr.run();
      }
      if (this.a != null) {
        this.a.remove(paramView);
      }
      return;
    }
  }
  
  private void c(dr paramdr, View paramView)
  {
    if (this.a != null) {}
    for (Runnable localRunnable = (Runnable)this.a.get(paramView);; localRunnable = null)
    {
      Object localObject = localRunnable;
      if (localRunnable == null)
      {
        localObject = new du(this, paramdr, paramView, null);
        if (this.a == null) {
          this.a = new WeakHashMap();
        }
        this.a.put(paramView, localObject);
      }
      paramView.removeCallbacks((Runnable)localObject);
      paramView.post((Runnable)localObject);
      return;
    }
  }
  
  public void a(dr paramdr, View paramView)
  {
    a(paramView);
    b(paramdr, paramView);
  }
  
  public void a(dr paramdr, View paramView, float paramFloat)
  {
    c(paramdr, paramView);
  }
  
  public void a(dr paramdr, View paramView, long paramLong) {}
  
  public void a(dr paramdr, View paramView, eg parameg)
  {
    paramView.setTag(2113929216, parameg);
  }
  
  public void b(dr paramdr, View paramView, float paramFloat)
  {
    c(paramdr, paramView);
  }
  
  public void c(dr paramdr, View paramView, float paramFloat)
  {
    c(paramdr, paramView);
  }
  
  public void cancel(dr paramdr, View paramView)
  {
    c(paramdr, paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\view\dt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */