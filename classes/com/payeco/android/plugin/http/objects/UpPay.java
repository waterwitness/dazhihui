package com.payeco.android.plugin.http.objects;

public class UpPay
  extends MerchantObject
{
  private String application;
  private String backAction;
  private String backEndUrl;
  private String converRate;
  private String cupsQid;
  private String cupsRespCode;
  private String cupsTraceNum;
  private String cupsTraceTime;
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
  private String respCode;
  private String respDesc;
  private String setlAmt;
  private String setlCurrency;
  private String settleDate;
  private String sign;
  private String transTimeout;
  
  public UpPay() {}
  
  public UpPay(String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7, String paramString8, String paramString9, String paramString10, String paramString11, String paramString12, String paramString13, String paramString14, String paramString15, String paramString16, String paramString17, String paramString18, String paramString19, String paramString20, String paramString21, String paramString22, String paramString23, String paramString24, String paramString25, String paramString26)
  {
    this.application = paramString1;
    this.merchantName = paramString2;
    this.merchantId = paramString3;
    this.merchantOrderId = paramString4;
    this.merchantOrderTime = paramString5;
    this.merchantOrderAmt = paramString6;
    this.merchantOrderDesc = paramString7;
    this.transTimeout = paramString8;
    this.backEndUrl = paramString9;
    this.backAction = paramString10;
    this.sign = paramString11;
    this.merchantPublicCert = paramString12;
    this.settleDate = paramString13;
    this.setlAmt = paramString14;
    this.setlCurrency = paramString15;
    this.converRate = paramString16;
    this.cupsQid = paramString17;
    this.cupsTraceNum = paramString18;
    this.cupsTraceTime = paramString19;
    this.cupsRespCode = paramString20;
    this.msgExt = paramString21;
    this.misc = paramString22;
    this.respCode = paramString23;
    this.respDesc = paramString24;
    this.pan = paramString25;
    this.mobileNumber = paramString26;
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
        paramObject = (UpPay)paramObject;
        if (this.application == null)
        {
          if (((UpPay)paramObject).application != null) {
            return false;
          }
        }
        else if (!this.application.equals(((UpPay)paramObject).application)) {
          return false;
        }
        if (this.backAction == null)
        {
          if (((UpPay)paramObject).backAction != null) {
            return false;
          }
        }
        else if (!this.backAction.equals(((UpPay)paramObject).backAction)) {
          return false;
        }
        if (this.backEndUrl == null)
        {
          if (((UpPay)paramObject).backEndUrl != null) {
            return false;
          }
        }
        else if (!this.backEndUrl.equals(((UpPay)paramObject).backEndUrl)) {
          return false;
        }
        if (this.converRate == null)
        {
          if (((UpPay)paramObject).converRate != null) {
            return false;
          }
        }
        else if (!this.converRate.equals(((UpPay)paramObject).converRate)) {
          return false;
        }
        if (this.cupsQid == null)
        {
          if (((UpPay)paramObject).cupsQid != null) {
            return false;
          }
        }
        else if (!this.cupsQid.equals(((UpPay)paramObject).cupsQid)) {
          return false;
        }
        if (this.cupsRespCode == null)
        {
          if (((UpPay)paramObject).cupsRespCode != null) {
            return false;
          }
        }
        else if (!this.cupsRespCode.equals(((UpPay)paramObject).cupsRespCode)) {
          return false;
        }
        if (this.cupsTraceNum == null)
        {
          if (((UpPay)paramObject).cupsTraceNum != null) {
            return false;
          }
        }
        else if (!this.cupsTraceNum.equals(((UpPay)paramObject).cupsTraceNum)) {
          return false;
        }
        if (this.cupsTraceTime == null)
        {
          if (((UpPay)paramObject).cupsTraceTime != null) {
            return false;
          }
        }
        else if (!this.cupsTraceTime.equals(((UpPay)paramObject).cupsTraceTime)) {
          return false;
        }
        if (this.merchantId == null)
        {
          if (((UpPay)paramObject).merchantId != null) {
            return false;
          }
        }
        else if (!this.merchantId.equals(((UpPay)paramObject).merchantId)) {
          return false;
        }
        if (this.merchantName == null)
        {
          if (((UpPay)paramObject).merchantName != null) {
            return false;
          }
        }
        else if (!this.merchantName.equals(((UpPay)paramObject).merchantName)) {
          return false;
        }
        if (this.merchantOrderAmt == null)
        {
          if (((UpPay)paramObject).merchantOrderAmt != null) {
            return false;
          }
        }
        else if (!this.merchantOrderAmt.equals(((UpPay)paramObject).merchantOrderAmt)) {
          return false;
        }
        if (this.merchantOrderDesc == null)
        {
          if (((UpPay)paramObject).merchantOrderDesc != null) {
            return false;
          }
        }
        else if (!this.merchantOrderDesc.equals(((UpPay)paramObject).merchantOrderDesc)) {
          return false;
        }
        if (this.merchantOrderId == null)
        {
          if (((UpPay)paramObject).merchantOrderId != null) {
            return false;
          }
        }
        else if (!this.merchantOrderId.equals(((UpPay)paramObject).merchantOrderId)) {
          return false;
        }
        if (this.merchantOrderTime == null)
        {
          if (((UpPay)paramObject).merchantOrderTime != null) {
            return false;
          }
        }
        else if (!this.merchantOrderTime.equals(((UpPay)paramObject).merchantOrderTime)) {
          return false;
        }
        if (this.merchantPublicCert == null)
        {
          if (((UpPay)paramObject).merchantPublicCert != null) {
            return false;
          }
        }
        else if (!this.merchantPublicCert.equals(((UpPay)paramObject).merchantPublicCert)) {
          return false;
        }
        if (this.misc == null)
        {
          if (((UpPay)paramObject).misc != null) {
            return false;
          }
        }
        else if (!this.misc.equals(((UpPay)paramObject).misc)) {
          return false;
        }
        if (this.mobileNumber == null)
        {
          if (((UpPay)paramObject).mobileNumber != null) {
            return false;
          }
        }
        else if (!this.mobileNumber.equals(((UpPay)paramObject).mobileNumber)) {
          return false;
        }
        if (this.msgExt == null)
        {
          if (((UpPay)paramObject).msgExt != null) {
            return false;
          }
        }
        else if (!this.msgExt.equals(((UpPay)paramObject).msgExt)) {
          return false;
        }
        if (this.pan == null)
        {
          if (((UpPay)paramObject).pan != null) {
            return false;
          }
        }
        else if (!this.pan.equals(((UpPay)paramObject).pan)) {
          return false;
        }
        if (this.respCode == null)
        {
          if (((UpPay)paramObject).respCode != null) {
            return false;
          }
        }
        else if (!this.respCode.equals(((UpPay)paramObject).respCode)) {
          return false;
        }
        if (this.respDesc == null)
        {
          if (((UpPay)paramObject).respDesc != null) {
            return false;
          }
        }
        else if (!this.respDesc.equals(((UpPay)paramObject).respDesc)) {
          return false;
        }
        if (this.setlAmt == null)
        {
          if (((UpPay)paramObject).setlAmt != null) {
            return false;
          }
        }
        else if (!this.setlAmt.equals(((UpPay)paramObject).setlAmt)) {
          return false;
        }
        if (this.setlCurrency == null)
        {
          if (((UpPay)paramObject).setlCurrency != null) {
            return false;
          }
        }
        else if (!this.setlCurrency.equals(((UpPay)paramObject).setlCurrency)) {
          return false;
        }
        if (this.settleDate == null)
        {
          if (((UpPay)paramObject).settleDate != null) {
            return false;
          }
        }
        else if (!this.settleDate.equals(((UpPay)paramObject).settleDate)) {
          return false;
        }
        if (this.sign == null)
        {
          if (((UpPay)paramObject).sign != null) {
            return false;
          }
        }
        else if (!this.sign.equals(((UpPay)paramObject).sign)) {
          return false;
        }
        if (this.transTimeout != null) {
          break;
        }
      } while (((UpPay)paramObject).transTimeout == null);
      return false;
    } while (this.transTimeout.equals(((UpPay)paramObject).transTimeout));
    return false;
  }
  
  public String getApplication()
  {
    return this.application;
  }
  
  public String getBackAction()
  {
    return this.backAction;
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
  
  public int hashCode()
  {
    int i21 = 0;
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
    label60:
    int i2;
    label70:
    int i3;
    label80:
    int i4;
    label90:
    int i5;
    label100:
    int i6;
    label110:
    int i7;
    label120:
    int i8;
    label130:
    int i9;
    label140:
    int i10;
    label150:
    int i11;
    label160:
    int i12;
    label170:
    int i13;
    label180:
    int i14;
    label190:
    int i15;
    label200:
    int i16;
    label210:
    int i17;
    label220:
    int i18;
    label230:
    int i19;
    label240:
    int i20;
    if (this.application == null)
    {
      i = 0;
      if (this.backAction != null) {
        break label421;
      }
      j = 0;
      if (this.backEndUrl != null) {
        break label432;
      }
      k = 0;
      if (this.converRate != null) {
        break label443;
      }
      m = 0;
      if (this.cupsQid != null) {
        break label455;
      }
      n = 0;
      if (this.cupsRespCode != null) {
        break label467;
      }
      i1 = 0;
      if (this.cupsTraceNum != null) {
        break label479;
      }
      i2 = 0;
      if (this.cupsTraceTime != null) {
        break label491;
      }
      i3 = 0;
      if (this.merchantId != null) {
        break label503;
      }
      i4 = 0;
      if (this.merchantName != null) {
        break label515;
      }
      i5 = 0;
      if (this.merchantOrderAmt != null) {
        break label527;
      }
      i6 = 0;
      if (this.merchantOrderDesc != null) {
        break label539;
      }
      i7 = 0;
      if (this.merchantOrderId != null) {
        break label551;
      }
      i8 = 0;
      if (this.merchantOrderTime != null) {
        break label563;
      }
      i9 = 0;
      if (this.merchantPublicCert != null) {
        break label575;
      }
      i10 = 0;
      if (this.misc != null) {
        break label587;
      }
      i11 = 0;
      if (this.mobileNumber != null) {
        break label599;
      }
      i12 = 0;
      if (this.msgExt != null) {
        break label611;
      }
      i13 = 0;
      if (this.pan != null) {
        break label623;
      }
      i14 = 0;
      if (this.respCode != null) {
        break label635;
      }
      i15 = 0;
      if (this.respDesc != null) {
        break label647;
      }
      i16 = 0;
      if (this.setlAmt != null) {
        break label659;
      }
      i17 = 0;
      if (this.setlCurrency != null) {
        break label671;
      }
      i18 = 0;
      if (this.settleDate != null) {
        break label683;
      }
      i19 = 0;
      if (this.sign != null) {
        break label695;
      }
      i20 = 0;
      label250:
      if (this.transTimeout != null) {
        break label707;
      }
    }
    for (;;)
    {
      return (i20 + (i19 + (i18 + (i17 + (i16 + (i15 + (i14 + (i13 + (i12 + (i11 + (i10 + (i9 + (i8 + (i7 + (i6 + (i5 + (i4 + (i3 + (i2 + (i1 + (n + (m + (k + (j + (i + 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31) * 31 + i21;
      i = this.application.hashCode();
      break;
      label421:
      j = this.backAction.hashCode();
      break label21;
      label432:
      k = this.backEndUrl.hashCode();
      break label30;
      label443:
      m = this.converRate.hashCode();
      break label40;
      label455:
      n = this.cupsQid.hashCode();
      break label50;
      label467:
      i1 = this.cupsRespCode.hashCode();
      break label60;
      label479:
      i2 = this.cupsTraceNum.hashCode();
      break label70;
      label491:
      i3 = this.cupsTraceTime.hashCode();
      break label80;
      label503:
      i4 = this.merchantId.hashCode();
      break label90;
      label515:
      i5 = this.merchantName.hashCode();
      break label100;
      label527:
      i6 = this.merchantOrderAmt.hashCode();
      break label110;
      label539:
      i7 = this.merchantOrderDesc.hashCode();
      break label120;
      label551:
      i8 = this.merchantOrderId.hashCode();
      break label130;
      label563:
      i9 = this.merchantOrderTime.hashCode();
      break label140;
      label575:
      i10 = this.merchantPublicCert.hashCode();
      break label150;
      label587:
      i11 = this.misc.hashCode();
      break label160;
      label599:
      i12 = this.mobileNumber.hashCode();
      break label170;
      label611:
      i13 = this.msgExt.hashCode();
      break label180;
      label623:
      i14 = this.pan.hashCode();
      break label190;
      label635:
      i15 = this.respCode.hashCode();
      break label200;
      label647:
      i16 = this.respDesc.hashCode();
      break label210;
      label659:
      i17 = this.setlAmt.hashCode();
      break label220;
      label671:
      i18 = this.setlCurrency.hashCode();
      break label230;
      label683:
      i19 = this.settleDate.hashCode();
      break label240;
      label695:
      i20 = this.sign.hashCode();
      break label250;
      label707:
      i21 = this.transTimeout.hashCode();
    }
  }
  
  public void setApplication(String paramString)
  {
    this.application = paramString;
  }
  
  public void setBackAction(String paramString)
  {
    this.backAction = paramString;
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
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\http\objects\UpPay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */