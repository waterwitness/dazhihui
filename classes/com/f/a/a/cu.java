package com.f.a.a;

import android.os.Handler;
import android.os.Message;
import com.unionpay.upomp.lthj.plugin.ui.PayActivity;
import java.util.TimerTask;

public class cu
  extends TimerTask
{
  public cu(PayActivity paramPayActivity) {}
  
  public void run()
  {
    Object localObject = Message.obtain();
    ((Message)localObject).obj = (this.a.a + "");
    PayActivity.g(this.a).sendMessage((Message)localObject);
    if (this.a.a < 0)
    {
      this.a.aaTimerTask.cancel();
      this.a.aaTimerTask = null;
      this.a.a = 60;
      return;
    }
    localObject = this.a;
    ((PayActivity)localObject).a -= 1;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\cu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */