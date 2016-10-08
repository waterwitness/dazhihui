package com.android.dazhihui.ui.screen.stock;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

class ip
  implements View.OnClickListener
{
  ip(MaxNineScreen paramMaxNineScreen, EditText paramEditText) {}
  
  public void onClick(View paramView)
  {
    if (this.a.getText() != null) {}
    try
    {
      int i = Integer.parseInt(this.a.getText().toString());
      paramView = new Bundle();
      paramView.putInt("PCODE", i);
      this.b.startActivity(AdvertSearchActivity.class, paramView);
      return;
    }
    catch (Exception paramView) {}
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ip.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */