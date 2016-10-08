package com.android.dazhihui.ui.widget;

import android.view.View;

class ll
  implements Runnable
{
  ll(TabPageIndicator paramTabPageIndicator, View paramView) {}
  
  public void run()
  {
    int i = this.a.getLeft();
    int j = (this.b.getWidth() - this.a.getWidth()) / 2;
    this.b.smoothScrollTo(i - j, 0);
    TabPageIndicator.a(this.b, null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\ll.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */