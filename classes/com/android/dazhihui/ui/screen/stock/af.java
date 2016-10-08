package com.android.dazhihui.ui.screen.stock;

import android.app.AlertDialog;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class af
  implements View.OnClickListener
{
  af(v paramv) {}
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
      return;
    case 2131558581: 
      this.a.a.cancel();
      return;
    }
    paramView = new Intent(this.a.getActivity(), LoginMainScreen.class);
    paramView.putExtra("REGISTER_FROM_TYPE", "FROM_STOCK");
    this.a.startActivity(paramView);
    this.a.a.cancel();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\af.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */