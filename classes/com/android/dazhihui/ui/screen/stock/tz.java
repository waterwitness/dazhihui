package com.android.dazhihui.ui.screen.stock;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

class tz
  implements View.OnClickListener
{
  tz(ti paramti) {}
  
  public void onClick(View paramView)
  {
    paramView = new EditText(this.a.getActivity());
    paramView.setText("http://");
    paramView = new AlertDialog.Builder(this.a.getActivity()).setTitle("输入网址:").setView(paramView).setPositiveButton(17039370, new ua(this, paramView)).create();
    paramView.setCancelable(true);
    paramView.setCanceledOnTouchOutside(true);
    paramView.show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\tz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */