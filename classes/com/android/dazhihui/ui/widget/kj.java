package com.android.dazhihui.ui.widget;

import android.graphics.RectF;
import android.os.Handler;

class kj
  implements Runnable
{
  kj(ScrollButton paramScrollButton) {}
  
  public void run()
  {
    for (;;)
    {
      try
      {
        if (ScrollButton.a(this.a).left <= ScrollButton.b(this.a).left) {
          break label136;
        }
        float f = ScrollButton.b(this.a).width() / 2.0F;
        if (f / 20.0F > ScrollButton.a(this.a).left - ScrollButton.b(this.a).left)
        {
          f = ScrollButton.a(this.a).left - ScrollButton.b(this.a).left;
          ScrollButton.a(this.a).offset(-f, 0.0F);
          ScrollButton.c(this.a).sendEmptyMessage(0);
          Thread.sleep(10L);
          continue;
        }
        f /= 20.0F;
      }
      catch (InterruptedException localInterruptedException)
      {
        localInterruptedException.printStackTrace();
        return;
      }
      continue;
      label136:
      if (ScrollButton.a(this.a).left == ScrollButton.b(this.a).left)
      {
        ScrollButton.a(this.a, false);
        return;
      }
      ScrollButton.a(this.a).set(ScrollButton.b(this.a).left, ScrollButton.a(this.a).top, ScrollButton.b(this.a).left + ScrollButton.a(this.a).width(), ScrollButton.a(this.a).bottom);
      ScrollButton.c(this.a).sendEmptyMessage(0);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\kj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */