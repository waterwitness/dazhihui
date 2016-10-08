package com.baidu.location;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.Message;
import android.os.Messenger;
import android.util.Log;

class o
  implements ServiceConnection
{
  o(h paramh) {}
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    h.a(this.a, new Messenger(paramIBinder));
    if (h.a(this.a) == null) {}
    for (;;)
    {
      return;
      h.a(this.a, true);
      Log.d("baidu_location_client", "baidu location connected ...");
      if (h.b(this.a))
      {
        h.c(this.a).obtainMessage(2).sendToTarget();
        return;
      }
      try
      {
        paramComponentName = Message.obtain(null, 11);
        paramComponentName.replyTo = h.d(this.a);
        paramComponentName.setData(h.e(this.a));
        h.a(this.a).send(paramComponentName);
        h.a(this.a, true);
        if (h.f(this.a) != null)
        {
          if (h.g(this.a).booleanValue()) {}
          h.c(this.a).obtainMessage(4).sendToTarget();
          return;
        }
      }
      catch (Exception paramComponentName) {}
    }
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    h.a(this.a, null);
    h.a(this.a, false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\baidu\location\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */