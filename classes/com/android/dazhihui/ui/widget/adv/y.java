package com.android.dazhihui.ui.widget.adv;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;

class y
  extends Thread
{
  private y(GifView paramGifView) {}
  
  public void run()
  {
    if (GifView.access$100(this.a) == null) {}
    label11:
    label154:
    for (;;)
    {
      return;
      Object localObject;
      GifView.access$502(this.a, ((aa)localObject).a);
      long l = ((aa)localObject).b;
      if (GifView.access$600(this.a) != null)
      {
        localObject = GifView.access$600(this.a).obtainMessage();
        ((Message)localObject).what = 100;
        GifView.access$600(this.a).sendMessage((Message)localObject);
        SystemClock.sleep(l);
        for (;;)
        {
          if (!GifView.access$200(this.a)) {
            break label154;
          }
          if (!GifView.access$300(this.a))
          {
            localObject = GifView.access$100(this.a).a(this.a.isCarousel);
            if (localObject != null) {
              break label11;
            }
            GifView.access$202(this.a, false);
            if (GifView.access$400(this.a) == null) {
              break;
            }
            GifView.access$400(this.a).callBack(true);
            return;
          }
          SystemClock.sleep(500L);
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\adv\y.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */