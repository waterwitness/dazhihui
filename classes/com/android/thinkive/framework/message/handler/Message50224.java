package com.android.thinkive.framework.message.handler;

import android.content.Context;
import com.android.thinkive.framework.message.AppMessage;
import com.android.thinkive.framework.message.IMessageHandler;
import com.android.thinkive.framework.message.MessageManager;
import com.android.thinkive.framework.util.PreferencesUtil;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Message50224
  implements IMessageHandler
{
  public String handlerMessage(Context paramContext, AppMessage paramAppMessage)
  {
    paramAppMessage = new JSONArray();
    JSONObject localJSONObject = new JSONObject();
    String str = PreferencesUtil.getString(paramContext, "phone_number", "");
    try
    {
      localJSONObject.put("phone", str);
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\message\handler\Message50224.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */