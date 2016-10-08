import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.android.thinkive.framework.message.AppMessage;
import com.android.thinkive.framework.message.IMessageHandler;
import com.android.thinkive.framework.message.MessageManager;
import com.thinkive.mobile.video.activities.OfflineVideoActivity;
import org.json.JSONObject;

public final class bl
  implements IMessageHandler
{
  public final String handlerMessage(Context paramContext, AppMessage paramAppMessage)
  {
    paramAppMessage = paramAppMessage.getContent();
    String str1 = paramAppMessage.optString("userId");
    String str2 = paramAppMessage.optString("userName");
    String str3 = paramAppMessage.optString("shortestTime");
    String str4 = paramAppMessage.optString("longestTime");
    String str5 = paramAppMessage.optString("jsessionId");
    String str6 = paramAppMessage.optString("url");
    String str7 = paramAppMessage.optString("autenticationType");
    Object localObject = paramAppMessage.optString("uploadType");
    String str8 = paramAppMessage.optString("strContent");
    if (TextUtils.isEmpty(str2)) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(0, "userName不能为空", null);
    }
    if (TextUtils.isEmpty(str3)) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(0, "shortestTime不能为空", null);
    }
    if (TextUtils.isEmpty(str1)) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(0, "userId不能为空", null);
    }
    if (TextUtils.isEmpty(str4)) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(0, "longestTime不能为空", null);
    }
    if (TextUtils.isEmpty(str5)) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(0, "jsessionId不能为空", null);
    }
    if (TextUtils.isEmpty(str6)) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(0, "url不能为空", null);
    }
    if (TextUtils.isEmpty(str7)) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(0, "autenticationType不能为空", null);
    }
    paramAppMessage = (AppMessage)localObject;
    if (TextUtils.isEmpty((CharSequence)localObject)) {
      paramAppMessage = "0";
    }
    localObject = new Intent(paramContext, OfflineVideoActivity.class);
    ((Intent)localObject).putExtra("user_id", str1);
    ((Intent)localObject).putExtra("longestTime", str4);
    ((Intent)localObject).putExtra("shortestTime", str3);
    ((Intent)localObject).putExtra("jsessionid", str5);
    ((Intent)localObject).putExtra("user_name", str2);
    ((Intent)localObject).putExtra("autentication_type", str7);
    ((Intent)localObject).putExtra("url", str6);
    ((Intent)localObject).putExtra("uploadType", paramAppMessage);
    ((Intent)localObject).putExtra("strContent", str8);
    paramContext.startActivity((Intent)localObject);
    return MessageManager.getInstance(paramContext).buildMessageReturn(1, null, null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\bl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */