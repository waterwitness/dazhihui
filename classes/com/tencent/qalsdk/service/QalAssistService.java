package com.tencent.qalsdk.service;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import com.tencent.qalsdk.util.QLog;

public class QalAssistService
  extends Service
{
  private static final String TAG = "QalAssistService";
  
  public IBinder onBind(Intent paramIntent)
  {
    QLog.i("QalAssistService", "onBind");
    return new QalAssistService.a(this);
  }
  
  public void onDestroy()
  {
    super.onDestroy();
    QLog.i("QalAssistService", "onDestroy");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\qalsdk\service\QalAssistService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */