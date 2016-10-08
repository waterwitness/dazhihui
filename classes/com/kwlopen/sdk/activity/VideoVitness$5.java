package com.kwlopen.sdk.activity;

import android.view.View;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;

class VideoVitness$5
  implements ViewTreeObserver.OnGlobalLayoutListener
{
  VideoVitness$5(VideoVitness paramVideoVitness, View paramView) {}
  
  public void onGlobalLayout()
  {
    if (!this.this$0.bVideoViewLoaded)
    {
      this.this$0.bVideoViewLoaded = true;
      this.this$0.videoAreaWidth = this.val$layoutLocal.getWidth();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwlopen\sdk\activity\VideoVitness$5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */