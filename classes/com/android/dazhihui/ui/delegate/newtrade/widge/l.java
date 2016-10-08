package com.android.dazhihui.ui.delegate.newtrade.widge;

import android.os.Handler.Callback;
import android.os.Message;

class l
  implements Handler.Callback
{
  l(UpdateHeaderView paramUpdateHeaderView) {}
  
  public boolean handleMessage(Message paramMessage)
  {
    if ((paramMessage.what == 0) && (UpdateHeaderView.a(this.a) != null)) {
      UpdateHeaderView.a(this.a).g();
    }
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\newtrade\widge\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */