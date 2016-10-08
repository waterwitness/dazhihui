package com.tencent.imcore;

public class IGroupInfoListCallbackV2
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public IGroupInfoListCallbackV2()
  {
    this(internalJNI.new_IGroupInfoListCallbackV2(), true);
    internalJNI.IGroupInfoListCallbackV2_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
  }
  
  protected IGroupInfoListCallbackV2(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(IGroupInfoListCallbackV2 paramIGroupInfoListCallbackV2)
  {
    if (paramIGroupInfoListCallbackV2 == null) {
      return 0L;
    }
    return paramIGroupInfoListCallbackV2.swigCPtr;
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
          internalJNI.delete_IGroupInfoListCallbackV2(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public void done(long paramLong, GroupDetailInfoVec paramGroupDetailInfoVec)
  {
    if (getClass() == IGroupInfoListCallbackV2.class)
    {
      internalJNI.IGroupInfoListCallbackV2_done(this.swigCPtr, this, paramLong, GroupDetailInfoVec.getCPtr(paramGroupDetailInfoVec), paramGroupDetailInfoVec);
      return;
    }
    internalJNI.IGroupInfoListCallbackV2_doneSwigExplicitIGroupInfoListCallbackV2(this.swigCPtr, this, paramLong, GroupDetailInfoVec.getCPtr(paramGroupDetailInfoVec), paramGroupDetailInfoVec);
  }
  
  public void fail(int paramInt, String paramString)
  {
    if (getClass() == IGroupInfoListCallbackV2.class)
    {
      internalJNI.IGroupInfoListCallbackV2_fail(this.swigCPtr, this, paramInt, paramString);
      return;
    }
    internalJNI.IGroupInfoListCallbackV2_failSwigExplicitIGroupInfoListCallbackV2(this.swigCPtr, this, paramInt, paramString);
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
    internalJNI.IGroupInfoListCallbackV2_change_ownership(this, this.swigCPtr, false);
  }
  
  public void swigTakeOwnership()
  {
    this.swigCMemOwn = true;
    internalJNI.IGroupInfoListCallbackV2_change_ownership(this, this.swigCPtr, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\IGroupInfoListCallbackV2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */