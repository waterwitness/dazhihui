package com.tencent.avsdkhost.widget;

import android.os.Handler.Callback;
import android.os.Message;
import android.view.View;
import android.widget.PopupWindow;

class AboveVideoBottomViewHost$10
  implements Handler.Callback
{
  AboveVideoBottomViewHost$10(AboveVideoBottomViewHost paramAboveVideoBottomViewHost) {}
  
  public boolean handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    }
    for (;;)
    {
      return true;
      AboveVideoBottomViewHost.access$800(this.this$0).setVisibility(8);
      continue;
      AboveVideoBottomViewHost.access$900(this.this$0).setVisibility(0);
      AboveVideoBottomViewHost.access$1000(this.this$0).setVisibility(8);
      continue;
      if ((AboveVideoBottomViewHost.access$1100(this.this$0) != null) && (AboveVideoBottomViewHost.access$1100(this.this$0).isShowing())) {
        AboveVideoBottomViewHost.access$1100(this.this$0).dismiss();
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\widget\AboveVideoBottomViewHost$10.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */