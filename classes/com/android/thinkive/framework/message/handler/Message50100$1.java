package com.android.thinkive.framework.message.handler;

import com.android.thinkive.framework.message.AppMessage;
import com.android.thinkive.framework.view.MyWebView;

class Message50100$1
  implements Runnable
{
  Message50100$1(Message50100 paramMessage50100, AppMessage paramAppMessage) {}
  
  public void run()
  {
    this.val$appMessage.getWebView().notifyAllListener();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\message\handler\Message50100$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */