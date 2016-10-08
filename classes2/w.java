import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;
import com.android.thinkive.framework.compatible.CallBack.MessageCallBack;
import com.thinkive.mobile.video.activities.ApplyVideoActivity;

final class w
  implements CallBack.MessageCallBack
{
  w(v paramv) {}
  
  public final void handler(Context paramContext, int paramInt, Bundle paramBundle)
  {
    paramContext = ApplyVideoActivity.e();
    switch (paramInt)
    {
    }
    do
    {
      do
      {
        return;
      } while (!"true".equals(paramBundle.getString("flag")));
      paramContext.i().sendEmptyMessage(1);
      paramContext.b(true);
      return;
    } while (paramContext.c);
    Toast.makeText(paramContext, "网络不给力，请重试！", 1).show();
    paramContext.m();
    paramContext.o();
    paramContext.n();
    paramContext.c = true;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */