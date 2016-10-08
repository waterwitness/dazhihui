package com.tencent.imcore;

public class FriendChangeInfoVec
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public FriendChangeInfoVec()
  {
    this(internalJNI.new_FriendChangeInfoVec__SWIG_0(), true);
  }
  
  public FriendChangeInfoVec(long paramLong)
  {
    this(internalJNI.new_FriendChangeInfoVec__SWIG_1(paramLong), true);
  }
  
  protected FriendChangeInfoVec(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(FriendChangeInfoVec paramFriendChangeInfoVec)
  {
    if (paramFriendChangeInfoVec == null) {
      return 0L;
    }
    return paramFriendChangeInfoVec.swigCPtr;
  }
  
  public long capacity()
  {
    return internalJNI.FriendChangeInfoVec_capacity(this.swigCPtr, this);
  }
  
  public void clear()
  {
    internalJNI.FriendChangeInfoVec_clear(this.swigCPtr, this);
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
          internalJNI.delete_FriendChangeInfoVec(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public boolean empty()
  {
    return internalJNI.FriendChangeInfoVec_empty(this.swigCPtr, this);
  }
  
  protected void finalize()
  {
    delete();
  }
  
  public FriendChangeUserInfo get(int paramInt)
  {
    return new FriendChangeUserInfo(internalJNI.FriendChangeInfoVec_get(this.swigCPtr, this, paramInt), false);
  }
  
  public void pushBack(FriendChangeUserInfo paramFriendChangeUserInfo)
  {
    internalJNI.FriendChangeInfoVec_pushBack(this.swigCPtr, this, FriendChangeUserInfo.getCPtr(paramFriendChangeUserInfo), paramFriendChangeUserInfo);
  }
  
  public void reserve(long paramLong)
  {
    internalJNI.FriendChangeInfoVec_reserve(this.swigCPtr, this, paramLong);
  }
  
  public void set(int paramInt, FriendChangeUserInfo paramFriendChangeUserInfo)
  {
    internalJNI.FriendChangeInfoVec_set(this.swigCPtr, this, paramInt, FriendChangeUserInfo.getCPtr(paramFriendChangeUserInfo), paramFriendChangeUserInfo);
  }
  
  public long size()
  {
    return internalJNI.FriendChangeInfoVec_size(this.swigCPtr, this);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\imcore\FriendChangeInfoVec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */