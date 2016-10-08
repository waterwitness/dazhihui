package com.tencent.qalsdk.util;

import android.app.Application;
import java.util.ArrayList;

public abstract class BaseApplication
  extends Application
{
  public static final String DATA_KEY_CHANNEL_ID = "channel_id";
  public static int appnewavmsgicon;
  public static int appnewmsgicon = 0;
  static BaseApplication context;
  public static int defaultNotifSoundResourceId = 0;
  public static int devlockQuickloginIcon = 0;
  public static ArrayList<String> exclusiveStreamList = new ArrayList();
  public static int qqWifiConnecticon3;
  public static int qqWifiLayout;
  public static int qqWifiMissions;
  public static int qqWifiNoSignal;
  public static int qqWifiOperation;
  public static int qqWifiOperationTextViewId;
  public static int qqWifiRedTouchViewId;
  public static int qqWifiSettingViewId;
  public static int qqWifiSettings;
  public static int qqWifiStateIconViewId;
  public static int qqWifiStateTextSingleLine;
  public static int qqWifiStateTextViewId;
  public static int qqWifiTextDoubleLine;
  public static int qqWifiUserful;
  public static int qqlaunchicon;
  public static int qqwifinotifyconnectedicon;
  public static int qqwifinotifydivide;
  public static int qqwifinotifynoneicon;
  public static int qqwifinotifyusefulicon;
  public static int sAppLaunchSeq;
  public static long sAppLaunchTime;
  public static boolean sIsCleanInstall = false;
  
  static
  {
    appnewavmsgicon = 0;
    qqlaunchicon = 0;
    qqWifiLayout = 0;
    qqWifiStateIconViewId = 0;
    qqWifiStateTextViewId = 0;
    qqWifiOperationTextViewId = 0;
    qqWifiTextDoubleLine = 0;
    qqWifiStateTextSingleLine = 0;
    qqWifiSettingViewId = 0;
    qqWifiRedTouchViewId = 0;
    qqWifiConnecticon3 = 0;
    qqWifiNoSignal = 0;
    qqWifiUserful = 0;
    qqWifiMissions = 0;
    qqWifiSettings = 0;
    qqWifiOperation = 0;
    qqwifinotifyusefulicon = 0;
    qqwifinotifynoneicon = 0;
    qqwifinotifyconnectedicon = 0;
    qqwifinotifydivide = 0;
  }
  
  public abstract Object getAppData(String paramString);
  
  public void onCreate()
  {
    super.onCreate();
    context = this;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\qalsdk\util\BaseApplication.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */