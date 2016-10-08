package com.tencent.imcore;

public class FileTranser
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  protected FileTranser(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  public FileTranser(SWIGTYPE_p_imcore__FileTranserImpl paramSWIGTYPE_p_imcore__FileTranserImpl)
  {
    this(internalJNI.new_FileTranser(SWIGTYPE_p_imcore__FileTranserImpl.getCPtr(paramSWIGTYPE_p_imcore__FileTranserImpl)), true);
  }
  
  protected static long getCPtr(FileTranser paramFileTranser)
  {
    if (paramFileTranser == null) {
      return 0L;
    }
    return paramFileTranser.swigCPtr;
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
          internalJNI.delete_FileTranser(this.swigCPtr);
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
  
  public SWIGTYPE_p_imcore__FileTranserImpl getImpl()
  {
    long l = internalJNI.FileTranser_getImpl(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new SWIGTYPE_p_imcore__FileTranserImpl(l, false);
  }
  
  public void setCachePath(String paramString)
  {
    internalJNI.FileTranser_setCachePath(this.swigCPtr, this, paramString);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\imcore\FileTranser.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */