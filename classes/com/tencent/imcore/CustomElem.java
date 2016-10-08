package com.tencent.imcore;

public class CustomElem
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public CustomElem()
  {
    this(internalJNI.new_CustomElem(), true);
  }
  
  protected CustomElem(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(CustomElem paramCustomElem)
  {
    if (paramCustomElem == null) {
      return 0L;
    }
    return paramCustomElem.swigCPtr;
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
          internalJNI.delete_CustomElem(this.swigCPtr);
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
  
  public byte[] getData()
  {
    return internalJNI.CustomElem_data_get(this.swigCPtr, this);
  }
  
  public byte[] getDesc()
  {
    return internalJNI.CustomElem_desc_get(this.swigCPtr, this);
  }
  
  public byte[] getExt()
  {
    return internalJNI.CustomElem_ext_get(this.swigCPtr, this);
  }
  
  public byte[] getSound()
  {
    return internalJNI.CustomElem_sound_get(this.swigCPtr, this);
  }
  
  public void setData(byte[] paramArrayOfByte)
  {
    internalJNI.CustomElem_data_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setDesc(byte[] paramArrayOfByte)
  {
    internalJNI.CustomElem_desc_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setExt(byte[] paramArrayOfByte)
  {
    internalJNI.CustomElem_ext_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setSound(byte[] paramArrayOfByte)
  {
    internalJNI.CustomElem_sound_set(this.swigCPtr, this, paramArrayOfByte);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\imcore\CustomElem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */