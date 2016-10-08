package com.f.a.a;

import com.unionpay.upomp.lthj.plugin.model.BankCardBundle;
import com.unionpay.upomp.lthj.plugin.model.Data;

public class em
  extends es
{
  private String a;
  private String b;
  private String c;
  private String d;
  private String e;
  private String f;
  private StringBuffer g = new StringBuffer();
  private StringBuffer h = new StringBuffer();
  private StringBuffer i = new StringBuffer();
  private StringBuffer j = new StringBuffer();
  private String k;
  
  public em(int paramInt)
  {
    super(paramInt);
  }
  
  public Data a()
  {
    BankCardBundle localBankCardBundle = new BankCardBundle();
    b(localBankCardBundle);
    localBankCardBundle.loginName = this.a;
    localBankCardBundle.mobileNumber = this.b;
    localBankCardBundle.mobileMac = this.c;
    localBankCardBundle.validateCode = this.d;
    localBankCardBundle.panType = this.e;
    localBankCardBundle.panBankId = this.f;
    localBankCardBundle.pan = this.g.toString();
    localBankCardBundle.pin = this.h.toString();
    localBankCardBundle.isDefault = this.k;
    localBankCardBundle.panDate = this.i.toString();
    localBankCardBundle.cvn2 = this.j.toString();
    return localBankCardBundle;
  }
  
  public void a(Data paramData)
  {
    paramData = (BankCardBundle)paramData;
    c(paramData);
    this.a = paramData.loginName;
    this.b = paramData.mobileNumber;
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
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
    this.g.delete(0, this.g.length());
    this.g.append(paramString);
  }
  
  public void e(String paramString)
  {
    this.h.delete(0, this.h.length());
    this.h.append(paramString);
  }
  
  public void f(String paramString)
  {
    this.i.delete(0, this.i.length());
    this.i.append(paramString);
  }
  
  public void g(String paramString)
  {
    this.j.delete(0, this.j.length());
    this.j.append(paramString);
  }
  
  public void h(String paramString)
  {
    this.k = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\em.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */