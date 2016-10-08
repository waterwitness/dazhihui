package com.itrus.raapi.implement;

import java.util.Hashtable;
import org.ksoap2.serialization.KvmSerializable;
import org.ksoap2.serialization.PropertyInfo;

public class CACertInfo
  implements KvmSerializable
{
  public static Class<UserInfo> UserInfo_CLASS = UserInfo.class;
  protected String certApproveAdmin1;
  protected String certApproveAdmin2;
  protected String certApproveDate;
  protected String certDeliverMode;
  protected String certIdRandom;
  protected String certIssuerDn;
  protected String certIssuerHashMd5;
  protected String certKmcRep1;
  protected String certKmcRep2;
  protected String certKmcRep3;
  protected String certKmcReq1;
  protected String certKmcReq2;
  protected String certKmcReq3;
  protected String certNotAfter;
  protected String certNotBefore;
  protected String certPin;
  protected String certRejectDate;
  protected String certRenewalDate;
  protected int certRenewalNextId;
  protected int certRenewalPrevId;
  protected String certRenewemailDeliver;
  protected String certReqBuf;
  protected String certReqBufKmc;
  protected String certReqBufType;
  protected String certReqBufTypeKmc;
  protected String certReqChallenge;
  protected String certReqComment;
  protected String certReqDate;
  protected String certReqNonce;
  protected int certReqOverrideValidity;
  protected String certReqPublickey;
  protected String certReqPublickeyHashMd5;
  protected String certReqTransid;
  protected String certRevokeDate;
  protected String certRevokeReason;
  protected String certSerialNumber;
  protected String certSerialnumberKmc;
  protected String certSignBuf;
  protected String certSignBufKmc;
  protected String certSignBufP7;
  protected String certSignBufP7Kmc;
  protected String certSignDate;
  protected String certStatus;
  protected String certSubjectDn;
  protected String certSubjectHashMd5;
  protected String certSuspendDate;
  protected String certType;
  protected String certTypeKmc;
  
  public String getCertApproveAdmin1()
  {
    return this.certApproveAdmin1;
  }
  
  public String getCertApproveAdmin2()
  {
    return this.certApproveAdmin2;
  }
  
  public String getCertApproveDate()
  {
    return this.certApproveDate;
  }
  
  public String getCertDeliverMode()
  {
    return this.certDeliverMode;
  }
  
  public String getCertIdRandom()
  {
    return this.certIdRandom;
  }
  
  public String getCertIssuerDn()
  {
    return this.certIssuerDn;
  }
  
  public String getCertIssuerHashMd5()
  {
    return this.certIssuerHashMd5;
  }
  
  public String getCertKmcRep1()
  {
    return this.certKmcRep1;
  }
  
  public String getCertKmcRep2()
  {
    return this.certKmcRep2;
  }
  
  public String getCertKmcRep3()
  {
    return this.certKmcRep3;
  }
  
  public String getCertKmcReq1()
  {
    return this.certKmcReq1;
  }
  
  public String getCertKmcReq2()
  {
    return this.certKmcReq2;
  }
  
  public String getCertKmcReq3()
  {
    return this.certKmcReq3;
  }
  
  public String getCertNotAfter()
  {
    return this.certNotAfter;
  }
  
  public String getCertNotBefore()
  {
    return this.certNotBefore;
  }
  
  public String getCertPin()
  {
    return this.certPin;
  }
  
  public String getCertRejectDate()
  {
    return this.certRejectDate;
  }
  
  public String getCertRenewalDate()
  {
    return this.certRenewalDate;
  }
  
  public int getCertRenewalNextId()
  {
    return this.certRenewalNextId;
  }
  
  public int getCertRenewalPrevId()
  {
    return this.certRenewalPrevId;
  }
  
  public String getCertRenewemailDeliver()
  {
    return this.certRenewemailDeliver;
  }
  
  public String getCertReqBuf()
  {
    return this.certReqBuf;
  }
  
  public String getCertReqBufKmc()
  {
    return this.certReqBufKmc;
  }
  
  public String getCertReqBufType()
  {
    return this.certReqBufType;
  }
  
  public String getCertReqBufTypeKmc()
  {
    return this.certReqBufTypeKmc;
  }
  
  public String getCertReqChallenge()
  {
    return this.certReqChallenge;
  }
  
  public String getCertReqComment()
  {
    return this.certReqComment;
  }
  
  public String getCertReqDate()
  {
    return this.certReqDate;
  }
  
  public String getCertReqNonce()
  {
    return this.certReqNonce;
  }
  
  public int getCertReqOverrideValidity()
  {
    return this.certReqOverrideValidity;
  }
  
  public String getCertReqPublickey()
  {
    return this.certReqPublickey;
  }
  
  public String getCertReqPublickeyHashMd5()
  {
    return this.certReqPublickeyHashMd5;
  }
  
  public String getCertReqTransid()
  {
    return this.certReqTransid;
  }
  
  public String getCertRevokeDate()
  {
    return this.certRevokeDate;
  }
  
  public String getCertRevokeReason()
  {
    return this.certRevokeReason;
  }
  
  public String getCertSerialNumber()
  {
    return this.certSerialNumber;
  }
  
  public String getCertSerialnumberKmc()
  {
    return this.certSerialnumberKmc;
  }
  
  public String getCertSignBuf()
  {
    return this.certSignBuf;
  }
  
  public String getCertSignBufKmc()
  {
    return this.certSignBufKmc;
  }
  
  public String getCertSignBufP7()
  {
    return this.certSignBufP7;
  }
  
  public String getCertSignBufP7Kmc()
  {
    return this.certSignBufP7Kmc;
  }
  
  public String getCertSignDate()
  {
    return this.certSignDate;
  }
  
  public String getCertStatus()
  {
    return this.certStatus;
  }
  
  public String getCertSubjectDn()
  {
    return this.certSubjectDn;
  }
  
  public String getCertSubjectHashMd5()
  {
    return this.certSubjectHashMd5;
  }
  
  public String getCertSuspendDate()
  {
    return this.certSuspendDate;
  }
  
  public String getCertType()
  {
    return this.certType;
  }
  
  public String getCertTypeKmc()
  {
    return this.certTypeKmc;
  }
  
  public Object getProperty(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return null;
    case 0: 
      return this.certStatus;
    case 1: 
      return this.certReqDate;
    case 2: 
      return this.certReqTransid;
    case 3: 
      return this.certReqNonce;
    case 4: 
      return this.certReqBufType;
    case 5: 
      return this.certReqChallenge;
    case 6: 
      return this.certReqComment;
    case 7: 
      return this.certApproveDate;
    case 8: 
      return this.certRejectDate;
    case 9: 
      return this.certSignDate;
    case 10: 
      return this.certSerialNumber;
    case 11: 
      return this.certNotBefore;
    case 12: 
      return this.certNotAfter;
    case 13: 
      return this.certIssuerHashMd5;
    case 14: 
      return this.certIssuerDn;
    case 15: 
      return this.certSubjectHashMd5;
    case 16: 
      return this.certSubjectDn;
    case 17: 
      return this.certSuspendDate;
    case 18: 
      return this.certRevokeDate;
    case 19: 
      return this.certRevokeReason;
    case 20: 
      return this.certRenewalDate;
    case 21: 
      return Integer.valueOf(this.certRenewalPrevId);
    case 22: 
      return Integer.valueOf(this.certRenewalNextId);
    case 23: 
      return Integer.valueOf(this.certReqOverrideValidity);
    case 24: 
      return this.certReqBuf;
    case 25: 
      return this.certSignBuf;
    case 26: 
      return this.certPin;
    case 27: 
      return this.certType;
    case 28: 
      return this.certKmcReq1;
    case 29: 
      return this.certKmcReq2;
    case 30: 
      return this.certKmcReq3;
    case 31: 
      return this.certKmcRep1;
    case 32: 
      return this.certKmcRep2;
    case 33: 
      return this.certKmcRep3;
    case 34: 
      return this.certDeliverMode;
    case 35: 
      return this.certApproveAdmin1;
    case 36: 
      return this.certApproveAdmin2;
    case 37: 
      return this.certRenewemailDeliver;
    case 38: 
      return this.certReqBufKmc;
    case 39: 
      return this.certReqBufTypeKmc;
    case 40: 
      return this.certSignBufKmc;
    case 41: 
      return this.certSignBufP7Kmc;
    case 42: 
      return this.certSignBufP7;
    case 43: 
      return this.certSerialnumberKmc;
    case 44: 
      return this.certTypeKmc;
    case 45: 
      return this.certReqPublickey;
    case 46: 
      return this.certReqPublickeyHashMd5;
    }
    return this.certIdRandom;
  }
  
  public int getPropertyCount()
  {
    return 48;
  }
  
  public void getPropertyInfo(int paramInt, Hashtable paramHashtable, PropertyInfo paramPropertyInfo)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
      paramPropertyInfo.name = "certStatus";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 1: 
      paramPropertyInfo.name = "certReqDate";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 2: 
      paramPropertyInfo.name = "certReqTransid";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 3: 
      paramPropertyInfo.name = "certReqNonce";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 4: 
      paramPropertyInfo.name = "certReqBufType";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 5: 
      paramPropertyInfo.name = "certReqChallenge";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 6: 
      paramPropertyInfo.name = "certReqComment";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 7: 
      paramPropertyInfo.name = "certApproveDate";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 8: 
      paramPropertyInfo.name = "certRejectDate";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 9: 
      paramPropertyInfo.name = "certSignDate";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 10: 
      paramPropertyInfo.name = "certSerialNumber";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 11: 
      paramPropertyInfo.name = "certNotBefore";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 12: 
      paramPropertyInfo.name = "certNotAfter";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 13: 
      paramPropertyInfo.name = "certIssuerHashMd5";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 14: 
      paramPropertyInfo.name = "certIssuerDn";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 15: 
      paramPropertyInfo.name = "certSubjectHashMd5";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 16: 
      paramPropertyInfo.name = "certSubjectDn";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 17: 
      paramPropertyInfo.name = "certSuspendDate";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 18: 
      paramPropertyInfo.name = "certRevokeDate";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 19: 
      paramPropertyInfo.name = "certRevokeReason";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 20: 
      paramPropertyInfo.name = "certRenewalDate";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 21: 
      paramPropertyInfo.name = "certRenewalPrevId";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 22: 
      paramPropertyInfo.name = "certRenewalNextId";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 23: 
      paramPropertyInfo.name = "certReqOverrideValidity";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 24: 
      paramPropertyInfo.name = "certReqBuf";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 25: 
      paramPropertyInfo.name = "certSignBuf";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 26: 
      paramPropertyInfo.name = "certPin";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 27: 
      paramPropertyInfo.name = "certType";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 28: 
      paramPropertyInfo.name = "certKmcReq1";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 29: 
      paramPropertyInfo.name = "certKmcReq2";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 30: 
      paramPropertyInfo.name = "certKmcReq3";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 31: 
      paramPropertyInfo.name = "certKmcRep1";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 32: 
      paramPropertyInfo.name = "certKmcRep2";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 33: 
      paramPropertyInfo.name = "certKmcRep3";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 34: 
      paramPropertyInfo.name = "certDeliverMode";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 35: 
      paramPropertyInfo.name = "certApproveAdmin1";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 36: 
      paramPropertyInfo.name = "certApproveAdmin2";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 37: 
      paramPropertyInfo.name = "certRenewemailDeliver";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 38: 
      paramPropertyInfo.name = "certReqBufKmc";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 39: 
      paramPropertyInfo.name = "certReqBufTypeKmc";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 40: 
      paramPropertyInfo.name = "certSignBufKmc";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 41: 
      paramPropertyInfo.name = "certSignBufP7Kmc";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 42: 
      paramPropertyInfo.name = "certSignBufP7";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 43: 
      paramPropertyInfo.name = "certSerialnumberKmc";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 44: 
      paramPropertyInfo.name = "certTypeKmc";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 45: 
      paramPropertyInfo.name = "certReqPublickey";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    case 46: 
      paramPropertyInfo.name = "certReqPublickeyHashMd5";
      paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
      return;
    }
    paramPropertyInfo.name = "certIdRandom";
    paramPropertyInfo.type = PropertyInfo.STRING_CLASS;
  }
  
  public void setCertApproveAdmin1(String paramString)
  {
    this.certApproveAdmin1 = paramString;
  }
  
  public void setCertApproveAdmin2(String paramString)
  {
    this.certApproveAdmin2 = paramString;
  }
  
  public void setCertApproveDate(String paramString)
  {
    this.certApproveDate = paramString;
  }
  
  public void setCertDeliverMode(String paramString)
  {
    this.certDeliverMode = paramString;
  }
  
  public void setCertIdRandom(String paramString)
  {
    this.certIdRandom = paramString;
  }
  
  public void setCertIssuerDn(String paramString)
  {
    this.certIssuerDn = paramString;
  }
  
  public void setCertIssuerHashMd5(String paramString)
  {
    this.certIssuerHashMd5 = paramString;
  }
  
  public void setCertKmcRep1(String paramString)
  {
    this.certKmcRep1 = paramString;
  }
  
  public void setCertKmcRep2(String paramString)
  {
    this.certKmcRep2 = paramString;
  }
  
  public void setCertKmcRep3(String paramString)
  {
    this.certKmcRep3 = paramString;
  }
  
  public void setCertKmcReq1(String paramString)
  {
    this.certKmcReq1 = paramString;
  }
  
  public void setCertKmcReq2(String paramString)
  {
    this.certKmcReq2 = paramString;
  }
  
  public void setCertKmcReq3(String paramString)
  {
    this.certKmcReq3 = paramString;
  }
  
  public void setCertNotAfter(String paramString)
  {
    this.certNotAfter = paramString;
  }
  
  public void setCertNotBefore(String paramString)
  {
    this.certNotBefore = paramString;
  }
  
  public void setCertPin(String paramString)
  {
    this.certPin = paramString;
  }
  
  public void setCertRejectDate(String paramString)
  {
    this.certRejectDate = paramString;
  }
  
  public void setCertRenewalDate(String paramString)
  {
    this.certRenewalDate = paramString;
  }
  
  public void setCertRenewalNextId(int paramInt)
  {
    this.certRenewalNextId = paramInt;
  }
  
  public void setCertRenewalPrevId(int paramInt)
  {
    this.certRenewalPrevId = paramInt;
  }
  
  public void setCertRenewemailDeliver(String paramString)
  {
    this.certRenewemailDeliver = paramString;
  }
  
  public void setCertReqBuf(String paramString)
  {
    this.certReqBuf = paramString;
  }
  
  public void setCertReqBufKmc(String paramString)
  {
    this.certReqBufKmc = paramString;
  }
  
  public void setCertReqBufType(String paramString)
  {
    this.certReqBufType = paramString;
  }
  
  public void setCertReqBufTypeKmc(String paramString)
  {
    this.certReqBufTypeKmc = paramString;
  }
  
  public void setCertReqChallenge(String paramString)
  {
    this.certReqChallenge = paramString;
  }
  
  public void setCertReqComment(String paramString)
  {
    this.certReqComment = paramString;
  }
  
  public void setCertReqDate(String paramString)
  {
    this.certReqDate = paramString;
  }
  
  public void setCertReqNonce(String paramString)
  {
    this.certReqNonce = paramString;
  }
  
  public void setCertReqOverrideValidity(int paramInt)
  {
    this.certReqOverrideValidity = paramInt;
  }
  
  public void setCertReqPublickey(String paramString)
  {
    this.certReqPublickey = paramString;
  }
  
  public void setCertReqPublickeyHashMd5(String paramString)
  {
    this.certReqPublickeyHashMd5 = paramString;
  }
  
  public void setCertReqTransid(String paramString)
  {
    this.certReqTransid = paramString;
  }
  
  public void setCertRevokeDate(String paramString)
  {
    this.certRevokeDate = paramString;
  }
  
  public void setCertRevokeReason(String paramString)
  {
    this.certRevokeReason = paramString;
  }
  
  public void setCertSerialNumber(String paramString)
  {
    this.certSerialNumber = paramString;
  }
  
  public void setCertSerialnumberKmc(String paramString)
  {
    this.certSerialnumberKmc = paramString;
  }
  
  public void setCertSignBuf(String paramString)
  {
    this.certSignBuf = paramString;
  }
  
  public void setCertSignBufKmc(String paramString)
  {
    this.certSignBufKmc = paramString;
  }
  
  public void setCertSignBufP7(String paramString)
  {
    this.certSignBufP7 = paramString;
  }
  
  public void setCertSignBufP7Kmc(String paramString)
  {
    this.certSignBufP7Kmc = paramString;
  }
  
  public void setCertSignDate(String paramString)
  {
    this.certSignDate = paramString;
  }
  
  public void setCertStatus(String paramString)
  {
    this.certStatus = paramString;
  }
  
  public void setCertSubjectDn(String paramString)
  {
    this.certSubjectDn = paramString;
  }
  
  public void setCertSubjectHashMd5(String paramString)
  {
    this.certSubjectHashMd5 = paramString;
  }
  
  public void setCertSuspendDate(String paramString)
  {
    this.certSuspendDate = paramString;
  }
  
  public void setCertType(String paramString)
  {
    this.certType = paramString;
  }
  
  public void setCertTypeKmc(String paramString)
  {
    this.certTypeKmc = paramString;
  }
  
  public void setProperty(int paramInt, Object paramObject)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
      this.certStatus = paramObject.toString();
      return;
    case 1: 
      this.certReqDate = paramObject.toString();
      return;
    case 2: 
      this.certReqTransid = paramObject.toString();
      return;
    case 3: 
      this.certReqNonce = paramObject.toString();
      return;
    case 4: 
      this.certReqBufType = paramObject.toString();
      return;
    case 5: 
      this.certReqChallenge = paramObject.toString();
      return;
    case 6: 
      this.certReqComment = paramObject.toString();
      return;
    case 7: 
      this.certApproveDate = paramObject.toString();
      return;
    case 8: 
      this.certRejectDate = paramObject.toString();
      return;
    case 9: 
      this.certSignDate = paramObject.toString();
      return;
    case 10: 
      this.certSerialNumber = paramObject.toString();
      return;
    case 11: 
      this.certNotBefore = paramObject.toString();
      return;
    case 12: 
      this.certNotAfter = paramObject.toString();
      return;
    case 13: 
      this.certIssuerHashMd5 = paramObject.toString();
      return;
    case 14: 
      this.certIssuerDn = paramObject.toString();
      return;
    case 15: 
      this.certSubjectHashMd5 = paramObject.toString();
      return;
    case 16: 
      this.certSubjectDn = paramObject.toString();
      return;
    case 17: 
      this.certSuspendDate = paramObject.toString();
      return;
    case 18: 
      this.certRevokeDate = paramObject.toString();
      return;
    case 19: 
      this.certRevokeReason = paramObject.toString();
      return;
    case 20: 
      this.certRenewalDate = paramObject.toString();
      return;
    case 21: 
      this.certRenewalPrevId = ((Integer)paramObject).intValue();
      return;
    case 22: 
      this.certRenewalNextId = ((Integer)paramObject).intValue();
      return;
    case 23: 
      this.certReqOverrideValidity = ((Integer)paramObject).intValue();
      return;
    case 24: 
      this.certReqBuf = paramObject.toString();
      return;
    case 25: 
      this.certSignBuf = paramObject.toString();
      return;
    case 26: 
      this.certPin = paramObject.toString();
      return;
    case 27: 
      this.certType = paramObject.toString();
      return;
    case 28: 
      this.certKmcReq1 = paramObject.toString();
      return;
    case 29: 
      this.certKmcReq2 = paramObject.toString();
      return;
    case 30: 
      this.certKmcReq3 = paramObject.toString();
      return;
    case 31: 
      this.certKmcRep1 = paramObject.toString();
      return;
    case 32: 
      this.certKmcRep2 = paramObject.toString();
      return;
    case 33: 
      this.certKmcRep3 = paramObject.toString();
      return;
    case 34: 
      this.certDeliverMode = paramObject.toString();
      return;
    case 35: 
      this.certApproveAdmin1 = paramObject.toString();
      return;
    case 36: 
      this.certApproveAdmin2 = paramObject.toString();
      return;
    case 37: 
      this.certRenewemailDeliver = paramObject.toString();
      return;
    case 38: 
      this.certReqBufKmc = paramObject.toString();
      return;
    case 39: 
      this.certReqBufTypeKmc = paramObject.toString();
      return;
    case 40: 
      this.certSignBufP7Kmc = paramObject.toString();
      return;
    case 41: 
      this.certSignBufP7 = paramObject.toString();
      return;
    case 42: 
      this.certSerialnumberKmc = paramObject.toString();
      return;
    case 43: 
      this.certTypeKmc = paramObject.toString();
      return;
    case 44: 
      this.certReqPublickey = paramObject.toString();
      return;
    case 45: 
      this.certReqPublickeyHashMd5 = paramObject.toString();
      return;
    }
    this.certIdRandom = paramObject.toString();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\itrus\raapi\implement\CACertInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */