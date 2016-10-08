import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;
import com.android.thinkive.framework.ThinkiveInitializer;
import com.android.thinkive.framework.compatible.CallBack.MessageCallBack;
import com.android.thinkive.framework.compatible.DialogFrame;
import com.android.thinkive.framework.message.AppMessage;
import com.android.thinkive.framework.message.MessageManager;
import com.thinkive.mobile.video.activities.OfflineVideoActivity;
import org.json.JSONException;
import org.json.JSONObject;

final class ag
  implements CallBack.MessageCallBack
{
  ag(af paramaf) {}
  
  public final void handler(Context paramContext, int paramInt, Bundle paramBundle)
  {
    OfflineVideoActivity localOfflineVideoActivity = OfflineVideoActivity.d();
    new DialogFrame(localOfflineVideoActivity).unWaitDialog();
    Object localObject = OfflineVideoActivity.e;
    String str2 = OfflineVideoActivity.f;
    String str1 = paramBundle.getString("error_code");
    paramBundle = paramBundle.getString("msg");
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("mTimeCount", localObject);
      localJSONObject.put("start_time", str2);
      localObject = new AppMessage("open", 60054, localJSONObject);
      switch (paramInt)
      {
      case 3: 
      case 4: 
      default: 
        Toast.makeText(localOfflineVideoActivity, "服务器异常", 1).show();
        return;
      }
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        localJSONException.printStackTrace();
      }
      MessageManager.getInstance(localOfflineVideoActivity).sendMessage(localJSONException);
      Toast.makeText(localOfflineVideoActivity, "视频文件上传成功", 1).show();
      ThinkiveInitializer.getInstance().getHandler().postDelayed(new ah(this, localOfflineVideoActivity), 888L);
      return;
    }
    Toast.makeText(localOfflineVideoActivity, "网络不给力，请重试！", 1).show();
    localOfflineVideoActivity.finish();
    return;
    Toast.makeText(localOfflineVideoActivity, str1 + ":" + paramBundle, 1).show();
    localOfflineVideoActivity.finish();
    return;
    Toast.makeText(localOfflineVideoActivity, "服务器连接超时", 1).show();
    return;
    Toast.makeText(paramContext, "网络不可用，请检查您的网络设置", 1).show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */