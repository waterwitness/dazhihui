package com.tencent.imcore;

public class IStatusCallback
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public IStatusCallback()
  {
    this(internalJNI.new_IStatusCallback(), true);
  }
  
  protected IStatusCallback(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(IStatusCallback paramIStatusCallback)
  {
    if (paramIStatusCallback == null) {
      return 0L;
    }
    return paramIStatusCallback.swigCPtr;
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
          internalJNI.delete_IStatusCallback(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public void done(SWIGTYPE_p_std__vectorT_imcore__UserStatus_t paramSWIGTYPE_p_std__vectorT_imcore__UserStatus_t)
  {
    internalJNI.IStatusCallback_done(this.swigCPtr, this, SWIGTYPE_p_std__vectorT_imcore__UserStatus_t.getCPtr(paramSWIGTYPE_p_std__vectorT_imcore__UserStatus_t));
  }
  
  public void fail(int paramInt, String paramString)
  {
    internalJNI.IStatusCallback_fail(this.swigCPtr, this, paramInt, paramString);
  }
  
  protected void finalize()
  {
    delete();
  }
  
  public SWIGTYPE_p_std__vectorT_imcore__UserStatus_t getVecUserStatus()
  {
    long l = internalJNI.IStatusCallback_vecUserStatus_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new SWIGTYPE_p_std__vectorT_imcore__UserStatus_t(l, false);
  }
  
  public void setVecUserStatus(SWIGTYPE_p_std__vectorT_imcore__UserStatus_t paramSWIGTYPE_p_std__vectorT_imcore__UserStatus_t)
  {
    internalJNI.IStatusCallback_vecUserStatus_set(this.swigCPtr, this, SWIGTYPE_p_std__vectorT_imcore__UserStatus_t.getCPtr(paramSWIGTYPE_p_std__vectorT_imcore__UserStatus_t));
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\IStatusCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */