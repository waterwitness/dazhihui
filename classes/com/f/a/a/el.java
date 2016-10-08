package com.f.a.a;

import com.unionpay.upomp.lthj.plugin.model.Data;
import com.unionpay.upomp.lthj.plugin.model.ImageCheckCode;

public class el
  extends es
{
  public String a;
  
  public el(int paramInt)
  {
    super(paramInt);
  }
  
  public Data a()
  {
    ImageCheckCode localImageCheckCode = new ImageCheckCode();
    b(localImageCheckCode);
    localImageCheckCode.validateCodeUrl = this.a;
    return localImageCheckCode;
  }
  
  public void a(Data paramData)
  {
    paramData = (ImageCheckCode)paramData;
    c(paramData);
    this.a = paramData.validateCodeUrl;
  }
  
  public String b()
  {
    return this.a;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\el.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */