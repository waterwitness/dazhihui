package com.tencent.sharp.jni;

import android.content.Intent;
import com.tencent.av.utils.QLog;
import java.util.HashMap;

abstract class TraeAudioManager$switchThread
  extends Thread
{
  boolean[] _exited = { false };
  HashMap<String, Object> _params = null;
  boolean _running = true;
  long _usingtime = 0L;
  
  TraeAudioManager$switchThread(TraeAudioManager paramTraeAudioManager)
  {
    if (QLog.isColorLevel()) {
      QLog.w("TRAE", 0, " ++switchThread:" + getDeviceName());
    }
  }
  
  public abstract void _quit();
  
  public abstract void _run();
  
  public abstract String getDeviceName();
  
  void processDeviceConnectRes(int paramInt)
  {
    this.this$0.InternalNotifyDeviceChangableUpdate();
    AudioDeviceInterface.LogTraceEntry(getDeviceName() + " err:" + paramInt);
    if (this._params == null) {
      this.this$0.InternalNotifyDeviceListUpdate();
    }
    do
    {
      return;
      this.this$0.sessionConnectedDev = this.this$0._deviceConfigManager.getConnectedDevice();
      localObject = (Long)this._params.get("PARAM_SESSIONID");
      if (QLog.isColorLevel()) {
        QLog.w("TRAE", 0, " sessonID:" + localObject);
      }
      if ((localObject != null) && (((Long)localObject).longValue() != Long.MIN_VALUE)) {
        break;
      }
      this.this$0.InternalNotifyDeviceListUpdate();
    } while (!QLog.isColorLevel());
    QLog.w("TRAE", 0, "processDeviceConnectRes sid null,don't send res");
    return;
    Object localObject = new Intent();
    ((Intent)localObject).putExtra("CONNECTDEVICE_RESULT_DEVICENAME", (String)this._params.get("PARAM_DEVICE"));
    if (this.this$0.sendResBroadcast((Intent)localObject, this._params, paramInt) == 0) {
      this.this$0.InternalNotifyDeviceListUpdate();
    }
    AudioDeviceInterface.LogTraceExit();
  }
  
  public void quit()
  {
    AudioDeviceInterface.LogTraceEntry(getDeviceName());
    this._running = false;
    if (QLog.isColorLevel()) {
      QLog.w("TRAE", 0, " quit:" + getDeviceName() + " _running:" + this._running);
    }
    interrupt();
    _quit();
    synchronized (this._exited)
    {
      int i = this._exited[0];
      if (i != 0) {}
    }
    try
    {
      this._exited.wait();
      AudioDeviceInterface.LogTraceExit();
      return;
      localObject = finally;
      throw ((Throwable)localObject);
    }
    catch (InterruptedException localInterruptedException)
    {
      for (;;) {}
    }
  }
  
  public void run()
  {
    AudioDeviceInterface.LogTraceEntry(getDeviceName());
    this.this$0._deviceConfigManager.setConnecting(getDeviceName());
    this.this$0.InternalNotifyDeviceChangableUpdate();
    _run();
    synchronized (this._exited)
    {
      this._exited[0] = true;
      this._exited.notify();
      AudioDeviceInterface.LogTraceExit();
      return;
    }
  }
  
  public void setDeviceConnectParam(HashMap<String, Object> paramHashMap)
  {
    this._params = paramHashMap;
  }
  
  void updateStatus()
  {
    this.this$0._deviceConfigManager.setConnected(getDeviceName());
    processDeviceConnectRes(0);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\sharp\jni\TraeAudioManager$switchThread.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */