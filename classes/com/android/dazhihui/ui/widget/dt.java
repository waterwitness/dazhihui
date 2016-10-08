package com.android.dazhihui.ui.widget;

import android.view.View;

class dt
  implements Runnable
{
  dt(GoldAnimation paramGoldAnimation) {}
  
  public void run()
  {
    GoldAnimation.b(this.a).startAnimation(GoldAnimation.a(this.a));
    GoldAnimation.b(this.a).setVisibility(0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\dt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */