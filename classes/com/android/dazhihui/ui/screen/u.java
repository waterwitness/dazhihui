package com.android.dazhihui.ui.screen;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ViewFlipper;

class u
  implements View.OnClickListener
{
  u(InitScreen paramInitScreen) {}
  
  public void onClick(View paramView)
  {
    InitScreen.b(this.a).removeCallbacks(InitScreen.f(this.a));
    InitScreen.g(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */