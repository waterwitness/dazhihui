package com.tencent.imcore;

public class GetProfileOption
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public GetProfileOption()
  {
    this(internalJNI.new_GetProfileOption(), true);
  }
  
  protected GetProfileOption(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(GetProfileOption paramGetProfileOption)
  {
    if (paramGetProfileOption == null) {
      return 0L;
    }
    return paramGetProfileOption.swigCPtr;
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
          internalJNI.delete_GetProfileOption(this.swigCPtr);
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
  
  public BytesMap getCustom_info()
  {
    long l = internalJNI.GetProfileOption_custom_info_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new BytesMap(l, false);
  }
  
  public long getFlag()
  {
    return internalJNI.GetProfileOption_flag_get(this.swigCPtr, this);
  }
  
  public void setCustom_info(BytesMap paramBytesMap)
  {
    internalJNI.GetProfileOption_custom_info_set(this.swigCPtr, this, BytesMap.getCPtr(paramBytesMap), paramBytesMap);
  }
  
  public void setFlag(long paramLong)
  {
    internalJNI.GetProfileOption_flag_set(this.swigCPtr, this, paramLong);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\GetProfileOption.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */