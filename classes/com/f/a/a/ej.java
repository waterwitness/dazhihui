package com.f.a.a;

import com.unionpay.upomp.lthj.plugin.model.Data;
import com.unionpay.upomp.lthj.plugin.model.GetBankCardList;

public class ej
  extends es
{
  private String a;
  private String b;
  private String c;
  
  public ej(int paramInt)
  {
    super(paramInt);
  }
  
  public Data a()
  {
    GetBankCardList localGetBankCardList = new GetBankCardList();
    b(localGetBankCardList);
    localGetBankCardList.panType = this.c;
    return localGetBankCardList;
  }
  
  public void a(Data paramData)
  {
    paramData = (GetBankCardList)paramData;
    c(paramData);
    this.a = paramData.panBankId;
    this.b = paramData.panBank;
    this.c = paramData.panType;
  }
  
  public void a(String paramString)
  {
    this.c = paramString;
  }
  
  public String b()
  {
    return this.a;
  }
  
  public String c()
  {
    return this.b;
  }
  
  public String d()
  {
    return this.c;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\ej.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */