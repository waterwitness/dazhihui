package com.f.a.a;

import com.unionpay.upomp.lthj.plugin.model.Data;
import com.unionpay.upomp.lthj.plugin.model.GetSecureQuestion;

public class ah
  extends es
{
  private String a;
  private String b;
  private StringBuffer c = new StringBuffer();
  private String d;
  private String e;
  
  public ah(int paramInt)
  {
    super(paramInt);
  }
  
  public Data a()
  {
    GetSecureQuestion localGetSecureQuestion = new GetSecureQuestion();
    b(localGetSecureQuestion);
    localGetSecureQuestion.loginName = this.a;
    localGetSecureQuestion.mobileMac = this.b;
    localGetSecureQuestion.mobileNumber = this.c.toString();
    localGetSecureQuestion.validateCode = this.e;
    return localGetSecureQuestion;
  }
  
  public void a(Data paramData)
  {
    paramData = (GetSecureQuestion)paramData;
    c(paramData);
    this.a = paramData.loginName;
    this.b = paramData.mobileMac;
    this.c.delete(0, this.c.length());
    this.c.append(paramData.mobileNumber);
    this.d = paramData.secureQuestion;
    this.e = paramData.validateCode;
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
  
  public String c()
  {
    return this.c.toString();
  }
  
  public void c(String paramString)
  {
    this.c.delete(0, this.c.length());
    this.c.append(paramString);
  }
  
  public String d()
  {
    return this.d;
  }
  
  public void d(String paramString)
  {
    this.e = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\ah.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */