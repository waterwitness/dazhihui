package com.f.a.a;

import com.unionpay.upomp.lthj.plugin.model.Data;
import com.unionpay.upomp.lthj.plugin.model.ModifyPassword;

public class ek
  extends es
{
  private String a;
  private StringBuffer b = new StringBuffer();
  private StringBuffer c = new StringBuffer();
  private StringBuffer d = new StringBuffer();
  private String e;
  
  public ek(int paramInt)
  {
    super(paramInt);
  }
  
  public Data a()
  {
    ModifyPassword localModifyPassword = new ModifyPassword();
    b(localModifyPassword);
    localModifyPassword.loginName = this.a;
    localModifyPassword.password = this.b.toString();
    localModifyPassword.newPassword = this.c.toString();
    localModifyPassword.mobileNumber = this.d.toString();
    localModifyPassword.mobileMac = this.e;
    return localModifyPassword;
  }
  
  public void a(Data paramData)
  {
    paramData = (ModifyPassword)paramData;
    c(paramData);
    this.a = paramData.loginName;
    this.b.delete(0, this.b.length());
    this.b.append(paramData.password);
    this.c.delete(0, this.c.length());
    this.c.append(paramData.newPassword);
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
    this.c.delete(0, this.c.length());
    this.c.append(paramString);
  }
  
  public void d(String paramString)
  {
    this.d.delete(0, this.d.length());
    this.d.append(paramString);
  }
  
  public void e(String paramString)
  {
    this.e = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\ek.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */