package com.android.dazhihui.ui.delegate.screen.fund;

import com.android.dazhihui.ui.widget.TableLayoutGroup;
import com.android.dazhihui.ui.widget.lz;

class j
  implements lz
{
  j(ETFFundCancel paramETFFundCancel) {}
  
  public void a()
  {
    ETFFundCancel.a(this.a, 20);
    ETFFundCancel.b(this.a, 0);
    ETFFundCancel.a(this.a, false);
  }
  
  public void a(int paramInt)
  {
    if (paramInt >= ETFFundCancel.a(this.a)) {
      ETFFundCancel.b(this.a).d();
    }
    for (;;)
    {
      ETFFundCancel.a(this.a, false);
      return;
      ETFFundCancel.a(this.a, 10);
      ETFFundCancel.b(this.a, paramInt);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */