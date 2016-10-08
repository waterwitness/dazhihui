package android.support.v7.widget;

import java.util.ArrayList;
import java.util.List;

public abstract class aq
{
  private as a = null;
  private ArrayList<ar> b = new ArrayList();
  private long c = 120L;
  private long d = 120L;
  private long e = 250L;
  private long f = 250L;
  
  static int d(bk parambk)
  {
    int j = bk.access$6300(parambk) & 0xE;
    int i;
    if (parambk.isInvalid()) {
      i = 4;
    }
    int k;
    int m;
    do
    {
      do
      {
        do
        {
          do
          {
            return i;
            i = j;
          } while ((j & 0x4) != 0);
          k = parambk.getOldPosition();
          m = parambk.getAdapterPosition();
          i = j;
        } while (k == -1);
        i = j;
      } while (m == -1);
      i = j;
    } while (k == m);
    return j | 0x800;
  }
  
  public at a(bh parambh, bk parambk)
  {
    return i().a(parambk);
  }
  
  public at a(bh parambh, bk parambk, int paramInt, List<Object> paramList)
  {
    return i().a(parambk);
  }
  
  public abstract void a();
  
  void a(as paramas)
  {
    this.a = paramas;
  }
  
  public abstract boolean a(bk parambk, at paramat1, at paramat2);
  
  public abstract boolean a(bk parambk1, bk parambk2, at paramat1, at paramat2);
  
  public abstract boolean b();
  
  public abstract boolean b(bk parambk, at paramat1, at paramat2);
  
  public abstract void c();
  
  public abstract void c(bk parambk);
  
  public abstract boolean c(bk parambk, at paramat1, at paramat2);
  
  public long d()
  {
    return this.e;
  }
  
  public long e()
  {
    return this.c;
  }
  
  public final void e(bk parambk)
  {
    f(parambk);
    if (this.a != null) {
      this.a.a(parambk);
    }
  }
  
  public long f()
  {
    return this.d;
  }
  
  public void f(bk parambk) {}
  
  public long g()
  {
    return this.f;
  }
  
  public boolean g(bk parambk)
  {
    return true;
  }
  
  public final void h()
  {
    int j = this.b.size();
    int i = 0;
    while (i < j)
    {
      ((ar)this.b.get(i)).a();
      i += 1;
    }
    this.b.clear();
  }
  
  public at i()
  {
    return new at();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v7\widget\aq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */