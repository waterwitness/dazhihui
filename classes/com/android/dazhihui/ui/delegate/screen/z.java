package com.android.dazhihui.ui.delegate.screen;

import android.app.Dialog;
import android.os.Handler;
import android.os.Message;

class z
  extends Handler
{
  z(DelegateBaseActivity paramDelegateBaseActivity) {}
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    }
    for (;;)
    {
      super.handleMessage(paramMessage);
      return;
      if ((!this.a.isFinishing()) && (!this.a.getLoadingDialog().isShowing()))
      {
        this.a.getLoadingDialog().show();
        continue;
        if ((!this.a.isFinishing()) && (this.a.getLoadingDialog().isShowing())) {
          this.a.getLoadingDialog().dismiss();
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */