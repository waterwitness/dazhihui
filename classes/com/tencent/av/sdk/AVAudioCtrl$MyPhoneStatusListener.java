package com.tencent.av.sdk;

import android.util.Log;
import com.tencent.av.utils.PhoneStatusMonitor.PhoneStatusListener;
import com.tencent.sharp.jni.TraeAudioSession;

class AVAudioCtrl$MyPhoneStatusListener
  implements PhoneStatusMonitor.PhoneStatusListener
{
  AVAudioCtrl$MyPhoneStatusListener(AVAudioCtrl paramAVAudioCtrl) {}
  
  public void onCallStateChanged(boolean paramBoolean)
  {
    if (AVAudioCtrl.access$600(this.this$0)) {
      Log.e("SdkJni", "onCallStateChanged isSystemApp return");
    }
    do
    {
      do
      {
        return;
        Log.e("SdkJni", "onCallStateChanged isCalling: " + paramBoolean);
        this.this$0.mIsCalling = paramBoolean;
        if (!paramBoolean) {
          break;
        }
        this.this$0.pauseAudio();
        Log.e("SdkJni", "MyPhoneStatusListener iscalling ");
      } while (AVAudioCtrl.access$400(this.this$0) == null);
      Log.e("SdkJni", "MyPhoneStatusListener stopService ");
      AVAudioCtrl.access$400(this.this$0).stopService();
      return;
      Log.e("SdkJni", "MyPhoneStatusListener notcalling ");
      this.this$0.resumeAudio();
    } while (AVAudioCtrl.access$400(this.this$0) == null);
    AVAudioCtrl.access$400(this.this$0).startService(AVAudioCtrl.access$700(this.this$0));
    Log.e("SdkJni", "MyPhoneStatusListener startService ");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\sdk\AVAudioCtrl$MyPhoneStatusListener.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */