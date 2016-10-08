package com.tencent.imcore;

public class GroupBaseInfo
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public GroupBaseInfo()
  {
    this(internalJNI.new_GroupBaseInfo(), true);
  }
  
  protected GroupBaseInfo(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(GroupBaseInfo paramGroupBaseInfo)
  {
    if (paramGroupBaseInfo == null) {
      return 0L;
    }
    return paramGroupBaseInfo.swigCPtr;
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
          internalJNI.delete_GroupBaseInfo(this.swigCPtr);
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
  
  public long getDwInfoSeq()
  {
    return internalJNI.GroupBaseInfo_dwInfoSeq_get(this.swigCPtr, this);
  }
  
  public long getDwMsgFalg()
  {
    return internalJNI.GroupBaseInfo_dwMsgFalg_get(this.swigCPtr, this);
  }
  
  public long getDwMsgSeq()
  {
    return internalJNI.GroupBaseInfo_dwMsgSeq_get(this.swigCPtr, this);
  }
  
  public long getDwReadSeq()
  {
    return internalJNI.GroupBaseInfo_dwReadSeq_get(this.swigCPtr, this);
  }
  
  public byte[] getSFaceUrl()
  {
    return internalJNI.GroupBaseInfo_sFaceUrl_get(this.swigCPtr, this);
  }
  
  public String getSGroupId()
  {
    return internalJNI.GroupBaseInfo_sGroupId_get(this.swigCPtr, this);
  }
  
  public byte[] getSGroupName()
  {
    return internalJNI.GroupBaseInfo_sGroupName_get(this.swigCPtr, this);
  }
  
  public String getSGroupType()
  {
    return internalJNI.GroupBaseInfo_sGroupType_get(this.swigCPtr, this);
  }
  
  public GroupSelfInfo getStSelfInfo()
  {
    long l = internalJNI.GroupBaseInfo_stSelfInfo_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new GroupSelfInfo(l, false);
  }
  
  public void setDwInfoSeq(long paramLong)
  {
    internalJNI.GroupBaseInfo_dwInfoSeq_set(this.swigCPtr, this, paramLong);
  }
  
  public void setDwMsgFalg(long paramLong)
  {
    internalJNI.GroupBaseInfo_dwMsgFalg_set(this.swigCPtr, this, paramLong);
  }
  
  public void setDwMsgSeq(long paramLong)
  {
    internalJNI.GroupBaseInfo_dwMsgSeq_set(this.swigCPtr, this, paramLong);
  }
  
  public void setDwReadSeq(long paramLong)
  {
    internalJNI.GroupBaseInfo_dwReadSeq_set(this.swigCPtr, this, paramLong);
  }
  
  public void setSFaceUrl(byte[] paramArrayOfByte)
  {
    internalJNI.GroupBaseInfo_sFaceUrl_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setSGroupId(String paramString)
  {
    internalJNI.GroupBaseInfo_sGroupId_set(this.swigCPtr, this, paramString);
  }
  
  public void setSGroupName(byte[] paramArrayOfByte)
  {
    internalJNI.GroupBaseInfo_sGroupName_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setSGroupType(String paramString)
  {
    internalJNI.GroupBaseInfo_sGroupType_set(this.swigCPtr, this, paramString);
  }
  
  public void setStSelfInfo(GroupSelfInfo paramGroupSelfInfo)
  {
    internalJNI.GroupBaseInfo_stSelfInfo_set(this.swigCPtr, this, GroupSelfInfo.getCPtr(paramGroupSelfInfo), paramGroupSelfInfo);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\GroupBaseInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */