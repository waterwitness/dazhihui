package com.f.a.a;

import com.unionpay.upomp.lthj.plugin.model.Data;
import com.unionpay.upomp.lthj.plugin.model.QuickRegister;

public class bx
  extends es
{
  private String a;
  private StringBuffer b = new StringBuffer();
  private String c;
  private String d;
  private String e;
  private String f;
  private String g;
  private String h;
  
  public bx(int paramInt)
  {
    super(paramInt);
  }
  
  public Data a()
  {
    QuickRegister localQuickRegister = new QuickRegister();
    b(localQuickRegister);
    localQuickRegister.loginName = this.a;
    localQuickRegister.password = this.b.toString();
    localQuickRegister.merchantOrderTime = this.h;
    localQuickRegister.welcome = this.e;
    localQuickRegister.secureQuestion = this.f;
    localQuickRegister.secureAnswer = this.g;
    localQuickRegister.merchantId = this.c;
    localQuickRegister.merchantOrderId = this.d;
    return localQuickRegister;
  }
  
  public void a(Data paramData)
  {
    paramData = (QuickRegister)paramData;
    c(paramData);
    this.a = paramData.loginName;
    this.b.delete(0, this.b.length());
    this.b.append(paramData.password);
    this.e = paramData.welcome;
    this.f = paramData.secureQuestion;
    this.g = paramData.secureAnswer;
    this.h = paramData.merchantOrderTime;
    this.c = paramData.merchantId;
    this.d = paramData.merchantOrderId;
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
  }
  
  public void b(String paramString)
  {
    this.b = new StringBuffer(paramString);
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\bx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */