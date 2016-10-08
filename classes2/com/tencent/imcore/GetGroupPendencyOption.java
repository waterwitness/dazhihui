package com.tencent.imcore;

public class GetGroupPendencyOption
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public GetGroupPendencyOption()
  {
    this(internalJNI.new_GetGroupPendencyOption(), true);
  }
  
  protected GetGroupPendencyOption(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(GetGroupPendencyOption paramGetGroupPendencyOption)
  {
    if (paramGetGroupPendencyOption == null) {
      return 0L;
    }
    return paramGetGroupPendencyOption.swigCPtr;
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
          internalJNI.delete_GetGroupPendencyOption(this.swigCPtr);
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
  
  public long getMax_limited()
  {
    return internalJNI.GetGroupPendencyOption_max_limited_get(this.swigCPtr, this);
  }
  
  public long getStart_time()
  {
    return internalJNI.GetGroupPendencyOption_start_time_get(this.swigCPtr, this);
  }
  
  public void setMax_limited(long paramLong)
  {
    internalJNI.GetGroupPendencyOption_max_limited_set(this.swigCPtr, this, paramLong);
  }
  
  public void setStart_time(long paramLong)
  {
    internalJNI.GetGroupPendencyOption_start_time_set(this.swigCPtr, this, paramLong);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\GetGroupPendencyOption.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */