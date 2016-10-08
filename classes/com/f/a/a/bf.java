package com.f.a.a;

import com.unionpay.upomp.lthj.plugin.model.Data;
import com.unionpay.upomp.lthj.plugin.model.QuickBankBind;

public class bf
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
  
  public bf(int paramInt)
  {
    super(paramInt);
  }
  
  public Data a()
  {
    QuickBankBind localQuickBankBind = new QuickBankBind();
    b(localQuickBankBind);
    localQuickBankBind.loginName = this.a;
    localQuickBankBind.cvn2 = this.h;
    localQuickBankBind.merchantId = this.b;
    localQuickBankBind.merchantOrderId = this.c;
    localQuickBankBind.merchantOrderTime = this.d;
    localQuickBankBind.pan = this.e;
    localQuickBankBind.panDate = this.g;
    localQuickBankBind.pin = this.f;
    return localQuickBankBind;
  }
  
  public void a(Data paramData)
  {
    c(paramData);
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
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
    this.c = paramString;
  }
  
  public void d(String paramString)
  {
    this.d = paramString;
  }
  
  public void e(String paramString)
  {
    this.e = paramString;
  }
  
  public void f(String paramString)
  {
    this.f = paramString;
  }
  
  public void g(String paramString)
  {
    this.g = paramString;
  }
  
  public void h(String paramString)
  {
    this.h = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\bf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */