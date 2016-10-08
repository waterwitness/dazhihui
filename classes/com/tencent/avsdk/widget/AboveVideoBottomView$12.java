package com.tencent.avsdk.widget;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;
import android.view.View;
import android.widget.ImageView;
import android.widget.PopupWindow;

class AboveVideoBottomView$12
  implements Handler.Callback
{
  AboveVideoBottomView$12(AboveVideoBottomView paramAboveVideoBottomView) {}
  
  public boolean handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    }
    for (;;)
    {
      return true;
      AboveVideoBottomView.access$600(this.this$0).setVisibility(8);
      continue;
      AboveVideoBottomView.access$700(this.this$0).setVisibility(0);
      AboveVideoBottomView.access$800(this.this$0).setVisibility(8);
      continue;
      if ((AboveVideoBottomView.access$300(this.this$0) != null) && (AboveVideoBottomView.access$300(this.this$0).isShowing()))
      {
        AboveVideoBottomView.access$300(this.this$0).dismiss();
        continue;
        if (AboveVideoBottomView.access$100(this.this$0).getVisibility() == 0) {
          AboveVideoBottomView.access$100(this.this$0).startAnimation(this.this$0.mRotateAnimation);
        }
        AboveVideoBottomView.access$900(this.this$0).sendEmptyMessageDelayed(3, 5000L);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\AboveVideoBottomView$12.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */