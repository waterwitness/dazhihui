package android.support.v7.widget;

import android.view.View;

public abstract class bo
  extends aq
{
  boolean a = true;
  
  public final void a(bk parambk, boolean paramBoolean)
  {
    d(parambk, paramBoolean);
    e(parambk);
  }
  
  public abstract boolean a(bk parambk);
  
  public abstract boolean a(bk parambk, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public boolean a(bk parambk, at paramat1, at paramat2)
  {
    int k = paramat1.a;
    int m = paramat1.b;
    paramat1 = parambk.itemView;
    int i;
    if (paramat2 == null)
    {
      i = paramat1.getLeft();
      if (paramat2 != null) {
        break label103;
      }
    }
    label103:
    for (int j = paramat1.getTop();; j = paramat2.b)
    {
      if ((parambk.isRemoved()) || ((k == i) && (m == j))) {
        break label112;
      }
      paramat1.layout(i, j, paramat1.getWidth() + i, paramat1.getHeight() + j);
      return a(parambk, k, m, i, j);
      i = paramat2.a;
      break;
    }
    label112:
    return a(parambk);
  }
  
  public abstract boolean a(bk parambk1, bk parambk2, int paramInt1, int paramInt2, int paramInt3, int paramInt4);
  
  public boolean a(bk parambk1, bk parambk2, at paramat1, at paramat2)
  {
    int k = paramat1.a;
    int m = paramat1.b;
    int i;
    if (parambk2.shouldIgnore()) {
      i = paramat1.a;
    }
    for (int j = paramat1.b;; j = paramat2.b)
    {
      return a(parambk1, parambk2, k, m, i, j);
      i = paramat2.a;
    }
  }
  
  public final void b(bk parambk, boolean paramBoolean)
  {
    c(parambk, paramBoolean);
  }
  
  public abstract boolean b(bk parambk);
  
  public boolean b(bk parambk, at paramat1, at paramat2)
  {
    if ((paramat1 != null) && ((paramat1.a != paramat2.a) || (paramat1.b != paramat2.b))) {
      return a(parambk, paramat1.a, paramat1.b, paramat2.a, paramat2.b);
    }
    return b(parambk);
  }
  
  public void c(bk parambk, boolean paramBoolean) {}
  
  public boolean c(bk parambk, at paramat1, at paramat2)
  {
    if ((paramat1.a != paramat2.a) || (paramat1.b != paramat2.b)) {
      return a(parambk, paramat1.a, paramat1.b, paramat2.a, paramat2.b);
    }
    i(parambk);
    return false;
  }
  
  public void d(bk parambk, boolean paramBoolean) {}
  
  public boolean g(bk parambk)
  {
    return (!this.a) || (parambk.isInvalid());
  }
  
  public final void h(bk parambk)
  {
    o(parambk);
    e(parambk);
  }
  
  public final void i(bk parambk)
  {
    s(parambk);
    e(parambk);
  }
  
  public final void j(bk parambk)
  {
    q(parambk);
    e(parambk);
  }
  
  public final void k(bk parambk)
  {
    n(parambk);
  }
  
  public final void l(bk parambk)
  {
    r(parambk);
  }
  
  public final void m(bk parambk)
  {
    p(parambk);
  }
  
  public void n(bk parambk) {}
  
  public void o(bk parambk) {}
  
  public void p(bk parambk) {}
  
  public void q(bk parambk) {}
  
  public void r(bk parambk) {}
  
  public void s(bk parambk) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v7\widget\bo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */