package android.support.v7.widget;

import android.support.v4.os.l;
import android.support.v4.view.bn;
import android.support.v4.widget.af;
import android.view.animation.Interpolator;
import java.util.ArrayList;

class bj
  implements Runnable
{
  private int b;
  private int c;
  private af d;
  private Interpolator e = RecyclerView.q();
  private boolean f = false;
  private boolean g = false;
  
  public bj(RecyclerView paramRecyclerView)
  {
    this.d = af.a(paramRecyclerView.getContext(), RecyclerView.q());
  }
  
  private float a(float paramFloat)
  {
    return (float)Math.sin((float)((paramFloat - 0.5F) * 0.4712389167638204D));
  }
  
  private int b(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    int j = Math.abs(paramInt1);
    int k = Math.abs(paramInt2);
    int i;
    if (j > k)
    {
      i = 1;
      paramInt3 = (int)Math.sqrt(paramInt3 * paramInt3 + paramInt4 * paramInt4);
      paramInt2 = (int)Math.sqrt(paramInt1 * paramInt1 + paramInt2 * paramInt2);
      if (i == 0) {
        break label140;
      }
    }
    label140:
    for (paramInt1 = this.a.getWidth();; paramInt1 = this.a.getHeight())
    {
      paramInt4 = paramInt1 / 2;
      float f3 = Math.min(1.0F, paramInt2 * 1.0F / paramInt1);
      float f1 = paramInt4;
      float f2 = paramInt4;
      f3 = a(f3);
      if (paramInt3 <= 0) {
        break label151;
      }
      paramInt1 = Math.round(1000.0F * Math.abs((f3 * f2 + f1) / paramInt3)) * 4;
      return Math.min(paramInt1, 2000);
      i = 0;
      break;
    }
    label151:
    if (i != 0) {}
    for (paramInt2 = j;; paramInt2 = k)
    {
      paramInt1 = (int)((paramInt2 / paramInt1 + 1.0F) * 300.0F);
      break;
    }
  }
  
  private void c()
  {
    this.g = false;
    this.f = true;
  }
  
  private void d()
  {
    this.f = false;
    if (this.g) {
      a();
    }
  }
  
  void a()
  {
    if (this.f)
    {
      this.g = true;
      return;
    }
    this.a.removeCallbacks(this);
    bn.a(this.a, this);
  }
  
  public void a(int paramInt1, int paramInt2)
  {
    RecyclerView.b(this.a, 2);
    this.c = 0;
    this.b = 0;
    this.d.a(0, 0, paramInt1, paramInt2, Integer.MIN_VALUE, Integer.MAX_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE);
    a();
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3)
  {
    a(paramInt1, paramInt2, paramInt3, RecyclerView.q());
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    a(paramInt1, paramInt2, b(paramInt1, paramInt2, paramInt3, paramInt4));
  }
  
  public void a(int paramInt1, int paramInt2, int paramInt3, Interpolator paramInterpolator)
  {
    if (this.e != paramInterpolator)
    {
      this.e = paramInterpolator;
      this.d = af.a(this.a.getContext(), paramInterpolator);
    }
    RecyclerView.b(this.a, 2);
    this.c = 0;
    this.b = 0;
    this.d.a(0, 0, paramInt1, paramInt2, paramInt3);
    a();
  }
  
  public void b()
  {
    this.a.removeCallbacks(this);
    this.d.h();
  }
  
  public void b(int paramInt1, int paramInt2)
  {
    a(paramInt1, paramInt2, 0, 0);
  }
  
  public void run()
  {
    c();
    RecyclerView.c(this.a);
    af localaf = this.d;
    bf localbf = RecyclerView.f(this.a).s;
    int i6;
    int i7;
    int i4;
    int i5;
    int i1;
    int k;
    int j;
    int i3;
    int i;
    int n;
    int m;
    if (localaf.g())
    {
      i6 = localaf.b();
      i7 = localaf.c();
      i4 = i6 - this.b;
      i5 = i7 - this.c;
      i1 = 0;
      k = 0;
      i2 = 0;
      j = 0;
      this.b = i6;
      this.c = i7;
      i3 = 0;
      i = 0;
      n = 0;
      m = 0;
      if (RecyclerView.g(this.a) == null) {
        break label713;
      }
      this.a.b();
      RecyclerView.h(this.a);
      l.a("RV Scroll");
      if (i4 != 0)
      {
        k = RecyclerView.f(this.a).a(i4, this.a.a, this.a.f);
        i = i4 - k;
      }
      if (i5 != 0)
      {
        j = RecyclerView.f(this.a).b(i5, this.a.a, this.a.f);
        m = i5 - j;
      }
      l.a();
      RecyclerView.i(this.a);
      RecyclerView.j(this.a);
      this.a.a(false);
      n = m;
      i2 = j;
      i3 = i;
      i1 = k;
      if (localbf == null) {
        break label713;
      }
      n = m;
      i2 = j;
      i3 = i;
      i1 = k;
      if (localbf.g()) {
        break label713;
      }
      n = m;
      i2 = j;
      i3 = i;
      i1 = k;
      if (!localbf.h()) {
        break label713;
      }
      n = this.a.f.e();
      if (n != 0) {
        break label645;
      }
      localbf.f();
      n = j;
      j = i;
      if (!RecyclerView.k(this.a).isEmpty()) {
        this.a.invalidate();
      }
      if (bn.a(this.a) != 2) {
        RecyclerView.a(this.a, i4, i5);
      }
      if ((j != 0) || (m != 0))
      {
        i1 = (int)localaf.f();
        if (j == i6) {
          break label789;
        }
        if (j >= 0) {
          break label732;
        }
        i = -i1;
      }
    }
    label398:
    label417:
    label544:
    label572:
    label593:
    label645:
    label713:
    label732:
    label766:
    label772:
    label777:
    label789:
    for (int i2 = i;; i2 = 0)
    {
      if (m != i7) {
        if (m < 0) {
          i = -i1;
        }
      }
      for (;;)
      {
        if (bn.a(this.a) != 2) {
          this.a.c(i2, i);
        }
        if (((i2 != 0) || (j == i6) || (localaf.d() == 0)) && ((i != 0) || (m == i7) || (localaf.e() == 0))) {
          localaf.h();
        }
        if ((k != 0) || (n != 0)) {
          this.a.g(k, n);
        }
        if (!RecyclerView.l(this.a)) {
          this.a.invalidate();
        }
        if ((i5 != 0) && (RecyclerView.f(this.a).e()) && (n == i5))
        {
          i = 1;
          if ((i4 == 0) || (!RecyclerView.f(this.a).d()) || (k != i4)) {
            break label766;
          }
          j = 1;
          if (((i4 != 0) || (i5 != 0)) && (j == 0) && (i == 0)) {
            break label772;
          }
          i = 1;
          if ((!localaf.a()) && (i != 0)) {
            break label777;
          }
          RecyclerView.b(this.a, 0);
        }
        for (;;)
        {
          if (localbf != null)
          {
            if (localbf.g()) {
              bf.a(localbf, 0, 0);
            }
            if (!this.g) {
              localbf.f();
            }
          }
          d();
          return;
          if (localbf.i() >= n)
          {
            localbf.d(n - 1);
            bf.a(localbf, i4 - i, i5 - m);
            n = j;
            j = i;
            break;
          }
          bf.a(localbf, i4 - i, i5 - m);
          i1 = k;
          i3 = i;
          i2 = j;
          n = m;
          j = i3;
          m = n;
          n = i2;
          k = i1;
          break;
          if (j > 0)
          {
            i = i1;
            break label398;
          }
          i = 0;
          break label398;
          i = i1;
          if (m > 0) {
            break label417;
          }
          i = 0;
          break label417;
          i = 0;
          break label544;
          j = 0;
          break label572;
          i = 0;
          break label593;
          a();
        }
        i = 0;
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v7\widget\bj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */