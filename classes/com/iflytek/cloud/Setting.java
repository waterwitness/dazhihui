package com.iflytek.cloud;

import android.os.Environment;
import com.iflytek.thirdparty.X;
import java.io.File;

public class Setting
{
  public static final String a = Environment.getExternalStorageDirectory().getPath() + "/msc/msc.log";
  private static Setting.LOG_LEVEL b = Setting.LOG_LEVEL.all;
  private static String c = a;
  private static boolean d = true;
  private static boolean e = false;
  private static boolean f = true;
  
  public static boolean getLocationEnable()
  {
    return f;
  }
  
  public static Setting.LOG_LEVEL getLogLevel()
  {
    return b;
  }
  
  public static String getLogPath()
  {
    return c;
  }
  
  public static boolean getSaveTestLog()
  {
    return e;
  }
  
  public static boolean getShowLog()
  {
    return d;
  }
  
  public static void setLocationEnable(boolean paramBoolean)
  {
    f = paramBoolean;
  }
  
  public static void setLogLevel(Setting.LOG_LEVEL paramLOG_LEVEL)
  {
    b = paramLOG_LEVEL;
    X.a();
  }
  
  public static void setLogPath(String paramString)
  {
    c = paramString;
  }
  
  public static void setSaveTestLog(boolean paramBoolean)
  {
    e = paramBoolean;
  }
  
  public static void setShowLog(boolean paramBoolean)
  {
    d = paramBoolean;
    X.a();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\cloud\Setting.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */