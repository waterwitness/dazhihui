package com.android.thinkive.framework.message.handler;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.thinkive.framework.message.AppMessage;
import com.android.thinkive.framework.message.IMessageHandler;
import com.android.thinkive.framework.message.MessageManager;
import org.json.JSONObject;

public class Message50220
  implements IMessageHandler
{
  public String handlerMessage(Context paramContext, AppMessage paramAppMessage)
  {
    Object localObject = paramAppMessage.getContent();
    paramAppMessage = ((JSONObject)localObject).optString("telNo");
    localObject = ((JSONObject)localObject).optString("callType");
    if (TextUtils.isEmpty(paramAppMessage)) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(-5022001, "电话号码不能为空", null);
    }
    paramAppMessage = Uri.parse("tel:" + paramAppMessage);
    if ("0".equals(localObject))
    {
      paramAppMessage = new Intent("android.intent.action.DIAL", paramAppMessage);
      paramAppMessage.addFlags(268435456);
      paramContext.startActivity(paramAppMessage);
    }
    for (;;)
    {
      return MessageManager.getInstance(paramContext).buildMessageReturn(1, null, null);
      if ("1".equals(localObject))
      {
        paramAppMessage = new Intent("android.intent.action.CALL", paramAppMessage);
        paramAppMessage.addFlags(268435456);
        paramContext.startActivity(paramAppMessage);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\message\handler\Message50220.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */