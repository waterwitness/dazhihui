package android.support.v7.widget;

import android.util.Log;
import android.view.animation.Interpolator;

public class bg
{
  private int a;
  private int b;
  private int c;
  private int d = -1;
  private Interpolator e;
  private boolean f = false;
  private int g = 0;
  
  public bg(int paramInt1, int paramInt2)
  {
    this(paramInt1, paramInt2, Integer.MIN_VALUE, null);
  }
  
  public bg(int paramInt1, int paramInt2, int paramInt3, Interpolator paramInterpolator)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.e = paramInterpolator;
  }
  
  private void a(RecyclerView paramRecyclerView)
  {
    if (this.d >= 0)
    {
      int i = this.d;
      this.d = -1;
      RecyclerView.c(paramRecyclerView, i);
      this.f = false;
      return;
    }
    if (this.f)
    {
      b();
      if (this.e == null) {
        if (this.c == Integer.MIN_VALUE) {
          RecyclerView.u(paramRecyclerView).b(this.a, this.b);
        }
      }
      for (;;)
      {
        this.g += 1;
        if (this.g > 10) {
          Log.e("RecyclerView", "Smooth Scroll action is being updated too frequently. Make sure you are not changing it unless necessary");
        }
        this.f = false;
        return;
        RecyclerView.u(paramRecyclerView).a(this.a, this.b, this.c);
        continue;
        RecyclerView.u(paramRecyclerView).a(this.a, this.b, this.c, this.e);
      }
    }
    this.g = 0;
  }
  
  private void b()
  {
    if ((this.e != null) && (this.c < 1)) {
      throw new IllegalStateException("If you provide an interpolator, you must set a positive duration");
    }
    if (this.c < 1) {
      throw new IllegalStateException("Scroll duration must be a positive number");
    }
  }
  
  public void a(int paramInt)
  {
    this.d = paramInt;
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, Interpolator paramInterpolator)
  {
    this.a = paramInt1;
    this.b = paramInt2;
    this.c = paramInt3;
    this.e = paramInterpolator;
    this.f = true;
  }
  
  boolean a()
  {
    return this.d >= 0;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v7\widget\bg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */