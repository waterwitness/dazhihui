package com.android.dazhihui.ui.widget;

import android.widget.PopupWindow.OnDismissListener;

class cl
  implements PopupWindow.OnDismissListener
{
  cl(DzhHeader paramDzhHeader) {}
  
  public void onDismiss()
  {
    DzhHeader.b(this.a).a(DzhHeader.a(this.a).d, 2);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\cl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */