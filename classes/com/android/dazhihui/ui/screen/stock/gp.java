package com.android.dazhihui.ui.screen.stock;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class gp
  implements View.OnClickListener
{
  gp(go paramgo) {}
  
  public void onClick(View paramView)
  {
    paramView = new Intent(this.a.getActivity(), LoginMainScreen.class);
    paramView.putExtra("REGISTER_FROM_TYPE", "FROM_STOCK");
    this.a.getContext().startActivity(paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\gp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */