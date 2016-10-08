package com.android.dazhihui.ui.screen.stock;

import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.model.stock.LeftMenuVo.LeftMenuItem;

class vs
  implements View.OnClickListener
{
  vs(SystemSetingScreen paramSystemSetingScreen, LeftMenuVo.LeftMenuItem paramLeftMenuItem) {}
  
  public void onClick(View paramView)
  {
    r.a(this.a.getCallurl(), this.b, "", null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\vs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */