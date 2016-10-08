package com.tencent.sharp.jni;

import android.annotation.TargetApi;
import android.media.AudioManager;
import android.media.AudioManager.OnAudioFocusChangeListener;
import com.tencent.av.utils.QLog;

class TraeAudioManager$TraeAudioManagerLooper$3
  implements AudioManager.OnAudioFocusChangeListener
{
  TraeAudioManager$TraeAudioManagerLooper$3(TraeAudioManager.TraeAudioManagerLooper paramTraeAudioManagerLooper) {}
  
  @TargetApi(8)
  public void onAudioFocusChange(int paramInt)
  {
    if (QLog.isColorLevel()) {
      QLog.w("TRAE", 0, "focusChange:" + paramInt + " _focusSteamType:" + this.this$1._focusSteamType + " currMode:" + this.this$1.this$0._am.getMode() + " _activeMode:" + this.this$1.this$0._activeMode);
    }
    if (paramInt == -1) {}
    while ((paramInt == -2) || (paramInt == -3) || (paramInt != 1)) {
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\sharp\jni\TraeAudioManager$TraeAudioManagerLooper$3.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */