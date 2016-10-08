package com.android.dazhihui.ui.screen.stock;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class ep
  implements View.OnClickListener
{
  ep(GetAddressBookActivity paramGetAddressBookActivity) {}
  
  public void onClick(View paramView)
  {
    paramView = new Intent();
    paramView.setAction("android.intent.action.MAIN");
    paramView.setClassName("com.android.settings", "com.android.settings.ManageApplications");
    this.a.startActivity(paramView);
    this.a.finish();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ep.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */