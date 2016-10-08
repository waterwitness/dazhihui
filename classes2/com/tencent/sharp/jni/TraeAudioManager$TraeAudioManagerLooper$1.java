package com.tencent.sharp.jni;

import com.tencent.av.utils.QLog;
import java.util.HashMap;

class TraeAudioManager$TraeAudioManagerLooper$1
  implements TraeMediaPlayer.OnCompletionListener
{
  TraeAudioManager$TraeAudioManagerLooper$1(TraeAudioManager.TraeAudioManagerLooper paramTraeAudioManagerLooper) {}
  
  public void onCompletion()
  {
    if (QLog.isColorLevel()) {
      QLog.w("TRAE", 0, "_ringPlayer onCompletion _activeMode:" + this.this$1.this$0._activeMode + " _preRingMode:" + this.this$1._preRingMode);
    }
    HashMap localHashMap = new HashMap();
    localHashMap.put("PARAM_ISHOSTSIDE", Boolean.valueOf(true));
    this.this$1.sendMessage(32783, localHashMap);
    this.this$1.notifyRingCompletion();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\sharp\jni\TraeAudioManager$TraeAudioManagerLooper$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */