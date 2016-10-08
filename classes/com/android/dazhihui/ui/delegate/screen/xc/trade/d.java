package com.android.dazhihui.ui.delegate.screen.xc.trade;

import android.widget.PopupWindow.OnDismissListener;
import com.android.dazhihui.ui.widget.TableLayoutGroup;

class d
  implements PopupWindow.OnDismissListener
{
  d(a parama) {}
  
  public void onDismiss()
  {
    if (this.a.c != 0)
    {
      a.a(this.a).a(0, -this.a.c);
      this.a.c = 0;
    }
    a.a(this.a).invalidate();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */