package com.f.a.a;

import com.unionpay.upomp.lthj.plugin.model.Data;
import com.unionpay.upomp.lthj.plugin.model.GetBankService;

public class t
  extends es
{
  private String a;
  private String b;
  private String c;
  private String d;
  private String e;
  private String f;
  
  public t(int paramInt)
  {
    super(paramInt);
  }
  
  public Data a()
  {
    GetBankService localGetBankService = new GetBankService();
    b(localGetBankService);
    localGetBankService.payType = this.a;
    return localGetBankService;
  }
  
  public void a(Data paramData)
  {
    paramData = (GetBankService)paramData;
    c(paramData);
    this.b = paramData.panBank;
    this.c = paramData.panBankId;
    this.d = paramData.creditCard;
    this.e = paramData.debitCard;
    this.f = paramData.payTips;
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
  }
  
  public String b()
  {
    return this.b;
  }
  
  public String c()
  {
    return this.c;
  }
  
  public String d()
  {
    return this.d;
  }
  
  public String e()
  {
    return this.e;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */