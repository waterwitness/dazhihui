package com.tencent.imcore;

public class ErrCodeManager
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public ErrCodeManager()
  {
    this(internalJNI.new_ErrCodeManager(), true);
  }
  
  protected ErrCodeManager(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  public static ErrCodeManager get()
  {
    return new ErrCodeManager(internalJNI.ErrCodeManager_get(), false);
  }
  
  protected static long getCPtr(ErrCodeManager paramErrCodeManager)
  {
    if (paramErrCodeManager == null) {
      return 0L;
    }
    return paramErrCodeManager.swigCPtr;
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
          internalJNI.delete_ErrCodeManager(this.swigCPtr);
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
  
  public boolean transErrCode(String paramString, SWIGTYPE_p_unsigned_int paramSWIGTYPE_p_unsigned_int, SWIGTYPE_p_std__string paramSWIGTYPE_p_std__string)
  {
    return internalJNI.ErrCodeManager_transErrCode(this.swigCPtr, this, paramString, SWIGTYPE_p_unsigned_int.getCPtr(paramSWIGTYPE_p_unsigned_int), SWIGTYPE_p_std__string.getCPtr(paramSWIGTYPE_p_std__string));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\imcore\ErrCodeManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */