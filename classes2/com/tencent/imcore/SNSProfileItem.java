package com.tencent.imcore;

public class SNSProfileItem
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public SNSProfileItem()
  {
    this(internalJNI.new_SNSProfileItem(), true);
  }
  
  protected SNSProfileItem(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(SNSProfileItem paramSNSProfileItem)
  {
    if (paramSNSProfileItem == null) {
      return 0L;
    }
    return paramSNSProfileItem.swigCPtr;
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
          internalJNI.delete_SNSProfileItem(this.swigCPtr);
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
  
  public BytesMap getMpCustom()
  {
    long l = internalJNI.SNSProfileItem_mpCustom_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new BytesMap(l, false);
  }
  
  public BytesMap getMpProfiles()
  {
    long l = internalJNI.SNSProfileItem_mpProfiles_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new BytesMap(l, false);
  }
  
  public String getSIdentifier()
  {
    return internalJNI.SNSProfileItem_sIdentifier_get(this.swigCPtr, this);
  }
  
  public void setMpCustom(BytesMap paramBytesMap)
  {
    internalJNI.SNSProfileItem_mpCustom_set(this.swigCPtr, this, BytesMap.getCPtr(paramBytesMap), paramBytesMap);
  }
  
  public void setMpProfiles(BytesMap paramBytesMap)
  {
    internalJNI.SNSProfileItem_mpProfiles_set(this.swigCPtr, this, BytesMap.getCPtr(paramBytesMap), paramBytesMap);
  }
  
  public void setSIdentifier(String paramString)
  {
    internalJNI.SNSProfileItem_sIdentifier_set(this.swigCPtr, this, paramString);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\SNSProfileItem.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */