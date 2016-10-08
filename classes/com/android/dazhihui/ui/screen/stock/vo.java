package com.android.dazhihui.ui.screen.stock;

import android.os.Handler;
import android.os.Message;

class vo
  extends Handler
{
  vo(uv paramuv) {}
  
  public void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    switch (paramMessage.what)
    {
    default: 
      return;
    case 0: 
      uv.g(this.a);
      return;
    case 1: 
      uv.h(this.a);
      return;
    case 2: 
      uv.i(this.a);
      return;
    case 3: 
      uv.j(this.a);
      return;
    case 4: 
      this.a.j();
      return;
    case 126: 
      this.a.a(120, 20);
      return;
    case 120: 
      this.a.a(124, 19);
      return;
    case 124: 
      this.a.a(118, 18);
      return;
    case 118: 
      this.a.a(122, 17);
      return;
    }
    this.a.a(116, 16);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\vo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */