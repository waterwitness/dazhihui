package com.android.dazhihui.ui.model;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Handler;
import android.os.Process;
import com.android.dazhihui.DzhApplication;
import com.android.dazhihui.d.d;
import java.text.SimpleDateFormat;
import java.util.Date;

public class CrashHandler
  implements Thread.UncaughtExceptionHandler
{
  private Context ba;
  private Handler mQuitHandler;
  
  public CrashHandler(Context paramContext)
  {
    this.ba = paramContext;
  }
  
  public static String toString(StackTraceElement[] paramArrayOfStackTraceElement)
  {
    if (paramArrayOfStackTraceElement == null) {
      return "";
    }
    StringBuilder localStringBuilder = new StringBuilder();
    int j = paramArrayOfStackTraceElement.length;
    int i = 0;
    while (i < j)
    {
      localStringBuilder.append(paramArrayOfStackTraceElement[i].toString()).append("\n");
      i += 1;
    }
    return localStringBuilder.toString();
  }
  
  public void uncaughtException(Thread paramThread, Throwable paramThrowable)
  {
    paramThread = "\n" + paramThrowable.toString() + "\n" + toString(paramThrowable.getStackTrace());
    d.a(paramThread);
    paramThrowable.printStackTrace();
    Object localObject = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date());
    paramThrowable = this.ba.getSharedPreferences("BugFile", 0);
    paramThrowable.edit().putString("bugInfo", paramThread).commit();
    paramThrowable.edit().putString("bugTime", (String)localObject).commit();
    long l1 = paramThrowable.getLong("bugLongTime", 0L);
    long l2 = System.currentTimeMillis();
    if (l2 - l1 > 60000L)
    {
      localObject = new Intent();
      ((Intent)localObject).setClassName(this.ba.getPackageName(), "com.android.dazhihui.ui.screen.stock.CrashErrorActivity");
      ((Intent)localObject).putExtra("errorMsg", paramThread);
      paramThread = PendingIntent.getActivity(this.ba, -1, (Intent)localObject, 268435456);
      ((AlarmManager)this.ba.getSystemService("alarm")).set(1, System.currentTimeMillis() + 1000L, paramThread);
    }
    paramThrowable.edit().putLong("bugLongTime", l2).commit();
    try
    {
      paramThread = DzhApplication.a();
      if (paramThread != null) {
        paramThread.i();
      }
    }
    catch (Exception paramThread)
    {
      for (;;)
      {
        paramThread.printStackTrace();
      }
    }
    Process.killProcess(Process.myPid());
    System.exit(0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\CrashHandler.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */