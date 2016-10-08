package com.payeco.android.plugin.http.objects;

public class CheckOrder
  extends PluginObject
{
  private String backEndUrl;
  private String imei;
  private String imsi;
  private String lbs;
  private String loginName;
  private String mac;
  private String merchantId;
  private String merchantName;
  private String merchantOrderAmt;
  private String merchantOrderDesc;
  private String merchantOrderId;
  private String merchantOrderTime;
  private String merchantPublicCert;
  private String misc;
  private String mobileNumber;
  private String msgExt;
  private String pan;
  private String panBank;
  private String panType;
  private String respCode;
  private String respDesc;
  private String sign;
  private String supportPanType;
  private String transTimeout;
  private String userTag;
  
  public CheckOrder() {}
  
  public CheckOrder(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11, String paramString12, String paramString13, String paramString14, String paramString15, String paramString16, String paramString17, String paramString18, String paramString19, String paramString20, String paramString21, String paramString22, String paramString23, String paramString24, String paramString25)
  {
    this.loginName = paramString1;
    this.imsi = paramString2;
    this.imei = paramString3;
    this.lbs = paramString4;
    this.mac = paramString5;
    this.userTag = paramString6;
    this.supportPanType = paramString7;
    this.pan = paramString8;
    this.panType = paramString9;
    this.panBank = paramString10;
    this.mobileNumber = paramString11;
    this.merchantName = paramString12;
    this.merchantId = paramString13;
    this.merchantOrderId = paramString14;
    this.merchantOrderTime = paramString15;
    this.merchantOrderAmt = paramString16;
    this.merchantOrderDesc = paramString17;
    this.transTimeout = paramString18;
    this.backEndUrl = paramString19;
    this.sign = paramString20;
    this.merchantPublicCert = paramString21;
    this.respCode = paramString22;
    this.respDesc = paramString23;
    this.msgExt = paramString24;
    this.misc = paramString25;
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
        paramObject = (CheckOrder)paramObject;
        if (this.backEndUrl == null)
        {
          if (((CheckOrder)paramObject).backEndUrl != null) {
            return false;
          }
        }
        else if (!this.backEndUrl.equals(((CheckOrder)paramObject).backEndUrl)) {
          return false;
        }
        if (this.imei == null)
        {
          if (((CheckOrder)paramObject).imei != null) {
            return false;
          }
        }
        else if (!this.imei.equals(((CheckOrder)paramObject).imei)) {
          return false;
        }
        if (this.imsi == null)
        {
          if (((CheckOrder)paramObject).imsi != null) {
            return false;
          }
        }
        else if (!this.imsi.equals(((CheckOrder)paramObject).imsi)) {
          return false;
        }
        if (this.lbs == null)
        {
          if (((CheckOrder)paramObject).lbs != null) {
            return false;
          }
        }
        else if (!this.lbs.equals(((CheckOrder)paramObject).lbs)) {
          return false;
        }
        if (this.loginName == null)
        {
          if (((CheckOrder)paramObject).loginName != null) {
            return false;
          }
        }
        else if (!this.loginName.equals(((CheckOrder)paramObject).loginName)) {
          return false;
        }
        if (this.mac == null)
        {
          if (((CheckOrder)paramObject).mac != null) {
            return false;
          }
        }
        else if (!this.mac.equals(((CheckOrder)paramObject).mac)) {
          return false;
        }
        if (this.merchantId == null)
        {
          if (((CheckOrder)paramObject).merchantId != null) {
            return false;
          }
        }
        else if (!this.merchantId.equals(((CheckOrder)paramObject).merchantId)) {
          return false;
        }
        if (this.merchantName == null)
        {
          if (((CheckOrder)paramObject).merchantName != null) {
            return false;
          }
        }
        else if (!this.merchantName.equals(((CheckOrder)paramObject).merchantName)) {
          return false;
        }
        if (this.merchantOrderAmt == null)
        {
          if (((CheckOrder)paramObject).merchantOrderAmt != null) {
            return false;
          }
        }
        else if (!this.merchantOrderAmt.equals(((CheckOrder)paramObject).merchantOrderAmt)) {
          return false;
        }
        if (this.merchantOrderDesc == null)
        {
          if (((CheckOrder)paramObject).merchantOrderDesc != null) {
            return false;
          }
        }
        else if (!this.merchantOrderDesc.equals(((CheckOrder)paramObject).merchantOrderDesc)) {
          return false;
        }
        if (this.merchantOrderId == null)
        {
          if (((CheckOrder)paramObject).merchantOrderId != null) {
            return false;
          }
        }
        else if (!this.merchantOrderId.equals(((CheckOrder)paramObject).merchantOrderId)) {
          return false;
        }
        if (this.merchantOrderTime == null)
        {
          if (((CheckOrder)paramObject).merchantOrderTime != null) {
            return false;
          }
        }
        else if (!this.merchantOrderTime.equals(((CheckOrder)paramObject).merchantOrderTime)) {
          return false;
        }
        if (this.merchantPublicCert == null)
        {
          if (((CheckOrder)paramObject).merchantPublicCert != null) {
            return false;
          }
        }
        else if (!this.merchantPublicCert.equals(((CheckOrder)paramObject).merchantPublicCert)) {
          return false;
        }
        if (this.misc == null)
        {
          if (((CheckOrder)paramObject).misc != null) {
            return false;
          }
        }
        else if (!this.misc.equals(((CheckOrder)paramObject).misc)) {
          return false;
        }
        if (this.mobileNumber == null)
        {
          if (((CheckOrder)paramObject).mobileNumber != null) {
            return false;
          }
        }
        else if (!this.mobileNumber.equals(((CheckOrder)paramObject).mobileNumber)) {
          return false;
        }
        if (this.msgExt == null)
        {
          if (((CheckOrder)paramObject).msgExt != null) {
            return false;
          }
        }
        else if (!this.msgExt.equals(((CheckOrder)paramObject).msgExt)) {
          return false;
        }
        if (this.pan == null)
        {
          if (((CheckOrder)paramObject).pan != null) {
            return false;
          }
        }
        else if (!this.pan.equals(((CheckOrder)paramObject).pan)) {
          return false;
        }
        if (this.panBank == null)
        {
          if (((CheckOrder)paramObject).panBank != null) {
            return false;
          }
        }
        else if (!this.panBank.equals(((CheckOrder)paramObject).panBank)) {
          return false;
        }
        if (this.panType == null)
        {
          if (((CheckOrder)paramObject).panType != null) {
            return false;
          }
        }
        else if (!this.panType.equals(((CheckOrder)paramObject).panType)) {
          return false;
        }
        if (this.respCode == null)
        {
          if (((CheckOrder)paramObject).respCode != null) {
            return false;
          }
        }
        else if (!this.respCode.equals(((CheckOrder)paramObject).respCode)) {
          return false;
        }
        if (this.respDesc == null)
        {
          if (((CheckOrder)paramObject).respDesc != null) {
            return false;
          }
        }
        else if (!this.respDesc.equals(((CheckOrder)paramObject).respDesc)) {
          return false;
        }
        if (this.sign == null)
        {
          if (((CheckOrder)paramObject).sign != null) {
            return false;
          }
        }
        else if (!this.sign.equals(((CheckOrder)paramObject).sign)) {
          return false;
        }
        if (this.supportPanType == null)
        {
          if (((CheckOrder)paramObject).supportPanType != null) {
            return false;
          }
        }
        else if (!this.supportPanType.equals(((CheckOrder)paramObject).supportPanType)) {
          return false;
        }
        if (this.transTimeout == null)
        {
          if (((CheckOrder)paramObject).transTimeout != null) {
            return false;
          }
        }
        else if (!this.transTimeout.equals(((CheckOrder)paramObject).transTimeout)) {
          return false;
        }
        if (this.userTag != null) {
          break;
        }
      } while (((CheckOrder)paramObject).userTag == null);
      return false;
    } while (this.userTag.equals(((CheckOrder)paramObject).userTag));
    return false;
  }
  
  public String getBackEndUrl()
  {
    return this.backEndUrl;
  }
  
  public String getImei()
  {
    return this.imei;
  }
  
  public String getImsi()
  {
    return this.imsi;
  }
  
  public String getLbs()
  {
    return this.lbs;
  }
  
  public String getLoginName()
  {
    return this.loginName;
  }
  
  public String getMac()
  {
    return this.mac;
  }
  
  public String getMerchantId()
  {
    return this.merchantId;
  }
  
  public String getMerchantName()
  {
    return this.merchantName;
  }
  
  public String getMerchantOrderAmt()
  {
    return this.merchantOrderAmt;
  }
  
  public String getMerchantOrderDesc()
  {
    return this.merchantOrderDesc;
  }
  
  public String getMerchantOrderId()
  {
    return this.merchantOrderId;
  }
  
  public String getMerchantOrderTime()
  {
    return this.merchantOrderTime;
  }
  
  public String getMerchantPublicCert()
  {
    return this.merchantPublicCert;
  }
  
  public String getMisc()
  {
    return this.misc;
  }
  
  public String getMobileNumber()
  {
    return this.mobileNumber;
  }
  
  public String getMsgExt()
  {
    return this.msgExt;
  }
  
  public String getPan()
  {
    return this.pan;
  }
  
  public String getPanBank()
  {
    return this.panBank;
  }
  
  public String getPanType()
  {
    return this.panType;
  }
  
  public String getRespCode()
  {
    return this.respCode;
  }
  
  public String getRespDesc()
  {
    return this.respDesc;
  }
  
  public String getSign()
  {
    return this.sign;
  }
  
  public String getSupportPanType()
  {
    return this.supportPanType;
  }
  
  public String getTransTimeout()
  {
    return this.transTimeout;
  }
  
  public String getUserTag()
  {
    return this.userTag;
  }
  
  public int hashCode()
  {
    int i20 = 0;
    int i21 = super.hashCode();
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
    label126:
    int i8;
    label136:
    int i9;
    label146:
    int i10;
    label156:
    int i11;
    label166:
    int i12;
    label176:
    int i13;
    label186:
    int i14;
    label196:
    int i15;
    label206:
    int i16;
    label216:
    int i17;
    label226:
    int i18;
    label236:
    int i19;
    if (this.backEndUrl == null)
    {
      i = 0;
      if (this.imei != null) {
        break label414;
      }
      j = 0;
      if (this.imsi != null) {
        break label425;
      }
      k = 0;
      if (this.lbs != null) {
        break label436;
      }
      m = 0;
      if (this.loginName != null) {
        break label448;
      }
      n = 0;
      if (this.mac != null) {
        break label460;
      }
      i1 = 0;
      if (this.merchantId != null) {
        break label472;
      }
      i2 = 0;
      if (this.merchantName != null) {
        break label484;
      }
      i3 = 0;
      if (this.merchantOrderAmt != null) {
        break label496;
      }
      i4 = 0;
      if (this.merchantOrderDesc != null) {
        break label508;
      }
      i5 = 0;
      if (this.merchantOrderId != null) {
        break label520;
      }
      i6 = 0;
      if (this.merchantOrderTime != null) {
        break label532;
      }
      i7 = 0;
      if (this.merchantPublicCert != null) {
        break label544;
      }
      i8 = 0;
      if (this.misc != null) {
        break label556;
      }
      i9 = 0;
      if (this.mobileNumber != null) {
        break label568;
      }
      i10 = 0;
      if (this.msgExt != null) {
        break label580;
      }
      i11 = 0;
      if (this.pan != null) {
        break label592;
      }
      i12 = 0;
      if (this.panBank != null) {
        break label604;
      }
      i13 = 0;
      if (this.panType != null) {
        break label616;
      }
      i14 = 0;
      if (this.respCode != null) {
        break label628;
      }
      i15 = 0;
      if (this.respDesc != null) {
        break label640;
      }
      i16 = 0;
      if (this.sign != null) {
        break label652;
      }
      i17 = 0;
      if (this.supportPanType != null) {
        break label664;
      }
      i18 = 0;
      if (this.transTimeout != null) {
        break label676;
      }
      i19 = 0;
      label246:
      if (this.userTag != null) {
        break label688;
      }
    }
    for (;;)
    {
      return (i19 + (i18 + (i17 + (i16 + (i15 + (i14 + (i13 + (i12 + (i11 + (i10 + (i9 + (i8 + (i7 + (i6 + (i5 + (i4 + (i3 + (i2 + (i1 + (n + (m + (k + (j + (i + i21 * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + i20;
      i = this.backEndUrl.hashCode();
      break;
      label414:
      j = this.imei.hashCode();
      break label27;
      label425:
      k = this.imsi.hashCode();
      break label36;
      label436:
      m = this.lbs.hashCode();
      break label46;
      label448:
      n = this.loginName.hashCode();
      break label56;
      label460:
      i1 = this.mac.hashCode();
      break label66;
      label472:
      i2 = this.merchantId.hashCode();
      break label76;
      label484:
      i3 = this.merchantName.hashCode();
      break label86;
      label496:
      i4 = this.merchantOrderAmt.hashCode();
      break label96;
      label508:
      i5 = this.merchantOrderDesc.hashCode();
      break label106;
      label520:
      i6 = this.merchantOrderId.hashCode();
      break label116;
      label532:
      i7 = this.merchantOrderTime.hashCode();
      break label126;
      label544:
      i8 = this.merchantPublicCert.hashCode();
      break label136;
      label556:
      i9 = this.misc.hashCode();
      break label146;
      label568:
      i10 = this.mobileNumber.hashCode();
      break label156;
      label580:
      i11 = this.msgExt.hashCode();
      break label166;
      label592:
      i12 = this.pan.hashCode();
      break label176;
      label604:
      i13 = this.panBank.hashCode();
      break label186;
      label616:
      i14 = this.panType.hashCode();
      break label196;
      label628:
      i15 = this.respCode.hashCode();
      break label206;
      label640:
      i16 = this.respDesc.hashCode();
      break label216;
      label652:
      i17 = this.sign.hashCode();
      break label226;
      label664:
      i18 = this.supportPanType.hashCode();
      break label236;
      label676:
      i19 = this.transTimeout.hashCode();
      break label246;
      label688:
      i20 = this.userTag.hashCode();
    }
  }
  
  public void setBackEndUrl(String paramString)
  {
    this.backEndUrl = paramString;
  }
  
  public void setImei(String paramString)
  {
    this.imei = paramString;
  }
  
  public void setImsi(String paramString)
  {
    this.imsi = paramString;
  }
  
  public void setLbs(String paramString)
  {
    this.lbs = paramString;
  }
  
  public void setLoginName(String paramString)
  {
    this.loginName = paramString;
  }
  
  public void setMac(String paramString)
  {
    this.mac = paramString;
  }
  
  public void setMerchantId(String paramString)
  {
    this.merchantId = paramString;
  }
  
  public void setMerchantName(String paramString)
  {
    this.merchantName = paramString;
  }
  
  public void setMerchantOrderAmt(String paramString)
  {
    this.merchantOrderAmt = paramString;
  }
  
  public void setMerchantOrderDesc(String paramString)
  {
    this.merchantOrderDesc = paramString;
  }
  
  public void setMerchantOrderId(String paramString)
  {
    this.merchantOrderId = paramString;
  }
  
  public void setMerchantOrderTime(String paramString)
  {
    this.merchantOrderTime = paramString;
  }
  
  public void setMerchantPublicCert(String paramString)
  {
    this.merchantPublicCert = paramString;
  }
  
  public void setMisc(String paramString)
  {
    this.misc = paramString;
  }
  
  public void setMobileNumber(String paramString)
  {
    this.mobileNumber = paramString;
  }
  
  public void setMsgExt(String paramString)
  {
    this.msgExt = paramString;
  }
  
  public void setPan(String paramString)
  {
    this.pan = paramString;
  }
  
  public void setPanBank(String paramString)
  {
    this.panBank = paramString;
  }
  
  public void setPanType(String paramString)
  {
    this.panType = paramString;
  }
  
  public void setRespCode(String paramString)
  {
    this.respCode = paramString;
  }
  
  public void setRespDesc(String paramString)
  {
    this.respDesc = paramString;
  }
  
  public void setSign(String paramString)
  {
    this.sign = paramString;
  }
  
  public void setSupportPanType(String paramString)
  {
    this.supportPanType = paramString;
  }
  
  public void setTransTimeout(String paramString)
  {
    this.transTimeout = paramString;
  }
  
  public void setUserTag(String paramString)
  {
    this.userTag = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\http\objects\CheckOrder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */