package com.tencent.avsdk.widget;

import android.os.Handler;
import android.os.Message;
import java.util.List;

class TwoFlowerView$1
  extends Handler
{
  TwoFlowerView$1(TwoFlowerView paramTwoFlowerView) {}
  
  public void handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 0) {
      TwoFlowerView.access$000(this.this$0).isShowAnimation = false;
    }
    for (;;)
    {
      if (TwoFlowerView.access$200(this.this$0).size() > 0)
      {
        paramMessage = (FlowerView.FlowerVo)TwoFlowerView.access$200(this.this$0).get(0);
        TwoFlowerView.access$200(this.this$0).remove(0);
        this.this$0.show(paramMessage);
      }
      return;
      if (paramMessage.what == 1) {
        TwoFlowerView.access$100(this.this$0).isShowAnimation = false;
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\TwoFlowerView$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */