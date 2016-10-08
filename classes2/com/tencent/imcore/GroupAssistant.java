package com.tencent.imcore;

public class GroupAssistant
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  protected GroupAssistant(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  public GroupAssistant(String paramString)
  {
    this(internalJNI.new_GroupAssistant(paramString), true);
  }
  
  protected static long getCPtr(GroupAssistant paramGroupAssistant)
  {
    if (paramGroupAssistant == null) {
      return 0L;
    }
    return paramGroupAssistant.swigCPtr;
  }
  
  public boolean checkGroupModifyOption(ModifyGroupBaseInfoOption paramModifyGroupBaseInfoOption)
  {
    return internalJNI.GroupAssistant_checkGroupModifyOption(this.swigCPtr, this, ModifyGroupBaseInfoOption.getCPtr(paramModifyGroupBaseInfoOption), paramModifyGroupBaseInfoOption);
  }
  
  public boolean checkMemberModifyOption(ModifyGroupMemberInfoOption paramModifyGroupMemberInfoOption)
  {
    return internalJNI.GroupAssistant_checkMemberModifyOption(this.swigCPtr, this, ModifyGroupMemberInfoOption.getCPtr(paramModifyGroupMemberInfoOption), paramModifyGroupMemberInfoOption);
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
          internalJNI.delete_GroupAssistant(this.swigCPtr);
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
  
  public SWIGTYPE_p_std__shared_ptrT_imcore__GroupInfoCache_t getGroupInfoCache()
  {
    return new SWIGTYPE_p_std__shared_ptrT_imcore__GroupInfoCache_t(internalJNI.GroupAssistant_getGroupInfoCache(this.swigCPtr, this), true);
  }
  
  public GroupSettings getGroupSettings()
  {
    return new GroupSettings(internalJNI.GroupAssistant_getGroupSettings(this.swigCPtr, this), false);
  }
  
  public int getGroups(StrVec paramStrVec, GroupCacheInfoVec paramGroupCacheInfoVec)
  {
    return internalJNI.GroupAssistant_getGroups(this.swigCPtr, this, StrVec.getCPtr(paramStrVec), paramStrVec, GroupCacheInfoVec.getCPtr(paramGroupCacheInfoVec), paramGroupCacheInfoVec);
  }
  
  public void init(IGroupNotifyCallback paramIGroupNotifyCallback)
  {
    internalJNI.GroupAssistant_init(this.swigCPtr, this, IGroupNotifyCallback.getCPtr(paramIGroupNotifyCallback), paramIGroupNotifyCallback);
  }
  
  public void initGroupSettings(GroupSettings paramGroupSettings)
  {
    internalJNI.GroupAssistant_initGroupSettings(this.swigCPtr, this, GroupSettings.getCPtr(paramGroupSettings), paramGroupSettings);
  }
  
  public boolean isGroupExist(String paramString)
  {
    return internalJNI.GroupAssistant_isGroupExist(this.swigCPtr, this, paramString);
  }
  
  public void onGroupAdd(String paramString)
  {
    internalJNI.GroupAssistant_onGroupAdd(this.swigCPtr, this, paramString);
  }
  
  public void onGroupDelete(String paramString)
  {
    internalJNI.GroupAssistant_onGroupDelete(this.swigCPtr, this, paramString);
  }
  
  public void onGroupSync(GroupBaseInfoVec paramGroupBaseInfoVec, IGroupNotifyCallback paramIGroupNotifyCallback)
  {
    internalJNI.GroupAssistant_onGroupSync(this.swigCPtr, this, GroupBaseInfoVec.getCPtr(paramGroupBaseInfoVec), paramGroupBaseInfoVec, IGroupNotifyCallback.getCPtr(paramIGroupNotifyCallback), paramIGroupNotifyCallback);
  }
  
  public void onGroupSystemEvent(String paramString, long paramLong)
  {
    internalJNI.GroupAssistant_onGroupSystemEvent(this.swigCPtr, this, paramString, paramLong);
  }
  
  public void onGroupTipsEvent(String paramString, GroupTipsElem paramGroupTipsElem)
  {
    internalJNI.GroupAssistant_onGroupTipsEvent(this.swigCPtr, this, paramString, GroupTipsElem.getCPtr(paramGroupTipsElem), paramGroupTipsElem);
  }
  
  public void onGroupUpdate(ModifyGroupBaseInfoOption paramModifyGroupBaseInfoOption)
  {
    internalJNI.GroupAssistant_onGroupUpdate__SWIG_0(this.swigCPtr, this, ModifyGroupBaseInfoOption.getCPtr(paramModifyGroupBaseInfoOption), paramModifyGroupBaseInfoOption);
  }
  
  public void onGroupUpdate(String paramString, GroupTipsElem_GroupInfoVec paramGroupTipsElem_GroupInfoVec)
  {
    internalJNI.GroupAssistant_onGroupUpdate__SWIG_1(this.swigCPtr, this, paramString, GroupTipsElem_GroupInfoVec.getCPtr(paramGroupTipsElem_GroupInfoVec), paramGroupTipsElem_GroupInfoVec);
  }
  
  public void onGroupUpdateOwner(String paramString1, String paramString2)
  {
    internalJNI.GroupAssistant_onGroupUpdateOwner(this.swigCPtr, this, paramString1, paramString2);
  }
  
  public void onGroupUpdateSelfInfo(String paramString, ModifyGroupMemberInfoOption paramModifyGroupMemberInfoOption)
  {
    internalJNI.GroupAssistant_onGroupUpdateSelfInfo(this.swigCPtr, this, paramString, ModifyGroupMemberInfoOption.getCPtr(paramModifyGroupMemberInfoOption), paramModifyGroupMemberInfoOption);
  }
  
  public void onMemberJoin(String paramString, SWIGTYPE_p_std__mapT_std__string_imcore__NewGroupMemberInfo_t paramSWIGTYPE_p_std__mapT_std__string_imcore__NewGroupMemberInfo_t)
  {
    internalJNI.GroupAssistant_onMemberJoin(this.swigCPtr, this, paramString, SWIGTYPE_p_std__mapT_std__string_imcore__NewGroupMemberInfo_t.getCPtr(paramSWIGTYPE_p_std__mapT_std__string_imcore__NewGroupMemberInfo_t));
  }
  
  public void onMemberQuit(String paramString, SWIGTYPE_p_std__mapT_std__string_imcore__NewGroupMemberInfo_t paramSWIGTYPE_p_std__mapT_std__string_imcore__NewGroupMemberInfo_t)
  {
    internalJNI.GroupAssistant_onMemberQuit(this.swigCPtr, this, paramString, SWIGTYPE_p_std__mapT_std__string_imcore__NewGroupMemberInfo_t.getCPtr(paramSWIGTYPE_p_std__mapT_std__string_imcore__NewGroupMemberInfo_t));
  }
  
  public void onMemberUpdate(String paramString, SWIGTYPE_p_std__mapT_std__string_imcore__NewGroupMemberInfo_t paramSWIGTYPE_p_std__mapT_std__string_imcore__NewGroupMemberInfo_t)
  {
    internalJNI.GroupAssistant_onMemberUpdate(this.swigCPtr, this, paramString, SWIGTYPE_p_std__mapT_std__string_imcore__NewGroupMemberInfo_t.getCPtr(paramSWIGTYPE_p_std__mapT_std__string_imcore__NewGroupMemberInfo_t));
  }
  
  public GetGroupBaseInfoOption prepareDefaultGetGroupOption(StrVec paramStrVec)
  {
    return new GetGroupBaseInfoOption(internalJNI.GroupAssistant_prepareDefaultGetGroupOption(this.swigCPtr, this, StrVec.getCPtr(paramStrVec), paramStrVec), true);
  }
  
  public GetGroupMemInfoOption prepareDefaultGetMemOption(String paramString, StrVec paramStrVec)
  {
    return new GetGroupMemInfoOption(internalJNI.GroupAssistant_prepareDefaultGetMemOption(this.swigCPtr, this, paramString, StrVec.getCPtr(paramStrVec), paramStrVec), true);
  }
  
  public void setCallback(IGroupAssistantCallback paramIGroupAssistantCallback)
  {
    internalJNI.GroupAssistant_setCallback(this.swigCPtr, this, IGroupAssistantCallback.getCPtr(paramIGroupAssistantCallback), paramIGroupAssistantCallback);
  }
  
  public void sync(IGroupNotifyCallback paramIGroupNotifyCallback)
  {
    internalJNI.GroupAssistant_sync(this.swigCPtr, this, IGroupNotifyCallback.getCPtr(paramIGroupNotifyCallback), paramIGroupNotifyCallback);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\GroupAssistant.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */