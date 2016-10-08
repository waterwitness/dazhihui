package com.tencent.av.sdk;

import android.hardware.Camera.Parameters;
import android.util.Log;
import com.tencent.av.utils.VcSystemInfo;

public class AVVideoCtrl
{
  public static final int COLOR_FORMAT_I420 = 0;
  public int nativeObj = 0;
  
  public static boolean isEnableBeauty()
  {
    Log.d("EnableBeauty", "isEnable = " + VcSystemInfo.isBeautySupported());
    return VcSystemInfo.isBeautySupported();
  }
  
  public native int enableCamera(int paramInt, boolean paramBoolean, AVVideoCtrl.EnableCameraCompleteCallback paramEnableCameraCompleteCallback);
  
  public native int enableExternalCapture(boolean paramBoolean, AVVideoCtrl.EnableExternalCaptureCompleteCallback paramEnableExternalCaptureCompleteCallback);
  
  public native int fillExternalCaptureFrame(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6);
  
  public native Object getCamera();
  
  public native Object getCameraHandler();
  
  public native int getCameraNum();
  
  public native Object getCameraPara();
  
  public native String getQualityTips();
  
  public native void inputBeautyParam(float paramFloat);
  
  public native void setCameraPara(Camera.Parameters paramParameters);
  
  public synchronized native void setCameraPreviewChangeCallback(AVVideoCtrl.CameraPreviewChangeCallback paramCameraPreviewChangeCallback);
  
  public native boolean setLocalVideoPreProcessCallback(AVVideoCtrl.LocalVideoPreProcessCallback paramLocalVideoPreProcessCallback);
  
  public native boolean setLocalVideoPreviewCallback(AVVideoCtrl.LocalVideoPreviewCallback paramLocalVideoPreviewCallback);
  
  public native boolean setRemoteScreenVideoPreviewCallback(AVVideoCtrl.RemoteScreenVideoPreviewCallback paramRemoteScreenVideoPreviewCallback);
  
  public native boolean setRemoteVideoPreviewCallback(AVVideoCtrl.RemoteVideoPreviewCallback paramRemoteVideoPreviewCallback);
  
  public native void setRotation(int paramInt);
  
  public native int switchCamera(int paramInt, AVVideoCtrl.SwitchCameraCompleteCallback paramSwitchCameraCompleteCallback);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\sdk\AVVideoCtrl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */