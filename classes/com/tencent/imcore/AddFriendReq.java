package com.tencent.imcore;

public class AddFriendReq
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public AddFriendReq()
  {
    this(internalJNI.new_AddFriendReq(), true);
  }
  
  protected AddFriendReq(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(AddFriendReq paramAddFriendReq)
  {
    if (paramAddFriendReq == null) {
      return 0L;
    }
    return paramAddFriendReq.swigCPtr;
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
          internalJNI.delete_AddFriendReq(this.swigCPtr);
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
  
  public String getIdentifier()
  {
    return internalJNI.AddFriendReq_identifier_get(this.swigCPtr, this);
  }
  
  public byte[] getNickname()
  {
    return internalJNI.AddFriendReq_nickname_get(this.swigCPtr, this);
  }
  
  public byte[] getSource()
  {
    return internalJNI.AddFriendReq_source_get(this.swigCPtr, this);
  }
  
  public byte[] getWording()
  {
    return internalJNI.AddFriendReq_wording_get(this.swigCPtr, this);
  }
  
  public void setIdentifier(String paramString)
  {
    internalJNI.AddFriendReq_identifier_set(this.swigCPtr, this, paramString);
  }
  
  public void setNickname(byte[] paramArrayOfByte)
  {
    internalJNI.AddFriendReq_nickname_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setSource(byte[] paramArrayOfByte)
  {
    internalJNI.AddFriendReq_source_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setWording(byte[] paramArrayOfByte)
  {
    internalJNI.AddFriendReq_wording_set(this.swigCPtr, this, paramArrayOfByte);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\imcore\AddFriendReq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */