package com.android.dazhihui.ui.delegate.screen.margin;

import android.widget.PopupWindow.OnDismissListener;
import com.android.dazhihui.ui.widget.TableLayoutGroup;

class k
  implements PopupWindow.OnDismissListener
{
  k(h paramh) {}
  
  public void onDismiss()
  {
    if (this.a.c != 0)
    {
      h.a(this.a).a(0, -this.a.c);
      this.a.c = 0;
    }
    h.a(this.a).invalidate();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\margin\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */