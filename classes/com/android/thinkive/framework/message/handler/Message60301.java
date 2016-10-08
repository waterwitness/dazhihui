package com.android.thinkive.framework.message.handler;

import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.android.thinkive.framework.ThinkiveInitializer;
import com.android.thinkive.framework.message.AppMessage;
import com.android.thinkive.framework.message.IMessageHandler;
import com.android.thinkive.framework.message.MessageManager;
import com.android.thinkive.framework.module.ModuleManager;
import com.android.thinkive.framework.util.Log;
import com.android.thinkive.framework.view.MyWebView;

public class Message60301
  implements IMessageHandler
{
  public String handlerMessage(Context paramContext, AppMessage paramAppMessage)
  {
    String str = paramAppMessage.getSourceModule();
    MyWebView localMyWebView = paramAppMessage.getWebView();
    Log.d("60301 sourceModule = " + str + " appMessage content = " + paramAppMessage.getContent());
    if (localMyWebView == null) {
      if (TextUtils.isEmpty(str)) {
        ModuleManager.getInstance().sendMessageByWebModule(paramAppMessage);
      }
    }
    for (;;)
    {
      return MessageManager.getInstance(paramContext).buildMessageReturn(1, null, null);
      ModuleManager.getInstance().sendMessageByWebModule(str, paramAppMessage);
      continue;
      ThinkiveInitializer.getInstance().getHandler().post(new Message60301.1(this, paramAppMessage, localMyWebView));
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\message\handler\Message60301.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */