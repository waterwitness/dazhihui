package com.tencent.imcore;

public final class MsgElemType
{
  public static final MsgElemType kCustom;
  public static final MsgElemType kFace;
  public static final MsgElemType kFile;
  public static final MsgElemType kFriendChange;
  public static final MsgElemType kGroupReport;
  public static final MsgElemType kGroupTips;
  public static final MsgElemType kInvalid = new MsgElemType("kInvalid", internalJNI.kInvalid_get());
  public static final MsgElemType kLocation;
  public static final MsgElemType kPic;
  public static final MsgElemType kPicNew;
  public static final MsgElemType kProfileChange;
  public static final MsgElemType kPtt;
  public static final MsgElemType kPttNew;
  public static final MsgElemType kSystem;
  public static final MsgElemType kText = new MsgElemType("kText");
  public static final MsgElemType kVideo;
  private static int swigNext = 0;
  private static MsgElemType[] swigValues;
  private final String swigName;
  private final int swigValue;
  
  static
  {
    kPic = new MsgElemType("kPic");
    kPtt = new MsgElemType("kPtt");
    kPicNew = new MsgElemType("kPicNew");
    kPttNew = new MsgElemType("kPttNew");
    kCustom = new MsgElemType("kCustom");
    kFile = new MsgElemType("kFile");
    kSystem = new MsgElemType("kSystem");
    kGroupTips = new MsgElemType("kGroupTips");
    kFace = new MsgElemType("kFace");
    kLocation = new MsgElemType("kLocation");
    kGroupReport = new MsgElemType("kGroupReport");
    kFriendChange = new MsgElemType("kFriendChange");
    kProfileChange = new MsgElemType("kProfileChange");
    kVideo = new MsgElemType("kVideo");
    swigValues = new MsgElemType[] { kInvalid, kText, kPic, kPtt, kPicNew, kPttNew, kCustom, kFile, kSystem, kGroupTips, kFace, kLocation, kGroupReport, kFriendChange, kProfileChange, kVideo };
  }
  
  private MsgElemType(String paramString)
  {
    this.swigName = paramString;
    int i = swigNext;
    swigNext = i + 1;
    this.swigValue = i;
  }
  
  private MsgElemType(String paramString, int paramInt)
  {
    this.swigName = paramString;
    this.swigValue = paramInt;
    swigNext = paramInt + 1;
  }
  
  private MsgElemType(String paramString, MsgElemType paramMsgElemType)
  {
    this.swigName = paramString;
    this.swigValue = paramMsgElemType.swigValue;
    swigNext = this.swigValue + 1;
  }
  
  public static MsgElemType swigToEnum(int paramInt)
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
    throw new IllegalArgumentException("No enum " + MsgElemType.class + " with value " + paramInt);
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


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\MsgElemType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */