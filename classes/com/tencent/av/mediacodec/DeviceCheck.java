package com.tencent.av.mediacodec;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.content.res.Resources;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.tencent.av.mediacodec.config.CodecConfigParser;
import com.tencent.av.utils.QLog;
import java.util.List;

@SuppressLint({"NewApi"})
public class DeviceCheck
  implements Runnable
{
  public static final String TAG = "DeviceCheck";
  int mDataSource = -1;
  Resources mRes;
  Thread mThread;
  
  public DeviceCheck(Resources paramResources)
  {
    this.mRes = paramResources;
  }
  
  static boolean checkDecoderSupportColorFormat(int paramInt)
  {
    switch (paramInt)
    {
    default: 
      return false;
    }
    return true;
  }
  
  static boolean checkEncoderSupportColorFormat(int paramInt)
  {
    switch (paramInt)
    {
    case 20: 
    default: 
      return false;
    }
    return true;
  }
  
  public static boolean forceSyncAPI()
  {
    return false;
  }
  
  @SuppressLint({"NewApi"})
  @TargetApi(16)
  public static boolean isAVCDecSupportColorformats()
  {
    boolean bool2 = false;
    List localList = AndroidCodec.getDecoderInfos(AndroidCodec.AVC_CODEC_MIME);
    int i = 0;
    for (;;)
    {
      boolean bool1 = bool2;
      MediaCodecInfo.CodecCapabilities localCodecCapabilities;
      int j;
      if (i < localList.size())
      {
        localCodecCapabilities = AndroidCodec.getCodecCapabilities((MediaCodecInfo)localList.get(i), AndroidCodec.AVC_CODEC_MIME);
        j = 0;
      }
      while (j < localCodecCapabilities.colorFormats.length)
      {
        if (checkDecoderSupportColorFormat(localCodecCapabilities.colorFormats[j]))
        {
          bool1 = true;
          return bool1;
        }
        j += 1;
      }
      i += 1;
    }
  }
  
  public static boolean isAVCDecWhitelistDevices()
  {
    return false;
  }
  
  @SuppressLint({"NewApi"})
  @TargetApi(16)
  public static boolean isAVCEncSupportColorformats()
  {
    boolean bool2 = false;
    List localList = AndroidCodec.getEndoderInfos(AndroidCodec.AVC_CODEC_MIME);
    int i = 0;
    for (;;)
    {
      boolean bool1 = bool2;
      MediaCodecInfo.CodecCapabilities localCodecCapabilities;
      int j;
      if (i < localList.size())
      {
        localCodecCapabilities = AndroidCodec.getCodecCapabilities((MediaCodecInfo)localList.get(i), AndroidCodec.AVC_CODEC_MIME);
        j = 0;
      }
      while (j < localCodecCapabilities.colorFormats.length)
      {
        if (checkEncoderSupportColorFormat(localCodecCapabilities.colorFormats[j]))
        {
          bool1 = true;
          return bool1;
        }
        j += 1;
      }
      i += 1;
    }
  }
  
  public static boolean isAVCEncWhitelistDevices()
  {
    return false;
  }
  
  public static boolean isSupportAsyncAPI()
  {
    if (forceSyncAPI()) {}
    CodecConfigParser localCodecConfigParser;
    do
    {
      String str;
      do
      {
        do
        {
          return false;
        } while (Build.VERSION.SDK_INT < 21);
        localCodecConfigParser = new CodecConfigParser();
        str = localCodecConfigParser.getConfig();
      } while (TextUtils.isEmpty(str));
      localCodecConfigParser.setConfig(str);
      if (QLog.isColorLevel()) {
        QLog.d("DeviceCheck", 0, "isSupportAsyncAPI sharpConfigPayload:\n" + str);
      }
    } while ((!localCodecConfigParser.getAVCEncoderAbility()) || (!localCodecConfigParser.isEnableAsyncApi(2)) || (!localCodecConfigParser.getAVCDecoderAbility()) || (!localCodecConfigParser.isEnableAsyncApi(1)));
    if (QLog.isColorLevel()) {
      QLog.d("DeviceCheck", 0, "SUPPORT Async API");
    }
    return true;
  }
  
  public void run() {}
  
  public void setDataSource(int paramInt)
  {
    this.mDataSource = paramInt;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\mediacodec\DeviceCheck.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */