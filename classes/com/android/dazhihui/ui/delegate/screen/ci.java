package com.android.dazhihui.ui.delegate.screen;

import android.os.Handler;
import android.os.Message;

class ci
  extends Handler
{
  ci(InitVerifedDongHai paramInitVerifedDongHai) {}
  
  public void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    InitVerifedDongHai.a(this.a);
    InitVerifedDongHai.a(this.a, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\ci.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */