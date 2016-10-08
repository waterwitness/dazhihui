package com.tencent.imcore;

public class ISsoList
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public ISsoList()
  {
    this(internalJNI.new_ISsoList(), true);
  }
  
  protected ISsoList(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(ISsoList paramISsoList)
  {
    if (paramISsoList == null) {
      return 0L;
    }
    return paramISsoList.swigCPtr;
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
          internalJNI.delete_ISsoList(this.swigCPtr);
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
  
  public void onNewSsoList(SsoAddrVec paramSsoAddrVec)
  {
    internalJNI.ISsoList_onNewSsoList(this.swigCPtr, this, SsoAddrVec.getCPtr(paramSsoAddrVec), paramSsoAddrVec);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\ISsoList.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */