package com.android.dazhihui.ui.screen.stock;

import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnTouchListener;
import com.android.dazhihui.ui.widget.gw;

class rr
  implements View.OnTouchListener
{
  rr(SearchStockScreen paramSearchStockScreen) {}
  
  public boolean onTouch(View paramView, MotionEvent paramMotionEvent)
  {
    SearchStockScreen.b(this.a).a();
    SearchStockScreen.b(this.a).c();
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\rr.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */