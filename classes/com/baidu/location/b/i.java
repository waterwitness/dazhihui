package com.baidu.location.b;

class i
{
  h a;
  h b;
  
  i(g paramg, h paramh1, h paramh2)
  {
    this.a = paramh1;
    this.b = paramh2;
  }
  
  double a(h paramh)
  {
    h localh = new h(this.c, this.b.a - this.a.a, this.b.b - this.a.b);
    paramh = new h(this.c, paramh.a - this.a.a, paramh.b - this.a.b);
    return localh.a * paramh.b - localh.b * paramh.a;
  }
  
  boolean b(h paramh)
  {
    return (this.c.a(a(paramh)) == 0) && (paramh.a < Math.max(this.a.a, this.b.a) + 1.0E-8D) && (paramh.a > Math.min(this.a.a, this.b.a) - 1.0E-8D) && (paramh.b < Math.max(this.a.b, this.b.b) + 1.0E-8D) && (paramh.b > Math.min(this.a.b, this.b.b) - 1.0E-8D);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\b\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */