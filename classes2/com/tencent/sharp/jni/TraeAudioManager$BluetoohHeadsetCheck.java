package com.tencent.sharp.jni;

import android.annotation.TargetApi;
import android.bluetooth.BluetoothAdapter;
import android.bluetooth.BluetoothDevice;
import android.bluetooth.BluetoothProfile;
import android.bluetooth.BluetoothProfile.ServiceListener;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.text.TextUtils;
import com.tencent.av.utils.QLog;
import java.util.List;

@TargetApi(11)
class TraeAudioManager$BluetoohHeadsetCheck
  extends TraeAudioManager.BluetoohHeadsetCheckInterface
  implements BluetoothProfile.ServiceListener
{
  BluetoothAdapter _adapter = null;
  Context _ctx = null;
  TraeAudioManager.DeviceConfigManager _devCfg = null;
  BluetoothProfile _profile = null;
  
  TraeAudioManager$BluetoohHeadsetCheck(TraeAudioManager paramTraeAudioManager)
  {
    super(paramTraeAudioManager);
  }
  
  void _addAction(IntentFilter paramIntentFilter)
  {
    if (QLog.isColorLevel()) {
      QLog.w("TRAE", 0, " " + interfaceDesc() + " _addAction");
    }
    paramIntentFilter.addAction("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED");
    paramIntentFilter.addAction("android.media.ACTION_SCO_AUDIO_STATE_UPDATED");
  }
  
  void _onReceive(Context paramContext, Intent paramIntent)
  {
    int i;
    int j;
    if ("android.bluetooth.adapter.action.CONNECTION_STATE_CHANGED".equals(paramIntent.getAction()))
    {
      i = paramIntent.getIntExtra("android.bluetooth.adapter.extra.CONNECTION_STATE", -1);
      j = paramIntent.getIntExtra("android.bluetooth.adapter.extra.PREVIOUS_CONNECTION_STATE", -1);
      paramIntent = (BluetoothDevice)paramIntent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
      if (QLog.isColorLevel()) {
        QLog.w("TRAE", 0, "BT ACTION_CONNECTION_STATE_CHANGED|   EXTRA_CONNECTION_STATE " + getBTAdapterConnectionState(i));
      }
      if (QLog.isColorLevel()) {
        QLog.w("TRAE", 0, "    EXTRA_PREVIOUS_CONNECTION_STATE " + getBTAdapterConnectionState(j));
      }
      Object localObject;
      if (QLog.isColorLevel())
      {
        localObject = new StringBuilder().append("    EXTRA_DEVICE ").append(paramIntent).append(" ");
        if (paramIntent != null)
        {
          paramContext = paramIntent.getName();
          QLog.w("TRAE", 0, paramContext);
        }
      }
      else
      {
        if (i != 2) {
          break label251;
        }
        if (QLog.isColorLevel()) {
          QLog.w("TRAE", 0, "   dev:" + paramIntent.getName() + " connected,start sco...");
        }
        this._devCfg.setVisible("DEVICE_BLUETOOTHHEADSET", true);
        localObject = this._devCfg;
        if (paramIntent == null) {
          break label245;
        }
        paramContext = paramIntent.getName();
        label233:
        ((TraeAudioManager.DeviceConfigManager)localObject).setBluetoothName(paramContext);
      }
    }
    label245:
    label251:
    do
    {
      do
      {
        do
        {
          return;
          paramContext = " ";
          break;
          paramContext = "unkown";
          break label233;
        } while (i != 0);
        this._devCfg.setVisible("DEVICE_BLUETOOTHHEADSET", false);
        return;
      } while (!"android.media.ACTION_SCO_AUDIO_STATE_UPDATED".equals(paramIntent.getAction()));
      i = paramIntent.getIntExtra("android.media.extra.SCO_AUDIO_STATE", -1);
      j = paramIntent.getIntExtra("android.media.extra.SCO_AUDIO_PREVIOUS_STATE", -1);
      paramContext = (BluetoothDevice)paramIntent.getParcelableExtra("android.bluetooth.device.extra.DEVICE");
      if (QLog.isColorLevel()) {
        QLog.w("TRAE", 0, "BT ACTION_SCO_AUDIO_STATE_UPDATED|   EXTRA_CONNECTION_STATE  dev:" + paramContext);
      }
      if (QLog.isColorLevel()) {
        QLog.w("TRAE", 0, "   EXTRA_SCO_AUDIO_STATE " + getSCOAudioStateExtraString(i));
      }
    } while (!QLog.isColorLevel());
    QLog.w("TRAE", 0, "   EXTRA_SCO_AUDIO_PREVIOUS_STATE " + getSCOAudioStateExtraString(j));
  }
  
  @TargetApi(11)
  public boolean init(Context paramContext, TraeAudioManager.DeviceConfigManager paramDeviceConfigManager)
  {
    AudioDeviceInterface.LogTraceEntry("");
    if ((paramContext == null) || (paramDeviceConfigManager == null)) {
      if (QLog.isColorLevel()) {
        QLog.e("TRAE", 0, " err ctx==null||_devCfg==null");
      }
    }
    do
    {
      do
      {
        return false;
        this._ctx = paramContext;
        this._devCfg = paramDeviceConfigManager;
        this._adapter = BluetoothAdapter.getDefaultAdapter();
        if (this._adapter != null) {
          break;
        }
      } while (!QLog.isColorLevel());
      QLog.e("TRAE", 0, " err getDefaultAdapter fail!");
      return false;
      if ((!this._adapter.isEnabled()) || (this._profile != null) || (this._adapter.getProfileProxy(this._ctx, this, 1))) {
        break;
      }
    } while (!QLog.isColorLevel());
    QLog.e("TRAE", 0, "BluetoohHeadsetCheck: getProfileProxy HEADSET fail!");
    return false;
    AudioDeviceInterface.LogTraceExit();
    return true;
  }
  
  public String interfaceDesc()
  {
    return "BluetoohHeadsetCheck";
  }
  
  public boolean isConnected()
  {
    List localList;
    if (this._profile != null)
    {
      localList = this._profile.getConnectedDevices();
      if (localList != null) {
        break label23;
      }
    }
    label23:
    while (localList.size() <= 0) {
      return false;
    }
    return true;
  }
  
  @TargetApi(11)
  public void onServiceConnected(int paramInt, BluetoothProfile paramBluetoothProfile)
  {
    AudioDeviceInterface.LogTraceEntry("_profile:" + this._profile + " profile:" + paramInt + " proxy:" + paramBluetoothProfile);
    if (paramInt == 1)
    {
      if ((this._profile != null) && (this._profile != paramBluetoothProfile))
      {
        if (QLog.isColorLevel()) {
          QLog.w("TRAE", 0, "BluetoohHeadsetCheck: HEADSET Connected proxy:" + paramBluetoothProfile + " _profile:" + this._profile);
        }
        this._adapter.closeProfileProxy(1, this._profile);
        this._profile = null;
      }
      this._profile = paramBluetoothProfile;
      paramBluetoothProfile = this._profile.getConnectedDevices();
      if (paramBluetoothProfile != null)
      {
        if (QLog.isColorLevel()) {
          QLog.w("TRAE", 0, "TRAEBluetoohProxy: HEADSET Connected devs:" + paramBluetoothProfile.size() + " _profile:" + this._profile);
        }
        paramInt = 0;
        while (paramInt < paramBluetoothProfile.size())
        {
          BluetoothDevice localBluetoothDevice = (BluetoothDevice)paramBluetoothProfile.get(paramInt);
          int i = this._profile.getConnectionState(localBluetoothDevice);
          if (i == 2) {
            this._devCfg.setBluetoothName(localBluetoothDevice.getName());
          }
          if (QLog.isColorLevel()) {
            QLog.w("TRAE", 0, "   " + paramInt + " " + localBluetoothDevice.getName() + " ConnectionState:" + i);
          }
          paramInt += 1;
        }
      }
      if (this._devCfg != null) {
        if (this.this$0._deviceConfigManager == null) {
          break label407;
        }
      }
    }
    label407:
    for (paramBluetoothProfile = this.this$0._deviceConfigManager.getBluetoothName();; paramBluetoothProfile = null)
    {
      if (TextUtils.isEmpty(paramBluetoothProfile)) {
        this._devCfg.setVisible("DEVICE_BLUETOOTHHEADSET", false);
      }
      for (;;)
      {
        AudioDeviceInterface.LogTraceExit();
        return;
        if ((isConnected()) && (paramBluetoothProfile.indexOf("Gear") == -1))
        {
          this._devCfg.setVisible("DEVICE_BLUETOOTHHEADSET", true);
          this.this$0.checkDevicePlug("DEVICE_BLUETOOTHHEADSET", true);
        }
        else
        {
          this._devCfg.setVisible("DEVICE_BLUETOOTHHEADSET", false);
        }
      }
    }
  }
  
  @TargetApi(11)
  public void onServiceDisconnected(int paramInt)
  {
    AudioDeviceInterface.LogTraceEntry("_profile:" + this._profile + " profile:" + paramInt);
    if (paramInt == 1)
    {
      if (QLog.isColorLevel()) {
        QLog.w("TRAE", 0, "TRAEBluetoohProxy: HEADSET Disconnected");
      }
      if (isConnected()) {
        this.this$0.checkDevicePlug("DEVICE_BLUETOOTHHEADSET", false);
      }
      if (this._profile != null)
      {
        this._adapter.closeProfileProxy(1, this._profile);
        this._profile = null;
      }
    }
    AudioDeviceInterface.LogTraceExit();
  }
  
  public void release()
  {
    AudioDeviceInterface.LogTraceEntry("_profile:" + this._profile);
    try
    {
      if (this._adapter != null)
      {
        if (this._profile != null) {
          this._adapter.closeProfileProxy(1, this._profile);
        }
        this._profile = null;
      }
      AudioDeviceInterface.LogTraceExit();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        if (QLog.isColorLevel()) {
          QLog.w("TRAE", 0, " closeProfileProxy:e:" + localException.getMessage());
        }
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\sharp\jni\TraeAudioManager$BluetoohHeadsetCheck.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */