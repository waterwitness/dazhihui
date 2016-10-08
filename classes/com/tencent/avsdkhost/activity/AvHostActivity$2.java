package com.tencent.avsdkhost.activity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.util.Log;

class AvHostActivity$2
  extends BroadcastReceiver
{
  AvHostActivity$2(AvHostActivity paramAvHostActivity) {}
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if (this.this$0.isFinishing()) {}
    do
    {
      return;
      paramContext = paramIntent.getAction();
      Log.d("ilvb", "AvHostActivity onReceive action = " + paramContext);
      if (paramContext.equals("com.dazhihui.avsdk.ACTION_START_CONTEXT_COMPLETE"))
      {
        AvHostActivity.access$902(this.this$0, paramIntent.getIntExtra("av_error_result", 0));
        if (AvHostActivity.access$900(this.this$0) != 0)
        {
          Log.e("ilvb", "AvHostActivity onReceive ACTION_START_CONTEXT_COMPLETE 登录失败 ErrorCode=" + AvHostActivity.access$900(this.this$0));
          AvHostActivity.access$000(this.this$0).sendEmptyMessage(349);
          return;
        }
        Log.i("ilvb", "AvHostActivity onReceive 启动SDK系统OK next createRoom");
        AvHostActivity.access$000(this.this$0).sendEmptyMessage(321);
        AvHostActivity.access$000(this.this$0).sendEmptyMessageDelayed(323, 0L);
        return;
      }
      if (paramContext.equals("com.dazhihui.avsdk.ACTION_CLOSE_CONTEXT_COMPLETE"))
      {
        Log.d("ilvb", "AvHostActivity onReceive ACTION_CLOSE_CONTEXT_COMPLETE");
        return;
      }
      if (paramContext.equals("com.android.dazhihui.ilvbclose"))
      {
        AvHostActivity.access$000(this.this$0).sendEmptyMessage(262);
        return;
      }
    } while (!paramContext.equals("android.net.conn.CONNECTIVITY_CHANGE"));
    AvHostActivity.access$000(this.this$0).sendEmptyMessage(335);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\activity\AvHostActivity$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */