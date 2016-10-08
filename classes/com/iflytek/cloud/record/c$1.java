package com.iflytek.cloud.record;

import android.media.AudioManager.OnAudioFocusChangeListener;
import com.iflytek.thirdparty.X;

class c$1
  implements AudioManager.OnAudioFocusChangeListener
{
  c$1(c paramc) {}
  
  public void onAudioFocusChange(int paramInt)
  {
    if ((paramInt == -2) || (paramInt == -3) || (paramInt == -1))
    {
      X.a("PcmPlayer", "pause start");
      if (this.a.c())
      {
        X.a("PcmPlayer", "pause success");
        c.a(this.a, true);
        if (c.a(this.a) != null) {
          c.a(this.a).a();
        }
      }
    }
    label72:
    do
    {
      do
      {
        do
        {
          break label72;
          do
          {
            return;
          } while (paramInt != 1);
          X.a("PcmPlayer", "resume start");
        } while (!c.b(this.a));
        c.a(this.a, false);
      } while (!this.a.d());
      X.a("PcmPlayer", "resume success");
    } while (c.a(this.a) == null);
    c.a(this.a).b();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\record\c$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */