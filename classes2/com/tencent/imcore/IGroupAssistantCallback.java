package com.tencent.imcore;

public class IGroupAssistantCallback
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public IGroupAssistantCallback()
  {
    this(internalJNI.new_IGroupAssistantCallback(), true);
    internalJNI.IGroupAssistantCallback_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
  }
  
  protected IGroupAssistantCallback(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(IGroupAssistantCallback paramIGroupAssistantCallback)
  {
    if (paramIGroupAssistantCallback == null) {
      return 0L;
    }
    return paramIGroupAssistantCallback.swigCPtr;
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
          internalJNI.delete_IGroupAssistantCallback(this.swigCPtr);
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
  
  public void onGroupAdd(GroupCacheInfo paramGroupCacheInfo)
  {
    if (getClass() == IGroupAssistantCallback.class)
    {
      internalJNI.IGroupAssistantCallback_onGroupAdd(this.swigCPtr, this, GroupCacheInfo.getCPtr(paramGroupCacheInfo), paramGroupCacheInfo);
      return;
    }
    internalJNI.IGroupAssistantCallback_onGroupAddSwigExplicitIGroupAssistantCallback(this.swigCPtr, this, GroupCacheInfo.getCPtr(paramGroupCacheInfo), paramGroupCacheInfo);
  }
  
  public void onGroupDelete(String paramString)
  {
    if (getClass() == IGroupAssistantCallback.class)
    {
      internalJNI.IGroupAssistantCallback_onGroupDelete(this.swigCPtr, this, paramString);
      return;
    }
    internalJNI.IGroupAssistantCallback_onGroupDeleteSwigExplicitIGroupAssistantCallback(this.swigCPtr, this, paramString);
  }
  
  public void onGroupUpdate(GroupCacheInfo paramGroupCacheInfo)
  {
    if (getClass() == IGroupAssistantCallback.class)
    {
      internalJNI.IGroupAssistantCallback_onGroupUpdate(this.swigCPtr, this, GroupCacheInfo.getCPtr(paramGroupCacheInfo), paramGroupCacheInfo);
      return;
    }
    internalJNI.IGroupAssistantCallback_onGroupUpdateSwigExplicitIGroupAssistantCallback(this.swigCPtr, this, GroupCacheInfo.getCPtr(paramGroupCacheInfo), paramGroupCacheInfo);
  }
  
  public void onMemberJoin(String paramString, GroupMemberInfoVec paramGroupMemberInfoVec)
  {
    if (getClass() == IGroupAssistantCallback.class)
    {
      internalJNI.IGroupAssistantCallback_onMemberJoin(this.swigCPtr, this, paramString, GroupMemberInfoVec.getCPtr(paramGroupMemberInfoVec), paramGroupMemberInfoVec);
      return;
    }
    internalJNI.IGroupAssistantCallback_onMemberJoinSwigExplicitIGroupAssistantCallback(this.swigCPtr, this, paramString, GroupMemberInfoVec.getCPtr(paramGroupMemberInfoVec), paramGroupMemberInfoVec);
  }
  
  public void onMemberQuit(String paramString, StrVec paramStrVec)
  {
    if (getClass() == IGroupAssistantCallback.class)
    {
      internalJNI.IGroupAssistantCallback_onMemberQuit(this.swigCPtr, this, paramString, StrVec.getCPtr(paramStrVec), paramStrVec);
      return;
    }
    internalJNI.IGroupAssistantCallback_onMemberQuitSwigExplicitIGroupAssistantCallback(this.swigCPtr, this, paramString, StrVec.getCPtr(paramStrVec), paramStrVec);
  }
  
  public void onMemberUpdate(String paramString, GroupMemberInfoVec paramGroupMemberInfoVec)
  {
    if (getClass() == IGroupAssistantCallback.class)
    {
      internalJNI.IGroupAssistantCallback_onMemberUpdate(this.swigCPtr, this, paramString, GroupMemberInfoVec.getCPtr(paramGroupMemberInfoVec), paramGroupMemberInfoVec);
      return;
    }
    internalJNI.IGroupAssistantCallback_onMemberUpdateSwigExplicitIGroupAssistantCallback(this.swigCPtr, this, paramString, GroupMemberInfoVec.getCPtr(paramGroupMemberInfoVec), paramGroupMemberInfoVec);
  }
  
  protected void swigDirectorDisconnect()
  {
    this.swigCMemOwn = false;
    delete();
  }
  
  public void swigReleaseOwnership()
  {
    this.swigCMemOwn = false;
    internalJNI.IGroupAssistantCallback_change_ownership(this, this.swigCPtr, false);
  }
  
  public void swigTakeOwnership()
  {
    this.swigCMemOwn = true;
    internalJNI.IGroupAssistantCallback_change_ownership(this, this.swigCPtr, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\IGroupAssistantCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */