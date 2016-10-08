package com.tencent.imcore;

public class NewGroupInfo
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public NewGroupInfo()
  {
    this(internalJNI.new_NewGroupInfo(), true);
  }
  
  protected NewGroupInfo(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(NewGroupInfo paramNewGroupInfo)
  {
    if (paramNewGroupInfo == null) {
      return 0L;
    }
    return paramNewGroupInfo.swigCPtr;
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
          internalJNI.delete_NewGroupInfo(this.swigCPtr);
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
  
  public long getAdd_option()
  {
    return internalJNI.NewGroupInfo_add_option_get(this.swigCPtr, this);
  }
  
  public BytesMap getBase_custom_info()
  {
    long l = internalJNI.NewGroupInfo_base_custom_info_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new BytesMap(l, false);
  }
  
  public String getFace_url()
  {
    return internalJNI.NewGroupInfo_face_url_get(this.swigCPtr, this);
  }
  
  public byte[] getGroup_id()
  {
    return internalJNI.NewGroupInfo_group_id_get(this.swigCPtr, this);
  }
  
  public NewGroupMemVec getGroup_members()
  {
    long l = internalJNI.NewGroupInfo_group_members_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new NewGroupMemVec(l, false);
  }
  
  public byte[] getGroup_name()
  {
    return internalJNI.NewGroupInfo_group_name_get(this.swigCPtr, this);
  }
  
  public String getGroup_type()
  {
    return internalJNI.NewGroupInfo_group_type_get(this.swigCPtr, this);
  }
  
  public byte[] getIntroduction()
  {
    return internalJNI.NewGroupInfo_introduction_get(this.swigCPtr, this);
  }
  
  public long getMax_member_num()
  {
    return internalJNI.NewGroupInfo_max_member_num_get(this.swigCPtr, this);
  }
  
  public byte[] getNotification()
  {
    return internalJNI.NewGroupInfo_notification_get(this.swigCPtr, this);
  }
  
  public long getOwner_tiny_id()
  {
    return internalJNI.NewGroupInfo_owner_tiny_id_get(this.swigCPtr, this);
  }
  
  public boolean getSet_add_option()
  {
    return internalJNI.NewGroupInfo_set_add_option_get(this.swigCPtr, this);
  }
  
  public void setAdd_option(long paramLong)
  {
    internalJNI.NewGroupInfo_add_option_set(this.swigCPtr, this, paramLong);
  }
  
  public void setBase_custom_info(BytesMap paramBytesMap)
  {
    internalJNI.NewGroupInfo_base_custom_info_set(this.swigCPtr, this, BytesMap.getCPtr(paramBytesMap), paramBytesMap);
  }
  
  public void setFace_url(String paramString)
  {
    internalJNI.NewGroupInfo_face_url_set(this.swigCPtr, this, paramString);
  }
  
  public void setGroup_id(byte[] paramArrayOfByte)
  {
    internalJNI.NewGroupInfo_group_id_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setGroup_members(NewGroupMemVec paramNewGroupMemVec)
  {
    internalJNI.NewGroupInfo_group_members_set(this.swigCPtr, this, NewGroupMemVec.getCPtr(paramNewGroupMemVec), paramNewGroupMemVec);
  }
  
  public void setGroup_name(byte[] paramArrayOfByte)
  {
    internalJNI.NewGroupInfo_group_name_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setGroup_type(String paramString)
  {
    internalJNI.NewGroupInfo_group_type_set(this.swigCPtr, this, paramString);
  }
  
  public void setIntroduction(byte[] paramArrayOfByte)
  {
    internalJNI.NewGroupInfo_introduction_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setMax_member_num(long paramLong)
  {
    internalJNI.NewGroupInfo_max_member_num_set(this.swigCPtr, this, paramLong);
  }
  
  public void setNotification(byte[] paramArrayOfByte)
  {
    internalJNI.NewGroupInfo_notification_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setOwner_tiny_id(long paramLong)
  {
    internalJNI.NewGroupInfo_owner_tiny_id_set(this.swigCPtr, this, paramLong);
  }
  
  public void setSet_add_option(boolean paramBoolean)
  {
    internalJNI.NewGroupInfo_set_add_option_set(this.swigCPtr, this, paramBoolean);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\NewGroupInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */