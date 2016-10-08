package com.tencent.avsdk;

import android.os.Handler;
import android.os.Message;

class PickView$1
  extends Handler
{
  PickView$1(PickView paramPickView) {}
  
  public void handleMessage(Message paramMessage)
  {
    if (Math.abs(PickView.access$000(this.this$0)) < 2.0F)
    {
      PickView.access$002(this.this$0, 0.0F);
      if (PickView.access$100(this.this$0) != null)
      {
        PickView.access$100(this.this$0).cancel();
        PickView.access$102(this.this$0, null);
        PickView.access$200(this.this$0);
      }
    }
    for (;;)
    {
      this.this$0.invalidate();
      return;
      PickView.access$002(this.this$0, PickView.access$000(this.this$0) - PickView.access$000(this.this$0) / Math.abs(PickView.access$000(this.this$0)) * 2.0F);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\PickView$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */