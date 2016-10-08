package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.v4.view.a.a;
import android.support.v4.view.a.al;
import android.support.v4.view.a.g;
import android.support.v4.view.a.r;
import android.support.v4.view.a.s;
import android.support.v4.view.bn;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;

public abstract class aw
{
  private boolean a = false;
  private boolean b = false;
  d q;
  RecyclerView r;
  bf s;
  
  public static int a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean)
  {
    int j = 1073741824;
    int i = Math.max(0, paramInt1 - paramInt2);
    if (paramBoolean) {
      if (paramInt3 >= 0)
      {
        paramInt1 = paramInt3;
        paramInt2 = j;
      }
    }
    for (;;)
    {
      return View.MeasureSpec.makeMeasureSpec(paramInt1, paramInt2);
      paramInt2 = 0;
      paramInt1 = 0;
      continue;
      paramInt2 = j;
      paramInt1 = paramInt3;
      if (paramInt3 < 0) {
        if (paramInt3 == -1)
        {
          paramInt1 = i;
          paramInt2 = j;
        }
        else if (paramInt3 == -2)
        {
          paramInt2 = Integer.MIN_VALUE;
          paramInt1 = i;
        }
        else
        {
          paramInt2 = 0;
          paramInt1 = 0;
        }
      }
    }
  }
  
  private void a(int paramInt, View paramView)
  {
    this.q.d(paramInt);
  }
  
  private void a(bb parambb, int paramInt, View paramView)
  {
    bk localbk = RecyclerView.b(paramView);
    if (localbk.shouldIgnore()) {
      return;
    }
    if ((localbk.isInvalid()) && (!localbk.isRemoved()) && (!RecyclerView.g(this.r).hasStableIds()))
    {
      f(paramInt);
      parambb.b(localbk);
      return;
    }
    g(paramInt);
    parambb.c(paramView);
  }
  
  private void a(View paramView, int paramInt, boolean paramBoolean)
  {
    bk localbk = RecyclerView.b(paramView);
    RecyclerView.LayoutParams localLayoutParams;
    if ((paramBoolean) || (localbk.isRemoved()))
    {
      this.r.d.c(localbk);
      localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
      if ((!localbk.wasReturnedFromScrap()) && (!localbk.isScrap())) {
        break label128;
      }
      if (!localbk.isScrap()) {
        break label120;
      }
      localbk.unScrap();
      label68:
      this.q.a(paramView, paramInt, paramView.getLayoutParams(), false);
    }
    for (;;)
    {
      if (localLayoutParams.d)
      {
        localbk.itemView.invalidate();
        localLayoutParams.d = false;
      }
      return;
      this.r.d.d(localbk);
      break;
      label120:
      localbk.clearReturnedFromScrapFlag();
      break label68;
      label128:
      if (paramView.getParent() == this.r)
      {
        int j = this.q.b(paramView);
        int i = paramInt;
        if (paramInt == -1) {
          i = this.q.b();
        }
        if (j == -1) {
          throw new IllegalStateException("Added View has RecyclerView as parent but view is not a real child. Unfiltered index:" + this.r.indexOfChild(paramView));
        }
        if (j != i) {
          RecyclerView.f(this.r).a(j, i);
        }
      }
      else
      {
        this.q.a(paramView, paramInt, false);
        localLayoutParams.c = true;
        if ((this.s != null) && (this.s.h())) {
          this.s.b(paramView);
        }
      }
    }
  }
  
  private void b(bf parambf)
  {
    if (this.s == parambf) {
      this.s = null;
    }
  }
  
  public void A()
  {
    this.a = true;
  }
  
  public int a(int paramInt, bb parambb, bh parambh)
  {
    return 0;
  }
  
  public int a(bb parambb, bh parambh)
  {
    if ((this.r == null) || (RecyclerView.g(this.r) == null)) {}
    while (!e()) {
      return 1;
    }
    return RecyclerView.g(this.r).getItemCount();
  }
  
  public abstract RecyclerView.LayoutParams a();
  
  public RecyclerView.LayoutParams a(Context paramContext, AttributeSet paramAttributeSet)
  {
    return new RecyclerView.LayoutParams(paramContext, paramAttributeSet);
  }
  
  public RecyclerView.LayoutParams a(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof RecyclerView.LayoutParams)) {
      return new RecyclerView.LayoutParams((RecyclerView.LayoutParams)paramLayoutParams);
    }
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new RecyclerView.LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new RecyclerView.LayoutParams(paramLayoutParams);
  }
  
  public View a(View paramView, int paramInt, bb parambb, bh parambh)
  {
    return null;
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    View localView = h(paramInt1);
    if (localView == null) {
      throw new IllegalArgumentException("Cannot move a child from non-existing index:" + paramInt1);
    }
    g(paramInt1);
    c(localView, paramInt2);
  }
  
  public void a(int paramInt, bb parambb)
  {
    View localView = h(paramInt);
    f(paramInt);
    parambb.a(localView);
  }
  
  public void a(Parcelable paramParcelable) {}
  
  void a(g paramg)
  {
    a(this.r.a, this.r.f, paramg);
  }
  
  public void a(RecyclerView paramRecyclerView) {}
  
  public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {}
  
  public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, Object paramObject)
  {
    c(paramRecyclerView, paramInt1, paramInt2);
  }
  
  public void a(RecyclerView paramRecyclerView, bb parambb)
  {
    e(paramRecyclerView);
  }
  
  public void a(RecyclerView paramRecyclerView, bh parambh, int paramInt)
  {
    Log.e("RecyclerView", "You must override smoothScrollToPosition to support smooth scrolling");
  }
  
  public void a(am paramam1, am paramam2) {}
  
  public void a(bb parambb)
  {
    int i = r() - 1;
    while (i >= 0)
    {
      a(parambb, i, h(i));
      i -= 1;
    }
  }
  
  public void a(bb parambb, bh parambh, int paramInt1, int paramInt2)
  {
    RecyclerView.b(this.r, paramInt1, paramInt2);
  }
  
  public void a(bb parambb, bh parambh, g paramg)
  {
    if ((bn.b(this.r, -1)) || (bn.a(this.r, -1)))
    {
      paramg.a(8192);
      paramg.i(true);
    }
    if ((bn.b(this.r, 1)) || (bn.a(this.r, 1)))
    {
      paramg.a(4096);
      paramg.i(true);
    }
    paramg.b(r.a(a(parambb, parambh), b(parambb, parambh), e(parambb, parambh), d(parambb, parambh)));
  }
  
  public void a(bb parambb, bh parambh, View paramView, g paramg)
  {
    int i;
    if (e())
    {
      i = d(paramView);
      if (!d()) {
        break label51;
      }
    }
    label51:
    for (int j = d(paramView);; j = 0)
    {
      paramg.c(s.a(i, 1, j, 1, false, false));
      return;
      i = 0;
      break;
    }
  }
  
  public void a(bb parambb, bh parambh, AccessibilityEvent paramAccessibilityEvent)
  {
    boolean bool2 = true;
    parambb = a.a(paramAccessibilityEvent);
    if ((this.r == null) || (parambb == null)) {
      return;
    }
    boolean bool1 = bool2;
    if (!bn.b(this.r, 1))
    {
      bool1 = bool2;
      if (!bn.b(this.r, -1))
      {
        bool1 = bool2;
        if (!bn.a(this.r, -1)) {
          if (!bn.a(this.r, 1)) {
            break label111;
          }
        }
      }
    }
    label111:
    for (bool1 = bool2;; bool1 = false)
    {
      parambb.a(bool1);
      if (RecyclerView.g(this.r) == null) {
        break;
      }
      parambb.a(RecyclerView.g(this.r).getItemCount());
      return;
    }
  }
  
  public void a(bf parambf)
  {
    if ((this.s != null) && (parambf != this.s) && (this.s.h())) {
      this.s.f();
    }
    this.s = parambf;
    this.s.a(this.r, this);
  }
  
  public void a(View paramView)
  {
    a(paramView, -1);
  }
  
  public void a(View paramView, int paramInt)
  {
    a(paramView, paramInt, true);
  }
  
  public void a(View paramView, int paramInt1, int paramInt2)
  {
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    Rect localRect = this.r.f(paramView);
    int i = localRect.left;
    int j = localRect.right;
    int k = localRect.top;
    int m = localRect.bottom;
    paramView.measure(a(s(), i + j + paramInt1 + (u() + w() + localLayoutParams.leftMargin + localLayoutParams.rightMargin), localLayoutParams.width, d()), a(t(), m + k + paramInt2 + (v() + x() + localLayoutParams.topMargin + localLayoutParams.bottomMargin), localLayoutParams.height, e()));
  }
  
  public void a(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Rect localRect = ((RecyclerView.LayoutParams)paramView.getLayoutParams()).b;
    paramView.layout(localRect.left + paramInt1, localRect.top + paramInt2, paramInt3 - localRect.right, paramInt4 - localRect.bottom);
  }
  
  public void a(View paramView, int paramInt, RecyclerView.LayoutParams paramLayoutParams)
  {
    bk localbk = RecyclerView.b(paramView);
    if (localbk.isRemoved()) {
      this.r.d.c(localbk);
    }
    for (;;)
    {
      this.q.a(paramView, paramInt, paramLayoutParams, localbk.isRemoved());
      return;
      this.r.d.d(localbk);
    }
  }
  
  public void a(View paramView, Rect paramRect)
  {
    if (this.r == null)
    {
      paramRect.set(0, 0, 0, 0);
      return;
    }
    paramRect.set(this.r.f(paramView));
  }
  
  void a(View paramView, g paramg)
  {
    bk localbk = RecyclerView.b(paramView);
    if ((localbk != null) && (!localbk.isRemoved()) && (!this.q.c(localbk.itemView))) {
      a(this.r.a, this.r.f, paramView, paramg);
    }
  }
  
  public void a(View paramView, bb parambb)
  {
    c(paramView);
    parambb.a(paramView);
  }
  
  public void a(AccessibilityEvent paramAccessibilityEvent)
  {
    a(this.r.a, this.r.f, paramAccessibilityEvent);
  }
  
  public void a(Runnable paramRunnable)
  {
    if (this.r != null) {
      bn.a(this.r, paramRunnable);
    }
  }
  
  public void a(String paramString)
  {
    if (this.r != null) {
      this.r.a(paramString);
    }
  }
  
  boolean a(int paramInt, Bundle paramBundle)
  {
    return a(this.r.a, this.r.f, paramInt, paramBundle);
  }
  
  public boolean a(RecyclerView.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams != null;
  }
  
  public boolean a(RecyclerView paramRecyclerView, bh parambh, View paramView1, View paramView2)
  {
    return a(paramRecyclerView, paramView1, paramView2);
  }
  
  public boolean a(RecyclerView paramRecyclerView, View paramView, Rect paramRect, boolean paramBoolean)
  {
    int i2 = u();
    int m = v();
    int i3 = s() - w();
    int i1 = t();
    int i6 = x();
    int i4 = paramView.getLeft() + paramRect.left;
    int n = paramView.getTop() + paramRect.top;
    int i5 = i4 + paramRect.width();
    int i7 = paramRect.height();
    int i = Math.min(0, i4 - i2);
    int j = Math.min(0, n - m);
    int k = Math.max(0, i5 - i3);
    i1 = Math.max(0, n + i7 - (i1 - i6));
    if (p() == 1) {
      if (k != 0)
      {
        i = k;
        if (j == 0) {
          break label207;
        }
        label144:
        if ((i == 0) && (j == 0)) {
          break label233;
        }
        if (!paramBoolean) {
          break label222;
        }
        paramRecyclerView.scrollBy(i, j);
      }
    }
    for (;;)
    {
      return true;
      i = Math.max(i, i5 - i3);
      break;
      if (i != 0) {
        break;
      }
      for (;;)
      {
        i = Math.min(i4 - i2, k);
      }
      label207:
      j = Math.min(n - m, i1);
      break label144;
      label222:
      paramRecyclerView.a(i, j);
    }
    label233:
    return false;
  }
  
  @Deprecated
  public boolean a(RecyclerView paramRecyclerView, View paramView1, View paramView2)
  {
    return (o()) || (paramRecyclerView.j());
  }
  
  public boolean a(RecyclerView paramRecyclerView, ArrayList<View> paramArrayList, int paramInt1, int paramInt2)
  {
    return false;
  }
  
  public boolean a(bb parambb, bh parambh, int paramInt, Bundle paramBundle)
  {
    if (this.r == null) {}
    int i;
    do
    {
      return false;
      switch (paramInt)
      {
      default: 
        paramInt = 0;
        i = 0;
      }
    } while ((i == 0) && (paramInt == 0));
    this.r.scrollBy(paramInt, i);
    return true;
    if (bn.b(this.r, -1)) {}
    for (paramInt = -(t() - v() - x());; paramInt = 0)
    {
      i = paramInt;
      int j;
      if (bn.a(this.r, -1))
      {
        j = -(s() - u() - w());
        i = paramInt;
        paramInt = j;
        break;
        if (!bn.b(this.r, 1)) {
          break label207;
        }
      }
      label207:
      for (paramInt = t() - v() - x();; paramInt = 0)
      {
        i = paramInt;
        if (bn.a(this.r, 1))
        {
          j = s();
          int k = u();
          int m = w();
          i = paramInt;
          paramInt = j - k - m;
          break;
        }
        paramInt = 0;
        break;
      }
    }
  }
  
  public boolean a(bb parambb, bh parambh, View paramView, int paramInt, Bundle paramBundle)
  {
    return false;
  }
  
  boolean a(View paramView, int paramInt, Bundle paramBundle)
  {
    return a(this.r.a, this.r.f, paramView, paramInt, paramBundle);
  }
  
  public int b(int paramInt, bb parambb, bh parambh)
  {
    return 0;
  }
  
  public int b(bb parambb, bh parambh)
  {
    if ((this.r == null) || (RecyclerView.g(this.r) == null)) {}
    while (!d()) {
      return 1;
    }
    return RecyclerView.g(this.r).getItemCount();
  }
  
  public int b(bh parambh)
  {
    return 0;
  }
  
  void b(RecyclerView paramRecyclerView)
  {
    if (paramRecyclerView == null)
    {
      this.r = null;
      this.q = null;
      return;
    }
    this.r = paramRecyclerView;
    this.q = paramRecyclerView.c;
  }
  
  public void b(RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {}
  
  void b(RecyclerView paramRecyclerView, bb parambb)
  {
    this.b = false;
    a(paramRecyclerView, parambb);
  }
  
  void b(bb parambb)
  {
    int j = parambb.d();
    int i = j - 1;
    if (i >= 0)
    {
      View localView = parambb.e(i);
      bk localbk = RecyclerView.b(localView);
      if (localbk.shouldIgnore()) {}
      for (;;)
      {
        i -= 1;
        break;
        localbk.setIsRecyclable(false);
        if (localbk.isTmpDetached()) {
          this.r.removeDetachedView(localView, false);
        }
        if (this.r.e != null) {
          this.r.e.c(localbk);
        }
        localbk.setIsRecyclable(true);
        parambb.b(localView);
      }
    }
    parambb.e();
    if (j > 0) {
      this.r.invalidate();
    }
  }
  
  public void b(View paramView)
  {
    b(paramView, -1);
  }
  
  public void b(View paramView, int paramInt)
  {
    a(paramView, paramInt, false);
  }
  
  public boolean b()
  {
    return false;
  }
  
  public boolean b(Runnable paramRunnable)
  {
    if (this.r != null) {
      return this.r.removeCallbacks(paramRunnable);
    }
    return false;
  }
  
  public int c(bh parambh)
  {
    return 0;
  }
  
  public Parcelable c()
  {
    return null;
  }
  
  public View c(int paramInt)
  {
    int j = r();
    int i = 0;
    if (i < j)
    {
      View localView = h(i);
      bk localbk = RecyclerView.b(localView);
      if (localbk == null) {}
      while ((localbk.getLayoutPosition() != paramInt) || (localbk.shouldIgnore()) || ((!this.r.f.a()) && (localbk.isRemoved())))
      {
        i += 1;
        break;
      }
      return localView;
    }
    return null;
  }
  
  void c(RecyclerView paramRecyclerView)
  {
    this.b = true;
    d(paramRecyclerView);
  }
  
  public void c(RecyclerView paramRecyclerView, int paramInt1, int paramInt2) {}
  
  public void c(bb parambb)
  {
    int i = r() - 1;
    while (i >= 0)
    {
      if (!RecyclerView.b(h(i)).shouldIgnore()) {
        a(i, parambb);
      }
      i -= 1;
    }
  }
  
  public void c(bb parambb, bh parambh)
  {
    Log.e("RecyclerView", "You must override onLayoutChildren(Recycler recycler, State state) ");
  }
  
  public void c(View paramView)
  {
    this.q.a(paramView);
  }
  
  public void c(View paramView, int paramInt)
  {
    a(paramView, paramInt, (RecyclerView.LayoutParams)paramView.getLayoutParams());
  }
  
  public int d(bb parambb, bh parambh)
  {
    return 0;
  }
  
  public int d(bh parambh)
  {
    return 0;
  }
  
  public int d(View paramView)
  {
    return ((RecyclerView.LayoutParams)paramView.getLayoutParams()).e();
  }
  
  public View d(View paramView, int paramInt)
  {
    return null;
  }
  
  public void d(RecyclerView paramRecyclerView) {}
  
  public boolean d()
  {
    return false;
  }
  
  public int e(bh parambh)
  {
    return 0;
  }
  
  public int e(View paramView)
  {
    Rect localRect = ((RecyclerView.LayoutParams)paramView.getLayoutParams()).b;
    int i = paramView.getMeasuredWidth();
    int j = localRect.left;
    return localRect.right + (i + j);
  }
  
  public void e(int paramInt) {}
  
  @Deprecated
  public void e(RecyclerView paramRecyclerView) {}
  
  public boolean e()
  {
    return false;
  }
  
  public boolean e(bb parambb, bh parambh)
  {
    return false;
  }
  
  public int f(bh parambh)
  {
    return 0;
  }
  
  public int f(View paramView)
  {
    Rect localRect = ((RecyclerView.LayoutParams)paramView.getLayoutParams()).b;
    int i = paramView.getMeasuredHeight();
    int j = localRect.top;
    return localRect.bottom + (i + j);
  }
  
  public void f(int paramInt)
  {
    if (h(paramInt) != null) {
      this.q.a(paramInt);
    }
  }
  
  public int g(bh parambh)
  {
    return 0;
  }
  
  public int g(View paramView)
  {
    return paramView.getLeft() - m(paramView);
  }
  
  public void g(int paramInt)
  {
    a(paramInt, h(paramInt));
  }
  
  public int h(View paramView)
  {
    return paramView.getTop() - k(paramView);
  }
  
  public View h(int paramInt)
  {
    if (this.q != null) {
      return this.q.b(paramInt);
    }
    return null;
  }
  
  public int i(View paramView)
  {
    return paramView.getRight() + n(paramView);
  }
  
  public void i(int paramInt)
  {
    if (this.r != null) {
      this.r.c(paramInt);
    }
  }
  
  public int j(View paramView)
  {
    return paramView.getBottom() + l(paramView);
  }
  
  public void j(int paramInt)
  {
    if (this.r != null) {
      this.r.b(paramInt);
    }
  }
  
  public int k(View paramView)
  {
    return ((RecyclerView.LayoutParams)paramView.getLayoutParams()).b.top;
  }
  
  public void k(int paramInt) {}
  
  public int l(View paramView)
  {
    return ((RecyclerView.LayoutParams)paramView.getLayoutParams()).b.bottom;
  }
  
  public void l()
  {
    if (this.r != null) {
      this.r.requestLayout();
    }
  }
  
  public int m(View paramView)
  {
    return ((RecyclerView.LayoutParams)paramView.getLayoutParams()).b.left;
  }
  
  public boolean m()
  {
    return this.b;
  }
  
  public int n(View paramView)
  {
    return ((RecyclerView.LayoutParams)paramView.getLayoutParams()).b.right;
  }
  
  public boolean n()
  {
    return (this.r != null) && (RecyclerView.t(this.r));
  }
  
  public boolean o()
  {
    return (this.s != null) && (this.s.h());
  }
  
  public int p()
  {
    return bn.h(this.r);
  }
  
  public int q()
  {
    return -1;
  }
  
  public int r()
  {
    if (this.q != null) {
      return this.q.b();
    }
    return 0;
  }
  
  public int s()
  {
    if (this.r != null) {
      return this.r.getWidth();
    }
    return 0;
  }
  
  public int t()
  {
    if (this.r != null) {
      return this.r.getHeight();
    }
    return 0;
  }
  
  public int u()
  {
    if (this.r != null) {
      return this.r.getPaddingLeft();
    }
    return 0;
  }
  
  public int v()
  {
    if (this.r != null) {
      return this.r.getPaddingTop();
    }
    return 0;
  }
  
  public int w()
  {
    if (this.r != null) {
      return this.r.getPaddingRight();
    }
    return 0;
  }
  
  public int x()
  {
    if (this.r != null) {
      return this.r.getPaddingBottom();
    }
    return 0;
  }
  
  public View y()
  {
    if (this.r == null) {}
    View localView;
    do
    {
      return null;
      localView = this.r.getFocusedChild();
    } while ((localView == null) || (this.q.c(localView)));
    return localView;
  }
  
  void z()
  {
    if (this.s != null) {
      this.s.f();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v7\widget\aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */