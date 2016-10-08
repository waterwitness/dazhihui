package com.f.a.a;

import android.os.Handler;
import android.os.Message;
import android.widget.Button;
import com.unionpay.upomp.lthj.plugin.ui.AccountActivity;

public class bd
  extends Handler
{
  public bd(AccountActivity paramAccountActivity) {}
  
  public void handleMessage(Message paramMessage)
  {
    paramMessage = (String)paramMessage.obj;
    if (AccountActivity.b(this.a) != null)
    {
      if (Integer.parseInt(paramMessage) < 0)
      {
        AccountActivity.b(this.a).setEnabled(true);
        AccountActivity.b(this.a).setText(this.a.getString(bp.ee()));
      }
    }
    else {
      return;
    }
    AccountActivity.b(this.a).setEnabled(false);
    AccountActivity.b(this.a).setText(paramMessage + this.a.getString(bp.eg()));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\bd.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */