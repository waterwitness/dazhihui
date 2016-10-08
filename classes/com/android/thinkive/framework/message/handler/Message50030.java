package com.android.thinkive.framework.message.handler;

import android.content.Context;
import com.android.thinkive.framework.message.AppMessage;
import com.android.thinkive.framework.message.IMessageHandler;
import com.android.thinkive.framework.message.MessageManager;
import com.android.thinkive.framework.network.NetWorkState;
import com.android.thinkive.framework.util.NetWorkUtil;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Message50030
  implements IMessageHandler
{
  public String handlerMessage(Context paramContext, AppMessage paramAppMessage)
  {
    paramAppMessage = new JSONArray();
    JSONObject localJSONObject = new JSONObject();
    for (;;)
    {
      try
      {
        localNetWorkState = NetWorkUtil.getNetWorkStatus(paramContext);
        if (localNetWorkState != NetWorkState.NET_WORK_UNKNOWN) {
          continue;
        }
        i = 9;
        localJSONObject.put("network", String.valueOf(i));
        paramAppMessage.put(localJSONObject);
      }
      catch (JSONException localJSONException)
      {
        NetWorkState localNetWorkState;
        int i;
        localJSONException.printStackTrace();
        continue;
      }
      return MessageManager.getInstance(paramContext).buildMessageReturn(1, null, paramAppMessage);
      i = localNetWorkState.ordinal();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\message\handler\Message50030.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */