package com.tencent;

import com.tencent.imcore.ErrInfoVec;
import com.tencent.imcore.IBatchOprCallback.BatchOprDetailInfo;
import java.util.ArrayList;
import java.util.List;

public class TIMBatchOprDetailInfo
{
  private List<TIMBatchOprDetailInfo.ErrInfo> errors = new ArrayList();
  private long failNum;
  private long succNum;
  
  public TIMBatchOprDetailInfo() {}
  
  public TIMBatchOprDetailInfo(IBatchOprCallback.BatchOprDetailInfo paramBatchOprDetailInfo)
  {
    if (paramBatchOprDetailInfo == null) {}
    for (;;)
    {
      return;
      this.succNum = paramBatchOprDetailInfo.getSucc_num();
      this.failNum = paramBatchOprDetailInfo.getFail_num();
      paramBatchOprDetailInfo = paramBatchOprDetailInfo.getErrs();
      long l = paramBatchOprDetailInfo.size();
      int i = 0;
      while (i < l)
      {
        TIMBatchOprDetailInfo.ErrInfo localErrInfo = new TIMBatchOprDetailInfo.ErrInfo(this, paramBatchOprDetailInfo.get(i));
        this.errors.add(localErrInfo);
        i += 1;
      }
    }
  }
  
  public List<TIMBatchOprDetailInfo.ErrInfo> getErrors()
  {
    return this.errors;
  }
  
  public long getFailNum()
  {
    return this.failNum;
  }
  
  public long getSuccNum()
  {
    return this.succNum;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMBatchOprDetailInfo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */