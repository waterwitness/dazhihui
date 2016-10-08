import android.content.Context;
import android.text.TextUtils;
import com.android.thinkive.framework.config.ConfigManager;
import com.android.thinkive.framework.message.AppMessage;
import com.android.thinkive.framework.message.IMessageHandler;
import com.android.thinkive.framework.message.MessageManager;
import java.io.IOException;
import java.security.KeyStoreException;
import java.security.NoSuchAlgorithmException;
import java.security.cert.CertificateException;
import org.json.JSONObject;

public final class bj
  implements IMessageHandler
{
  public final String handlerMessage(Context paramContext, AppMessage paramAppMessage)
  {
    paramAppMessage = paramAppMessage.getContent();
    Object localObject = paramAppMessage.optString("userId");
    String str2 = paramAppMessage.optString("type");
    String str1 = paramAppMessage.optString("content");
    if (TextUtils.isEmpty((CharSequence)localObject)) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(0, "userId不能为空", null);
    }
    if (TextUtils.isEmpty(str2)) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(0, "type不能为空", null);
    }
    if (TextUtils.isEmpty(str1)) {
      return MessageManager.getInstance(paramContext).buildMessageReturn(0, "content不能为空", null);
    }
    if (str2.equals("tw")) {
      paramAppMessage = localObject + "_tw";
    }
    for (;;)
    {
      localObject = g.a(paramContext, ConfigManager.getInstance(paramContext).getSystemConfigValue("LICENSE"));
      try
      {
        ((g)localObject).a(paramContext, paramAppMessage, str1, "thinkiveQWERT1003");
        return MessageManager.getInstance(paramContext).buildMessageReturn(1, null, null);
        paramAppMessage = (AppMessage)localObject;
        if (!str2.equals("zd")) {
          continue;
        }
        paramAppMessage = localObject + "_zd";
      }
      catch (k paramAppMessage)
      {
        for (;;)
        {
          paramAppMessage.printStackTrace();
        }
      }
      catch (i paramAppMessage)
      {
        for (;;)
        {
          paramAppMessage.printStackTrace();
        }
      }
      catch (KeyStoreException paramAppMessage)
      {
        for (;;)
        {
          paramAppMessage.printStackTrace();
        }
      }
      catch (CertificateException paramAppMessage)
      {
        for (;;)
        {
          paramAppMessage.printStackTrace();
        }
      }
      catch (NoSuchAlgorithmException paramAppMessage)
      {
        for (;;)
        {
          paramAppMessage.printStackTrace();
        }
      }
      catch (IOException paramAppMessage)
      {
        for (;;)
        {
          paramAppMessage.printStackTrace();
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\bj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */