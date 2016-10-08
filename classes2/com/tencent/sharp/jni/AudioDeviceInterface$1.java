package com.tencent.sharp.jni;

import com.tencent.av.utils.QLog;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

class AudioDeviceInterface$1
  implements TraeAudioSession.ITraeAudioCallback
{
  AudioDeviceInterface$1(AudioDeviceInterface paramAudioDeviceInterface) {}
  
  public void onAudioRouteSwitchEnd(String paramString, long paramLong) {}
  
  public void onAudioRouteSwitchStart(String paramString1, String paramString2) {}
  
  public void onConnectDeviceRes(int paramInt, String paramString, boolean paramBoolean) {}
  
  public void onDeviceChangabledUpdate(boolean paramBoolean) {}
  
  public void onDeviceListUpdate(String[] paramArrayOfString, String paramString1, String paramString2, String paramString3)
  {
    if (AudioDeviceInterface.access$300(this.this$0)) {
      AudioDeviceInterface.access$400(this.this$0, paramString1);
    }
  }
  
  public void onGetConnectedDeviceRes(int paramInt, String paramString)
  {
    if (paramInt == 0) {
      AudioDeviceInterface.access$400(this.this$0, paramString);
    }
  }
  
  public void onGetConnectingDeviceRes(int paramInt, String paramString) {}
  
  public void onGetDeviceListRes(int paramInt, String[] paramArrayOfString, String paramString1, String paramString2, String paramString3) {}
  
  public void onGetStreamTypeRes(int paramInt1, int paramInt2) {}
  
  public void onIsDeviceChangabledRes(int paramInt, boolean paramBoolean) {}
  
  public void onRingCompletion(int paramInt, String paramString) {}
  
  public void onServiceStateUpdate(boolean paramBoolean)
  {
    if (!paramBoolean) {}
    try
    {
      AudioDeviceInterface.access$000(this.this$0).lock();
      AudioDeviceInterface.access$102(this.this$0, true);
      if (QLog.isColorLevel()) {
        QLog.e("TRAE", 0, "onVoicecallPreprocessRes signalAll");
      }
      AudioDeviceInterface.access$200(this.this$0).signalAll();
      AudioDeviceInterface.access$000(this.this$0).unlock();
      return;
    }
    catch (Exception localException) {}
  }
  
  public void onStreamTypeUpdate(int paramInt) {}
  
  public void onVoicecallPreprocessRes(int paramInt)
  {
    try
    {
      AudioDeviceInterface.access$000(this.this$0).lock();
      AudioDeviceInterface.access$102(this.this$0, true);
      if (QLog.isColorLevel()) {
        QLog.e("TRAE", 0, "onVoicecallPreprocessRes signalAll");
      }
      AudioDeviceInterface.access$200(this.this$0).signalAll();
      AudioDeviceInterface.access$000(this.this$0).unlock();
      return;
    }
    catch (Exception localException) {}
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\sharp\jni\AudioDeviceInterface$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */