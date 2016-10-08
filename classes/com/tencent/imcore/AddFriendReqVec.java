package com.tencent.imcore;

public class AddFriendReqVec
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public AddFriendReqVec()
  {
    this(internalJNI.new_AddFriendReqVec__SWIG_0(), true);
  }
  
  public AddFriendReqVec(long paramLong)
  {
    this(internalJNI.new_AddFriendReqVec__SWIG_1(paramLong), true);
  }
  
  protected AddFriendReqVec(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(AddFriendReqVec paramAddFriendReqVec)
  {
    if (paramAddFriendReqVec == null) {
      return 0L;
    }
    return paramAddFriendReqVec.swigCPtr;
  }
  
  public long capacity()
  {
    return internalJNI.AddFriendReqVec_capacity(this.swigCPtr, this);
  }
  
  public void clear()
  {
    internalJNI.AddFriendReqVec_clear(this.swigCPtr, this);
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
          internalJNI.delete_AddFriendReqVec(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public boolean empty()
  {
    return internalJNI.AddFriendReqVec_empty(this.swigCPtr, this);
  }
  
  protected void finalize()
  {
    delete();
  }
  
  public AddFriendReq get(int paramInt)
  {
    return new AddFriendReq(internalJNI.AddFriendReqVec_get(this.swigCPtr, this, paramInt), false);
  }
  
  public void pushBack(AddFriendReq paramAddFriendReq)
  {
    internalJNI.AddFriendReqVec_pushBack(this.swigCPtr, this, AddFriendReq.getCPtr(paramAddFriendReq), paramAddFriendReq);
  }
  
  public void reserve(long paramLong)
  {
    internalJNI.AddFriendReqVec_reserve(this.swigCPtr, this, paramLong);
  }
  
  public void set(int paramInt, AddFriendReq paramAddFriendReq)
  {
    internalJNI.AddFriendReqVec_set(this.swigCPtr, this, paramInt, AddFriendReq.getCPtr(paramAddFriendReq), paramAddFriendReq);
  }
  
  public long size()
  {
    return internalJNI.AddFriendReqVec_size(this.swigCPtr, this);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\imcore\AddFriendReqVec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */