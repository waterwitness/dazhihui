package com.tencent.imcore;

public class UpdateInfoOpt
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public UpdateInfoOpt(long paramLong)
  {
    this(internalJNI.new_UpdateInfoOpt(paramLong), true);
  }
  
  protected UpdateInfoOpt(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(UpdateInfoOpt paramUpdateInfoOpt)
  {
    if (paramUpdateInfoOpt == null) {
      return 0L;
    }
    return paramUpdateInfoOpt.swigCPtr;
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
          internalJNI.delete_UpdateInfoOpt(this.swigCPtr);
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
  
  public BytesVec getCustomInfoTags()
  {
    long l = internalJNI.UpdateInfoOpt_customInfoTags_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new BytesVec(l, false);
  }
  
  public long getFlag()
  {
    return internalJNI.UpdateInfoOpt_flag_get(this.swigCPtr, this);
  }
  
  public void setCustomInfoTags(BytesVec paramBytesVec)
  {
    internalJNI.UpdateInfoOpt_customInfoTags_set(this.swigCPtr, this, BytesVec.getCPtr(paramBytesVec), paramBytesVec);
  }
  
  public void setFlag(long paramLong)
  {
    internalJNI.UpdateInfoOpt_flag_set(this.swigCPtr, this, paramLong);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\UpdateInfoOpt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */