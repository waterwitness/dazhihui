package com.tencent.imcore;

public class FriendGroup
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public FriendGroup()
  {
    this(internalJNI.new_FriendGroup(), true);
  }
  
  protected FriendGroup(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(FriendGroup paramFriendGroup)
  {
    if (paramFriendGroup == null) {
      return 0L;
    }
    return paramFriendGroup.swigCPtr;
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
          internalJNI.delete_FriendGroup(this.swigCPtr);
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
  
  public long getCount()
  {
    return internalJNI.FriendGroup_count_get(this.swigCPtr, this);
  }
  
  public StrVec getIdentifiers()
  {
    long l = internalJNI.FriendGroup_identifiers_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new StrVec(l, false);
  }
  
  public byte[] getName()
  {
    return internalJNI.FriendGroup_name_get(this.swigCPtr, this);
  }
  
  public FriendProfileVec getProfiles()
  {
    long l = internalJNI.FriendGroup_profiles_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new FriendProfileVec(l, false);
  }
  
  public SWIGTYPE_p_std__vectorT_long_long_t getTinyids()
  {
    long l = internalJNI.FriendGroup_tinyids_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new SWIGTYPE_p_std__vectorT_long_long_t(l, false);
  }
  
  public void setCount(long paramLong)
  {
    internalJNI.FriendGroup_count_set(this.swigCPtr, this, paramLong);
  }
  
  public void setIdentifiers(StrVec paramStrVec)
  {
    internalJNI.FriendGroup_identifiers_set(this.swigCPtr, this, StrVec.getCPtr(paramStrVec), paramStrVec);
  }
  
  public void setName(byte[] paramArrayOfByte)
  {
    internalJNI.FriendGroup_name_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setProfiles(FriendProfileVec paramFriendProfileVec)
  {
    internalJNI.FriendGroup_profiles_set(this.swigCPtr, this, FriendProfileVec.getCPtr(paramFriendProfileVec), paramFriendProfileVec);
  }
  
  public void setTinyids(SWIGTYPE_p_std__vectorT_long_long_t paramSWIGTYPE_p_std__vectorT_long_long_t)
  {
    internalJNI.FriendGroup_tinyids_set(this.swigCPtr, this, SWIGTYPE_p_std__vectorT_long_long_t.getCPtr(paramSWIGTYPE_p_std__vectorT_long_long_t));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\imcore\FriendGroup.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */