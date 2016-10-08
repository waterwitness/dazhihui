import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;
import com.android.thinkive.framework.compatible.CallBack.MessageCallBack;
import com.android.thinkive.framework.message.AppMessage;
import com.android.thinkive.framework.message.MessageManager;
import com.thinkive.mobile.account.activitys.FacePhotographActivity;
import org.json.JSONException;
import org.json.JSONObject;

final class y
  implements CallBack.MessageCallBack
{
  y(x paramx) {}
  
  public final void handler(Context paramContext, int paramInt, Bundle paramBundle)
  {
    paramContext = FacePhotographActivity.d();
    JSONObject localJSONObject = new JSONObject();
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
      String str1 = paramBundle.getString("similarity");
      String str2 = paramBundle.getString("pass_similarity");
      paramBundle = paramBundle.getString("pass_flag");
      try
      {
        localJSONObject.put("pass_flag", paramBundle);
        localJSONObject.put("similarity", str1);
        localJSONObject.put("pass_similarity", str2);
        paramBundle = new AppMessage("open", 60053, localJSONObject);
        MessageManager.getInstance(paramContext).sendMessage(paramBundle);
        paramContext.finish();
        return;
      }
      catch (JSONException paramBundle)
      {
        for (;;)
        {
          paramBundle.printStackTrace();
        }
      }
    case 1: 
      if (paramBundle.get("error_code").equals("-999")) {
        if (!paramContext.isFinishing()) {
          paramContext.f();
        }
      }
      try
      {
        for (;;)
        {
          localJSONObject.put("pass_flag", 0);
          localJSONObject.put("similarity", 0);
          localJSONObject.put("pass_similarity", 0);
          paramBundle = new AppMessage("open", 60053, localJSONObject);
          MessageManager.getInstance(paramContext).sendMessage(paramBundle);
          return;
          paramContext.a(paramBundle.getString("msg"));
        }
      }
      catch (JSONException paramBundle)
      {
        for (;;)
        {
          paramBundle.printStackTrace();
        }
      }
    }
    Toast.makeText(paramContext, "网络不给力，请重试！", 1).show();
    paramContext.finish();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */