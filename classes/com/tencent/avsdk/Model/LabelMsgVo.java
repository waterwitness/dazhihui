package com.tencent.avsdk.Model;

public class LabelMsgVo
{
  public int Counter;
  public LabelMsgVo.LabelData Data;
  public int Err;
  public int Qid;
  public long time = System.currentTimeMillis();
  
  public boolean isSameDay()
  {
    long l = System.currentTimeMillis();
    return Math.abs(this.time - l) <= 20000L;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\Model\LabelMsgVo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */