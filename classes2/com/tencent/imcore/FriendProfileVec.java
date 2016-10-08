package com.tencent.imcore;

public class FriendProfileVec
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public FriendProfileVec()
  {
    this(internalJNI.new_FriendProfileVec__SWIG_0(), true);
  }
  
  public FriendProfileVec(long paramLong)
  {
    this(internalJNI.new_FriendProfileVec__SWIG_1(paramLong), true);
  }
  
  protected FriendProfileVec(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(FriendProfileVec paramFriendProfileVec)
  {
    if (paramFriendProfileVec == null) {
      return 0L;
    }
    return paramFriendProfileVec.swigCPtr;
  }
  
  public long capacity()
  {
    return internalJNI.FriendProfileVec_capacity(this.swigCPtr, this);
  }
  
  public void clear()
  {
    internalJNI.FriendProfileVec_clear(this.swigCPtr, this);
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
          internalJNI.delete_FriendProfileVec(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public boolean empty()
  {
    return internalJNI.FriendProfileVec_empty(this.swigCPtr, this);
  }
  
  protected void finalize()
  {
    delete();
  }
  
  public FriendProfile get(int paramInt)
  {
    return new FriendProfile(internalJNI.FriendProfileVec_get(this.swigCPtr, this, paramInt), false);
  }
  
  public void pushBack(FriendProfile paramFriendProfile)
  {
    internalJNI.FriendProfileVec_pushBack(this.swigCPtr, this, FriendProfile.getCPtr(paramFriendProfile), paramFriendProfile);
  }
  
  public void reserve(long paramLong)
  {
    internalJNI.FriendProfileVec_reserve(this.swigCPtr, this, paramLong);
  }
  
  public void set(int paramInt, FriendProfile paramFriendProfile)
  {
    internalJNI.FriendProfileVec_set(this.swigCPtr, this, paramInt, FriendProfile.getCPtr(paramFriendProfile), paramFriendProfile);
  }
  
  public long size()
  {
    return internalJNI.FriendProfileVec_size(this.swigCPtr, this);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\FriendProfileVec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */