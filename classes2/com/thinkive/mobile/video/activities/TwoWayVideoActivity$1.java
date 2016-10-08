package com.thinkive.mobile.video.activities;

import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.widget.TextView;
import com.bairuitech.anychat.AnyChatCoreSDK;
import java.util.Timer;

final class TwoWayVideoActivity$1
  extends Handler
{
  TwoWayVideoActivity$1(TwoWayVideoActivity paramTwoWayVideoActivity) {}
  
  public final void handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 1)
    {
      Object localObject = this.a;
      TwoWayVideoActivity.a((TwoWayVideoActivity)localObject, TwoWayVideoActivity.a((TwoWayVideoActivity)localObject) - 1);
      TwoWayVideoActivity.b(this.a).setText("等待坐席进入房间(" + TwoWayVideoActivity.a(this.a) + "秒)");
      localObject = this.a.b.GetOnlineUser();
      if (localObject != null)
      {
        Log.e("asos", localObject.length);
        if (localObject.length == 1)
        {
          TwoWayVideoActivity.c(this.a).cancel();
          TwoWayVideoActivity.b(this.a).setText("您好，见证开始了，请不要随意挂断或者离开");
          return;
        }
      }
      if (TwoWayVideoActivity.a(this.a) <= 0)
      {
        TwoWayVideoActivity.a(this.a, "1");
        TwoWayVideoActivity.b(this.a).setText("坐席繁忙请点击断开连接，等待系统重新分配客服人员");
        TwoWayVideoActivity.c(this.a).cancel();
      }
    }
    for (;;)
    {
      super.handleMessage(paramMessage);
      return;
      if (paramMessage.what == 0) {
        TwoWayVideoActivity.d(this.a);
      } else if (paramMessage.what == 2) {
        TwoWayVideoActivity.e(this.a);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\thinkive\mobile\video\activities\TwoWayVideoActivity$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */