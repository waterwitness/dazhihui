package com.android.thinkive.framework.message.handler;

import android.content.Context;
import android.os.Handler;
import com.android.thinkive.framework.ThinkiveInitializer;
import com.android.thinkive.framework.message.AppMessage;
import com.android.thinkive.framework.message.IMessageHandler;
import com.android.thinkive.framework.util.Log;
import com.android.thinkive.framework.view.MyWebView;

public class Message50100
  implements IMessageHandler
{
  public String handlerMessage(Context paramContext, AppMessage paramAppMessage)
  {
    Log.e("50100 webview Name = " + paramAppMessage.getWebView().getWebViewName() + " webview object = " + paramAppMessage.getWebView());
    paramAppMessage.getWebView().setIsLoadComplete(true);
    ThinkiveInitializer.getInstance().getHandler().post(new Message50100.1(this, paramAppMessage));
    return null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\message\handler\Message50100.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */