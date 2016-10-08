package com.android.dazhihui.richscan;

import android.media.MediaPlayer;
import android.media.MediaPlayer.OnCompletionListener;

class i
  implements MediaPlayer.OnCompletionListener
{
  i(RichScanActivity paramRichScanActivity) {}
  
  public void onCompletion(MediaPlayer paramMediaPlayer)
  {
    paramMediaPlayer.seekTo(0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\richscan\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */