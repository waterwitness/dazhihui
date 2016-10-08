package com.tencent.imcore;

public class IFileTrans
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public IFileTrans()
  {
    this(internalJNI.new_IFileTrans(), true);
    internalJNI.IFileTrans_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
  }
  
  protected IFileTrans(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(IFileTrans paramIFileTrans)
  {
    if (paramIFileTrans == null) {
      return 0L;
    }
    return paramIFileTrans.swigCPtr;
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
          internalJNI.delete_IFileTrans(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public void done(FileTransSuccParam paramFileTransSuccParam)
  {
    if (getClass() == IFileTrans.class)
    {
      internalJNI.IFileTrans_done(this.swigCPtr, this, FileTransSuccParam.getCPtr(paramFileTransSuccParam), paramFileTransSuccParam);
      return;
    }
    internalJNI.IFileTrans_doneSwigExplicitIFileTrans(this.swigCPtr, this, FileTransSuccParam.getCPtr(paramFileTransSuccParam), paramFileTransSuccParam);
  }
  
  public void fail(int paramInt, String paramString)
  {
    if (getClass() == IFileTrans.class)
    {
      internalJNI.IFileTrans_fail(this.swigCPtr, this, paramInt, paramString);
      return;
    }
    internalJNI.IFileTrans_failSwigExplicitIFileTrans(this.swigCPtr, this, paramInt, paramString);
  }
  
  protected void finalize()
  {
    delete();
  }
  
  protected void swigDirectorDisconnect()
  {
    this.swigCMemOwn = false;
    delete();
  }
  
  public void swigReleaseOwnership()
  {
    this.swigCMemOwn = false;
    internalJNI.IFileTrans_change_ownership(this, this.swigCPtr, false);
  }
  
  public void swigTakeOwnership()
  {
    this.swigCMemOwn = true;
    internalJNI.IFileTrans_change_ownership(this, this.swigCPtr, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\IFileTrans.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */