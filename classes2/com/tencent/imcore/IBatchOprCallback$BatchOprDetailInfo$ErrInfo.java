package com.tencent.imcore;

public class IBatchOprCallback$BatchOprDetailInfo$ErrInfo
{
  protected boolean swigCMemOwn;
  private long swigCPtr;
  
  public IBatchOprCallback$BatchOprDetailInfo$ErrInfo()
  {
    this(internalJNI.new_IBatchOprCallback_BatchOprDetailInfo_ErrInfo(), true);
  }
  
  protected IBatchOprCallback$BatchOprDetailInfo$ErrInfo(long paramLong, boolean paramBoolean)
  {
    this.swigCMemOwn = paramBoolean;
    this.swigCPtr = paramLong;
  }
  
  protected static long getCPtr(ErrInfo paramErrInfo)
  {
    if (paramErrInfo == null) {
      return 0L;
    }
    return paramErrInfo.swigCPtr;
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
          internalJNI.delete_IBatchOprCallback_BatchOprDetailInfo_ErrInfo(this.swigCPtr);
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
  
  public int getErr_code()
  {
    return internalJNI.IBatchOprCallback_BatchOprDetailInfo_ErrInfo_err_code_get(this.swigCPtr, this);
  }
  
  public String getErr_msg()
  {
    return internalJNI.IBatchOprCallback_BatchOprDetailInfo_ErrInfo_err_msg_get(this.swigCPtr, this);
  }
  
  public String getId()
  {
    return internalJNI.IBatchOprCallback_BatchOprDetailInfo_ErrInfo_id_get(this.swigCPtr, this);
  }
  
  public void setErr_code(int paramInt)
  {
    internalJNI.IBatchOprCallback_BatchOprDetailInfo_ErrInfo_err_code_set(this.swigCPtr, this, paramInt);
  }
  
  public void setErr_msg(String paramString)
  {
    internalJNI.IBatchOprCallback_BatchOprDetailInfo_ErrInfo_err_msg_set(this.swigCPtr, this, paramString);
  }
  
  public void setId(String paramString)
  {
    internalJNI.IBatchOprCallback_BatchOprDetailInfo_ErrInfo_id_set(this.swigCPtr, this, paramString);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\imcore\IBatchOprCallback$BatchOprDetailInfo$ErrInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */