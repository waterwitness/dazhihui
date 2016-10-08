package com.android.thinkive.framework.message;

import android.content.Context;
import android.text.TextUtils;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MessageManager
{
  private static MessageManager sInstance;
  private Context mContext;
  private MessageService mMessageService;
  
  private MessageManager(Context paramContext)
  {
    this.mContext = paramContext;
    this.mMessageService = MessageService.getInstance(paramContext);
  }
  
  public static MessageManager getInstance(Context paramContext)
  {
    try
    {
      if (sInstance == null) {
        sInstance = new MessageManager(paramContext);
      }
      paramContext = sInstance;
      return paramContext;
    }
    finally {}
  }
  
  public String buildMessageReturn(int paramInt, String paramString, JSONArray paramJSONArray)
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("error_no", String.valueOf(paramInt));
      if (!TextUtils.isEmpty(paramString)) {
        localJSONObject.put("error_info", paramString);
      }
      for (;;)
      {
        paramString = paramJSONArray;
        if (paramJSONArray == null) {
          paramString = new JSONArray();
        }
        localJSONObject.put("results", paramString);
        return localJSONObject.toString();
        if (paramInt < 0) {
          break;
        }
        localJSONObject.put("error_info", "调用成功");
      }
    }
    catch (JSONException paramString)
    {
      for (;;)
      {
        paramString.printStackTrace();
        continue;
        localJSONObject.put("error_info", "调用失败");
      }
    }
  }
  
  public String sendMessage(AppMessage paramAppMessage)
  {
    try
    {
      paramAppMessage = this.mMessageService.handlerMessage(paramAppMessage);
      return paramAppMessage;
    }
    finally
    {
      paramAppMessage = finally;
      throw paramAppMessage;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\message\MessageManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */