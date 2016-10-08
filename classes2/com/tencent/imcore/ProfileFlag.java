package com.tencent.imcore;

public final class ProfileFlag
{
  public static final ProfileFlag kProfileFlagAllowType;
  public static final ProfileFlag kProfileFlagFaceUrl;
  public static final ProfileFlag kProfileFlagGroup;
  public static final ProfileFlag kProfileFlagNick;
  public static final ProfileFlag kProfileFlagNone = new ProfileFlag("kProfileFlagNone", internalJNI.kProfileFlagNone_get());
  public static final ProfileFlag kProfileFlagRemark;
  public static final ProfileFlag kProfileFlagSelfSignature;
  private static int swigNext = 0;
  private static ProfileFlag[] swigValues;
  private final String swigName;
  private final int swigValue;
  
  static
  {
    kProfileFlagNick = new ProfileFlag("kProfileFlagNick", internalJNI.kProfileFlagNick_get());
    kProfileFlagAllowType = new ProfileFlag("kProfileFlagAllowType", internalJNI.kProfileFlagAllowType_get());
    kProfileFlagFaceUrl = new ProfileFlag("kProfileFlagFaceUrl", internalJNI.kProfileFlagFaceUrl_get());
    kProfileFlagRemark = new ProfileFlag("kProfileFlagRemark", internalJNI.kProfileFlagRemark_get());
    kProfileFlagGroup = new ProfileFlag("kProfileFlagGroup", internalJNI.kProfileFlagGroup_get());
    kProfileFlagSelfSignature = new ProfileFlag("kProfileFlagSelfSignature", internalJNI.kProfileFlagSelfSignature_get());
    swigValues = new ProfileFlag[] { kProfileFlagNone, kProfileFlagNick, kProfileFlagAllowType, kProfileFlagFaceUrl, kProfileFlagRemark, kProfileFlagGroup, kProfileFlagSelfSignature };
  }
  
  private ProfileFlag(String paramString)
  {
    this.swigName = paramString;
    int i = swigNext;
    swigNext = i + 1;
    this.swigValue = i;
  }
  
  private ProfileFlag(String paramString, int paramInt)
  {
    this.swigName = paramString;
    this.swigValue = paramInt;
    swigNext = paramInt + 1;
  }
  
  private ProfileFlag(String paramString, ProfileFlag paramProfileFlag)
  {
    this.swigName = paramString;
    this.swigValue = paramProfileFlag.swigValue;
    swigNext = this.swigValue + 1;
  }
  
  public static ProfileFlag swigToEnum(int paramInt)
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
    throw new IllegalArgumentException("No enum " + ProfileFlag.class + " with value " + paramInt);
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


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\ProfileFlag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */