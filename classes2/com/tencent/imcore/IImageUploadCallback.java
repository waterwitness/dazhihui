package com.tencent.imcore;

public class IImageUploadCallback
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public IImageUploadCallback()
  {
    this(internalJNI.new_IImageUploadCallback(), true);
    internalJNI.IImageUploadCallback_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
  }
  
  protected IImageUploadCallback(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(IImageUploadCallback paramIImageUploadCallback)
  {
    if (paramIImageUploadCallback == null) {
      return 0L;
    }
    return paramIImageUploadCallback.swigCPtr;
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
          internalJNI.delete_IImageUploadCallback(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public void done(ImageElem paramImageElem)
  {
    if (getClass() == IImageUploadCallback.class)
    {
      internalJNI.IImageUploadCallback_done(this.swigCPtr, this, ImageElem.getCPtr(paramImageElem), paramImageElem);
      return;
    }
    internalJNI.IImageUploadCallback_doneSwigExplicitIImageUploadCallback(this.swigCPtr, this, ImageElem.getCPtr(paramImageElem), paramImageElem);
  }
  
  public void fail(int paramInt, String paramString)
  {
    if (getClass() == IImageUploadCallback.class)
    {
      internalJNI.IImageUploadCallback_fail(this.swigCPtr, this, paramInt, paramString);
      return;
    }
    internalJNI.IImageUploadCallback_failSwigExplicitIImageUploadCallback(this.swigCPtr, this, paramInt, paramString);
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
    internalJNI.IImageUploadCallback_change_ownership(this, this.swigCPtr, false);
  }
  
  public void swigTakeOwnership()
  {
    this.swigCMemOwn = true;
    internalJNI.IImageUploadCallback_change_ownership(this, this.swigCPtr, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\IImageUploadCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */