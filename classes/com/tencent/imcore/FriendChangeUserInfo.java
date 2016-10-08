package com.tencent.imcore;

public class FriendChangeUserInfo
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public FriendChangeUserInfo()
  {
    this(internalJNI.new_FriendChangeUserInfo(), true);
  }
  
  protected FriendChangeUserInfo(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(FriendChangeUserInfo paramFriendChangeUserInfo)
  {
    if (paramFriendChangeUserInfo == null) {
      return 0L;
    }
    return paramFriendChangeUserInfo.swigCPtr;
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
          internalJNI.delete_FriendChangeUserInfo(this.swigCPtr);
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
  
  public byte[] getAdd_source()
  {
    return internalJNI.FriendChangeUserInfo_add_source_get(this.swigCPtr, this);
  }
  
  public byte[] getAdd_wording()
  {
    return internalJNI.FriendChangeUserInfo_add_wording_get(this.swigCPtr, this);
  }
  
  public byte[] getGroup()
  {
    return internalJNI.FriendChangeUserInfo_group_get(this.swigCPtr, this);
  }
  
  public String getIdentifier()
  {
    return internalJNI.FriendChangeUserInfo_identifier_get(this.swigCPtr, this);
  }
  
  public byte[] getNick()
  {
    return internalJNI.FriendChangeUserInfo_nick_get(this.swigCPtr, this);
  }
  
  public byte[] getRemark()
  {
    return internalJNI.FriendChangeUserInfo_remark_get(this.swigCPtr, this);
  }
  
  public void setAdd_source(byte[] paramArrayOfByte)
  {
    internalJNI.FriendChangeUserInfo_add_source_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setAdd_wording(byte[] paramArrayOfByte)
  {
    internalJNI.FriendChangeUserInfo_add_wording_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setGroup(byte[] paramArrayOfByte)
  {
    internalJNI.FriendChangeUserInfo_group_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setIdentifier(String paramString)
  {
    internalJNI.FriendChangeUserInfo_identifier_set(this.swigCPtr, this, paramString);
  }
  
  public void setNick(byte[] paramArrayOfByte)
  {
    internalJNI.FriendChangeUserInfo_nick_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setRemark(byte[] paramArrayOfByte)
  {
    internalJNI.FriendChangeUserInfo_remark_set(this.swigCPtr, this, paramArrayOfByte);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\imcore\FriendChangeUserInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */