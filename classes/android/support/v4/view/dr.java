package android.support.v4.view;

import android.os.Build.VERSION;
import android.view.View;
import java.lang.ref.WeakReference;

public class dr
{
  static final eb a = new dt();
  private WeakReference<View> b;
  private Runnable c = null;
  private Runnable d = null;
  private int e = -1;
  
  static
  {
    int i = Build.VERSION.SDK_INT;
    if (i >= 21)
    {
      a = new ea();
      return;
    }
    if (i >= 19)
    {
      a = new dz();
      return;
    }
    if (i >= 18)
    {
      a = new dx();
      return;
    }
    if (i >= 16)
    {
      a = new dy();
      return;
    }
    if (i >= 14)
    {
      a = new dv();
      return;
    }
  }
  
  dr(View paramView)
  {
    this.b = new WeakReference(paramView);
  }
  
  public dr a(float paramFloat)
  {
    View localView = (View)this.b.get();
    if (localView != null) {
      a.a(this, localView, paramFloat);
    }
    return this;
  }
  
  public dr a(long paramLong)
  {
    View localView = (View)this.b.get();
    if (localView != null) {
      a.a(this, localView, paramLong);
    }
    return this;
  }
  
  public dr a(eg parameg)
  {
    View localView = (View)this.b.get();
    if (localView != null) {
      a.a(this, localView, parameg);
    }
    return this;
  }
  
  public void a()
  {
    View localView = (View)this.b.get();
    if (localView != null) {
      a.a(this, localView);
    }
  }
  
  public dr b(float paramFloat)
  {
    View localView = (View)this.b.get();
    if (localView != null) {
      a.b(this, localView, paramFloat);
    }
    return this;
  }
  
  public dr c(float paramFloat)
  {
    View localView = (View)this.b.get();
    if (localView != null) {
      a.c(this, localView, paramFloat);
    }
    return this;
  }
  
  public void cancel()
  {
    View localView = (View)this.b.get();
    if (localView != null) {
      a.cancel(this, localView);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v4\view\dr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */