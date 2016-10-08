package com.tencent.sharp.jni;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;

class TraeAudioManager$BluetoohHeadsetCheckFake
  extends TraeAudioManager.BluetoohHeadsetCheckInterface
{
  TraeAudioManager$BluetoohHeadsetCheckFake(TraeAudioManager paramTraeAudioManager)
  {
    super(paramTraeAudioManager);
  }
  
  void _addAction(IntentFilter paramIntentFilter) {}
  
  void _onReceive(Context paramContext, Intent paramIntent) {}
  
  public boolean init(Context paramContext, TraeAudioManager.DeviceConfigManager paramDeviceConfigManager)
  {
    return true;
  }
  
  public String interfaceDesc()
  {
    return "BluetoohHeadsetCheckFake";
  }
  
  public boolean isConnected()
  {
    return false;
  }
  
  public void release() {}
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\sharp\jni\TraeAudioManager$BluetoohHeadsetCheckFake.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */