package com.tencent.qalsdk.sdk;

import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.tencent.qalsdk.base.remote.IBaseService.Stub;
import com.tencent.qalsdk.util.QLog;

class ak
  implements ServiceConnection
{
  ak(aj paramaj) {}
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    if (QLog.isColorLevel()) {
      QLog.d("MSF.D.RemoteServiceProxy", 2, "threadID:" + Thread.currentThread().getId() + " onServiceConnected service:" + paramComponentName);
    }
    this.a.d = IBaseService.Stub.asInterface(paramIBinder);
    this.a.d();
    aj.a(this.a);
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    QLog.i("MSF.D.RemoteServiceProxy", 2, " onServiceDisconnected " + paramComponentName);
    this.a.d = null;
    aj.a(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\sdk\ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */