package com.tencent.imcore;

public class GetGroupMemInfoOption
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public GetGroupMemInfoOption()
  {
    this(internalJNI.new_GetGroupMemInfoOption(), true);
  }
  
  protected GetGroupMemInfoOption(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(GetGroupMemInfoOption paramGetGroupMemInfoOption)
  {
    if (paramGetGroupMemInfoOption == null) {
      return 0L;
    }
    return paramGetGroupMemInfoOption.swigCPtr;
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
          internalJNI.delete_GetGroupMemInfoOption(this.swigCPtr);
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
    long l = internalJNI.GetGroupMemInfoOption_custom_info_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new BytesMap(l, false);
  }
  
  public GroupMemRoleFilter getFilter()
  {
    return GroupMemRoleFilter.swigToEnum(internalJNI.GetGroupMemInfoOption_filter_get(this.swigCPtr, this));
  }
  
  public long getFlag()
  {
    return internalJNI.GetGroupMemInfoOption_flag_get(this.swigCPtr, this);
  }
  
  public String getGroup_id()
  {
    return internalJNI.GetGroupMemInfoOption_group_id_get(this.swigCPtr, this);
  }
  
  public StrVec getMembers()
  {
    long l = internalJNI.GetGroupMemInfoOption_members_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new StrVec(l, false);
  }
  
  public void setCustom_info(BytesMap paramBytesMap)
  {
    internalJNI.GetGroupMemInfoOption_custom_info_set(this.swigCPtr, this, BytesMap.getCPtr(paramBytesMap), paramBytesMap);
  }
  
  public void setFilter(GroupMemRoleFilter paramGroupMemRoleFilter)
  {
    internalJNI.GetGroupMemInfoOption_filter_set(this.swigCPtr, this, paramGroupMemRoleFilter.swigValue());
  }
  
  public void setFlag(long paramLong)
  {
    internalJNI.GetGroupMemInfoOption_flag_set(this.swigCPtr, this, paramLong);
  }
  
  public void setGroup_id(String paramString)
  {
    internalJNI.GetGroupMemInfoOption_group_id_set(this.swigCPtr, this, paramString);
  }
  
  public void setMembers(StrVec paramStrVec)
  {
    internalJNI.GetGroupMemInfoOption_members_set(this.swigCPtr, this, StrVec.getCPtr(paramStrVec), paramStrVec);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\GetGroupMemInfoOption.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */