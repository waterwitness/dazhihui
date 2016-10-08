package android.support.v7.widget;

import android.content.Context;
import android.graphics.Rect;
import android.os.Parcelable;
import android.support.v4.view.a.a;
import android.support.v4.view.a.al;
import android.support.v4.view.a.g;
import android.support.v4.view.a.s;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.accessibility.AccessibilityEvent;
import java.util.ArrayList;
import java.util.BitSet;

public class StaggeredGridLayoutManager
  extends aw
{
  private boolean A;
  private final Runnable B;
  ad a;
  ad b;
  boolean c;
  int d;
  int e;
  StaggeredGridLayoutManager.LazySpanLookup f;
  private int g;
  private bt[] h;
  private int i;
  private int j;
  private u k;
  private boolean l;
  private BitSet m;
  private int n;
  private boolean o;
  private boolean p;
  private StaggeredGridLayoutManager.SavedState t;
  private int u;
  private int v;
  private int w;
  private final Rect x;
  private final bq y;
  private boolean z;
  
  private boolean B()
  {
    if ((r() == 0) || (this.n == 0) || (!m())) {
      return false;
    }
    int i2;
    if (this.c) {
      i2 = E();
    }
    for (int i1 = F(); (i2 == 0) && (f() != null); i1 = E())
    {
      this.f.a();
      A();
      l();
      return true;
      i2 = F();
    }
    if (!this.z) {
      return false;
    }
    if (this.c) {}
    StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem1;
    for (int i3 = -1;; i3 = 1)
    {
      localFullSpanItem1 = this.f.a(i2, i1 + 1, i3, true);
      if (localFullSpanItem1 != null) {
        break;
      }
      this.z = false;
      this.f.a(i1 + 1);
      return false;
    }
    StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem2 = this.f.a(i2, localFullSpanItem1.a, i3 * -1, true);
    if (localFullSpanItem2 == null) {
      this.f.a(localFullSpanItem1.a);
    }
    for (;;)
    {
      A();
      l();
      return true;
      this.f.a(localFullSpanItem2.a + 1);
    }
  }
  
  private void C()
  {
    if (this.a == null)
    {
      this.a = ad.a(this, this.i);
      this.b = ad.a(this, 1 - this.i);
      this.k = new u();
    }
  }
  
  private void D()
  {
    boolean bool = true;
    if ((this.i == 1) || (!g()))
    {
      this.c = this.l;
      return;
    }
    if (!this.l) {}
    for (;;)
    {
      this.c = bool;
      return;
      bool = false;
    }
  }
  
  private int E()
  {
    int i1 = r();
    if (i1 == 0) {
      return 0;
    }
    return d(h(i1 - 1));
  }
  
  private int F()
  {
    if (r() == 0) {
      return 0;
    }
    return d(h(0));
  }
  
  private int a(int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramInt2 == 0) && (paramInt3 == 0)) {}
    int i1;
    do
    {
      return paramInt1;
      i1 = View.MeasureSpec.getMode(paramInt1);
    } while ((i1 != Integer.MIN_VALUE) && (i1 != 1073741824));
    return View.MeasureSpec.makeMeasureSpec(Math.max(0, View.MeasureSpec.getSize(paramInt1) - paramInt2 - paramInt3), i1);
  }
  
  private int a(bb parambb, u paramu, bh parambh)
  {
    this.m.set(0, this.g, true);
    int i3;
    int i4;
    label58:
    int i1;
    label61:
    View localView;
    StaggeredGridLayoutManager.LayoutParams localLayoutParams;
    int i7;
    int i5;
    label123:
    bt localbt;
    label144:
    label155:
    label176:
    label208:
    int i6;
    StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem;
    int i2;
    if (paramu.d == 1)
    {
      i3 = paramu.f + paramu.a;
      c(paramu.d, i3);
      if (!this.c) {
        break label407;
      }
      i4 = this.a.d();
      i1 = 0;
      if ((!paramu.a(parambh)) || (this.m.isEmpty())) {
        break label705;
      }
      localView = paramu.a(parambb);
      localLayoutParams = (StaggeredGridLayoutManager.LayoutParams)localView.getLayoutParams();
      i7 = localLayoutParams.e();
      i1 = this.f.c(i7);
      if (i1 != -1) {
        break label419;
      }
      i5 = 1;
      if (i5 == 0) {
        break label435;
      }
      if (!localLayoutParams.f) {
        break label425;
      }
      localbt = this.h[0];
      this.f.a(i7, localbt);
      localLayoutParams.e = localbt;
      if (paramu.d != 1) {
        break label447;
      }
      b(localView);
      a(localView, localLayoutParams);
      if (paramu.d != 1) {
        break label469;
      }
      if (!localLayoutParams.f) {
        break label457;
      }
      i1 = n(i4);
      i6 = i1 + this.a.c(localView);
      if ((i5 == 0) || (!localLayoutParams.f)) {
        break label796;
      }
      localFullSpanItem = b(i1);
      localFullSpanItem.b = -1;
      localFullSpanItem.a = i7;
      this.f.a(localFullSpanItem);
      i2 = i1;
    }
    for (;;)
    {
      if ((localLayoutParams.f) && (paramu.c == -1))
      {
        if (i5 != 0) {
          this.z = true;
        }
      }
      else
      {
        label295:
        a(localView, localLayoutParams, paramu);
        if (!localLayoutParams.f) {
          break label639;
        }
        i1 = this.b.c();
        label321:
        i5 = i1 + this.b.c(localView);
        if (this.i != 1) {
          break label670;
        }
        b(localView, i1, i2, i5, i6);
        label357:
        if (!localLayoutParams.f) {
          break label687;
        }
        c(this.k.d, i3);
      }
      for (;;)
      {
        a(parambb, this.k);
        i1 = 1;
        break label61;
        i3 = paramu.e - paramu.a;
        break;
        label407:
        i4 = this.a.c();
        break label58;
        label419:
        i5 = 0;
        break label123;
        label425:
        localbt = a(paramu);
        break label144;
        label435:
        localbt = this.h[i1];
        break label155;
        label447:
        b(localView, 0);
        break label176;
        label457:
        i1 = localbt.b(i4);
        break label208;
        label469:
        if (localLayoutParams.f) {}
        for (i1 = m(i4);; i1 = localbt.a(i4))
        {
          i2 = i1 - this.a.c(localView);
          if ((i5 != 0) && (localLayoutParams.f))
          {
            localFullSpanItem = d(i1);
            localFullSpanItem.b = 1;
            localFullSpanItem.a = i7;
            this.f.a(localFullSpanItem);
          }
          i6 = i1;
          break;
        }
        if (paramu.d == 1) {
          if (!j()) {
            i1 = 1;
          }
        }
        for (;;)
        {
          if (i1 == 0) {
            break label637;
          }
          localFullSpanItem = this.f.f(i7);
          if (localFullSpanItem != null) {
            localFullSpanItem.d = true;
          }
          this.z = true;
          break;
          i1 = 0;
          continue;
          if (!k()) {
            i1 = 1;
          } else {
            i1 = 0;
          }
        }
        label637:
        break label295;
        label639:
        i1 = localbt.d;
        i5 = this.j;
        i1 = this.b.c() + i1 * i5;
        break label321;
        label670:
        b(localView, i2, i1, i6, i5);
        break label357;
        label687:
        a(localbt, this.k.d, i3);
      }
      label705:
      if (i1 == 0) {
        a(parambb, this.k);
      }
      if (this.k.d == -1) {
        i1 = m(this.a.c());
      }
      for (i1 = this.a.c() - i1; i1 > 0; i1 = n(this.a.d()) - this.a.d()) {
        return Math.min(paramu.a, i1);
      }
      return 0;
      label796:
      i2 = i1;
    }
  }
  
  private int a(bh parambh)
  {
    boolean bool2 = false;
    if (r() == 0) {
      return 0;
    }
    C();
    ad localad = this.a;
    if (!this.A) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      View localView = a(bool1, true);
      bool1 = bool2;
      if (!this.A) {
        bool1 = true;
      }
      return bn.a(parambh, localad, localView, b(bool1, true), this, this.A, this.c);
    }
  }
  
  private bt a(u paramu)
  {
    Object localObject2 = null;
    Object localObject1 = null;
    int i2 = -1;
    int i1;
    int i3;
    int i6;
    int i5;
    int i4;
    if (p(paramu.d))
    {
      i1 = this.g - 1;
      i3 = -1;
      if (paramu.d != 1) {
        break label124;
      }
      i6 = this.a.c();
      i5 = Integer.MAX_VALUE;
      i4 = i1;
      paramu = (u)localObject1;
      i1 = i5;
      label61:
      localObject1 = paramu;
      if (i4 == i3) {
        break label195;
      }
      localObject1 = this.h[i4];
      i5 = ((bt)localObject1).b(i6);
      if (i5 >= i1) {
        break label200;
      }
      paramu = (u)localObject1;
      i1 = i5;
    }
    label124:
    label195:
    label197:
    label200:
    for (;;)
    {
      i4 += i2;
      break label61;
      i3 = this.g;
      i1 = 0;
      i2 = 1;
      break;
      i6 = this.a.d();
      i5 = Integer.MIN_VALUE;
      i4 = i1;
      paramu = (u)localObject2;
      i1 = i5;
      localObject1 = paramu;
      if (i4 != i3)
      {
        localObject1 = this.h[i4];
        i5 = ((bt)localObject1).a(i6);
        if (i5 <= i1) {
          break label197;
        }
        paramu = (u)localObject1;
        i1 = i5;
      }
      for (;;)
      {
        i4 += i2;
        break;
        return (bt)localObject1;
      }
    }
  }
  
  private void a(int paramInt)
  {
    int i1 = 1;
    this.k.d = paramInt;
    u localu = this.k;
    boolean bool2 = this.c;
    boolean bool1;
    if (paramInt == -1)
    {
      bool1 = true;
      if (bool2 != bool1) {
        break label50;
      }
    }
    label50:
    for (paramInt = i1;; paramInt = -1)
    {
      localu.c = paramInt;
      return;
      bool1 = false;
      break;
    }
  }
  
  private void a(int paramInt, bh parambh)
  {
    int i1 = 0;
    this.k.a = 0;
    this.k.b = paramInt;
    boolean bool1;
    if (o())
    {
      int i2 = parambh.c();
      if (i2 != -1)
      {
        boolean bool2 = this.c;
        if (i2 < paramInt)
        {
          bool1 = true;
          if (bool2 != bool1) {
            break label113;
          }
          paramInt = this.a.f();
        }
      }
    }
    for (;;)
    {
      if (n())
      {
        this.k.e = (this.a.c() - i1);
        this.k.f = (paramInt + this.a.d());
        return;
        bool1 = false;
        break;
        label113:
        i1 = this.a.f();
        paramInt = 0;
        continue;
      }
      this.k.f = (paramInt + this.a.e());
      this.k.e = (-i1);
      return;
      paramInt = 0;
    }
  }
  
  private void a(bb parambb, int paramInt)
  {
    for (;;)
    {
      View localView;
      StaggeredGridLayoutManager.LayoutParams localLayoutParams;
      if (r() > 0)
      {
        localView = h(0);
        if (this.a.b(localView) <= paramInt)
        {
          localLayoutParams = (StaggeredGridLayoutManager.LayoutParams)localView.getLayoutParams();
          if (!localLayoutParams.f) {
            break label112;
          }
          i1 = 0;
          if (i1 >= this.g) {
            break label81;
          }
          if (bt.a(this.h[i1]).size() != 1) {
            break label72;
          }
        }
      }
      label72:
      label81:
      label112:
      while (bt.a(localLayoutParams.e).size() == 1)
      {
        for (;;)
        {
          return;
          i1 += 1;
        }
        int i1 = 0;
        while (i1 < this.g)
        {
          this.h[i1].h();
          i1 += 1;
        }
      }
      localLayoutParams.e.h();
      a(localView, parambb);
    }
  }
  
  private void a(bb parambb, bh parambh, boolean paramBoolean)
  {
    int i1 = n(this.a.d());
    i1 = this.a.d() - i1;
    if (i1 > 0)
    {
      i1 -= -c(-i1, parambb, parambh);
      if ((paramBoolean) && (i1 > 0)) {
        this.a.a(i1);
      }
    }
  }
  
  private void a(bb parambb, u paramu)
  {
    if (paramu.a == 0)
    {
      if (paramu.d == -1)
      {
        b(parambb, paramu.f);
        return;
      }
      a(parambb, paramu.e);
      return;
    }
    if (paramu.d == -1)
    {
      i1 = paramu.e - l(paramu.e);
      if (i1 < 0) {}
      for (i1 = paramu.f;; i1 = paramu.f - Math.min(i1, paramu.a))
      {
        b(parambb, i1);
        return;
      }
    }
    int i1 = o(paramu.f) - paramu.f;
    if (i1 < 0) {}
    int i2;
    for (i1 = paramu.e;; i1 = Math.min(i1, paramu.a) + i2)
    {
      a(parambb, i1);
      return;
      i2 = paramu.e;
    }
  }
  
  private void a(bq parambq)
  {
    if (this.t.c > 0) {
      if (this.t.c == this.g)
      {
        int i2 = 0;
        if (i2 < this.g)
        {
          this.h[i2].e();
          int i3 = this.t.d[i2];
          int i1 = i3;
          if (i3 != Integer.MIN_VALUE) {
            if (!this.t.i) {
              break label102;
            }
          }
          label102:
          for (i1 = i3 + this.a.d();; i1 = i3 + this.a.c())
          {
            this.h[i2].c(i1);
            i2 += 1;
            break;
          }
        }
      }
      else
      {
        this.t.a();
        this.t.a = this.t.b;
      }
    }
    this.p = this.t.j;
    a(this.t.h);
    D();
    if (this.t.a != -1) {
      this.d = this.t.a;
    }
    for (parambq.c = this.t.i;; parambq.c = this.c)
    {
      if (this.t.e > 1)
      {
        this.f.a = this.t.f;
        this.f.b = this.t.g;
      }
      return;
    }
  }
  
  private void a(bt parambt, int paramInt1, int paramInt2)
  {
    int i1 = parambt.i();
    if (paramInt1 == -1) {
      if (i1 + parambt.b() <= paramInt2) {
        this.m.set(parambt.d, false);
      }
    }
    while (parambt.d() - i1 < paramInt2) {
      return;
    }
    this.m.set(parambt.d, false);
  }
  
  private void a(View paramView, StaggeredGridLayoutManager.LayoutParams paramLayoutParams)
  {
    if (paramLayoutParams.f)
    {
      if (this.i == 1)
      {
        b(paramView, this.u, b(paramLayoutParams.height, this.w));
        return;
      }
      b(paramView, b(paramLayoutParams.width, this.v), this.u);
      return;
    }
    if (this.i == 1)
    {
      b(paramView, this.v, b(paramLayoutParams.height, this.w));
      return;
    }
    b(paramView, b(paramLayoutParams.width, this.v), this.w);
  }
  
  private void a(View paramView, StaggeredGridLayoutManager.LayoutParams paramLayoutParams, u paramu)
  {
    if (paramu.d == 1)
    {
      if (paramLayoutParams.f)
      {
        o(paramView);
        return;
      }
      paramLayoutParams.e.b(paramView);
      return;
    }
    if (paramLayoutParams.f)
    {
      p(paramView);
      return;
    }
    paramLayoutParams.e.a(paramView);
  }
  
  private boolean a(bt parambt)
  {
    if (this.c)
    {
      if (parambt.d() >= this.a.d()) {}
    }
    else {
      while (parambt.b() > this.a.c()) {
        return true;
      }
    }
    return false;
  }
  
  private int b(int paramInt1, int paramInt2)
  {
    if (paramInt1 < 0) {
      return paramInt2;
    }
    return View.MeasureSpec.makeMeasureSpec(paramInt1, 1073741824);
  }
  
  private StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem b(int paramInt)
  {
    StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem = new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem();
    localFullSpanItem.c = new int[this.g];
    int i1 = 0;
    while (i1 < this.g)
    {
      localFullSpanItem.c[i1] = (paramInt - this.h[i1].b(paramInt));
      i1 += 1;
    }
    return localFullSpanItem;
  }
  
  private void b(int paramInt1, int paramInt2, int paramInt3)
  {
    int i3;
    int i2;
    int i1;
    if (this.c)
    {
      i3 = E();
      if (paramInt3 != 8) {
        break label104;
      }
      if (paramInt1 >= paramInt2) {
        break label93;
      }
      i2 = paramInt2 + 1;
      i1 = paramInt1;
      label32:
      this.f.b(i1);
      switch (paramInt3)
      {
      default: 
        label76:
        if (i2 > i3) {
          break;
        }
      }
    }
    for (;;)
    {
      return;
      i3 = F();
      break;
      label93:
      i2 = paramInt1 + 1;
      i1 = paramInt2;
      break label32;
      label104:
      i2 = paramInt1 + paramInt2;
      i1 = paramInt1;
      break label32;
      this.f.b(paramInt1, paramInt2);
      break label76;
      this.f.a(paramInt1, paramInt2);
      break label76;
      this.f.a(paramInt1, 1);
      this.f.b(paramInt2, 1);
      break label76;
      if (this.c) {}
      for (paramInt1 = F(); i1 <= paramInt1; paramInt1 = E())
      {
        l();
        return;
      }
    }
  }
  
  private void b(bb parambb, int paramInt)
  {
    int i1 = r() - 1;
    for (;;)
    {
      View localView;
      StaggeredGridLayoutManager.LayoutParams localLayoutParams;
      if (i1 >= 0)
      {
        localView = h(i1);
        if (this.a.a(localView) >= paramInt)
        {
          localLayoutParams = (StaggeredGridLayoutManager.LayoutParams)localView.getLayoutParams();
          if (!localLayoutParams.f) {
            break label119;
          }
          i2 = 0;
          if (i2 >= this.g) {
            break label88;
          }
          if (bt.a(this.h[i2]).size() != 1) {
            break label79;
          }
        }
      }
      label79:
      label88:
      label119:
      while (bt.a(localLayoutParams.e).size() == 1)
      {
        for (;;)
        {
          return;
          i2 += 1;
        }
        int i2 = 0;
        while (i2 < this.g)
        {
          this.h[i2].g();
          i2 += 1;
        }
      }
      localLayoutParams.e.g();
      a(localView, parambb);
      i1 -= 1;
    }
  }
  
  private void b(bb parambb, bh parambh, boolean paramBoolean)
  {
    int i1 = m(this.a.c()) - this.a.c();
    if (i1 > 0)
    {
      i1 -= c(i1, parambb, parambh);
      if ((paramBoolean) && (i1 > 0)) {
        this.a.a(-i1);
      }
    }
  }
  
  private void b(View paramView, int paramInt1, int paramInt2)
  {
    a(paramView, this.x);
    StaggeredGridLayoutManager.LayoutParams localLayoutParams = (StaggeredGridLayoutManager.LayoutParams)paramView.getLayoutParams();
    paramView.measure(a(paramInt1, localLayoutParams.leftMargin + this.x.left, localLayoutParams.rightMargin + this.x.right), a(paramInt2, localLayoutParams.topMargin + this.x.top, localLayoutParams.bottomMargin + this.x.bottom));
  }
  
  private void b(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    StaggeredGridLayoutManager.LayoutParams localLayoutParams = (StaggeredGridLayoutManager.LayoutParams)paramView.getLayoutParams();
    a(paramView, paramInt1 + localLayoutParams.leftMargin, paramInt2 + localLayoutParams.topMargin, paramInt3 - localLayoutParams.rightMargin, paramInt4 - localLayoutParams.bottomMargin);
  }
  
  private void c(int paramInt1, int paramInt2)
  {
    int i1 = 0;
    if (i1 < this.g)
    {
      if (bt.a(this.h[i1]).isEmpty()) {}
      for (;;)
      {
        i1 += 1;
        break;
        a(this.h[i1], paramInt1, paramInt2);
      }
    }
  }
  
  private boolean c(bh parambh, bq parambq)
  {
    if (this.o) {}
    for (int i1 = s(parambh.e());; i1 = r(parambh.e()))
    {
      parambq.a = i1;
      parambq.b = Integer.MIN_VALUE;
      return true;
    }
  }
  
  private StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem d(int paramInt)
  {
    StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem localFullSpanItem = new StaggeredGridLayoutManager.LazySpanLookup.FullSpanItem();
    localFullSpanItem.c = new int[this.g];
    int i1 = 0;
    while (i1 < this.g)
    {
      localFullSpanItem.c[i1] = (this.h[i1].a(paramInt) - paramInt);
      i1 += 1;
    }
    return localFullSpanItem;
  }
  
  private int h(bh parambh)
  {
    boolean bool2 = false;
    if (r() == 0) {
      return 0;
    }
    C();
    ad localad = this.a;
    if (!this.A) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      View localView = a(bool1, true);
      bool1 = bool2;
      if (!this.A) {
        bool1 = true;
      }
      return bn.a(parambh, localad, localView, b(bool1, true), this, this.A);
    }
  }
  
  private int i(bh parambh)
  {
    boolean bool2 = false;
    if (r() == 0) {
      return 0;
    }
    C();
    ad localad = this.a;
    if (!this.A) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      View localView = a(bool1, true);
      bool1 = bool2;
      if (!this.A) {
        bool1 = true;
      }
      return bn.b(parambh, localad, localView, b(bool1, true), this, this.A);
    }
  }
  
  private int l(int paramInt)
  {
    int i2 = this.h[0].a(paramInt);
    int i1 = 1;
    while (i1 < this.g)
    {
      int i4 = this.h[i1].a(paramInt);
      int i3 = i2;
      if (i4 > i2) {
        i3 = i4;
      }
      i1 += 1;
      i2 = i3;
    }
    return i2;
  }
  
  private int m(int paramInt)
  {
    int i2 = this.h[0].a(paramInt);
    int i1 = 1;
    while (i1 < this.g)
    {
      int i4 = this.h[i1].a(paramInt);
      int i3 = i2;
      if (i4 < i2) {
        i3 = i4;
      }
      i1 += 1;
      i2 = i3;
    }
    return i2;
  }
  
  private int n(int paramInt)
  {
    int i2 = this.h[0].b(paramInt);
    int i1 = 1;
    while (i1 < this.g)
    {
      int i4 = this.h[i1].b(paramInt);
      int i3 = i2;
      if (i4 > i2) {
        i3 = i4;
      }
      i1 += 1;
      i2 = i3;
    }
    return i2;
  }
  
  private int o(int paramInt)
  {
    int i2 = this.h[0].b(paramInt);
    int i1 = 1;
    while (i1 < this.g)
    {
      int i4 = this.h[i1].b(paramInt);
      int i3 = i2;
      if (i4 < i2) {
        i3 = i4;
      }
      i1 += 1;
      i2 = i3;
    }
    return i2;
  }
  
  private void o(View paramView)
  {
    int i1 = this.g - 1;
    while (i1 >= 0)
    {
      this.h[i1].b(paramView);
      i1 -= 1;
    }
  }
  
  private void p(View paramView)
  {
    int i1 = this.g - 1;
    while (i1 >= 0)
    {
      this.h[i1].a(paramView);
      i1 -= 1;
    }
  }
  
  private boolean p(int paramInt)
  {
    int i1;
    if (this.i == 0) {
      if (paramInt == -1)
      {
        i1 = 1;
        if (i1 == this.c) {
          break label29;
        }
      }
    }
    label29:
    label63:
    label66:
    for (;;)
    {
      return true;
      i1 = 0;
      break;
      return false;
      if (paramInt == -1)
      {
        i1 = 1;
        if (i1 != this.c) {
          break label63;
        }
      }
      for (i1 = 1;; i1 = 0)
      {
        if (i1 == g()) {
          break label66;
        }
        return false;
        i1 = 0;
        break;
      }
    }
  }
  
  private int q(int paramInt)
  {
    int i1 = -1;
    if (r() == 0)
    {
      if (this.c) {
        return 1;
      }
      return -1;
    }
    int i2;
    if (paramInt < F())
    {
      i2 = 1;
      if (i2 == this.c) {
        break label47;
      }
    }
    label47:
    for (paramInt = i1;; paramInt = 1)
    {
      return paramInt;
      i2 = 0;
      break;
    }
  }
  
  private int r(int paramInt)
  {
    int i2 = r();
    int i1 = 0;
    while (i1 < i2)
    {
      int i3 = d(h(i1));
      if ((i3 >= 0) && (i3 < paramInt)) {
        return i3;
      }
      i1 += 1;
    }
    return 0;
  }
  
  private int s(int paramInt)
  {
    int i1 = r() - 1;
    while (i1 >= 0)
    {
      int i2 = d(h(i1));
      if ((i2 >= 0) && (i2 < paramInt)) {
        return i2;
      }
      i1 -= 1;
    }
    return 0;
  }
  
  public int a(int paramInt, bb parambb, bh parambh)
  {
    return c(paramInt, parambb, parambh);
  }
  
  public int a(bb parambb, bh parambh)
  {
    if (this.i == 0) {
      return this.g;
    }
    return super.a(parambb, parambh);
  }
  
  public RecyclerView.LayoutParams a()
  {
    return new StaggeredGridLayoutManager.LayoutParams(-2, -2);
  }
  
  public RecyclerView.LayoutParams a(Context paramContext, AttributeSet paramAttributeSet)
  {
    return new StaggeredGridLayoutManager.LayoutParams(paramContext, paramAttributeSet);
  }
  
  public RecyclerView.LayoutParams a(ViewGroup.LayoutParams paramLayoutParams)
  {
    if ((paramLayoutParams instanceof ViewGroup.MarginLayoutParams)) {
      return new StaggeredGridLayoutManager.LayoutParams((ViewGroup.MarginLayoutParams)paramLayoutParams);
    }
    return new StaggeredGridLayoutManager.LayoutParams(paramLayoutParams);
  }
  
  View a(boolean paramBoolean1, boolean paramBoolean2)
  {
    C();
    int i2 = this.a.c();
    int i3 = this.a.d();
    int i4 = r();
    int i1 = 0;
    Object localObject1 = null;
    if (i1 < i4)
    {
      View localView = h(i1);
      int i5 = this.a.a(localView);
      Object localObject2 = localObject1;
      if (this.a.b(localView) > i2)
      {
        if (i5 < i3) {
          break label98;
        }
        localObject2 = localObject1;
      }
      for (;;)
      {
        i1 += 1;
        localObject1 = localObject2;
        break;
        label98:
        if ((i5 >= i2) || (!paramBoolean1)) {
          return localView;
        }
        localObject2 = localObject1;
        if (paramBoolean2)
        {
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = localView;
          }
        }
      }
    }
    return (View)localObject1;
  }
  
  public void a(Parcelable paramParcelable)
  {
    if ((paramParcelable instanceof StaggeredGridLayoutManager.SavedState))
    {
      this.t = ((StaggeredGridLayoutManager.SavedState)paramParcelable);
      l();
    }
  }
  
  public void a(RecyclerView paramRecyclerView)
  {
    this.f.a();
    l();
  }
  
  public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    b(paramInt1, paramInt2, 1);
  }
  
  public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, int paramInt3)
  {
    b(paramInt1, paramInt2, 8);
  }
  
  public void a(RecyclerView paramRecyclerView, int paramInt1, int paramInt2, Object paramObject)
  {
    b(paramInt1, paramInt2, 4);
  }
  
  public void a(RecyclerView paramRecyclerView, bb parambb)
  {
    b(this.B);
    int i1 = 0;
    while (i1 < this.g)
    {
      this.h[i1].e();
      i1 += 1;
    }
  }
  
  public void a(RecyclerView paramRecyclerView, bh parambh, int paramInt)
  {
    paramRecyclerView = new bp(this, paramRecyclerView.getContext());
    paramRecyclerView.d(paramInt);
    a(paramRecyclerView);
  }
  
  public void a(bb parambb, bh parambh, View paramView, g paramg)
  {
    parambb = paramView.getLayoutParams();
    if (!(parambb instanceof StaggeredGridLayoutManager.LayoutParams))
    {
      super.a(paramView, paramg);
      return;
    }
    parambb = (StaggeredGridLayoutManager.LayoutParams)parambb;
    if (this.i == 0)
    {
      i2 = parambb.a();
      if (parambb.f) {}
      for (i1 = this.g;; i1 = 1)
      {
        paramg.c(s.a(i2, i1, -1, -1, parambb.f, false));
        return;
      }
    }
    int i2 = parambb.a();
    if (parambb.f) {}
    for (int i1 = this.g;; i1 = 1)
    {
      paramg.c(s.a(-1, -1, i2, i1, parambb.f, false));
      return;
    }
  }
  
  void a(bh parambh, bq parambq)
  {
    if (b(parambh, parambq)) {}
    while (c(parambh, parambq)) {
      return;
    }
    parambq.b();
    parambq.a = 0;
  }
  
  public void a(AccessibilityEvent paramAccessibilityEvent)
  {
    super.a(paramAccessibilityEvent);
    View localView1;
    View localView2;
    if (r() > 0)
    {
      paramAccessibilityEvent = a.a(paramAccessibilityEvent);
      localView1 = a(false, true);
      localView2 = b(false, true);
      if ((localView1 != null) && (localView2 != null)) {}
    }
    else
    {
      return;
    }
    int i1 = d(localView1);
    int i2 = d(localView2);
    if (i1 < i2)
    {
      paramAccessibilityEvent.b(i1);
      paramAccessibilityEvent.c(i2);
      return;
    }
    paramAccessibilityEvent.b(i2);
    paramAccessibilityEvent.c(i1);
  }
  
  public void a(String paramString)
  {
    if (this.t == null) {
      super.a(paramString);
    }
  }
  
  public void a(boolean paramBoolean)
  {
    a(null);
    if ((this.t != null) && (this.t.h != paramBoolean)) {
      this.t.h = paramBoolean;
    }
    this.l = paramBoolean;
    l();
  }
  
  public boolean a(RecyclerView.LayoutParams paramLayoutParams)
  {
    return paramLayoutParams instanceof StaggeredGridLayoutManager.LayoutParams;
  }
  
  public int b(int paramInt, bb parambb, bh parambh)
  {
    return c(paramInt, parambb, parambh);
  }
  
  public int b(bb parambb, bh parambh)
  {
    if (this.i == 1) {
      return this.g;
    }
    return super.b(parambb, parambh);
  }
  
  public int b(bh parambh)
  {
    return a(parambh);
  }
  
  View b(boolean paramBoolean1, boolean paramBoolean2)
  {
    C();
    int i2 = this.a.c();
    int i3 = this.a.d();
    int i1 = r() - 1;
    Object localObject1 = null;
    if (i1 >= 0)
    {
      View localView = h(i1);
      int i4 = this.a.a(localView);
      int i5 = this.a.b(localView);
      Object localObject2 = localObject1;
      if (i5 > i2)
      {
        if (i4 < i3) {
          break label99;
        }
        localObject2 = localObject1;
      }
      for (;;)
      {
        i1 -= 1;
        localObject1 = localObject2;
        break;
        label99:
        if ((i5 <= i3) || (!paramBoolean1)) {
          return localView;
        }
        localObject2 = localObject1;
        if (paramBoolean2)
        {
          localObject2 = localObject1;
          if (localObject1 == null) {
            localObject2 = localView;
          }
        }
      }
    }
    return (View)localObject1;
  }
  
  public void b(RecyclerView paramRecyclerView, int paramInt1, int paramInt2)
  {
    b(paramInt1, paramInt2, 2);
  }
  
  public boolean b()
  {
    return this.t == null;
  }
  
  boolean b(bh parambh, bq parambq)
  {
    boolean bool = false;
    if ((parambh.a()) || (this.d == -1)) {
      return false;
    }
    if ((this.d < 0) || (this.d >= parambh.e()))
    {
      this.d = -1;
      this.e = Integer.MIN_VALUE;
      return false;
    }
    if ((this.t == null) || (this.t.a == -1) || (this.t.c < 1))
    {
      parambh = c(this.d);
      if (parambh != null)
      {
        if (this.c) {}
        for (int i1 = E();; i1 = F())
        {
          parambq.a = i1;
          if (this.e == Integer.MIN_VALUE) {
            break label188;
          }
          if (!parambq.c) {
            break;
          }
          parambq.b = (this.a.d() - this.e - this.a.b(parambh));
          return true;
        }
        parambq.b = (this.a.c() + this.e - this.a.a(parambh));
        return true;
        label188:
        if (this.a.c(parambh) > this.a.f())
        {
          if (parambq.c) {}
          for (i1 = this.a.d();; i1 = this.a.c())
          {
            parambq.b = i1;
            return true;
          }
        }
        i1 = this.a.a(parambh) - this.a.c();
        if (i1 < 0)
        {
          parambq.b = (-i1);
          return true;
        }
        i1 = this.a.d() - this.a.b(parambh);
        if (i1 < 0)
        {
          parambq.b = i1;
          return true;
        }
        parambq.b = Integer.MIN_VALUE;
        return true;
      }
      parambq.a = this.d;
      if (this.e == Integer.MIN_VALUE)
      {
        if (q(parambq.a) == 1) {
          bool = true;
        }
        parambq.c = bool;
        parambq.b();
      }
      for (;;)
      {
        parambq.d = true;
        return true;
        parambq.a(this.e);
      }
    }
    parambq.b = Integer.MIN_VALUE;
    parambq.a = this.d;
    return true;
  }
  
  int c(int paramInt, bb parambb, bh parambh)
  {
    C();
    int i1;
    int i2;
    if (paramInt > 0)
    {
      i1 = 1;
      i2 = E();
      a(i2, parambh);
      a(i1);
      this.k.b = (i2 + this.k.c);
      i2 = Math.abs(paramInt);
      this.k.a = i2;
      i1 = a(parambb, this.k, parambh);
      if (i2 >= i1) {
        break label112;
      }
    }
    for (;;)
    {
      this.a.a(-paramInt);
      this.o = this.c;
      return paramInt;
      i1 = -1;
      i2 = F();
      break;
      label112:
      if (paramInt < 0) {
        paramInt = -i1;
      } else {
        paramInt = i1;
      }
    }
  }
  
  public int c(bh parambh)
  {
    return a(parambh);
  }
  
  public Parcelable c()
  {
    if (this.t != null) {
      return new StaggeredGridLayoutManager.SavedState(this.t);
    }
    StaggeredGridLayoutManager.SavedState localSavedState = new StaggeredGridLayoutManager.SavedState();
    localSavedState.h = this.l;
    localSavedState.i = this.o;
    localSavedState.j = this.p;
    int i1;
    label122:
    int i2;
    label155:
    int i3;
    if ((this.f != null) && (this.f.a != null))
    {
      localSavedState.f = this.f.a;
      localSavedState.e = localSavedState.f.length;
      localSavedState.g = this.f.b;
      if (r() <= 0) {
        break label271;
      }
      C();
      if (!this.o) {
        break label226;
      }
      i1 = E();
      localSavedState.a = i1;
      localSavedState.b = i();
      localSavedState.c = this.g;
      localSavedState.d = new int[this.g];
      i2 = 0;
      if (i2 >= this.g) {
        return localSavedState;
      }
      if (!this.o) {
        break label234;
      }
      i3 = this.h[i2].b(Integer.MIN_VALUE);
      i1 = i3;
      if (i3 != Integer.MIN_VALUE) {
        i1 = i3 - this.a.d();
      }
    }
    for (;;)
    {
      localSavedState.d[i2] = i1;
      i2 += 1;
      break label155;
      localSavedState.e = 0;
      break;
      label226:
      i1 = F();
      break label122;
      label234:
      i3 = this.h[i2].a(Integer.MIN_VALUE);
      i1 = i3;
      if (i3 != Integer.MIN_VALUE) {
        i1 = i3 - this.a.c();
      }
    }
    label271:
    localSavedState.a = -1;
    localSavedState.b = -1;
    localSavedState.c = 0;
    return localSavedState;
  }
  
  public void c(bb parambb, bh parambh)
  {
    int i2 = 0;
    C();
    bq localbq = this.y;
    localbq.a();
    if (((this.t != null) || (this.d != -1)) && (parambh.e() == 0))
    {
      c(parambb);
      return;
    }
    if (this.t != null) {
      a(localbq);
    }
    for (;;)
    {
      a(parambh, localbq);
      if ((this.t == null) && ((localbq.c != this.o) || (g() != this.p)))
      {
        this.f.a();
        localbq.d = true;
      }
      if ((r() <= 0) || ((this.t != null) && (this.t.c >= 1))) {
        break label243;
      }
      if (!localbq.d) {
        break;
      }
      i1 = 0;
      while (i1 < this.g)
      {
        this.h[i1].e();
        if (localbq.b != Integer.MIN_VALUE) {
          this.h[i1].c(localbq.b);
        }
        i1 += 1;
      }
      D();
      localbq.c = this.c;
    }
    int i1 = 0;
    while (i1 < this.g)
    {
      this.h[i1].a(this.c, localbq.b);
      i1 += 1;
    }
    label243:
    a(parambb);
    this.z = false;
    h();
    a(localbq.a, parambh);
    if (localbq.c)
    {
      a(-1);
      a(parambb, this.k, parambh);
      a(1);
      this.k.b = (localbq.a + this.k.c);
      a(parambb, this.k, parambh);
      if (r() > 0)
      {
        if (!this.c) {
          break label511;
        }
        a(parambb, parambh, true);
        b(parambb, parambh, false);
      }
    }
    for (;;)
    {
      if (!parambh.a())
      {
        i1 = i2;
        if (this.n != 0)
        {
          i1 = i2;
          if (r() > 0) {
            if (!this.z)
            {
              i1 = i2;
              if (f() == null) {}
            }
            else
            {
              i1 = 1;
            }
          }
        }
        if (i1 != 0)
        {
          b(this.B);
          a(this.B);
        }
        this.d = -1;
        this.e = Integer.MIN_VALUE;
      }
      this.o = localbq.c;
      this.p = g();
      this.t = null;
      return;
      a(1);
      a(parambb, this.k, parambh);
      a(-1);
      this.k.b = (localbq.a + this.k.c);
      a(parambb, this.k, parambh);
      break;
      label511:
      b(parambb, parambh, true);
      a(parambb, parambh, false);
    }
  }
  
  public int d(bh parambh)
  {
    return h(parambh);
  }
  
  public boolean d()
  {
    return this.i == 0;
  }
  
  public int e(bh parambh)
  {
    return h(parambh);
  }
  
  public void e(int paramInt)
  {
    if ((this.t != null) && (this.t.a != paramInt)) {
      this.t.b();
    }
    this.d = paramInt;
    this.e = Integer.MIN_VALUE;
    l();
  }
  
  public boolean e()
  {
    return this.i == 1;
  }
  
  public int f(bh parambh)
  {
    return i(parambh);
  }
  
  View f()
  {
    int i1 = r() - 1;
    BitSet localBitSet = new BitSet(this.g);
    localBitSet.set(0, this.g, true);
    int i2;
    int i3;
    if ((this.i == 1) && (g()))
    {
      i2 = 1;
      if (!this.c) {
        break label127;
      }
      i3 = -1;
      label58:
      if (i1 >= i3) {
        break label139;
      }
    }
    int i5;
    View localView;
    StaggeredGridLayoutManager.LayoutParams localLayoutParams;
    label127:
    label139:
    for (int i4 = 1;; i4 = -1)
    {
      i5 = i1;
      if (i5 == i3) {
        break label350;
      }
      localView = h(i5);
      localLayoutParams = (StaggeredGridLayoutManager.LayoutParams)localView.getLayoutParams();
      if (!localBitSet.get(localLayoutParams.e.d)) {
        break label156;
      }
      if (!a(localLayoutParams.e)) {
        break label145;
      }
      return localView;
      i2 = -1;
      break;
      i3 = i1 + 1;
      i1 = 0;
      break label58;
    }
    label145:
    localBitSet.clear(localLayoutParams.e.d);
    label156:
    if (localLayoutParams.f) {}
    label278:
    label344:
    label348:
    label350:
    label352:
    label356:
    for (;;)
    {
      i5 += i4;
      break;
      if (i5 + i4 != i3)
      {
        Object localObject = h(i5 + i4);
        int i6;
        if (this.c)
        {
          i1 = this.a.b(localView);
          i6 = this.a.b((View)localObject);
          if (i1 < i6) {
            return localView;
          }
          if (i1 != i6) {
            break label352;
          }
          i1 = 1;
        }
        for (;;)
        {
          if (i1 == 0) {
            break label356;
          }
          localObject = (StaggeredGridLayoutManager.LayoutParams)((View)localObject).getLayoutParams();
          if (localLayoutParams.e.d - ((StaggeredGridLayoutManager.LayoutParams)localObject).e.d < 0)
          {
            i1 = 1;
            if (i2 >= 0) {
              break label344;
            }
          }
          for (i6 = 1;; i6 = 0)
          {
            if (i1 == i6) {
              break label348;
            }
            return localView;
            i1 = this.a.a(localView);
            i6 = this.a.a((View)localObject);
            if (i1 > i6) {
              return localView;
            }
            if (i1 != i6) {
              break label352;
            }
            i1 = 1;
            break;
            i1 = 0;
            break label278;
          }
          break;
          return null;
          i1 = 0;
        }
      }
    }
  }
  
  public int g(bh parambh)
  {
    return i(parambh);
  }
  
  boolean g()
  {
    return p() == 1;
  }
  
  void h()
  {
    this.j = (this.b.f() / this.g);
    this.u = View.MeasureSpec.makeMeasureSpec(this.b.f(), 1073741824);
    if (this.i == 1)
    {
      this.v = View.MeasureSpec.makeMeasureSpec(this.j, 1073741824);
      this.w = View.MeasureSpec.makeMeasureSpec(0, 0);
      return;
    }
    this.w = View.MeasureSpec.makeMeasureSpec(this.j, 1073741824);
    this.v = View.MeasureSpec.makeMeasureSpec(0, 0);
  }
  
  int i()
  {
    if (this.c) {}
    for (View localView = b(true, true); localView == null; localView = a(true, true)) {
      return -1;
    }
    return d(localView);
  }
  
  public void i(int paramInt)
  {
    super.i(paramInt);
    int i1 = 0;
    while (i1 < this.g)
    {
      this.h[i1].d(paramInt);
      i1 += 1;
    }
  }
  
  public void j(int paramInt)
  {
    super.j(paramInt);
    int i1 = 0;
    while (i1 < this.g)
    {
      this.h[i1].d(paramInt);
      i1 += 1;
    }
  }
  
  boolean j()
  {
    boolean bool2 = true;
    int i2 = this.h[0].b(Integer.MIN_VALUE);
    int i1 = 1;
    for (;;)
    {
      boolean bool1 = bool2;
      if (i1 < this.g)
      {
        if (this.h[i1].b(Integer.MIN_VALUE) != i2) {
          bool1 = false;
        }
      }
      else {
        return bool1;
      }
      i1 += 1;
    }
  }
  
  public void k(int paramInt)
  {
    if (paramInt == 0) {
      B();
    }
  }
  
  boolean k()
  {
    boolean bool2 = true;
    int i2 = this.h[0].a(Integer.MIN_VALUE);
    int i1 = 1;
    for (;;)
    {
      boolean bool1 = bool2;
      if (i1 < this.g)
      {
        if (this.h[i1].a(Integer.MIN_VALUE) != i2) {
          bool1 = false;
        }
      }
      else {
        return bool1;
      }
      i1 += 1;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v7\widget\StaggeredGridLayoutManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */