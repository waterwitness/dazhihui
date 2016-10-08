package com.tencent.imcore;

public class FileTransSuccParam
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public FileTransSuccParam()
  {
    this(internalJNI.new_FileTransSuccParam(), true);
  }
  
  protected FileTransSuccParam(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(FileTransSuccParam paramFileTransSuccParam)
  {
    if (paramFileTransSuccParam == null) {
      return 0L;
    }
    return paramFileTransSuccParam.swigCPtr;
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
          internalJNI.delete_FileTransSuccParam(this.swigCPtr);
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
    return internalJNI.FileTransSuccParam_data_get(this.swigCPtr, this);
  }
  
  public SWIGTYPE_p_void getDlinfo()
  {
    long l = internalJNI.FileTransSuccParam_dlinfo_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new SWIGTYPE_p_void(l, false);
  }
  
  public String getFileid()
  {
    return internalJNI.FileTransSuccParam_fileid_get(this.swigCPtr, this);
  }
  
  public int getHeight()
  {
    return internalJNI.FileTransSuccParam_height_get(this.swigCPtr, this);
  }
  
  public long getSize()
  {
    return internalJNI.FileTransSuccParam_size_get(this.swigCPtr, this);
  }
  
  public int getWidth()
  {
    return internalJNI.FileTransSuccParam_width_get(this.swigCPtr, this);
  }
  
  public void setData(byte[] paramArrayOfByte)
  {
    internalJNI.FileTransSuccParam_data_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setDlinfo(SWIGTYPE_p_void paramSWIGTYPE_p_void)
  {
    internalJNI.FileTransSuccParam_dlinfo_set(this.swigCPtr, this, SWIGTYPE_p_void.getCPtr(paramSWIGTYPE_p_void));
  }
  
  public void setFileid(String paramString)
  {
    internalJNI.FileTransSuccParam_fileid_set(this.swigCPtr, this, paramString);
  }
  
  public void setHeight(int paramInt)
  {
    internalJNI.FileTransSuccParam_height_set(this.swigCPtr, this, paramInt);
  }
  
  public void setSize(long paramLong)
  {
    internalJNI.FileTransSuccParam_size_set(this.swigCPtr, this, paramLong);
  }
  
  public void setWidth(int paramInt)
  {
    internalJNI.FileTransSuccParam_width_set(this.swigCPtr, this, paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\imcore\FileTransSuccParam.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */