package com.f.a.a;

import com.unionpay.upomp.lthj.plugin.model.CheckUserExist;
import com.unionpay.upomp.lthj.plugin.model.Data;

public class ed
  extends es
{
  private String a;
  private String b;
  
  public ed(int paramInt)
  {
    super(paramInt);
  }
  
  public Data a()
  {
    CheckUserExist localCheckUserExist = new CheckUserExist();
    b(localCheckUserExist);
    localCheckUserExist.loginName = this.a;
    return localCheckUserExist;
  }
  
  public void a(Data paramData)
  {
    paramData = (CheckUserExist)paramData;
    c(paramData);
    this.b = paramData.isExist;
  }
  
  public void a(String paramString)
  {
    this.a = paramString;
  }
  
  public String b()
  {
    return this.b;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\ed.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */