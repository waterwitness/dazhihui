package com.android.dazhihui.ui.screen.stock;

import android.os.Handler;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.widget.LinearLayout;

class el
  implements View.OnLayoutChangeListener
{
  el(GUHDetailBZTJ paramGUHDetailBZTJ) {}
  
  public void onLayoutChange(View paramView, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8)
  {
    if ((paramInt4 > paramInt8) && (GUHDetailBZTJ.e(this.a).getVisibility() == 8))
    {
      if (GUHDetailBZTJ.f(this.a).booleanValue() == true) {
        GUHDetailBZTJ.a(this.a, Boolean.valueOf(false));
      }
    }
    else {
      return;
    }
    GUHDetailBZTJ.g(this.a).sendEmptyMessage(111);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\el.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */