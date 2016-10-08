package com.android.thinkive.framework.util;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.net.Uri;
import android.text.TextUtils;

public class AppUtil
{
  public static String getAppName(Context paramContext)
  {
    ApplicationInfo localApplicationInfo = paramContext.getApplicationInfo();
    return (String)paramContext.getPackageManager().getApplicationLabel(localApplicationInfo);
  }
  
  public static int getH5VersionCode(Context paramContext)
  {
    int j = PreferencesUtil.getInt(paramContext, "h5_version_code", -1);
    int i = j;
    if (j == -1)
    {
      i = getVersionCode(paramContext);
      PreferencesUtil.putInt(paramContext, "h5_version_code", i);
    }
    return i;
  }
  
  public static String getH5VersionName(Context paramContext)
  {
    String str2 = PreferencesUtil.getString(paramContext, "h5_version_name", "");
    String str1 = str2;
    if (TextUtils.isEmpty(str2))
    {
      str1 = getVersionName(paramContext);
      PreferencesUtil.putString(paramContext, "h5_version_name", str1);
    }
    return str1;
  }
  
  public static Intent getInstallIntent(String paramString)
  {
    Intent localIntent = new Intent("android.intent.action.VIEW");
    localIntent.setDataAndType(Uri.parse("file://" + paramString), "application/vnd.android.package-archive");
    localIntent.setFlags(268468224);
    return localIntent;
  }
  
  public static PackageInfo getPackageInfo(Context paramContext)
  {
    String str = paramContext.getPackageName();
    try
    {
      paramContext = paramContext.getPackageManager().getPackageInfo(str, 0);
      return paramContext;
    }
    catch (PackageManager.NameNotFoundException paramContext) {}
    return null;
  }
  
  public static int getVersionCode(Context paramContext)
  {
    int j = PreferencesUtil.getInt(paramContext, "native_version_code", -1);
    PackageInfo localPackageInfo = getPackageInfo(paramContext);
    int i;
    if (j != -1)
    {
      i = j;
      if (j >= localPackageInfo.versionCode) {}
    }
    else
    {
      i = localPackageInfo.versionCode;
      PreferencesUtil.putInt(paramContext, "native_version_code", i);
      PreferencesUtil.putString(paramContext, "native_version_name", localPackageInfo.versionName);
    }
    return i;
  }
  
  public static String getVersionName(Context paramContext)
  {
    String str = PreferencesUtil.getString(paramContext, "native_version_name", "");
    PackageInfo localPackageInfo = getPackageInfo(paramContext);
    paramContext = str;
    if (TextUtils.isEmpty(str)) {
      paramContext = localPackageInfo.versionName;
    }
    return paramContext;
  }
  
  public static boolean isAppExist(Context paramContext, String paramString)
  {
    if ((paramString == null) || ("".equals(paramString))) {
      return false;
    }
    try
    {
      paramContext.getPackageManager().getApplicationInfo(paramString, 8192);
      return true;
    }
    catch (PackageManager.NameNotFoundException paramContext) {}
    return false;
  }
  
  public static void startApp(Context paramContext, String paramString)
  {
    new Intent();
    paramString = paramContext.getPackageManager().getLaunchIntentForPackage(paramString);
    paramString.setFlags(337641472);
    paramContext.startActivity(paramString);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\util\AppUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */