package com.android.dazhihui.ui.screen.stock;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.ui.delegate.screen.TradeOutsideScreen;

class xf
  implements View.OnClickListener
{
  xf(xe paramxe) {}
  
  public void onClick(View paramView)
  {
    paramView = new Bundle();
    Intent localIntent = new Intent();
    paramView.putInt("loginfragmentfalg", 1);
    paramView.putString("gotoFlag", null);
    paramView.putBoolean("haveNoLoginSorHaveOne", false);
    localIntent.putExtras(paramView);
    localIntent.setClass(this.a.getActivity(), TradeOutsideScreen.class);
    this.a.startActivity(localIntent);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\xf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */