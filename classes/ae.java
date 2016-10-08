import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.android.thinkive.framework.compatible.CallBack.MessageCallBack;
import com.android.thinkive.framework.storage.MemoryStorage;
import com.thinkive.mobile.video.activities.ApplyVideoActivity;

final class ae
  implements CallBack.MessageCallBack
{
  ae(ad paramad) {}
  
  public final void handler(Context paramContext, int paramInt, Bundle paramBundle)
  {
    int i = 0;
    paramContext = ApplyVideoActivity.e();
    paramBundle = paramBundle.getString("count");
    switch (paramInt)
    {
    }
    for (;;)
    {
      return;
      try
      {
        if ("0".equals(paramBundle))
        {
          paramContext.h.setVisibility(8);
          paramContext.f.setVisibility(0);
          paramContext.f.setText("坐席正在等待见证中，请尽快重新申请视频见证.");
          return;
        }
      }
      catch (Exception paramContext)
      {
        paramContext.printStackTrace();
        return;
      }
      if ("-1".equals(paramBundle))
      {
        if (!paramContext.k()) {
          continue;
        }
        paramContext.finish();
        Toast.makeText(paramContext, "您的网络异常，请重新排队！", 0).show();
        paramContext.b = true;
        return;
      }
      try
      {
        paramInt = Integer.valueOf(paramBundle).intValue();
        paramContext.h.setVisibility(0);
        paramContext.f.setVisibility(8);
        paramContext.l().setText(String.valueOf(paramInt));
        if ("1".equals(this.a.a.loadData("seatFlag")))
        {
          paramContext.d().setText("位，请耐心等待营业部坐席人员进行见证");
          return;
        }
        if (!"2".equals(this.a.a.loadData("seatFlag"))) {
          continue;
        }
        paramContext.d().setText("位，请耐心等待总部坐席人员进行见证");
        return;
        if (paramContext.b) {
          continue;
        }
        Toast.makeText(paramContext, "网络不给力，请重试！", 1).show();
        paramContext.m();
        paramContext.o();
        paramContext.n();
        paramContext.b = true;
        return;
      }
      catch (NumberFormatException paramBundle)
      {
        for (;;)
        {
          paramInt = i;
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */