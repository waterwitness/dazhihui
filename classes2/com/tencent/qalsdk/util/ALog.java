package com.tencent.qalsdk.util;

import android.content.Context;
import android.util.Log;
import com.tencent.qalsdk.sdk.q;

public class ALog
{
  private static q helper = new q();
  
  public static void d(String paramString1, String paramString2)
  {
    Log.d(paramString1, paramString2);
  }
  
  public static void e(String paramString1, String paramString2)
  {
    Log.e(paramString1, paramString2);
    helper.a(paramString1, "[E] " + paramString2, null);
  }
  
  public static String getFilePath()
  {
    return helper.d();
  }
  
  public static String getLogFileName(long paramLong)
  {
    return helper.a(helper.a(paramLong));
  }
  
  public static void i(String paramString1, String paramString2)
  {
    Log.i(paramString1, paramString2);
    helper.a(paramString1, "[I] " + paramString2, null);
  }
  
  public static void init(Context paramContext)
  {
    helper.a(paramContext, "app");
  }
  
  public static void w(String paramString1, String paramString2)
  {
    Log.w(paramString1, paramString2);
    helper.a(paramString1, "[W] " + paramString2, null);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\util\ALog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */