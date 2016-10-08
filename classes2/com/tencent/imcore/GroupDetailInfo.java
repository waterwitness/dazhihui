package com.tencent.imcore;

public class GroupDetailInfo
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public GroupDetailInfo()
  {
    this(internalJNI.new_GroupDetailInfo(), true);
  }
  
  protected GroupDetailInfo(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(GroupDetailInfo paramGroupDetailInfo)
  {
    if (paramGroupDetailInfo == null) {
      return 0L;
    }
    return paramGroupDetailInfo.swigCPtr;
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
          internalJNI.delete_GroupDetailInfo(this.swigCPtr);
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
  
  public BytesMap getCustom_info()
  {
    long l = internalJNI.GroupDetailInfo_custom_info_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new BytesMap(l, false);
  }
  
  public long getDdwOwnerTinyId()
  {
    return internalJNI.GroupDetailInfo_ddwOwnerTinyId_get(this.swigCPtr, this);
  }
  
  public long getDwAddOption()
  {
    return internalJNI.GroupDetailInfo_dwAddOption_get(this.swigCPtr, this);
  }
  
  public long getDwAppid()
  {
    return internalJNI.GroupDetailInfo_dwAppid_get(this.swigCPtr, this);
  }
  
  public long getDwCreateTime()
  {
    return internalJNI.GroupDetailInfo_dwCreateTime_get(this.swigCPtr, this);
  }
  
  public long getDwInfoSeq()
  {
    return internalJNI.GroupDetailInfo_dwInfoSeq_get(this.swigCPtr, this);
  }
  
  public long getDwLastInfoTime()
  {
    return internalJNI.GroupDetailInfo_dwLastInfoTime_get(this.swigCPtr, this);
  }
  
  public long getDwLastMsgTime()
  {
    return internalJNI.GroupDetailInfo_dwLastMsgTime_get(this.swigCPtr, this);
  }
  
  public long getDwMaxMemberNum()
  {
    return internalJNI.GroupDetailInfo_dwMaxMemberNum_get(this.swigCPtr, this);
  }
  
  public long getDwMemberNum()
  {
    return internalJNI.GroupDetailInfo_dwMemberNum_get(this.swigCPtr, this);
  }
  
  public long getDwNextMsgSeq()
  {
    return internalJNI.GroupDetailInfo_dwNextMsgSeq_get(this.swigCPtr, this);
  }
  
  public long getDwOnlineMemberNum()
  {
    return internalJNI.GroupDetailInfo_dwOnlineMemberNum_get(this.swigCPtr, this);
  }
  
  public ComStatus getESearchable()
  {
    return ComStatus.swigToEnum(internalJNI.GroupDetailInfo_eSearchable_get(this.swigCPtr, this));
  }
  
  public ComStatus getEVisible()
  {
    return ComStatus.swigToEnum(internalJNI.GroupDetailInfo_eVisible_get(this.swigCPtr, this));
  }
  
  public Msg getLastMsg()
  {
    long l = internalJNI.GroupDetailInfo_lastMsg_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new Msg(l, false);
  }
  
  public String getSFaceUrl()
  {
    return internalJNI.GroupDetailInfo_sFaceUrl_get(this.swigCPtr, this);
  }
  
  public String getSGroupId()
  {
    return internalJNI.GroupDetailInfo_sGroupId_get(this.swigCPtr, this);
  }
  
  public byte[] getSGroupName()
  {
    return internalJNI.GroupDetailInfo_sGroupName_get(this.swigCPtr, this);
  }
  
  public String getSGroupType()
  {
    return internalJNI.GroupDetailInfo_sGroupType_get(this.swigCPtr, this);
  }
  
  public byte[] getSIntroduction()
  {
    return internalJNI.GroupDetailInfo_sIntroduction_get(this.swigCPtr, this);
  }
  
  public byte[] getSNotification()
  {
    return internalJNI.GroupDetailInfo_sNotification_get(this.swigCPtr, this);
  }
  
  public String getSOwner()
  {
    return internalJNI.GroupDetailInfo_sOwner_get(this.swigCPtr, this);
  }
  
  public void setCustom_info(BytesMap paramBytesMap)
  {
    internalJNI.GroupDetailInfo_custom_info_set(this.swigCPtr, this, BytesMap.getCPtr(paramBytesMap), paramBytesMap);
  }
  
  public void setDdwOwnerTinyId(long paramLong)
  {
    internalJNI.GroupDetailInfo_ddwOwnerTinyId_set(this.swigCPtr, this, paramLong);
  }
  
  public void setDwAddOption(long paramLong)
  {
    internalJNI.GroupDetailInfo_dwAddOption_set(this.swigCPtr, this, paramLong);
  }
  
  public void setDwAppid(long paramLong)
  {
    internalJNI.GroupDetailInfo_dwAppid_set(this.swigCPtr, this, paramLong);
  }
  
  public void setDwCreateTime(long paramLong)
  {
    internalJNI.GroupDetailInfo_dwCreateTime_set(this.swigCPtr, this, paramLong);
  }
  
  public void setDwInfoSeq(long paramLong)
  {
    internalJNI.GroupDetailInfo_dwInfoSeq_set(this.swigCPtr, this, paramLong);
  }
  
  public void setDwLastInfoTime(long paramLong)
  {
    internalJNI.GroupDetailInfo_dwLastInfoTime_set(this.swigCPtr, this, paramLong);
  }
  
  public void setDwLastMsgTime(long paramLong)
  {
    internalJNI.GroupDetailInfo_dwLastMsgTime_set(this.swigCPtr, this, paramLong);
  }
  
  public void setDwMaxMemberNum(long paramLong)
  {
    internalJNI.GroupDetailInfo_dwMaxMemberNum_set(this.swigCPtr, this, paramLong);
  }
  
  public void setDwMemberNum(long paramLong)
  {
    internalJNI.GroupDetailInfo_dwMemberNum_set(this.swigCPtr, this, paramLong);
  }
  
  public void setDwNextMsgSeq(long paramLong)
  {
    internalJNI.GroupDetailInfo_dwNextMsgSeq_set(this.swigCPtr, this, paramLong);
  }
  
  public void setDwOnlineMemberNum(long paramLong)
  {
    internalJNI.GroupDetailInfo_dwOnlineMemberNum_set(this.swigCPtr, this, paramLong);
  }
  
  public void setESearchable(ComStatus paramComStatus)
  {
    internalJNI.GroupDetailInfo_eSearchable_set(this.swigCPtr, this, paramComStatus.swigValue());
  }
  
  public void setEVisible(ComStatus paramComStatus)
  {
    internalJNI.GroupDetailInfo_eVisible_set(this.swigCPtr, this, paramComStatus.swigValue());
  }
  
  public void setLastMsg(Msg paramMsg)
  {
    internalJNI.GroupDetailInfo_lastMsg_set(this.swigCPtr, this, Msg.getCPtr(paramMsg), paramMsg);
  }
  
  public void setSFaceUrl(String paramString)
  {
    internalJNI.GroupDetailInfo_sFaceUrl_set(this.swigCPtr, this, paramString);
  }
  
  public void setSGroupId(String paramString)
  {
    internalJNI.GroupDetailInfo_sGroupId_set(this.swigCPtr, this, paramString);
  }
  
  public void setSGroupName(byte[] paramArrayOfByte)
  {
    internalJNI.GroupDetailInfo_sGroupName_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setSGroupType(String paramString)
  {
    internalJNI.GroupDetailInfo_sGroupType_set(this.swigCPtr, this, paramString);
  }
  
  public void setSIntroduction(byte[] paramArrayOfByte)
  {
    internalJNI.GroupDetailInfo_sIntroduction_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setSNotification(byte[] paramArrayOfByte)
  {
    internalJNI.GroupDetailInfo_sNotification_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setSOwner(String paramString)
  {
    internalJNI.GroupDetailInfo_sOwner_set(this.swigCPtr, this, paramString);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\GroupDetailInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */