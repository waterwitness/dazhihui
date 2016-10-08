package com.tencent.imcore;

public class GroupReportElem
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public GroupReportElem()
  {
    this(internalJNI.new_GroupReportElem(), true);
  }
  
  protected GroupReportElem(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(GroupReportElem paramGroupReportElem)
  {
    if (paramGroupReportElem == null) {
      return 0L;
    }
    return paramGroupReportElem.swigCPtr;
  }
  
  public void delete()
  {
    try
    {
      if (this.swigCPtr != 0L)
      {
        if (this.swigCMemOwn)
        {
          this.swigCMemOwn = false;
          internalJNI.delete_GroupReportElem(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  protected void finalize()
  {
    delete();
  }
  
  public byte[] getAuthentication()
  {
    return internalJNI.GroupReportElem_authentication_get(this.swigCPtr, this);
  }
  
  public String getGroup()
  {
    return internalJNI.GroupReportElem_group_get(this.swigCPtr, this);
  }
  
  public String getGroup_name()
  {
    return internalJNI.GroupReportElem_group_name_get(this.swigCPtr, this);
  }
  
  public byte[] getMsg()
  {
    return internalJNI.GroupReportElem_msg_get(this.swigCPtr, this);
  }
  
  public long getMsg_key()
  {
    return internalJNI.GroupReportElem_msg_key_get(this.swigCPtr, this);
  }
  
  public NewGroupMemberInfo getOperator_group_member_info()
  {
    long l = internalJNI.GroupReportElem_operator_group_member_info_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new NewGroupMemberInfo(l, false);
  }
  
  public String getOperator_user()
  {
    return internalJNI.GroupReportElem_operator_user_get(this.swigCPtr, this);
  }
  
  public FriendProfile getOperator_user_info()
  {
    long l = internalJNI.GroupReportElem_operator_user_info_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new FriendProfile(l, false);
  }
  
  public byte[] getPlatform()
  {
    return internalJNI.GroupReportElem_platform_get(this.swigCPtr, this);
  }
  
  public long getType()
  {
    return internalJNI.GroupReportElem_type_get(this.swigCPtr, this);
  }
  
  public byte[] getUser_data()
  {
    return internalJNI.GroupReportElem_user_data_get(this.swigCPtr, this);
  }
  
  public void setAuthentication(byte[] paramArrayOfByte)
  {
    internalJNI.GroupReportElem_authentication_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setGroup(String paramString)
  {
    internalJNI.GroupReportElem_group_set(this.swigCPtr, this, paramString);
  }
  
  public void setGroup_name(String paramString)
  {
    internalJNI.GroupReportElem_group_name_set(this.swigCPtr, this, paramString);
  }
  
  public void setMsg(byte[] paramArrayOfByte)
  {
    internalJNI.GroupReportElem_msg_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setMsg_key(long paramLong)
  {
    internalJNI.GroupReportElem_msg_key_set(this.swigCPtr, this, paramLong);
  }
  
  public void setOperator_group_member_info(NewGroupMemberInfo paramNewGroupMemberInfo)
  {
    internalJNI.GroupReportElem_operator_group_member_info_set(this.swigCPtr, this, NewGroupMemberInfo.getCPtr(paramNewGroupMemberInfo), paramNewGroupMemberInfo);
  }
  
  public void setOperator_user(String paramString)
  {
    internalJNI.GroupReportElem_operator_user_set(this.swigCPtr, this, paramString);
  }
  
  public void setOperator_user_info(FriendProfile paramFriendProfile)
  {
    internalJNI.GroupReportElem_operator_user_info_set(this.swigCPtr, this, FriendProfile.getCPtr(paramFriendProfile), paramFriendProfile);
  }
  
  public void setPlatform(byte[] paramArrayOfByte)
  {
    internalJNI.GroupReportElem_platform_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setType(long paramLong)
  {
    internalJNI.GroupReportElem_type_set(this.swigCPtr, this, paramLong);
  }
  
  public void setUser_data(byte[] paramArrayOfByte)
  {
    internalJNI.GroupReportElem_user_data_set(this.swigCPtr, this, paramArrayOfByte);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\GroupReportElem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */