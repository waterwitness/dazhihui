package com.android.thinkive.framework.message.handler;

import android.content.Context;
import android.text.TextUtils;
import com.android.thinkive.framework.message.AppMessage;
import com.android.thinkive.framework.message.IMessageHandler;
import com.android.thinkive.framework.message.MessageManager;
import com.android.thinkive.framework.util.AppUtil;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Message50200
  implements IMessageHandler
{
  public String handlerMessage(Context paramContext, AppMessage paramAppMessage)
  {
    String str = paramAppMessage.getContent().optString("scheme");
    if (TextUtils.isEmpty(str)) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(-5020001, "APP标志不能为空", null);
    }
    paramAppMessage = new JSONArray();
    JSONObject localJSONObject = new JSONObject();
    for (;;)
    {
      try
      {
        if (!AppUtil.isAppExist(paramContext, str)) {
          continue;
        }
        localJSONObject.put("isInstall", "1");
        paramAppMessage.put(localJSONObject);
      }
      catch (JSONException localJSONException)
      {
        localJSONException.printStackTrace();
        continue;
      }
      return MessageManager.getInstance(paramContext).buildMessageReturn(1, null, paramAppMessage);
      localJSONObject.put("isInstall", "0");
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\message\handler\Message50200.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */