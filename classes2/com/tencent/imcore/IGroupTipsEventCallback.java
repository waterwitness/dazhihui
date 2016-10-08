package com.tencent.imcore;

public class IGroupTipsEventCallback
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public IGroupTipsEventCallback()
  {
    this(internalJNI.new_IGroupTipsEventCallback(), true);
    internalJNI.IGroupTipsEventCallback_director_connect(this, this.swigCPtr, this.swigCMemOwn, true);
  }
  
  protected IGroupTipsEventCallback(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(IGroupTipsEventCallback paramIGroupTipsEventCallback)
  {
    if (paramIGroupTipsEventCallback == null) {
      return 0L;
    }
    return paramIGroupTipsEventCallback.swigCPtr;
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
          internalJNI.delete_IGroupTipsEventCallback(this.swigCPtr);
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
  
  public void onGroupTipsEvent(GroupTipsElem paramGroupTipsElem)
  {
    if (getClass() == IGroupTipsEventCallback.class)
    {
      internalJNI.IGroupTipsEventCallback_onGroupTipsEvent(this.swigCPtr, this, GroupTipsElem.getCPtr(paramGroupTipsElem), paramGroupTipsElem);
      return;
    }
    internalJNI.IGroupTipsEventCallback_onGroupTipsEventSwigExplicitIGroupTipsEventCallback(this.swigCPtr, this, GroupTipsElem.getCPtr(paramGroupTipsElem), paramGroupTipsElem);
  }
  
  protected void swigDirectorDisconnect()
  {
    this.swigCMemOwn = false;
    delete();
  }
  
  public void swigReleaseOwnership()
  {
    this.swigCMemOwn = false;
    internalJNI.IGroupTipsEventCallback_change_ownership(this, this.swigCPtr, false);
  }
  
  public void swigTakeOwnership()
  {
    this.swigCMemOwn = true;
    internalJNI.IGroupTipsEventCallback_change_ownership(this, this.swigCPtr, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\IGroupTipsEventCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */