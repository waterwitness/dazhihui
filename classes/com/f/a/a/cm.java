package com.f.a.a;

import com.unionpay.upomp.lthj.plugin.model.BankCardInfo;
import com.unionpay.upomp.lthj.plugin.model.Data;

public class cm
  extends es
{
  private String a;
  private String b;
  private String c;
  private String d;
  private String e;
  private String f;
  
  public cm(int paramInt)
  {
    super(paramInt);
  }
  
  public Data a()
  {
    BankCardInfo localBankCardInfo = new BankCardInfo();
    b(localBankCardInfo);
    localBankCardInfo.pan = this.a;
    localBankCardInfo.validateCode = this.b;
    localBankCardInfo.activityId = this.f;
    return localBankCardInfo;
  }
  
  public void a(Data paramData)
  {
    paramData = (BankCardInfo)paramData;
    c(paramData);
    this.c = paramData.panType;
    this.d = paramData.panBank;
    this.e = paramData.payTips;
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
  }
  
  public String b()
  {
    return this.c;
  }
  
  public void b(String paramString)
  {
    this.b = paramString;
  }
  
  public String c()
  {
    return this.d;
  }
  
  public void c(String paramString)
  {
    this.f = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\cm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */