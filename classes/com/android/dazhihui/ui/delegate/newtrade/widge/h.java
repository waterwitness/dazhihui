package com.android.dazhihui.ui.delegate.newtrade.widge;

import android.os.Handler;
import android.os.Message;

class h
  extends Handler
{
  h(MyScrollView paramMyScrollView) {}
  
  public void handleMessage(Message paramMessage)
  {
    int i = this.a.getScrollY();
    if (MyScrollView.a(this.a) != i)
    {
      MyScrollView.a(this.a, i);
      MyScrollView.b(this.a).sendMessageDelayed(MyScrollView.b(this.a).obtainMessage(), 5L);
    }
    if (MyScrollView.c(this.a) != null) {
      MyScrollView.c(this.a).a(i);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\newtrade\widge\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */