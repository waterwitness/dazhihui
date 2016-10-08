package com.tencent.imcore;

public class MemberInfo
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public MemberInfo()
  {
    this(internalJNI.new_MemberInfo(), true);
  }
  
  protected MemberInfo(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(MemberInfo paramMemberInfo)
  {
    if (paramMemberInfo == null) {
      return 0L;
    }
    return paramMemberInfo.swigCPtr;
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
          internalJNI.delete_MemberInfo(this.swigCPtr);
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
    long l = internalJNI.MemberInfo_custom_info_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new BytesMap(l, false);
  }
  
  public long getJoin_time()
  {
    return internalJNI.MemberInfo_join_time_get(this.swigCPtr, this);
  }
  
  public String getMember()
  {
    return internalJNI.MemberInfo_member_get(this.swigCPtr, this);
  }
  
  public long getMsg_flag()
  {
    return internalJNI.MemberInfo_msg_flag_get(this.swigCPtr, this);
  }
  
  public long getMsg_seq()
  {
    return internalJNI.MemberInfo_msg_seq_get(this.swigCPtr, this);
  }
  
  public byte[] getName_card()
  {
    return internalJNI.MemberInfo_name_card_get(this.swigCPtr, this);
  }
  
  public long getRole()
  {
    return internalJNI.MemberInfo_role_get(this.swigCPtr, this);
  }
  
  public long getShutup_time()
  {
    return internalJNI.MemberInfo_shutup_time_get(this.swigCPtr, this);
  }
  
  public void setCustom_info(BytesMap paramBytesMap)
  {
    internalJNI.MemberInfo_custom_info_set(this.swigCPtr, this, BytesMap.getCPtr(paramBytesMap), paramBytesMap);
  }
  
  public void setJoin_time(long paramLong)
  {
    internalJNI.MemberInfo_join_time_set(this.swigCPtr, this, paramLong);
  }
  
  public void setMember(String paramString)
  {
    internalJNI.MemberInfo_member_set(this.swigCPtr, this, paramString);
  }
  
  public void setMsg_flag(long paramLong)
  {
    internalJNI.MemberInfo_msg_flag_set(this.swigCPtr, this, paramLong);
  }
  
  public void setMsg_seq(long paramLong)
  {
    internalJNI.MemberInfo_msg_seq_set(this.swigCPtr, this, paramLong);
  }
  
  public void setName_card(byte[] paramArrayOfByte)
  {
    internalJNI.MemberInfo_name_card_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setRole(long paramLong)
  {
    internalJNI.MemberInfo_role_set(this.swigCPtr, this, paramLong);
  }
  
  public void setShutup_time(long paramLong)
  {
    internalJNI.MemberInfo_shutup_time_set(this.swigCPtr, this, paramLong);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\MemberInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */