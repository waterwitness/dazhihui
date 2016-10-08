package com.android.thinkive.framework.message.handler;

import android.content.Context;
import android.os.Handler;
import com.android.thinkive.framework.ThinkiveInitializer;
import com.android.thinkive.framework.message.AppMessage;
import com.android.thinkive.framework.message.IMessageHandler;

public class Message50105
  implements IMessageHandler
{
  public String handlerMessage(Context paramContext, AppMessage paramAppMessage)
  {
    ThinkiveInitializer.getInstance().getHandler().post(new Message50105.1(this));
    return null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\message\handler\Message50105.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */