package com.tencent.imcore;

public class FriendGroupVec
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public FriendGroupVec()
  {
    this(internalJNI.new_FriendGroupVec__SWIG_0(), true);
  }
  
  public FriendGroupVec(long paramLong)
  {
    this(internalJNI.new_FriendGroupVec__SWIG_1(paramLong), true);
  }
  
  protected FriendGroupVec(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(FriendGroupVec paramFriendGroupVec)
  {
    if (paramFriendGroupVec == null) {
      return 0L;
    }
    return paramFriendGroupVec.swigCPtr;
  }
  
  public long capacity()
  {
    return internalJNI.FriendGroupVec_capacity(this.swigCPtr, this);
  }
  
  public void clear()
  {
    internalJNI.FriendGroupVec_clear(this.swigCPtr, this);
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
          internalJNI.delete_FriendGroupVec(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public boolean empty()
  {
    return internalJNI.FriendGroupVec_empty(this.swigCPtr, this);
  }
  
  protected void finalize()
  {
    delete();
  }
  
  public FriendGroup get(int paramInt)
  {
    return new FriendGroup(internalJNI.FriendGroupVec_get(this.swigCPtr, this, paramInt), false);
  }
  
  public void pushBack(FriendGroup paramFriendGroup)
  {
    internalJNI.FriendGroupVec_pushBack(this.swigCPtr, this, FriendGroup.getCPtr(paramFriendGroup), paramFriendGroup);
  }
  
  public void reserve(long paramLong)
  {
    internalJNI.FriendGroupVec_reserve(this.swigCPtr, this, paramLong);
  }
  
  public void set(int paramInt, FriendGroup paramFriendGroup)
  {
    internalJNI.FriendGroupVec_set(this.swigCPtr, this, paramInt, FriendGroup.getCPtr(paramFriendGroup), paramFriendGroup);
  }
  
  public long size()
  {
    return internalJNI.FriendGroupVec_size(this.swigCPtr, this);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\imcore\FriendGroupVec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */