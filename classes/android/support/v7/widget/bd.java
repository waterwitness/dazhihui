package android.support.v7.widget;

import android.support.v4.view.bn;

class bd
  extends ao
{
  private bd(RecyclerView paramRecyclerView) {}
  
  public void a()
  {
    this.a.a(null);
    if (RecyclerView.g(this.a).hasStableIds())
    {
      bh.a(this.a.f, true);
      RecyclerView.m(this.a);
    }
    for (;;)
    {
      if (!this.a.b.d()) {
        this.a.requestLayout();
      }
      return;
      bh.a(this.a.f, true);
      RecyclerView.m(this.a);
    }
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3)
  {
    this.a.a(null);
    if (this.a.b.a(paramInt1, paramInt2, paramInt3)) {
      b();
    }
  }
  
  public void a(int paramInt1, int paramInt2, Object paramObject)
  {
    this.a.a(null);
    if (this.a.b.a(paramInt1, paramInt2, paramObject)) {
      b();
    }
  }
  
  void b()
  {
    if ((RecyclerView.n(this.a)) && (RecyclerView.o(this.a)) && (RecyclerView.p(this.a)))
    {
      bn.a(this.a, RecyclerView.q(this.a));
      return;
    }
    RecyclerView.c(this.a, true);
    this.a.requestLayout();
  }
  
  public void b(int paramInt1, int paramInt2)
  {
    this.a.a(null);
    if (this.a.b.b(paramInt1, paramInt2)) {
      b();
    }
  }
  
  public void c(int paramInt1, int paramInt2)
  {
    this.a.a(null);
    if (this.a.b.c(paramInt1, paramInt2)) {
      b();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v7\widget\bd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */