package com.f.a.a;

import android.os.Handler;
import android.os.Message;
import android.widget.Button;
import com.unionpay.upomp.lthj.plugin.ui.PayActivity;

public class cv
  extends Handler
{
  public cv(PayActivity paramPayActivity) {}
  
  public void handleMessage(Message paramMessage)
  {
    paramMessage = (String)paramMessage.obj;
    if (PayActivity.c(this.a) != null)
    {
      if (Integer.parseInt(paramMessage) < 0)
      {
        PayActivity.c(this.a).setEnabled(true);
        PayActivity.c(this.a).setText(this.a.getString(bp.ee()));
      }
    }
    else {
      return;
    }
    PayActivity.c(this.a).setEnabled(false);
    PayActivity.c(this.a).setText(paramMessage + this.a.getString(bp.eg()));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\cv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */