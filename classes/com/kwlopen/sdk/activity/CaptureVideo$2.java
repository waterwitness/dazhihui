package com.kwlopen.sdk.activity;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.media.MediaRecorder;

class CaptureVideo$2
  implements DialogInterface.OnClickListener
{
  CaptureVideo$2(CaptureVideo paramCaptureVideo) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (CaptureVideo.access$4(this.this$0) != null)
    {
      CaptureVideo.access$4(this.this$0).stop();
      CaptureVideo.access$5(this.this$0);
    }
    CaptureVideo.access$6(this.this$0, null);
    this.this$0.finish();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwlopen\sdk\activity\CaptureVideo$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */