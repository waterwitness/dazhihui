package com.f.a.a;

import android.os.Handler;
import android.os.Message;
import com.unionpay.upomp.lthj.plugin.ui.BankCardInfoActivity;
import java.util.TimerTask;

public class cj
  extends TimerTask
{
  public cj(BankCardInfoActivity paramBankCardInfoActivity) {}
  
  public void run()
  {
    Object localObject = Message.obtain();
    ((Message)localObject).obj = (this.a.b + "");
    BankCardInfoActivity.d(this.a).sendMessage((Message)localObject);
    if (this.a.b < 0)
    {
      this.a.aaTimerTask.cancel();
      this.a.aaTimerTask = null;
      this.a.b = 60;
      return;
    }
    localObject = this.a;
    ((BankCardInfoActivity)localObject).b -= 1;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\cj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */