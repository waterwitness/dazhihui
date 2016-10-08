package com.tencent.imcore;

public class GroupCacheInfo
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public GroupCacheInfo()
  {
    this(internalJNI.new_GroupCacheInfo(), true);
  }
  
  protected GroupCacheInfo(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(GroupCacheInfo paramGroupCacheInfo)
  {
    if (paramGroupCacheInfo == null) {
      return 0L;
    }
    return paramGroupCacheInfo.swigCPtr;
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
          internalJNI.delete_GroupCacheInfo(this.swigCPtr);
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
  
  public GroupDetailInfo getGroupInfo()
  {
    long l = internalJNI.GroupCacheInfo_groupInfo_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new GroupDetailInfo(l, false);
  }
  
  public GroupSelfInfo getSelfInfo()
  {
    long l = internalJNI.GroupCacheInfo_selfInfo_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new GroupSelfInfo(l, false);
  }
  
  public void setGroupInfo(GroupDetailInfo paramGroupDetailInfo)
  {
    internalJNI.GroupCacheInfo_groupInfo_set(this.swigCPtr, this, GroupDetailInfo.getCPtr(paramGroupDetailInfo), paramGroupDetailInfo);
  }
  
  public void setSelfInfo(GroupSelfInfo paramGroupSelfInfo)
  {
    internalJNI.GroupCacheInfo_selfInfo_set(this.swigCPtr, this, GroupSelfInfo.getCPtr(paramGroupSelfInfo), paramGroupSelfInfo);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\GroupCacheInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */