package com.android.dazhihui.ui.screen.stock;

import android.os.Handler;
import android.os.Message;
import android.widget.EditText;
import android.widget.LinearLayout;

class ek
  extends Handler
{
  ek(GUHDetailBZTJ paramGUHDetailBZTJ) {}
  
  public void handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 111) {}
    while (paramMessage.what != 222) {
      return;
    }
    GUHDetailBZTJ.c(this.a).requestFocus();
    GUHDetailBZTJ.d(this.a).setVisibility(0);
    GUHDetailBZTJ.e(this.a).setVisibility(0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ek.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */