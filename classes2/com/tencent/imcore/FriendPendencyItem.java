package com.tencent.imcore;

public class FriendPendencyItem
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public FriendPendencyItem()
  {
    this(internalJNI.new_FriendPendencyItem(), true);
  }
  
  protected FriendPendencyItem(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(FriendPendencyItem paramFriendPendencyItem)
  {
    if (paramFriendPendencyItem == null) {
      return 0L;
    }
    return paramFriendPendencyItem.swigCPtr;
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
          internalJNI.delete_FriendPendencyItem(this.swigCPtr);
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
    return internalJNI.FriendPendencyItem_ddwAddTime_get(this.swigCPtr, this);
  }
  
  public int getIType()
  {
    return internalJNI.FriendPendencyItem_iType_get(this.swigCPtr, this);
  }
  
  public byte[] getSAddSource()
  {
    return internalJNI.FriendPendencyItem_sAddSource_get(this.swigCPtr, this);
  }
  
  public byte[] getSAddWording()
  {
    return internalJNI.FriendPendencyItem_sAddWording_get(this.swigCPtr, this);
  }
  
  public String getSIdentifier()
  {
    return internalJNI.FriendPendencyItem_sIdentifier_get(this.swigCPtr, this);
  }
  
  public byte[] getSNickname()
  {
    return internalJNI.FriendPendencyItem_sNickname_get(this.swigCPtr, this);
  }
  
  public void setDdwAddTime(long paramLong)
  {
    internalJNI.FriendPendencyItem_ddwAddTime_set(this.swigCPtr, this, paramLong);
  }
  
  public void setIType(int paramInt)
  {
    internalJNI.FriendPendencyItem_iType_set(this.swigCPtr, this, paramInt);
  }
  
  public void setSAddSource(byte[] paramArrayOfByte)
  {
    internalJNI.FriendPendencyItem_sAddSource_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setSAddWording(byte[] paramArrayOfByte)
  {
    internalJNI.FriendPendencyItem_sAddWording_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setSIdentifier(String paramString)
  {
    internalJNI.FriendPendencyItem_sIdentifier_set(this.swigCPtr, this, paramString);
  }
  
  public void setSNickname(byte[] paramArrayOfByte)
  {
    internalJNI.FriendPendencyItem_sNickname_set(this.swigCPtr, this, paramArrayOfByte);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\FriendPendencyItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */