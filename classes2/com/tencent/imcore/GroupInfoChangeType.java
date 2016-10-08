package com.tencent.imcore;

public final class GroupInfoChangeType
{
  public static final GroupInfoChangeType IMCORE_GROUP_INFO_CHAGE_TYPE_FACE_URL;
  public static final GroupInfoChangeType IMCORE_GROUP_INFO_CHAGE_TYPE_GROUP_NAME = new GroupInfoChangeType("IMCORE_GROUP_INFO_CHAGE_TYPE_GROUP_NAME", internalJNI.IMCORE_GROUP_INFO_CHAGE_TYPE_GROUP_NAME_get());
  public static final GroupInfoChangeType IMCORE_GROUP_INFO_CHAGE_TYPE_INTRODUCTION = new GroupInfoChangeType("IMCORE_GROUP_INFO_CHAGE_TYPE_INTRODUCTION", internalJNI.IMCORE_GROUP_INFO_CHAGE_TYPE_INTRODUCTION_get());
  public static final GroupInfoChangeType IMCORE_GROUP_INFO_CHAGE_TYPE_NOTIFACTION = new GroupInfoChangeType("IMCORE_GROUP_INFO_CHAGE_TYPE_NOTIFACTION", internalJNI.IMCORE_GROUP_INFO_CHAGE_TYPE_NOTIFACTION_get());
  public static final GroupInfoChangeType IMCORE_GROUP_INFO_CHAGE_TYPE_OWNER;
  private static int swigNext = 0;
  private static GroupInfoChangeType[] swigValues;
  private final String swigName;
  private final int swigValue;
  
  static
  {
    IMCORE_GROUP_INFO_CHAGE_TYPE_FACE_URL = new GroupInfoChangeType("IMCORE_GROUP_INFO_CHAGE_TYPE_FACE_URL", internalJNI.IMCORE_GROUP_INFO_CHAGE_TYPE_FACE_URL_get());
    IMCORE_GROUP_INFO_CHAGE_TYPE_OWNER = new GroupInfoChangeType("IMCORE_GROUP_INFO_CHAGE_TYPE_OWNER", internalJNI.IMCORE_GROUP_INFO_CHAGE_TYPE_OWNER_get());
    swigValues = new GroupInfoChangeType[] { IMCORE_GROUP_INFO_CHAGE_TYPE_GROUP_NAME, IMCORE_GROUP_INFO_CHAGE_TYPE_INTRODUCTION, IMCORE_GROUP_INFO_CHAGE_TYPE_NOTIFACTION, IMCORE_GROUP_INFO_CHAGE_TYPE_FACE_URL, IMCORE_GROUP_INFO_CHAGE_TYPE_OWNER };
  }
  
  private GroupInfoChangeType(String paramString)
  {
    this.swigName = paramString;
    int i = swigNext;
    swigNext = i + 1;
    this.swigValue = i;
  }
  
  private GroupInfoChangeType(String paramString, int paramInt)
  {
    this.swigName = paramString;
    this.swigValue = paramInt;
    swigNext = paramInt + 1;
  }
  
  private GroupInfoChangeType(String paramString, GroupInfoChangeType paramGroupInfoChangeType)
  {
    this.swigName = paramString;
    this.swigValue = paramGroupInfoChangeType.swigValue;
    swigNext = this.swigValue + 1;
  }
  
  public static GroupInfoChangeType swigToEnum(int paramInt)
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
    throw new IllegalArgumentException("No enum " + GroupInfoChangeType.class + " with value " + paramInt);
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


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\GroupInfoChangeType.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */