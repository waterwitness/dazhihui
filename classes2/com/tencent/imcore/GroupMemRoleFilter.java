package com.tencent.imcore;

public final class GroupMemRoleFilter
{
  public static final GroupMemRoleFilter kGroupMemRoleAdmin;
  public static final GroupMemRoleFilter kGroupMemRoleCommon_member;
  public static final GroupMemRoleFilter kGroupMemRoleOwner;
  public static final GroupMemRoleFilter kGroupMemberAll = new GroupMemRoleFilter("kGroupMemberAll", internalJNI.kGroupMemberAll_get());
  private static int swigNext = 0;
  private static GroupMemRoleFilter[] swigValues;
  private final String swigName;
  private final int swigValue;
  
  static
  {
    kGroupMemRoleOwner = new GroupMemRoleFilter("kGroupMemRoleOwner", internalJNI.kGroupMemRoleOwner_get());
    kGroupMemRoleAdmin = new GroupMemRoleFilter("kGroupMemRoleAdmin", internalJNI.kGroupMemRoleAdmin_get());
    kGroupMemRoleCommon_member = new GroupMemRoleFilter("kGroupMemRoleCommon_member", internalJNI.kGroupMemRoleCommon_member_get());
    swigValues = new GroupMemRoleFilter[] { kGroupMemberAll, kGroupMemRoleOwner, kGroupMemRoleAdmin, kGroupMemRoleCommon_member };
  }
  
  private GroupMemRoleFilter(String paramString)
  {
    this.swigName = paramString;
    int i = swigNext;
    swigNext = i + 1;
    this.swigValue = i;
  }
  
  private GroupMemRoleFilter(String paramString, int paramInt)
  {
    this.swigName = paramString;
    this.swigValue = paramInt;
    swigNext = paramInt + 1;
  }
  
  private GroupMemRoleFilter(String paramString, GroupMemRoleFilter paramGroupMemRoleFilter)
  {
    this.swigName = paramString;
    this.swigValue = paramGroupMemRoleFilter.swigValue;
    swigNext = this.swigValue + 1;
  }
  
  public static GroupMemRoleFilter swigToEnum(int paramInt)
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
    throw new IllegalArgumentException("No enum " + GroupMemRoleFilter.class + " with value " + paramInt);
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


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\GroupMemRoleFilter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */