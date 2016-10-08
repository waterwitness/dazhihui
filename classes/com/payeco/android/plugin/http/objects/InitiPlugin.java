package com.payeco.android.plugin.http.objects;

public class InitiPlugin
  extends PluginObject
{
  private String configFile;
  private String configFileHash;
  private String configVersion;
  private String isUpdate;
  private String merchantId;
  private String misc;
  private String msgExt;
  private String respCode;
  private String respDesc;
  private String sessionID;
  private String url;
  private String versionCode;
  private String versionName;
  
  public InitiPlugin() {}
  
  public InitiPlugin(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11, String paramString12, String paramString13)
  {
    this.configVersion = paramString1;
    this.sessionID = paramString2;
    this.merchantId = paramString3;
    this.configFile = paramString4;
    this.configFileHash = paramString5;
    this.versionCode = paramString6;
    this.versionName = paramString7;
    this.url = paramString8;
    this.isUpdate = paramString9;
    this.msgExt = paramString10;
    this.misc = paramString11;
    this.respCode = paramString12;
    this.respDesc = paramString13;
  }
  
  public boolean equals(Object paramObject)
  {
    if (this == paramObject) {}
    do
    {
      do
      {
        return true;
        if (!super.equals(paramObject)) {
          return false;
        }
        if (getClass() != paramObject.getClass()) {
          return false;
        }
        paramObject = (InitiPlugin)paramObject;
        if (this.configFile == null)
        {
          if (((InitiPlugin)paramObject).configFile != null) {
            return false;
          }
        }
        else if (!this.configFile.equals(((InitiPlugin)paramObject).configFile)) {
          return false;
        }
        if (this.configFileHash == null)
        {
          if (((InitiPlugin)paramObject).configFileHash != null) {
            return false;
          }
        }
        else if (!this.configFileHash.equals(((InitiPlugin)paramObject).configFileHash)) {
          return false;
        }
        if (this.configVersion == null)
        {
          if (((InitiPlugin)paramObject).configVersion != null) {
            return false;
          }
        }
        else if (!this.configVersion.equals(((InitiPlugin)paramObject).configVersion)) {
          return false;
        }
        if (this.isUpdate == null)
        {
          if (((InitiPlugin)paramObject).isUpdate != null) {
            return false;
          }
        }
        else if (!this.isUpdate.equals(((InitiPlugin)paramObject).isUpdate)) {
          return false;
        }
        if (this.merchantId == null)
        {
          if (((InitiPlugin)paramObject).merchantId != null) {
            return false;
          }
        }
        else if (!this.merchantId.equals(((InitiPlugin)paramObject).merchantId)) {
          return false;
        }
        if (this.misc == null)
        {
          if (((InitiPlugin)paramObject).misc != null) {
            return false;
          }
        }
        else if (!this.misc.equals(((InitiPlugin)paramObject).misc)) {
          return false;
        }
        if (this.msgExt == null)
        {
          if (((InitiPlugin)paramObject).msgExt != null) {
            return false;
          }
        }
        else if (!this.msgExt.equals(((InitiPlugin)paramObject).msgExt)) {
          return false;
        }
        if (this.respCode == null)
        {
          if (((InitiPlugin)paramObject).respCode != null) {
            return false;
          }
        }
        else if (!this.respCode.equals(((InitiPlugin)paramObject).respCode)) {
          return false;
        }
        if (this.respDesc == null)
        {
          if (((InitiPlugin)paramObject).respDesc != null) {
            return false;
          }
        }
        else if (!this.respDesc.equals(((InitiPlugin)paramObject).respDesc)) {
          return false;
        }
        if (this.sessionID == null)
        {
          if (((InitiPlugin)paramObject).sessionID != null) {
            return false;
          }
        }
        else if (!this.sessionID.equals(((InitiPlugin)paramObject).sessionID)) {
          return false;
        }
        if (this.url == null)
        {
          if (((InitiPlugin)paramObject).url != null) {
            return false;
          }
        }
        else if (!this.url.equals(((InitiPlugin)paramObject).url)) {
          return false;
        }
        if (this.versionCode == null)
        {
          if (((InitiPlugin)paramObject).versionCode != null) {
            return false;
          }
        }
        else if (!this.versionCode.equals(((InitiPlugin)paramObject).versionCode)) {
          return false;
        }
        if (this.versionName != null) {
          break;
        }
      } while (((InitiPlugin)paramObject).versionName == null);
      return false;
    } while (this.versionName.equals(((InitiPlugin)paramObject).versionName));
    return false;
  }
  
  public String getConfigFile()
  {
    return this.configFile;
  }
  
  public String getConfigFileHash()
  {
    return this.configFileHash;
  }
  
  public String getConfigVersion()
  {
    return this.configVersion;
  }
  
  public String getIsUpdate()
  {
    return this.isUpdate;
  }
  
  public String getMerchantId()
  {
    return this.merchantId;
  }
  
  public String getMisc()
  {
    return this.misc;
  }
  
  public String getMsgExt()
  {
    return this.msgExt;
  }
  
  public String getRespCode()
  {
    return this.respCode;
  }
  
  public String getRespDesc()
  {
    return this.respDesc;
  }
  
  public String getSessionID()
  {
    return this.sessionID;
  }
  
  public String getUrl()
  {
    return this.url;
  }
  
  public String getVersionCode()
  {
    return this.versionCode;
  }
  
  public String getVersionName()
  {
    return this.versionName;
  }
  
  public int hashCode()
  {
    int i8 = 0;
    int i9 = super.hashCode();
    int i;
    int j;
    label27:
    int k;
    label36:
    int m;
    label46:
    int n;
    label56:
    int i1;
    label66:
    int i2;
    label76:
    int i3;
    label86:
    int i4;
    label96:
    int i5;
    label106:
    int i6;
    label116:
    int i7;
    if (this.configFile == null)
    {
      i = 0;
      if (this.configFileHash != null) {
        break label222;
      }
      j = 0;
      if (this.configVersion != null) {
        break label233;
      }
      k = 0;
      if (this.isUpdate != null) {
        break label244;
      }
      m = 0;
      if (this.merchantId != null) {
        break label256;
      }
      n = 0;
      if (this.misc != null) {
        break label268;
      }
      i1 = 0;
      if (this.msgExt != null) {
        break label280;
      }
      i2 = 0;
      if (this.respCode != null) {
        break label292;
      }
      i3 = 0;
      if (this.respDesc != null) {
        break label304;
      }
      i4 = 0;
      if (this.sessionID != null) {
        break label316;
      }
      i5 = 0;
      if (this.url != null) {
        break label328;
      }
      i6 = 0;
      if (this.versionCode != null) {
        break label340;
      }
      i7 = 0;
      label126:
      if (this.versionName != null) {
        break label352;
      }
    }
    for (;;)
    {
      return (i7 + (i6 + (i5 + (i4 + (i3 + (i2 + (i1 + (n + (m + (k + (j + (i + i9 * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + i8;
      i = this.configFile.hashCode();
      break;
      label222:
      j = this.configFileHash.hashCode();
      break label27;
      label233:
      k = this.configVersion.hashCode();
      break label36;
      label244:
      m = this.isUpdate.hashCode();
      break label46;
      label256:
      n = this.merchantId.hashCode();
      break label56;
      label268:
      i1 = this.misc.hashCode();
      break label66;
      label280:
      i2 = this.msgExt.hashCode();
      break label76;
      label292:
      i3 = this.respCode.hashCode();
      break label86;
      label304:
      i4 = this.respDesc.hashCode();
      break label96;
      label316:
      i5 = this.sessionID.hashCode();
      break label106;
      label328:
      i6 = this.url.hashCode();
      break label116;
      label340:
      i7 = this.versionCode.hashCode();
      break label126;
      label352:
      i8 = this.versionName.hashCode();
    }
  }
  
  public void setConfigFile(String paramString)
  {
    this.configFile = paramString;
  }
  
  public void setConfigFileHash(String paramString)
  {
    this.configFileHash = paramString;
  }
  
  public void setConfigVersion(String paramString)
  {
    this.configVersion = paramString;
  }
  
  public void setIsUpdate(String paramString)
  {
    this.isUpdate = paramString;
  }
  
  public void setMerchantId(String paramString)
  {
    this.merchantId = paramString;
  }
  
  public void setMisc(String paramString)
  {
    this.misc = paramString;
  }
  
  public void setMsgExt(String paramString)
  {
    this.msgExt = paramString;
  }
  
  public void setRespCode(String paramString)
  {
    this.respCode = paramString;
  }
  
  public void setRespDesc(String paramString)
  {
    this.respDesc = paramString;
  }
  
  public void setSessionID(String paramString)
  {
    this.sessionID = paramString;
  }
  
  public void setUrl(String paramString)
  {
    this.url = paramString;
  }
  
  public void setVersionCode(String paramString)
  {
    this.versionCode = paramString;
  }
  
  public void setVersionName(String paramString)
  {
    this.versionName = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\http\objects\InitiPlugin.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */