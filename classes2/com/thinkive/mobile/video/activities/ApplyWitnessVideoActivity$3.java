package com.thinkive.mobile.video.activities;

import android.os.Handler;
import android.util.Log;
import java.util.TimerTask;

final class ApplyWitnessVideoActivity$3
  extends TimerTask
{
  ApplyWitnessVideoActivity$3(ApplyWitnessVideoActivity paramApplyWitnessVideoActivity) {}
  
  public final void run()
  {
    Log.e("asos", "申请见证501531");
    ApplyWitnessVideoActivity.a(this.a).sendEmptyMessage(51);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\thinkive\mobile\video\activities\ApplyWitnessVideoActivity$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */