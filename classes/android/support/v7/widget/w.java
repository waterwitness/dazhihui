package android.support.v7.widget;

import android.view.View;

class w
{
  int a;
  int b;
  boolean c;
  
  w(LinearLayoutManager paramLinearLayoutManager) {}
  
  private boolean a(View paramView, bh parambh)
  {
    paramView = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    return (!paramView.c()) && (paramView.e() >= 0) && (paramView.e() < parambh.e());
  }
  
  void a()
  {
    this.a = -1;
    this.b = Integer.MIN_VALUE;
    this.c = false;
  }
  
  public void a(View paramView)
  {
    int j = this.d.k.b();
    if (j >= 0) {
      b(paramView);
    }
    int i;
    do
    {
      int k;
      do
      {
        do
        {
          do
          {
            return;
            this.a = this.d.d(paramView);
            if (!this.c) {
              break;
            }
            i = this.d.k.d() - j - this.d.k.b(paramView);
            this.b = (this.d.k.d() - i);
          } while (i <= 0);
          j = this.d.k.c(paramView);
          k = this.b;
          m = this.d.k.c();
          j = k - j - (m + Math.min(this.d.k.a(paramView) - m, 0));
        } while (j >= 0);
        k = this.b;
        this.b = (Math.min(i, -j) + k);
        return;
        k = this.d.k.a(paramView);
        i = k - this.d.k.c();
        this.b = k;
      } while (i <= 0);
      int m = this.d.k.c(paramView);
      int n = this.d.k.d();
      int i1 = this.d.k.b(paramView);
      j = this.d.k.d() - Math.min(0, n - j - i1) - (k + m);
    } while (j >= 0);
    this.b -= Math.min(i, -j);
  }
  
  void b()
  {
    if (this.c) {}
    for (int i = this.d.k.d();; i = this.d.k.c())
    {
      this.b = i;
      return;
    }
  }
  
  public void b(View paramView)
  {
    if (this.c) {}
    for (this.b = (this.d.k.b(paramView) + this.d.k.b());; this.b = this.d.k.a(paramView))
    {
      this.a = this.d.d(paramView);
      return;
    }
  }
  
  public String toString()
  {
    return "AnchorInfo{mPosition=" + this.a + ", mCoordinate=" + this.b + ", mLayoutFromEnd=" + this.c + '}';
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v7\widget\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */