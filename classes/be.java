import android.app.Activity;
import android.content.Context;
import com.android.thinkive.framework.ThinkiveInitializer;
import com.android.thinkive.framework.WebViewManager;
import com.android.thinkive.framework.message.AppMessage;
import com.android.thinkive.framework.message.IMessageHandler;
import com.android.thinkive.framework.message.MessageManager;

public final class be
  implements IMessageHandler
{
  public final String handlerMessage(Context paramContext, AppMessage paramAppMessage)
  {
    WebViewManager.getInstance().release();
    ThinkiveInitializer.getInstance().clearActivityStack();
    ((Activity)paramContext).finish();
    return MessageManager.getInstance(paramContext).buildMessageReturn(1, null, null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\be.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */