package com.android.thinkive.framework.message.handler;

import android.content.Context;
import android.os.Vibrator;
import com.android.thinkive.framework.message.AppMessage;
import com.android.thinkive.framework.message.IMessageHandler;
import com.android.thinkive.framework.message.MessageManager;

public class Message50116
  implements IMessageHandler
{
  public String handlerMessage(Context paramContext, AppMessage paramAppMessage)
  {
    ((Vibrator)paramContext.getSystemService("vibrator")).vibrate(500L);
    return MessageManager.getInstance(paramContext).buildMessageReturn(1, null, null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\message\handler\Message50116.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */