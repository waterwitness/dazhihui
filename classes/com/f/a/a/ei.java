package com.f.a.a;

import com.unionpay.upomp.lthj.plugin.model.Data;
import com.unionpay.upomp.lthj.plugin.model.SMSDynamicValCodeIssue;

public class ei
  extends es
{
  private String a;
  private String b;
  private String c;
  
  public ei(int paramInt)
  {
    super(paramInt);
  }
  
  public Data a()
  {
    SMSDynamicValCodeIssue localSMSDynamicValCodeIssue = new SMSDynamicValCodeIssue();
    b(localSMSDynamicValCodeIssue);
    localSMSDynamicValCodeIssue.mobileNumber = this.a;
    localSMSDynamicValCodeIssue.secureInfo = this.b;
    return localSMSDynamicValCodeIssue;
  }
  
  public void a(Data paramData)
  {
    paramData = (SMSDynamicValCodeIssue)paramData;
    c(paramData);
    this.a = paramData.mobileNumber;
    this.c = paramData.mobileMac;
    this.b = paramData.secureInfo;
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public void b(String paramString)
  {
    this.b = paramString;
  }
  
  public String c()
  {
    return this.c;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\ei.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */