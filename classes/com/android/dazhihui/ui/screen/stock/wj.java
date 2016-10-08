package com.android.dazhihui.ui.screen.stock;

import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.android.dazhihui.c.a.d;

class wj
  implements CompoundButton.OnCheckedChangeListener
{
  wj(SystemSetingScreen paramSystemSetingScreen) {}
  
  public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      SystemSetingScreen.c(this.a).a("show_user_avatar_by_wifi", 1);
      SystemSetingScreen.c(this.a).g();
      return;
    }
    SystemSetingScreen.c(this.a).a("show_user_avatar_by_wifi", 0);
    SystemSetingScreen.c(this.a).g();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\wj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */