package com.android.dazhihui.ui.screen;

import android.widget.TextView;

class v
  implements Runnable
{
  v(InitScreen paramInitScreen) {}
  
  public void run()
  {
    InitScreen.a(this.a, InitScreen.h(this.a) - 1);
    if (InitScreen.h(this.a) == 0) {
      return;
    }
    InitScreen.i(this.a).setText(String.valueOf(InitScreen.h(this.a)));
    InitScreen.i(this.a).postDelayed(this, 1000L);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */