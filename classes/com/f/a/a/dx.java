package com.f.a.a;

import com.unionpay.upomp.lthj.plugin.model.Data;
import com.unionpay.upomp.lthj.plugin.model.Init;

public class dx
  extends es
{
  private String a;
  private String b;
  private String c;
  private String d;
  private String e;
  private boolean f;
  
  public dx(int paramInt)
  {
    super(paramInt);
  }
  
  public Data a()
  {
    Init localInit = new Init();
    b(localInit);
    localInit.merchantId = this.c;
    localInit.configVersion = this.a;
    return localInit;
  }
  
  public void a(Data paramData)
  {
    paramData = (Init)paramData;
    c(paramData);
    if ((paramData.configVersion != null) && (this.a != null))
    {
      if ((paramData.configFile != null) && (!"".equals(paramData.configFile)))
      {
        this.f = false;
        this.d = paramData.configFile;
        this.e = paramData.configFileHash;
      }
    }
    else {
      return;
    }
    this.f = true;
    this.b = paramData.sessionID;
    v(paramData.pluginSerialNo);
    v.a = this.b;
  }
  
  public void a(String paramString)
  {
    this.c = paramString;
  }
  
  public String b()
  {
    return this.d;
  }
  
  public void b(String paramString)
  {
    this.a = paramString;
  }
  
  public String c()
  {
    return this.e;
  }
  
  public boolean d()
  {
    return this.f;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\dx.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */