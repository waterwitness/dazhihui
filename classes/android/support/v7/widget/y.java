package android.support.v7.widget;

import android.view.View;
import java.util.List;

class y
{
  boolean a = true;
  int b;
  int c;
  int d;
  int e;
  int f;
  int g;
  int h = 0;
  boolean i = false;
  int j;
  List<bk> k = null;
  
  private View b()
  {
    int n = this.k.size();
    int m = 0;
    if (m < n)
    {
      View localView = ((bk)this.k.get(m)).itemView;
      RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)localView.getLayoutParams();
      if (localLayoutParams.c()) {}
      while (this.d != localLayoutParams.e())
      {
        m += 1;
        break;
      }
      a(localView);
      return localView;
    }
    return null;
  }
  
  View a(bb parambb)
  {
    if (this.k != null) {
      return b();
    }
    parambb = parambb.c(this.d);
    this.d += this.e;
    return parambb;
  }
  
  public void a()
  {
    a(null);
  }
  
  public void a(View paramView)
  {
    paramView = b(paramView);
    if (paramView == null)
    {
      this.d = -1;
      return;
    }
    this.d = ((RecyclerView.LayoutParams)paramView.getLayoutParams()).e();
  }
  
  boolean a(bh parambh)
  {
    return (this.d >= 0) && (this.d < parambh.e());
  }
  
  public View b(View paramView)
  {
    int i2 = this.k.size();
    Object localObject = null;
    int m = Integer.MAX_VALUE;
    int n = 0;
    if (n < i2)
    {
      View localView = ((bk)this.k.get(n)).itemView;
      RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)localView.getLayoutParams();
      if (localView != paramView) {
        if (!localLayoutParams.c()) {}
      }
      for (;;)
      {
        n += 1;
        break;
        int i1 = (localLayoutParams.e() - this.d) * this.e;
        if (i1 >= 0) {
          if (i1 < m)
          {
            if (i1 == 0) {
              return localView;
            }
            localObject = localView;
            m = i1;
          }
        }
      }
    }
    return (View)localObject;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v7\widget\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */