package com.android.dazhihui.ui.widget;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.ui.screen.stock.MessageWarnScreen;

class hp
  implements View.OnClickListener
{
  hp(ho paramho) {}
  
  public void onClick(View paramView)
  {
    paramView = new Intent(ho.a(this.a), MessageWarnScreen.class);
    ho.a(this.a).startActivity(paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\hp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */