package com.tencent.av;

import java.util.ArrayList;
import java.util.List;

public class TIMAvManager$StreamRes
{
  long chnlId;
  long taskId;
  List<TIMAvManager.LiveUrl> urls = new ArrayList();
  
  public TIMAvManager$StreamRes(TIMAvManager paramTIMAvManager) {}
  
  public long getChnlId()
  {
    return this.chnlId;
  }
  
  public long getTaskId()
  {
    return this.taskId;
  }
  
  public List<TIMAvManager.LiveUrl> getUrls()
  {
    return this.urls;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\TIMAvManager$StreamRes.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */