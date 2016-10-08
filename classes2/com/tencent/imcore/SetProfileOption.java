package com.tencent.imcore;

public class SetProfileOption
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public SetProfileOption()
  {
    this(internalJNI.new_SetProfileOption(), true);
  }
  
  protected SetProfileOption(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(SetProfileOption paramSetProfileOption)
  {
    if (paramSetProfileOption == null) {
      return 0L;
    }
    return paramSetProfileOption.swigCPtr;
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
          internalJNI.delete_SetProfileOption(this.swigCPtr);
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
  
  public String getAdd_option()
  {
    return internalJNI.SetProfileOption_add_option_get(this.swigCPtr, this);
  }
  
  public BytesMap getCustom_info()
  {
    long l = internalJNI.SetProfileOption_custom_info_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new BytesMap(l, false);
  }
  
  public byte[] getFace_url()
  {
    return internalJNI.SetProfileOption_face_url_get(this.swigCPtr, this);
  }
  
  public long getFlag()
  {
    return internalJNI.SetProfileOption_flag_get(this.swigCPtr, this);
  }
  
  public byte[] getNick()
  {
    return internalJNI.SetProfileOption_nick_get(this.swigCPtr, this);
  }
  
  public byte[] getSelf_signature()
  {
    return internalJNI.SetProfileOption_self_signature_get(this.swigCPtr, this);
  }
  
  public void setAdd_option(String paramString)
  {
    internalJNI.SetProfileOption_add_option_set(this.swigCPtr, this, paramString);
  }
  
  public void setCustom_info(BytesMap paramBytesMap)
  {
    internalJNI.SetProfileOption_custom_info_set(this.swigCPtr, this, BytesMap.getCPtr(paramBytesMap), paramBytesMap);
  }
  
  public void setFace_url(byte[] paramArrayOfByte)
  {
    internalJNI.SetProfileOption_face_url_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setFlag(long paramLong)
  {
    internalJNI.SetProfileOption_flag_set(this.swigCPtr, this, paramLong);
  }
  
  public void setNick(byte[] paramArrayOfByte)
  {
    internalJNI.SetProfileOption_nick_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setSelf_signature(byte[] paramArrayOfByte)
  {
    internalJNI.SetProfileOption_self_signature_set(this.swigCPtr, this, paramArrayOfByte);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\SetProfileOption.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */