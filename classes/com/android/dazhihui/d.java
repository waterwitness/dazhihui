package com.android.dazhihui;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class d
{
  private static volatile d r;
  private boolean a = true;
  private boolean b;
  private boolean c;
  private boolean d;
  private boolean e;
  private int[] f;
  private int[] g;
  private int[] h;
  private int[] i;
  private int[] j;
  private int[] k;
  private int[] l;
  private int[] m;
  private int[] n;
  private int[] o;
  private String[] p;
  private Context q;
  
  private d(Context paramContext)
  {
    this.q = paramContext;
    C();
  }
  
  private void C()
  {
    Object localObject = com.android.dazhihui.c.a.d.a();
    this.f = b(((com.android.dazhihui.c.a.d)localObject).f("KCHART_PARAMS_VOL"));
    ((com.android.dazhihui.c.a.d)localObject).g();
    if (this.f == null) {
      j();
    }
    this.g = b(((com.android.dazhihui.c.a.d)localObject).f("KCHART_PARAMS_MACD"));
    ((com.android.dazhihui.c.a.d)localObject).g();
    if (this.g == null) {
      l();
    }
    this.h = b(((com.android.dazhihui.c.a.d)localObject).f("KCHART_PARAMS_KDJ"));
    ((com.android.dazhihui.c.a.d)localObject).g();
    if (this.h == null) {
      n();
    }
    this.i = b(((com.android.dazhihui.c.a.d)localObject).f("KCHART_PARAMS_RSI"));
    ((com.android.dazhihui.c.a.d)localObject).g();
    if (this.i == null) {
      p();
    }
    this.j = b(((com.android.dazhihui.c.a.d)localObject).f("KCHART_PARAMS_BIAS"));
    ((com.android.dazhihui.c.a.d)localObject).g();
    if (this.j == null) {
      r();
    }
    this.k = b(((com.android.dazhihui.c.a.d)localObject).f("KCHART_PARAMS_CCI"));
    ((com.android.dazhihui.c.a.d)localObject).g();
    if (this.k == null) {
      t();
    }
    this.l = b(((com.android.dazhihui.c.a.d)localObject).f("KCHART_PARAMS_WR"));
    ((com.android.dazhihui.c.a.d)localObject).g();
    if (this.l == null) {
      v();
    }
    this.m = b(((com.android.dazhihui.c.a.d)localObject).f("KCHART_PARAMS_BOLL"));
    ((com.android.dazhihui.c.a.d)localObject).g();
    if (this.m == null) {
      x();
    }
    this.n = b(((com.android.dazhihui.c.a.d)localObject).f("KCHART_PARAMS_DMA"));
    ((com.android.dazhihui.c.a.d)localObject).g();
    if (this.n == null) {
      z();
    }
    this.o = b(((com.android.dazhihui.c.a.d)localObject).f("KCHART_PARAMS_MA"));
    ((com.android.dazhihui.c.a.d)localObject).g();
    if (this.o == null) {
      B();
    }
    this.p = ((com.android.dazhihui.c.a.d)localObject).f("KCHART_PARAMS_NAMES");
    ((com.android.dazhihui.c.a.d)localObject).g();
    if (this.p == null) {
      h();
    }
    localObject = this.q;
    Context localContext = this.q;
    localObject = ((Context)localObject).getSharedPreferences("KChartSwitch", 0);
    this.a = ((SharedPreferences)localObject).getBoolean("KCHART_PARAMS_MA_ON", true);
    this.b = ((SharedPreferences)localObject).getBoolean("KCHART_PARAMS_QK_ON", false);
    this.c = ((SharedPreferences)localObject).getBoolean("kchart_switch_chengben", false);
    this.d = ((SharedPreferences)localObject).getBoolean("kchart_switch_shuangtu", false);
    this.e = ((SharedPreferences)localObject).getBoolean("kchart_switch_dsignal", false);
  }
  
  public static d a()
  {
    if (r == null) {}
    try
    {
      if (r == null) {
        r = new d(DzhApplication.a().getApplicationContext());
      }
      return r;
    }
    finally {}
  }
  
  private int[] b(String[] paramArrayOfString)
  {
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0)) {
      return null;
    }
    int[] arrayOfInt = new int[paramArrayOfString.length];
    int i1 = 0;
    while (i1 < paramArrayOfString.length)
    {
      arrayOfInt[i1] = Integer.parseInt(paramArrayOfString[i1]);
      i1 += 1;
    }
    return arrayOfInt;
  }
  
  private String[] k(int[] paramArrayOfInt)
  {
    String[] arrayOfString = new String[paramArrayOfInt.length];
    int i1 = 0;
    while (i1 < paramArrayOfInt.length)
    {
      arrayOfString[i1] = String.valueOf(paramArrayOfInt[i1]);
      i1 += 1;
    }
    return arrayOfString;
  }
  
  public int[] A()
  {
    return this.o;
  }
  
  public void B()
  {
    this.o = new int[] { 5, 10, 20, 30 };
    com.android.dazhihui.c.a.d locald = com.android.dazhihui.c.a.d.a();
    locald.a("KCHART_PARAMS_MA", k(this.o));
    locald.g();
  }
  
  public void a(boolean paramBoolean)
  {
    this.a = paramBoolean;
    Context localContext1 = this.q;
    Context localContext2 = this.q;
    localContext1.getSharedPreferences("KChartSwitch", 0).edit().putBoolean("KCHART_PARAMS_MA_ON", this.a).commit();
  }
  
  public void a(int[] paramArrayOfInt)
  {
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length == 0)) {
      return;
    }
    com.android.dazhihui.c.a.d locald = com.android.dazhihui.c.a.d.a();
    locald.a("KCHART_PARAMS_VOL", k(paramArrayOfInt));
    locald.g();
    this.f = paramArrayOfInt;
  }
  
  public void a(String[] paramArrayOfString)
  {
    if ((paramArrayOfString == null) || (paramArrayOfString.length == 0)) {
      return;
    }
    com.android.dazhihui.c.a.d locald = com.android.dazhihui.c.a.d.a();
    locald.a("KCHART_PARAMS_NAMES", paramArrayOfString);
    locald.g();
    this.p = paramArrayOfString;
  }
  
  public void b(boolean paramBoolean)
  {
    this.b = paramBoolean;
    Context localContext1 = this.q;
    Context localContext2 = this.q;
    localContext1.getSharedPreferences("KChartSwitch", 0).edit().putBoolean("KCHART_PARAMS_QK_ON", this.b).commit();
  }
  
  public void b(int[] paramArrayOfInt)
  {
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length == 0)) {
      return;
    }
    com.android.dazhihui.c.a.d locald = com.android.dazhihui.c.a.d.a();
    locald.a("KCHART_PARAMS_MACD", k(paramArrayOfInt));
    locald.g();
    this.g = paramArrayOfInt;
  }
  
  public boolean b()
  {
    return this.a;
  }
  
  public void c(int[] paramArrayOfInt)
  {
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length == 0)) {
      return;
    }
    com.android.dazhihui.c.a.d locald = com.android.dazhihui.c.a.d.a();
    locald.a("KCHART_PARAMS_KDJ", k(paramArrayOfInt));
    locald.g();
    this.h = paramArrayOfInt;
  }
  
  public boolean c()
  {
    return this.b;
  }
  
  public boolean c(boolean paramBoolean)
  {
    boolean bool2 = false;
    boolean bool1;
    if (paramBoolean)
    {
      bool1 = bool2;
      if (w.a().l())
      {
        bool1 = bool2;
        if ((int)(w.a().c() >>> 20 & 1L) != 1) {}
      }
    }
    else
    {
      this.c = paramBoolean;
      Context localContext1 = this.q;
      Context localContext2 = this.q;
      localContext1.getSharedPreferences("KChartSwitch", 0).edit().putBoolean("kchart_switch_chengben", this.c).commit();
      bool1 = true;
    }
    return bool1;
  }
  
  public void d(int[] paramArrayOfInt)
  {
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length == 0)) {
      return;
    }
    com.android.dazhihui.c.a.d locald = com.android.dazhihui.c.a.d.a();
    locald.a("KCHART_PARAMS_RSI", k(paramArrayOfInt));
    locald.g();
    this.i = paramArrayOfInt;
  }
  
  public boolean d()
  {
    if ((w.a().l()) && ((int)(w.a().c() >>> 20 & 1L) == 1)) {
      return this.c;
    }
    return false;
  }
  
  public boolean d(boolean paramBoolean)
  {
    boolean bool2 = false;
    boolean bool1;
    if (paramBoolean)
    {
      bool1 = bool2;
      if (w.a().l())
      {
        bool1 = bool2;
        if ((int)(w.a().c() >>> 21 & 1L) != 1) {}
      }
    }
    else
    {
      this.d = paramBoolean;
      Context localContext1 = this.q;
      Context localContext2 = this.q;
      localContext1.getSharedPreferences("KChartSwitch", 0).edit().putBoolean("kchart_switch_shuangtu", this.d).commit();
      bool1 = true;
    }
    return bool1;
  }
  
  public void e(int[] paramArrayOfInt)
  {
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length == 0)) {
      return;
    }
    com.android.dazhihui.c.a.d locald = com.android.dazhihui.c.a.d.a();
    locald.a("KCHART_PARAMS_BIAS", k(paramArrayOfInt));
    locald.g();
    this.j = paramArrayOfInt;
  }
  
  public boolean e()
  {
    if ((w.a().l()) && ((int)(w.a().c() >>> 21 & 1L) == 1)) {
      return this.d;
    }
    return false;
  }
  
  public boolean e(boolean paramBoolean)
  {
    boolean bool2 = false;
    boolean bool1;
    if (paramBoolean)
    {
      bool1 = bool2;
      if (w.a().l())
      {
        bool1 = bool2;
        if ((int)(w.a().c() >>> 22 & 1L) != 1) {}
      }
    }
    else
    {
      this.e = paramBoolean;
      Context localContext1 = this.q;
      Context localContext2 = this.q;
      localContext1.getSharedPreferences("KChartSwitch", 0).edit().putBoolean("kchart_switch_dsignal", this.e).commit();
      bool1 = true;
    }
    return bool1;
  }
  
  public void f(int[] paramArrayOfInt)
  {
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length == 0)) {
      return;
    }
    com.android.dazhihui.c.a.d locald = com.android.dazhihui.c.a.d.a();
    locald.a("KCHART_PARAMS_CCI", k(paramArrayOfInt));
    locald.g();
    this.k = paramArrayOfInt;
  }
  
  public boolean f()
  {
    if ((w.a().l()) && ((int)(w.a().c() >>> 22 & 1L) == 1)) {
      return this.e;
    }
    return false;
  }
  
  public void g(int[] paramArrayOfInt)
  {
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length == 0)) {
      return;
    }
    com.android.dazhihui.c.a.d locald = com.android.dazhihui.c.a.d.a();
    locald.a("KCHART_PARAMS_WR", k(paramArrayOfInt));
    locald.g();
    this.l = paramArrayOfInt;
  }
  
  public String[] g()
  {
    int i2 = 0;
    String[] arrayOfString = new String[9];
    int i1 = 0;
    while (i2 < arrayOfString.length)
    {
      int i3 = i1;
      if (this.p[i1].equals("MA")) {
        i3 = i1 + 1;
      }
      arrayOfString[i2] = this.p[i3];
      i1 = i3 + 1;
      i2 += 1;
    }
    return arrayOfString;
  }
  
  public void h()
  {
    this.p = new String[] { "VOL", "MACD", "KDJ", "RSI", "BIAS", "CCI", "W&R", "BOLL", "DMA" };
    com.android.dazhihui.c.a.d locald = com.android.dazhihui.c.a.d.a();
    locald.a("KCHART_PARAMS_NAMES", this.p);
    locald.g();
  }
  
  public void h(int[] paramArrayOfInt)
  {
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length == 0)) {
      return;
    }
    com.android.dazhihui.c.a.d locald = com.android.dazhihui.c.a.d.a();
    locald.a("KCHART_PARAMS_BOLL", k(paramArrayOfInt));
    locald.g();
    this.m = paramArrayOfInt;
  }
  
  public void i(int[] paramArrayOfInt)
  {
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length == 0)) {
      return;
    }
    com.android.dazhihui.c.a.d locald = com.android.dazhihui.c.a.d.a();
    locald.a("KCHART_PARAMS_DMA", k(paramArrayOfInt));
    locald.g();
    this.n = paramArrayOfInt;
  }
  
  public int[] i()
  {
    return this.f;
  }
  
  public void j()
  {
    this.f = new int[] { 5, 10 };
    com.android.dazhihui.c.a.d locald = com.android.dazhihui.c.a.d.a();
    locald.a("KCHART_PARAMS_VOL", k(this.f));
    locald.g();
  }
  
  public void j(int[] paramArrayOfInt)
  {
    if ((paramArrayOfInt == null) || (paramArrayOfInt.length == 0)) {
      return;
    }
    com.android.dazhihui.c.a.d locald = com.android.dazhihui.c.a.d.a();
    locald.a("KCHART_PARAMS_MA", k(paramArrayOfInt));
    locald.g();
    this.o = paramArrayOfInt;
  }
  
  public int[] k()
  {
    return this.g;
  }
  
  public void l()
  {
    this.g = new int[] { 12, 26, 9 };
    com.android.dazhihui.c.a.d locald = com.android.dazhihui.c.a.d.a();
    locald.a("KCHART_PARAMS_MACD", k(this.g));
    locald.g();
  }
  
  public int[] m()
  {
    return this.h;
  }
  
  public void n()
  {
    this.h = new int[] { 9, 3, 3 };
    com.android.dazhihui.c.a.d locald = com.android.dazhihui.c.a.d.a();
    locald.a("KCHART_PARAMS_KDJ", k(this.h));
    locald.g();
  }
  
  public int[] o()
  {
    return this.i;
  }
  
  public void p()
  {
    this.i = new int[] { 6, 12, 24 };
    com.android.dazhihui.c.a.d locald = com.android.dazhihui.c.a.d.a();
    locald.a("KCHART_PARAMS_RSI", k(this.i));
    locald.g();
  }
  
  public int[] q()
  {
    return this.j;
  }
  
  public void r()
  {
    this.j = new int[] { 6, 12, 24 };
    com.android.dazhihui.c.a.d locald = com.android.dazhihui.c.a.d.a();
    locald.a("KCHART_PARAMS_BIAS", k(this.j));
    locald.g();
  }
  
  public int[] s()
  {
    return this.k;
  }
  
  public void t()
  {
    this.k = new int[] { 14 };
    com.android.dazhihui.c.a.d locald = com.android.dazhihui.c.a.d.a();
    locald.a("KCHART_PARAMS_CCI", k(this.k));
    locald.g();
  }
  
  public int[] u()
  {
    return this.l;
  }
  
  public void v()
  {
    this.l = new int[] { 10, 28 };
    com.android.dazhihui.c.a.d locald = com.android.dazhihui.c.a.d.a();
    locald.a("KCHART_PARAMS_WR", k(this.l));
    locald.g();
  }
  
  public int[] w()
  {
    return this.m;
  }
  
  public void x()
  {
    this.m = new int[] { 20, 2 };
    com.android.dazhihui.c.a.d locald = com.android.dazhihui.c.a.d.a();
    locald.a("KCHART_PARAMS_BOLL", k(this.m));
    locald.g();
  }
  
  public int[] y()
  {
    return this.n;
  }
  
  public void z()
  {
    this.n = new int[] { 10, 50, 10 };
    com.android.dazhihui.c.a.d locald = com.android.dazhihui.c.a.d.a();
    locald.a("KCHART_PARAMS_DMA", k(this.n));
    locald.g();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */