package android.support.v7.widget;

import android.view.View;
import java.util.ArrayList;

class bt
{
  int a;
  int b;
  int c;
  final int d;
  private ArrayList<View> f;
  
  int a(int paramInt)
  {
    if (this.a != Integer.MIN_VALUE) {
      paramInt = this.a;
    }
    while (this.f.size() == 0) {
      return paramInt;
    }
    a();
    return this.a;
  }
  
  void a()
  {
    Object localObject = (View)this.f.get(0);
    StaggeredGridLayoutManager.LayoutParams localLayoutParams = c((View)localObject);
    this.a = this.e.a.a((View)localObject);
    if (localLayoutParams.f)
    {
      localObject = this.e.f.f(localLayoutParams.e());
      if ((localObject != null) && (((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject).b == -1)) {
        this.a -= ((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject).a(this.d);
      }
    }
  }
  
  void a(View paramView)
  {
    StaggeredGridLayoutManager.LayoutParams localLayoutParams = c(paramView);
    localLayoutParams.e = this;
    this.f.add(0, paramView);
    this.a = Integer.MIN_VALUE;
    if (this.f.size() == 1) {
      this.b = Integer.MIN_VALUE;
    }
    if ((localLayoutParams.c()) || (localLayoutParams.d())) {
      this.c += this.e.a.c(paramView);
    }
  }
  
  void a(boolean paramBoolean, int paramInt)
  {
    int i;
    if (paramBoolean)
    {
      i = b(Integer.MIN_VALUE);
      e();
      if (i != Integer.MIN_VALUE) {
        break label32;
      }
    }
    label32:
    while (((paramBoolean) && (i < this.e.a.d())) || ((!paramBoolean) && (i > this.e.a.c())))
    {
      return;
      i = a(Integer.MIN_VALUE);
      break;
    }
    int j = i;
    if (paramInt != Integer.MIN_VALUE) {
      j = i + paramInt;
    }
    this.b = j;
    this.a = j;
  }
  
  int b()
  {
    if (this.a != Integer.MIN_VALUE) {
      return this.a;
    }
    a();
    return this.a;
  }
  
  int b(int paramInt)
  {
    if (this.b != Integer.MIN_VALUE) {
      paramInt = this.b;
    }
    while (this.f.size() == 0) {
      return paramInt;
    }
    c();
    return this.b;
  }
  
  void b(View paramView)
  {
    StaggeredGridLayoutManager.LayoutParams localLayoutParams = c(paramView);
    localLayoutParams.e = this;
    this.f.add(paramView);
    this.b = Integer.MIN_VALUE;
    if (this.f.size() == 1) {
      this.a = Integer.MIN_VALUE;
    }
    if ((localLayoutParams.c()) || (localLayoutParams.d())) {
      this.c += this.e.a.c(paramView);
    }
  }
  
  StaggeredGridLayoutManager.LayoutParams c(View paramView)
  {
    return (StaggeredGridLayoutManager.LayoutParams)paramView.getLayoutParams();
  }
  
  void c()
  {
    Object localObject = (View)this.f.get(this.f.size() - 1);
    StaggeredGridLayoutManager.LayoutParams localLayoutParams = c((View)localObject);
    this.b = this.e.a.b((View)localObject);
    if (localLayoutParams.f)
    {
      localObject = this.e.f.f(localLayoutParams.e());
      if ((localObject != null) && (((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject).b == 1))
      {
        int i = this.b;
        this.b = (((StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem)localObject).a(this.d) + i);
      }
    }
  }
  
  void c(int paramInt)
  {
    this.a = paramInt;
    this.b = paramInt;
  }
  
  int d()
  {
    if (this.b != Integer.MIN_VALUE) {
      return this.b;
    }
    c();
    return this.b;
  }
  
  void d(int paramInt)
  {
    if (this.a != Integer.MIN_VALUE) {
      this.a += paramInt;
    }
    if (this.b != Integer.MIN_VALUE) {
      this.b += paramInt;
    }
  }
  
  void e()
  {
    this.f.clear();
    f();
    this.c = 0;
  }
  
  void f()
  {
    this.a = Integer.MIN_VALUE;
    this.b = Integer.MIN_VALUE;
  }
  
  void g()
  {
    int i = this.f.size();
    View localView = (View)this.f.remove(i - 1);
    StaggeredGridLayoutManager.LayoutParams localLayoutParams = c(localView);
    localLayoutParams.e = null;
    if ((localLayoutParams.c()) || (localLayoutParams.d())) {
      this.c -= this.e.a.c(localView);
    }
    if (i == 1) {
      this.a = Integer.MIN_VALUE;
    }
    this.b = Integer.MIN_VALUE;
  }
  
  void h()
  {
    View localView = (View)this.f.remove(0);
    StaggeredGridLayoutManager.LayoutParams localLayoutParams = c(localView);
    localLayoutParams.e = null;
    if (this.f.size() == 0) {
      this.b = Integer.MIN_VALUE;
    }
    if ((localLayoutParams.c()) || (localLayoutParams.d())) {
      this.c -= this.e.a.c(localView);
    }
    this.a = Integer.MIN_VALUE;
  }
  
  public int i()
  {
    return this.c;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v7\widget\bt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */