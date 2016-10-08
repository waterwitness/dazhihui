package com.android.dazhihui.ui.screen.stock;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import java.util.ArrayList;
import java.util.Iterator;

class wf
  implements CompoundButton.OnCheckedChangeListener
{
  wf(SystemSetingScreen paramSystemSetingScreen) {}
  
  public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    paramCompoundButton = this.a.getSharedPreferences("DzhPush", 0);
    if (paramBoolean)
    {
      paramCompoundButton.edit().putBoolean("isShowStockVide", true).commit();
      if ((SystemSetingScreen.c != null) && (SystemSetingScreen.c.size() > 0))
      {
        paramCompoundButton = SystemSetingScreen.c.iterator();
        while (paramCompoundButton.hasNext()) {
          ((wl)paramCompoundButton.next()).a(true, 1);
        }
      }
    }
    else
    {
      paramCompoundButton.edit().putBoolean("isShowStockVide", false).commit();
      if ((SystemSetingScreen.c != null) && (SystemSetingScreen.c.size() > 0))
      {
        paramCompoundButton = SystemSetingScreen.c.iterator();
        while (paramCompoundButton.hasNext()) {
          ((wl)paramCompoundButton.next()).a(false, 1);
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\wf.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */