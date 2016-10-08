package com.android.dazhihui.d;

import android.app.Activity;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;
import com.android.dazhihui.ui.screen.BrowserActivity;
import com.android.dazhihui.ui.screen.stock.MainScreen;

final class ao
  implements View.OnClickListener
{
  ao(Activity paramActivity, PopupWindow paramPopupWindow) {}
  
  public void onClick(View paramView)
  {
    if (this.a != null)
    {
      if (!(this.a instanceof MainScreen)) {
        break label53;
      }
      ((MainScreen)this.a).a(0);
    }
    for (;;)
    {
      if ((this.b != null) && (this.b.isShowing())) {
        this.b.dismiss();
      }
      return;
      label53:
      if ((this.a instanceof BrowserActivity)) {
        ((BrowserActivity)this.a).doneUpLoadImg(0);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\d\ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */