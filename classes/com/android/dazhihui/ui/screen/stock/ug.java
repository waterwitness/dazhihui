package com.android.dazhihui.ui.screen.stock;

import android.os.Handler;
import android.os.Message;
import android.widget.TextView;

class ug
  extends Handler
{
  ug(SettingThirdScreen paramSettingThirdScreen) {}
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    }
    do
    {
      return;
    } while (paramMessage.obj == null);
    SettingThirdScreen.a(this.a).setText((String)paramMessage.obj);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ug.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */