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

public class Message50000
  implements IMessageHandler
{
  public String handlerMessage(Context paramContext, AppMessage paramAppMessage)
  {
    paramAppMessage = paramAppMessage.getContent();
    Object localObject1 = paramAppMessage.optString("storeKey");
    Object localObject2 = paramAppMessage.optString("innerKey");
    if (TextUtils.isEmpty((CharSequence)localObject1)) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(-5000001, "一级标签不能为空", null);
    }
    if (TextUtils.isEmpty((CharSequence)localObject2)) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(-5000002, "二级标签不能为空", null);
    }
    paramAppMessage = "";
    if ("system-config".equals(localObject1)) {
      paramAppMessage = ConfigManager.getInstance().getSystemConfigValue((String)localObject2);
    }
    for (;;)
    {
      localObject1 = new JSONArray();
      localObject2 = new JSONObject();
      try
      {
        ((JSONObject)localObject2).put("result", paramAppMessage);
        ((JSONArray)localObject1).put(localObject2);
        return MessageManager.getInstance(paramContext).buildMessageReturn(1, null, (JSONArray)localObject1);
        if (!"address-config".equals(localObject1)) {
          continue;
        }
        paramAppMessage = ConfigManager.getInstance().getAddressConfigValue((String)localObject2);
      }
      catch (JSONException paramAppMessage)
      {
        for (;;)
        {
          paramAppMessage.printStackTrace();
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\message\handler\Message50000.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */