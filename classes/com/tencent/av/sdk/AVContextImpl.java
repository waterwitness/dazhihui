package com.tencent.av.sdk;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Looper;
import android.util.Log;
import android.view.SurfaceHolder;
import com.tencent.TIMManager;
import com.tencent.av.mediacodec.AndroidCodec;
import com.tencent.av.opengl.GraphicRendererMgr;
import com.tencent.av.utils.PhoneStatusTools;
import java.io.File;

class AVContextImpl
  extends AVContext
{
  private static final String TAG = "SdkJni";
  private static boolean sLoadLibrary = false;
  private Context mAppContext = null;
  private AVAudioCtrl mAudioCtrl = null;
  private int mNativeEntity = 0;
  
  private static void configUpdate()
  {
    Log.i("SdkJni", "configUpdate");
    int i = AndroidCodec.checkSupportMediaCodecFeature();
    Log.i("SdkJni", "[Rson] check hardware feature: " + i);
    String str;
    if (i > 0) {
      if ((i & 0x1) == 1)
      {
        str = "" + "HW_AVC_DEC=1;";
        if ((i & 0x2) != 2) {
          break label181;
        }
        str = str + "HW_AVC_ENC=1;";
        label96:
        if ((i & 0x4) != 4) {
          break label204;
        }
        str = str + "HW_HEVC_DEC=1;";
        label123:
        if ((i & 0x8) != 8) {
          break label227;
        }
        str = str + "HW_HEVC_ENC=1;";
      }
    }
    for (;;)
    {
      nativeUpdateConfig(str);
      return;
      str = "" + "HW_AVC_DEC=0;";
      break;
      label181:
      str = str + "HW_AVC_ENC=0;";
      break label96;
      label204:
      str = str + "HW_HEVC_DEC=0;";
      break label123;
      label227:
      str = str + "HW_HEVC_ENC=0;";
      continue;
      str = "" + "HW_AVC_ENC=0;";
      str = str + "HW_AVC_DEC=0;";
      str = str + "HW_HEVC_DEC=0;";
      str = str + "HW_HEVC_ENC=0;";
    }
  }
  
  public static String getVersion()
  {
    if (loadSdkLibrary()) {
      return nativeGetVersion();
    }
    return "";
  }
  
  @SuppressLint({"NewApi"})
  private void initDeviceInfos(Context paramContext)
  {
    Object localObject = "PRODUCT=" + Build.PRODUCT + ";";
    localObject = (String)localObject + "CPU_ABI=" + Build.CPU_ABI + ";";
    localObject = (String)localObject + "TAGS=" + Build.TAGS + ";";
    localObject = (String)localObject + "VERSION_CODES_BASE=1;";
    localObject = (String)localObject + "MODEL=" + Build.MODEL + ";";
    localObject = (String)localObject + "SDK=" + Build.VERSION.SDK_INT + ";";
    localObject = (String)localObject + "VERSION_RELEASE=" + Build.VERSION.RELEASE + ";";
    localObject = (String)localObject + "DEVICE=" + Build.DEVICE + ";";
    localObject = (String)localObject + "DISPLAY=" + Build.DISPLAY + ";";
    localObject = (String)localObject + "BRAND=" + Build.BRAND + ";";
    localObject = (String)localObject + "BOARD=" + Build.BOARD + ";";
    localObject = (String)localObject + "FINGERPRINT=" + Build.FINGERPRINT + ";";
    localObject = (String)localObject + "ID=" + Build.ID + ";";
    localObject = (String)localObject + "MANUFACTURER=" + Build.MANUFACTURER + ";";
    localObject = (String)localObject + "USER=" + Build.USER + ";";
    String str = (String)localObject + "PROCESSORS=" + Runtime.getRuntime().availableProcessors() + ";";
    localObject = paramContext.getApplicationInfo();
    str = str + "DATADIR=" + ((ApplicationInfo)localObject).dataDir + ";";
    if (Build.VERSION.SDK_INT >= 9)
    {
      localObject = str + "LIBDIR=" + ((ApplicationInfo)localObject).nativeLibraryDir + ";";
      AndroidCodec.setDeviceInfos(paramContext);
      int i = AndroidCodec.checkSupportMediaCodecFeature();
      Log.i("SdkJni", "[Rson] check hardware feature: " + i);
      if (i <= 0) {
        break label853;
      }
      if ((i & 0x1) != 1) {
        break label761;
      }
      paramContext = (String)localObject + "HW_AVC_DEC=1;";
      label629:
      if ((i & 0x2) != 2) {
        break label784;
      }
      paramContext = paramContext + "HW_AVC_ENC=1;";
      label657:
      if ((i & 0x4) != 4) {
        break label807;
      }
      paramContext = paramContext + "HW_HEVC_DEC=1;";
      label685:
      if ((i & 0x8) != 8) {
        break label830;
      }
      paramContext = paramContext + "HW_HEVC_ENC=1;";
    }
    for (;;)
    {
      nativeSetAndroidAppPath(paramContext);
      return;
      localObject = str + "LIBDIR=" + ((ApplicationInfo)localObject).dataDir + "/lib" + ";";
      break;
      label761:
      paramContext = (String)localObject + "HW_AVC_DEC=0;";
      break label629;
      label784:
      paramContext = paramContext + "HW_AVC_ENC=0;";
      break label657;
      label807:
      paramContext = paramContext + "HW_HEVC_DEC=0;";
      break label685;
      label830:
      paramContext = paramContext + "HW_HEVC_ENC=0;";
      continue;
      label853:
      paramContext = (String)localObject + "HW_AVC_ENC=0;";
      paramContext = paramContext + "HW_AVC_DEC=0;";
      paramContext = paramContext + "HW_HEVC_DEC=0;";
      paramContext = paramContext + "HW_HEVC_ENC=0;";
    }
  }
  
  private static boolean loadSdkLibrary()
  {
    if (!sLoadLibrary) {}
    try
    {
      System.loadLibrary("stlport_shared");
      System.loadLibrary("xplatform");
      System.loadLibrary("qavsdk");
      sLoadLibrary = true;
      return sLoadLibrary;
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
    {
      for (;;)
      {
        localUnsatisfiedLinkError.printStackTrace();
      }
    }
  }
  
  private native int nativeCreate(Context paramContext, AVContext.Config paramConfig);
  
  private native void nativeDestroy(int paramInt);
  
  private native int nativeEnterRoom(int paramInt1, Context paramContext, int paramInt2, AVRoom.Delegate paramDelegate, AVRoom.EnterRoomParam paramEnterRoomParam);
  
  private native int nativeExitRoom(int paramInt);
  
  private native AVRoom nativeGetRoom(int paramInt);
  
  private static native String nativeGetVersion();
  
  private native AVVideoCtrl nativeGetVideoCtrl(int paramInt);
  
  private native void nativeInitNetType(int paramInt1, int paramInt2);
  
  private native void nativeSetAndroidAppPath(String paramString);
  
  private native void nativeSetHolder(int paramInt, SurfaceHolder paramSurfaceHolder);
  
  private native void nativeSetLocalConfigDirectory(String paramString);
  
  private native void nativeSetRenderFunctionPtr(int paramInt1, int paramInt2);
  
  private native void nativeSetRenderMgrAndHolder(int paramInt1, int paramInt2, SurfaceHolder paramSurfaceHolder);
  
  private native void nativeSetTwoSecondReportPath(String paramString);
  
  private native int nativeStart(int paramInt, AVContext.StartCallback paramStartCallback);
  
  private native int nativeStop(int paramInt, AVContext.StopCallback paramStopCallback);
  
  private static native void nativeUpdateConfig(String paramString);
  
  public boolean create(Context paramContext, AVContext.Config paramConfig)
  {
    if (Looper.myLooper() != Looper.getMainLooper()) {
      Log.e("SdkJni", "create context not in main thread");
    }
    do
    {
      return false;
      if (loadSdkLibrary())
      {
        this.mAppContext = paramContext.getApplicationContext();
        this.mNativeEntity = nativeCreate(paramContext, paramConfig);
      }
    } while (this.mNativeEntity == 0);
    return true;
  }
  
  public void destroy()
  {
    if (this.mAudioCtrl != null)
    {
      this.mAudioCtrl.uninit();
      this.mAudioCtrl = null;
    }
    nativeDestroy(this.mNativeEntity);
    this.mNativeEntity = 0;
    this.mAppContext = null;
  }
  
  public int enterRoom(int paramInt, AVRoom.Delegate paramDelegate, AVRoom.EnterRoomParam paramEnterRoomParam)
  {
    if (this.mAppContext != null) {
      nativeInitNetType(this.mNativeEntity, PhoneStatusTools.getNetWorkType(this.mAppContext));
    }
    return nativeEnterRoom(this.mNativeEntity, this.mAppContext, paramInt, paramDelegate, paramEnterRoomParam);
  }
  
  public int exitRoom()
  {
    return nativeExitRoom(this.mNativeEntity);
  }
  
  public AVAudioCtrl getAudioCtrl()
  {
    if (this.mAudioCtrl == null)
    {
      this.mAudioCtrl = new AVAudioCtrl();
      this.mAudioCtrl.init(this.mAppContext, this.mNativeEntity);
    }
    return this.mAudioCtrl;
  }
  
  public AVRoom getRoom()
  {
    return nativeGetRoom(this.mNativeEntity);
  }
  
  public AVVideoCtrl getVideoCtrl()
  {
    return nativeGetVideoCtrl(this.mNativeEntity);
  }
  
  public void setHolder(SurfaceHolder paramSurfaceHolder)
  {
    nativeSetHolder(this.mNativeEntity, paramSurfaceHolder);
  }
  
  public void setRenderFunctionPtr(int paramInt)
  {
    nativeSetRenderFunctionPtr(this.mNativeEntity, paramInt);
  }
  
  public void setRenderMgrAndHolder(GraphicRendererMgr paramGraphicRendererMgr, SurfaceHolder paramSurfaceHolder)
  {
    nativeSetRenderMgrAndHolder(this.mNativeEntity, paramGraphicRendererMgr.getRecvDecoderFrameFunctionptr(), paramSurfaceHolder);
  }
  
  public int start(AVContext.StartCallback paramStartCallback)
  {
    String str = getVersion();
    if (str == null) {
      Log.e("SdkJni", "getVersion() null");
    }
    for (;;)
    {
      initDeviceInfos(this.mAppContext);
      nativeSetTwoSecondReportPath(TIMManager.getInstance().getLogPath());
      nativeSetLocalConfigDirectory(this.mAppContext.getFilesDir().getAbsolutePath() + "/");
      return nativeStart(this.mNativeEntity, paramStartCallback);
      Log.i("SdkJni", "version :" + str);
      IMChannel.setAvSDKVersionToBugly(str);
    }
  }
  
  public int stop(AVContext.StopCallback paramStopCallback)
  {
    return nativeStop(this.mNativeEntity, paramStopCallback);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\sdk\AVContextImpl.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */