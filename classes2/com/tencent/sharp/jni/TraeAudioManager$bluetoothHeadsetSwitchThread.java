package com.tencent.sharp.jni;

import android.annotation.TargetApi;
import android.media.AudioManager;
import android.os.Build.VERSION;
import com.tencent.av.utils.QLog;

class TraeAudioManager$bluetoothHeadsetSwitchThread
  extends TraeAudioManager.switchThread
{
  TraeAudioManager$bluetoothHeadsetSwitchThread(TraeAudioManager paramTraeAudioManager)
  {
    super(paramTraeAudioManager);
  }
  
  @TargetApi(8)
  public void _quit()
  {
    if (this.this$0._am == null) {
      return;
    }
    _stopBluetoothSco();
  }
  
  public void _run()
  {
    try
    {
      Thread.sleep(5000L);
      int j;
      int i;
      if (this.this$0._deviceConfigManager.getBluetoothName().indexOf("Gear") != -1)
      {
        j = 1;
        if (j == 0) {
          _startBluetoothSco();
        }
        i = 0;
      }
      for (;;)
      {
        int k;
        StringBuilder localStringBuilder;
        if (this._running == true)
        {
          k = i + 1;
          if ((i < 10) && (j == 0)) {
            if (QLog.isColorLevel())
            {
              localStringBuilder = new StringBuilder().append("bluetoothHeadsetSwitchThread i:").append(k).append(" sco:");
              if (!this.this$0._am.isBluetoothScoOn()) {
                break label225;
              }
            }
          }
        }
        label225:
        for (String str = "Y";; str = "N")
        {
          QLog.w("TRAE", 0, str + " :" + this.this$0._deviceConfigManager.getBluetoothName());
          if (!this.this$0._am.isBluetoothScoOn()) {
            break label231;
          }
          updateStatus();
          if (!this.this$0._am.isBluetoothScoOn())
          {
            if ((QLog.isColorLevel()) && (j == 0)) {
              QLog.e("TRAE", 0, "bluetoothHeadsetSwitchThread sco fail,remove btheadset");
            }
            this.this$0._deviceConfigManager.setVisible(getDeviceName(), false);
            processDeviceConnectRes(10);
            this.this$0.checkAutoDeviceListUpdate();
          }
          return;
          j = 0;
          break;
        }
        try
        {
          label231:
          Thread.sleep(1000L);
          i = k;
        }
        catch (InterruptedException localInterruptedException1)
        {
          i = k;
        }
      }
    }
    catch (InterruptedException localInterruptedException2)
    {
      for (;;) {}
    }
  }
  
  @TargetApi(8)
  void _startBluetoothSco()
  {
    this.this$0._am.setBluetoothScoOn(true);
    if (Build.VERSION.SDK_INT > 8) {
      this.this$0._am.startBluetoothSco();
    }
  }
  
  @TargetApi(8)
  void _stopBluetoothSco()
  {
    if (Build.VERSION.SDK_INT > 8) {
      this.this$0._am.stopBluetoothSco();
    }
    this.this$0._am.setBluetoothScoOn(false);
  }
  
  public String getDeviceName()
  {
    return "DEVICE_BLUETOOTHHEADSET";
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\sharp\jni\TraeAudioManager$bluetoothHeadsetSwitchThread.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */