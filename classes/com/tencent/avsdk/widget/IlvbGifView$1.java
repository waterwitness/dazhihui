package com.tencent.avsdk.widget;

import android.os.Handler;
import android.os.Message;

class IlvbGifView$1
  extends Handler
{
  IlvbGifView$1(IlvbGifView paramIlvbGifView) {}
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    }
    do
    {
      return;
      this.this$0.isShowAnmiation = false;
      this.this$0.setVisibility(8);
    } while (IlvbGifView.access$000(this.this$0) == null);
    IlvbGifView.access$000(this.this$0).run();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\IlvbGifView$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */