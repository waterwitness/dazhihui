package com.android.dazhihui.ui.screen.stock.offlinecapital;

import android.view.View;
import android.view.View.OnClickListener;
import java.util.ArrayList;

class ac
  implements View.OnClickListener
{
  ac(ab paramab) {}
  
  public void onClick(View paramView)
  {
    int i = ((Integer)paramView.getTag()).intValue();
    OfflineCapitalSettingActivity.a(this.a.a).remove(i);
    this.a.a.h.notifyDataSetChanged();
    OfflineCapitalSettingActivity.b(this.a.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\offlinecapital\ac.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */