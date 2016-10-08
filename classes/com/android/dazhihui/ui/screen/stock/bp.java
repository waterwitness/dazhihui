package com.android.dazhihui.ui.screen.stock;

import android.app.Dialog;
import com.android.dazhihui.b;
import com.android.dazhihui.c;

class bp
  implements b
{
  bp(FingerprintLoginScreen paramFingerprintLoginScreen) {}
  
  public void loginStatusChange(c paramc)
  {
    if (paramc == c.b)
    {
      this.a.getLoadingDialog().dismiss();
      if (this.a.g)
      {
        this.a.f = false;
        this.a.finish();
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\bp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */