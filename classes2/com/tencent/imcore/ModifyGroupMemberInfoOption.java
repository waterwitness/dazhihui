package com.tencent.imcore;

public class ModifyGroupMemberInfoOption
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public ModifyGroupMemberInfoOption()
  {
    this(internalJNI.new_ModifyGroupMemberInfoOption(), true);
  }
  
  protected ModifyGroupMemberInfoOption(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(ModifyGroupMemberInfoOption paramModifyGroupMemberInfoOption)
  {
    if (paramModifyGroupMemberInfoOption == null) {
      return 0L;
    }
    return paramModifyGroupMemberInfoOption.swigCPtr;
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
          internalJNI.delete_ModifyGroupMemberInfoOption(this.swigCPtr);
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
    long l = internalJNI.ModifyGroupMemberInfoOption_custom_info_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new BytesMap(l, false);
  }
  
  public long getFlag()
  {
    return internalJNI.ModifyGroupMemberInfoOption_flag_get(this.swigCPtr, this);
  }
  
  public String getGroup_id()
  {
    return internalJNI.ModifyGroupMemberInfoOption_group_id_get(this.swigCPtr, this);
  }
  
  public String getMember()
  {
    return internalJNI.ModifyGroupMemberInfoOption_member_get(this.swigCPtr, this);
  }
  
  public long getMsg_flag()
  {
    return internalJNI.ModifyGroupMemberInfoOption_msg_flag_get(this.swigCPtr, this);
  }
  
  public byte[] getName_card()
  {
    return internalJNI.ModifyGroupMemberInfoOption_name_card_get(this.swigCPtr, this);
  }
  
  public long getRole()
  {
    return internalJNI.ModifyGroupMemberInfoOption_role_get(this.swigCPtr, this);
  }
  
  public long getShutup_time()
  {
    return internalJNI.ModifyGroupMemberInfoOption_shutup_time_get(this.swigCPtr, this);
  }
  
  public void setCustom_info(BytesMap paramBytesMap)
  {
    internalJNI.ModifyGroupMemberInfoOption_custom_info_set(this.swigCPtr, this, BytesMap.getCPtr(paramBytesMap), paramBytesMap);
  }
  
  public void setFlag(long paramLong)
  {
    internalJNI.ModifyGroupMemberInfoOption_flag_set(this.swigCPtr, this, paramLong);
  }
  
  public void setGroup_id(String paramString)
  {
    internalJNI.ModifyGroupMemberInfoOption_group_id_set(this.swigCPtr, this, paramString);
  }
  
  public void setMember(String paramString)
  {
    internalJNI.ModifyGroupMemberInfoOption_member_set(this.swigCPtr, this, paramString);
  }
  
  public void setMsg_flag(long paramLong)
  {
    internalJNI.ModifyGroupMemberInfoOption_msg_flag_set(this.swigCPtr, this, paramLong);
  }
  
  public void setName_card(byte[] paramArrayOfByte)
  {
    internalJNI.ModifyGroupMemberInfoOption_name_card_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setRole(long paramLong)
  {
    internalJNI.ModifyGroupMemberInfoOption_role_set(this.swigCPtr, this, paramLong);
  }
  
  public void setShutup_time(long paramLong)
  {
    internalJNI.ModifyGroupMemberInfoOption_shutup_time_set(this.swigCPtr, this, paramLong);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\ModifyGroupMemberInfoOption.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */