package com.android.dazhihui.ui.widget;

import android.view.View;

class ej
  implements Runnable
{
  ej(IlvbTabPageIndicator paramIlvbTabPageIndicator, View paramView) {}
  
  public void run()
  {
    int i = this.a.getLeft();
    int j = (this.b.getWidth() - this.a.getWidth()) / 2;
    this.b.smoothScrollTo(i - j, 0);
    IlvbTabPageIndicator.a(this.b, null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\ej.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */