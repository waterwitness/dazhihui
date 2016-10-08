package com.tencent.imcore;

public class SoundElem
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public SoundElem()
  {
    this(internalJNI.new_SoundElem(), true);
  }
  
  protected SoundElem(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(SoundElem paramSoundElem)
  {
    if (paramSoundElem == null) {
      return 0L;
    }
    return paramSoundElem.swigCPtr;
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
          internalJNI.delete_SoundElem(this.swigCPtr);
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
  
  public byte[] getFile_path()
  {
    return internalJNI.SoundElem_file_path_get(this.swigCPtr, this);
  }
  
  public int getFile_size()
  {
    return internalJNI.SoundElem_file_size_get(this.swigCPtr, this);
  }
  
  public int getFile_time()
  {
    return internalJNI.SoundElem_file_time_get(this.swigCPtr, this);
  }
  
  public String getFileid()
  {
    return internalJNI.SoundElem_fileid_get(this.swigCPtr, this);
  }
  
  public int getTaskid()
  {
    return internalJNI.SoundElem_taskid_get(this.swigCPtr, this);
  }
  
  public void setFile_path(byte[] paramArrayOfByte)
  {
    internalJNI.SoundElem_file_path_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setFile_size(int paramInt)
  {
    internalJNI.SoundElem_file_size_set(this.swigCPtr, this, paramInt);
  }
  
  public void setFile_time(int paramInt)
  {
    internalJNI.SoundElem_file_time_set(this.swigCPtr, this, paramInt);
  }
  
  public void setFileid(String paramString)
  {
    internalJNI.SoundElem_fileid_set(this.swigCPtr, this, paramString);
  }
  
  public void setTaskid(int paramInt)
  {
    internalJNI.SoundElem_taskid_set(this.swigCPtr, this, paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\SoundElem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */