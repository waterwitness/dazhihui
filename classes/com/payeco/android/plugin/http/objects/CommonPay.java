package com.payeco.android.plugin.http.objects;

public class CommonPay
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
  
  public CommonPay() {}
  
  public CommonPay(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11, String paramString12, String paramString13, String paramString14, String paramString15, String paramString16, String paramString17, String paramString18, String paramString19, String paramString20, String paramString21, String paramString22, String paramString23, String paramString24, String paramString25, String paramString26, String paramString27, String paramString28, String paramString29, String paramString30, String paramString31, String paramString32, String paramString33, String paramString34, String paramString35, String paramString36, String paramString37, String paramString38, String paramString39)
  {
    this.payType = paramString1;
    this.panType = paramString2;
    this.loginName = paramString3;
    this.password = paramString4;
    this.lbs = paramString5;
    this.imsi = paramString6;
    this.imei = paramString7;
    this.mac = paramString8;
    this.mobileNumber = paramString9;
    this.mobileMac = paramString10;
    this.validateCode = paramString11;
    this.pan = paramString12;
    this.pin = paramString13;
    this.panDate = paramString14;
    this.cvn2 = paramString15;
    this.userTag = paramString16;
    this.ivrTag = paramString17;
    this.merchantName = paramString18;
    this.merchantId = paramString19;
    this.merchantOrderId = paramString20;
    this.merchantOrderTime = paramString21;
    this.merchantOrderAmt = paramString22;
    this.merchantOrderDesc = paramString23;
    this.transTimeout = paramString24;
    this.backEndUrl = paramString25;
    this.sign = paramString26;
    this.merchantPublicCert = paramString27;
    this.msgExt = paramString28;
    this.misc = paramString29;
    this.settleDate = paramString30;
    this.setlAmt = paramString31;
    this.setlCurrency = paramString32;
    this.converRate = paramString33;
    this.cupsQid = paramString34;
    this.cupsTraceNum = paramString35;
    this.cupsTraceTime = paramString36;
    this.cupsRespCode = paramString37;
    this.respCode = paramString38;
    this.respDesc = paramString39;
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
        paramObject = (CommonPay)paramObject;
        if (this.backEndUrl == null)
        {
          if (((CommonPay)paramObject).backEndUrl != null) {
            return false;
          }
        }
        else if (!this.backEndUrl.equals(((CommonPay)paramObject).backEndUrl)) {
          return false;
        }
        if (this.converRate == null)
        {
          if (((CommonPay)paramObject).converRate != null) {
            return false;
          }
        }
        else if (!this.converRate.equals(((CommonPay)paramObject).converRate)) {
          return false;
        }
        if (this.cupsQid == null)
        {
          if (((CommonPay)paramObject).cupsQid != null) {
            return false;
          }
        }
        else if (!this.cupsQid.equals(((CommonPay)paramObject).cupsQid)) {
          return false;
        }
        if (this.cupsRespCode == null)
        {
          if (((CommonPay)paramObject).cupsRespCode != null) {
            return false;
          }
        }
        else if (!this.cupsRespCode.equals(((CommonPay)paramObject).cupsRespCode)) {
          return false;
        }
        if (this.cupsTraceNum == null)
        {
          if (((CommonPay)paramObject).cupsTraceNum != null) {
            return false;
          }
        }
        else if (!this.cupsTraceNum.equals(((CommonPay)paramObject).cupsTraceNum)) {
          return false;
        }
        if (this.cupsTraceTime == null)
        {
          if (((CommonPay)paramObject).cupsTraceTime != null) {
            return false;
          }
        }
        else if (!this.cupsTraceTime.equals(((CommonPay)paramObject).cupsTraceTime)) {
          return false;
        }
        if (this.cvn2 == null)
        {
          if (((CommonPay)paramObject).cvn2 != null) {
            return false;
          }
        }
        else if (!this.cvn2.equals(((CommonPay)paramObject).cvn2)) {
          return false;
        }
        if (this.imei == null)
        {
          if (((CommonPay)paramObject).imei != null) {
            return false;
          }
        }
        else if (!this.imei.equals(((CommonPay)paramObject).imei)) {
          return false;
        }
        if (this.imsi == null)
        {
          if (((CommonPay)paramObject).imsi != null) {
            return false;
          }
        }
        else if (!this.imsi.equals(((CommonPay)paramObject).imsi)) {
          return false;
        }
        if (this.ivrTag == null)
        {
          if (((CommonPay)paramObject).ivrTag != null) {
            return false;
          }
        }
        else if (!this.ivrTag.equals(((CommonPay)paramObject).ivrTag)) {
          return false;
        }
        if (this.lbs == null)
        {
          if (((CommonPay)paramObject).lbs != null) {
            return false;
          }
        }
        else if (!this.lbs.equals(((CommonPay)paramObject).lbs)) {
          return false;
        }
        if (this.loginName == null)
        {
          if (((CommonPay)paramObject).loginName != null) {
            return false;
          }
        }
        else if (!this.loginName.equals(((CommonPay)paramObject).loginName)) {
          return false;
        }
        if (this.mac == null)
        {
          if (((CommonPay)paramObject).mac != null) {
            return false;
          }
        }
        else if (!this.mac.equals(((CommonPay)paramObject).mac)) {
          return false;
        }
        if (this.merchantId == null)
        {
          if (((CommonPay)paramObject).merchantId != null) {
            return false;
          }
        }
        else if (!this.merchantId.equals(((CommonPay)paramObject).merchantId)) {
          return false;
        }
        if (this.merchantName == null)
        {
          if (((CommonPay)paramObject).merchantName != null) {
            return false;
          }
        }
        else if (!this.merchantName.equals(((CommonPay)paramObject).merchantName)) {
          return false;
        }
        if (this.merchantOrderAmt == null)
        {
          if (((CommonPay)paramObject).merchantOrderAmt != null) {
            return false;
          }
        }
        else if (!this.merchantOrderAmt.equals(((CommonPay)paramObject).merchantOrderAmt)) {
          return false;
        }
        if (this.merchantOrderDesc == null)
        {
          if (((CommonPay)paramObject).merchantOrderDesc != null) {
            return false;
          }
        }
        else if (!this.merchantOrderDesc.equals(((CommonPay)paramObject).merchantOrderDesc)) {
          return false;
        }
        if (this.merchantOrderId == null)
        {
          if (((CommonPay)paramObject).merchantOrderId != null) {
            return false;
          }
        }
        else if (!this.merchantOrderId.equals(((CommonPay)paramObject).merchantOrderId)) {
          return false;
        }
        if (this.merchantOrderTime == null)
        {
          if (((CommonPay)paramObject).merchantOrderTime != null) {
            return false;
          }
        }
        else if (!this.merchantOrderTime.equals(((CommonPay)paramObject).merchantOrderTime)) {
          return false;
        }
        if (this.merchantPublicCert == null)
        {
          if (((CommonPay)paramObject).merchantPublicCert != null) {
            return false;
          }
        }
        else if (!this.merchantPublicCert.equals(((CommonPay)paramObject).merchantPublicCert)) {
          return false;
        }
        if (this.misc == null)
        {
          if (((CommonPay)paramObject).misc != null) {
            return false;
          }
        }
        else if (!this.misc.equals(((CommonPay)paramObject).misc)) {
          return false;
        }
        if (this.mobileMac == null)
        {
          if (((CommonPay)paramObject).mobileMac != null) {
            return false;
          }
        }
        else if (!this.mobileMac.equals(((CommonPay)paramObject).mobileMac)) {
          return false;
        }
        if (this.mobileNumber == null)
        {
          if (((CommonPay)paramObject).mobileNumber != null) {
            return false;
          }
        }
        else if (!this.mobileNumber.equals(((CommonPay)paramObject).mobileNumber)) {
          return false;
        }
        if (this.msgExt == null)
        {
          if (((CommonPay)paramObject).msgExt != null) {
            return false;
          }
        }
        else if (!this.msgExt.equals(((CommonPay)paramObject).msgExt)) {
          return false;
        }
        if (this.pan == null)
        {
          if (((CommonPay)paramObject).pan != null) {
            return false;
          }
        }
        else if (!this.pan.equals(((CommonPay)paramObject).pan)) {
          return false;
        }
        if (this.panDate == null)
        {
          if (((CommonPay)paramObject).panDate != null) {
            return false;
          }
        }
        else if (!this.panDate.equals(((CommonPay)paramObject).panDate)) {
          return false;
        }
        if (this.panType == null)
        {
          if (((CommonPay)paramObject).panType != null) {
            return false;
          }
        }
        else if (!this.panType.equals(((CommonPay)paramObject).panType)) {
          return false;
        }
        if (this.password == null)
        {
          if (((CommonPay)paramObject).password != null) {
            return false;
          }
        }
        else if (!this.password.equals(((CommonPay)paramObject).password)) {
          return false;
        }
        if (this.payType == null)
        {
          if (((CommonPay)paramObject).payType != null) {
            return false;
          }
        }
        else if (!this.payType.equals(((CommonPay)paramObject).payType)) {
          return false;
        }
        if (this.pin == null)
        {
          if (((CommonPay)paramObject).pin != null) {
            return false;
          }
        }
        else if (!this.pin.equals(((CommonPay)paramObject).pin)) {
          return false;
        }
        if (this.respCode == null)
        {
          if (((CommonPay)paramObject).respCode != null) {
            return false;
          }
        }
        else if (!this.respCode.equals(((CommonPay)paramObject).respCode)) {
          return false;
        }
        if (this.respDesc == null)
        {
          if (((CommonPay)paramObject).respDesc != null) {
            return false;
          }
        }
        else if (!this.respDesc.equals(((CommonPay)paramObject).respDesc)) {
          return false;
        }
        if (this.setlAmt == null)
        {
          if (((CommonPay)paramObject).setlAmt != null) {
            return false;
          }
        }
        else if (!this.setlAmt.equals(((CommonPay)paramObject).setlAmt)) {
          return false;
        }
        if (this.setlCurrency == null)
        {
          if (((CommonPay)paramObject).setlCurrency != null) {
            return false;
          }
        }
        else if (!this.setlCurrency.equals(((CommonPay)paramObject).setlCurrency)) {
          return false;
        }
        if (this.settleDate == null)
        {
          if (((CommonPay)paramObject).settleDate != null) {
            return false;
          }
        }
        else if (!this.settleDate.equals(((CommonPay)paramObject).settleDate)) {
          return false;
        }
        if (this.sign == null)
        {
          if (((CommonPay)paramObject).sign != null) {
            return false;
          }
        }
        else if (!this.sign.equals(((CommonPay)paramObject).sign)) {
          return false;
        }
        if (this.transTimeout == null)
        {
          if (((CommonPay)paramObject).transTimeout != null) {
            return false;
          }
        }
        else if (!this.transTimeout.equals(((CommonPay)paramObject).transTimeout)) {
          return false;
        }
        if (this.userTag == null)
        {
          if (((CommonPay)paramObject).userTag != null) {
            return false;
          }
        }
        else if (!this.userTag.equals(((CommonPay)paramObject).userTag)) {
          return false;
        }
        if (this.validateCode != null) {
          break;
        }
      } while (((CommonPay)paramObject).validateCode == null);
      return false;
    } while (this.validateCode.equals(((CommonPay)paramObject).validateCode));
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
    int i34 = 0;
    int i35 = super.hashCode();
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
    if (this.backEndUrl == null)
    {
      i = 0;
      if (this.converRate != null) {
        break label638;
      }
      j = 0;
      if (this.cupsQid != null) {
        break label649;
      }
      k = 0;
      if (this.cupsRespCode != null) {
        break label660;
      }
      m = 0;
      if (this.cupsTraceNum != null) {
        break label672;
      }
      n = 0;
      if (this.cupsTraceTime != null) {
        break label684;
      }
      i1 = 0;
      if (this.cvn2 != null) {
        break label696;
      }
      i2 = 0;
      if (this.imei != null) {
        break label708;
      }
      i3 = 0;
      if (this.imsi != null) {
        break label720;
      }
      i4 = 0;
      if (this.ivrTag != null) {
        break label732;
      }
      i5 = 0;
      if (this.lbs != null) {
        break label744;
      }
      i6 = 0;
      if (this.loginName != null) {
        break label756;
      }
      i7 = 0;
      if (this.mac != null) {
        break label768;
      }
      i8 = 0;
      if (this.merchantId != null) {
        break label780;
      }
      i9 = 0;
      if (this.merchantName != null) {
        break label792;
      }
      i10 = 0;
      if (this.merchantOrderAmt != null) {
        break label804;
      }
      i11 = 0;
      if (this.merchantOrderDesc != null) {
        break label816;
      }
      i12 = 0;
      if (this.merchantOrderId != null) {
        break label828;
      }
      i13 = 0;
      if (this.merchantOrderTime != null) {
        break label840;
      }
      i14 = 0;
      if (this.merchantPublicCert != null) {
        break label852;
      }
      i15 = 0;
      if (this.misc != null) {
        break label864;
      }
      i16 = 0;
      if (this.mobileMac != null) {
        break label876;
      }
      i17 = 0;
      if (this.mobileNumber != null) {
        break label888;
      }
      i18 = 0;
      if (this.msgExt != null) {
        break label900;
      }
      i19 = 0;
      if (this.pan != null) {
        break label912;
      }
      i20 = 0;
      if (this.panDate != null) {
        break label924;
      }
      i21 = 0;
      if (this.panType != null) {
        break label936;
      }
      i22 = 0;
      if (this.password != null) {
        break label948;
      }
      i23 = 0;
      if (this.payType != null) {
        break label960;
      }
      i24 = 0;
      if (this.pin != null) {
        break label972;
      }
      i25 = 0;
      if (this.respCode != null) {
        break label984;
      }
      i26 = 0;
      if (this.respDesc != null) {
        break label996;
      }
      i27 = 0;
      if (this.setlAmt != null) {
        break label1008;
      }
      i28 = 0;
      if (this.setlCurrency != null) {
        break label1020;
      }
      i29 = 0;
      if (this.settleDate != null) {
        break label1032;
      }
      i30 = 0;
      if (this.sign != null) {
        break label1044;
      }
      i31 = 0;
      if (this.transTimeout != null) {
        break label1056;
      }
      i32 = 0;
      if (this.userTag != null) {
        break label1068;
      }
      i33 = 0;
      label386:
      if (this.validateCode != null) {
        break label1080;
      }
    }
    for (;;)
    {
      return (i33 + (i32 + (i31 + (i30 + (i29 + (i28 + (i27 + (i26 + (i25 + (i24 + (i23 + (i22 + (i21 + (i20 + (i19 + (i18 + (i17 + (i16 + (i15 + (i14 + (i13 + (i12 + (i11 + (i10 + (i9 + (i8 + (i7 + (i6 + (i5 + (i4 + (i3 + (i2 + (i1 + (n + (m + (k + (j + (i + i35 * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + i34;
      i = this.backEndUrl.hashCode();
      break;
      label638:
      j = this.converRate.hashCode();
      break label27;
      label649:
      k = this.cupsQid.hashCode();
      break label36;
      label660:
      m = this.cupsRespCode.hashCode();
      break label46;
      label672:
      n = this.cupsTraceNum.hashCode();
      break label56;
      label684:
      i1 = this.cupsTraceTime.hashCode();
      break label66;
      label696:
      i2 = this.cvn2.hashCode();
      break label76;
      label708:
      i3 = this.imei.hashCode();
      break label86;
      label720:
      i4 = this.imsi.hashCode();
      break label96;
      label732:
      i5 = this.ivrTag.hashCode();
      break label106;
      label744:
      i6 = this.lbs.hashCode();
      break label116;
      label756:
      i7 = this.loginName.hashCode();
      break label126;
      label768:
      i8 = this.mac.hashCode();
      break label136;
      label780:
      i9 = this.merchantId.hashCode();
      break label146;
      label792:
      i10 = this.merchantName.hashCode();
      break label156;
      label804:
      i11 = this.merchantOrderAmt.hashCode();
      break label166;
      label816:
      i12 = this.merchantOrderDesc.hashCode();
      break label176;
      label828:
      i13 = this.merchantOrderId.hashCode();
      break label186;
      label840:
      i14 = this.merchantOrderTime.hashCode();
      break label196;
      label852:
      i15 = this.merchantPublicCert.hashCode();
      break label206;
      label864:
      i16 = this.misc.hashCode();
      break label216;
      label876:
      i17 = this.mobileMac.hashCode();
      break label226;
      label888:
      i18 = this.mobileNumber.hashCode();
      break label236;
      label900:
      i19 = this.msgExt.hashCode();
      break label246;
      label912:
      i20 = this.pan.hashCode();
      break label256;
      label924:
      i21 = this.panDate.hashCode();
      break label266;
      label936:
      i22 = this.panType.hashCode();
      break label276;
      label948:
      i23 = this.password.hashCode();
      break label286;
      label960:
      i24 = this.payType.hashCode();
      break label296;
      label972:
      i25 = this.pin.hashCode();
      break label306;
      label984:
      i26 = this.respCode.hashCode();
      break label316;
      label996:
      i27 = this.respDesc.hashCode();
      break label326;
      label1008:
      i28 = this.setlAmt.hashCode();
      break label336;
      label1020:
      i29 = this.setlCurrency.hashCode();
      break label346;
      label1032:
      i30 = this.settleDate.hashCode();
      break label356;
      label1044:
      i31 = this.sign.hashCode();
      break label366;
      label1056:
      i32 = this.transTimeout.hashCode();
      break label376;
      label1068:
      i33 = this.userTag.hashCode();
      break label386;
      label1080:
      i34 = this.validateCode.hashCode();
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\http\objects\CommonPay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */