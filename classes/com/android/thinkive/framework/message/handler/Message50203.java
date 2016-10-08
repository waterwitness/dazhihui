package com.android.thinkive.framework.message.handler;

import android.content.Context;
import android.text.TextUtils;
import com.android.thinkive.framework.message.AppMessage;
import com.android.thinkive.framework.message.IMessageHandler;
import com.android.thinkive.framework.message.MessageManager;
import com.android.thinkive.framework.upgrade.UpgradeManager;
import org.json.JSONObject;

public class Message50203
  implements IMessageHandler
{
  public String handlerMessage(Context paramContext, AppMessage paramAppMessage)
  {
    paramAppMessage = paramAppMessage.getContent().optString("url");
    if (!TextUtils.isEmpty(paramAppMessage)) {
      UpgradeManager.getInstance(paramContext).checkUpgradeAction(paramAppMessage);
    }
    return MessageManager.getInstance(paramContext).buildMessageReturn(1, null, null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\message\handler\Message50203.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */