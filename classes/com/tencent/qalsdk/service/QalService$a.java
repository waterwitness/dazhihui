package com.tencent.qalsdk.service;

import android.app.Notification;
import android.app.Service;
import android.content.ComponentName;
import android.content.ServiceConnection;
import android.os.IBinder;
import com.tencent.qalsdk.util.QLog;

class QalService$a
  implements ServiceConnection
{
  private QalService$a(QalService paramQalService) {}
  
  public void onServiceConnected(ComponentName paramComponentName, IBinder paramIBinder)
  {
    QLog.i("QalService", "Assist onServiceConnected");
    paramComponentName = ((QalAssistService.a)paramIBinder).a();
    if (paramComponentName != null)
    {
      this.a.startForeground(537046243, new Notification());
      paramComponentName.startForeground(537046243, new Notification());
      paramComponentName.stopForeground(true);
    }
    this.a.unbindService(QalService.access$100(this.a));
    QalService.access$102(this.a, null);
  }
  
  public void onServiceDisconnected(ComponentName paramComponentName)
  {
    QLog.i("QalService", "Assist onServiceDisconnected");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\qalsdk\service\QalService$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */