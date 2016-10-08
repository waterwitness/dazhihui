package com.tencent.qalsdk;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.Looper;
import com.tencent.qalsdk.util.QLog;
import java.util.concurrent.ConcurrentHashMap;

public class QALBroadcastReceiver
  extends BroadcastReceiver
{
  private static Handler mainHandler = new Handler(Looper.getMainLooper());
  public static final String tag = "QALBroadcastReceiver";
  
  public void onReceive(Context paramContext, Intent paramIntent)
  {
    if ((paramContext == null) || (paramIntent == null))
    {
      QLog.e("QALBroadcastReceiver", "context or intent null");
      return;
    }
    paramContext = paramIntent.getByteArrayExtra("offlineMsgContent");
    String str = paramIntent.getStringExtra("offlineMsgID");
    paramIntent = paramIntent.getStringExtra("offlineMsgCmd");
    QLog.d("QALBroadcastReceiver", "userid:" + str + " cmd:" + paramIntent);
    Object localObject = QALSDKManager.getInstance().getOffLinePushListener();
    if (((ConcurrentHashMap)localObject).containsKey(paramIntent))
    {
      localObject = (QALOfflinePushListener)((ConcurrentHashMap)localObject).get(paramIntent);
      if (localObject == null)
      {
        QLog.i("QALBroadcastReceiver", paramIntent + " listener null");
        return;
      }
      mainHandler.post(new a(this, str, paramIntent, paramContext, (QALOfflinePushListener)localObject));
      return;
    }
    QLog.d("QALBroadcastReceiver", 2, "offline push come,no callback ");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\qalsdk\QALBroadcastReceiver.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */