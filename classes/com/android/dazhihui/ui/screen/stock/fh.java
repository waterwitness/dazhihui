package com.android.dazhihui.ui.screen.stock;

import com.android.dazhihui.service.DzhPushService;
import com.android.dazhihui.ui.widget.HotVideoViewFlow;
import com.android.dazhihui.ui.widget.IndexTopLayout;

class fh
  implements wl
{
  fh(eu parameu) {}
  
  public void a(boolean paramBoolean, int paramInt)
  {
    if (!paramBoolean)
    {
      DzhPushService.e();
      if (eu.b(this.a) != null) {
        eu.b(this.a).setVisibility(8);
      }
      if (eu.c(this.a) != null) {
        eu.c(this.a).a(false);
      }
      return;
    }
    DzhPushService.d();
    this.a.recevierData();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\fh.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */