package com.f.a.a;

import android.os.Handler;
import android.os.Message;
import android.widget.Button;
import com.unionpay.upomp.lthj.plugin.ui.BankCardInfoActivity;

public class cg
  extends Handler
{
  public cg(BankCardInfoActivity paramBankCardInfoActivity) {}
  
  public void handleMessage(Message paramMessage)
  {
    paramMessage = (String)paramMessage.obj;
    if (BankCardInfoActivity.e(this.a) != null)
    {
      if (Integer.parseInt(paramMessage) < 0)
      {
        BankCardInfoActivity.e(this.a).setEnabled(true);
        BankCardInfoActivity.e(this.a).setText(this.a.getString(bp.ee()));
      }
    }
    else {
      return;
    }
    BankCardInfoActivity.e(this.a).setEnabled(false);
    BankCardInfoActivity.e(this.a).setText(paramMessage + this.a.getString(bp.eg()));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\cg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */