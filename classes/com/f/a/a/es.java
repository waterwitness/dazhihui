package com.f.a.a;

import com.unionpay.upomp.lthj.plugin.model.Data;
import com.unionpay.upomp.lthj.plugin.model.HeadData;

public abstract class es
{
  private int a;
  private String b;
  private String c;
  private String d;
  private String e;
  private String f;
  private String g;
  private String h;
  private String i;
  private String j;
  private String k;
  private String l;
  private int m;
  
  public es() {}
  
  public es(int paramInt)
  {
    this.a = paramInt;
  }
  
  public abstract Data a();
  
  public abstract void a(Data paramData);
  
  public void a(HeadData paramHeadData)
  {
    if (paramHeadData != null)
    {
      this.b = paramHeadData.getApplication();
      this.c = paramHeadData.getVersion();
      this.d = paramHeadData.getPluginVersion();
      this.e = paramHeadData.getTerminalModel();
      this.f = paramHeadData.getTerminalOs();
      this.g = paramHeadData.getPluginSerialNo();
      this.h = paramHeadData.getTerminalPhysicalNo();
    }
  }
  
  public void b(Data paramData)
  {
    if (paramData != null)
    {
      paramData.type = j();
      paramData.application = l();
      paramData.version = m();
      paramData.pluginVersion = n();
      paramData.terminalModel = o();
      paramData.terminalOs = p();
      paramData.pluginSerialNo = q();
      paramData.terminalPhysicalNo = r();
      paramData.misc = this.j;
      paramData.msgExt = this.i;
    }
  }
  
  public void c(Data paramData)
  {
    if (paramData != null)
    {
      this.b = paramData.application;
      this.c = paramData.version;
      this.d = paramData.pluginVersion;
      this.e = paramData.terminalModel;
      this.f = paramData.terminalOs;
      this.g = paramData.pluginSerialNo;
      this.h = paramData.terminalPhysicalNo;
      this.i = paramData.msgExt;
      this.j = paramData.misc;
      this.k = paramData.respCode;
      this.l = paramData.respDesc;
      this.m = paramData.stateCode;
    }
  }
  
  public int j()
  {
    return this.a;
  }
  
  public String k()
  {
    return this.j;
  }
  
  public String l()
  {
    return this.b;
  }
  
  public String m()
  {
    return this.c;
  }
  
  public String n()
  {
    return this.d;
  }
  
  public String o()
  {
    return this.e;
  }
  
  public String p()
  {
    return this.f;
  }
  
  public String q()
  {
    return this.g;
  }
  
  public String r()
  {
    return this.h;
  }
  
  public String s()
  {
    return this.k;
  }
  
  public String t()
  {
    return this.l;
  }
  
  public void v(String paramString)
  {
    this.g = paramString;
  }
  
  public void w(String paramString)
  {
    this.j = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\es.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */