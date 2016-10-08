package com.tencent;

import com.tencent.imcore.IBatchOprCallback;
import com.tencent.imcore.IBatchOprCallback.BatchOprDetailInfo;

public class IMCoreBatchOprCallback
  extends IBatchOprCallback
{
  TIMSendMsgToMultiUserCallback cb;
  
  public IMCoreBatchOprCallback(TIMSendMsgToMultiUserCallback paramTIMSendMsgToMultiUserCallback)
  {
    this.cb = paramTIMSendMsgToMultiUserCallback;
    swigReleaseOwnership();
  }
  
  public void done()
  {
    if (this.cb != null) {
      this.cb.onSuccess();
    }
    swigTakeOwnership();
  }
  
  public void fail(int paramInt, String paramString, IBatchOprCallback.BatchOprDetailInfo paramBatchOprDetailInfo)
  {
    if (this.cb != null)
    {
      paramBatchOprDetailInfo = new TIMBatchOprDetailInfo(paramBatchOprDetailInfo);
      this.cb.onError(paramInt, paramString, paramBatchOprDetailInfo);
    }
    swigTakeOwnership();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\IMCoreBatchOprCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */