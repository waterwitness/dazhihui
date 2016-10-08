package com.tencent.imcore;

public class GroupPendencyItem
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public GroupPendencyItem()
  {
    this(internalJNI.new_GroupPendencyItem(), true);
  }
  
  protected GroupPendencyItem(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(GroupPendencyItem paramGroupPendencyItem)
  {
    if (paramGroupPendencyItem == null) {
      return 0L;
    }
    return paramGroupPendencyItem.swigCPtr;
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
          internalJNI.delete_GroupPendencyItem(this.swigCPtr);
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
  
  public long getAdd_time()
  {
    return internalJNI.GroupPendencyItem_add_time_get(this.swigCPtr, this);
  }
  
  public byte[] getApply_invite_msg()
  {
    return internalJNI.GroupPendencyItem_apply_invite_msg_get(this.swigCPtr, this);
  }
  
  public byte[] getApproval_msg()
  {
    return internalJNI.GroupPendencyItem_approval_msg_get(this.swigCPtr, this);
  }
  
  public byte[] getAuthentication()
  {
    return internalJNI.GroupPendencyItem_authentication_get(this.swigCPtr, this);
  }
  
  public String getFrom_id()
  {
    return internalJNI.GroupPendencyItem_from_id_get(this.swigCPtr, this);
  }
  
  public byte[] getFrom_user_defined_data()
  {
    return internalJNI.GroupPendencyItem_from_user_defined_data_get(this.swigCPtr, this);
  }
  
  public String getGroup_id()
  {
    return internalJNI.GroupPendencyItem_group_id_get(this.swigCPtr, this);
  }
  
  public long getHandle_result()
  {
    return internalJNI.GroupPendencyItem_handle_result_get(this.swigCPtr, this);
  }
  
  public long getHandled()
  {
    return internalJNI.GroupPendencyItem_handled_get(this.swigCPtr, this);
  }
  
  public byte[] getKey()
  {
    return internalJNI.GroupPendencyItem_key_get(this.swigCPtr, this);
  }
  
  public long getPendency_type()
  {
    return internalJNI.GroupPendencyItem_pendency_type_get(this.swigCPtr, this);
  }
  
  public byte[] getSelfIdentifier()
  {
    return internalJNI.GroupPendencyItem_selfIdentifier_get(this.swigCPtr, this);
  }
  
  public String getTo_id()
  {
    return internalJNI.GroupPendencyItem_to_id_get(this.swigCPtr, this);
  }
  
  public byte[] getTo_user_defined_data()
  {
    return internalJNI.GroupPendencyItem_to_user_defined_data_get(this.swigCPtr, this);
  }
  
  public void setAdd_time(long paramLong)
  {
    internalJNI.GroupPendencyItem_add_time_set(this.swigCPtr, this, paramLong);
  }
  
  public void setApply_invite_msg(byte[] paramArrayOfByte)
  {
    internalJNI.GroupPendencyItem_apply_invite_msg_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setApproval_msg(byte[] paramArrayOfByte)
  {
    internalJNI.GroupPendencyItem_approval_msg_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setAuthentication(byte[] paramArrayOfByte)
  {
    internalJNI.GroupPendencyItem_authentication_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setFrom_id(String paramString)
  {
    internalJNI.GroupPendencyItem_from_id_set(this.swigCPtr, this, paramString);
  }
  
  public void setFrom_user_defined_data(byte[] paramArrayOfByte)
  {
    internalJNI.GroupPendencyItem_from_user_defined_data_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setGroup_id(String paramString)
  {
    internalJNI.GroupPendencyItem_group_id_set(this.swigCPtr, this, paramString);
  }
  
  public void setHandle_result(long paramLong)
  {
    internalJNI.GroupPendencyItem_handle_result_set(this.swigCPtr, this, paramLong);
  }
  
  public void setHandled(long paramLong)
  {
    internalJNI.GroupPendencyItem_handled_set(this.swigCPtr, this, paramLong);
  }
  
  public void setKey(byte[] paramArrayOfByte)
  {
    internalJNI.GroupPendencyItem_key_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setPendency_type(long paramLong)
  {
    internalJNI.GroupPendencyItem_pendency_type_set(this.swigCPtr, this, paramLong);
  }
  
  public void setSelfIdentifier(byte[] paramArrayOfByte)
  {
    internalJNI.GroupPendencyItem_selfIdentifier_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setTo_id(String paramString)
  {
    internalJNI.GroupPendencyItem_to_id_set(this.swigCPtr, this, paramString);
  }
  
  public void setTo_user_defined_data(byte[] paramArrayOfByte)
  {
    internalJNI.GroupPendencyItem_to_user_defined_data_set(this.swigCPtr, this, paramArrayOfByte);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\GroupPendencyItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */