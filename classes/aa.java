import android.content.Context;
import android.os.Bundle;
import android.widget.Toast;
import com.android.thinkive.framework.compatible.CallBack.MessageCallBack;
import com.thinkive.mobile.video.activities.ApplyVideoActivity;

final class aa
  implements CallBack.MessageCallBack
{
  aa(z paramz) {}
  
  public final void handler(Context paramContext, int paramInt, Bundle paramBundle)
  {
    paramContext = ApplyVideoActivity.e();
    switch (paramInt)
    {
    case 1: 
    default: 
      return;
    case 0: 
      paramBundle = paramBundle.getString("conn_str");
      if (paramBundle == null) {
        Toast.makeText(paramContext, "视频服务器地址为空！", 1).show();
      }
      try
      {
        paramBundle = paramBundle.split(":");
        String str = paramBundle[0];
        paramInt = Integer.valueOf(paramBundle[1]).intValue();
        paramContext.a(paramBundle[2]);
        paramContext.a(str, paramInt);
        return;
      }
      catch (Exception paramBundle)
      {
        paramBundle.printStackTrace();
        Toast.makeText(paramContext, "解析服务器配置异常！", 1).show();
        paramContext.m();
        paramContext.o();
        paramContext.n();
        return;
      }
    }
    Toast.makeText(paramContext, "网络不给力，请重试！", 1).show();
    paramContext.m();
    paramContext.o();
    paramContext.n();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */