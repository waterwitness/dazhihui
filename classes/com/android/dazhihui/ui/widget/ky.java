package com.android.dazhihui.ui.widget;

import android.view.View;

class ky
  implements Runnable
{
  ky(StickyScrollView paramStickyScrollView) {}
  
  public void run()
  {
    if (StickyScrollView.a(this.a) != null)
    {
      int i = StickyScrollView.a(this.a, StickyScrollView.a(this.a));
      int j = StickyScrollView.b(this.a, StickyScrollView.a(this.a));
      int k = StickyScrollView.c(this.a, StickyScrollView.a(this.a));
      int m = (int)(this.a.getScrollY() + (StickyScrollView.a(this.a).getHeight() + StickyScrollView.b(this.a)));
      this.a.invalidate(i, j, k, m);
    }
    this.a.postDelayed(this, 16L);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\ky.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */