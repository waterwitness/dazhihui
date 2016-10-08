import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import com.android.thinkive.framework.compatible.CallBack.MessageCallBack;
import com.android.thinkive.framework.storage.MemoryStorage;
import com.thinkive.mobile.video.activities.ApplyVideoActivity;

final class ac
  implements CallBack.MessageCallBack
{
  ac(ab paramab) {}
  
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
        do
        {
          do
          {
            do
            {
              for (;;)
              {
                return;
                try
                {
                  paramBundle = paramBundle.getString("flag");
                  if ("0".equals(paramBundle))
                  {
                    paramContext.g.setVisibility(0);
                    paramContext.h.setVisibility(8);
                    if (!paramContext.e) {
                      continue;
                    }
                    Toast.makeText(paramContext, "坐席端已退出！", 1).show();
                    paramContext.m();
                    paramContext.n();
                    paramContext.o();
                  }
                }
                catch (Exception paramContext)
                {
                  paramContext.printStackTrace();
                  return;
                }
              }
              if (!"1".equals(paramBundle)) {
                break;
              }
              this.a.a.saveData("seatFlag", paramBundle);
              paramContext.e = true;
              paramContext.g.setVisibility(8);
            } while (!paramContext.i.equals("0"));
            paramContext.h();
            return;
          } while (!"2".equals(paramBundle));
          this.a.a.saveData("seatFlag", paramBundle);
          paramContext.e = true;
          paramContext.g.setVisibility(8);
        } while (!paramContext.i.equals("0"));
        paramContext.h();
        return;
      } while (!paramBundle.get("error_code").equals("-999"));
      paramContext.r();
      return;
    } while (paramContext.d);
    Toast.makeText(paramContext, "网络不给力，请重试！", 1).show();
    paramContext.d = true;
    paramContext.o();
    paramContext.m();
    paramContext.n();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */