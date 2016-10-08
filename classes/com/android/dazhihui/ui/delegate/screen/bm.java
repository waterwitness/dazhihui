package com.android.dazhihui.ui.delegate.screen;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.ui.a.e;

class bm
  implements View.OnClickListener
{
  bm(EntrustSettingScreen paramEntrustSettingScreen) {}
  
  public void onClick(View paramView)
  {
    paramView = new Bundle();
    Intent localIntent = new Intent();
    paramView.putBoolean("isaddqs", true);
    localIntent.putExtras(paramView);
    localIntent.setClass(this.a, TradeOutsideScreen.class);
    this.a.startActivity(localIntent);
    e.a().a(true);
    this.a.finish();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\bm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */