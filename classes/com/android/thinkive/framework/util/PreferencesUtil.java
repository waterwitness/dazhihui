package com.android.thinkive.framework.util;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;

public class PreferencesUtil
{
  public static String PREFERENCE_NAME = "thinkive";
  
  public static boolean getBoolean(Context paramContext, String paramString)
  {
    return getBoolean(paramContext, paramString, false);
  }
  
  public static boolean getBoolean(Context paramContext, String paramString, boolean paramBoolean)
  {
    return paramContext.getSharedPreferences(PREFERENCE_NAME, 0).getBoolean(paramString, paramBoolean);
  }
  
  public static float getFloat(Context paramContext, String paramString)
  {
    return getFloat(paramContext, paramString, -1.0F);
  }
  
  public static float getFloat(Context paramContext, String paramString, float paramFloat)
  {
    return paramContext.getSharedPreferences(PREFERENCE_NAME, 0).getFloat(paramString, paramFloat);
  }
  
  public static int getInt(Context paramContext, String paramString)
  {
    return getInt(paramContext, paramString, -1);
  }
  
  public static int getInt(Context paramContext, String paramString, int paramInt)
  {
    return paramContext.getSharedPreferences(PREFERENCE_NAME, 0).getInt(paramString, paramInt);
  }
  
  public static long getLong(Context paramContext, String paramString)
  {
    return getLong(paramContext, paramString, -1L);
  }
  
  public static long getLong(Context paramContext, String paramString, long paramLong)
  {
    return paramContext.getSharedPreferences(PREFERENCE_NAME, 0).getLong(paramString, paramLong);
  }
  
  public static String getString(Context paramContext, String paramString)
  {
    return getString(paramContext, paramString, null);
  }
  
  public static String getString(Context paramContext, String paramString1, String paramString2)
  {
    return paramContext.getSharedPreferences(PREFERENCE_NAME, 0).getString(paramString1, paramString2);
  }
  
  public static boolean putBoolean(Context paramContext, String paramString, boolean paramBoolean)
  {
    paramContext = paramContext.getSharedPreferences(PREFERENCE_NAME, 0).edit();
    paramContext.putBoolean(paramString, paramBoolean);
    return paramContext.commit();
  }
  
  public static boolean putFloat(Context paramContext, String paramString, float paramFloat)
  {
    paramContext = paramContext.getSharedPreferences(PREFERENCE_NAME, 0).edit();
    paramContext.putFloat(paramString, paramFloat);
    return paramContext.commit();
  }
  
  public static boolean putInt(Context paramContext, String paramString, int paramInt)
  {
    paramContext = paramContext.getSharedPreferences(PREFERENCE_NAME, 0).edit();
    paramContext.putInt(paramString, paramInt);
    return paramContext.commit();
  }
  
  public static boolean putLong(Context paramContext, String paramString, long paramLong)
  {
    paramContext = paramContext.getSharedPreferences(PREFERENCE_NAME, 0).edit();
    paramContext.putLong(paramString, paramLong);
    return paramContext.commit();
  }
  
  public static boolean putString(Context paramContext, String paramString1, String paramString2)
  {
    paramContext = paramContext.getSharedPreferences(PREFERENCE_NAME, 0).edit();
    paramContext.putString(paramString1, paramString2);
    return paramContext.commit();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\util\PreferencesUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */