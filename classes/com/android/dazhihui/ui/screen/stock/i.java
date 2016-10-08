package com.android.dazhihui.ui.screen.stock;

import android.os.Handler;
import android.os.Message;

class i
  extends Handler
{
  i(AddWarningActivity paramAddWarningActivity) {}
  
  public void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    this.a.a(paramMessage.what, (String)paramMessage.obj);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */