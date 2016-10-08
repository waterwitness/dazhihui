package com.tencent.imcore;

public final class ModifyGroupFlag
{
  public static final ModifyGroupFlag kModifyGroupAddOption;
  public static final ModifyGroupFlag kModifyGroupFaceUrl;
  public static final ModifyGroupFlag kModifyGroupIntroduction;
  public static final ModifyGroupFlag kModifyGroupMaxMmeberNum;
  public static final ModifyGroupFlag kModifyGroupName;
  public static final ModifyGroupFlag kModifyGroupNone = new ModifyGroupFlag("kModifyGroupNone", internalJNI.kModifyGroupNone_get());
  public static final ModifyGroupFlag kModifyGroupNotification;
  public static final ModifyGroupFlag kModifyGroupSearchable;
  public static final ModifyGroupFlag kModifyGroupVisible;
  private static int swigNext = 0;
  private static ModifyGroupFlag[] swigValues;
  private final String swigName;
  private final int swigValue;
  
  static
  {
    kModifyGroupName = new ModifyGroupFlag("kModifyGroupName", internalJNI.kModifyGroupName_get());
    kModifyGroupNotification = new ModifyGroupFlag("kModifyGroupNotification", internalJNI.kModifyGroupNotification_get());
    kModifyGroupIntroduction = new ModifyGroupFlag("kModifyGroupIntroduction", internalJNI.kModifyGroupIntroduction_get());
    kModifyGroupFaceUrl = new ModifyGroupFlag("kModifyGroupFaceUrl", internalJNI.kModifyGroupFaceUrl_get());
    kModifyGroupAddOption = new ModifyGroupFlag("kModifyGroupAddOption", internalJNI.kModifyGroupAddOption_get());
    kModifyGroupMaxMmeberNum = new ModifyGroupFlag("kModifyGroupMaxMmeberNum", internalJNI.kModifyGroupMaxMmeberNum_get());
    kModifyGroupVisible = new ModifyGroupFlag("kModifyGroupVisible", internalJNI.kModifyGroupVisible_get());
    kModifyGroupSearchable = new ModifyGroupFlag("kModifyGroupSearchable", internalJNI.kModifyGroupSearchable_get());
    swigValues = new ModifyGroupFlag[] { kModifyGroupNone, kModifyGroupName, kModifyGroupNotification, kModifyGroupIntroduction, kModifyGroupFaceUrl, kModifyGroupAddOption, kModifyGroupMaxMmeberNum, kModifyGroupVisible, kModifyGroupSearchable };
  }
  
  private ModifyGroupFlag(String paramString)
  {
    this.swigName = paramString;
    int i = swigNext;
    swigNext = i + 1;
    this.swigValue = i;
  }
  
  private ModifyGroupFlag(String paramString, int paramInt)
  {
    this.swigName = paramString;
    this.swigValue = paramInt;
    swigNext = paramInt + 1;
  }
  
  private ModifyGroupFlag(String paramString, ModifyGroupFlag paramModifyGroupFlag)
  {
    this.swigName = paramString;
    this.swigValue = paramModifyGroupFlag.swigValue;
    swigNext = this.swigValue + 1;
  }
  
  public static ModifyGroupFlag swigToEnum(int paramInt)
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
    throw new IllegalArgumentException("No enum " + ModifyGroupFlag.class + " with value " + paramInt);
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


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\ModifyGroupFlag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */