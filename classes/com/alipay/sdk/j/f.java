package com.alipay.sdk.j;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.alipay.b.a.b;

final class f
  implements ServiceConnection
{
  f(d paramd) {}
  
  public final void onServiceConnected(ComponentName arg1, IBinder paramIBinder)
  {
    synchronized (d.a(this.a))
    {
      d.a(this.a, b.a(paramIBinder));
      d.a(this.a).notify();
      return;
    }
  }
  
  public final void onServiceDisconnected(ComponentName paramComponentName)
  {
    d.a(this.a, null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\sdk\j\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */