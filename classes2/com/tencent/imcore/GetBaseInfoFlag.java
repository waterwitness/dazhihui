package com.tencent.imcore;

public final class GetBaseInfoFlag
{
  public static final GetBaseInfoFlag kGetGroupBaseInfoAddOpton;
  public static final GetBaseInfoFlag kGetGroupBaseInfoAppId;
  public static final GetBaseInfoFlag kGetGroupBaseInfoCreateTime;
  public static final GetBaseInfoFlag kGetGroupBaseInfoFaceUrl;
  public static final GetBaseInfoFlag kGetGroupBaseInfoGroupType;
  public static final GetBaseInfoFlag kGetGroupBaseInfoIntroduction;
  public static final GetBaseInfoFlag kGetGroupBaseInfoLastMsg;
  public static final GetBaseInfoFlag kGetGroupBaseInfoLastMsgTime;
  public static final GetBaseInfoFlag kGetGroupBaseInfoMaxMemberNum;
  public static final GetBaseInfoFlag kGetGroupBaseInfoMemberNum;
  public static final GetBaseInfoFlag kGetGroupBaseInfoName;
  public static final GetBaseInfoFlag kGetGroupBaseInfoNextMsgSeq;
  public static final GetBaseInfoFlag kGetGroupBaseInfoNone = new GetBaseInfoFlag("kGetGroupBaseInfoNone", internalJNI.kGetGroupBaseInfoNone_get());
  public static final GetBaseInfoFlag kGetGroupBaseInfoNotification;
  public static final GetBaseInfoFlag kGetGroupBaseInfoOnlineNum;
  public static final GetBaseInfoFlag kGetGroupBaseInfoOwnerUin;
  public static final GetBaseInfoFlag kGetGroupBaseInfoSearchable;
  public static final GetBaseInfoFlag kGetGroupBaseInfoSeq;
  public static final GetBaseInfoFlag kGetGroupBaseInfoTime;
  public static final GetBaseInfoFlag kGetGroupBaseInfoVisible;
  private static int swigNext = 0;
  private static GetBaseInfoFlag[] swigValues;
  private final String swigName;
  private final int swigValue;
  
  static
  {
    kGetGroupBaseInfoName = new GetBaseInfoFlag("kGetGroupBaseInfoName", internalJNI.kGetGroupBaseInfoName_get());
    kGetGroupBaseInfoCreateTime = new GetBaseInfoFlag("kGetGroupBaseInfoCreateTime", internalJNI.kGetGroupBaseInfoCreateTime_get());
    kGetGroupBaseInfoOwnerUin = new GetBaseInfoFlag("kGetGroupBaseInfoOwnerUin", internalJNI.kGetGroupBaseInfoOwnerUin_get());
    kGetGroupBaseInfoSeq = new GetBaseInfoFlag("kGetGroupBaseInfoSeq", internalJNI.kGetGroupBaseInfoSeq_get());
    kGetGroupBaseInfoTime = new GetBaseInfoFlag("kGetGroupBaseInfoTime", internalJNI.kGetGroupBaseInfoTime_get());
    kGetGroupBaseInfoNextMsgSeq = new GetBaseInfoFlag("kGetGroupBaseInfoNextMsgSeq", internalJNI.kGetGroupBaseInfoNextMsgSeq_get());
    kGetGroupBaseInfoLastMsgTime = new GetBaseInfoFlag("kGetGroupBaseInfoLastMsgTime", internalJNI.kGetGroupBaseInfoLastMsgTime_get());
    kGetGroupBaseInfoAppId = new GetBaseInfoFlag("kGetGroupBaseInfoAppId", internalJNI.kGetGroupBaseInfoAppId_get());
    kGetGroupBaseInfoMemberNum = new GetBaseInfoFlag("kGetGroupBaseInfoMemberNum", internalJNI.kGetGroupBaseInfoMemberNum_get());
    kGetGroupBaseInfoMaxMemberNum = new GetBaseInfoFlag("kGetGroupBaseInfoMaxMemberNum", internalJNI.kGetGroupBaseInfoMaxMemberNum_get());
    kGetGroupBaseInfoNotification = new GetBaseInfoFlag("kGetGroupBaseInfoNotification", internalJNI.kGetGroupBaseInfoNotification_get());
    kGetGroupBaseInfoIntroduction = new GetBaseInfoFlag("kGetGroupBaseInfoIntroduction", internalJNI.kGetGroupBaseInfoIntroduction_get());
    kGetGroupBaseInfoFaceUrl = new GetBaseInfoFlag("kGetGroupBaseInfoFaceUrl", internalJNI.kGetGroupBaseInfoFaceUrl_get());
    kGetGroupBaseInfoAddOpton = new GetBaseInfoFlag("kGetGroupBaseInfoAddOpton", internalJNI.kGetGroupBaseInfoAddOpton_get());
    kGetGroupBaseInfoGroupType = new GetBaseInfoFlag("kGetGroupBaseInfoGroupType", internalJNI.kGetGroupBaseInfoGroupType_get());
    kGetGroupBaseInfoLastMsg = new GetBaseInfoFlag("kGetGroupBaseInfoLastMsg", internalJNI.kGetGroupBaseInfoLastMsg_get());
    kGetGroupBaseInfoOnlineNum = new GetBaseInfoFlag("kGetGroupBaseInfoOnlineNum", internalJNI.kGetGroupBaseInfoOnlineNum_get());
    kGetGroupBaseInfoVisible = new GetBaseInfoFlag("kGetGroupBaseInfoVisible", internalJNI.kGetGroupBaseInfoVisible_get());
    kGetGroupBaseInfoSearchable = new GetBaseInfoFlag("kGetGroupBaseInfoSearchable", internalJNI.kGetGroupBaseInfoSearchable_get());
    swigValues = new GetBaseInfoFlag[] { kGetGroupBaseInfoNone, kGetGroupBaseInfoName, kGetGroupBaseInfoCreateTime, kGetGroupBaseInfoOwnerUin, kGetGroupBaseInfoSeq, kGetGroupBaseInfoTime, kGetGroupBaseInfoNextMsgSeq, kGetGroupBaseInfoLastMsgTime, kGetGroupBaseInfoAppId, kGetGroupBaseInfoMemberNum, kGetGroupBaseInfoMaxMemberNum, kGetGroupBaseInfoNotification, kGetGroupBaseInfoIntroduction, kGetGroupBaseInfoFaceUrl, kGetGroupBaseInfoAddOpton, kGetGroupBaseInfoGroupType, kGetGroupBaseInfoLastMsg, kGetGroupBaseInfoOnlineNum, kGetGroupBaseInfoVisible, kGetGroupBaseInfoSearchable };
  }
  
  private GetBaseInfoFlag(String paramString)
  {
    this.swigName = paramString;
    int i = swigNext;
    swigNext = i + 1;
    this.swigValue = i;
  }
  
  private GetBaseInfoFlag(String paramString, int paramInt)
  {
    this.swigName = paramString;
    this.swigValue = paramInt;
    swigNext = paramInt + 1;
  }
  
  private GetBaseInfoFlag(String paramString, GetBaseInfoFlag paramGetBaseInfoFlag)
  {
    this.swigName = paramString;
    this.swigValue = paramGetBaseInfoFlag.swigValue;
    swigNext = this.swigValue + 1;
  }
  
  public static GetBaseInfoFlag swigToEnum(int paramInt)
  {
    if ((paramInt < swigValues.length) && (paramInt >= 0) && (swigValues[paramInt].swigValue == paramInt)) {
      return swigValues[paramInt];
    }
    int i = 0;
    while (i < swigValues.length)
    {
      if (swigValues[i].swigValue == paramInt) {
        return swigValues[i];
      }
      i += 1;
    }
    throw new IllegalArgumentException("No enum " + GetBaseInfoFlag.class + " with value " + paramInt);
  }
  
  public final int swigValue()
  {
    return this.swigValue;
  }
  
  public final String toString()
  {
    return this.swigName;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\GetBaseInfoFlag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */