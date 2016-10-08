package com.thinkive.mobile.video.activities;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.TextView;
import com.bairuitech.anychat.AnyChatCoreSDK;
import java.util.Timer;

final class VideoActivity$1
  extends Handler
{
  VideoActivity$1(VideoActivity paramVideoActivity) {}
  
  public final void handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 1)
    {
      Object localObject = this.a;
      VideoActivity.a((VideoActivity)localObject, VideoActivity.a((VideoActivity)localObject) - 1);
      VideoActivity.b(this.a).setText("等待坐席进入房间(" + VideoActivity.a(this.a) + "秒)");
      localObject = this.a.b.GetOnlineUser();
      if (localObject != null)
      {
        Log.e("````````````````", localObject.length);
        if (localObject.length == 1)
        {
          VideoActivity.c(this.a).cancel();
          VideoActivity.b(this.a).setText("");
          return;
        }
      }
      if (VideoActivity.a(this.a) <= 0)
      {
        VideoActivity.a(this.a, "1");
        VideoActivity.b(this.a).setText("坐席繁忙请点击断开连接，等待系统重新分配客服人员");
        VideoActivity.c(this.a).cancel();
      }
    }
    for (;;)
    {
      super.handleMessage(paramMessage);
      return;
      if (paramMessage.what == 0) {
        VideoActivity.d(this.a);
      } else if (paramMessage.what == 2) {
        VideoActivity.e(this.a);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\thinkive\mobile\video\activities\VideoActivity$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */