import android.content.Context;
import android.text.TextUtils;
import com.android.thinkive.framework.config.ConfigManager;
import com.android.thinkive.framework.message.AppMessage;
import com.android.thinkive.framework.message.IMessageHandler;
import com.android.thinkive.framework.message.MessageManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class bf
  implements IMessageHandler
{
  public final String handlerMessage(Context paramContext, AppMessage paramAppMessage)
  {
    paramAppMessage = paramAppMessage.getContent();
    String str2 = paramAppMessage.optString("userId");
    String str1 = paramAppMessage.optString("mediaId");
    String str3 = paramAppMessage.optString("type");
    JSONArray localJSONArray = new JSONArray();
    JSONObject localJSONObject = new JSONObject();
    if (TextUtils.isEmpty(str2)) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(-6000001, "userId不能为空", null);
    }
    if (TextUtils.isEmpty(str1)) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(-6000002, "mediaId不能为空", null);
    }
    if (str1.equals("certificate"))
    {
      if (TextUtils.isEmpty(str3)) {
        return MessageManager.getInstance(paramContext).buildMessageReturn(-6000002, "type不能为空", null);
      }
      if (!str3.equals("tw")) {
        break label204;
      }
      paramAppMessage = str2 + "_tw";
      g.a(paramContext, ConfigManager.getInstance(paramContext).getSystemConfigValue("LICENSE"));
      if (g.a(paramContext, paramAppMessage, "thinkiveQWERT1003") != null) {
        break label249;
      }
    }
    label204:
    label249:
    for (paramAppMessage = "";; paramAppMessage = str1) {
      try
      {
        localJSONObject.put("mediaId", paramAppMessage);
        localJSONArray.put(localJSONObject);
        return MessageManager.getInstance(paramContext).buildMessageReturn(1, null, localJSONArray);
        paramAppMessage = str2;
        if (!str3.equals("zd")) {
          break;
        }
        paramAppMessage = str2 + "_zd";
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\bf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */