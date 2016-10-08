package com.tencent.imcore;

public class NewGroupMemVec
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public NewGroupMemVec()
  {
    this(internalJNI.new_NewGroupMemVec__SWIG_0(), true);
  }
  
  public NewGroupMemVec(long paramLong)
  {
    this(internalJNI.new_NewGroupMemVec__SWIG_1(paramLong), true);
  }
  
  protected NewGroupMemVec(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(NewGroupMemVec paramNewGroupMemVec)
  {
    if (paramNewGroupMemVec == null) {
      return 0L;
    }
    return paramNewGroupMemVec.swigCPtr;
  }
  
  public long capacity()
  {
    return internalJNI.NewGroupMemVec_capacity(this.swigCPtr, this);
  }
  
  public void clear()
  {
    internalJNI.NewGroupMemVec_clear(this.swigCPtr, this);
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
          internalJNI.delete_NewGroupMemVec(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public boolean empty()
  {
    return internalJNI.NewGroupMemVec_empty(this.swigCPtr, this);
  }
  
  protected void finalize()
  {
    delete();
  }
  
  public NewGroupMemberInfo get(int paramInt)
  {
    return new NewGroupMemberInfo(internalJNI.NewGroupMemVec_get(this.swigCPtr, this, paramInt), false);
  }
  
  public void pushBack(NewGroupMemberInfo paramNewGroupMemberInfo)
  {
    internalJNI.NewGroupMemVec_pushBack(this.swigCPtr, this, NewGroupMemberInfo.getCPtr(paramNewGroupMemberInfo), paramNewGroupMemberInfo);
  }
  
  public void reserve(long paramLong)
  {
    internalJNI.NewGroupMemVec_reserve(this.swigCPtr, this, paramLong);
  }
  
  public void set(int paramInt, NewGroupMemberInfo paramNewGroupMemberInfo)
  {
    internalJNI.NewGroupMemVec_set(this.swigCPtr, this, paramInt, NewGroupMemberInfo.getCPtr(paramNewGroupMemberInfo), paramNewGroupMemberInfo);
  }
  
  public long size()
  {
    return internalJNI.NewGroupMemVec_size(this.swigCPtr, this);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\NewGroupMemVec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */