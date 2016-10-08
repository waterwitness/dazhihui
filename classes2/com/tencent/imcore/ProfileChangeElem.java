package com.tencent.imcore;

public class ProfileChangeElem
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public ProfileChangeElem()
  {
    this(internalJNI.new_ProfileChangeElem(), true);
  }
  
  protected ProfileChangeElem(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(ProfileChangeElem paramProfileChangeElem)
  {
    if (paramProfileChangeElem == null) {
      return 0L;
    }
    return paramProfileChangeElem.swigCPtr;
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
          internalJNI.delete_ProfileChangeElem(this.swigCPtr);
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
  
  public String getFrom()
  {
    return internalJNI.ProfileChangeElem_from_get(this.swigCPtr, this);
  }
  
  public byte[] getNick()
  {
    return internalJNI.ProfileChangeElem_nick_get(this.swigCPtr, this);
  }
  
  public long getType()
  {
    return internalJNI.ProfileChangeElem_type_get(this.swigCPtr, this);
  }
  
  public void setFrom(String paramString)
  {
    internalJNI.ProfileChangeElem_from_set(this.swigCPtr, this, paramString);
  }
  
  public void setNick(byte[] paramArrayOfByte)
  {
    internalJNI.ProfileChangeElem_nick_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setType(long paramLong)
  {
    internalJNI.ProfileChangeElem_type_set(this.swigCPtr, this, paramLong);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\ProfileChangeElem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */