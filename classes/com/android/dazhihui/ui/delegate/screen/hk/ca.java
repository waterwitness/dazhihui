package com.android.dazhihui.ui.delegate.screen.hk;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;

class ca
  implements View.OnClickListener
{
  ca(bz parambz, CheckBox paramCheckBox) {}
  
  public void onClick(View paramView)
  {
    SharedPreferences.Editor localEditor = PreferenceManager.getDefaultSharedPreferences(bz.a(this.b)).edit();
    if (!this.a.isChecked()) {}
    for (boolean bool = true;; bool = false)
    {
      localEditor.putBoolean("HK_SETTING_SHOW_TIP", bool);
      localEditor.commit();
      if (bz.b(this.b) != null) {
        bz.b(this.b).onClick(paramView);
      }
      this.b.dismiss();
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\ca.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */