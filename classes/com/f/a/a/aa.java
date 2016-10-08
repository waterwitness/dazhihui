package com.f.a.a;

import com.unionpay.upomp.lthj.plugin.model.Data;
import com.unionpay.upomp.lthj.plugin.model.OrderInfoCheck;

public class aa
  extends es
{
  private String a;
  private String b;
  private String c;
  private String d;
  private String e;
  private String f;
  private String g;
  private String h;
  private String i;
  private String j;
  private String k;
  private String l;
  
  public aa(int paramInt)
  {
    super(paramInt);
  }
  
  public Data a()
  {
    OrderInfoCheck localOrderInfoCheck = new OrderInfoCheck();
    b(localOrderInfoCheck);
    localOrderInfoCheck.merchantId = this.b;
    localOrderInfoCheck.merchantOrderId = this.e;
    localOrderInfoCheck.merchantOrderTime = this.f;
    localOrderInfoCheck.sign = this.k;
    localOrderInfoCheck.isPreAuth = this.d;
    return localOrderInfoCheck;
  }
  
  public void a(Data paramData)
  {
    paramData = (OrderInfoCheck)paramData;
    c(paramData);
    this.a = paramData.merchantName;
    this.b = paramData.merchantId;
    this.e = paramData.merchantOrderId;
    this.f = paramData.merchantOrderTime;
    this.g = paramData.merchantOrderAmt;
    this.h = paramData.merchantOrderDesc;
    this.i = paramData.transTimeout;
    this.j = paramData.backEndUrl;
    this.k = paramData.sign;
    this.l = paramData.merchantPublicCert;
    this.c = paramData.activityId;
    this.d = paramData.isPreAuth;
  }
  
  public void a(String paramString)
  {
    this.b = paramString;
  }
  
  public String b()
  {
    return this.a;
  }
  
  public void b(String paramString)
  {
    this.e = paramString;
  }
  
  public String c()
  {
    return this.g;
  }
  
  public void c(String paramString)
  {
    this.f = paramString;
  }
  
  public String d()
  {
    return this.h;
  }
  
  public void d(String paramString)
  {
    this.k = paramString;
  }
  
  public String e()
  {
    return this.i;
  }
  
  public String f()
  {
    return this.j;
  }
  
  public String g()
  {
    return this.k;
  }
  
  public String h()
  {
    return this.l;
  }
  
  public String i()
  {
    return this.c;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */