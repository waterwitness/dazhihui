import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.android.thinkive.framework.message.AppMessage;
import com.android.thinkive.framework.message.IMessageHandler;
import com.android.thinkive.framework.message.MessageManager;
import com.thinkive.mobile.account.activitys.FacePhotographActivity;
import org.json.JSONObject;

public final class bm
  implements IMessageHandler
{
  public final String handlerMessage(Context paramContext, AppMessage paramAppMessage)
  {
    Object localObject2 = paramAppMessage.getContent();
    Object localObject1 = ((JSONObject)localObject2).optString("photoType");
    String str9 = ((JSONObject)localObject2).optString("action");
    paramAppMessage = ((JSONObject)localObject2).optString("uuid");
    String str1 = ((JSONObject)localObject2).optString("userId");
    String str2 = ((JSONObject)localObject2).optString("r");
    String str3 = ((JSONObject)localObject2).optString("key");
    String str4 = ((JSONObject)localObject2).optString("imgType");
    String str5 = ((JSONObject)localObject2).optString("url");
    String str6 = ((JSONObject)localObject2).optString("funcNum");
    String str7 = ((JSONObject)localObject2).optString("jsessionId");
    String str8 = ((JSONObject)localObject2).optString("clientInfo");
    localObject2 = ((JSONObject)localObject2).optString("idNo");
    if (TextUtils.isEmpty((CharSequence)localObject1)) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(0, "type不能为空", null);
    }
    if (TextUtils.isEmpty(str9)) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(0, "source不能为空", null);
    }
    if (TextUtils.isEmpty(str5)) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(0, "url不能为空", null);
    }
    if ((!str9.equals("pai")) && (!str9.equals("phone"))) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(0, "pai或者phone不能为空", null);
    }
    if (TextUtils.isEmpty((CharSequence)localObject2)) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(0, "idNo不能为空", null);
    }
    if (str9.equals("pai")) {}
    for (int i = 8437760;; i = 8437761)
    {
      localObject1 = new Intent(paramContext, FacePhotographActivity.class);
      ((Intent)localObject1).putExtra("CAMERA_TYPE", i);
      ((Intent)localObject1).putExtra("uuid", paramAppMessage);
      ((Intent)localObject1).putExtra("user_id", str1);
      ((Intent)localObject1).putExtra("rodam", str2);
      ((Intent)localObject1).putExtra("md5", str3);
      ((Intent)localObject1).putExtra("img_type", str4);
      ((Intent)localObject1).putExtra("url", str5);
      ((Intent)localObject1).putExtra("jsessionid", str7);
      ((Intent)localObject1).putExtra("clientinfo", str8);
      ((Intent)localObject1).putExtra("funcNo", str6);
      ((Intent)localObject1).putExtra("id_no", (String)localObject2);
      paramContext.startActivity((Intent)localObject1);
      return MessageManager.getInstance(paramContext).buildMessageReturn(1, null, null);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\bm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */