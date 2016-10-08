package com.kwlopen.sdk.activity;

import android.media.MediaPlayer;
import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;

class VideoPlayActivity$SurfaceCallback
  implements SurfaceHolder.Callback
{
  private VideoPlayActivity$SurfaceCallback(VideoPlayActivity paramVideoPlayActivity) {}
  
  public void surfaceChanged(SurfaceHolder paramSurfaceHolder, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void surfaceCreated(SurfaceHolder paramSurfaceHolder) {}
  
  public void surfaceDestroyed(SurfaceHolder paramSurfaceHolder)
  {
    if (VideoPlayActivity.access$0(this.this$0) != null)
    {
      VideoPlayActivity.access$0(this.this$0).release();
      VideoPlayActivity.access$1(this.this$0, null);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwlopen\sdk\activity\VideoPlayActivity$SurfaceCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */