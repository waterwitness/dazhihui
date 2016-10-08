package com.android.thinkive.framework.message;

import android.content.Context;
import android.text.TextUtils;
import com.android.thinkive.framework.module.IModule;
import com.android.thinkive.framework.module.ModuleManager;
import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;

public class MessageService
{
  private static MessageService sInstance;
  private Context mContext;
  
  private MessageService(Context paramContext)
  {
    this.mContext = paramContext;
  }
  
  private String broadcastMessage(AppMessage paramAppMessage, String paramString)
  {
    Object localObject1 = "";
    ArrayList localArrayList = ModuleManager.getInstance().getAllModule();
    int i = 0;
    if (i >= localArrayList.size())
    {
      localObject2 = localObject1;
      label27:
      return (String)localObject2;
    }
    Object localObject2 = (IModule)localArrayList.get(i);
    if (ModuleManager.getInstance().getModule(paramString) == localObject2) {}
    for (localObject2 = localObject1;; localObject2 = localObject1)
    {
      label57:
      i += 1;
      localObject1 = localObject2;
      break;
      String str1 = ((IModule)localObject2).onMessageReceive(paramAppMessage);
      if (!TextUtils.isEmpty(str1)) {}
      try
      {
        String str2 = new JSONObject(str1).optString("error_no");
        localObject2 = str1;
        if ("1".equals(str2)) {
          break label27;
        }
        boolean bool = "0".equals(str2);
        localObject2 = str1;
        if (bool) {
          break label57;
        }
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
  
  public static MessageService getInstance(Context paramContext)
  {
    if (sInstance == null) {
      sInstance = new MessageService(paramContext);
    }
    return sInstance;
  }
  
  protected String handlerMessage(AppMessage paramAppMessage)
  {
    Object localObject = paramAppMessage.getTargetModule();
    String str = paramAppMessage.getSourceModule();
    if (TextUtils.isEmpty((CharSequence)localObject)) {
      paramAppMessage = broadcastMessage(paramAppMessage, str);
    }
    for (;;)
    {
      localObject = paramAppMessage;
      if (TextUtils.isEmpty(paramAppMessage)) {
        localObject = MessageManager.getInstance(this.mContext).buildMessageReturn(-1, null, null);
      }
      try
      {
        paramAppMessage = new JSONObject((String)localObject);
        if ("1".equals(paramAppMessage.optString("error_no"))) {
          paramAppMessage.put("error_no", "0");
        }
        paramAppMessage = paramAppMessage.toString();
        return paramAppMessage;
      }
      catch (JSONException paramAppMessage)
      {
        paramAppMessage.printStackTrace();
        return (String)localObject;
      }
      localObject = ModuleManager.getInstance().getModule((String)localObject);
      if (localObject != null) {
        paramAppMessage = ((IModule)localObject).onMessageReceive(paramAppMessage);
      } else {
        paramAppMessage = null;
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\message\MessageService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */