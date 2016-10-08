package com.android.dazhihui.ui.screen.stock.offlinecapital;

import com.android.dazhihui.a.b.q;
import com.android.dazhihui.d.b;
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.text.NumberFormat;

public class ag
{
  private String a = "";
  private String b = "";
  private int c = 0;
  private int d = 0;
  private String e = "0";
  private String f = "0";
  private int g = 1;
  private String h = "0";
  private String i = "0";
  private String j = "0";
  private int k = -16777216;
  private String l;
  private String m;
  private int n = 1;
  private int o;
  private int p;
  private int q;
  private int r;
  private boolean s;
  private int t;
  private boolean u = false;
  private int v = 0;
  private int w;
  private int x;
  private int y;
  
  public ag() {}
  
  public ag(String paramString1, String paramString2, int paramInt)
  {
    this.m = paramString1;
    this.l = paramString2;
    this.n = 1;
    this.s = false;
    this.t = 0;
    this.v = paramInt;
  }
  
  public ag(String paramString1, String paramString2, String paramString3, String paramString4, int paramInt1, int paramInt2, int paramInt3, String paramString5, String paramString6)
  {
    this.a = paramString1;
    this.m = paramString2;
    this.l = paramString3;
    this.b = paramString4;
    this.c = paramInt1;
    this.d = paramInt2;
    this.g = paramInt3;
    this.e = paramString5;
    this.f = paramString6;
  }
  
  public String a()
  {
    return this.l;
  }
  
  public String a(double paramDouble, int paramInt)
  {
    NumberFormat localNumberFormat = NumberFormat.getPercentInstance();
    localNumberFormat.setMinimumFractionDigits(paramInt);
    return localNumberFormat.format(paramDouble);
  }
  
  public void a(int paramInt)
  {
    this.n = paramInt;
  }
  
  public void a(q paramq)
  {
    boolean bool = true;
    try
    {
      this.l = paramq.l();
      this.m = paramq.l();
      this.o = paramq.b();
      this.n = paramq.b();
      this.p = paramq.h();
      this.q = paramq.h();
      this.r = paramq.h();
      paramq.h();
      paramq.h();
      this.w = paramq.h();
      this.y = paramq.e();
      this.x = paramq.h();
      this.t = paramq.b();
      if ((paramq.b() & 0x1) == 1) {}
      for (;;)
      {
        this.s = bool;
        return;
        bool = false;
      }
      return;
    }
    catch (Exception paramq)
    {
      paramq.printStackTrace();
    }
  }
  
  public void a(ag paramag)
  {
    this.m = paramag.b();
    this.l = paramag.a();
    this.n = paramag.h();
    this.o = paramag.c();
    this.p = paramag.e();
    this.r = paramag.d();
    this.s = paramag.g();
    this.t = paramag.i();
    this.w = paramag.j();
    this.x = paramag.k();
    if (this.r == 0) {
      this.r = this.p;
    }
    if ((this.c == 0) || (this.r == 0))
    {
      this.h = "0";
      System.out.println("11shizhi = 0");
    }
    for (;;)
    {
      String str = b.a(this.r, this.o);
      paramag = str;
      if (str.equals("--")) {
        paramag = "0";
      }
      double d1 = Double.valueOf(paramag).doubleValue();
      double d2 = Double.valueOf(this.b).doubleValue();
      double d3 = this.c;
      this.i = String.valueOf(new DecimalFormat("#0.00").format(Double.valueOf((d1 - d2) * d3)).toString());
      this.j = a((Float.valueOf(paramag).floatValue() - Float.valueOf(this.b).floatValue()) / Float.valueOf(this.b).floatValue(), 2);
      return;
      this.h = b.a(this.c * this.r, this.o);
      System.out.println("shizhi = " + this.h);
    }
  }
  
  public void a(String paramString)
  {
    this.l = paramString;
  }
  
  public void a(boolean paramBoolean)
  {
    this.u = paramBoolean;
  }
  
  public String b()
  {
    return this.m;
  }
  
  public void b(int paramInt)
  {
    this.c = paramInt;
  }
  
  public void b(String paramString)
  {
    this.m = paramString;
  }
  
  public int c()
  {
    return this.o;
  }
  
  public void c(int paramInt)
  {
    this.k = paramInt;
  }
  
  public void c(String paramString)
  {
    this.b = paramString;
  }
  
  public int d()
  {
    return this.r;
  }
  
  public void d(int paramInt)
  {
    this.g = paramInt;
  }
  
  public int e()
  {
    return this.p;
  }
  
  public String f()
  {
    return b.a(this.r, this.o);
  }
  
  public boolean g()
  {
    return this.s;
  }
  
  public int h()
  {
    return this.n;
  }
  
  public int i()
  {
    return this.t;
  }
  
  public int j()
  {
    return this.w;
  }
  
  public int k()
  {
    return this.x;
  }
  
  public boolean l()
  {
    return this.u;
  }
  
  public int m()
  {
    return this.c;
  }
  
  public String n()
  {
    return this.b;
  }
  
  public String o()
  {
    return this.a;
  }
  
  public String p()
  {
    return this.h;
  }
  
  public String q()
  {
    if (this.f == null) {
      return this.i;
    }
    Object localObject = Double.valueOf(0.0D);
    try
    {
      Double localDouble = Double.valueOf(this.f);
      localObject = localDouble;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        double d1;
        double d2;
        localException.printStackTrace();
      }
    }
    d1 = Double.valueOf(this.i).doubleValue();
    d2 = ((Double)localObject).doubleValue();
    return String.valueOf(new DecimalFormat("#0.00").format(Double.valueOf(d2 + d1)).toString());
  }
  
  public String r()
  {
    return this.j;
  }
  
  public int s()
  {
    return this.d;
  }
  
  public int t()
  {
    return this.k;
  }
  
  public String toString()
  {
    return "OfflineCapitalStock [quanShangName=" + this.a + ", capitalCost=" + this.b + ", capitalAmount=" + this.c + ", shizhi=" + this.h + ", yingkui=" + this.i + ", shouyilv=" + this.j + ", availableCapitalAmount=" + this.d + ", code=" + this.l + ", name=" + this.m + ", decLen=" + this.o + ", closePrice=" + this.p + ", openPrice=" + this.q + ", latestPrice=" + this.r + "]";
  }
  
  public int u()
  {
    return this.g;
  }
  
  public String v()
  {
    return this.e;
  }
  
  public String w()
  {
    return this.f;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\offlinecapital\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */