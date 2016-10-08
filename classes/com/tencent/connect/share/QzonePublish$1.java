package com.tencent.connect.share;

import android.app.Activity;
import android.media.MediaPlayer;
import android.media.MediaPlayer.OnPreparedListener;
import android.os.Bundle;
import com.tencent.open.a.f;
import com.tencent.tauth.IUiListener;
import java.io.File;

class QzonePublish$1
  implements MediaPlayer.OnPreparedListener
{
  QzonePublish$1(QzonePublish paramQzonePublish, String paramString, Bundle paramBundle, Activity paramActivity, IUiListener paramIUiListener) {}
  
  public void onPrepared(MediaPlayer paramMediaPlayer)
  {
    long l = new File(this.a).length();
    int i = paramMediaPlayer.getDuration();
    this.b.putString("videoPath", this.a);
    this.b.putInt("videoDuration", i);
    this.b.putLong("videoSize", l);
    QzonePublish.a(this.e, this.c, this.b, this.d);
    f.c("openSDK_LOG.QzonePublish", "publishToQzone() --end");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\connect\share\QzonePublish$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */