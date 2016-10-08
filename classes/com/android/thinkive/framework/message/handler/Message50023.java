package com.android.thinkive.framework.message.handler;

import android.content.Context;
import com.android.thinkive.framework.message.AppMessage;
import com.android.thinkive.framework.message.IMessageHandler;
import com.android.thinkive.framework.message.MessageManager;
import com.android.thinkive.framework.util.DeviceUtil;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Message50023
  implements IMessageHandler
{
  public String handlerMessage(Context paramContext, AppMessage paramAppMessage)
  {
    paramAppMessage = new JSONArray();
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("ip", DeviceUtil.getNetWorkIpAddress());
      paramAppMessage.put(localJSONObject);
      return MessageManager.getInstance(paramContext).buildMessageReturn(1, null, paramAppMessage);
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        localJSONException.printStackTrace();
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\message\handler\Message50023.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */