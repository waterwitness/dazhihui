package com.tencent.avsdk.widget;

public class TwoFlowerView$Link
{
  public int num;
  public long time;
  
  public TwoFlowerView$Link(TwoFlowerView paramTwoFlowerView, int paramInt)
  {
    this.num = paramInt;
    this.time = System.currentTimeMillis();
  }
  
  public void addNum(int paramInt)
  {
    this.num += paramInt;
  }
  
  public boolean isTimeOut()
  {
    return System.currentTimeMillis() - this.time > 6000L;
  }
  
  public void reset(int paramInt)
  {
    this.num = paramInt;
    this.time = System.currentTimeMillis();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\TwoFlowerView$Link.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */