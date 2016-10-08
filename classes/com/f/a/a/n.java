package com.f.a.a;

import com.unionpay.upomp.lthj.plugin.model.Data;
import com.unionpay.upomp.lthj.plugin.model.SetDefaultBandCard;

public class n
  extends es
{
  private String a;
  private StringBuffer b = new StringBuffer();
  private String c;
  private String d;
  private StringBuffer e = new StringBuffer();
  
  public n(int paramInt)
  {
    super(paramInt);
  }
  
  public Data a()
  {
    SetDefaultBandCard localSetDefaultBandCard = new SetDefaultBandCard();
    b(localSetDefaultBandCard);
    localSetDefaultBandCard.loginName = this.a;
    localSetDefaultBandCard.mobileNumber = this.b.toString();
    localSetDefaultBandCard.bindId = this.c;
    localSetDefaultBandCard.panType = this.d;
    localSetDefaultBandCard.pan = this.e.toString();
    return localSetDefaultBandCard;
  }
  
  public void a(Data paramData)
  {
    paramData = (SetDefaultBandCard)paramData;
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
    this.c = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */