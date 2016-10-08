package com.bairuitech.util;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.widget.Toast;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class BaseMethod
{
  public static int dip2px(Context paramContext, float paramFloat)
  {
    return (int)(paramContext.getResources().getDisplayMetrics().density * paramFloat + 0.5F);
  }
  
  public static Date getDateTime(String paramString)
  {
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.US);
    try
    {
      paramString = localSimpleDateFormat.parse(paramString);
      return paramString;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
    return null;
  }
  
  public static String getStrTime(Date paramDate)
  {
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm", Locale.US);
    try
    {
      paramDate = localSimpleDateFormat.format(paramDate);
      return paramDate;
    }
    catch (Exception paramDate)
    {
      paramDate.printStackTrace();
    }
    return "";
  }
  
  public static String getTimeShowString(int paramInt)
  {
    new String();
    int i = paramInt / 3600;
    int j = paramInt / 60 % 60;
    paramInt %= 60;
    String str1;
    String str2;
    if (i >= 10)
    {
      str1 = i;
      if (j < 10) {
        break label150;
      }
      str2 = j;
      label75:
      if (paramInt < 10) {
        break label171;
      }
    }
    label150:
    label171:
    for (String str3 = paramInt;; str3 = "0" + paramInt)
    {
      return str1 + ":" + str2 + ":" + str3;
      str1 = "0" + i;
      break;
      str2 = "0" + j;
      break label75;
    }
  }
  
  public static String getVersion(Context paramContext)
  {
    try
    {
      paramContext = "Version:" + paramContext.getPackageManager().getPackageInfo("com.bairuitech.callcenter", 0).versionName;
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext)
    {
      paramContext.printStackTrace();
    }
    return "";
  }
  
  public static int px2dip(Context paramContext, float paramFloat)
  {
    return (int)(paramFloat / paramContext.getResources().getDisplayMetrics().density + 0.5F);
  }
  
  public static void sendBroadCast(Context paramContext, String paramString, Bundle paramBundle)
  {
    Intent localIntent = new Intent();
    if (paramBundle != null) {
      localIntent.putExtras(paramBundle);
    }
    localIntent.setAction(paramString);
    paramContext.sendBroadcast(localIntent);
  }
  
  public static void showToast(String paramString, Activity paramActivity)
  {
    Toast.makeText(paramActivity, paramString, 0).show();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\bairuitech\util\BaseMethod.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */