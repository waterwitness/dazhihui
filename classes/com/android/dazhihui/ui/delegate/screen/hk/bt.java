package com.android.dazhihui.ui.delegate.screen.hk;

import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ToggleButton;

class bt
  implements View.OnClickListener
{
  bt(HKSetting paramHKSetting) {}
  
  public void onClick(View paramView)
  {
    HKSetting.a(this.a).setChecked(false);
    new AlertDialog.Builder(this.a).setTitle("提示信息").setMessage("券商没有下发免责声明!").setPositiveButton("确定", new bu(this)).show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\bt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */