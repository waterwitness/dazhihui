package com.android.dazhihui.ui.screen.stock;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

class fo
  extends Handler
{
  private WeakReference<eu> a;
  
  public fo(eu parameu)
  {
    this.a = new WeakReference(parameu);
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
      } while ((this.a.get() == null) || (eu.j((eu)this.a.get()) == null));
      eu.j((eu)this.a.get()).removeMessages(0);
      eu.l((eu)this.a.get());
      return;
    } while ((this.a.get() == null) || (eu.j((eu)this.a.get()) == null));
    eu.m((eu)this.a.get());
    eu.j((eu)this.a.get()).removeMessages(2);
    eu.j((eu)this.a.get()).sendEmptyMessageDelayed(2, 60000L);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\fo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */