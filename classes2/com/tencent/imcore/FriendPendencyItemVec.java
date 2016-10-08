package com.tencent.imcore;

public class FriendPendencyItemVec
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public FriendPendencyItemVec()
  {
    this(internalJNI.new_FriendPendencyItemVec__SWIG_0(), true);
  }
  
  public FriendPendencyItemVec(long paramLong)
  {
    this(internalJNI.new_FriendPendencyItemVec__SWIG_1(paramLong), true);
  }
  
  protected FriendPendencyItemVec(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(FriendPendencyItemVec paramFriendPendencyItemVec)
  {
    if (paramFriendPendencyItemVec == null) {
      return 0L;
    }
    return paramFriendPendencyItemVec.swigCPtr;
  }
  
  public long capacity()
  {
    return internalJNI.FriendPendencyItemVec_capacity(this.swigCPtr, this);
  }
  
  public void clear()
  {
    internalJNI.FriendPendencyItemVec_clear(this.swigCPtr, this);
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
          internalJNI.delete_FriendPendencyItemVec(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public boolean empty()
  {
    return internalJNI.FriendPendencyItemVec_empty(this.swigCPtr, this);
  }
  
  protected void finalize()
  {
    delete();
  }
  
  public FriendPendencyItem get(int paramInt)
  {
    return new FriendPendencyItem(internalJNI.FriendPendencyItemVec_get(this.swigCPtr, this, paramInt), false);
  }
  
  public void pushBack(FriendPendencyItem paramFriendPendencyItem)
  {
    internalJNI.FriendPendencyItemVec_pushBack(this.swigCPtr, this, FriendPendencyItem.getCPtr(paramFriendPendencyItem), paramFriendPendencyItem);
  }
  
  public void reserve(long paramLong)
  {
    internalJNI.FriendPendencyItemVec_reserve(this.swigCPtr, this, paramLong);
  }
  
  public void set(int paramInt, FriendPendencyItem paramFriendPendencyItem)
  {
    internalJNI.FriendPendencyItemVec_set(this.swigCPtr, this, paramInt, FriendPendencyItem.getCPtr(paramFriendPendencyItem), paramFriendPendencyItem);
  }
  
  public long size()
  {
    return internalJNI.FriendPendencyItemVec_size(this.swigCPtr, this);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\FriendPendencyItemVec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */