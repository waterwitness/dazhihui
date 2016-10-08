package com.tencent.sharp.jni;

import com.tencent.av.utils.QLog;
import java.util.TimerTask;

class TraeMediaPlayer$1
  extends TimerTask
{
  TraeMediaPlayer$1(TraeMediaPlayer paramTraeMediaPlayer) {}
  
  public void run()
  {
    if (TraeMediaPlayer.access$000(this.this$0) != null)
    {
      if (QLog.isColorLevel()) {
        QLog.e("TRAE", 0, "TraeMediaPlay | play timeout");
      }
      if (TraeMediaPlayer.access$100(this.this$0) != null) {
        TraeMediaPlayer.access$100(this.this$0).onCompletion();
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\sharp\jni\TraeMediaPlayer$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */