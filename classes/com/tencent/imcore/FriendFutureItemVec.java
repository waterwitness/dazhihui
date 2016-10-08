package com.tencent.imcore;

public class FriendFutureItemVec
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public FriendFutureItemVec()
  {
    this(internalJNI.new_FriendFutureItemVec__SWIG_0(), true);
  }
  
  public FriendFutureItemVec(long paramLong)
  {
    this(internalJNI.new_FriendFutureItemVec__SWIG_1(paramLong), true);
  }
  
  protected FriendFutureItemVec(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(FriendFutureItemVec paramFriendFutureItemVec)
  {
    if (paramFriendFutureItemVec == null) {
      return 0L;
    }
    return paramFriendFutureItemVec.swigCPtr;
  }
  
  public long capacity()
  {
    return internalJNI.FriendFutureItemVec_capacity(this.swigCPtr, this);
  }
  
  public void clear()
  {
    internalJNI.FriendFutureItemVec_clear(this.swigCPtr, this);
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
          internalJNI.delete_FriendFutureItemVec(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public boolean empty()
  {
    return internalJNI.FriendFutureItemVec_empty(this.swigCPtr, this);
  }
  
  protected void finalize()
  {
    delete();
  }
  
  public FriendFutureItem get(int paramInt)
  {
    return new FriendFutureItem(internalJNI.FriendFutureItemVec_get(this.swigCPtr, this, paramInt), false);
  }
  
  public void pushBack(FriendFutureItem paramFriendFutureItem)
  {
    internalJNI.FriendFutureItemVec_pushBack(this.swigCPtr, this, FriendFutureItem.getCPtr(paramFriendFutureItem), paramFriendFutureItem);
  }
  
  public void reserve(long paramLong)
  {
    internalJNI.FriendFutureItemVec_reserve(this.swigCPtr, this, paramLong);
  }
  
  public void set(int paramInt, FriendFutureItem paramFriendFutureItem)
  {
    internalJNI.FriendFutureItemVec_set(this.swigCPtr, this, paramInt, FriendFutureItem.getCPtr(paramFriendFutureItem), paramFriendFutureItem);
  }
  
  public long size()
  {
    return internalJNI.FriendFutureItemVec_size(this.swigCPtr, this);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\imcore\FriendFutureItemVec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */