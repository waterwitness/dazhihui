package com.tencent.imcore;

public class ModifyGroupBaseInfoOption
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public ModifyGroupBaseInfoOption()
  {
    this(internalJNI.new_ModifyGroupBaseInfoOption(), true);
  }
  
  protected ModifyGroupBaseInfoOption(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(ModifyGroupBaseInfoOption paramModifyGroupBaseInfoOption)
  {
    if (paramModifyGroupBaseInfoOption == null) {
      return 0L;
    }
    return paramModifyGroupBaseInfoOption.swigCPtr;
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
          internalJNI.delete_ModifyGroupBaseInfoOption(this.swigCPtr);
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
    return internalJNI.ModifyGroupBaseInfoOption_add_option_get(this.swigCPtr, this);
  }
  
  public BytesMap getCustom_info()
  {
    long l = internalJNI.ModifyGroupBaseInfoOption_custom_info_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new BytesMap(l, false);
  }
  
  public byte[] getFace_url()
  {
    return internalJNI.ModifyGroupBaseInfoOption_face_url_get(this.swigCPtr, this);
  }
  
  public long getFlag()
  {
    return internalJNI.ModifyGroupBaseInfoOption_flag_get(this.swigCPtr, this);
  }
  
  public String getGroup_id()
  {
    return internalJNI.ModifyGroupBaseInfoOption_group_id_get(this.swigCPtr, this);
  }
  
  public byte[] getGroup_name()
  {
    return internalJNI.ModifyGroupBaseInfoOption_group_name_get(this.swigCPtr, this);
  }
  
  public byte[] getIntroduction()
  {
    return internalJNI.ModifyGroupBaseInfoOption_introduction_get(this.swigCPtr, this);
  }
  
  public long getMax_member_num()
  {
    return internalJNI.ModifyGroupBaseInfoOption_max_member_num_get(this.swigCPtr, this);
  }
  
  public byte[] getNotification()
  {
    return internalJNI.ModifyGroupBaseInfoOption_notification_get(this.swigCPtr, this);
  }
  
  public ComStatus getSearchable()
  {
    return ComStatus.swigToEnum(internalJNI.ModifyGroupBaseInfoOption_searchable_get(this.swigCPtr, this));
  }
  
  public ComStatus getVisible()
  {
    return ComStatus.swigToEnum(internalJNI.ModifyGroupBaseInfoOption_visible_get(this.swigCPtr, this));
  }
  
  public void setAdd_option(long paramLong)
  {
    internalJNI.ModifyGroupBaseInfoOption_add_option_set(this.swigCPtr, this, paramLong);
  }
  
  public void setCustom_info(BytesMap paramBytesMap)
  {
    internalJNI.ModifyGroupBaseInfoOption_custom_info_set(this.swigCPtr, this, BytesMap.getCPtr(paramBytesMap), paramBytesMap);
  }
  
  public void setFace_url(byte[] paramArrayOfByte)
  {
    internalJNI.ModifyGroupBaseInfoOption_face_url_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setFlag(long paramLong)
  {
    internalJNI.ModifyGroupBaseInfoOption_flag_set(this.swigCPtr, this, paramLong);
  }
  
  public void setGroup_id(String paramString)
  {
    internalJNI.ModifyGroupBaseInfoOption_group_id_set(this.swigCPtr, this, paramString);
  }
  
  public void setGroup_name(byte[] paramArrayOfByte)
  {
    internalJNI.ModifyGroupBaseInfoOption_group_name_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setIntroduction(byte[] paramArrayOfByte)
  {
    internalJNI.ModifyGroupBaseInfoOption_introduction_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setMax_member_num(long paramLong)
  {
    internalJNI.ModifyGroupBaseInfoOption_max_member_num_set(this.swigCPtr, this, paramLong);
  }
  
  public void setNotification(byte[] paramArrayOfByte)
  {
    internalJNI.ModifyGroupBaseInfoOption_notification_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setSearchable(ComStatus paramComStatus)
  {
    internalJNI.ModifyGroupBaseInfoOption_searchable_set(this.swigCPtr, this, paramComStatus.swigValue());
  }
  
  public void setVisible(ComStatus paramComStatus)
  {
    internalJNI.ModifyGroupBaseInfoOption_visible_set(this.swigCPtr, this, paramComStatus.swigValue());
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\ModifyGroupBaseInfoOption.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */