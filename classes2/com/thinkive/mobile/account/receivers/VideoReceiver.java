package com.thinkive.mobile.account.receivers;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import com.android.thinkive.framework.config.ConfigManager;
import com.android.thinkive.framework.message.AppMessage;
import com.android.thinkive.framework.message.MessageManager;
import org.json.JSONObject;

public class VideoReceiver
  extends BroadcastReceiver
{
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    String str1;
    Object localObject;
    String str2;
    String str3;
    JSONObject localJSONObject;
    if ("com.thinkive.mobile.video".equals(paramIntent.getAction()))
    {
      str1 = paramIntent.getStringExtra("data");
      localObject = paramIntent.getStringExtra("message");
      paramIntent = ConfigManager.getInstance(paramContext).getSystemConfigValue("CHECK_SUCCESS");
      str2 = ConfigManager.getInstance(paramContext).getSystemConfigValue("CHECK_FAILED");
      str3 = ConfigManager.getInstance(paramContext).getSystemConfigValue("CHECK_REJECT");
      localJSONObject = new JSONObject();
    }
    for (;;)
    {
      try
      {
        localJSONObject.put("message", localObject);
        localObject = new AppMessage("open", 60051, localJSONObject);
        if ((str1 != null) && (!str1.equals("-2")))
        {
          if (!str1.equals(paramIntent)) {
            continue;
          }
          localJSONObject.put("videoFlag", "0");
        }
      }
      catch (Exception paramIntent)
      {
        paramIntent.printStackTrace();
        continue;
        if (!str1.equals(str3)) {
          continue;
        }
        localJSONObject.put("videoFlag", "2");
        continue;
      }
      Log.e("asos", localJSONObject.toString());
      MessageManager.getInstance(paramContext).sendMessage((AppMessage)localObject);
      try
      {
        paramContext.unregisterReceiver(this);
        return;
      }
      catch (Exception paramContext)
      {
        paramContext.printStackTrace();
      }
      if (!str1.equals(str2)) {
        continue;
      }
      localJSONObject.put("videoFlag", "1");
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\thinkive\mobile\account\receivers\VideoReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */