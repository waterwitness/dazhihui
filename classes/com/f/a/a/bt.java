package com.f.a.a;

import com.unionpay.upomp.lthj.plugin.model.Data;
import com.unionpay.upomp.lthj.plugin.model.Login;

public class bt
  extends es
{
  private String a;
  private StringBuffer b = new StringBuffer();
  private String c;
  private String d;
  private String e;
  private String f;
  
  public bt(int paramInt)
  {
    super(paramInt);
  }
  
  public Data a()
  {
    Login localLogin = new Login();
    b(localLogin);
    localLogin.loginName = this.a;
    localLogin.password = this.b.toString();
    this.b.delete(0, this.b.length());
    localLogin.validateCode = this.c;
    localLogin.mobileNumber = this.d;
    return localLogin;
  }
  
  public void a(Data paramData)
  {
    paramData = (Login)paramData;
    c(paramData);
    this.a = paramData.loginName;
    this.d = paramData.mobileNumber;
    this.e = paramData.email;
    this.b.setLength(0);
    this.b.append(paramData.password);
    this.f = paramData.welcome;
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
    this.b.setLength(0);
    this.b.append(paramString);
  }
  
  public String c()
  {
    return this.d;
  }
  
  public void c(String paramString)
  {
    this.c = paramString;
  }
  
  public String d()
  {
    return this.e;
  }
  
  public String e()
  {
    return this.f;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\bt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */