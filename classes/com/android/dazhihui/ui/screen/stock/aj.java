package com.android.dazhihui.ui.screen.stock;

import android.os.Handler;
import android.os.Message;
import android.widget.LinearLayout;

class aj
  extends Handler
{
  aj(v paramv) {}
  
  public void handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 111) {
      v.b(this.a).setVisibility(0);
    }
    do
    {
      return;
      if (paramMessage.what == 333)
      {
        this.a.b(2);
        return;
      }
    } while (paramMessage.what != 222);
    v.c(this.a).setVisibility(0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */