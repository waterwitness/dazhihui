package android.support.v7.widget;

import android.support.v4.c.o;
import android.support.v4.c.p;

class bv
{
  static o<bv> d = new p(20);
  int a;
  at b;
  at c;
  
  static bv a()
  {
    bv localbv2 = (bv)d.a();
    bv localbv1 = localbv2;
    if (localbv2 == null) {
      localbv1 = new bv();
    }
    return localbv1;
  }
  
  static void a(bv parambv)
  {
    parambv.a = 0;
    parambv.b = null;
    parambv.c = null;
    d.a(parambv);
  }
  
  static void b()
  {
    while (d.a() != null) {}
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\android\support\v7\widget\bv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */