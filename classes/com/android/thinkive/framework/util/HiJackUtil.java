package com.android.thinkive.framework.util;

import android.app.ActivityManager;
import android.app.ActivityManager.RunningTaskInfo;
import android.content.ComponentName;
import android.content.Context;
import android.widget.Toast;
import java.util.List;

public class HiJackUtil
{
  private static void checkHijack(String paramString, Context paramContext)
  {
    Log.e("topPkgName = " + paramString);
    if (!paramContext.getPackageName().contains(paramString)) {
      showWarning(paramContext);
    }
  }
  
  public static void checkRisk(Context paramContext)
  {
    checkHijack(getTopActivityName(paramContext), paramContext);
  }
  
  private static String getTopActivityName(Context paramContext)
  {
    return ((ActivityManager.RunningTaskInfo)((ActivityManager)paramContext.getSystemService("activity")).getRunningTasks(1).get(0)).topActivity.getPackageName();
  }
  
  private static void showWarning(Context paramContext)
  {
    paramContext = Toast.makeText(paramContext, "疑似非本应用界面，请小心使用！", 1);
    paramContext.setGravity(17, 0, 0);
    paramContext.show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\util\HiJackUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */