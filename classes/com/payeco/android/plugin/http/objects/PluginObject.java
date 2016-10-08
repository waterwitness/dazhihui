package com.payeco.android.plugin.http.objects;

import java.io.Serializable;

public class PluginObject
  implements Serializable
{
  private String application;
  private String pluginSerialNo;
  private String pluginVersion;
  private String terminalModel;
  private String terminalOs;
  private String terminalPhysicalNo;
  private String version;
  
  public PluginObject() {}
  
  public PluginObject(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    this.application = paramString1;
    this.version = paramString2;
    this.pluginVersion = paramString3;
    this.terminalModel = paramString4;
    this.terminalOs = paramString5;
    this.pluginSerialNo = paramString6;
    this.terminalPhysicalNo = paramString7;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      do
      {
        return true;
        if (paramObject == null) {
          return false;
        }
        if (getClass() != paramObject.getClass()) {
          return false;
        }
        paramObject = (PluginObject)paramObject;
        if (this.application == null)
        {
          if (((PluginObject)paramObject).application != null) {
            return false;
          }
        }
        else if (!this.application.equals(((PluginObject)paramObject).application)) {
          return false;
        }
        if (this.pluginSerialNo == null)
        {
          if (((PluginObject)paramObject).pluginSerialNo != null) {
            return false;
          }
        }
        else if (!this.pluginSerialNo.equals(((PluginObject)paramObject).pluginSerialNo)) {
          return false;
        }
        if (this.pluginVersion == null)
        {
          if (((PluginObject)paramObject).pluginVersion != null) {
            return false;
          }
        }
        else if (!this.pluginVersion.equals(((PluginObject)paramObject).pluginVersion)) {
          return false;
        }
        if (this.terminalModel == null)
        {
          if (((PluginObject)paramObject).terminalModel != null) {
            return false;
          }
        }
        else if (!this.terminalModel.equals(((PluginObject)paramObject).terminalModel)) {
          return false;
        }
        if (this.terminalOs == null)
        {
          if (((PluginObject)paramObject).terminalOs != null) {
            return false;
          }
        }
        else if (!this.terminalOs.equals(((PluginObject)paramObject).terminalOs)) {
          return false;
        }
        if (this.terminalPhysicalNo == null)
        {
          if (((PluginObject)paramObject).terminalPhysicalNo != null) {
            return false;
          }
        }
        else if (!this.terminalPhysicalNo.equals(((PluginObject)paramObject).terminalPhysicalNo)) {
          return false;
        }
        if (this.version != null) {
          break;
        }
      } while (((PluginObject)paramObject).version == null);
      return false;
    } while (this.version.equals(((PluginObject)paramObject).version));
    return false;
  }
  
  public String getApplication()
  {
    return this.application;
  }
  
  public String getPluginSerialNo()
  {
    return this.pluginSerialNo;
  }
  
  public String getPluginVersion()
  {
    return this.pluginVersion;
  }
  
  public String getTerminalModel()
  {
    return this.terminalModel;
  }
  
  public String getTerminalOs()
  {
    return this.terminalOs;
  }
  
  public String getTerminalPhysicalNo()
  {
    return this.terminalPhysicalNo;
  }
  
  public String getVersion()
  {
    return this.version;
  }
  
  public int hashCode()
  {
    int i2 = 0;
    int i;
    int j;
    label21:
    int k;
    label30:
    int m;
    label40:
    int n;
    label50:
    int i1;
    if (this.application == null)
    {
      i = 0;
      if (this.pluginSerialNo != null) {
        break label117;
      }
      j = 0;
      if (this.pluginVersion != null) {
        break label128;
      }
      k = 0;
      if (this.terminalModel != null) {
        break label139;
      }
      m = 0;
      if (this.terminalOs != null) {
        break label151;
      }
      n = 0;
      if (this.terminalPhysicalNo != null) {
        break label163;
      }
      i1 = 0;
      label60:
      if (this.version != null) {
        break label175;
      }
    }
    for (;;)
    {
      return (i1 + (n + (m + (k + (j + (i + 31) * 31) * 31) * 31) * 31) * 31) * 31 + i2;
      i = this.application.hashCode();
      break;
      label117:
      j = this.pluginSerialNo.hashCode();
      break label21;
      label128:
      k = this.pluginVersion.hashCode();
      break label30;
      label139:
      m = this.terminalModel.hashCode();
      break label40;
      label151:
      n = this.terminalOs.hashCode();
      break label50;
      label163:
      i1 = this.terminalPhysicalNo.hashCode();
      break label60;
      label175:
      i2 = this.version.hashCode();
    }
  }
  
  public void setApplication(String paramString)
  {
    this.application = paramString;
  }
  
  public void setPluginSerialNo(String paramString)
  {
    this.pluginSerialNo = paramString;
  }
  
  public void setPluginVersion(String paramString)
  {
    this.pluginVersion = paramString;
  }
  
  public void setTerminalModel(String paramString)
  {
    this.terminalModel = paramString;
  }
  
  public void setTerminalOs(String paramString)
  {
    this.terminalOs = paramString;
  }
  
  public void setTerminalPhysicalNo(String paramString)
  {
    this.terminalPhysicalNo = paramString;
  }
  
  public void setVersion(String paramString)
  {
    this.version = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\http\objects\PluginObject.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */