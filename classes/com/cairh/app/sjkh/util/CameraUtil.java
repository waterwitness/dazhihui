package com.cairh.app.sjkh.util;

import android.annotation.SuppressLint;
import android.hardware.Camera;
import android.hardware.Camera.CameraInfo;

public class CameraUtil
{
  @SuppressLint({"NewApi"})
  public static boolean isFontCameraExist()
  {
    boolean bool2 = true;
    Camera.CameraInfo localCameraInfo = new Camera.CameraInfo();
    int j = Camera.getNumberOfCameras();
    int i = 0;
    for (;;)
    {
      boolean bool1;
      if (i >= j) {
        bool1 = false;
      }
      do
      {
        return bool1;
        Camera.getCameraInfo(i, localCameraInfo);
        bool1 = bool2;
      } while (localCameraInfo.facing == 1);
      i += 1;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\util\CameraUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */