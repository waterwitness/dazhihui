import android.content.Context;
import android.os.Handler;
import android.text.TextUtils;
import com.android.thinkive.framework.ThinkiveInitializer;
import com.android.thinkive.framework.message.AppMessage;
import com.android.thinkive.framework.message.IMessageHandler;
import com.android.thinkive.framework.message.MessageManager;
import com.c.a.k;
import com.thinkive.mobile.account.entity.IntentTransformer;
import org.json.JSONObject;

public final class bn
  implements IMessageHandler
{
  public final String handlerMessage(Context paramContext, AppMessage paramAppMessage)
  {
    paramAppMessage = paramAppMessage.getContent();
    paramAppMessage = (IntentTransformer)new k().a(paramAppMessage.toString(), IntentTransformer.class);
    if (TextUtils.isEmpty(paramAppMessage.getRequestParam())) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(0, "requestParam不能为空", null);
    }
    if (TextUtils.isEmpty(paramAppMessage.getImgType())) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(0, "imgType不能为空", null);
    }
    if (TextUtils.isEmpty(paramAppMessage.getUrl())) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(0, "url不能为空", null);
    }
    if (TextUtils.isEmpty(paramAppMessage.getModuleName())) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(0, "moduleName不能为空", null);
    }
    ThinkiveInitializer.getInstance().getHandler().post(new bo(this, paramContext, paramAppMessage));
    return MessageManager.getInstance(paramContext).buildMessageReturn(1, null, null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\bn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */