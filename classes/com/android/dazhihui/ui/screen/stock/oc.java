package com.android.dazhihui.ui.screen.stock;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

class oc
  extends Handler
{
  private boolean a = false;
  private long b;
  private WeakReference<nz> c;
  
  public oc(nz paramnz, int paramInt)
  {
    this.c = new WeakReference(paramnz);
    this.b = paramInt;
  }
  
  private void c()
  {
    removeMessages(0);
    sendMessageDelayed(obtainMessage(0), this.b);
  }
  
  private boolean d()
  {
    if (this.c.get() != null)
    {
      ((nz)this.c.get()).refresh();
      return true;
    }
    return false;
  }
  
  public void a()
  {
    this.a = true;
    removeMessages(0);
  }
  
  public void b()
  {
    this.a = false;
    removeMessages(0);
    sendMessage(obtainMessage(0));
  }
  
  public void handleMessage(Message paramMessage)
  {
    if ((!this.a) && (d())) {
      c();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\oc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */