package com.android.dazhihui.ui.screen.stock;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

class sz
  extends Handler
{
  private WeakReference<sk> a;
  
  public sz(sk paramsk)
  {
    this.a = new WeakReference(paramsk);
  }
  
  public void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    switch (paramMessage.what)
    {
    }
    do
    {
      do
      {
        return;
      } while ((this.a.get() == null) || (sk.i((sk)this.a.get()) == null));
      sk.i((sk)this.a.get()).removeMessages(0);
      sk.j((sk)this.a.get());
      return;
    } while ((this.a.get() == null) || (sk.i((sk)this.a.get()) == null));
    sk.k((sk)this.a.get());
    sk.i((sk)this.a.get()).removeMessages(2);
    sk.i((sk)this.a.get()).sendEmptyMessageDelayed(2, 60000L);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\sz.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */