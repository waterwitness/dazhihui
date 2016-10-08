package com.f.a.a;

import com.unionpay.upomp.lthj.plugin.model.Data;
import com.unionpay.upomp.lthj.plugin.model.DeleteBankCard;

public class dv
  extends es
{
  private String a;
  private StringBuffer b = new StringBuffer();
  private String c;
  private StringBuffer d = new StringBuffer();
  private String e;
  
  public dv(int paramInt)
  {
    super(paramInt);
  }
  
  public Data a()
  {
    DeleteBankCard localDeleteBankCard = new DeleteBankCard();
    b(localDeleteBankCard);
    localDeleteBankCard.loginName = this.a;
    localDeleteBankCard.mobileNumber = this.b.toString();
    localDeleteBankCard.bindId = this.c;
    localDeleteBankCard.pan = this.d.toString();
    localDeleteBankCard.isDefault = this.e;
    return localDeleteBankCard;
  }
  
  public void a(Data paramData)
  {
    paramData = (DeleteBankCard)paramData;
    c(paramData);
    this.a = paramData.loginName;
    this.b.delete(0, this.b.length());
    this.b.append(paramData.mobileNumber);
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
  
  public void d(String paramString)
  {
    this.c = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\dv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */