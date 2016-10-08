package com.payeco.android.plugin.http.objects;

public class CommonPayValidation
  extends PluginObject
{
  private String backEndUrl;
  private String converRate;
  private String cupsQid;
  private String cupsRespCode;
  private String cupsTraceNum;
  private String cupsTraceTime;
  private String cvn2;
  private String imei;
  private String imsi;
  private String ivrTag;
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
  private String mobileMac;
  private String mobileNumber;
  private String msgExt;
  private String pan;
  private String panBank;
  private String panDate;
  private String panType;
  private String password;
  private String payType;
  private String pin;
  private String respCode;
  private String respDesc;
  private String setlAmt;
  private String setlCurrency;
  private String settleDate;
  private String sign;
  private String transTimeout;
  private String userTag;
  private String validateCode;
  
  public CommonPayValidation() {}
  
  public CommonPayValidation(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11, String paramString12, String paramString13, String paramString14, String paramString15, String paramString16, String paramString17, String paramString18, String paramString19, String paramString20, String paramString21, String paramString22, String paramString23, String paramString24, String paramString25, String paramString26, String paramString27, String paramString28, String paramString29, String paramString30, String paramString31, String paramString32, String paramString33, String paramString34, String paramString35, String paramString36, String paramString37, String paramString38, String paramString39, String paramString40)
  {
    this.payType = paramString1;
    this.loginName = paramString2;
    this.password = paramString3;
    this.lbs = paramString4;
    this.imsi = paramString5;
    this.imei = paramString6;
    this.mac = paramString7;
    this.userTag = paramString8;
    this.ivrTag = paramString9;
    this.mobileNumber = paramString10;
    this.mobileMac = paramString11;
    this.validateCode = paramString12;
    this.pan = paramString13;
    this.panType = paramString14;
    this.panBank = paramString15;
    this.pin = paramString16;
    this.panDate = paramString17;
    this.cvn2 = paramString18;
    this.merchantName = paramString19;
    this.merchantId = paramString20;
    this.merchantOrderId = paramString21;
    this.merchantOrderTime = paramString22;
    this.merchantOrderAmt = paramString23;
    this.merchantOrderDesc = paramString24;
    this.transTimeout = paramString25;
    this.backEndUrl = paramString26;
    this.sign = paramString27;
    this.merchantPublicCert = paramString28;
    this.msgExt = paramString29;
    this.misc = paramString30;
    this.settleDate = paramString31;
    this.setlAmt = paramString32;
    this.setlCurrency = paramString33;
    this.converRate = paramString34;
    this.cupsQid = paramString35;
    this.cupsTraceNum = paramString36;
    this.cupsTraceTime = paramString37;
    this.cupsRespCode = paramString38;
    this.respCode = paramString39;
    this.respDesc = paramString40;
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
        paramObject = (CommonPayValidation)paramObject;
        if (this.backEndUrl == null)
        {
          if (((CommonPayValidation)paramObject).backEndUrl != null) {
            return false;
          }
        }
        else if (!this.backEndUrl.equals(((CommonPayValidation)paramObject).backEndUrl)) {
          return false;
        }
        if (this.converRate == null)
        {
          if (((CommonPayValidation)paramObject).converRate != null) {
            return false;
          }
        }
        else if (!this.converRate.equals(((CommonPayValidation)paramObject).converRate)) {
          return false;
        }
        if (this.cupsQid == null)
        {
          if (((CommonPayValidation)paramObject).cupsQid != null) {
            return false;
          }
        }
        else if (!this.cupsQid.equals(((CommonPayValidation)paramObject).cupsQid)) {
          return false;
        }
        if (this.cupsRespCode == null)
        {
          if (((CommonPayValidation)paramObject).cupsRespCode != null) {
            return false;
          }
        }
        else if (!this.cupsRespCode.equals(((CommonPayValidation)paramObject).cupsRespCode)) {
          return false;
        }
        if (this.cupsTraceNum == null)
        {
          if (((CommonPayValidation)paramObject).cupsTraceNum != null) {
            return false;
          }
        }
        else if (!this.cupsTraceNum.equals(((CommonPayValidation)paramObject).cupsTraceNum)) {
          return false;
        }
        if (this.cupsTraceTime == null)
        {
          if (((CommonPayValidation)paramObject).cupsTraceTime != null) {
            return false;
          }
        }
        else if (!this.cupsTraceTime.equals(((CommonPayValidation)paramObject).cupsTraceTime)) {
          return false;
        }
        if (this.cvn2 == null)
        {
          if (((CommonPayValidation)paramObject).cvn2 != null) {
            return false;
          }
        }
        else if (!this.cvn2.equals(((CommonPayValidation)paramObject).cvn2)) {
          return false;
        }
        if (this.imei == null)
        {
          if (((CommonPayValidation)paramObject).imei != null) {
            return false;
          }
        }
        else if (!this.imei.equals(((CommonPayValidation)paramObject).imei)) {
          return false;
        }
        if (this.imsi == null)
        {
          if (((CommonPayValidation)paramObject).imsi != null) {
            return false;
          }
        }
        else if (!this.imsi.equals(((CommonPayValidation)paramObject).imsi)) {
          return false;
        }
        if (this.ivrTag == null)
        {
          if (((CommonPayValidation)paramObject).ivrTag != null) {
            return false;
          }
        }
        else if (!this.ivrTag.equals(((CommonPayValidation)paramObject).ivrTag)) {
          return false;
        }
        if (this.lbs == null)
        {
          if (((CommonPayValidation)paramObject).lbs != null) {
            return false;
          }
        }
        else if (!this.lbs.equals(((CommonPayValidation)paramObject).lbs)) {
          return false;
        }
        if (this.loginName == null)
        {
          if (((CommonPayValidation)paramObject).loginName != null) {
            return false;
          }
        }
        else if (!this.loginName.equals(((CommonPayValidation)paramObject).loginName)) {
          return false;
        }
        if (this.mac == null)
        {
          if (((CommonPayValidation)paramObject).mac != null) {
            return false;
          }
        }
        else if (!this.mac.equals(((CommonPayValidation)paramObject).mac)) {
          return false;
        }
        if (this.merchantId == null)
        {
          if (((CommonPayValidation)paramObject).merchantId != null) {
            return false;
          }
        }
        else if (!this.merchantId.equals(((CommonPayValidation)paramObject).merchantId)) {
          return false;
        }
        if (this.merchantName == null)
        {
          if (((CommonPayValidation)paramObject).merchantName != null) {
            return false;
          }
        }
        else if (!this.merchantName.equals(((CommonPayValidation)paramObject).merchantName)) {
          return false;
        }
        if (this.merchantOrderAmt == null)
        {
          if (((CommonPayValidation)paramObject).merchantOrderAmt != null) {
            return false;
          }
        }
        else if (!this.merchantOrderAmt.equals(((CommonPayValidation)paramObject).merchantOrderAmt)) {
          return false;
        }
        if (this.merchantOrderDesc == null)
        {
          if (((CommonPayValidation)paramObject).merchantOrderDesc != null) {
            return false;
          }
        }
        else if (!this.merchantOrderDesc.equals(((CommonPayValidation)paramObject).merchantOrderDesc)) {
          return false;
        }
        if (this.merchantOrderId == null)
        {
          if (((CommonPayValidation)paramObject).merchantOrderId != null) {
            return false;
          }
        }
        else if (!this.merchantOrderId.equals(((CommonPayValidation)paramObject).merchantOrderId)) {
          return false;
        }
        if (this.merchantOrderTime == null)
        {
          if (((CommonPayValidation)paramObject).merchantOrderTime != null) {
            return false;
          }
        }
        else if (!this.merchantOrderTime.equals(((CommonPayValidation)paramObject).merchantOrderTime)) {
          return false;
        }
        if (this.merchantPublicCert == null)
        {
          if (((CommonPayValidation)paramObject).merchantPublicCert != null) {
            return false;
          }
        }
        else if (!this.merchantPublicCert.equals(((CommonPayValidation)paramObject).merchantPublicCert)) {
          return false;
        }
        if (this.misc == null)
        {
          if (((CommonPayValidation)paramObject).misc != null) {
            return false;
          }
        }
        else if (!this.misc.equals(((CommonPayValidation)paramObject).misc)) {
          return false;
        }
        if (this.mobileMac == null)
        {
          if (((CommonPayValidation)paramObject).mobileMac != null) {
            return false;
          }
        }
        else if (!this.mobileMac.equals(((CommonPayValidation)paramObject).mobileMac)) {
          return false;
        }
        if (this.mobileNumber == null)
        {
          if (((CommonPayValidation)paramObject).mobileNumber != null) {
            return false;
          }
        }
        else if (!this.mobileNumber.equals(((CommonPayValidation)paramObject).mobileNumber)) {
          return false;
        }
        if (this.msgExt == null)
        {
          if (((CommonPayValidation)paramObject).msgExt != null) {
            return false;
          }
        }
        else if (!this.msgExt.equals(((CommonPayValidation)paramObject).msgExt)) {
          return false;
        }
        if (this.pan == null)
        {
          if (((CommonPayValidation)paramObject).pan != null) {
            return false;
          }
        }
        else if (!this.pan.equals(((CommonPayValidation)paramObject).pan)) {
          return false;
        }
        if (this.panBank == null)
        {
          if (((CommonPayValidation)paramObject).panBank != null) {
            return false;
          }
        }
        else if (!this.panBank.equals(((CommonPayValidation)paramObject).panBank)) {
          return false;
        }
        if (this.panDate == null)
        {
          if (((CommonPayValidation)paramObject).panDate != null) {
            return false;
          }
        }
        else if (!this.panDate.equals(((CommonPayValidation)paramObject).panDate)) {
          return false;
        }
        if (this.panType == null)
        {
          if (((CommonPayValidation)paramObject).panType != null) {
            return false;
          }
        }
        else if (!this.panType.equals(((CommonPayValidation)paramObject).panType)) {
          return false;
        }
        if (this.password == null)
        {
          if (((CommonPayValidation)paramObject).password != null) {
            return false;
          }
        }
        else if (!this.password.equals(((CommonPayValidation)paramObject).password)) {
          return false;
        }
        if (this.payType == null)
        {
          if (((CommonPayValidation)paramObject).payType != null) {
            return false;
          }
        }
        else if (!this.payType.equals(((CommonPayValidation)paramObject).payType)) {
          return false;
        }
        if (this.pin == null)
        {
          if (((CommonPayValidation)paramObject).pin != null) {
            return false;
          }
        }
        else if (!this.pin.equals(((CommonPayValidation)paramObject).pin)) {
          return false;
        }
        if (this.respCode == null)
        {
          if (((CommonPayValidation)paramObject).respCode != null) {
            return false;
          }
        }
        else if (!this.respCode.equals(((CommonPayValidation)paramObject).respCode)) {
          return false;
        }
        if (this.respDesc == null)
        {
          if (((CommonPayValidation)paramObject).respDesc != null) {
            return false;
          }
        }
        else if (!this.respDesc.equals(((CommonPayValidation)paramObject).respDesc)) {
          return false;
        }
        if (this.setlAmt == null)
        {
          if (((CommonPayValidation)paramObject).setlAmt != null) {
            return false;
          }
        }
        else if (!this.setlAmt.equals(((CommonPayValidation)paramObject).setlAmt)) {
          return false;
        }
        if (this.setlCurrency == null)
        {
          if (((CommonPayValidation)paramObject).setlCurrency != null) {
            return false;
          }
        }
        else if (!this.setlCurrency.equals(((CommonPayValidation)paramObject).setlCurrency)) {
          return false;
        }
        if (this.settleDate == null)
        {
          if (((CommonPayValidation)paramObject).settleDate != null) {
            return false;
          }
        }
        else if (!this.settleDate.equals(((CommonPayValidation)paramObject).settleDate)) {
          return false;
        }
        if (this.sign == null)
        {
          if (((CommonPayValidation)paramObject).sign != null) {
            return false;
          }
        }
        else if (!this.sign.equals(((CommonPayValidation)paramObject).sign)) {
          return false;
        }
        if (this.transTimeout == null)
        {
          if (((CommonPayValidation)paramObject).transTimeout != null) {
            return false;
          }
        }
        else if (!this.transTimeout.equals(((CommonPayValidation)paramObject).transTimeout)) {
          return false;
        }
        if (this.userTag == null)
        {
          if (((CommonPayValidation)paramObject).userTag != null) {
            return false;
          }
        }
        else if (!this.userTag.equals(((CommonPayValidation)paramObject).userTag)) {
          return false;
        }
        if (this.validateCode != null) {
          break;
        }
      } while (((CommonPayValidation)paramObject).validateCode == null);
      return false;
    } while (this.validateCode.equals(((CommonPayValidation)paramObject).validateCode));
    return false;
  }
  
  public String getBackEndUrl()
  {
    return this.backEndUrl;
  }
  
  public String getConverRate()
  {
    return this.converRate;
  }
  
  public String getCupsQid()
  {
    return this.cupsQid;
  }
  
  public String getCupsRespCode()
  {
    return this.cupsRespCode;
  }
  
  public String getCupsTraceNum()
  {
    return this.cupsTraceNum;
  }
  
  public String getCupsTraceTime()
  {
    return this.cupsTraceTime;
  }
  
  public String getCvn2()
  {
    return this.cvn2;
  }
  
  public String getImei()
  {
    return this.imei;
  }
  
  public String getImsi()
  {
    return this.imsi;
  }
  
  public String getIvrTag()
  {
    return this.ivrTag;
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
  
  public String getMobileMac()
  {
    return this.mobileMac;
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
  
  public String getPanDate()
  {
    return this.panDate;
  }
  
  public String getPanType()
  {
    return this.panType;
  }
  
  public String getPassword()
  {
    return this.password;
  }
  
  public String getPayType()
  {
    return this.payType;
  }
  
  public String getPin()
  {
    return this.pin;
  }
  
  public String getRespCode()
  {
    return this.respCode;
  }
  
  public String getRespDesc()
  {
    return this.respDesc;
  }
  
  public String getSetlAmt()
  {
    return this.setlAmt;
  }
  
  public String getSetlCurrency()
  {
    return this.setlCurrency;
  }
  
  public String getSettleDate()
  {
    return this.settleDate;
  }
  
  public String getSign()
  {
    return this.sign;
  }
  
  public String getTransTimeout()
  {
    return this.transTimeout;
  }
  
  public String getUserTag()
  {
    return this.userTag;
  }
  
  public String getValidateCode()
  {
    return this.validateCode;
  }
  
  public int hashCode()
  {
    int i35 = 0;
    int i36 = super.hashCode();
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
    label246:
    int i20;
    label256:
    int i21;
    label266:
    int i22;
    label276:
    int i23;
    label286:
    int i24;
    label296:
    int i25;
    label306:
    int i26;
    label316:
    int i27;
    label326:
    int i28;
    label336:
    int i29;
    label346:
    int i30;
    label356:
    int i31;
    label366:
    int i32;
    label376:
    int i33;
    label386:
    int i34;
    if (this.backEndUrl == null)
    {
      i = 0;
      if (this.converRate != null) {
        break label654;
      }
      j = 0;
      if (this.cupsQid != null) {
        break label665;
      }
      k = 0;
      if (this.cupsRespCode != null) {
        break label676;
      }
      m = 0;
      if (this.cupsTraceNum != null) {
        break label688;
      }
      n = 0;
      if (this.cupsTraceTime != null) {
        break label700;
      }
      i1 = 0;
      if (this.cvn2 != null) {
        break label712;
      }
      i2 = 0;
      if (this.imei != null) {
        break label724;
      }
      i3 = 0;
      if (this.imsi != null) {
        break label736;
      }
      i4 = 0;
      if (this.ivrTag != null) {
        break label748;
      }
      i5 = 0;
      if (this.lbs != null) {
        break label760;
      }
      i6 = 0;
      if (this.loginName != null) {
        break label772;
      }
      i7 = 0;
      if (this.mac != null) {
        break label784;
      }
      i8 = 0;
      if (this.merchantId != null) {
        break label796;
      }
      i9 = 0;
      if (this.merchantName != null) {
        break label808;
      }
      i10 = 0;
      if (this.merchantOrderAmt != null) {
        break label820;
      }
      i11 = 0;
      if (this.merchantOrderDesc != null) {
        break label832;
      }
      i12 = 0;
      if (this.merchantOrderId != null) {
        break label844;
      }
      i13 = 0;
      if (this.merchantOrderTime != null) {
        break label856;
      }
      i14 = 0;
      if (this.merchantPublicCert != null) {
        break label868;
      }
      i15 = 0;
      if (this.misc != null) {
        break label880;
      }
      i16 = 0;
      if (this.mobileMac != null) {
        break label892;
      }
      i17 = 0;
      if (this.mobileNumber != null) {
        break label904;
      }
      i18 = 0;
      if (this.msgExt != null) {
        break label916;
      }
      i19 = 0;
      if (this.pan != null) {
        break label928;
      }
      i20 = 0;
      if (this.panBank != null) {
        break label940;
      }
      i21 = 0;
      if (this.panDate != null) {
        break label952;
      }
      i22 = 0;
      if (this.panType != null) {
        break label964;
      }
      i23 = 0;
      if (this.password != null) {
        break label976;
      }
      i24 = 0;
      if (this.payType != null) {
        break label988;
      }
      i25 = 0;
      if (this.pin != null) {
        break label1000;
      }
      i26 = 0;
      if (this.respCode != null) {
        break label1012;
      }
      i27 = 0;
      if (this.respDesc != null) {
        break label1024;
      }
      i28 = 0;
      if (this.setlAmt != null) {
        break label1036;
      }
      i29 = 0;
      if (this.setlCurrency != null) {
        break label1048;
      }
      i30 = 0;
      if (this.settleDate != null) {
        break label1060;
      }
      i31 = 0;
      if (this.sign != null) {
        break label1072;
      }
      i32 = 0;
      if (this.transTimeout != null) {
        break label1084;
      }
      i33 = 0;
      if (this.userTag != null) {
        break label1096;
      }
      i34 = 0;
      label396:
      if (this.validateCode != null) {
        break label1108;
      }
    }
    for (;;)
    {
      return (i34 + (i33 + (i32 + (i31 + (i30 + (i29 + (i28 + (i27 + (i26 + (i25 + (i24 + (i23 + (i22 + (i21 + (i20 + (i19 + (i18 + (i17 + (i16 + (i15 + (i14 + (i13 + (i12 + (i11 + (i10 + (i9 + (i8 + (i7 + (i6 + (i5 + (i4 + (i3 + (i2 + (i1 + (n + (m + (k + (j + (i + i36 * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + i35;
      i = this.backEndUrl.hashCode();
      break;
      label654:
      j = this.converRate.hashCode();
      break label27;
      label665:
      k = this.cupsQid.hashCode();
      break label36;
      label676:
      m = this.cupsRespCode.hashCode();
      break label46;
      label688:
      n = this.cupsTraceNum.hashCode();
      break label56;
      label700:
      i1 = this.cupsTraceTime.hashCode();
      break label66;
      label712:
      i2 = this.cvn2.hashCode();
      break label76;
      label724:
      i3 = this.imei.hashCode();
      break label86;
      label736:
      i4 = this.imsi.hashCode();
      break label96;
      label748:
      i5 = this.ivrTag.hashCode();
      break label106;
      label760:
      i6 = this.lbs.hashCode();
      break label116;
      label772:
      i7 = this.loginName.hashCode();
      break label126;
      label784:
      i8 = this.mac.hashCode();
      break label136;
      label796:
      i9 = this.merchantId.hashCode();
      break label146;
      label808:
      i10 = this.merchantName.hashCode();
      break label156;
      label820:
      i11 = this.merchantOrderAmt.hashCode();
      break label166;
      label832:
      i12 = this.merchantOrderDesc.hashCode();
      break label176;
      label844:
      i13 = this.merchantOrderId.hashCode();
      break label186;
      label856:
      i14 = this.merchantOrderTime.hashCode();
      break label196;
      label868:
      i15 = this.merchantPublicCert.hashCode();
      break label206;
      label880:
      i16 = this.misc.hashCode();
      break label216;
      label892:
      i17 = this.mobileMac.hashCode();
      break label226;
      label904:
      i18 = this.mobileNumber.hashCode();
      break label236;
      label916:
      i19 = this.msgExt.hashCode();
      break label246;
      label928:
      i20 = this.pan.hashCode();
      break label256;
      label940:
      i21 = this.panBank.hashCode();
      break label266;
      label952:
      i22 = this.panDate.hashCode();
      break label276;
      label964:
      i23 = this.panType.hashCode();
      break label286;
      label976:
      i24 = this.password.hashCode();
      break label296;
      label988:
      i25 = this.payType.hashCode();
      break label306;
      label1000:
      i26 = this.pin.hashCode();
      break label316;
      label1012:
      i27 = this.respCode.hashCode();
      break label326;
      label1024:
      i28 = this.respDesc.hashCode();
      break label336;
      label1036:
      i29 = this.setlAmt.hashCode();
      break label346;
      label1048:
      i30 = this.setlCurrency.hashCode();
      break label356;
      label1060:
      i31 = this.settleDate.hashCode();
      break label366;
      label1072:
      i32 = this.sign.hashCode();
      break label376;
      label1084:
      i33 = this.transTimeout.hashCode();
      break label386;
      label1096:
      i34 = this.userTag.hashCode();
      break label396;
      label1108:
      i35 = this.validateCode.hashCode();
    }
  }
  
  public void setBackEndUrl(String paramString)
  {
    this.backEndUrl = paramString;
  }
  
  public void setConverRate(String paramString)
  {
    this.converRate = paramString;
  }
  
  public void setCupsQid(String paramString)
  {
    this.cupsQid = paramString;
  }
  
  public void setCupsRespCode(String paramString)
  {
    this.cupsRespCode = paramString;
  }
  
  public void setCupsTraceNum(String paramString)
  {
    this.cupsTraceNum = paramString;
  }
  
  public void setCupsTraceTime(String paramString)
  {
    this.cupsTraceTime = paramString;
  }
  
  public void setCvn2(String paramString)
  {
    this.cvn2 = paramString;
  }
  
  public void setImei(String paramString)
  {
    this.imei = paramString;
  }
  
  public void setImsi(String paramString)
  {
    this.imsi = paramString;
  }
  
  public void setIvrTag(String paramString)
  {
    this.ivrTag = paramString;
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
  
  public void setMobileMac(String paramString)
  {
    this.mobileMac = paramString;
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
  
  public void setPanDate(String paramString)
  {
    this.panDate = paramString;
  }
  
  public void setPanType(String paramString)
  {
    this.panType = paramString;
  }
  
  public void setPassword(String paramString)
  {
    this.password = paramString;
  }
  
  public void setPayType(String paramString)
  {
    this.payType = paramString;
  }
  
  public void setPin(String paramString)
  {
    this.pin = paramString;
  }
  
  public void setRespCode(String paramString)
  {
    this.respCode = paramString;
  }
  
  public void setRespDesc(String paramString)
  {
    this.respDesc = paramString;
  }
  
  public void setSetlAmt(String paramString)
  {
    this.setlAmt = paramString;
  }
  
  public void setSetlCurrency(String paramString)
  {
    this.setlCurrency = paramString;
  }
  
  public void setSettleDate(String paramString)
  {
    this.settleDate = paramString;
  }
  
  public void setSign(String paramString)
  {
    this.sign = paramString;
  }
  
  public void setTransTimeout(String paramString)
  {
    this.transTimeout = paramString;
  }
  
  public void setUserTag(String paramString)
  {
    this.userTag = paramString;
  }
  
  public void setValidateCode(String paramString)
  {
    this.validateCode = paramString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\http\objects\CommonPayValidation.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */