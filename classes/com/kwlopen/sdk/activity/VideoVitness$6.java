package com.kwlopen.sdk.activity;

import android.content.Intent;
import android.util.Log;
import java.util.TimerTask;

class VideoVitness$6
  extends TimerTask
{
  VideoVitness$6(VideoVitness paramVideoVitness) {}
  
  public void run()
  {
    Log.d(VideoVitness.class.getName(), "我到时间了--------");
    Intent localIntent = new Intent();
    localIntent.putExtra("errcode", -6);
    localIntent.putExtra("errmsg", "坐席意外断开，请重新认证！");
    localIntent.putExtra("flag", VideoVitness.access$5(this.this$0));
    this.this$0.setResult(-1, localIntent);
    this.this$0.stopTimer();
    this.this$0.finish();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwlopen\sdk\activity\VideoVitness$6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */