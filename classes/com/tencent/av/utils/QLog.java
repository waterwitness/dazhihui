package com.tencent.av.utils;

import android.util.Log;

public class QLog
{
  public static final int CLR = 0;
  public static final int USR = 1;
  
  public static void d(String paramString1, int paramInt, String paramString2)
  {
    Log.d(paramString1, paramString2);
  }
  
  public static void d(String paramString1, int paramInt, String paramString2, Exception paramException)
  {
    Log.d(paramString1, paramString2);
  }
  
  public static void e(String paramString1, int paramInt, String paramString2)
  {
    Log.e(paramString1, paramString2);
  }
  
  public static void e(String paramString1, int paramInt, String paramString2, Exception paramException)
  {
    Log.e(paramString1, paramString2);
  }
  
  public static void i(String paramString1, int paramInt, String paramString2)
  {
    Log.i(paramString1, paramString2);
  }
  
  public static void i(String paramString1, int paramInt, String paramString2, Exception paramException)
  {
    Log.i(paramString1, paramString2);
  }
  
  public static boolean isColorLevel()
  {
    return true;
  }
  
  public static void w(String paramString1, int paramInt, String paramString2)
  {
    Log.w(paramString1, paramString2);
  }
  
  public static void w(String paramString1, int paramInt, String paramString2, Exception paramException)
  {
    Log.w(paramString1, paramString2);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\utils\QLog.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */