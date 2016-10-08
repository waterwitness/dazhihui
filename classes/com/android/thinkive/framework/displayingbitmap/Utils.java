package com.android.thinkive.framework.displayingbitmap;

import android.annotation.TargetApi;
import android.os.Build.VERSION;
import android.os.StrictMode;
import android.os.StrictMode.ThreadPolicy.Builder;
import android.os.StrictMode.VmPolicy.Builder;

public class Utils
{
  @TargetApi(11)
  public static void enableStrictMode()
  {
    if (hasGingerbread())
    {
      StrictMode.ThreadPolicy.Builder localBuilder = new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog();
      StrictMode.VmPolicy.Builder localBuilder1 = new StrictMode.VmPolicy.Builder().detectAll().penaltyLog();
      StrictMode.setThreadPolicy(localBuilder.build());
      StrictMode.setVmPolicy(localBuilder1.build());
    }
  }
  
  public static boolean hasFroyo()
  {
    return Build.VERSION.SDK_INT >= 8;
  }
  
  public static boolean hasGingerbread()
  {
    return Build.VERSION.SDK_INT >= 9;
  }
  
  public static boolean hasHoneycomb()
  {
    return Build.VERSION.SDK_INT >= 11;
  }
  
  public static boolean hasHoneycombMR1()
  {
    return Build.VERSION.SDK_INT >= 12;
  }
  
  public static boolean hasJellyBean()
  {
    return Build.VERSION.SDK_INT >= 16;
  }
  
  public static boolean hasKitKat()
  {
    return Build.VERSION.SDK_INT >= 19;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\displayingbitmap\Utils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */