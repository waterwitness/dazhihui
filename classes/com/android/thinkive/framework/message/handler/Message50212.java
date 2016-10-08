package com.android.thinkive.framework.message.handler;

import android.content.Context;
import android.os.Handler;
import com.android.thinkive.framework.ThinkiveInitializer;
import com.android.thinkive.framework.message.AppMessage;
import com.android.thinkive.framework.message.IMessageHandler;
import com.android.thinkive.framework.message.MessageManager;
import com.android.thinkive.framework.util.Log;
import com.android.thinkive.framework.view.MyWebView;

public class Message50212
  implements IMessageHandler
{
  public String handlerMessage(Context paramContext, AppMessage paramAppMessage)
  {
    Log.d("50212 appMessage content = " + paramAppMessage.getContent());
    MyWebView localMyWebView = paramAppMessage.getWebView();
    long l = System.currentTimeMillis();
    ThinkiveInitializer.getInstance().getHandler().post(new Message50212.1(this, paramAppMessage, l, localMyWebView));
    return MessageManager.getInstance(paramContext).buildMessageReturn(1, null, null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\message\handler\Message50212.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */