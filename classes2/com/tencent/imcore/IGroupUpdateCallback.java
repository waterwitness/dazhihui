package com.tencent.imcore;

public class IGroupUpdateCallback
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public IGroupUpdateCallback()
  {
    this(internalJNI.new_IGroupUpdateCallback(), true);
    internalJNI.IGroupUpdateCallback_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
  }
  
  protected IGroupUpdateCallback(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(IGroupUpdateCallback paramIGroupUpdateCallback)
  {
    if (paramIGroupUpdateCallback == null) {
      return 0L;
    }
    return paramIGroupUpdateCallback.swigCPtr;
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
          internalJNI.delete_IGroupUpdateCallback(this.swigCPtr);
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
  
  public void onMembersUpdate(GroupTipsElem paramGroupTipsElem)
  {
    if (getClass() == IGroupUpdateCallback.class)
    {
      internalJNI.IGroupUpdateCallback_onMembersUpdate(this.swigCPtr, this, GroupTipsElem.getCPtr(paramGroupTipsElem), paramGroupTipsElem);
      return;
    }
    internalJNI.IGroupUpdateCallback_onMembersUpdateSwigExplicitIGroupUpdateCallback(this.swigCPtr, this, GroupTipsElem.getCPtr(paramGroupTipsElem), paramGroupTipsElem);
  }
  
  protected void swigDirectorDisconnect()
  {
    this.swigCMemOwn = false;
    delete();
  }
  
  public void swigReleaseOwnership()
  {
    this.swigCMemOwn = false;
    internalJNI.IGroupUpdateCallback_change_ownership(this, this.swigCPtr, false);
  }
  
  public void swigTakeOwnership()
  {
    this.swigCMemOwn = true;
    internalJNI.IGroupUpdateCallback_change_ownership(this, this.swigCPtr, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\IGroupUpdateCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */