package com.tencent.sharp.jni;

import android.media.AudioManager;

class TraeAudioManager$headsetSwitchThread
  extends TraeAudioManager.switchThread
{
  TraeAudioManager$headsetSwitchThread(TraeAudioManager paramTraeAudioManager)
  {
    super(paramTraeAudioManager);
  }
  
  public void _quit() {}
  
  public void _run()
  {
    if (!TraeAudioManager.IsMusicScene)
    {
      this.this$0.InternalSetSpeaker(this.this$0._context, false);
      this.this$0._am.setWiredHeadsetOn(true);
    }
    updateStatus();
    if (TraeAudioManager.IsMusicScene) {}
    for (;;)
    {
      return;
      while (this._running == true)
      {
        if (this.this$0._am.isSpeakerphoneOn()) {
          this.this$0.InternalSetSpeaker(this.this$0._context, false);
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
        int i = 0;
      }
    }
  }
  
  public String getDeviceName()
  {
    return "DEVICE_WIREDHEADSET";
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\sharp\jni\TraeAudioManager$headsetSwitchThread.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */