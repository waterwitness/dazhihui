package com.thinkive.mobile.video.activities;

import android.os.Handler;
import android.os.Message;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

final class OfflineVideoActivity$a$1
  extends Handler
{
  OfflineVideoActivity$a$1(OfflineVideoActivity.a parama) {}
  
  public final void handleMessage(Message paramMessage)
  {
    paramMessage = OfflineVideoActivity.a.a(this.a);
    OfflineVideoActivity.a(paramMessage, OfflineVideoActivity.a(paramMessage) + 1);
    if (OfflineVideoActivity.a(OfflineVideoActivity.a.a(this.a)) < 60) {
      if (OfflineVideoActivity.a(OfflineVideoActivity.a.a(this.a)) < 10) {
        OfflineVideoActivity.b(OfflineVideoActivity.a.a(this.a)).setText("00:0" + OfflineVideoActivity.a(OfflineVideoActivity.a.a(this.a)));
      }
    }
    for (;;)
    {
      if (OfflineVideoActivity.a(OfflineVideoActivity.a.a(this.a)) <= OfflineVideoActivity.c(OfflineVideoActivity.a.a(this.a))) {
        OfflineVideoActivity.d(OfflineVideoActivity.a.a(this.a)).setProgress(OfflineVideoActivity.a(OfflineVideoActivity.a.a(this.a)));
      }
      if (OfflineVideoActivity.a(OfflineVideoActivity.a.a(this.a)) == OfflineVideoActivity.c(OfflineVideoActivity.a.a(this.a)))
      {
        Toast.makeText(OfflineVideoActivity.a.a(this.a), "已达到最大录制时长", 0).show();
        OfflineVideoActivity.a.a(this.a).f();
      }
      return;
      OfflineVideoActivity.b(OfflineVideoActivity.a.a(this.a)).setText("00:" + OfflineVideoActivity.a(OfflineVideoActivity.a.a(this.a)));
      continue;
      int i = OfflineVideoActivity.a(OfflineVideoActivity.a.a(this.a)) % 60;
      int j = OfflineVideoActivity.a(OfflineVideoActivity.a.a(this.a)) / 60;
      if (i < 10) {
        OfflineVideoActivity.b(OfflineVideoActivity.a.a(this.a)).setText("0" + j + ":0" + i);
      } else {
        OfflineVideoActivity.b(OfflineVideoActivity.a.a(this.a)).setText("0" + j + ":" + i);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\thinkive\mobile\video\activities\OfflineVideoActivity$a$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */