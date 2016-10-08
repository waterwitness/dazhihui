package com.tencent.imcore;

public final class ModifyGroupMemberFlag
{
  public static final ModifyGroupMemberFlag kModifyGroupMemberMsgFlag;
  public static final ModifyGroupMemberFlag kModifyGroupMemberNameCard;
  public static final ModifyGroupMemberFlag kModifyGroupMemberNone = new ModifyGroupMemberFlag("kModifyGroupMemberNone", internalJNI.kModifyGroupMemberNone_get());
  public static final ModifyGroupMemberFlag kModifyGroupMemberRole;
  public static final ModifyGroupMemberFlag kModifyGroupMemberShutupTime;
  private static int swigNext = 0;
  private static ModifyGroupMemberFlag[] swigValues;
  private final String swigName;
  private final int swigValue;
  
  static
  {
    kModifyGroupMemberMsgFlag = new ModifyGroupMemberFlag("kModifyGroupMemberMsgFlag", internalJNI.kModifyGroupMemberMsgFlag_get());
    kModifyGroupMemberRole = new ModifyGroupMemberFlag("kModifyGroupMemberRole", internalJNI.kModifyGroupMemberRole_get());
    kModifyGroupMemberShutupTime = new ModifyGroupMemberFlag("kModifyGroupMemberShutupTime", internalJNI.kModifyGroupMemberShutupTime_get());
    kModifyGroupMemberNameCard = new ModifyGroupMemberFlag("kModifyGroupMemberNameCard", internalJNI.kModifyGroupMemberNameCard_get());
    swigValues = new ModifyGroupMemberFlag[] { kModifyGroupMemberNone, kModifyGroupMemberMsgFlag, kModifyGroupMemberRole, kModifyGroupMemberShutupTime, kModifyGroupMemberNameCard };
  }
  
  private ModifyGroupMemberFlag(String paramString)
  {
    this.swigName = paramString;
    int i = swigNext;
    swigNext = i + 1;
    this.swigValue = i;
  }
  
  private ModifyGroupMemberFlag(String paramString, int paramInt)
  {
    this.swigName = paramString;
    this.swigValue = paramInt;
    swigNext = paramInt + 1;
  }
  
  private ModifyGroupMemberFlag(String paramString, ModifyGroupMemberFlag paramModifyGroupMemberFlag)
  {
    this.swigName = paramString;
    this.swigValue = paramModifyGroupMemberFlag.swigValue;
    swigNext = this.swigValue + 1;
  }
  
  public static ModifyGroupMemberFlag swigToEnum(int paramInt)
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
    throw new IllegalArgumentException("No enum " + ModifyGroupMemberFlag.class + " with value " + paramInt);
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


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\ModifyGroupMemberFlag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */