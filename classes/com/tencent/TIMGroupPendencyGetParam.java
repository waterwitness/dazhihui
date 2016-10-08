package com.tencent;

import com.tencent.imcore.GetGroupPendencyOption;

public class TIMGroupPendencyGetParam
{
  private long numPerPage;
  private long timestamp;
  
  long getNumPerPage()
  {
    return this.numPerPage;
  }
  
  long getTimestamp()
  {
    return this.timestamp;
  }
  
  public void setNumPerPage(long paramLong)
  {
    this.numPerPage = paramLong;
  }
  
  public void setTimestamp(long paramLong)
  {
    this.timestamp = paramLong;
  }
  
  GetGroupPendencyOption toOption()
  {
    GetGroupPendencyOption localGetGroupPendencyOption = new GetGroupPendencyOption();
    localGetGroupPendencyOption.setStart_time(this.timestamp);
    localGetGroupPendencyOption.setMax_limited(this.numPerPage);
    return localGetGroupPendencyOption;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\TIMGroupPendencyGetParam.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */