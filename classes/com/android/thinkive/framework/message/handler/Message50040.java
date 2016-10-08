package com.android.thinkive.framework.message.handler;

import android.content.Context;
import android.text.TextUtils;
import com.android.thinkive.framework.message.AppMessage;
import com.android.thinkive.framework.message.IMessageHandler;
import com.android.thinkive.framework.message.MessageManager;
import com.android.thinkive.framework.storage.IStorage;
import com.android.thinkive.framework.storage.MemoryStorage;
import org.json.JSONObject;

public class Message50040
  implements IMessageHandler
{
  public String handlerMessage(Context paramContext, AppMessage paramAppMessage)
  {
    Object localObject = paramAppMessage.getContent();
    paramAppMessage = ((JSONObject)localObject).optString("key");
    localObject = ((JSONObject)localObject).optString("value");
    if (TextUtils.isEmpty(paramAppMessage)) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(-5004001, "字段名不能为空", null);
    }
    new MemoryStorage().saveData(paramAppMessage, (String)localObject);
    return MessageManager.getInstance(paramContext).buildMessageReturn(1, null, null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\message\handler\Message50040.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */