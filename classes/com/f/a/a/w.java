package com.f.a.a;

import com.unionpay.upomp.lthj.plugin.model.Data;
import com.unionpay.upomp.lthj.plugin.model.MobileNumUpdate;

public class w
  extends es
{
  private String a;
  private StringBuffer b = new StringBuffer();
  private String c;
  private String d;
  private String e;
  
  public w(int paramInt)
  {
    super(paramInt);
  }
  
  public Data a()
  {
    MobileNumUpdate localMobileNumUpdate = new MobileNumUpdate();
    b(localMobileNumUpdate);
    localMobileNumUpdate.loginName = this.a;
    localMobileNumUpdate.password = this.b.toString();
    localMobileNumUpdate.mobileNumber = this.c;
    localMobileNumUpdate.newMobileNumber = this.d;
    localMobileNumUpdate.mobileMac = this.e;
    return localMobileNumUpdate;
  }
  
  public void a(Data paramData)
  {
    paramData = (MobileNumUpdate)paramData;
    c(paramData);
    this.a = paramData.loginName;
    this.c = paramData.mobileNumber;
    this.d = paramData.newMobileNumber;
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
  }
  
  public String b()
  {
    return this.d;
  }
  
  public void b(String paramString)
  {
    this.c = paramString;
  }
  
  public void c(String paramString)
  {
    this.d = paramString;
  }
  
  public void d(String paramString)
  {
    this.e = paramString;
  }
  
  public void e(String paramString)
  {
    this.b.delete(0, this.b.length());
    this.b.append(paramString);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */