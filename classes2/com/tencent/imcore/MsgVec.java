package com.tencent.imcore;

public class MsgVec
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public MsgVec()
  {
    this(internalJNI.new_MsgVec__SWIG_0(), true);
  }
  
  public MsgVec(long paramLong)
  {
    this(internalJNI.new_MsgVec__SWIG_1(paramLong), true);
  }
  
  protected MsgVec(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(MsgVec paramMsgVec)
  {
    if (paramMsgVec == null) {
      return 0L;
    }
    return paramMsgVec.swigCPtr;
  }
  
  public long capacity()
  {
    return internalJNI.MsgVec_capacity(this.swigCPtr, this);
  }
  
  public void clear()
  {
    internalJNI.MsgVec_clear(this.swigCPtr, this);
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
          internalJNI.delete_MsgVec(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public boolean empty()
  {
    return internalJNI.MsgVec_empty(this.swigCPtr, this);
  }
  
  protected void finalize()
  {
    delete();
  }
  
  public Msg get(int paramInt)
  {
    return new Msg(internalJNI.MsgVec_get(this.swigCPtr, this, paramInt), false);
  }
  
  public void pushBack(Msg paramMsg)
  {
    internalJNI.MsgVec_pushBack(this.swigCPtr, this, Msg.getCPtr(paramMsg), paramMsg);
  }
  
  public void reserve(long paramLong)
  {
    internalJNI.MsgVec_reserve(this.swigCPtr, this, paramLong);
  }
  
  public void set(int paramInt, Msg paramMsg)
  {
    internalJNI.MsgVec_set(this.swigCPtr, this, paramInt, Msg.getCPtr(paramMsg), paramMsg);
  }
  
  public long size()
  {
    return internalJNI.MsgVec_size(this.swigCPtr, this);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\MsgVec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */