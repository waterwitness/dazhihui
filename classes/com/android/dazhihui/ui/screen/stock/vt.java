package com.android.dazhihui.ui.screen.stock;

import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import com.android.dazhihui.ui.model.stock.SelfSelectedStockManager.SynchroType;

final class vt
  implements RadioGroup.OnCheckedChangeListener
{
  public void onCheckedChanged(RadioGroup paramRadioGroup, int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return;
    case 1: 
      SystemSetingScreen.a(SelfSelectedStockManager.SynchroType.LOCAL_COVER_SERVER);
      return;
    case 2: 
      SystemSetingScreen.a(SelfSelectedStockManager.SynchroType.SERVER_COVER_LOCAL);
      return;
    case 3: 
      SystemSetingScreen.a(SelfSelectedStockManager.SynchroType.LOCAL_MERGE_SERVER);
      return;
    }
    SystemSetingScreen.a(null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\vt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */