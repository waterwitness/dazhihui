import android.content.Context;
import android.text.TextUtils;
import com.android.thinkive.framework.config.ConfigManager;
import com.android.thinkive.framework.message.AppMessage;
import com.android.thinkive.framework.message.IMessageHandler;
import com.android.thinkive.framework.message.MessageManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class bg
  implements IMessageHandler
{
  public final String handlerMessage(Context paramContext, AppMessage paramAppMessage)
  {
    paramAppMessage = paramAppMessage.getContent();
    Object localObject1 = paramAppMessage.optString("userId");
    String str1 = paramAppMessage.optString("mediaId");
    Object localObject2 = paramAppMessage.optString("type");
    String str2 = paramAppMessage.optString("content");
    if (TextUtils.isEmpty(str1)) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(-6000101, "mediaId不能为空", null);
    }
    if (TextUtils.isEmpty(str2)) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(-6000102, "content不能为空", null);
    }
    if (TextUtils.isEmpty((CharSequence)localObject1)) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(-6000103, "userId不能为空", null);
    }
    if (TextUtils.isEmpty((CharSequence)localObject2)) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(-6000104, "type不能为空", null);
    }
    if (((String)localObject2).equals("tw")) {
      paramAppMessage = localObject1 + "_tw";
    }
    for (;;)
    {
      localObject1 = new JSONArray();
      localObject2 = new JSONObject();
      try
      {
        ((JSONObject)localObject2).put("cipherText", g.a(paramContext, ConfigManager.getInstance(paramContext).getSystemConfigValue("LICENSE")).a(paramContext, paramAppMessage, str2.getBytes(), "thinkiveQWERT1003"));
        ((JSONObject)localObject2).put("mediaId", str1);
        ((JSONArray)localObject1).put(localObject2);
        return MessageManager.getInstance(paramContext).buildMessageReturn(1, null, (JSONArray)localObject1);
        paramAppMessage = (AppMessage)localObject1;
        if (!((String)localObject2).equals("zd")) {
          continue;
        }
        paramAppMessage = localObject1 + "_zd";
      }
      catch (JSONException paramAppMessage)
      {
        for (;;)
        {
          paramAppMessage.printStackTrace();
        }
      }
      catch (Exception paramAppMessage)
      {
        for (;;)
        {
          paramAppMessage.printStackTrace();
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\bg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */