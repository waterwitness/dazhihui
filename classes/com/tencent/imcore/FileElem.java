package com.tencent.imcore;

public class FileElem
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public FileElem()
  {
    this(internalJNI.new_FileElem(), true);
  }
  
  protected FileElem(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(FileElem paramFileElem)
  {
    if (paramFileElem == null) {
      return 0L;
    }
    return paramFileElem.swigCPtr;
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
          internalJNI.delete_FileElem(this.swigCPtr);
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
  
  public byte[] getFile_name()
  {
    return internalJNI.FileElem_file_name_get(this.swigCPtr, this);
  }
  
  public byte[] getFile_path()
  {
    return internalJNI.FileElem_file_path_get(this.swigCPtr, this);
  }
  
  public long getFile_size()
  {
    return internalJNI.FileElem_file_size_get(this.swigCPtr, this);
  }
  
  public String getFileid()
  {
    return internalJNI.FileElem_fileid_get(this.swigCPtr, this);
  }
  
  public int getTaskid()
  {
    return internalJNI.FileElem_taskid_get(this.swigCPtr, this);
  }
  
  public void setFile_name(byte[] paramArrayOfByte)
  {
    internalJNI.FileElem_file_name_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setFile_path(byte[] paramArrayOfByte)
  {
    internalJNI.FileElem_file_path_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setFile_size(long paramLong)
  {
    internalJNI.FileElem_file_size_set(this.swigCPtr, this, paramLong);
  }
  
  public void setFileid(String paramString)
  {
    internalJNI.FileElem_fileid_set(this.swigCPtr, this, paramString);
  }
  
  public void setTaskid(int paramInt)
  {
    internalJNI.FileElem_taskid_set(this.swigCPtr, this, paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\imcore\FileElem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */