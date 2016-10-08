package com.android.dazhihui.ui.screen.stock;

import android.app.AlertDialog;
import android.app.AlertDialog.Builder;
import android.view.View;
import android.view.View.OnLongClickListener;

class xp
  implements View.OnLongClickListener
{
  xp(ZoomImageScreen paramZoomImageScreen, AlertDialog.Builder paramBuilder) {}
  
  public boolean onLongClick(View paramView)
  {
    if (this.b.a == null)
    {
      this.b.a = this.a.show();
      this.b.a.setCanceledOnTouchOutside(true);
    }
    for (;;)
    {
      return false;
      this.b.a.show();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\xp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */