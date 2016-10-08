package com.unionpay.upomp.lthj.plugin.model;

import android.content.Context;
import com.f.a.a.cc;
import com.f.a.a.eb;
import com.f.a.a.ec;
import com.unionpay.upomp.lthj.plugin.ui.JniMethod;

public class HeadData
{
  private String a;
  private String b;
  private String c;
  private String d;
  private String e;
  private String f;
  private String g;
  
  public HeadData(String paramString, Context paramContext)
  {
    Object localObject = new eb(paramContext).a(1);
    if ((localObject != null) && (((cc)localObject).b() != null))
    {
      localObject = ((cc)localObject).b().getBytes();
      localObject = JniMethod.getJniMethod().decryptConfig((byte[])localObject, localObject.length);
      if (localObject != null) {
        this.f = new String((byte[])localObject);
      }
    }
    for (;;)
    {
      this.a = paramString;
      this.f = this.f;
      this.c = "01-02-1.1.0";
      this.d = ec.b();
      this.e = ec.a();
      this.g = ec.a(paramContext);
      this.b = "1.1.0";
      return;
      this.f = "";
      continue;
      this.f = "";
    }
  }
  
  public static HeadData createHeadData(String paramString, Context paramContext)
  {
    return new HeadData(paramString, paramContext);
  }
  
  public String getApplication()
  {
    return this.a;
  }
  
  public String getPluginSerialNo()
  {
    return this.f;
  }
  
  public String getPluginVersion()
  {
    return this.c;
  }
  
  public String getTerminalModel()
  {
    return this.d;
  }
  
  public String getTerminalOs()
  {
    return this.e;
  }
  
  public String getTerminalPhysicalNo()
  {
    return this.g;
  }
  
  public String getVersion()
  {
    return this.b;
  }
  
  public void setApplication(String paramString)
  {
    this.a = paramString;
  }
  
  public void setPluginSerialNo(String paramString)
  {
    this.f = paramString;
  }
  
  public void setPluginVersion(String paramString)
  {
    this.c = paramString;
  }
  
  public void setTerminalModel(String paramString)
  {
    this.d = paramString;
  }
  
  public void setTerminalOs(String paramString)
  {
    this.e = paramString;
  }
  
  public void setTerminalPhysicalNo(String paramString)
  {
    this.g = paramString;
  }
  
  public void setVersion(String paramString)
  {
    this.b = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\unionpay\upomp\lthj\plugin\model\HeadData.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */