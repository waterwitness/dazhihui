package com.android.thinkive.framework.message.handler;

import android.content.Context;
import android.text.TextUtils;
import android.widget.Toast;
import com.android.thinkive.framework.message.AppMessage;
import com.android.thinkive.framework.message.IMessageHandler;
import com.android.thinkive.framework.message.MessageManager;
import org.json.JSONObject;

public class Message50106
  implements IMessageHandler
{
  public String handlerMessage(Context paramContext, AppMessage paramAppMessage)
  {
    paramAppMessage = paramAppMessage.getContent().optString("content");
    if (TextUtils.isEmpty(paramAppMessage)) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(-5010601, "提示内容不能为空", null);
    }
    Toast.makeText(paramContext, paramAppMessage, 0).show();
    return MessageManager.getInstance(paramContext).buildMessageReturn(1, null, null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\message\handler\Message50106.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */