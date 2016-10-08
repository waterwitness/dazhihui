package com.android.dazhihui.ui.screen.stock;

import android.os.Handler;
import android.os.Message;
import android.widget.LinearLayout;

class o
  extends Handler
{
  o(BBSCommentActivity paramBBSCommentActivity) {}
  
  public void handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 222) {
      BBSCommentActivity.a(this.a).setVisibility(0);
    }
    while (paramMessage.what != 333) {
      return;
    }
    this.a.a(2);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */