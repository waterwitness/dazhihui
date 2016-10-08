package com.tencent.imcore;

public class NewGroupMemberInfo
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public NewGroupMemberInfo()
  {
    this(internalJNI.new_NewGroupMemberInfo(), true);
  }
  
  protected NewGroupMemberInfo(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(NewGroupMemberInfo paramNewGroupMemberInfo)
  {
    if (paramNewGroupMemberInfo == null) {
      return 0L;
    }
    return paramNewGroupMemberInfo.swigCPtr;
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
          internalJNI.delete_NewGroupMemberInfo(this.swigCPtr);
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
    long l = internalJNI.NewGroupMemberInfo_custom_info_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new BytesMap(l, false);
  }
  
  public String getIdentifier()
  {
    return internalJNI.NewGroupMemberInfo_identifier_get(this.swigCPtr, this);
  }
  
  public int getMember_role()
  {
    return internalJNI.NewGroupMemberInfo_member_role_get(this.swigCPtr, this);
  }
  
  public int getMsg_flag()
  {
    return internalJNI.NewGroupMemberInfo_msg_flag_get(this.swigCPtr, this);
  }
  
  public byte[] getName_card()
  {
    return internalJNI.NewGroupMemberInfo_name_card_get(this.swigCPtr, this);
  }
  
  public void setCustom_info(BytesMap paramBytesMap)
  {
    internalJNI.NewGroupMemberInfo_custom_info_set(this.swigCPtr, this, BytesMap.getCPtr(paramBytesMap), paramBytesMap);
  }
  
  public void setIdentifier(String paramString)
  {
    internalJNI.NewGroupMemberInfo_identifier_set(this.swigCPtr, this, paramString);
  }
  
  public void setMember_role(int paramInt)
  {
    internalJNI.NewGroupMemberInfo_member_role_set(this.swigCPtr, this, paramInt);
  }
  
  public void setMsg_flag(int paramInt)
  {
    internalJNI.NewGroupMemberInfo_msg_flag_set(this.swigCPtr, this, paramInt);
  }
  
  public void setName_card(byte[] paramArrayOfByte)
  {
    internalJNI.NewGroupMemberInfo_name_card_set(this.swigCPtr, this, paramArrayOfByte);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\NewGroupMemberInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */