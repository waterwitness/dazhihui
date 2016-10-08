package com.android.dazhihui.ui.screen.stock;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;

class oq
  implements View.OnClickListener
{
  oq(PlateListScreen paramPlateListScreen) {}
  
  public void onClick(View paramView)
  {
    if ((PlateListScreen.f(this.a) != null) && (PlateListScreen.f(this.a).getVisibility() == 0)) {
      PlateListScreen.f(this.a).setVisibility(8);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\oq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */