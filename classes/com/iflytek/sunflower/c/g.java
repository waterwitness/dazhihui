package com.iflytek.sunflower.c;

import android.util.Log;

public class g
{
  protected static boolean a = true;
  protected static boolean b = false;
  
  public static void a(String paramString1, String paramString2)
  {
    if (a) {
      Log.d(paramString1, paramString2);
    }
  }
  
  public static void a(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (a) {
      Log.d(paramString1, paramString2, paramThrowable);
    }
  }
  
  public static void a(boolean paramBoolean)
  {
    a = paramBoolean;
  }
  
  public static void b(String paramString1, String paramString2)
  {
    if (a) {
      Log.i(paramString1, paramString2);
    }
  }
  
  public static void b(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (a) {
      Log.i(paramString1, paramString2, paramThrowable);
    }
  }
  
  public static void b(boolean paramBoolean)
  {
    b = paramBoolean;
  }
  
  public static void c(String paramString1, String paramString2)
  {
    if (a) {
      Log.w(paramString1, paramString2);
    }
  }
  
  public static void c(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (a) {
      Log.w(paramString1, paramString2, paramThrowable);
    }
  }
  
  public static void d(String paramString1, String paramString2)
  {
    if (a) {
      Log.e(paramString1, paramString2);
    }
  }
  
  public static void d(String paramString1, String paramString2, Throwable paramThrowable)
  {
    if (a) {
      Log.e(paramString1, paramString2, paramThrowable);
    }
  }
  
  public static void e(String paramString1, String paramString2)
  {
    if (b) {
      Log.i(paramString1, paramString2);
    }
  }
  
  public static void f(String paramString1, String paramString2)
  {
    if (b) {
      Log.e(paramString1, paramString2);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\sunflower\c\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */