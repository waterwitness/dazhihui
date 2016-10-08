package tencent.tls.request;

import android.text.TextPaint;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import java.util.Timer;
import tencent.tls.platform.TLSErrInfo;

class alert_thread$1
  implements Runnable
{
  alert_thread$1(alert_thread paramalert_thread) {}
  
  private void execToast(Toast paramToast, int paramInt)
  {
    new Timer().schedule(new alert_thread.1.1(this, paramToast, paramInt), 30L);
  }
  
  private void initToast(Toast paramToast, int paramInt)
  {
    if (paramInt > 5) {
      return;
    }
    paramToast.show();
    execToast(paramToast, paramInt);
  }
  
  public void run()
  {
    if ((alert_thread.access$000(this.this$0) != null) && (alert_thread.access$100(this.this$0) != null))
    {
      LinearLayout localLinearLayout = new LinearLayout(alert_thread.access$000(this.this$0));
      localLinearLayout.setOrientation(1);
      localLinearLayout.setBackgroundColor(-7829368);
      localLinearLayout.setLayoutParams(new LinearLayout.LayoutParams(-2, -2));
      Object localObject = new TextView(alert_thread.access$000(this.this$0));
      ((TextView)localObject).getPaint().setFakeBoldText(true);
      ((TextView)localObject).setText(alert_thread.access$100(this.this$0).Title);
      localLinearLayout.addView((View)localObject, 0, new LinearLayout.LayoutParams(-1, -2));
      localObject = new TextView(alert_thread.access$000(this.this$0));
      ((TextView)localObject).setText(alert_thread.access$100(this.this$0).Msg);
      localLinearLayout.addView((View)localObject, 1, new LinearLayout.LayoutParams(-1, -2));
      localObject = new Toast(alert_thread.access$000(this.this$0));
      ((Toast)localObject).setGravity(17, 0, 0);
      ((Toast)localObject).setDuration(1);
      ((Toast)localObject).setView(localLinearLayout);
      initToast((Toast)localObject, 0);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\tencent\tls\request\alert_thread$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */