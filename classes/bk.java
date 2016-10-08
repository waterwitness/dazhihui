import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.android.thinkive.framework.message.AppMessage;
import com.android.thinkive.framework.message.IMessageHandler;
import com.android.thinkive.framework.message.MessageManager;
import com.thinkive.mobile.account.receivers.VideoReceiver;
import com.thinkive.mobile.video.activities.ApplyVideoActivity;
import org.json.JSONObject;

public final class bk
  implements IMessageHandler
{
  public final String handlerMessage(Context paramContext, AppMessage paramAppMessage)
  {
    Object localObject = paramAppMessage.getContent();
    paramAppMessage = ((JSONObject)localObject).optString("userId");
    String str1 = ((JSONObject)localObject).optString("userName");
    String str2 = ((JSONObject)localObject).optString("orgId");
    String str3 = ((JSONObject)localObject).optString("jsessionId");
    String str4 = ((JSONObject)localObject).optString("netWorkStatus");
    String str5 = ((JSONObject)localObject).optString("url");
    String str6 = ((JSONObject)localObject).optString("userType");
    String str7 = ((JSONObject)localObject).optString("securitiesName");
    localObject = ((JSONObject)localObject).optString("isShowOccupationNumber", "false");
    if (TextUtils.isEmpty(paramAppMessage)) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(0, "userId不能为空", null);
    }
    if (TextUtils.isEmpty(str1)) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(0, "userName不能为空", null);
    }
    if (TextUtils.isEmpty(str2)) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(0, "orgId不能为空", null);
    }
    if (TextUtils.isEmpty(str3)) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(0, "jsessionId不能为空", null);
    }
    if (TextUtils.isEmpty(str5)) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(0, "url不能为空", null);
    }
    paramContext.registerReceiver(new VideoReceiver(), new IntentFilter("com.thinkive.mobile.video"));
    Intent localIntent = new Intent(paramContext, ApplyVideoActivity.class);
    localIntent.putExtra("user_id", paramAppMessage);
    localIntent.putExtra("user_name", str1);
    localIntent.putExtra("org_id", str2);
    localIntent.putExtra("jsessionid", str3);
    localIntent.putExtra("netWorkStatus", str4);
    localIntent.putExtra("user_type", str6);
    localIntent.putExtra("url", str5);
    localIntent.putExtra("securitiesName", str7);
    localIntent.putExtra("isShowOccupationNumber", (String)localObject);
    paramContext.startActivity(localIntent);
    return MessageManager.getInstance(paramContext).buildMessageReturn(1, null, null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\bk.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */