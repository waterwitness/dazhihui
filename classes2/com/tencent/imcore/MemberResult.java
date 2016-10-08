package com.tencent.imcore;

public class MemberResult
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public MemberResult()
  {
    this(internalJNI.new_MemberResult(), true);
  }
  
  protected MemberResult(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(MemberResult paramMemberResult)
  {
    if (paramMemberResult == null) {
      return 0L;
    }
    return paramMemberResult.swigCPtr;
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
          internalJNI.delete_MemberResult(this.swigCPtr);
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
  
  public long getStatus()
  {
    return internalJNI.MemberResult_status_get(this.swigCPtr, this);
  }
  
  public String getUser()
  {
    return internalJNI.MemberResult_user_get(this.swigCPtr, this);
  }
  
  public void setStatus(long paramLong)
  {
    internalJNI.MemberResult_status_set(this.swigCPtr, this, paramLong);
  }
  
  public void setUser(String paramString)
  {
    internalJNI.MemberResult_user_set(this.swigCPtr, this, paramString);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\MemberResult.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */