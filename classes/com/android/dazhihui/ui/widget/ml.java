package com.android.dazhihui.ui.widget;

import android.os.Handler;
import android.os.Handler.Callback;
import android.os.Message;

class ml
  implements Handler.Callback
{
  ml(ThumbUpAnimationView paramThumbUpAnimationView) {}
  
  public boolean handleMessage(Message paramMessage)
  {
    if ((this.a.c != null) && (this.a.c.isAlive())) {
      this.a.c.a(1, false);
    }
    if (ThumbUpAnimationView.e(this.a) > 0) {
      ThumbUpAnimationView.f(this.a).sendEmptyMessageDelayed(0, 200L);
    }
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\ml.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */