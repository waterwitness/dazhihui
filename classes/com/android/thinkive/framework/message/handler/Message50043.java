package com.android.thinkive.framework.message.handler;

import android.content.Context;
import android.text.TextUtils;
import com.android.thinkive.framework.message.AppMessage;
import com.android.thinkive.framework.message.IMessageHandler;
import com.android.thinkive.framework.message.MessageManager;
import com.android.thinkive.framework.storage.DatabaseStorage;
import com.android.thinkive.framework.storage.IStorage;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Message50043
  implements IMessageHandler
{
  private boolean isJsonArray(String paramString)
  {
    try
    {
      new JSONArray(paramString);
      return true;
    }
    catch (JSONException paramString) {}
    return false;
  }
  
  private boolean isJsonObject(String paramString)
  {
    try
    {
      new JSONObject(paramString);
      return true;
    }
    catch (JSONException paramString) {}
    return false;
  }
  
  public String handlerMessage(Context paramContext, AppMessage paramAppMessage)
  {
    paramAppMessage = paramAppMessage.getContent().optString("key");
    if (TextUtils.isEmpty(paramAppMessage)) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(-5004201, "字段名不能为空", null);
    }
    String str = new DatabaseStorage(paramContext).loadData(paramAppMessage);
    paramAppMessage = new JSONArray();
    JSONObject localJSONObject = new JSONObject();
    try
    {
      if (!TextUtils.isEmpty(str))
      {
        if (isJsonObject(str)) {
          localJSONObject.put("value", new JSONObject(str));
        }
        for (;;)
        {
          paramAppMessage.put(localJSONObject);
          return MessageManager.getInstance(paramContext).buildMessageReturn(1, null, paramAppMessage);
          if (!isJsonArray(str)) {
            break;
          }
          localJSONObject.put("value", new JSONArray(str));
        }
      }
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        localJSONException.printStackTrace();
        continue;
        localJSONObject.put("value", localJSONException);
        continue;
        localJSONObject.put("value", localJSONException);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\message\handler\Message50043.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */