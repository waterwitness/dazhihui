import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.android.thinkive.framework.message.AppMessage;
import com.android.thinkive.framework.message.IMessageHandler;
import com.android.thinkive.framework.message.MessageManager;
import com.c.a.k;
import com.thinkive.mobile.account.activitys.CameraActivity;
import com.thinkive.mobile.account.entity.IntentTransformer;
import org.json.JSONObject;

public final class bh
  implements IMessageHandler
{
  public final String handlerMessage(Context paramContext, AppMessage paramAppMessage)
  {
    paramAppMessage = paramAppMessage.getContent();
    paramAppMessage = (IntentTransformer)new k().a(paramAppMessage.toString(), IntentTransformer.class);
    if (TextUtils.isEmpty(paramAppMessage.getUuid())) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(0, "uuid不能为空", null);
    }
    if (TextUtils.isEmpty(paramAppMessage.getUserId())) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(0, "userId不能为空", null);
    }
    if (TextUtils.isEmpty(paramAppMessage.getR())) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(0, "rodam不能为空", null);
    }
    if (TextUtils.isEmpty(paramAppMessage.getImgType())) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(0, "imgType不能为空", null);
    }
    if (TextUtils.isEmpty(paramAppMessage.getFuncNum())) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(0, "funcNo不能为空", null);
    }
    if (TextUtils.isEmpty(paramAppMessage.getPhotoType())) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(0, "phototype不能为空", null);
    }
    if (TextUtils.isEmpty(paramAppMessage.getAction())) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(0, "action不能为空", null);
    }
    if (TextUtils.isEmpty(paramAppMessage.getUrl())) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(0, "url不能为空", null);
    }
    if ((!paramAppMessage.getAction().equals("pai")) && (!paramAppMessage.getAction().equals("phone"))) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(0, "选择照片选项不能为空", null);
    }
    if (paramAppMessage.getAction().equals("pai")) {}
    for (int i = 8437760;; i = 8437761)
    {
      Intent localIntent = new Intent(paramContext, CameraActivity.class);
      localIntent.putExtra("CAMERA_TYPE", i);
      paramAppMessage.setUrl(paramAppMessage.getUrl() + ";jsessionid=" + paramAppMessage.getJsessionId());
      localIntent.putExtra("intent_trans_params", paramAppMessage);
      paramContext.startActivity(localIntent);
      return MessageManager.getInstance(paramContext).buildMessageReturn(1, null, null);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\bh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */