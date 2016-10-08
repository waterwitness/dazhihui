package com.tencent.imcore;

public class FriendGroupItem
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public FriendGroupItem()
  {
    this(internalJNI.new_FriendGroupItem(), true);
  }
  
  protected FriendGroupItem(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(FriendGroupItem paramFriendGroupItem)
  {
    if (paramFriendGroupItem == null) {
      return 0L;
    }
    return paramFriendGroupItem.swigCPtr;
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
          internalJNI.delete_FriendGroupItem(this.swigCPtr);
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
  
  public SWIGTYPE_p_std__setT_std__string_t getIdentifiers()
  {
    long l = internalJNI.FriendGroupItem_identifiers_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new SWIGTYPE_p_std__setT_std__string_t(l, false);
  }
  
  public byte[] getName()
  {
    return internalJNI.FriendGroupItem_name_get(this.swigCPtr, this);
  }
  
  public void setIdentifiers(SWIGTYPE_p_std__setT_std__string_t paramSWIGTYPE_p_std__setT_std__string_t)
  {
    internalJNI.FriendGroupItem_identifiers_set(this.swigCPtr, this, SWIGTYPE_p_std__setT_std__string_t.getCPtr(paramSWIGTYPE_p_std__setT_std__string_t));
  }
  
  public void setName(byte[] paramArrayOfByte)
  {
    internalJNI.FriendGroupItem_name_set(this.swigCPtr, this, paramArrayOfByte);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\imcore\FriendGroupItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */