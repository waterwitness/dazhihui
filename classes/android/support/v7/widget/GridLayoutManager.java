package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.v4.view.a.g;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import java.util.Arrays;

public class GridLayoutManager
  extends LinearLayoutManager
{
  static final int a = View.MeasureSpec.makeMeasureSpec(0, 0);
  boolean b = false;
  int c = -1;
  int[] d;
  View[] e;
  final SparseIntArray f = new SparseIntArray();
  final SparseIntArray g = new SparseIntArray();
  t h = new s();
  final Rect i = new Rect();
  
  public GridLayoutManager(Context paramContext, int paramInt)
  {
    super(paramContext);
    a(paramInt);
  }
  
  private void B()
  {
    this.f.clear();
    this.g.clear();
  }
  
  private void C()
  {
    int k = r();
    int j = 0;
    while (j < k)
    {
      GridLayoutManager.LayoutParams localLayoutParams = (GridLayoutManager.LayoutParams)h(j).getLayoutParams();
      int m = localLayoutParams.e();
      this.f.put(m, localLayoutParams.b());
      this.g.put(m, localLayoutParams.a());
      j += 1;
    }
  }
  
  private void D()
  {
    if (f() == 1) {}
    for (int j = s() - w() - u();; j = t() - x() - v())
    {
      l(j);
      return;
    }
  }
  
  private void E()
  {
    if ((this.e == null) || (this.e.length != this.c)) {
      this.e = new View[this.c];
    }
  }
  
  private int a(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt2 == 0) && (paramInt3 == 0)) {}
    int j;
    do
    {
      return paramInt1;
      j = View.MeasureSpec.getMode(paramInt1);
    } while ((j != Integer.MIN_VALUE) && (j != 1073741824));
    return View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(paramInt1) - paramInt2 - paramInt3, j);
  }
  
  private int a(bb parambb, bh parambh, int paramInt)
  {
    if (!parambh.a()) {
      return this.h.c(paramInt, this.c);
    }
    int j = parambb.b(paramInt);
    if (j == -1)
    {
      Log.w("GridLayoutManager", "Cannot find span size for pre layout position. " + paramInt);
      return 0;
    }
    return this.h.c(j, this.c);
  }
  
  private void a(bb parambb, bh parambh, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    int j;
    int k;
    int m;
    label43:
    GridLayoutManager.LayoutParams localLayoutParams;
    if (paramBoolean)
    {
      j = 1;
      paramInt2 = 0;
      k = paramInt1;
      paramInt1 = paramInt2;
      if ((this.j != 1) || (!g())) {
        break label150;
      }
      paramInt2 = this.c - 1;
      m = -1;
      if (paramInt1 == k) {
        return;
      }
      View localView = this.e[paramInt1];
      localLayoutParams = (GridLayoutManager.LayoutParams)localView.getLayoutParams();
      GridLayoutManager.LayoutParams.a(localLayoutParams, c(parambb, parambh, d(localView)));
      if ((m != -1) || (GridLayoutManager.LayoutParams.b(localLayoutParams) <= 1)) {
        break label159;
      }
      GridLayoutManager.LayoutParams.b(localLayoutParams, paramInt2 - (GridLayoutManager.LayoutParams.b(localLayoutParams) - 1));
    }
    for (;;)
    {
      paramInt2 += GridLayoutManager.LayoutParams.b(localLayoutParams) * m;
      paramInt1 += j;
      break label43;
      paramInt1 -= 1;
      j = -1;
      k = -1;
      break;
      label150:
      paramInt2 = 0;
      m = 1;
      break label43;
      label159:
      GridLayoutManager.LayoutParams.b(localLayoutParams, paramInt2);
    }
  }
  
  private void a(View paramView, int paramInt1, int paramInt2, boolean paramBoolean)
  {
    a(paramView, this.i);
    RecyclerView.LayoutParams localLayoutParams = (RecyclerView.LayoutParams)paramView.getLayoutParams();
    int j;
    if (!paramBoolean)
    {
      j = paramInt1;
      if (this.j != 1) {}
    }
    else
    {
      j = a(paramInt1, localLayoutParams.leftMargin + this.i.left, localLayoutParams.rightMargin + this.i.right);
    }
    if (!paramBoolean)
    {
      paramInt1 = paramInt2;
      if (this.j != 0) {}
    }
    else
    {
      paramInt1 = a(paramInt2, localLayoutParams.topMargin + this.i.top, localLayoutParams.bottomMargin + this.i.bottom);
    }
    paramView.measure(j, paramInt1);
  }
  
  private int b(bb parambb, bh parambh, int paramInt)
  {
    if (!parambh.a()) {
      j = this.h.b(paramInt, this.c);
    }
    int k;
    do
    {
      return j;
      k = this.g.get(paramInt, -1);
      j = k;
    } while (k != -1);
    int j = parambb.b(paramInt);
    if (j == -1)
    {
      Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + paramInt);
      return 0;
    }
    return this.h.b(j, this.c);
  }
  
  private void b(bb parambb, bh parambh, w paramw)
  {
    for (int j = b(parambb, parambh, paramw.a); (j > 0) && (paramw.a > 0); j = b(parambb, parambh, paramw.a)) {
      paramw.a -= 1;
    }
  }
  
  private int c(bb parambb, bh parambh, int paramInt)
  {
    if (!parambh.a()) {
      j = this.h.a(paramInt);
    }
    int k;
    do
    {
      return j;
      k = this.f.get(paramInt, -1);
      j = k;
    } while (k != -1);
    int j = parambb.b(paramInt);
    if (j == -1)
    {
      Log.w("GridLayoutManager", "Cannot find span size for pre layout position. It is not cached, not in the adapter. Pos:" + paramInt);
      return 1;
    }
    return this.h.a(j);
  }
  
  private void l(int paramInt)
  {
    int k = 0;
    if ((this.d == null) || (this.d.length != this.c + 1) || (this.d[(this.d.length - 1)] != paramInt)) {
      this.d = new int[this.c + 1];
    }
    this.d[0] = 0;
    int n = paramInt / this.c;
    int i1 = paramInt % this.c;
    int m = 1;
    int j = 0;
    paramInt = k;
    k = m;
    if (k <= this.c)
    {
      paramInt += i1;
      if ((paramInt <= 0) || (this.c - paramInt >= i1)) {
        break label145;
      }
      paramInt -= this.c;
    }
    label145:
    for (m = n + 1;; m = n)
    {
      j += m;
      this.d[k] = j;
      k += 1;
      break;
      return;
    }
  }
  
  private int m(int paramInt)
  {
    if (paramInt < 0) {
      return a;
    }
    return View.MeasureSpec.makeMeasureSpec(paramInt, 1073741824);
  }
  
  public int a(int paramInt, bb parambb, bh parambh)
  {
    D();
    E();
    return super.a(paramInt, parambb, parambh);
  }
  
  public int a(bb parambb, bh parambh)
  {
    if (this.j == 0) {
      return this.c;
    }
    if (parambh.e() < 1) {
      return 0;
    }
    return a(parambb, parambh, parambh.e() - 1);
  }
  
  public RecyclerView.LayoutParams a()
  {
    return new GridLayoutManager.LayoutParams(-2, -2);
  }
  
  public RecyclerView.LayoutParams a(Context paramContext, AttributeSet paramAttributeSet)
  {
    return new GridLayoutManager.LayoutParams(paramContext, paramAttributeSet);
  }
  
  public RecyclerView.LayoutParams a(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new GridLayoutManager.LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new GridLayoutManager.LayoutParams(paramLayoutParams);
  }
  
  View a(bb parambb, bh parambh, int paramInt1, int paramInt2, int paramInt3)
  {
    Object localObject2 = null;
    h();
    int k = this.k.c();
    int m = this.k.d();
    int j;
    Object localObject1;
    label37:
    Object localObject3;
    if (paramInt2 > paramInt1)
    {
      j = 1;
      localObject1 = null;
      if (paramInt1 == paramInt2) {
        break label197;
      }
      localObject3 = h(paramInt1);
      int n = d((View)localObject3);
      if ((n < 0) || (n >= paramInt3)) {
        break label216;
      }
      if (b(parambb, parambh, n) == 0) {
        break label119;
      }
      localObject3 = localObject2;
      localObject2 = localObject1;
      localObject1 = localObject3;
    }
    for (;;)
    {
      paramInt1 += j;
      localObject3 = localObject2;
      localObject2 = localObject1;
      localObject1 = localObject3;
      break label37;
      j = -1;
      break;
      label119:
      if (((RecyclerView.LayoutParams)((View)localObject3).getLayoutParams()).c())
      {
        if (localObject1 == null)
        {
          localObject1 = localObject2;
          localObject2 = localObject3;
        }
      }
      else
      {
        Object localObject4;
        if (this.k.a((View)localObject3) < m)
        {
          localObject4 = localObject3;
          if (this.k.b((View)localObject3) >= k) {}
        }
        else
        {
          if (localObject2 != null) {
            break label216;
          }
          localObject2 = localObject1;
          localObject1 = localObject3;
          continue;
          label197:
          if (localObject2 == null) {
            break label209;
          }
        }
        for (;;)
        {
          localObject4 = localObject2;
          return (View)localObject4;
          label209:
          localObject2 = localObject1;
        }
      }
      label216:
      localObject3 = localObject1;
      localObject1 = localObject2;
      localObject2 = localObject3;
    }
  }
  
  public void a(int paramInt)
  {
    if (paramInt == this.c) {
      return;
    }
    this.b = true;
    if (paramInt < 1) {
      throw new IllegalArgumentException("Span count should be at least 1. Provided " + paramInt);
    }
    this.c = paramInt;
    this.h.a();
  }
  
  public void a(RecyclerView paramRecyclerView)
  {
    this.h.a();
  }
  
  public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    this.h.a();
  }
  
  public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, int paramInt3)
  {
    this.h.a();
  }
  
  public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, Object paramObject)
  {
    this.h.a();
  }
  
  void a(bb parambb, bh parambh, w paramw)
  {
    super.a(parambb, parambh, paramw);
    D();
    if ((parambh.e() > 0) && (!parambh.a())) {
      b(parambb, parambh, paramw);
    }
    E();
  }
  
  void a(bb parambb, bh parambh, y paramy, x paramx)
  {
    boolean bool;
    int m;
    int n;
    int i1;
    if (paramy.e == 1)
    {
      bool = true;
      m = 0;
      n = 0;
      j = this.c;
      i1 = m;
      k = n;
      if (!bool)
      {
        j = b(parambb, parambh, paramy.d) + c(parambb, parambh, paramy.d);
        k = n;
        i1 = m;
      }
    }
    for (;;)
    {
      if ((i1 < this.c) && (paramy.a(parambh)) && (j > 0))
      {
        n = paramy.d;
        m = c(parambb, parambh, n);
        if (m > this.c)
        {
          throw new IllegalArgumentException("Item at position " + n + " requires " + m + " spans but GridLayoutManager has only " + this.c + " spans.");
          bool = false;
          break;
        }
        j -= m;
        if (j >= 0) {
          break label203;
        }
      }
      label203:
      View localView;
      do
      {
        if (i1 != 0) {
          break;
        }
        paramx.b = true;
        return;
        localView = paramy.a(parambb);
      } while (localView == null);
      k += m;
      this.e[i1] = localView;
      i1 += 1;
    }
    a(parambb, parambh, i1, k, bool);
    int k = 0;
    int j = 0;
    if (k < i1)
    {
      parambb = this.e[k];
      if (paramy.k == null) {
        if (bool)
        {
          b(parambb);
          label290:
          parambh = (GridLayoutManager.LayoutParams)parambb.getLayoutParams();
          m = View.MeasureSpec.makeMeasureSpec(this.d[(GridLayoutManager.LayoutParams.a(parambh) + GridLayoutManager.LayoutParams.b(parambh))] - this.d[GridLayoutManager.LayoutParams.a(parambh)], 1073741824);
          if (this.j != 1) {
            break label414;
          }
          a(parambb, m, m(parambh.height), false);
          label353:
          m = this.k.c(parambb);
          if (m <= j) {
            break label881;
          }
          j = m;
        }
      }
    }
    label414:
    label538:
    label619:
    label836:
    label872:
    label881:
    for (;;)
    {
      k += 1;
      break;
      b(parambb, 0);
      break label290;
      if (bool)
      {
        a(parambb);
        break label290;
      }
      a(parambb, 0);
      break label290;
      a(parambb, m(parambh.width), m, false);
      break label353;
      m = m(j);
      k = 0;
      if (k < i1)
      {
        parambb = this.e[k];
        if (this.k.c(parambb) != j)
        {
          parambh = (GridLayoutManager.LayoutParams)parambb.getLayoutParams();
          n = View.MeasureSpec.makeMeasureSpec(this.d[(GridLayoutManager.LayoutParams.a(parambh) + GridLayoutManager.LayoutParams.b(parambh))] - this.d[GridLayoutManager.LayoutParams.a(parambh)], 1073741824);
          if (this.j != 1) {
            break label538;
          }
          a(parambb, n, m, true);
        }
        for (;;)
        {
          k += 1;
          break;
          a(parambb, m, n, true);
        }
      }
      paramx.a = j;
      n = 0;
      int i2;
      if (this.j == 1) {
        if (paramy.f == -1)
        {
          n = paramy.b;
          j = n - j;
          k = 0;
          m = 0;
          int i4 = 0;
          i2 = m;
          int i3 = j;
          m = i4;
          j = i2;
          i2 = i3;
          if (m >= i1) {
            break label872;
          }
          parambb = this.e[m];
          parambh = (GridLayoutManager.LayoutParams)parambb.getLayoutParams();
          if (this.j != 1) {
            break label836;
          }
          j = u();
          j = this.d[GridLayoutManager.LayoutParams.a(parambh)] + j;
          k = this.k.d(parambb) + j;
        }
      }
      for (;;)
      {
        a(parambb, j + parambh.leftMargin, i2 + parambh.topMargin, k - parambh.rightMargin, n - parambh.bottomMargin);
        if ((parambh.c()) || (parambh.d())) {
          paramx.c = true;
        }
        paramx.d |= parambb.isFocusable();
        m += 1;
        break label619;
        k = paramy.b;
        n = k + j;
        j = k;
        k = 0;
        m = 0;
        break;
        if (paramy.f == -1)
        {
          m = paramy.b;
          k = m;
          m -= j;
          j = 0;
          break;
        }
        m = paramy.b;
        k = j + m;
        j = 0;
        break;
        n = v();
        i2 = this.d[GridLayoutManager.LayoutParams.a(parambh)] + n;
        n = this.k.d(parambb) + i2;
      }
      Arrays.fill(this.e, null);
      return;
    }
  }
  
  public void a(bb parambb, bh parambh, View paramView, g paramg)
  {
    ViewGroup.LayoutParams localLayoutParams = paramView.getLayoutParams();
    if (!(localLayoutParams instanceof GridLayoutManager.LayoutParams))
    {
      super.a(paramView, paramg);
      return;
    }
    paramView = (GridLayoutManager.LayoutParams)localLayoutParams;
    int j = a(parambb, parambh, paramView.e());
    if (this.j == 0)
    {
      k = paramView.a();
      m = paramView.b();
      if ((this.c > 1) && (paramView.b() == this.c)) {}
      for (bool = true;; bool = false)
      {
        paramg.c(android.support.v4.view.a.s.a(k, m, j, 1, bool, false));
        return;
      }
    }
    int k = paramView.a();
    int m = paramView.b();
    if ((this.c > 1) && (paramView.b() == this.c)) {}
    for (boolean bool = true;; bool = false)
    {
      paramg.c(android.support.v4.view.a.s.a(j, 1, k, m, bool, false));
      return;
    }
  }
  
  public boolean a(RecyclerView.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof GridLayoutManager.LayoutParams;
  }
  
  public int b(int paramInt, bb parambb, bh parambh)
  {
    D();
    E();
    return super.b(paramInt, parambb, parambh);
  }
  
  public int b(bb parambb, bh parambh)
  {
    if (this.j == 1) {
      return this.c;
    }
    if (parambh.e() < 1) {
      return 0;
    }
    return a(parambb, parambh, parambh.e() - 1);
  }
  
  public void b(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    this.h.a();
  }
  
  public boolean b()
  {
    return (this.o == null) && (!this.b);
  }
  
  public void c(bb parambb, bh parambh)
  {
    if (parambh.a()) {
      C();
    }
    super.c(parambb, parambh);
    B();
    if (!parambh.a()) {
      this.b = false;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v7\widget\GridLayoutManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */