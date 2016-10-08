package com.bairuitech.anychat;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.view.Display;
import android.view.WindowManager;
import java.util.Date;

public class AnyChatSensorHelper
  implements SensorEventListener
{
  private Date LastSportTime = new Date();
  private float LastXSpead = 0.0F;
  private float LastYSpead = 0.0F;
  private float LastZSpead = 0.0F;
  private boolean bCameraNeedFocus = false;
  private AnyChatOrientationEventListener orientationListener = null;
  
  public void DestroySensor()
  {
    this.orientationListener.disable();
  }
  
  public void InitSensor(Context paramContext)
  {
    int i;
    if ((paramContext.getResources().getConfiguration().screenLayout & 0xF) >= 3)
    {
      i = 2;
      AnyChatCoreSDK.SetSDKOptionInt(103, i);
      switch (((WindowManager)paramContext.getSystemService("window")).getDefaultDisplay().getRotation())
      {
      default: 
        i = 0;
      }
    }
    for (;;)
    {
      AnyChatCoreSDK.SetSDKOptionInt(99, i);
      AnyChatCoreSDK.mCameraHelper.SetContext(paramContext);
      AnyChatCoreSDK.mAudioHelper.SetContext(paramContext);
      if (this.orientationListener == null) {
        this.orientationListener = new AnyChatOrientationEventListener(paramContext, 3);
      }
      this.orientationListener.enable();
      paramContext = (SensorManager)paramContext.getSystemService("sensor");
      paramContext.registerListener(this, paramContext.getDefaultSensor(1), 3);
      return;
      i = 1;
      break;
      i = 0;
      continue;
      i = 90;
      continue;
      i = 180;
      continue;
      i = 270;
    }
  }
  
  public void onAccuracyChanged(Sensor paramSensor, int paramInt) {}
  
  public void onSensorChanged(SensorEvent paramSensorEvent)
  {
    if (1 != paramSensorEvent.sensor.getType()) {
      return;
    }
    float f1 = paramSensorEvent.values[0];
    float f2 = paramSensorEvent.values[1];
    float f3 = paramSensorEvent.values[2];
    if ((Math.abs(f1 - this.LastXSpead) <= 0.5D) && (Math.abs(f2 - this.LastYSpead) <= 0.5D) && (Math.abs(f3 - this.LastZSpead) <= 0.5D))
    {
      long l1 = new Date().getTime();
      long l2 = this.LastSportTime.getTime();
      if ((this.bCameraNeedFocus) && (l1 - l2 > 1000L))
      {
        this.bCameraNeedFocus = false;
        if (AnyChatCoreSDK.GetSDKOptionInt(95) != 3) {
          break label163;
        }
        AnyChatCoreSDK.mCameraHelper.CameraAutoFocus();
      }
    }
    for (;;)
    {
      this.LastXSpead = f1;
      this.LastYSpead = f2;
      this.LastZSpead = f3;
      return;
      label163:
      AnyChatCoreSDK.SetSDKOptionInt(90, 1);
      continue;
      this.bCameraNeedFocus = true;
      this.LastSportTime.setTime(System.currentTimeMillis());
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\bairuitech\anychat\AnyChatSensorHelper.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */