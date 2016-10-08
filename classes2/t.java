import android.content.Context;
import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import com.android.thinkive.framework.compatible.CallBack.MessageCallBack;
import com.thinkive.mobile.video.activities.ApplyVideoActivity;

final class t
  implements CallBack.MessageCallBack
{
  t(s params) {}
  
  public final void handler(Context paramContext, int paramInt, Bundle paramBundle)
  {
    ApplyVideoActivity localApplyVideoActivity = ApplyVideoActivity.e();
    Button localButton = localApplyVideoActivity.j();
    switch (paramInt)
    {
    default: 
      return;
    case 0: 
      localApplyVideoActivity.i = "1";
      localApplyVideoActivity.g();
      localApplyVideoActivity.f();
      localApplyVideoActivity.runOnUiThread(new u(this, localButton));
      return;
    case 1: 
      Toast.makeText(paramContext, "调用接口异常：错误代码（" + paramBundle.get("error_code") + "），异常信息（" + paramBundle.get("msg") + "）", 1).show();
      return;
    }
    Toast.makeText(localApplyVideoActivity, "网络不给力，请重试！", 1).show();
    localApplyVideoActivity.m();
    localApplyVideoActivity.o();
    localApplyVideoActivity.n();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */