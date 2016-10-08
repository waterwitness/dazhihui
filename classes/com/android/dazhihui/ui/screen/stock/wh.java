package com.android.dazhihui.ui.screen.stock;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.android.dazhihui.c.a.d;
import com.android.dazhihui.g;

class wh
  implements CompoundButton.OnCheckedChangeListener
{
  wh(SystemSetingScreen paramSystemSetingScreen) {}
  
  public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    if (paramBoolean) {
      SystemSetingScreen.b(this.a).o(1);
    }
    for (;;)
    {
      SystemSetingScreen.c(this.a).a("MINE_MSG_FLAG", SystemSetingScreen.b(this.a).al());
      SystemSetingScreen.c(this.a).g();
      return;
      SystemSetingScreen.b(this.a).o(2);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\wh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */