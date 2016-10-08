package com.android.dazhihui.ui.screen.stock.klineindicator;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;

class p
  implements View.OnClickListener
{
  p(o paramo) {}
  
  public void onClick(View paramView)
  {
    int i = ((Integer)paramView.getTag()).intValue();
    paramView = (String)SettingKlineIndicator.c(this.a.a).get(i);
    this.a.a.a(paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\klineindicator\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */