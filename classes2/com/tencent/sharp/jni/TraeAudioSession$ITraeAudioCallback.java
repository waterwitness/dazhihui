package com.tencent.sharp.jni;

public abstract interface TraeAudioSession$ITraeAudioCallback
{
  public abstract void onAudioRouteSwitchEnd(String paramString, long paramLong);
  
  public abstract void onAudioRouteSwitchStart(String paramString1, String paramString2);
  
  public abstract void onConnectDeviceRes(int paramInt, String paramString, boolean paramBoolean);
  
  public abstract void onDeviceChangabledUpdate(boolean paramBoolean);
  
  public abstract void onDeviceListUpdate(String[] paramArrayOfString, String paramString1, String paramString2, String paramString3);
  
  public abstract void onGetConnectedDeviceRes(int paramInt, String paramString);
  
  public abstract void onGetConnectingDeviceRes(int paramInt, String paramString);
  
  public abstract void onGetDeviceListRes(int paramInt, String[] paramArrayOfString, String paramString1, String paramString2, String paramString3);
  
  public abstract void onGetStreamTypeRes(int paramInt1, int paramInt2);
  
  public abstract void onIsDeviceChangabledRes(int paramInt, boolean paramBoolean);
  
  public abstract void onRingCompletion(int paramInt, String paramString);
  
  public abstract void onServiceStateUpdate(boolean paramBoolean);
  
  public abstract void onStreamTypeUpdate(int paramInt);
  
  public abstract void onVoicecallPreprocessRes(int paramInt);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\sharp\jni\TraeAudioSession$ITraeAudioCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */