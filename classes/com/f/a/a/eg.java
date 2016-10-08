package com.f.a.a;

import com.unionpay.upomp.lthj.plugin.model.Data;
import com.unionpay.upomp.lthj.plugin.model.RetrievePassword;

public class eg
  extends es
{
  private String a;
  private StringBuffer b = new StringBuffer();
  private String c;
  private String d;
  private String e;
  
  public eg(int paramInt)
  {
    super(paramInt);
  }
  
  public Data a()
  {
    RetrievePassword localRetrievePassword = new RetrievePassword();
    b(localRetrievePassword);
    localRetrievePassword.loginName = this.a;
    localRetrievePassword.newPassword = this.b.toString();
    localRetrievePassword.validateCode = this.d;
    localRetrievePassword.secureAnswer = this.e;
    return localRetrievePassword;
  }
  
  public void a(Data paramData)
  {
    paramData = (RetrievePassword)paramData;
    c(paramData);
    this.a = paramData.loginName;
    this.c = paramData.email;
    this.e = paramData.secureAnswer;
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
  }
  
  public void b(String paramString)
  {
    this.b.delete(0, this.b.length());
    this.b.append(paramString);
  }
  
  public void c(String paramString)
  {
    this.e = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\eg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */