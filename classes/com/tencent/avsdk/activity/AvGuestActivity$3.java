package com.tencent.avsdk.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

class AvGuestActivity$3
  extends BroadcastReceiver
{
  AvGuestActivity$3(AvGuestActivity paramAvGuestActivity) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (this.this$0.isFinishing()) {}
    do
    {
      return;
      paramContext = paramIntent.getAction();
      Log.d("ilvb", "AvGuestActivity onReceive action = " + paramContext);
      if (paramContext.equals("com.dazhihui.avsdk.ACTION_START_CONTEXT_COMPLETE"))
      {
        AvGuestActivity.access$302(this.this$0, paramIntent.getIntExtra("av_error_result", 0));
        if (AvGuestActivity.access$300(this.this$0) != 0)
        {
          Log.e("ilvb", "AvGuestActivity onReceive start context: 登录失败 ErrorCode=" + AvGuestActivity.access$300(this.this$0));
          paramContext = AvGuestActivity.access$100(this.this$0).obtainMessage(349);
          paramContext.arg1 = AvGuestActivity.access$300(this.this$0);
          paramContext.sendToTarget();
          return;
        }
        Log.d("ilvb", "AvGuestActivity onReceive start context 成功 next enter room");
        AvGuestActivity.access$100(this.this$0).sendEmptyMessage(321);
        return;
      }
      if (paramContext.equals("com.dazhihui.avsdk.ACTION_CLOSE_CONTEXT_COMPLETE"))
      {
        Log.d("ilvb", "AvGuestActivity onReceive ACTION_CLOSE_CONTEXT_COMPLETE");
        return;
      }
      if (paramContext.equals("com.android.dazhihui.ilvbclose"))
      {
        AvGuestActivity.access$100(this.this$0).sendEmptyMessage(262);
        return;
      }
      if (paramContext.equals("android.net.conn.CONNECTIVITY_CHANGE"))
      {
        AvGuestActivity.access$100(this.this$0).sendEmptyMessage(335);
        return;
      }
    } while (!"com.dazhihui.avsdk.ACTION_SHOW_GIFT_VIEW".equals(paramContext));
    Log.d("ilvb", "AvGuestActivity onReceive ACTION_SHOW_GIFT_VIEW");
    paramContext = AvGuestActivity.access$100(this.this$0).obtainMessage(301);
    paramContext.arg1 = 0;
    AvGuestActivity.access$100(this.this$0).sendMessage(paramContext);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\activity\AvGuestActivity$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */