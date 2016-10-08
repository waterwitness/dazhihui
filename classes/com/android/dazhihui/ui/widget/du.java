package com.android.dazhihui.ui.widget;

import android.view.View;

class du
  implements Runnable
{
  du(GoldAnimation paramGoldAnimation) {}
  
  public void run()
  {
    GoldAnimation.d(this.a).startAnimation(GoldAnimation.c(this.a));
    GoldAnimation.d(this.a).setVisibility(0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\du.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */