package android.support.v7.widget;

import android.content.Context;
import android.graphics.PointF;
import android.os.Parcelable;
import android.support.v4.view.a.a;
import android.support.v4.view.a.al;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import java.util.List;

public class LinearLayoutManager
  extends aw
{
  private y a;
  private boolean b;
  private boolean c = false;
  private boolean d = false;
  private boolean e = true;
  private boolean f;
  int j;
  ad k;
  boolean l = false;
  int m = -1;
  int n = Integer.MIN_VALUE;
  LinearLayoutManager.SavedState o = null;
  final w p = new w(this);
  
  public LinearLayoutManager(Context paramContext)
  {
    this(paramContext, 1, false);
  }
  
  public LinearLayoutManager(Context paramContext, int paramInt, boolean paramBoolean)
  {
    b(paramInt);
    a(paramBoolean);
  }
  
  private void B()
  {
    boolean bool = true;
    if ((this.j == 1) || (!g()))
    {
      this.l = this.c;
      return;
    }
    if (!this.c) {}
    for (;;)
    {
      this.l = bool;
      return;
      bool = false;
    }
  }
  
  private View C()
  {
    if (this.l) {}
    for (int i = r() - 1;; i = 0) {
      return h(i);
    }
  }
  
  private View D()
  {
    if (this.l) {}
    for (int i = 0;; i = r() - 1) {
      return h(i);
    }
  }
  
  private int a(int paramInt)
  {
    int i1 = -1;
    int i2 = 1;
    int i3 = Integer.MIN_VALUE;
    int i = i1;
    switch (paramInt)
    {
    default: 
      i = Integer.MIN_VALUE;
    case 1: 
    case 2: 
    case 33: 
    case 130: 
    case 17: 
      do
      {
        do
        {
          return i;
          return 1;
          i = i1;
        } while (this.j == 1);
        return Integer.MIN_VALUE;
        paramInt = i3;
        if (this.j == 1) {
          paramInt = 1;
        }
        return paramInt;
        i = i1;
      } while (this.j == 0);
      return Integer.MIN_VALUE;
    }
    if (this.j == 0) {}
    for (paramInt = i2;; paramInt = Integer.MIN_VALUE) {
      return paramInt;
    }
  }
  
  private int a(int paramInt, bb parambb, bh parambh, boolean paramBoolean)
  {
    int i = this.k.d() - paramInt;
    if (i > 0)
    {
      int i1 = -c(-i, parambb, parambh);
      i = i1;
      if (paramBoolean)
      {
        paramInt = this.k.d() - (paramInt + i1);
        i = i1;
        if (paramInt > 0)
        {
          this.k.a(paramInt);
          i = i1 + paramInt;
        }
      }
      return i;
    }
    return 0;
  }
  
  private View a(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.l) {
      return a(r() - 1, -1, paramBoolean1, paramBoolean2);
    }
    return a(0, r(), paramBoolean1, paramBoolean2);
  }
  
  private void a(int paramInt1, int paramInt2, boolean paramBoolean, bh parambh)
  {
    int i = -1;
    int i1 = 1;
    this.a.h = a(parambh);
    this.a.f = paramInt1;
    if (paramInt1 == 1)
    {
      parambh = this.a;
      parambh.h += this.k.g();
      parambh = D();
      localy = this.a;
      if (this.l) {}
      for (paramInt1 = i;; paramInt1 = 1)
      {
        localy.e = paramInt1;
        this.a.d = (d(parambh) + this.a.e);
        this.a.b = this.k.b(parambh);
        paramInt1 = this.k.b(parambh) - this.k.d();
        this.a.c = paramInt2;
        if (paramBoolean)
        {
          parambh = this.a;
          parambh.c -= paramInt1;
        }
        this.a.g = paramInt1;
        return;
      }
    }
    parambh = C();
    y localy = this.a;
    localy.h += this.k.c();
    localy = this.a;
    if (this.l) {}
    for (paramInt1 = i1;; paramInt1 = -1)
    {
      localy.e = paramInt1;
      this.a.d = (d(parambh) + this.a.e);
      this.a.b = this.k.a(parambh);
      paramInt1 = -this.k.a(parambh) + this.k.c();
      break;
    }
  }
  
  private void a(bb parambb, int paramInt)
  {
    if (paramInt < 0) {}
    for (;;)
    {
      return;
      int i1 = r();
      int i;
      View localView;
      if (this.l)
      {
        i = i1 - 1;
        while (i >= 0)
        {
          localView = h(i);
          if (this.k.b(localView) > paramInt)
          {
            a(parambb, i1 - 1, i);
            return;
          }
          i -= 1;
        }
      }
      else
      {
        i = 0;
        while (i < i1)
        {
          localView = h(i);
          if (this.k.b(localView) > paramInt)
          {
            a(parambb, 0, i);
            return;
          }
          i += 1;
        }
      }
    }
  }
  
  private void a(bb parambb, int paramInt1, int paramInt2)
  {
    if (paramInt1 == paramInt2) {}
    for (;;)
    {
      return;
      int i = paramInt1;
      if (paramInt2 > paramInt1)
      {
        paramInt2 -= 1;
        while (paramInt2 >= paramInt1)
        {
          a(paramInt2, parambb);
          paramInt2 -= 1;
        }
      }
      else
      {
        while (i > paramInt2)
        {
          a(i, parambb);
          i -= 1;
        }
      }
    }
  }
  
  private void a(bb parambb, y paramy)
  {
    if (!paramy.a) {
      return;
    }
    if (paramy.f == -1)
    {
      b(parambb, paramy.g);
      return;
    }
    a(parambb, paramy.g);
  }
  
  private void a(w paramw)
  {
    b(paramw.a, paramw.b);
  }
  
  private boolean a(bh parambh, w paramw)
  {
    boolean bool = false;
    if ((parambh.a()) || (this.m == -1)) {
      return false;
    }
    if ((this.m < 0) || (this.m >= parambh.e()))
    {
      this.m = -1;
      this.n = Integer.MIN_VALUE;
      return false;
    }
    paramw.a = this.m;
    if ((this.o != null) && (this.o.a()))
    {
      paramw.c = this.o.c;
      if (paramw.c)
      {
        paramw.b = (this.k.d() - this.o.b);
        return true;
      }
      paramw.b = (this.k.c() + this.o.b);
      return true;
    }
    if (this.n == Integer.MIN_VALUE)
    {
      parambh = c(this.m);
      int i;
      if (parambh != null)
      {
        if (this.k.c(parambh) > this.k.f())
        {
          paramw.b();
          return true;
        }
        if (this.k.a(parambh) - this.k.c() < 0)
        {
          paramw.b = this.k.c();
          paramw.c = false;
          return true;
        }
        if (this.k.d() - this.k.b(parambh) < 0)
        {
          paramw.b = this.k.d();
          paramw.c = true;
          return true;
        }
        if (paramw.c) {}
        for (i = this.k.b(parambh) + this.k.b();; i = this.k.a(parambh))
        {
          paramw.b = i;
          return true;
        }
      }
      if (r() > 0)
      {
        i = d(h(0));
        if (this.m >= i) {
          break label351;
        }
      }
      label351:
      for (int i1 = 1;; i1 = 0)
      {
        if (i1 == this.l) {
          bool = true;
        }
        paramw.c = bool;
        paramw.b();
        return true;
      }
    }
    paramw.c = this.l;
    if (this.l)
    {
      paramw.b = (this.k.d() - this.n);
      return true;
    }
    paramw.b = (this.k.c() + this.n);
    return true;
  }
  
  private int b(int paramInt, bb parambb, bh parambh, boolean paramBoolean)
  {
    int i = paramInt - this.k.c();
    if (i > 0)
    {
      int i1 = -c(i, parambb, parambh);
      i = i1;
      if (paramBoolean)
      {
        paramInt = paramInt + i1 - this.k.c();
        i = i1;
        if (paramInt > 0)
        {
          this.k.a(-paramInt);
          i = i1 - paramInt;
        }
      }
      return i;
    }
    return 0;
  }
  
  private View b(boolean paramBoolean1, boolean paramBoolean2)
  {
    if (this.l) {
      return a(0, r(), paramBoolean1, paramBoolean2);
    }
    return a(r() - 1, -1, paramBoolean1, paramBoolean2);
  }
  
  private void b(int paramInt1, int paramInt2)
  {
    this.a.c = (this.k.d() - paramInt2);
    y localy = this.a;
    if (this.l) {}
    for (int i = -1;; i = 1)
    {
      localy.e = i;
      this.a.d = paramInt1;
      this.a.f = 1;
      this.a.b = paramInt2;
      this.a.g = Integer.MIN_VALUE;
      return;
    }
  }
  
  private void b(bb parambb, int paramInt)
  {
    int i = r();
    if (paramInt < 0) {}
    for (;;)
    {
      return;
      int i1 = this.k.e() - paramInt;
      View localView;
      if (this.l)
      {
        paramInt = 0;
        while (paramInt < i)
        {
          localView = h(paramInt);
          if (this.k.a(localView) < i1)
          {
            a(parambb, 0, paramInt);
            return;
          }
          paramInt += 1;
        }
      }
      else
      {
        paramInt = i - 1;
        while (paramInt >= 0)
        {
          localView = h(paramInt);
          if (this.k.a(localView) < i1)
          {
            a(parambb, i - 1, paramInt);
            return;
          }
          paramInt -= 1;
        }
      }
    }
  }
  
  private void b(bb parambb, bh parambh, int paramInt1, int paramInt2)
  {
    if ((!parambh.b()) || (r() == 0) || (parambh.a()) || (!b())) {
      return;
    }
    int i = 0;
    int i1 = 0;
    List localList = parambb.b();
    int i4 = localList.size();
    int i5 = d(h(0));
    int i2 = 0;
    if (i2 < i4)
    {
      bk localbk = (bk)localList.get(i2);
      int i3;
      if (localbk.isRemoved())
      {
        i3 = i1;
        i1 = i;
        i = i3;
      }
      for (;;)
      {
        i3 = i2 + 1;
        i2 = i1;
        i1 = i;
        i = i2;
        i2 = i3;
        break;
        int i6;
        if (localbk.getLayoutPosition() < i5)
        {
          i6 = 1;
          label143:
          if (i6 == this.l) {
            break label195;
          }
        }
        label195:
        for (i3 = -1;; i3 = 1)
        {
          if (i3 != -1) {
            break label201;
          }
          i3 = this.k.c(localbk.itemView) + i;
          i = i1;
          i1 = i3;
          break;
          i6 = 0;
          break label143;
        }
        label201:
        i3 = this.k.c(localbk.itemView) + i1;
        i1 = i;
        i = i3;
      }
    }
    this.a.k = localList;
    if (i > 0)
    {
      c(d(C()), paramInt1);
      this.a.h = i;
      this.a.c = 0;
      this.a.a();
      a(parambb, this.a, parambh, false);
    }
    if (i1 > 0)
    {
      b(d(D()), paramInt2);
      this.a.h = i1;
      this.a.c = 0;
      this.a.a();
      a(parambb, this.a, parambh, false);
    }
    this.a.k = null;
  }
  
  private void b(bb parambb, bh parambh, w paramw)
  {
    if (a(parambh, paramw)) {}
    while (c(parambb, parambh, paramw)) {
      return;
    }
    paramw.b();
    if (this.d) {}
    for (int i = parambh.e() - 1;; i = 0)
    {
      paramw.a = i;
      return;
    }
  }
  
  private void b(w paramw)
  {
    c(paramw.a, paramw.b);
  }
  
  private void c(int paramInt1, int paramInt2)
  {
    this.a.c = (paramInt2 - this.k.c());
    this.a.d = paramInt1;
    y localy = this.a;
    if (this.l) {}
    for (paramInt1 = 1;; paramInt1 = -1)
    {
      localy.e = paramInt1;
      this.a.f = -1;
      this.a.b = paramInt2;
      this.a.g = Integer.MIN_VALUE;
      return;
    }
  }
  
  private boolean c(bb parambb, bh parambh, w paramw)
  {
    int i = 0;
    if (r() == 0) {}
    do
    {
      return false;
      View localView = y();
      if ((localView != null) && (w.a(paramw, localView, parambh)))
      {
        paramw.a(localView);
        return true;
      }
    } while (this.b != this.d);
    if (paramw.c)
    {
      parambb = f(parambb, parambh);
      label66:
      if (parambb == null) {
        break label165;
      }
      paramw.b(parambb);
      if ((!parambh.a()) && (b()))
      {
        if ((this.k.a(parambb) >= this.k.d()) || (this.k.b(parambb) < this.k.c())) {
          i = 1;
        }
        if (i != 0) {
          if (!paramw.c) {
            break label167;
          }
        }
      }
    }
    label165:
    label167:
    for (i = this.k.d();; i = this.k.c())
    {
      paramw.b = i;
      return true;
      parambb = g(parambb, parambh);
      break label66;
      break;
    }
  }
  
  private View f(bb parambb, bh parambh)
  {
    if (this.l) {
      return h(parambb, parambh);
    }
    return i(parambb, parambh);
  }
  
  private View g(bb parambb, bh parambh)
  {
    if (this.l) {
      return i(parambb, parambh);
    }
    return h(parambb, parambh);
  }
  
  private int h(bh parambh)
  {
    boolean bool2 = false;
    if (r() == 0) {
      return 0;
    }
    h();
    ad localad = this.k;
    if (!this.e) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      View localView = a(bool1, true);
      bool1 = bool2;
      if (!this.e) {
        bool1 = true;
      }
      return bn.a(parambh, localad, localView, b(bool1, true), this, this.e, this.l);
    }
  }
  
  private View h(bb parambb, bh parambh)
  {
    return a(parambb, parambh, 0, r(), parambh.e());
  }
  
  private int i(bh parambh)
  {
    boolean bool2 = false;
    if (r() == 0) {
      return 0;
    }
    h();
    ad localad = this.k;
    if (!this.e) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      View localView = a(bool1, true);
      bool1 = bool2;
      if (!this.e) {
        bool1 = true;
      }
      return bn.a(parambh, localad, localView, b(bool1, true), this, this.e);
    }
  }
  
  private View i(bb parambb, bh parambh)
  {
    return a(parambb, parambh, r() - 1, -1, parambh.e());
  }
  
  private int j(bh parambh)
  {
    boolean bool2 = false;
    if (r() == 0) {
      return 0;
    }
    h();
    ad localad = this.k;
    if (!this.e) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      View localView = a(bool1, true);
      bool1 = bool2;
      if (!this.e) {
        bool1 = true;
      }
      return bn.b(parambh, localad, localView, b(bool1, true), this, this.e);
    }
  }
  
  public int a(int paramInt, bb parambb, bh parambh)
  {
    if (this.j == 1) {
      return 0;
    }
    return c(paramInt, parambb, parambh);
  }
  
  int a(bb parambb, y paramy, bh parambh, boolean paramBoolean)
  {
    int i2 = paramy.c;
    if (paramy.g != Integer.MIN_VALUE)
    {
      if (paramy.c < 0) {
        paramy.g += paramy.c;
      }
      a(parambb, paramy);
    }
    int i = paramy.c + paramy.h;
    x localx = new x();
    if ((i > 0) && (paramy.a(parambh)))
    {
      localx.a();
      a(parambb, parambh, paramy, localx);
      if (!localx.b) {
        break label104;
      }
    }
    for (;;)
    {
      return i2 - paramy.c;
      label104:
      paramy.b += localx.a * paramy.f;
      int i1;
      if ((localx.c) && (this.a.k == null))
      {
        i1 = i;
        if (parambh.a()) {}
      }
      else
      {
        paramy.c -= localx.a;
        i1 = i - localx.a;
      }
      if (paramy.g != Integer.MIN_VALUE)
      {
        paramy.g += localx.a;
        if (paramy.c < 0) {
          paramy.g += paramy.c;
        }
        a(parambb, paramy);
      }
      i = i1;
      if (!paramBoolean) {
        break;
      }
      i = i1;
      if (!localx.d) {
        break;
      }
    }
  }
  
  protected int a(bh parambh)
  {
    if (parambh.d()) {
      return this.k.f();
    }
    return 0;
  }
  
  public RecyclerView.LayoutParams a()
  {
    return new RecyclerView.LayoutParams(-2, -2);
  }
  
  View a(int paramInt1, int paramInt2, boolean paramBoolean1, boolean paramBoolean2)
  {
    h();
    int i1 = this.k.c();
    int i2 = this.k.d();
    if (paramInt2 > paramInt1) {}
    Object localObject;
    View localView;
    for (int i = 1;; i = -1)
    {
      localObject = null;
      if (paramInt1 == paramInt2) {
        break label130;
      }
      localView = h(paramInt1);
      int i3 = this.k.a(localView);
      int i4 = this.k.b(localView);
      if ((i3 >= i2) || (i4 <= i1)) {
        break label133;
      }
      if ((paramBoolean1) && ((i3 < i1) || (i4 > i2))) {
        break;
      }
      return localView;
    }
    if ((paramBoolean2) && (localObject == null)) {
      localObject = localView;
    }
    label130:
    label133:
    for (;;)
    {
      paramInt1 += i;
      break;
      return (View)localObject;
    }
  }
  
  View a(bb parambb, bh parambh, int paramInt1, int paramInt2, int paramInt3)
  {
    parambh = null;
    h();
    int i1 = this.k.c();
    int i2 = this.k.d();
    int i;
    label35:
    Object localObject1;
    if (paramInt2 > paramInt1)
    {
      i = 1;
      parambb = null;
      if (paramInt1 == paramInt2) {
        break label157;
      }
      localObject1 = h(paramInt1);
      int i3 = d((View)localObject1);
      if ((i3 < 0) || (i3 >= paramInt3)) {
        break label172;
      }
      if (!((RecyclerView.LayoutParams)((View)localObject1).getLayoutParams()).c()) {
        break label113;
      }
      if (parambb != null) {
        break label172;
      }
      parambb = parambh;
      parambh = (bh)localObject1;
    }
    for (;;)
    {
      paramInt1 += i;
      localObject1 = parambh;
      parambh = parambb;
      parambb = (bb)localObject1;
      break label35;
      i = -1;
      break;
      label113:
      Object localObject2;
      if (this.k.a((View)localObject1) < i2)
      {
        localObject2 = localObject1;
        if (this.k.b((View)localObject1) >= i1) {}
      }
      else
      {
        if (parambh != null) {
          break label172;
        }
        parambh = parambb;
        parambb = (bb)localObject1;
        continue;
        label157:
        if (parambh == null) {
          break label167;
        }
      }
      for (;;)
      {
        localObject2 = parambh;
        return (View)localObject2;
        label167:
        parambh = parambb;
      }
      label172:
      localObject1 = parambb;
      parambb = parambh;
      parambh = (bh)localObject1;
    }
  }
  
  public View a(View paramView, int paramInt, bb parambb, bh parambh)
  {
    B();
    if (r() == 0) {}
    label42:
    label134:
    label136:
    label142:
    for (;;)
    {
      return null;
      paramInt = a(paramInt);
      if (paramInt != Integer.MIN_VALUE)
      {
        h();
        if (paramInt == -1)
        {
          paramView = g(parambb, parambh);
          if (paramView == null) {
            break label134;
          }
          h();
          a(paramInt, (int)(0.33F * this.k.f()), false, parambh);
          this.a.g = Integer.MIN_VALUE;
          this.a.a = false;
          a(parambb, this.a, parambh, true);
          if (paramInt != -1) {
            break label136;
          }
        }
        for (parambb = C();; parambb = D())
        {
          if ((parambb == paramView) || (!parambb.isFocusable())) {
            break label142;
          }
          return parambb;
          paramView = f(parambb, parambh);
          break label42;
          break;
        }
      }
    }
  }
  
  public void a(Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof LinearLayoutManager.SavedState))
    {
      this.o = ((LinearLayoutManager.SavedState)paramParcelable);
      l();
    }
  }
  
  public void a(RecyclerView paramRecyclerView, bb parambb)
  {
    super.a(paramRecyclerView, parambb);
    if (this.f)
    {
      c(parambb);
      parambb.a();
    }
  }
  
  public void a(RecyclerView paramRecyclerView, bh parambh, int paramInt)
  {
    paramRecyclerView = new v(this, paramRecyclerView.getContext());
    paramRecyclerView.d(paramInt);
    a(paramRecyclerView);
  }
  
  void a(bb parambb, bh parambh, w paramw) {}
  
  void a(bb parambb, bh parambh, y paramy, x paramx)
  {
    parambb = paramy.a(parambb);
    if (parambb == null)
    {
      paramx.b = true;
      return;
    }
    parambh = (RecyclerView.LayoutParams)parambb.getLayoutParams();
    boolean bool2;
    boolean bool1;
    label61:
    int i;
    int i1;
    label120:
    int i2;
    int i3;
    if (paramy.k == null)
    {
      bool2 = this.l;
      if (paramy.f == -1)
      {
        bool1 = true;
        if (bool2 != bool1) {
          break label215;
        }
        b(parambb);
        a(parambb, 0, 0);
        paramx.a = this.k.c(parambb);
        if (this.j != 1) {
          break label322;
        }
        if (!g()) {
          break label271;
        }
        i = s() - w();
        i1 = i - this.k.d(parambb);
        if (paramy.f != -1) {
          break label293;
        }
        i2 = paramy.b;
        i3 = paramy.b - paramx.a;
      }
    }
    for (;;)
    {
      a(parambb, i1 + parambh.leftMargin, i3 + parambh.topMargin, i - parambh.rightMargin, i2 - parambh.bottomMargin);
      if ((parambh.c()) || (parambh.d())) {
        paramx.c = true;
      }
      paramx.d = parambb.isFocusable();
      return;
      bool1 = false;
      break;
      label215:
      b(parambb, 0);
      break label61;
      bool2 = this.l;
      if (paramy.f == -1) {}
      for (bool1 = true;; bool1 = false)
      {
        if (bool2 != bool1) {
          break label262;
        }
        a(parambb);
        break;
      }
      label262:
      a(parambb, 0);
      break label61;
      label271:
      i1 = u();
      i = this.k.d(parambb) + i1;
      break label120;
      label293:
      i3 = paramy.b;
      i2 = paramy.b;
      int i4 = paramx.a;
      i2 += i4;
      continue;
      label322:
      i3 = v();
      i2 = this.k.d(parambb) + i3;
      if (paramy.f == -1)
      {
        i = paramy.b;
        i1 = paramy.b - paramx.a;
      }
      else
      {
        i1 = paramy.b;
        i = paramy.b;
        i4 = paramx.a;
        i += i4;
      }
    }
  }
  
  public void a(AccessibilityEvent paramAccessibilityEvent)
  {
    super.a(paramAccessibilityEvent);
    if (r() > 0)
    {
      paramAccessibilityEvent = a.a(paramAccessibilityEvent);
      paramAccessibilityEvent.b(j());
      paramAccessibilityEvent.c(k());
    }
  }
  
  public void a(String paramString)
  {
    if (this.o == null) {
      super.a(paramString);
    }
  }
  
  public void a(boolean paramBoolean)
  {
    a(null);
    if (paramBoolean == this.c) {
      return;
    }
    this.c = paramBoolean;
    l();
  }
  
  public int b(int paramInt, bb parambb, bh parambh)
  {
    if (this.j == 0) {
      return 0;
    }
    return c(paramInt, parambb, parambh);
  }
  
  public int b(bh parambh)
  {
    return h(parambh);
  }
  
  public void b(int paramInt)
  {
    if ((paramInt != 0) && (paramInt != 1)) {
      throw new IllegalArgumentException("invalid orientation:" + paramInt);
    }
    a(null);
    if (paramInt == this.j) {
      return;
    }
    this.j = paramInt;
    this.k = null;
    l();
  }
  
  public void b(boolean paramBoolean)
  {
    this.e = paramBoolean;
  }
  
  public boolean b()
  {
    return (this.o == null) && (this.b == this.d);
  }
  
  int c(int paramInt, bb parambb, bh parambh)
  {
    if ((r() == 0) || (paramInt == 0)) {
      return 0;
    }
    this.a.a = true;
    h();
    if (paramInt > 0) {}
    int i1;
    int i2;
    for (int i = 1;; i = -1)
    {
      i1 = Math.abs(paramInt);
      a(i, i1, true, parambh);
      i2 = this.a.g + a(parambb, this.a, parambh, false);
      if (i2 >= 0) {
        break;
      }
      return 0;
    }
    if (i1 > i2) {
      paramInt = i * i2;
    }
    this.k.a(-paramInt);
    this.a.j = paramInt;
    return paramInt;
  }
  
  public int c(bh parambh)
  {
    return h(parambh);
  }
  
  public Parcelable c()
  {
    if (this.o != null) {
      return new LinearLayoutManager.SavedState(this.o);
    }
    LinearLayoutManager.SavedState localSavedState = new LinearLayoutManager.SavedState();
    if (r() > 0)
    {
      h();
      boolean bool = this.b ^ this.l;
      localSavedState.c = bool;
      if (bool)
      {
        localView = D();
        localSavedState.b = (this.k.d() - this.k.b(localView));
        localSavedState.a = d(localView);
        return localSavedState;
      }
      View localView = C();
      localSavedState.a = d(localView);
      localSavedState.b = (this.k.a(localView) - this.k.c());
      return localSavedState;
    }
    localSavedState.b();
    return localSavedState;
  }
  
  public View c(int paramInt)
  {
    int i = r();
    Object localObject;
    if (i == 0) {
      localObject = null;
    }
    View localView;
    do
    {
      return (View)localObject;
      int i1 = paramInt - d(h(0));
      if ((i1 < 0) || (i1 >= i)) {
        break;
      }
      localView = h(i1);
      localObject = localView;
    } while (d(localView) == paramInt);
    return super.c(paramInt);
  }
  
  public void c(bb parambb, bh parambh)
  {
    if (((this.o != null) || (this.m != -1)) && (parambh.e() == 0))
    {
      c(parambb);
      return;
    }
    if ((this.o != null) && (this.o.a())) {
      this.m = this.o.a;
    }
    h();
    this.a.a = false;
    B();
    this.p.a();
    this.p.c = (this.l ^ this.d);
    b(parambb, parambh, this.p);
    int i = a(parambh);
    int i1;
    int i2;
    int i3;
    Object localObject;
    label248:
    label264:
    int i4;
    if (this.a.j >= 0)
    {
      i1 = 0;
      i2 = i1 + this.k.c();
      i3 = i + this.k.g();
      i = i3;
      i1 = i2;
      if (parambh.a())
      {
        i = i3;
        i1 = i2;
        if (this.m != -1)
        {
          i = i3;
          i1 = i2;
          if (this.n != Integer.MIN_VALUE)
          {
            localObject = c(this.m);
            i = i3;
            i1 = i2;
            if (localObject != null)
            {
              if (!this.l) {
                break label629;
              }
              i = this.k.d() - this.k.b((View)localObject) - this.n;
              if (i <= 0) {
                break label663;
              }
              i1 = i2 + i;
              i = i3;
            }
          }
        }
      }
      a(parambb, parambh, this.p);
      a(parambb);
      this.a.i = parambh.a();
      if (!this.p.c) {
        break label677;
      }
      b(this.p);
      this.a.h = i1;
      a(parambb, this.a, parambh, false);
      i3 = this.a.b;
      i4 = this.a.d;
      i1 = i;
      if (this.a.c > 0) {
        i1 = i + this.a.c;
      }
      a(this.p);
      this.a.h = i1;
      localObject = this.a;
      ((y)localObject).d += this.a.e;
      a(parambb, this.a, parambh, false);
      i2 = this.a.b;
      if (this.a.c <= 0) {
        break label930;
      }
      i = this.a.c;
      c(i4, i3);
      this.a.h = i;
      a(parambb, this.a, parambh, false);
    }
    label497:
    label629:
    label663:
    label677:
    label881:
    label930:
    for (i = this.a.b;; i = i3)
    {
      i1 = i;
      i = i2;
      i2 = i;
      i3 = i1;
      if (r() > 0)
      {
        if (!(this.l ^ this.d)) {
          break label881;
        }
        i2 = a(i, parambb, parambh, true);
        i3 = i1 + i2;
        i1 = b(i3, parambb, parambh, false);
        i3 += i1;
      }
      for (i2 = i + i2 + i1;; i2 = i + i4)
      {
        b(parambb, parambh, i3, i2);
        if (!parambh.a())
        {
          this.m = -1;
          this.n = Integer.MIN_VALUE;
          this.k.a();
        }
        this.b = this.d;
        this.o = null;
        return;
        i1 = i;
        i = 0;
        break;
        i = this.k.a((View)localObject);
        i1 = this.k.c();
        i = this.n - (i - i1);
        break label248;
        i = i3 - i;
        i1 = i2;
        break label264;
        a(this.p);
        this.a.h = i;
        a(parambb, this.a, parambh, false);
        i2 = this.a.b;
        i4 = this.a.d;
        i = i1;
        if (this.a.c > 0) {
          i = i1 + this.a.c;
        }
        b(this.p);
        this.a.h = i;
        localObject = this.a;
        ((y)localObject).d += this.a.e;
        a(parambb, this.a, parambh, false);
        i3 = this.a.b;
        i = i2;
        i1 = i3;
        if (this.a.c <= 0) {
          break label497;
        }
        i = this.a.c;
        b(i4, i2);
        this.a.h = i;
        a(parambb, this.a, parambh, false);
        i = this.a.b;
        i1 = i3;
        break label497;
        i2 = b(i1, parambb, parambh, true);
        i += i2;
        i4 = a(i, parambb, parambh, false);
        i3 = i1 + i2 + i4;
      }
    }
  }
  
  public int d(bh parambh)
  {
    return i(parambh);
  }
  
  public PointF d(int paramInt)
  {
    int i = 1;
    int i1 = 0;
    if (r() == 0) {
      return null;
    }
    if (paramInt < d(h(0))) {
      i1 = 1;
    }
    paramInt = i;
    if (i1 != this.l) {
      paramInt = -1;
    }
    if (this.j == 0) {
      return new PointF(paramInt, 0.0F);
    }
    return new PointF(0.0F, paramInt);
  }
  
  public boolean d()
  {
    return this.j == 0;
  }
  
  public int e(bh parambh)
  {
    return i(parambh);
  }
  
  public void e(int paramInt)
  {
    this.m = paramInt;
    this.n = Integer.MIN_VALUE;
    if (this.o != null) {
      this.o.b();
    }
    l();
  }
  
  public boolean e()
  {
    return this.j == 1;
  }
  
  public int f()
  {
    return this.j;
  }
  
  public int f(bh parambh)
  {
    return j(parambh);
  }
  
  public int g(bh parambh)
  {
    return j(parambh);
  }
  
  protected boolean g()
  {
    return p() == 1;
  }
  
  void h()
  {
    if (this.a == null) {
      this.a = i();
    }
    if (this.k == null) {
      this.k = ad.a(this, this.j);
    }
  }
  
  y i()
  {
    return new y();
  }
  
  public int j()
  {
    View localView = a(0, r(), false, true);
    if (localView == null) {
      return -1;
    }
    return d(localView);
  }
  
  public int k()
  {
    View localView = a(r() - 1, -1, false, true);
    if (localView == null) {
      return -1;
    }
    return d(localView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v7\widget\LinearLayoutManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */