package com.tencent.Util;

import android.app.Activity;
import android.content.ContentResolver;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.hardware.Sensor;
import android.hardware.SensorManager;
import android.os.Handler;
import android.provider.Settings.System;

public class SenserHelper
{
  public int CHANGEORIENTATION = 1000;
  private boolean isPortrait;
  private ContentResolver mContentResolver;
  private Activity mContext;
  private Handler mHandler = new SenserHelper.1(this);
  private SenserHelper.RotationObserver mObserver;
  private Sensor mSensor;
  private SenserHelper.SensorListener mSensorListener;
  private SensorManager mSensorManager;
  
  public SenserHelper(Context paramContext)
  {
    this.mSensorManager = ((SensorManager)paramContext.getSystemService("sensor"));
    this.mSensor = this.mSensorManager.getDefaultSensor(1);
    this.mSensorListener = new SenserHelper.SensorListener(this, this.mHandler);
    this.mContentResolver = paramContext.getContentResolver();
    this.mObserver = new SenserHelper.RotationObserver(this, this.mHandler);
    this.mObserver.startObserver();
    this.mContentResolver.registerContentObserver(Settings.System.getUriFor("accelerometer_rotation"), false, this.mObserver);
    if (paramContext.getResources().getConfiguration().orientation == 1) {}
    for (boolean bool = true;; bool = false)
    {
      this.isPortrait = bool;
      return;
    }
  }
  
  public int getRotationStatus(Context paramContext)
  {
    try
    {
      int i = Settings.System.getInt(paramContext.getContentResolver(), "accelerometer_rotation");
      return i;
    }
    catch (Exception paramContext)
    {
      paramContext.printStackTrace();
    }
    return 0;
  }
  
  public void onDestroy()
  {
    if (this.mObserver != null) {
      this.mObserver.stopObserver();
    }
    if (this.mSensorManager != null) {
      this.mSensorManager.unregisterListener(this.mSensorListener);
    }
    this.mContext = null;
    this.mContentResolver = null;
  }
  
  public void start(Activity paramActivity)
  {
    this.mContext = paramActivity;
    this.mObserver.startObserver();
    if (getRotationStatus(this.mContext) == 1)
    {
      this.mSensorManager.registerListener(this.mSensorListener, this.mSensor, 2);
      return;
    }
    this.mSensorManager.unregisterListener(this.mSensorListener);
  }
  
  public void stop()
  {
    if (this.mObserver != null) {
      this.mObserver.stopObserver();
    }
    if (this.mSensorManager != null) {
      this.mSensorManager.unregisterListener(this.mSensorListener);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\Util\SenserHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */