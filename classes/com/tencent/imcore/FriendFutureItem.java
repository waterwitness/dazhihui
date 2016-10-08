package com.tencent.imcore;

public class FriendFutureItem
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public FriendFutureItem()
  {
    this(internalJNI.new_FriendFutureItem(), true);
  }
  
  protected FriendFutureItem(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(FriendFutureItem paramFriendFutureItem)
  {
    if (paramFriendFutureItem == null) {
      return 0L;
    }
    return paramFriendFutureItem.swigCPtr;
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
          internalJNI.delete_FriendFutureItem(this.swigCPtr);
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
  
  public long getDdwAddTime()
  {
    return internalJNI.FriendFutureItem_ddwAddTime_get(this.swigCPtr, this);
  }
  
  public FutureType getEType()
  {
    return FutureType.swigToEnum(internalJNI.FriendFutureItem_eType_get(this.swigCPtr, this));
  }
  
  public BytesMap getMpRecommendTags()
  {
    long l = internalJNI.FriendFutureItem_mpRecommendTags_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new BytesMap(l, false);
  }
  
  public byte[] getSAddSource()
  {
    return internalJNI.FriendFutureItem_sAddSource_get(this.swigCPtr, this);
  }
  
  public byte[] getSAddWording()
  {
    return internalJNI.FriendFutureItem_sAddWording_get(this.swigCPtr, this);
  }
  
  public String getSIdentifier()
  {
    return internalJNI.FriendFutureItem_sIdentifier_get(this.swigCPtr, this);
  }
  
  public FriendProfile getStProfile()
  {
    long l = internalJNI.FriendFutureItem_stProfile_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new FriendProfile(l, false);
  }
  
  public void setDdwAddTime(long paramLong)
  {
    internalJNI.FriendFutureItem_ddwAddTime_set(this.swigCPtr, this, paramLong);
  }
  
  public void setEType(FutureType paramFutureType)
  {
    internalJNI.FriendFutureItem_eType_set(this.swigCPtr, this, paramFutureType.swigValue());
  }
  
  public void setMpRecommendTags(BytesMap paramBytesMap)
  {
    internalJNI.FriendFutureItem_mpRecommendTags_set(this.swigCPtr, this, BytesMap.getCPtr(paramBytesMap), paramBytesMap);
  }
  
  public void setSAddSource(byte[] paramArrayOfByte)
  {
    internalJNI.FriendFutureItem_sAddSource_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setSAddWording(byte[] paramArrayOfByte)
  {
    internalJNI.FriendFutureItem_sAddWording_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setSIdentifier(String paramString)
  {
    internalJNI.FriendFutureItem_sIdentifier_set(this.swigCPtr, this, paramString);
  }
  
  public void setStProfile(FriendProfile paramFriendProfile)
  {
    internalJNI.FriendFutureItem_stProfile_set(this.swigCPtr, this, FriendProfile.getCPtr(paramFriendProfile), paramFriendProfile);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\imcore\FriendFutureItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */