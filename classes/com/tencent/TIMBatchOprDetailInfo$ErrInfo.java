package com.tencent;

import com.tencent.imcore.IBatchOprCallback.BatchOprDetailInfo.ErrInfo;

public class TIMBatchOprDetailInfo$ErrInfo
{
  private int errCode;
  private String errMsg = "";
  private String id = "";
  
  public TIMBatchOprDetailInfo$ErrInfo(TIMBatchOprDetailInfo paramTIMBatchOprDetailInfo, IBatchOprCallback.BatchOprDetailInfo.ErrInfo paramErrInfo)
  {
    if (paramErrInfo == null) {
      return;
    }
    this.id = paramErrInfo.getId();
    this.errCode = paramErrInfo.getErr_code();
    this.errMsg = paramErrInfo.getErr_msg();
  }
  
  public int getErrCode()
  {
    return this.errCode;
  }
  
  public String getErrMsg()
  {
    return this.errMsg;
  }
  
  public String getId()
  {
    return this.id;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMBatchOprDetailInfo$ErrInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */