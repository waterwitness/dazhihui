package android.support.v7.widget;

import android.support.v4.a.a;
import android.support.v4.view.bn;
import android.support.v4.view.dr;
import android.view.View;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class g
  extends bo
{
  private ArrayList<bk> b = new ArrayList();
  private ArrayList<bk> c = new ArrayList();
  private ArrayList<q> d = new ArrayList();
  private ArrayList<p> e = new ArrayList();
  private ArrayList<ArrayList<bk>> f = new ArrayList();
  private ArrayList<ArrayList<q>> g = new ArrayList();
  private ArrayList<ArrayList<p>> h = new ArrayList();
  private ArrayList<bk> i = new ArrayList();
  private ArrayList<bk> j = new ArrayList();
  private ArrayList<bk> k = new ArrayList();
  private ArrayList<bk> l = new ArrayList();
  
  private void a(p paramp)
  {
    View localView = null;
    Object localObject = paramp.a;
    if (localObject == null) {}
    for (localObject = null;; localObject = ((bk)localObject).itemView)
    {
      bk localbk = paramp.b;
      if (localbk != null) {
        localView = localbk.itemView;
      }
      if (localObject != null)
      {
        localObject = bn.p((View)localObject).a(g());
        this.l.add(paramp.a);
        ((dr)localObject).b(paramp.e - paramp.c);
        ((dr)localObject).c(paramp.f - paramp.d);
        ((dr)localObject).a(0.0F).a(new n(this, paramp, (dr)localObject)).a();
      }
      if (localView != null)
      {
        localObject = bn.p(localView);
        this.l.add(paramp.b);
        ((dr)localObject).b(0.0F).c(0.0F).a(g()).a(1.0F).a(new o(this, paramp, (dr)localObject, localView)).a();
      }
      return;
    }
  }
  
  private void a(List<p> paramList, bk parambk)
  {
    int m = paramList.size() - 1;
    while (m >= 0)
    {
      p localp = (p)paramList.get(m);
      if ((a(localp, parambk)) && (localp.a == null) && (localp.b == null)) {
        paramList.remove(localp);
      }
      m -= 1;
    }
  }
  
  private boolean a(p paramp, bk parambk)
  {
    boolean bool2 = false;
    boolean bool1 = false;
    if (paramp.b == parambk) {
      paramp.b = null;
    }
    for (;;)
    {
      bn.c(parambk.itemView, 1.0F);
      bn.a(parambk.itemView, 0.0F);
      bn.b(parambk.itemView, 0.0F);
      a(parambk, bool1);
      bool1 = true;
      do
      {
        return bool1;
        bool1 = bool2;
      } while (paramp.a != parambk);
      paramp.a = null;
      bool1 = true;
    }
  }
  
  private void b(bk parambk, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    Object localObject = parambk.itemView;
    paramInt1 = paramInt3 - paramInt1;
    paramInt2 = paramInt4 - paramInt2;
    if (paramInt1 != 0) {
      bn.p((View)localObject).b(0.0F);
    }
    if (paramInt2 != 0) {
      bn.p((View)localObject).c(0.0F);
    }
    localObject = bn.p((View)localObject);
    this.j.add(parambk);
    ((dr)localObject).a(d()).a(new m(this, parambk, paramInt1, paramInt2, (dr)localObject)).a();
  }
  
  private void b(p paramp)
  {
    if (paramp.a != null) {
      a(paramp, paramp.a);
    }
    if (paramp.b != null) {
      a(paramp, paramp.b);
    }
  }
  
  private void j()
  {
    if (!b()) {
      h();
    }
  }
  
  private void t(bk parambk)
  {
    dr localdr = bn.p(parambk.itemView);
    this.k.add(parambk);
    localdr.a(f()).a(0.0F).a(new k(this, parambk, localdr)).a();
  }
  
  private void u(bk parambk)
  {
    dr localdr = bn.p(parambk.itemView);
    this.i.add(parambk);
    localdr.a(1.0F).a(e()).a(new l(this, parambk, localdr)).a();
  }
  
  private void v(bk parambk)
  {
    a.a(parambk.itemView);
    c(parambk);
  }
  
  public void a()
  {
    int m;
    int n;
    label25:
    int i1;
    if (!this.b.isEmpty())
    {
      m = 1;
      if (this.d.isEmpty()) {
        break label76;
      }
      n = 1;
      if (this.e.isEmpty()) {
        break label82;
      }
      i1 = 1;
      label38:
      if (this.c.isEmpty()) {
        break label88;
      }
    }
    label76:
    label82:
    label88:
    for (int i2 = 1;; i2 = 0)
    {
      if ((m != 0) || (n != 0) || (i2 != 0) || (i1 != 0)) {
        break label94;
      }
      return;
      m = 0;
      break;
      n = 0;
      break label25;
      i1 = 0;
      break label38;
    }
    label94:
    Object localObject1 = this.b.iterator();
    while (((Iterator)localObject1).hasNext()) {
      t((bk)((Iterator)localObject1).next());
    }
    this.b.clear();
    Object localObject2;
    label208:
    label282:
    long l1;
    label354:
    long l2;
    if (n != 0)
    {
      localObject1 = new ArrayList();
      ((ArrayList)localObject1).addAll(this.d);
      this.g.add(localObject1);
      this.d.clear();
      localObject2 = new h(this, (ArrayList)localObject1);
      if (m != 0) {
        bn.a(((q)((ArrayList)localObject1).get(0)).a.itemView, (Runnable)localObject2, f());
      }
    }
    else
    {
      if (i1 != 0)
      {
        localObject1 = new ArrayList();
        ((ArrayList)localObject1).addAll(this.e);
        this.h.add(localObject1);
        this.e.clear();
        localObject2 = new i(this, (ArrayList)localObject1);
        if (m == 0) {
          break label415;
        }
        bn.a(((p)((ArrayList)localObject1).get(0)).a.itemView, (Runnable)localObject2, f());
      }
      if (i2 == 0) {
        break label422;
      }
      localObject1 = new ArrayList();
      ((ArrayList)localObject1).addAll(this.c);
      this.f.add(localObject1);
      this.c.clear();
      localObject2 = new j(this, (ArrayList)localObject1);
      if ((m == 0) && (n == 0) && (i1 == 0)) {
        break label442;
      }
      if (m == 0) {
        break label424;
      }
      l1 = f();
      if (n == 0) {
        break label430;
      }
      l2 = d();
      label365:
      if (i1 == 0) {
        break label436;
      }
    }
    label415:
    label422:
    label424:
    label430:
    label436:
    for (long l3 = g();; l3 = 0L)
    {
      l2 = Math.max(l2, l3);
      bn.a(((bk)((ArrayList)localObject1).get(0)).itemView, (Runnable)localObject2, l1 + l2);
      return;
      ((Runnable)localObject2).run();
      break label208;
      ((Runnable)localObject2).run();
      break label282;
      break;
      l1 = 0L;
      break label354;
      l2 = 0L;
      break label365;
    }
    label442:
    ((Runnable)localObject2).run();
  }
  
  void a(List<bk> paramList)
  {
    int m = paramList.size() - 1;
    while (m >= 0)
    {
      bn.p(((bk)paramList.get(m)).itemView).cancel();
      m -= 1;
    }
  }
  
  public boolean a(bk parambk)
  {
    v(parambk);
    this.b.add(parambk);
    return true;
  }
  
  public boolean a(bk parambk, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    View localView = parambk.itemView;
    paramInt1 = (int)(paramInt1 + bn.l(parambk.itemView));
    paramInt2 = (int)(paramInt2 + bn.m(parambk.itemView));
    v(parambk);
    int m = paramInt3 - paramInt1;
    int n = paramInt4 - paramInt2;
    if ((m == 0) && (n == 0))
    {
      i(parambk);
      return false;
    }
    if (m != 0) {
      bn.a(localView, -m);
    }
    if (n != 0) {
      bn.b(localView, -n);
    }
    this.d.add(new q(parambk, paramInt1, paramInt2, paramInt3, paramInt4, null));
    return true;
  }
  
  public boolean a(bk parambk1, bk parambk2, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    if (parambk1 == parambk2) {
      return a(parambk1, paramInt1, paramInt2, paramInt3, paramInt4);
    }
    float f1 = bn.l(parambk1.itemView);
    float f2 = bn.m(parambk1.itemView);
    float f3 = bn.f(parambk1.itemView);
    v(parambk1);
    int m = (int)(paramInt3 - paramInt1 - f1);
    int n = (int)(paramInt4 - paramInt2 - f2);
    bn.a(parambk1.itemView, f1);
    bn.b(parambk1.itemView, f2);
    bn.c(parambk1.itemView, f3);
    if (parambk2 != null)
    {
      v(parambk2);
      bn.a(parambk2.itemView, -m);
      bn.b(parambk2.itemView, -n);
      bn.c(parambk2.itemView, 0.0F);
    }
    this.e.add(new p(parambk1, parambk2, paramInt1, paramInt2, paramInt3, paramInt4, null));
    return true;
  }
  
  public boolean b()
  {
    return (!this.c.isEmpty()) || (!this.e.isEmpty()) || (!this.d.isEmpty()) || (!this.b.isEmpty()) || (!this.j.isEmpty()) || (!this.k.isEmpty()) || (!this.i.isEmpty()) || (!this.l.isEmpty()) || (!this.g.isEmpty()) || (!this.f.isEmpty()) || (!this.h.isEmpty());
  }
  
  public boolean b(bk parambk)
  {
    v(parambk);
    bn.c(parambk.itemView, 0.0F);
    this.c.add(parambk);
    return true;
  }
  
  public void c()
  {
    int m = this.d.size() - 1;
    Object localObject1;
    Object localObject2;
    while (m >= 0)
    {
      localObject1 = (q)this.d.get(m);
      localObject2 = ((q)localObject1).a.itemView;
      bn.b((View)localObject2, 0.0F);
      bn.a((View)localObject2, 0.0F);
      i(((q)localObject1).a);
      this.d.remove(m);
      m -= 1;
    }
    m = this.b.size() - 1;
    while (m >= 0)
    {
      h((bk)this.b.get(m));
      this.b.remove(m);
      m -= 1;
    }
    m = this.c.size() - 1;
    while (m >= 0)
    {
      localObject1 = (bk)this.c.get(m);
      bn.c(((bk)localObject1).itemView, 1.0F);
      j((bk)localObject1);
      this.c.remove(m);
      m -= 1;
    }
    m = this.e.size() - 1;
    while (m >= 0)
    {
      b((p)this.e.get(m));
      m -= 1;
    }
    this.e.clear();
    if (!b()) {
      return;
    }
    m = this.g.size() - 1;
    int n;
    while (m >= 0)
    {
      localObject1 = (ArrayList)this.g.get(m);
      n = ((ArrayList)localObject1).size() - 1;
      while (n >= 0)
      {
        localObject2 = (q)((ArrayList)localObject1).get(n);
        View localView = ((q)localObject2).a.itemView;
        bn.b(localView, 0.0F);
        bn.a(localView, 0.0F);
        i(((q)localObject2).a);
        ((ArrayList)localObject1).remove(n);
        if (((ArrayList)localObject1).isEmpty()) {
          this.g.remove(localObject1);
        }
        n -= 1;
      }
      m -= 1;
    }
    m = this.f.size() - 1;
    while (m >= 0)
    {
      localObject1 = (ArrayList)this.f.get(m);
      n = ((ArrayList)localObject1).size() - 1;
      while (n >= 0)
      {
        localObject2 = (bk)((ArrayList)localObject1).get(n);
        bn.c(((bk)localObject2).itemView, 1.0F);
        j((bk)localObject2);
        ((ArrayList)localObject1).remove(n);
        if (((ArrayList)localObject1).isEmpty()) {
          this.f.remove(localObject1);
        }
        n -= 1;
      }
      m -= 1;
    }
    m = this.h.size() - 1;
    while (m >= 0)
    {
      localObject1 = (ArrayList)this.h.get(m);
      n = ((ArrayList)localObject1).size() - 1;
      while (n >= 0)
      {
        b((p)((ArrayList)localObject1).get(n));
        if (((ArrayList)localObject1).isEmpty()) {
          this.h.remove(localObject1);
        }
        n -= 1;
      }
      m -= 1;
    }
    a(this.k);
    a(this.j);
    a(this.i);
    a(this.l);
    h();
  }
  
  public void c(bk parambk)
  {
    View localView = parambk.itemView;
    bn.p(localView).cancel();
    int m = this.d.size() - 1;
    while (m >= 0)
    {
      if (((q)this.d.get(m)).a == parambk)
      {
        bn.b(localView, 0.0F);
        bn.a(localView, 0.0F);
        i(parambk);
        this.d.remove(m);
      }
      m -= 1;
    }
    a(this.e, parambk);
    if (this.b.remove(parambk))
    {
      bn.c(localView, 1.0F);
      h(parambk);
    }
    if (this.c.remove(parambk))
    {
      bn.c(localView, 1.0F);
      j(parambk);
    }
    m = this.h.size() - 1;
    ArrayList localArrayList;
    while (m >= 0)
    {
      localArrayList = (ArrayList)this.h.get(m);
      a(localArrayList, parambk);
      if (localArrayList.isEmpty()) {
        this.h.remove(m);
      }
      m -= 1;
    }
    m = this.g.size() - 1;
    if (m >= 0)
    {
      localArrayList = (ArrayList)this.g.get(m);
      int n = localArrayList.size() - 1;
      for (;;)
      {
        if (n >= 0)
        {
          if (((q)localArrayList.get(n)).a != parambk) {
            break label299;
          }
          bn.b(localView, 0.0F);
          bn.a(localView, 0.0F);
          i(parambk);
          localArrayList.remove(n);
          if (localArrayList.isEmpty()) {
            this.g.remove(m);
          }
        }
        m -= 1;
        break;
        label299:
        n -= 1;
      }
    }
    m = this.f.size() - 1;
    while (m >= 0)
    {
      localArrayList = (ArrayList)this.f.get(m);
      if (localArrayList.remove(parambk))
      {
        bn.c(localView, 1.0F);
        j(parambk);
        if (localArrayList.isEmpty()) {
          this.f.remove(m);
        }
      }
      m -= 1;
    }
    if ((!this.k.remove(parambk)) || ((!this.i.remove(parambk)) || ((!this.l.remove(parambk)) || (this.j.remove(parambk))))) {}
    j();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v7\widget\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */