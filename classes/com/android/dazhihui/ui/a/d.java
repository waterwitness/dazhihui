package com.android.dazhihui.ui.a;

import android.os.Handler;
import android.os.Message;
import java.lang.ref.WeakReference;

class d
  extends Handler
{
  private WeakReference<a> a;
  
  public d(a parama)
  {
    this.a = new WeakReference(parama);
  }
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    }
    do
    {
      return;
    } while ((this.a == null) || (this.a.get() == null));
    ((a)this.a.get()).a(499, true);
    ((a)this.a.get()).a(109, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */