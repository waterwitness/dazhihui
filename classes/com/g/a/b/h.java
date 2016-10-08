package com.g.a.b;

import android.content.Context;
import android.content.res.Resources;
import android.util.DisplayMetrics;
import com.g.a.a.b.b;
import com.g.a.b.a.f;
import com.g.a.b.d.c;
import com.g.a.c.e;
import java.util.concurrent.Executor;

public final class h
{
  final Resources a;
  final int b;
  final int c;
  final int d;
  final int e;
  final com.g.a.b.g.a f;
  final Executor g;
  final Executor h;
  final boolean i;
  final boolean j;
  final int k;
  final int l;
  final com.g.a.b.a.h m;
  final b n;
  final com.g.a.a.a.a o;
  final c p;
  final com.g.a.b.b.d q;
  final d r;
  final c s;
  final c t;
  
  private h(j paramj)
  {
    this.a = j.a(paramj).getResources();
    this.b = j.b(paramj);
    this.c = j.c(paramj);
    this.d = j.d(paramj);
    this.e = j.e(paramj);
    this.f = j.f(paramj);
    this.g = j.g(paramj);
    this.h = j.h(paramj);
    this.k = j.i(paramj);
    this.l = j.j(paramj);
    this.m = j.k(paramj);
    this.o = j.l(paramj);
    this.n = j.m(paramj);
    this.r = j.n(paramj);
    this.p = j.o(paramj);
    this.q = j.p(paramj);
    this.i = j.q(paramj);
    this.j = j.r(paramj);
    this.s = new k(this.p);
    this.t = new l(this.p);
    e.a(j.s(paramj));
  }
  
  f a()
  {
    DisplayMetrics localDisplayMetrics = this.a.getDisplayMetrics();
    int i2 = this.b;
    int i1 = i2;
    if (i2 <= 0) {
      i1 = localDisplayMetrics.widthPixels;
    }
    int i3 = this.c;
    i2 = i3;
    if (i3 <= 0) {
      i2 = localDisplayMetrics.heightPixels;
    }
    return new f(i1, i2);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\g\a\b\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */