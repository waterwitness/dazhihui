package android.support.v7.widget;

import android.graphics.PointF;
import android.util.Log;
import android.view.View;

public abstract class bf
{
  private int a = -1;
  private RecyclerView b;
  private aw c;
  private boolean d;
  private boolean e;
  private View f;
  private final bg g = new bg(0, 0);
  
  private void a(int paramInt1, int paramInt2)
  {
    RecyclerView localRecyclerView = this.b;
    if ((!this.e) || (this.a == -1) || (localRecyclerView == null)) {
      f();
    }
    this.d = false;
    if (this.f != null)
    {
      if (a(this.f) != this.a) {
        break label146;
      }
      a(this.f, localRecyclerView.f, this.g);
      bg.a(this.g, localRecyclerView);
      f();
    }
    for (;;)
    {
      if (this.e)
      {
        a(paramInt1, paramInt2, localRecyclerView.f, this.g);
        boolean bool = this.g.a();
        bg.a(this.g, localRecyclerView);
        if (bool)
        {
          if (!this.e) {
            break;
          }
          this.d = true;
          RecyclerView.u(localRecyclerView).a();
        }
      }
      return;
      label146:
      Log.e("RecyclerView", "Passed over target position while smooth scrolling.");
      this.f = null;
    }
    f();
  }
  
  public int a(View paramView)
  {
    return this.b.c(paramView);
  }
  
  protected abstract void a();
  
  protected abstract void a(int paramInt1, int paramInt2, bh parambh, bg parambg);
  
  protected void a(PointF paramPointF)
  {
    double d1 = Math.sqrt(paramPointF.x * paramPointF.x + paramPointF.y * paramPointF.y);
    paramPointF.x = ((float)(paramPointF.x / d1));
    paramPointF.y = ((float)(paramPointF.y / d1));
  }
  
  void a(RecyclerView paramRecyclerView, aw paramaw)
  {
    this.b = paramRecyclerView;
    this.c = paramaw;
    if (this.a == -1) {
      throw new IllegalArgumentException("Invalid target position");
    }
    bh.d(this.b.f, this.a);
    this.e = true;
    this.d = true;
    this.f = e(i());
    a();
    RecyclerView.u(this.b).a();
  }
  
  protected abstract void a(View paramView, bh parambh, bg parambg);
  
  protected abstract void b();
  
  protected void b(View paramView)
  {
    if (a(paramView) == i()) {
      this.f = paramView;
    }
  }
  
  public void d(int paramInt)
  {
    this.a = paramInt;
  }
  
  public aw e()
  {
    return this.c;
  }
  
  public View e(int paramInt)
  {
    return RecyclerView.f(this.b).c(paramInt);
  }
  
  protected final void f()
  {
    if (!this.e) {
      return;
    }
    b();
    bh.d(this.b.f, -1);
    this.f = null;
    this.a = -1;
    this.d = false;
    this.e = false;
    aw.a(this.c, this);
    this.c = null;
    this.b = null;
  }
  
  public boolean g()
  {
    return this.d;
  }
  
  public boolean h()
  {
    return this.e;
  }
  
  public int i()
  {
    return this.a;
  }
  
  public int j()
  {
    return RecyclerView.f(this.b).r();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v7\widget\bf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */