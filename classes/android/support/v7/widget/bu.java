package android.support.v7.widget;

import android.support.v4.c.a;
import android.support.v4.c.f;

class bu
{
  final a<bk, bv> a = new a();
  final f<bk> b = new f();
  
  at a(bk parambk)
  {
    int i = this.a.a(parambk);
    if (i < 0) {
      return null;
    }
    parambk = (bv)this.a.c(i);
    if ((parambk != null) && ((parambk.a & 0x4) != 0))
    {
      parambk.a &= 0xFFFFFFFB;
      at localat = parambk.b;
      if (parambk.a == 0)
      {
        this.a.d(i);
        bv.a(parambk);
      }
      return localat;
    }
    return null;
  }
  
  bk a(long paramLong)
  {
    return (bk)this.b.a(paramLong);
  }
  
  void a()
  {
    this.a.clear();
    this.b.c();
  }
  
  void a(long paramLong, bk parambk)
  {
    this.b.b(paramLong, parambk);
  }
  
  void a(bk parambk, at paramat)
  {
    bv localbv2 = (bv)this.a.get(parambk);
    bv localbv1 = localbv2;
    if (localbv2 == null)
    {
      localbv1 = bv.a();
      this.a.put(parambk, localbv1);
    }
    localbv1.b = paramat;
    localbv1.a |= 0x4;
  }
  
  void a(bw parambw)
  {
    int i = this.a.size() - 1;
    if (i >= 0)
    {
      bk localbk = (bk)this.a.b(i);
      bv localbv = (bv)this.a.d(i);
      if ((localbv.a & 0x3) == 3) {
        parambw.a(localbk);
      }
      for (;;)
      {
        bv.a(localbv);
        i -= 1;
        break;
        if ((localbv.a & 0x1) != 0) {
          parambw.a(localbk, localbv.b, localbv.c);
        } else if ((localbv.a & 0xE) == 14) {
          parambw.b(localbk, localbv.b, localbv.c);
        } else if ((localbv.a & 0xC) == 12) {
          parambw.c(localbk, localbv.b, localbv.c);
        } else if ((localbv.a & 0x4) != 0) {
          parambw.a(localbk, localbv.b, null);
        } else if ((localbv.a & 0x8) != 0) {
          parambw.b(localbk, localbv.b, localbv.c);
        } else if ((localbv.a & 0x2) == 0) {}
      }
    }
  }
  
  void b() {}
  
  void b(bk parambk, at paramat)
  {
    bv localbv2 = (bv)this.a.get(parambk);
    bv localbv1 = localbv2;
    if (localbv2 == null)
    {
      localbv1 = bv.a();
      this.a.put(parambk, localbv1);
    }
    localbv1.a |= 0x2;
    localbv1.b = paramat;
  }
  
  boolean b(bk parambk)
  {
    parambk = (bv)this.a.get(parambk);
    return (parambk != null) && ((parambk.a & 0x4) != 0);
  }
  
  void c(bk parambk)
  {
    bv localbv2 = (bv)this.a.get(parambk);
    bv localbv1 = localbv2;
    if (localbv2 == null)
    {
      localbv1 = bv.a();
      this.a.put(parambk, localbv1);
    }
    localbv1.a |= 0x1;
  }
  
  void c(bk parambk, at paramat)
  {
    bv localbv2 = (bv)this.a.get(parambk);
    bv localbv1 = localbv2;
    if (localbv2 == null)
    {
      localbv1 = bv.a();
      this.a.put(parambk, localbv1);
    }
    localbv1.c = paramat;
    localbv1.a |= 0x8;
  }
  
  void d(bk parambk)
  {
    parambk = (bv)this.a.get(parambk);
    if (parambk == null) {
      return;
    }
    parambk.a &= 0xFFFFFFFE;
  }
  
  void e(bk parambk)
  {
    int i = this.b.b() - 1;
    for (;;)
    {
      if (i >= 0)
      {
        if (parambk == this.b.c(i)) {
          this.b.a(i);
        }
      }
      else
      {
        parambk = (bv)this.a.remove(parambk);
        if (parambk != null) {
          bv.a(parambk);
        }
        return;
      }
      i -= 1;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v7\widget\bu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */