package com.f.a.a;

import com.unionpay.upomp.lthj.plugin.model.Data;
import com.unionpay.upomp.lthj.plugin.model.Pay;

public class dg
  extends es
{
  private String A;
  private String B;
  private String C;
  private String a;
  private String b;
  private StringBuffer c = new StringBuffer();
  private StringBuffer d = new StringBuffer();
  private String e;
  private String f;
  private String g;
  private StringBuffer h = new StringBuffer();
  private StringBuffer i = new StringBuffer();
  private StringBuffer j = new StringBuffer();
  private StringBuffer k = new StringBuffer();
  private String l;
  private String m;
  private String n;
  private String o;
  private String p;
  private String q;
  private String r;
  private String s;
  private String t;
  private String u;
  private String v;
  private String w;
  private String x;
  private String y;
  private String z;
  
  public dg(int paramInt)
  {
    super(paramInt);
  }
  
  public Data a()
  {
    Pay localPay = new Pay();
    b(localPay);
    localPay.payType = this.a;
    localPay.loginName = this.b;
    localPay.password = this.c.toString();
    this.c.delete(0, this.c.length());
    localPay.mobileNumber = this.d.toString();
    this.d.delete(0, this.d.length());
    localPay.mobileMac = this.e;
    localPay.validateCode = this.f;
    localPay.activityId = this.g;
    localPay.pan = this.h.toString();
    this.h.delete(0, this.h.length());
    localPay.pin = this.i.toString();
    this.i.delete(0, this.i.length());
    localPay.panDate = this.j.toString();
    this.j.delete(0, this.j.length());
    localPay.cvn2 = this.k.toString();
    this.k.delete(0, this.k.length());
    localPay.merchantName = this.l;
    localPay.merchantId = this.m;
    localPay.merchantOrderId = this.n;
    localPay.merchantOrderTime = this.o;
    localPay.merchantOrderAmt = this.p;
    localPay.merchantOrderDesc = this.q;
    localPay.transTimeout = this.r;
    localPay.backEndUrl = this.s;
    localPay.sign = this.t;
    localPay.merchantPublicCert = this.u;
    return localPay;
  }
  
  public void a(Data paramData)
  {
    paramData = (Pay)paramData;
    c(paramData);
    this.a = paramData.payType;
    this.b = paramData.loginName;
    this.d.delete(0, this.d.length());
    this.d.append(paramData.mobileNumber);
    this.m = paramData.merchantId;
    this.n = paramData.merchantOrderId;
    this.o = paramData.merchantOrderTime;
    this.p = paramData.merchantOrderAmt;
    this.v = paramData.settleDate;
    this.w = paramData.setlAmt;
    this.x = paramData.setlCurrency;
    this.y = paramData.converRate;
    this.z = paramData.cupsQid;
    this.A = paramData.cupsTraceNum;
    this.B = paramData.cupsTraceTime;
    this.C = paramData.cupsRespCode;
  }
  
  public void a(String paramString)
  {
    this.g = paramString;
  }
  
  public String b()
  {
    return this.a;
  }
  
  public void b(String paramString)
  {
    this.a = paramString;
  }
  
  public String c()
  {
    return this.A;
  }
  
  public void c(String paramString)
  {
    this.b = paramString;
  }
  
  public String d()
  {
    return this.z;
  }
  
  public void d(String paramString)
  {
    this.c.delete(0, this.c.length());
    this.c.append(paramString);
  }
  
  public String e()
  {
    return this.B;
  }
  
  public void e(String paramString)
  {
    this.d.delete(0, this.d.length());
    this.d.append(paramString);
  }
  
  public String f()
  {
    return this.C;
  }
  
  public void f(String paramString)
  {
    this.e = paramString;
  }
  
  public void g(String paramString)
  {
    this.f = paramString;
  }
  
  public void h(String paramString)
  {
    this.h.delete(0, this.h.length());
    this.h.append(paramString);
  }
  
  public void i(String paramString)
  {
    this.i.delete(0, this.i.length());
    this.i.append(paramString);
  }
  
  public void j(String paramString)
  {
    this.j.delete(0, this.j.length());
    this.j.append(paramString);
  }
  
  public void k(String paramString)
  {
    this.k.delete(0, this.k.length());
    this.k.append(paramString);
  }
  
  public void l(String paramString)
  {
    this.l = paramString;
  }
  
  public void m(String paramString)
  {
    this.m = paramString;
  }
  
  public void n(String paramString)
  {
    this.n = paramString;
  }
  
  public void o(String paramString)
  {
    this.o = paramString;
  }
  
  public void p(String paramString)
  {
    this.p = paramString;
  }
  
  public void q(String paramString)
  {
    this.q = paramString;
  }
  
  public void r(String paramString)
  {
    this.t = paramString;
  }
  
  public void s(String paramString)
  {
    this.r = paramString;
  }
  
  public void t(String paramString)
  {
    this.u = paramString;
  }
  
  public void u(String paramString)
  {
    this.s = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\dg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */