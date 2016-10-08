package com.tencent.avsdk.Model;

import java.util.List;

public class GiftVo
{
  public List<GiftVo.GiftItem> data;
  public GiftVo.Header header;
  public long time;
  
  public boolean isSameDay()
  {
    long l = System.currentTimeMillis();
    return Math.abs(this.time - l) <= 20000L;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\Model\GiftVo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */