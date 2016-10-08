package com.tencent.av.sdk;

import android.content.Context;
import android.util.Log;
import com.tencent.av.utils.PhoneStatusMonitor;
import com.tencent.av.utils.PhoneStatusMonitor.PhoneStatusListener;
import com.tencent.sharp.jni.TraeAudioManager;
import com.tencent.sharp.jni.TraeAudioSession;

public class AVAudioCtrl
{
  public static final int AUDIO_CODEC_TYPE_CELT = 4103;
  public static final int AUDIO_CODEC_TYPE_SILK = 4102;
  public static final int OUTPUT_MODE_HEADSET = 0;
  public static final int OUTPUT_MODE_SPEAKER = 1;
  static final String TAG = "SdkJni";
  private boolean isSystemApp = false;
  private TraeAudioSession mAudioSession = null;
  private String mAudioSessionType = "DEVICE_EARPHONE;DEVICE_SPEAKERPHONE;DEVICE_BLUETOOTHHEADSET;DEVICE_WIREDHEADSET;";
  private String mAudioStateBeforePhoneCall = "DEVICE_NONE";
  private AVAudioCtrl.Delegate mDelegate = null;
  private String[] mDeviceList;
  boolean mIsCalling = false;
  private PhoneStatusMonitor.PhoneStatusListener mPhoneStatusListener;
  private PhoneStatusMonitor mPhoneStatusMonitor;
  private String mSelectedDeviceName = "";
  private int mVoiceStreamType = 0;
  public int nativeObj = 0;
  
  public boolean enableHighQuality(boolean paramBoolean)
  {
    return nativeEnableHighQuality(paramBoolean);
  }
  
  public boolean enableMic(boolean paramBoolean)
  {
    if (this.mIsCalling) {
      return false;
    }
    return nativeEnableMic(paramBoolean);
  }
  
  public boolean enableSpeaker(boolean paramBoolean)
  {
    if (this.mIsCalling) {
      return false;
    }
    return nativeEnableSpeaker(paramBoolean);
  }
  
  public native AVAudioCtrl.AudioFrameDesc getAudioDataFormat(int paramInt);
  
  public native float getAudioDataVolume(int paramInt);
  
  public int getAudioOutputMode()
  {
    int j = 0;
    int i;
    if (this.mSelectedDeviceName.endsWith("DEVICE_SPEAKERPHONE")) {
      i = 1;
    }
    do
    {
      do
      {
        do
        {
          return i;
          i = j;
        } while (this.mSelectedDeviceName.endsWith("DEVICE_WIREDHEADSET"));
        i = j;
      } while (this.mSelectedDeviceName.endsWith("DEVICE_BLUETOOTHHEADSET"));
      i = j;
    } while (!this.mSelectedDeviceName.endsWith("DEVICE_EARPHONE"));
    return 0;
  }
  
  public native int getDynamicVolume();
  
  public native String getQualityTips();
  
  public native int getVolume();
  
  boolean init(Context paramContext, int paramInt)
  {
    if (!initNative(paramInt)) {
      return false;
    }
    TraeAudioManager.init(paramContext);
    this.mAudioSession = new TraeAudioSession(paramContext, new AVAudioCtrl.1(this));
    this.mAudioSession.startService(this.mAudioSessionType);
    this.mAudioSession.getDeviceList();
    this.mPhoneStatusListener = new AVAudioCtrl.MyPhoneStatusListener(this);
    this.mPhoneStatusMonitor = new PhoneStatusMonitor(paramContext, this.mPhoneStatusListener);
    return true;
  }
  
  native boolean initNative(int paramInt);
  
  native boolean nativeEnableHighQuality(boolean paramBoolean);
  
  native boolean nativeEnableMic(boolean paramBoolean);
  
  native boolean nativeEnableSpeaker(boolean paramBoolean);
  
  native void pauseAudio();
  
  public native int registAudioDataCallback(int paramInt, AVAudioCtrl.RegistAudioDataCompleteCallback paramRegistAudioDataCompleteCallback);
  
  native void resumeAudio();
  
  public native boolean setAudioDataFormat(int paramInt, AVAudioCtrl.AudioFrameDesc paramAudioFrameDesc);
  
  public native int setAudioDataVolume(int paramInt, float paramFloat);
  
  public boolean setAudioOutputMode(int paramInt)
  {
    int j;
    if (paramInt == 0)
    {
      if (this.mDeviceList == null) {
        return false;
      }
      int i = 0;
      label17:
      label62:
      label107:
      do
      {
        j = 0;
        paramInt = i;
        if (j < this.mDeviceList.length)
        {
          paramInt = i;
          if (i == 0)
          {
            if (!"DEVICE_WIREDHEADSET".equals(this.mDeviceList[j])) {
              break;
            }
            this.mAudioSession.connectDevice("DEVICE_WIREDHEADSET");
            paramInt = 1;
          }
        }
        j = 0;
        i = paramInt;
        if (j < this.mDeviceList.length)
        {
          i = paramInt;
          if (paramInt == 0)
          {
            if (!"DEVICE_BLUETOOTHHEADSET".equals(this.mDeviceList[j])) {
              break label165;
            }
            this.mAudioSession.connectDevice("DEVICE_BLUETOOTHHEADSET");
            i = 1;
          }
        }
        j = 0;
        paramInt = i;
        if (j < this.mDeviceList.length)
        {
          paramInt = i;
          if (i == 0)
          {
            if (!"DEVICE_EARPHONE".equals(this.mDeviceList[j])) {
              break label172;
            }
            this.mAudioSession.connectDevice("DEVICE_EARPHONE");
            paramInt = 1;
          }
        }
        i = paramInt;
      } while (paramInt == 0);
    }
    for (;;)
    {
      return true;
      j += 1;
      break label17;
      label165:
      j += 1;
      break label62;
      label172:
      j += 1;
      break label107;
      if (1 != paramInt) {
        break;
      }
      this.mAudioSession.connectDevice("DEVICE_SPEAKERPHONE");
    }
  }
  
  public void setDelegate(AVAudioCtrl.Delegate paramDelegate)
  {
    this.mDelegate = paramDelegate;
  }
  
  public void setIsSystemApp(boolean paramBoolean)
  {
    this.isSystemApp = paramBoolean;
  }
  
  public native void setVolume(int paramInt);
  
  public void startTRAEService()
  {
    if (this.mAudioSession != null)
    {
      this.mAudioSession.startService(this.mAudioSessionType);
      Log.e("SdkJni", "AVAudioCtrl startTRAEService succ");
      return;
    }
    Log.e("SdkJni", "AVAudioCtrl startTRAEService mAudioSession = null");
  }
  
  public void startTRAEServiceWhenIsSystemApp()
  {
    if (this.mAudioSession != null)
    {
      resumeAudio();
      this.mAudioSession.startService(this.mAudioSessionType);
      Log.e("SdkJni", "AVAudioCtrl startTRAEServiceWhenIsSystemApp succ");
      return;
    }
    Log.e("SdkJni", "AVAudioCtrl startTRAEServiceWhenIsSystemApp mAudioSession = null");
  }
  
  public void stopTRAEService()
  {
    if (this.mAudioSession != null)
    {
      Log.e("SdkJni", "AVAudioCtrl stopTRAEService succ");
      this.mAudioSession.stopService();
      return;
    }
    Log.e("SdkJni", "AVAudioCtrl stopTRAEService mAudioSession = null");
  }
  
  public void stopTRAEServiceWhenIsSystemApp()
  {
    if (this.mAudioSession != null)
    {
      Log.e("SdkJni", "AVAudioCtrl stopTRAEServiceWhenIsSystemApp succ");
      pauseAudio();
      this.mAudioSession.stopService();
      return;
    }
    Log.e("SdkJni", "AVAudioCtrl stopTRAEServiceWhenIsSystemApp mAudioSession = null");
  }
  
  void uninit()
  {
    if (this.mAudioSession != null) {
      this.mAudioSession.setCallback(null);
    }
    try
    {
      this.mAudioSession.stopService();
      this.mAudioSession.release();
      this.mAudioSession = null;
      TraeAudioManager.uninit();
    }
    catch (Exception localException)
    {
      for (;;)
      {
        localException = localException;
        this.mAudioSession = null;
      }
    }
    finally
    {
      localObject = finally;
      this.mAudioSession = null;
      throw ((Throwable)localObject);
    }
    if (this.mPhoneStatusMonitor != null)
    {
      this.mPhoneStatusMonitor.uninit();
      this.mPhoneStatusMonitor = null;
    }
    this.mPhoneStatusListener = null;
    uninitNative();
  }
  
  native boolean uninitNative();
  
  public native int unregistAudioDataCallback(int paramInt);
  
  public native int unregistAudioDataCallbackAll();
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\sdk\AVAudioCtrl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */