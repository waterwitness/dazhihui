package com.android.thinkive.framework.message.handler;

import android.content.Context;
import android.text.TextUtils;
import com.android.thinkive.framework.message.AppMessage;
import com.android.thinkive.framework.message.IMessageHandler;
import com.android.thinkive.framework.message.MessageManager;
import com.android.thinkive.framework.upgrade.UpgradeManager;
import org.json.JSONObject;

public class Message50201
  implements IMessageHandler
{
  public String handlerMessage(Context paramContext, AppMessage paramAppMessage)
  {
    Object localObject = paramAppMessage.getContent();
    paramAppMessage = ((JSONObject)localObject).optString("url");
    String str1 = ((JSONObject)localObject).optString("version");
    String str2 = ((JSONObject)localObject).optString("versionSn");
    localObject = ((JSONObject)localObject).optString("type");
    if (TextUtils.isEmpty(paramAppMessage)) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(-5020101, "APP地址不能为空", null);
    }
    if (TextUtils.isEmpty((CharSequence)localObject)) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(-5020102, "下载类型不能为空", null);
    }
    if (TextUtils.isEmpty(str1)) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(-5020103, "下载版本名不能为空", null);
    }
    if (TextUtils.isEmpty(str2)) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(-5020104, "下载版本号不能为空", null);
    }
    int i = Integer.parseInt((String)localObject);
    int j = Integer.parseInt(str2);
    UpgradeManager.getInstance(paramContext).startDownloadFromH5Info(paramAppMessage, i, j, str1);
    return MessageManager.getInstance(paramContext).buildMessageReturn(1, null, null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\message\handler\Message50201.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */