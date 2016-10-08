package com.android.dazhihui.ui.screen.stock;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.g;

class wg
  implements CompoundButton.OnCheckedChangeListener
{
  wg(SystemSetingScreen paramSystemSetingScreen) {}
  
  public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    if (paramBoolean) {
      SystemSetingScreen.b(this.a).n(1);
    }
    for (;;)
    {
      SystemSetingScreen.c(this.a).a("SCREEN_ON_OR_OFF", SystemSetingScreen.b(this.a).aj());
      SystemSetingScreen.c(this.a).g();
      SystemSetingScreen.b(this.a).a(this.a);
      return;
      SystemSetingScreen.b(this.a).n(0);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\wg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */