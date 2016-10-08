package com.tencent.imcore;

public class GroupManager
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  protected GroupManager(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  public GroupManager(String paramString)
  {
    this(internalJNI.new_GroupManager(paramString), true);
  }
  
  protected static long getCPtr(GroupManager paramGroupManager)
  {
    if (paramGroupManager == null) {
      return 0L;
    }
    return paramGroupManager.swigCPtr;
  }
  
  public boolean applyJoinGroup(String paramString1, String paramString2, IGroupNotifyCallback paramIGroupNotifyCallback)
  {
    return internalJNI.GroupManager_applyJoinGroup(this.swigCPtr, this, paramString1, paramString2, IGroupNotifyCallback.getCPtr(paramIGroupNotifyCallback), paramIGroupNotifyCallback);
  }
  
  public boolean createGroup(NewGroupInfo paramNewGroupInfo, ICreateGroupCallback paramICreateGroupCallback)
  {
    return internalJNI.GroupManager_createGroup__SWIG_1(this.swigCPtr, this, NewGroupInfo.getCPtr(paramNewGroupInfo), paramNewGroupInfo, ICreateGroupCallback.getCPtr(paramICreateGroupCallback), paramICreateGroupCallback);
  }
  
  public boolean createGroup(String paramString, StrVec paramStrVec, byte[] paramArrayOfByte, ICreateGroupCallback paramICreateGroupCallback)
  {
    return internalJNI.GroupManager_createGroup__SWIG_0(this.swigCPtr, this, paramString, StrVec.getCPtr(paramStrVec), paramStrVec, paramArrayOfByte, ICreateGroupCallback.getCPtr(paramICreateGroupCallback), paramICreateGroupCallback);
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
          internalJNI.delete_GroupManager(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public boolean deleteGroup(String paramString, IGroupNotifyCallback paramIGroupNotifyCallback)
  {
    return internalJNI.GroupManager_deleteGroup(this.swigCPtr, this, paramString, IGroupNotifyCallback.getCPtr(paramIGroupNotifyCallback), paramIGroupNotifyCallback);
  }
  
  public boolean deleteGroupMember(String paramString, StrVec paramStrVec, IGroupMemberResultCallback paramIGroupMemberResultCallback)
  {
    return internalJNI.GroupManager_deleteGroupMember__SWIG_1(this.swigCPtr, this, paramString, StrVec.getCPtr(paramStrVec), paramStrVec, IGroupMemberResultCallback.getCPtr(paramIGroupMemberResultCallback), paramIGroupMemberResultCallback);
  }
  
  public boolean deleteGroupMember(String paramString, StrVec paramStrVec, IGroupMemberResultCallback paramIGroupMemberResultCallback, byte[] paramArrayOfByte)
  {
    return internalJNI.GroupManager_deleteGroupMember__SWIG_0(this.swigCPtr, this, paramString, StrVec.getCPtr(paramStrVec), paramStrVec, IGroupMemberResultCallback.getCPtr(paramIGroupMemberResultCallback), paramIGroupMemberResultCallback, paramArrayOfByte);
  }
  
  protected void finalize()
  {
    delete();
  }
  
  public boolean getGroupBaseInfo(GetGroupBaseInfoOption paramGetGroupBaseInfoOption, IGroupInfoListCallback paramIGroupInfoListCallback)
  {
    return internalJNI.GroupManager_getGroupBaseInfo__SWIG_1(this.swigCPtr, this, GetGroupBaseInfoOption.getCPtr(paramGetGroupBaseInfoOption), paramGetGroupBaseInfoOption, IGroupInfoListCallback.getCPtr(paramIGroupInfoListCallback), paramIGroupInfoListCallback);
  }
  
  public boolean getGroupBaseInfo(StrVec paramStrVec, IGroupInfoListCallback paramIGroupInfoListCallback)
  {
    return internalJNI.GroupManager_getGroupBaseInfo__SWIG_0(this.swigCPtr, this, StrVec.getCPtr(paramStrVec), paramStrVec, IGroupInfoListCallback.getCPtr(paramIGroupInfoListCallback), paramIGroupInfoListCallback);
  }
  
  public boolean getGroupList(boolean paramBoolean, IGroupListCallback paramIGroupListCallback)
  {
    return internalJNI.GroupManager_getGroupList(this.swigCPtr, this, paramBoolean, IGroupListCallback.getCPtr(paramIGroupListCallback), paramIGroupListCallback);
  }
  
  public boolean getGroupMembers(String paramString, IGroupMemberCallback paramIGroupMemberCallback)
  {
    return internalJNI.GroupManager_getGroupMembers(this.swigCPtr, this, paramString, IGroupMemberCallback.getCPtr(paramIGroupMemberCallback), paramIGroupMemberCallback);
  }
  
  public boolean getGroupMembersByFilter(String paramString, long paramLong1, GroupMemRoleFilter paramGroupMemRoleFilter, BytesVec paramBytesVec, long paramLong2, IGroupMemberCallbackV2 paramIGroupMemberCallbackV2)
  {
    return internalJNI.GroupManager_getGroupMembersByFilter(this.swigCPtr, this, paramString, paramLong1, paramGroupMemRoleFilter.swigValue(), BytesVec.getCPtr(paramBytesVec), paramBytesVec, paramLong2, IGroupMemberCallbackV2.getCPtr(paramIGroupMemberCallbackV2), paramIGroupMemberCallbackV2);
  }
  
  public boolean getGroupMembersInfo(GetGroupMemInfoOption paramGetGroupMemInfoOption, IGroupMemberCallback paramIGroupMemberCallback)
  {
    return internalJNI.GroupManager_getGroupMembersInfo__SWIG_1(this.swigCPtr, this, GetGroupMemInfoOption.getCPtr(paramGetGroupMemInfoOption), paramGetGroupMemInfoOption, IGroupMemberCallback.getCPtr(paramIGroupMemberCallback), paramIGroupMemberCallback);
  }
  
  public boolean getGroupMembersInfo(String paramString, StrVec paramStrVec, IGroupMemberCallback paramIGroupMemberCallback)
  {
    return internalJNI.GroupManager_getGroupMembersInfo__SWIG_0(this.swigCPtr, this, paramString, StrVec.getCPtr(paramStrVec), paramStrVec, IGroupMemberCallback.getCPtr(paramIGroupMemberCallback), paramIGroupMemberCallback);
  }
  
  public boolean getGroupMembersV2(String paramString, long paramLong1, BytesVec paramBytesVec, long paramLong2, IGroupMemberCallbackV2 paramIGroupMemberCallbackV2)
  {
    return internalJNI.GroupManager_getGroupMembersV2(this.swigCPtr, this, paramString, paramLong1, BytesVec.getCPtr(paramBytesVec), paramBytesVec, paramLong2, IGroupMemberCallbackV2.getCPtr(paramIGroupMemberCallbackV2), paramIGroupMemberCallbackV2);
  }
  
  public boolean getGroupPublicInfo(StrVec paramStrVec, IGroupInfoListCallback paramIGroupInfoListCallback)
  {
    return internalJNI.GroupManager_getGroupPublicInfo(this.swigCPtr, this, StrVec.getCPtr(paramStrVec), paramStrVec, IGroupInfoListCallback.getCPtr(paramIGroupInfoListCallback), paramIGroupInfoListCallback);
  }
  
  public boolean getGroupPublicInfoV2(StrVec paramStrVec, long paramLong, BytesVec paramBytesVec, IGroupInfoListCallback paramIGroupInfoListCallback)
  {
    return internalJNI.GroupManager_getGroupPublicInfoV2(this.swigCPtr, this, StrVec.getCPtr(paramStrVec), paramStrVec, paramLong, BytesVec.getCPtr(paramBytesVec), paramBytesVec, IGroupInfoListCallback.getCPtr(paramIGroupInfoListCallback), paramIGroupInfoListCallback);
  }
  
  public boolean getMsgSeq(String paramString, SWIGTYPE_p_std__functionT_void_fF_t paramSWIGTYPE_p_std__functionT_void_fF_t, SWIGTYPE_p_std__functionT_void_fint_std__string_const_RF_t paramSWIGTYPE_p_std__functionT_void_fint_std__string_const_RF_t)
  {
    return internalJNI.GroupManager_getMsgSeq(this.swigCPtr, this, paramString, SWIGTYPE_p_std__functionT_void_fF_t.getCPtr(paramSWIGTYPE_p_std__functionT_void_fF_t), SWIGTYPE_p_std__functionT_void_fint_std__string_const_RF_t.getCPtr(paramSWIGTYPE_p_std__functionT_void_fint_std__string_const_RF_t));
  }
  
  public boolean getPendency(GetGroupPendencyOption paramGetGroupPendencyOption, IGroupGetPendencyCallback paramIGroupGetPendencyCallback)
  {
    return internalJNI.GroupManager_getPendency(this.swigCPtr, this, GetGroupPendencyOption.getCPtr(paramGetGroupPendencyOption), paramGetGroupPendencyOption, IGroupGetPendencyCallback.getCPtr(paramIGroupGetPendencyCallback), paramIGroupGetPendencyCallback);
  }
  
  public boolean getSelfInfo(String paramString, IGroupMemberCallback paramIGroupMemberCallback)
  {
    return internalJNI.GroupManager_getSelfInfo(this.swigCPtr, this, paramString, IGroupMemberCallback.getCPtr(paramIGroupMemberCallback), paramIGroupMemberCallback);
  }
  
  public boolean handleInviteRequest(String paramString1, String paramString2, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, long paramLong1, long paramLong2, byte[] paramArrayOfByte3, IGroupNotifyCallback paramIGroupNotifyCallback)
  {
    return internalJNI.GroupManager_handleInviteRequest(this.swigCPtr, this, paramString1, paramString2, paramArrayOfByte1, paramArrayOfByte2, paramLong1, paramLong2, paramArrayOfByte3, IGroupNotifyCallback.getCPtr(paramIGroupNotifyCallback), paramIGroupNotifyCallback);
  }
  
  public boolean handleJoinRequest(String paramString1, String paramString2, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, long paramLong1, long paramLong2, byte[] paramArrayOfByte3, IGroupNotifyCallback paramIGroupNotifyCallback)
  {
    return internalJNI.GroupManager_handleJoinRequest(this.swigCPtr, this, paramString1, paramString2, paramArrayOfByte1, paramArrayOfByte2, paramLong1, paramLong2, paramArrayOfByte3, IGroupNotifyCallback.getCPtr(paramIGroupNotifyCallback), paramIGroupNotifyCallback);
  }
  
  public boolean inviteGroupMember(String paramString, StrVec paramStrVec, IGroupMemberResultCallback paramIGroupMemberResultCallback)
  {
    return internalJNI.GroupManager_inviteGroupMember(this.swigCPtr, this, paramString, StrVec.getCPtr(paramStrVec), paramStrVec, IGroupMemberResultCallback.getCPtr(paramIGroupMemberResultCallback), paramIGroupMemberResultCallback);
  }
  
  public boolean modifyGroupBaseInfo(ModifyGroupBaseInfoOption paramModifyGroupBaseInfoOption, IGroupNotifyCallback paramIGroupNotifyCallback)
  {
    return internalJNI.GroupManager_modifyGroupBaseInfo__SWIG_1(this.swigCPtr, this, ModifyGroupBaseInfoOption.getCPtr(paramModifyGroupBaseInfoOption), paramModifyGroupBaseInfoOption, IGroupNotifyCallback.getCPtr(paramIGroupNotifyCallback), paramIGroupNotifyCallback);
  }
  
  public boolean modifyGroupBaseInfo(String paramString, long paramLong1, byte[] paramArrayOfByte, long paramLong2, IGroupNotifyCallback paramIGroupNotifyCallback)
  {
    return internalJNI.GroupManager_modifyGroupBaseInfo__SWIG_0(this.swigCPtr, this, paramString, paramLong1, paramArrayOfByte, paramLong2, IGroupNotifyCallback.getCPtr(paramIGroupNotifyCallback), paramIGroupNotifyCallback);
  }
  
  public boolean modifyGroupMemberInfo(ModifyGroupMemberInfoOption paramModifyGroupMemberInfoOption, IGroupNotifyCallback paramIGroupNotifyCallback)
  {
    return internalJNI.GroupManager_modifyGroupMemberInfo__SWIG_1(this.swigCPtr, this, ModifyGroupMemberInfoOption.getCPtr(paramModifyGroupMemberInfoOption), paramModifyGroupMemberInfoOption, IGroupNotifyCallback.getCPtr(paramIGroupNotifyCallback), paramIGroupNotifyCallback);
  }
  
  public boolean modifyGroupMemberInfo(String paramString1, String paramString2, long paramLong1, long paramLong2, IGroupNotifyCallback paramIGroupNotifyCallback)
  {
    return internalJNI.GroupManager_modifyGroupMemberInfo__SWIG_0(this.swigCPtr, this, paramString1, paramString2, paramLong1, paramLong2, IGroupNotifyCallback.getCPtr(paramIGroupNotifyCallback), paramIGroupNotifyCallback);
  }
  
  public boolean modifyGroupOwner(String paramString1, String paramString2, IGroupNotifyCallback paramIGroupNotifyCallback)
  {
    return internalJNI.GroupManager_modifyGroupOwner(this.swigCPtr, this, paramString1, paramString2, IGroupNotifyCallback.getCPtr(paramIGroupNotifyCallback), paramIGroupNotifyCallback);
  }
  
  public boolean pendencyReport(long paramLong, IGroupNotifyCallback paramIGroupNotifyCallback)
  {
    return internalJNI.GroupManager_pendencyReport(this.swigCPtr, this, paramLong, IGroupNotifyCallback.getCPtr(paramIGroupNotifyCallback), paramIGroupNotifyCallback);
  }
  
  public boolean quitGroup(String paramString, IGroupNotifyCallback paramIGroupNotifyCallback)
  {
    return internalJNI.GroupManager_quitGroup(this.swigCPtr, this, paramString, IGroupNotifyCallback.getCPtr(paramIGroupNotifyCallback), paramIGroupNotifyCallback);
  }
  
  public boolean searchGroupByName(String paramString, long paramLong1, BytesVec paramBytesVec, long paramLong2, long paramLong3, IGroupInfoListCallbackV2 paramIGroupInfoListCallbackV2)
  {
    return internalJNI.GroupManager_searchGroupByName(this.swigCPtr, this, paramString, paramLong1, BytesVec.getCPtr(paramBytesVec), paramBytesVec, paramLong2, paramLong3, IGroupInfoListCallbackV2.getCPtr(paramIGroupInfoListCallbackV2), paramIGroupInfoListCallbackV2);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\GroupManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */