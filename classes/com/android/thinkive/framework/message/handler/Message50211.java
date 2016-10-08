package com.android.thinkive.framework.message.handler;

import android.content.Context;
import android.os.Handler;
import com.android.thinkive.framework.ThinkiveInitializer;
import com.android.thinkive.framework.keyboard.KeyboardManager;
import com.android.thinkive.framework.message.AppMessage;
import com.android.thinkive.framework.message.IMessageHandler;
import com.android.thinkive.framework.message.MessageManager;

public class Message50211
  implements IMessageHandler
{
  public String handlerMessage(Context paramContext, AppMessage paramAppMessage)
  {
    paramAppMessage = KeyboardManager.getInstance();
    if (paramAppMessage != null) {
      ThinkiveInitializer.getInstance().getHandler().post(new Message50211.1(this, paramAppMessage));
    }
    return MessageManager.getInstance(paramContext).buildMessageReturn(1, null, null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\message\handler\Message50211.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */