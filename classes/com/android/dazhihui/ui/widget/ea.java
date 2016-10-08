package com.android.dazhihui.ui.widget;

import android.graphics.drawable.Drawable;
import com.android.dazhihui.g;

class ea
  implements Runnable
{
  ea(HotVideoViewFlow paramHotVideoViewFlow) {}
  
  public void run()
  {
    HotVideoViewFlow.a(this.a, this.a.getWidth());
    this.a.scrollTo(-(g.a().m() - HotVideoViewFlow.a(this.a).getMinimumWidth()), 0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\ea.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */