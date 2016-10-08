package com.android.thinkive.framework.message.handler;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.android.thinkive.framework.message.AppMessage;
import com.android.thinkive.framework.message.IMessageHandler;
import com.android.thinkive.framework.message.MessageManager;
import org.json.JSONObject;

public class Message50109
  implements IMessageHandler
{
  private void browseUrl(Context paramContext, String paramString)
  {
    Intent localIntent = new Intent();
    localIntent.setAction("android.intent.action.VIEW");
    localIntent.setData(Uri.parse(paramString));
    localIntent.addFlags(268435456);
    paramContext.startActivity(localIntent);
  }
  
  public String handlerMessage(Context paramContext, AppMessage paramAppMessage)
  {
    paramAppMessage = paramAppMessage.getContent().optString("url");
    if (TextUtils.isEmpty(paramAppMessage)) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(-5010901, "网页地址不能为空", null);
    }
    browseUrl(paramContext, paramAppMessage);
    return MessageManager.getInstance(paramContext).buildMessageReturn(1, null, null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\message\handler\Message50109.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */