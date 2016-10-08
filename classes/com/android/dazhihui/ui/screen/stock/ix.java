package com.android.dazhihui.ui.screen.stock;

import android.os.Handler;
import android.os.Message;
import com.android.dazhihui.b.b;

class ix
  extends Handler
{
  ix(MessageCenterList paramMessageCenterList) {}
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      return;
    case 0: 
      b.a().b((byte)paramMessage.arg1);
      return;
    case 1: 
      MessageCenterList.p(this.a);
      return;
    case 2: 
      MessageCenterList.q(this.a);
      return;
    }
    MessageCenterList.r(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\ix.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */