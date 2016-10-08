package com.android.dazhihui.ui.screen.stock;

import android.app.AlertDialog;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;

class hr
  implements View.OnClickListener
{
  hr(MainScreen paramMainScreen, CheckBox paramCheckBox) {}
  
  public void onClick(View paramView)
  {
    if (MainScreen.g(this.b) != null) {
      MainScreen.g(this.b).dismiss();
    }
    MainScreen.b(this.b, this.a.isChecked());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\hr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */