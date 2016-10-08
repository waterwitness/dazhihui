package com.f.a.a;

import com.unionpay.upomp.lthj.plugin.model.Data;
import com.unionpay.upomp.lthj.plugin.model.GetBundleBankCardList;

public class ba
  extends es
{
  private String a;
  private String b;
  private String c;
  private String d;
  private String e;
  private StringBuffer f = new StringBuffer();
  private StringBuffer g = new StringBuffer();
  private String h;
  
  public ba(int paramInt)
  {
    super(paramInt);
  }
  
  public Data a()
  {
    GetBundleBankCardList localGetBundleBankCardList = new GetBundleBankCardList();
    b(localGetBundleBankCardList);
    localGetBundleBankCardList.loginName = this.a;
    return localGetBundleBankCardList;
  }
  
  public void a(Data paramData)
  {
    paramData = (GetBundleBankCardList)paramData;
    c(paramData);
    this.b = paramData.bindId;
    this.c = paramData.panType;
    this.e = paramData.panBank;
    this.d = paramData.panBankId;
    this.f.delete(0, this.f.length());
    this.f.append(paramData.pan);
    this.g.delete(0, this.g.length());
    this.g.append(paramData.mobileNumber);
    this.h = paramData.isDefault;
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
  
  public String f()
  {
    return this.f.toString();
  }
  
  public String g()
  {
    return this.g.toString();
  }
  
  public String h()
  {
    return this.h;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */