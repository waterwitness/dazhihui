package com.android.dazhihui;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.util.Log;
import com.android.dazhihui.service.x;
import com.android.dazhihui.service.z;

class a
  implements ServiceConnection
{
  a(DzhApplication paramDzhApplication) {}
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    Log.i(DzhApplication.j(), "called onServiceConnected()");
    DzhApplication.a(this.a, new x(z.a(paramIBinder)));
    this.a.f();
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    Log.i(DzhApplication.j(), "called onServiceDisconnected()");
    this.a.g();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */