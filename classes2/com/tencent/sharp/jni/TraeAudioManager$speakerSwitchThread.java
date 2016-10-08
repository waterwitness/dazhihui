package com.tencent.sharp.jni;

import android.media.AudioManager;
import com.tencent.av.utils.QLog;

class TraeAudioManager$speakerSwitchThread
  extends TraeAudioManager.switchThread
{
  TraeAudioManager$speakerSwitchThread(TraeAudioManager paramTraeAudioManager)
  {
    super(paramTraeAudioManager);
  }
  
  public void _quit() {}
  
  public void _run()
  {
    int j = 0;
    if (!TraeAudioManager.IsMusicScene) {
      this.this$0.InternalSetSpeaker(this.this$0._context, true);
    }
    updateStatus();
    if (TraeAudioManager.IsMusicScene) {
      return;
    }
    int i = j;
    if (QLog.isColorLevel())
    {
      QLog.w("TRAE", 0, " _run:" + getDeviceName() + " _running:" + this._running);
      i = j;
    }
    while (this._running == true)
    {
      if (this.this$0._am.isSpeakerphoneOn() != true) {
        this.this$0.InternalSetSpeaker(this.this$0._context, true);
      }
      long l;
      if (i < 5) {
        l = 1000L;
      }
      try
      {
        for (;;)
        {
          Thread.sleep(l);
          i += 1;
          break;
          l = 4000L;
        }
      }
      catch (InterruptedException localInterruptedException)
      {
        for (;;) {}
      }
    }
  }
  
  public String getDeviceName()
  {
    return "DEVICE_SPEAKERPHONE";
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\sharp\jni\TraeAudioManager$speakerSwitchThread.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */