package com.android.dazhihui.ui.screen.stock;

import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.widget.CompoundButton;
import android.widget.CompoundButton.OnCheckedChangeListener;
import com.android.dazhihui.d.n;
import java.util.ArrayList;
import java.util.Iterator;

class we
  implements CompoundButton.OnCheckedChangeListener
{
  we(SystemSetingScreen paramSystemSetingScreen) {}
  
  public void onCheckedChanged(CompoundButton paramCompoundButton, boolean paramBoolean)
  {
    paramCompoundButton = this.a.getSharedPreferences("DzhPush", 0);
    if (paramBoolean)
    {
      n.a("", 20268);
      paramCompoundButton.edit().putBoolean("isShowHotVide", true).commit();
      if ((SystemSetingScreen.c != null) && (SystemSetingScreen.c.size() > 0))
      {
        paramCompoundButton = SystemSetingScreen.c.iterator();
        while (paramCompoundButton.hasNext()) {
          ((wl)paramCompoundButton.next()).a(true, 0);
        }
      }
    }
    else
    {
      n.a("", 20269);
      paramCompoundButton.edit().putBoolean("isShowHotVide", false).commit();
      if ((SystemSetingScreen.c != null) && (SystemSetingScreen.c.size() > 0))
      {
        paramCompoundButton = SystemSetingScreen.c.iterator();
        while (paramCompoundButton.hasNext()) {
          ((wl)paramCompoundButton.next()).a(false, 0);
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\we.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */