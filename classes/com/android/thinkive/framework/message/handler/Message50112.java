package com.android.thinkive.framework.message.handler;

import android.content.Context;
import android.text.TextUtils;
import com.android.thinkive.framework.config.ConfigManager;
import com.android.thinkive.framework.message.AppMessage;
import com.android.thinkive.framework.message.IMessageHandler;
import com.android.thinkive.framework.message.MessageManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Message50112
  implements IMessageHandler
{
  public String handlerMessage(Context paramContext, AppMessage paramAppMessage)
  {
    String str = paramAppMessage.getContent().optString("serverName");
    paramAppMessage = new JSONArray();
    JSONObject localJSONObject = new JSONObject();
    if (!TextUtils.isEmpty(str))
    {
      str = ConfigManager.getInstance().getAddressConfigValue(str);
      try
      {
        localJSONObject.put("url", str);
        paramAppMessage.put(localJSONObject);
        paramAppMessage = MessageManager.getInstance(paramContext).buildMessageReturn(1, null, paramAppMessage);
        return paramAppMessage;
      }
      catch (JSONException paramAppMessage)
      {
        paramAppMessage.printStackTrace();
      }
    }
    return MessageManager.getInstance(paramContext).buildMessageReturn(1, null, null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\message\handler\Message50112.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */