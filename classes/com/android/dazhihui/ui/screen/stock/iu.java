package com.android.dazhihui.ui.screen.stock;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class iu
  implements View.OnClickListener
{
  iu(MessageCenterList paramMessageCenterList) {}
  
  public void onClick(View paramView)
  {
    paramView = new Intent(this.a, MessageCenterSettingScreen.class);
    this.a.startActivity(paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\iu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */