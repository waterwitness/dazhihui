package com.cairh.app.sjkh.ui;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.VideoView;

class VideoPreviewActivity$3
  implements View.OnClickListener
{
  VideoPreviewActivity$3(VideoPreviewActivity paramVideoPreviewActivity) {}
  
  public void onClick(View paramView)
  {
    VideoPreviewActivity.access$1(this.this$0).stopPlayback();
    this.this$0.uploadFile();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\ui\VideoPreviewActivity$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */