package com.tencent.connect.share;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnErrorListener;
import com.tencent.open.a.f;
import com.tencent.tauth.IUiListener;
import com.tencent.tauth.UiError;

class QzonePublish$2
  implements MediaPlayer.OnErrorListener
{
  QzonePublish$2(QzonePublish paramQzonePublish, IUiListener paramIUiListener) {}
  
  public boolean onError(MediaPlayer paramMediaPlayer, int paramInt1, int paramInt2)
  {
    f.e("openSDK_LOG.QzonePublish", "publishToQzone() mediaplayer onError()");
    this.a.onError(new UiError(-5, "请选择有效的视频文件", null));
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\connect\share\QzonePublish$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */