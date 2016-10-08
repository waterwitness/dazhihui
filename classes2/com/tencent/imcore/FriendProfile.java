package com.tencent.imcore;

public class FriendProfile
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public FriendProfile()
  {
    this(internalJNI.new_FriendProfile(), true);
  }
  
  protected FriendProfile(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(FriendProfile paramFriendProfile)
  {
    if (paramFriendProfile == null) {
      return 0L;
    }
    return paramFriendProfile.swigCPtr;
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
          internalJNI.delete_FriendProfile(this.swigCPtr);
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
    long l = internalJNI.FriendProfile_custom_info_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new BytesMap(l, false);
  }
  
  public long getDdwTinyId()
  {
    return internalJNI.FriendProfile_ddwTinyId_get(this.swigCPtr, this);
  }
  
  public long getResult()
  {
    return internalJNI.FriendProfile_result_get(this.swigCPtr, this);
  }
  
  public byte[] getSAddSource()
  {
    return internalJNI.FriendProfile_sAddSource_get(this.swigCPtr, this);
  }
  
  public byte[] getSAddWording()
  {
    return internalJNI.FriendProfile_sAddWording_get(this.swigCPtr, this);
  }
  
  public String getSAllowType()
  {
    return internalJNI.FriendProfile_sAllowType_get(this.swigCPtr, this);
  }
  
  public byte[] getSFaceURL()
  {
    return internalJNI.FriendProfile_sFaceURL_get(this.swigCPtr, this);
  }
  
  public BytesVec getSGroupNames()
  {
    long l = internalJNI.FriendProfile_sGroupNames_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new BytesVec(l, false);
  }
  
  public String getSIdentifier()
  {
    return internalJNI.FriendProfile_sIdentifier_get(this.swigCPtr, this);
  }
  
  public byte[] getSNickname()
  {
    return internalJNI.FriendProfile_sNickname_get(this.swigCPtr, this);
  }
  
  public byte[] getSRemark()
  {
    return internalJNI.FriendProfile_sRemark_get(this.swigCPtr, this);
  }
  
  public String getSResponseAction()
  {
    return internalJNI.FriendProfile_sResponseAction_get(this.swigCPtr, this);
  }
  
  public byte[] getSSelfSignature()
  {
    return internalJNI.FriendProfile_sSelfSignature_get(this.swigCPtr, this);
  }
  
  public void setCustom_info(BytesMap paramBytesMap)
  {
    internalJNI.FriendProfile_custom_info_set(this.swigCPtr, this, BytesMap.getCPtr(paramBytesMap), paramBytesMap);
  }
  
  public void setDdwTinyId(long paramLong)
  {
    internalJNI.FriendProfile_ddwTinyId_set(this.swigCPtr, this, paramLong);
  }
  
  public void setResult(long paramLong)
  {
    internalJNI.FriendProfile_result_set(this.swigCPtr, this, paramLong);
  }
  
  public void setSAddSource(byte[] paramArrayOfByte)
  {
    internalJNI.FriendProfile_sAddSource_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setSAddWording(byte[] paramArrayOfByte)
  {
    internalJNI.FriendProfile_sAddWording_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setSAllowType(String paramString)
  {
    internalJNI.FriendProfile_sAllowType_set(this.swigCPtr, this, paramString);
  }
  
  public void setSFaceURL(byte[] paramArrayOfByte)
  {
    internalJNI.FriendProfile_sFaceURL_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setSGroupNames(BytesVec paramBytesVec)
  {
    internalJNI.FriendProfile_sGroupNames_set(this.swigCPtr, this, BytesVec.getCPtr(paramBytesVec), paramBytesVec);
  }
  
  public void setSIdentifier(String paramString)
  {
    internalJNI.FriendProfile_sIdentifier_set(this.swigCPtr, this, paramString);
  }
  
  public void setSNickname(byte[] paramArrayOfByte)
  {
    internalJNI.FriendProfile_sNickname_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setSRemark(byte[] paramArrayOfByte)
  {
    internalJNI.FriendProfile_sRemark_set(this.swigCPtr, this, paramArrayOfByte);
  }
  
  public void setSResponseAction(String paramString)
  {
    internalJNI.FriendProfile_sResponseAction_set(this.swigCPtr, this, paramString);
  }
  
  public void setSSelfSignature(byte[] paramArrayOfByte)
  {
    internalJNI.FriendProfile_sSelfSignature_set(this.swigCPtr, this, paramArrayOfByte);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\FriendProfile.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */