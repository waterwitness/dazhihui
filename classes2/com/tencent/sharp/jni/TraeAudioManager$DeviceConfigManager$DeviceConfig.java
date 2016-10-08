package com.tencent.sharp.jni;

public class TraeAudioManager$DeviceConfigManager$DeviceConfig
{
  String deviceName = "DEVICE_NONE";
  int priority = 0;
  boolean visible = false;
  
  public TraeAudioManager$DeviceConfigManager$DeviceConfig(TraeAudioManager.DeviceConfigManager paramDeviceConfigManager) {}
  
  public String getDeviceName()
  {
    return this.deviceName;
  }
  
  public int getPriority()
  {
    return this.priority;
  }
  
  public boolean getVisible()
  {
    return this.visible;
  }
  
  public boolean init(String paramString, int paramInt)
  {
    if ((paramString == null) || (paramString.length() <= 0)) {}
    while (TraeAudioManager.checkDevName(paramString) != true) {
      return false;
    }
    this.deviceName = paramString;
    this.priority = paramInt;
    return true;
  }
  
  public void setVisible(boolean paramBoolean)
  {
    this.visible = paramBoolean;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\sharp\jni\TraeAudioManager$DeviceConfigManager$DeviceConfig.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */