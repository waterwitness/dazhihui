package com.android.thinkive.framework.message.handler;

import android.content.Context;
import com.android.thinkive.framework.message.AppMessage;
import com.android.thinkive.framework.message.IMessageHandler;
import com.android.thinkive.framework.message.MessageManager;
import com.android.thinkive.framework.util.AppUtil;
import com.android.thinkive.framework.util.DeviceUtil;
import com.android.thinkive.framework.util.ScreenUtil;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class Message50001
  implements IMessageHandler
{
  public String handlerMessage(Context paramContext, AppMessage paramAppMessage)
  {
    String str1 = DeviceUtil.getDeviceModel();
    String str2 = DeviceUtil.getRelease();
    String str3 = ScreenUtil.getScreenWidth(paramContext) + "＊" + ScreenUtil.getScreenHeight(paramContext);
    int i = AppUtil.getVersionCode(paramContext);
    String str4 = AppUtil.getVersionName(paramContext);
    String str5 = AppUtil.getAppName(paramContext);
    String str6 = DeviceUtil.getBasebandVersion();
    String str7 = DeviceUtil.getLinuxCoreVersion();
    String str8 = DeviceUtil.getInnerVersion();
    paramAppMessage = new JSONArray();
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("devicePlatform", str1);
      localJSONObject.put("deviceSysVersion", str2);
      localJSONObject.put("deviceResoluation", str3);
      localJSONObject.put("softVersionSn", String.valueOf(i));
      localJSONObject.put("softVersion", str4);
      localJSONObject.put("softName", str5);
      localJSONObject.put("deviceBasePlatform", str6);
      localJSONObject.put("deviceInnerPlatform", str7);
      localJSONObject.put("deviceInnerVersion", str8);
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\message\handler\Message50001.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */