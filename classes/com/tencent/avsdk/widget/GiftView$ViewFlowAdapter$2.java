package com.tencent.avsdk.widget;

class GiftView$ViewFlowAdapter$2
  implements Runnable
{
  GiftView$ViewFlowAdapter$2(GiftView.ViewFlowAdapter paramViewFlowAdapter) {}
  
  public void run()
  {
    while (GiftView.access$000(this.this$1.this$0) >= 0)
    {
      i = this.this$1.setClickNum(false);
      if (i > 0) {
        this.this$1.sendGift(true, i);
      }
      try
      {
        Thread.sleep(1000L);
      }
      catch (InterruptedException localInterruptedException) {}
    }
    int i = this.this$1.setClickNum(false);
    if (i > 0) {
      this.this$1.sendGift(true, i);
    }
    GiftView.ViewFlowAdapter.access$402(this.this$1, false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\GiftView$ViewFlowAdapter$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */