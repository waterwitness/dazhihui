package com.android.dazhihui.ui.screen.stock;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class mb
  implements View.OnClickListener
{
  mb(lp paramlp) {}
  
  public void onClick(View paramView)
  {
    paramView = new Intent(this.a.getActivity(), SearchStockScreen.class);
    this.a.startActivity(paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\mb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */