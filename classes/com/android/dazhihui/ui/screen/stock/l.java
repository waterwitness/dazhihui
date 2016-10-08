package com.android.dazhihui.ui.screen.stock;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ViewFlipper;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvItem;
import com.android.dazhihui.ui.model.stock.AdvertVo.AdvertBitmap;

class l
  implements View.OnClickListener
{
  l(AppRestoreAdvertScreen paramAppRestoreAdvertScreen) {}
  
  public void onClick(View paramView)
  {
    String str;
    if (AppRestoreAdvertScreen.a(this.a) != null)
    {
      paramView = AppRestoreAdvertScreen.a(this.a).advItem.callurl;
      str = AppRestoreAdvertScreen.a(this.a).advItem.countid;
      if ((paramView != null) && (!paramView.isEmpty()) && (!paramView.equals("0"))) {}
    }
    else
    {
      return;
    }
    AppRestoreAdvertScreen.a(0);
    AppRestoreAdvertScreen.c(this.a).removeCallbacks(AppRestoreAdvertScreen.b(this.a));
    r.a(paramView, this.a, str, null);
    this.a.finish();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */