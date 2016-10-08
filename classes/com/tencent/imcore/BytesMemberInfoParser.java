package com.tencent.imcore;

public class BytesMemberInfoParser
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public BytesMemberInfoParser()
  {
    this(internalJNI.new_BytesMemberInfoParser(), true);
  }
  
  protected BytesMemberInfoParser(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(BytesMemberInfoParser paramBytesMemberInfoParser)
  {
    if (paramBytesMemberInfoParser == null) {
      return 0L;
    }
    return paramBytesMemberInfoParser.swigCPtr;
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
          internalJNI.delete_BytesMemberInfoParser(this.swigCPtr);
        }
        this.swigCPtr = 0L;
      }
      return;
    }
    finally {}
  }
  
  public void fetchMapKeys(SWIGTYPE_p_std__mapT_std__string_imcore__NewGroupMemberInfo_t paramSWIGTYPE_p_std__mapT_std__string_imcore__NewGroupMemberInfo_t)
  {
    internalJNI.BytesMemberInfoParser_fetchMapKeys(this.swigCPtr, this, SWIGTYPE_p_std__mapT_std__string_imcore__NewGroupMemberInfo_t.getCPtr(paramSWIGTYPE_p_std__mapT_std__string_imcore__NewGroupMemberInfo_t));
  }
  
  protected void finalize()
  {
    delete();
  }
  
  public SWIGTYPE_p_std__string getKey(int paramInt)
  {
    long l = internalJNI.BytesMemberInfoParser_getKey(this.swigCPtr, this, paramInt);
    if (l == 0L) {
      return null;
    }
    return new SWIGTYPE_p_std__string(l, false);
  }
  
  public StrVec getKeys()
  {
    long l = internalJNI.BytesMemberInfoParser_keys_get(this.swigCPtr, this);
    if (l == 0L) {
      return null;
    }
    return new StrVec(l, false);
  }
  
  public NewGroupMemberInfo getValue(SWIGTYPE_p_std__mapT_std__string_imcore__NewGroupMemberInfo_t paramSWIGTYPE_p_std__mapT_std__string_imcore__NewGroupMemberInfo_t, int paramInt)
  {
    long l = internalJNI.BytesMemberInfoParser_getValue(this.swigCPtr, this, SWIGTYPE_p_std__mapT_std__string_imcore__NewGroupMemberInfo_t.getCPtr(paramSWIGTYPE_p_std__mapT_std__string_imcore__NewGroupMemberInfo_t), paramInt);
    if (l == 0L) {
      return null;
    }
    return new NewGroupMemberInfo(l, false);
  }
  
  public void setKeys(StrVec paramStrVec)
  {
    internalJNI.BytesMemberInfoParser_keys_set(this.swigCPtr, this, StrVec.getCPtr(paramStrVec), paramStrVec);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\imcore\BytesMemberInfoParser.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */