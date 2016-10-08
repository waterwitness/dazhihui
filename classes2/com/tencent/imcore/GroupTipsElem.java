package com.tencent.imcore;

public class GroupTipsElem
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public GroupTipsElem()
  {
    this(internalJNI.new_GroupTipsElem(), true);
  }
  
  protected GroupTipsElem(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(GroupTipsElem paramGroupTipsElem)
  {
    if (paramGroupTipsElem == null) {
      return 0L;
    }
    return paramGroupTipsElem.swigCPtr;
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
          internalJNI.delete_GroupTipsElem(this.swigCPtr);
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
  
  public SWIGTYPE_p_std__mapT_std__string_imcore__NewGroupMemberInfo_t getChanged_group_member_info()
  {
    long l = internalJNI.GroupTipsElem_changed_group_member_info_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new SWIGTYPE_p_std__mapT_std__string_imcore__NewGroupMemberInfo_t(l, false);
  }
  
  public SWIGTYPE_p_std__mapT_std__string_imcore__FriendProfile_t getChanged_user_info()
  {
    long l = internalJNI.GroupTipsElem_changed_user_info_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new SWIGTYPE_p_std__mapT_std__string_imcore__FriendProfile_t(l, false);
  }
  
  public GroupTipsElem_GroupInfoVec getGroup_change_list()
  {
    long l = internalJNI.GroupTipsElem_group_change_list_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new GroupTipsElem_GroupInfoVec(l, false);
  }
  
  public byte[] getGroup_id()
  {
    return internalJNI.GroupTipsElem_group_id_get(this.swigCPtr, this);
  }
  
  public byte[] getGroup_name()
  {
    return internalJNI.GroupTipsElem_group_name_get(this.swigCPtr, this);
  }
  
  public GroupTipsElem_MemberInfoVec getMember_change_list()
  {
    long l = internalJNI.GroupTipsElem_member_change_list_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new GroupTipsElem_MemberInfoVec(l, false);
  }
  
  public NewGroupMemberInfo getOp_group_member_info()
  {
    long l = internalJNI.GroupTipsElem_op_group_member_info_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new NewGroupMemberInfo(l, false);
  }
  
  public String getOp_user()
  {
    return internalJNI.GroupTipsElem_op_user_get(this.swigCPtr, this);
  }
  
  public FriendProfile getOp_user_info()
  {
    long l = internalJNI.GroupTipsElem_op_user_info_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new FriendProfile(l, false);
  }
  
  public byte[] getPlatform()
  {
    return internalJNI.GroupTipsElem_platform_get(this.swigCPtr, this);
  }
  
  public long getTime()
  {
    return internalJNI.GroupTipsElem_time_get(this.swigCPtr, this);
  }
  
  public int getType()
  {
    return internalJNI.GroupTipsElem_type_get(this.swigCPtr, this);
  }
  
  public StrVec getUser_list()
  {
    long l = internalJNI.GroupTipsElem_user_list_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new StrVec(l, false);
  }
  
  public void setChanged_group_member_info(SWIGTYPE_p_std__mapT_std__string_imcore__NewGroupMemberInfo_t paramSWIGTYPE_p_std__mapT_std__string_imcore__NewGroupMemberInfo_t)
  {
    internalJNI.GroupTipsElem_changed_group_member_info_set(this.swigCPtr, this, SWIGTYPE_p_std__mapT_std__string_imcore__NewGroupMemberInfo_t.getCPtr(paramSWIGTYPE_p_std__mapT_std__string_imcore__NewGroupMemberInfo_t));
  }
  
  public void setChanged_user_info(SWIGTYPE_p_std__mapT_std__string_imcore__FriendProfile_t paramSWIGTYPE_p_std__mapT_std__string_imcore__FriendProfile_t)
  {
    internalJNI.GroupTipsElem_changed_user_info_set(this.swigCPtr, this, SWIGTYPE_p_std__mapT_std__string_imcore__FriendProfile_t.getCPtr(paramSWIGTYPE_p_std__mapT_std__string_imcore__FriendProfile_t));
  }
  
  public void setGroup_change_list(GroupTipsElem_GroupInfoVec paramGroupTipsElem_GroupInfoVec)
  {
    internalJNI.GroupTipsElem_group_change_list_set(this.swigCPtr, this, GroupTipsElem_GroupInfoVec.getCPtr(paramGroupTipsElem_GroupInfoVec), paramGroupTipsElem_GroupInfoVec);
  }
  
  public void setGroup_id(byte[] paramArrayOfByte)
  {
    internalJNI.GroupTipsElem_group_id_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setGroup_name(byte[] paramArrayOfByte)
  {
    internalJNI.GroupTipsElem_group_name_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setMember_change_list(GroupTipsElem_MemberInfoVec paramGroupTipsElem_MemberInfoVec)
  {
    internalJNI.GroupTipsElem_member_change_list_set(this.swigCPtr, this, GroupTipsElem_MemberInfoVec.getCPtr(paramGroupTipsElem_MemberInfoVec), paramGroupTipsElem_MemberInfoVec);
  }
  
  public void setOp_group_member_info(NewGroupMemberInfo paramNewGroupMemberInfo)
  {
    internalJNI.GroupTipsElem_op_group_member_info_set(this.swigCPtr, this, NewGroupMemberInfo.getCPtr(paramNewGroupMemberInfo), paramNewGroupMemberInfo);
  }
  
  public void setOp_user(String paramString)
  {
    internalJNI.GroupTipsElem_op_user_set(this.swigCPtr, this, paramString);
  }
  
  public void setOp_user_info(FriendProfile paramFriendProfile)
  {
    internalJNI.GroupTipsElem_op_user_info_set(this.swigCPtr, this, FriendProfile.getCPtr(paramFriendProfile), paramFriendProfile);
  }
  
  public void setPlatform(byte[] paramArrayOfByte)
  {
    internalJNI.GroupTipsElem_platform_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setTime(long paramLong)
  {
    internalJNI.GroupTipsElem_time_set(this.swigCPtr, this, paramLong);
  }
  
  public void setType(int paramInt)
  {
    internalJNI.GroupTipsElem_type_set(this.swigCPtr, this, paramInt);
  }
  
  public void setUser_list(StrVec paramStrVec)
  {
    internalJNI.GroupTipsElem_user_list_set(this.swigCPtr, this, StrVec.getCPtr(paramStrVec), paramStrVec);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\GroupTipsElem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */