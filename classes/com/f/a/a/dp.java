package com.f.a.a;

import com.unionpay.upomp.lthj.plugin.model.Data;
import com.unionpay.upomp.lthj.plugin.model.PreAuth;

public class dp
  extends es
{
  private String A;
  private String B;
  private String a;
  private String b;
  private StringBuffer c;
  private StringBuffer d;
  private String e;
  private String f;
  private String g;
  private String h;
  private String i;
  private String j;
  private String k;
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
  
  public dp(int paramInt)
  {
    super(paramInt);
  }
  
  public Data a()
  {
    PreAuth localPreAuth = new PreAuth();
    b(localPreAuth);
    localPreAuth.payType = this.a;
    localPreAuth.loginName = this.b;
    localPreAuth.password = this.c.toString();
    this.c.delete(0, this.c.length());
    localPreAuth.mobileNumber = this.d.toString();
    localPreAuth.mobileMac = this.e;
    localPreAuth.validateCode = this.f;
    localPreAuth.pan = this.g;
    localPreAuth.pin = this.h;
    localPreAuth.panDate = this.i;
    localPreAuth.cvn2 = this.j;
    localPreAuth.merchantId = this.l;
    localPreAuth.merchantName = this.k;
    localPreAuth.merchantOrderAmt = this.o;
    localPreAuth.merchantOrderDesc = this.p;
    localPreAuth.merchantOrderId = this.m;
    localPreAuth.merchantOrderTime = this.n;
    localPreAuth.transTimeout = this.q;
    localPreAuth.backEndUrl = this.r;
    return localPreAuth;
  }
  
  public void a(Data paramData)
  {
    paramData = (PreAuth)paramData;
    c(paramData);
    this.a = paramData.payType;
    this.b = paramData.loginName;
    this.d.delete(0, this.d.length());
    this.d.append(paramData.mobileNumber);
    this.l = paramData.merchantId;
    this.m = paramData.merchantOrderId;
    this.n = paramData.merchantOrderTime;
    this.o = paramData.merchantOrderAmt;
    this.u = paramData.settleDate;
    this.v = paramData.setlAmt;
    this.w = paramData.setlCurrency;
    this.x = paramData.converRate;
    this.y = paramData.cupsQid;
    this.z = paramData.cupsTraceNum;
    this.A = paramData.cupsTraceTime;
    this.B = paramData.cupsRespCode;
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
  }
  
  public void a(StringBuffer paramStringBuffer)
  {
    this.c = paramStringBuffer;
  }
  
  public String b()
  {
    return this.a;
  }
  
  public void b(String paramString)
  {
    this.b = paramString;
  }
  
  public void c(String paramString)
  {
    this.d = new StringBuffer(paramString);
  }
  
  public void d(String paramString)
  {
    this.e = paramString;
  }
  
  public void e(String paramString)
  {
    this.f = paramString;
  }
  
  public void f(String paramString)
  {
    this.g = paramString;
  }
  
  public void g(String paramString)
  {
    this.h = paramString;
  }
  
  public void h(String paramString)
  {
    this.i = paramString;
  }
  
  public void i(String paramString)
  {
    this.j = paramString;
  }
  
  public void j(String paramString)
  {
    this.k = paramString;
  }
  
  public void k(String paramString)
  {
    this.l = paramString;
  }
  
  public void l(String paramString)
  {
    this.m = paramString;
  }
  
  public void m(String paramString)
  {
    this.n = paramString;
  }
  
  public void n(String paramString)
  {
    this.o = paramString;
  }
  
  public void o(String paramString)
  {
    this.p = paramString;
  }
  
  public void p(String paramString)
  {
    this.q = paramString;
  }
  
  public void q(String paramString)
  {
    this.r = paramString;
  }
  
  public void r(String paramString)
  {
    this.s = paramString;
  }
  
  public void s(String paramString)
  {
    this.t = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\dp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */