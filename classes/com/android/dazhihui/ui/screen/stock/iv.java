package com.android.dazhihui.ui.screen.stock;

import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;

class iv
  implements View.OnClickListener
{
  iv(MessageCenterList paramMessageCenterList) {}
  
  public void onClick(View paramView)
  {
    paramView = new Intent(this.a, MessageWarnScreen.class);
    this.a.startActivity(paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\iv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */