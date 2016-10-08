package com.tencent.imcore;

public class FriendProfileUpdateItem
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public FriendProfileUpdateItem()
  {
    this(internalJNI.new_FriendProfileUpdateItem(), true);
  }
  
  protected FriendProfileUpdateItem(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(FriendProfileUpdateItem paramFriendProfileUpdateItem)
  {
    if (paramFriendProfileUpdateItem == null) {
      return 0L;
    }
    return paramFriendProfileUpdateItem.swigCPtr;
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
          internalJNI.delete_FriendProfileUpdateItem(this.swigCPtr);
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
  
  public String getBytes_value()
  {
    return internalJNI.FriendProfileUpdateItem_bytes_value_get(this.swigCPtr, this);
  }
  
  public String getTag()
  {
    return internalJNI.FriendProfileUpdateItem_tag_get(this.swigCPtr, this);
  }
  
  public long getUint64_value()
  {
    return internalJNI.FriendProfileUpdateItem_uint64_value_get(this.swigCPtr, this);
  }
  
  public StrVec getVec_bytes_value()
  {
    long l = internalJNI.FriendProfileUpdateItem_vec_bytes_value_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new StrVec(l, false);
  }
  
  public void setBytes_value(String paramString)
  {
    internalJNI.FriendProfileUpdateItem_bytes_value_set(this.swigCPtr, this, paramString);
  }
  
  public void setTag(String paramString)
  {
    internalJNI.FriendProfileUpdateItem_tag_set(this.swigCPtr, this, paramString);
  }
  
  public void setUint64_value(long paramLong)
  {
    internalJNI.FriendProfileUpdateItem_uint64_value_set(this.swigCPtr, this, paramLong);
  }
  
  public void setVec_bytes_value(StrVec paramStrVec)
  {
    internalJNI.FriendProfileUpdateItem_vec_bytes_value_set(this.swigCPtr, this, StrVec.getCPtr(paramStrVec), paramStrVec);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\FriendProfileUpdateItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */