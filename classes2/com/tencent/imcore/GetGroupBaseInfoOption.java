package com.tencent.imcore;

public class GetGroupBaseInfoOption
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public GetGroupBaseInfoOption()
  {
    this(internalJNI.new_GetGroupBaseInfoOption(), true);
  }
  
  protected GetGroupBaseInfoOption(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(GetGroupBaseInfoOption paramGetGroupBaseInfoOption)
  {
    if (paramGetGroupBaseInfoOption == null) {
      return 0L;
    }
    return paramGetGroupBaseInfoOption.swigCPtr;
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
          internalJNI.delete_GetGroupBaseInfoOption(this.swigCPtr);
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
    long l = internalJNI.GetGroupBaseInfoOption_custom_info_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new BytesMap(l, false);
  }
  
  public long getFlag()
  {
    return internalJNI.GetGroupBaseInfoOption_flag_get(this.swigCPtr, this);
  }
  
  public StrVec getGroups()
  {
    long l = internalJNI.GetGroupBaseInfoOption_groups_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new StrVec(l, false);
  }
  
  public void setCustom_info(BytesMap paramBytesMap)
  {
    internalJNI.GetGroupBaseInfoOption_custom_info_set(this.swigCPtr, this, BytesMap.getCPtr(paramBytesMap), paramBytesMap);
  }
  
  public void setFlag(long paramLong)
  {
    internalJNI.GetGroupBaseInfoOption_flag_set(this.swigCPtr, this, paramLong);
  }
  
  public void setGroups(StrVec paramStrVec)
  {
    internalJNI.GetGroupBaseInfoOption_groups_set(this.swigCPtr, this, StrVec.getCPtr(paramStrVec), paramStrVec);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\GetGroupBaseInfoOption.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */