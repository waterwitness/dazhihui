package com.f.a.a;

import android.os.Handler;
import android.os.Message;
import android.widget.Button;
import com.unionpay.upomp.lthj.plugin.ui.HomeActivity;

public class ap
  extends Handler
{
  public ap(HomeActivity paramHomeActivity) {}
  
  public void handleMessage(Message paramMessage)
  {
    paramMessage = (String)paramMessage.obj;
    if (HomeActivity.d(this.a) != null)
    {
      if (Integer.parseInt(paramMessage) < 0)
      {
        HomeActivity.d(this.a).setEnabled(true);
        HomeActivity.d(this.a).setText(this.a.getString(bp.ee()));
      }
    }
    else {
      return;
    }
    HomeActivity.d(this.a).setEnabled(false);
    HomeActivity.d(this.a).setText(paramMessage + this.a.getString(bp.eg()));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */