package com.tencent.imcore;

public class UserStatus
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public UserStatus()
  {
    this(internalJNI.new_UserStatus(), true);
  }
  
  protected UserStatus(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(UserStatus paramUserStatus)
  {
    if (paramUserStatus == null) {
      return 0L;
    }
    return paramUserStatus.swigCPtr;
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
          internalJNI.delete_UserStatus(this.swigCPtr);
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
  
  public long getDdwTinyId()
  {
    return internalJNI.UserStatus_ddwTinyId_get(this.swigCPtr, this);
  }
  
  public String getSUserId()
  {
    return internalJNI.UserStatus_sUserId_get(this.swigCPtr, this);
  }
  
  public SWIGTYPE_p_std__vectorT_imcore__InstStatus_t getStInstStatus()
  {
    long l = internalJNI.UserStatus_stInstStatus_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new SWIGTYPE_p_std__vectorT_imcore__InstStatus_t(l, false);
  }
  
  public void setDdwTinyId(long paramLong)
  {
    internalJNI.UserStatus_ddwTinyId_set(this.swigCPtr, this, paramLong);
  }
  
  public void setSUserId(String paramString)
  {
    internalJNI.UserStatus_sUserId_set(this.swigCPtr, this, paramString);
  }
  
  public void setStInstStatus(SWIGTYPE_p_std__vectorT_imcore__InstStatus_t paramSWIGTYPE_p_std__vectorT_imcore__InstStatus_t)
  {
    internalJNI.UserStatus_stInstStatus_set(this.swigCPtr, this, SWIGTYPE_p_std__vectorT_imcore__InstStatus_t.getCPtr(paramSWIGTYPE_p_std__vectorT_imcore__InstStatus_t));
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\UserStatus.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */