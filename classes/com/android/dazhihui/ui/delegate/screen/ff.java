package com.android.dazhihui.ui.delegate.screen;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class ff
  implements View.OnClickListener
{
  ff(dy paramdy) {}
  
  public void onClick(View paramView)
  {
    com.android.dazhihui.ui.delegate.b.o.r = false;
    paramView = new Intent();
    paramView.setClass(this.a.getActivity(), EntrustSettingScreen.class);
    this.a.startActivity(paramView);
    dy.f(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\ff.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */