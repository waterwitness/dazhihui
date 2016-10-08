package com.android.dazhihui.ui.widget;

import android.view.View;

class jh
  implements Runnable
{
  jh(NewsTabPageIndicator paramNewsTabPageIndicator, View paramView) {}
  
  public void run()
  {
    int i = this.a.getLeft();
    int j = (this.b.getWidth() - this.a.getWidth()) / 2;
    this.b.smoothScrollTo(i - j, 0);
    NewsTabPageIndicator.a(this.b, null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\jh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */