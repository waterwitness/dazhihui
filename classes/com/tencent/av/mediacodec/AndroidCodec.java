package com.tencent.av.mediacodec;

import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.media.MediaCodec;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecList;
import android.media.MediaFormat;
import android.os.Build;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.Surface;
import com.tencent.av.mediacodec.config.CodecConfigParser;
import com.tencent.av.utils.QLog;
import java.io.File;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

public class AndroidCodec
{
  public static String AVC_CODEC_MIME;
  public static int DEC_CODEC = 0;
  public static int ENC_CODEC = 1;
  public static String ForceIFrame;
  public static final int SUPPORT_AVC_DEC = 1;
  public static final int SUPPORT_AVC_ENC = 2;
  public static final int SUPPORT_HEVC_DEC = 4;
  public static final int SUPPORT_HEVC_ENC = 8;
  public static final int SUPPORT_NONE = 0;
  public static String TAG = "AndroidCodec";
  public static int TIMEOUT_US = 33000;
  protected static boolean gfLoaded;
  protected ByteBuffer[] inputBuffers;
  protected int mCodecType = DEC_CODEC;
  protected MediaFormat mFormat;
  protected MediaCodec mMediaCodec;
  protected MediaFormat mOutputFormat;
  protected ByteBuffer[] outputBuffers;
  
  static
  {
    DEC_CODEC = 0;
    AVC_CODEC_MIME = "video/avc";
    ForceIFrame = "request-sync";
    gfLoaded = false;
  }
  
  public AndroidCodec()
  {
    loadCodecLibrarys();
  }
  
  public static int checkSupportMediaCodecFeature()
  {
    int i = 1;
    if (Build.VERSION.SDK_INT < 16) {}
    while (!gfLoaded) {
      return 0;
    }
    int j;
    if (DeviceCheck.isAVCDecWhitelistDevices())
    {
      if (QLog.isColorLevel()) {
        QLog.d(TAG, 0, "checkSupportMediaCodecFeature device is in decoder white list.");
      }
      if (!DeviceCheck.isAVCDecSupportColorformats()) {
        break label165;
      }
      if (!DeviceCheck.isAVCEncWhitelistDevices()) {
        break label170;
      }
      if (QLog.isColorLevel()) {
        QLog.d(TAG, 0, "checkSupportMediaCodecFeature device is in encoder white list.");
      }
      j = i;
      if (DeviceCheck.isAVCEncSupportColorformats()) {
        j = i + 2;
      }
    }
    for (;;)
    {
      return j;
      CodecConfigParser localCodecConfigParser = new CodecConfigParser();
      String str = localCodecConfigParser.getConfig();
      if (!TextUtils.isEmpty(str))
      {
        localCodecConfigParser.setConfig(str);
        if (QLog.isColorLevel()) {
          QLog.d(TAG, 0, "checkSupportMediaCodecFeature decoder sharpConfigPayload:\n" + str);
        }
        if (localCodecConfigParser.getAVCDecoderAbility())
        {
          if (QLog.isColorLevel()) {
            QLog.d(TAG, 0, "checkSupportMediaCodecFeature hwcodec avc decoder enabled.");
          }
          if (DeviceCheck.isAVCDecSupportColorformats()) {
            break;
          }
        }
      }
      label165:
      i = 0;
      break;
      label170:
      localCodecConfigParser = new CodecConfigParser();
      str = localCodecConfigParser.getConfig();
      j = i;
      if (!TextUtils.isEmpty(str))
      {
        localCodecConfigParser.setConfig(str);
        if (QLog.isColorLevel()) {
          QLog.d(TAG, 0, "checkSupportMediaCodecFeature encoder sharpConfigPayload:\n" + str);
        }
        j = i;
        if (localCodecConfigParser.getAVCEncoderAbility())
        {
          if (QLog.isColorLevel()) {
            QLog.d(TAG, 0, "checkSupportMediaCodecFeature hwcodec avc encoder enabled.");
          }
          j = i;
          if (DeviceCheck.isAVCEncSupportColorformats()) {
            j = i + 2;
          }
        }
      }
    }
  }
  
  public static MediaCodecInfo.CodecCapabilities getCodecCapabilities(MediaCodecInfo paramMediaCodecInfo, String paramString)
  {
    return paramMediaCodecInfo.getCapabilitiesForType(paramString);
  }
  
  public static MediaCodecInfo getCodecInfo(String paramString)
  {
    int j = MediaCodecList.getCodecCount();
    int i = 0;
    while (i < j)
    {
      MediaCodecInfo localMediaCodecInfo = MediaCodecList.getCodecInfoAt(i);
      if (localMediaCodecInfo.getName().equalsIgnoreCase(paramString)) {
        return localMediaCodecInfo;
      }
      i += 1;
    }
    return null;
  }
  
  public static List<MediaCodecInfo> getDecoderInfos(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    int k = MediaCodecList.getCodecCount();
    int i = 0;
    if (i < k)
    {
      MediaCodecInfo localMediaCodecInfo = MediaCodecList.getCodecInfoAt(i);
      if (localMediaCodecInfo.isEncoder()) {}
      for (;;)
      {
        i += 1;
        break;
        if ((!localMediaCodecInfo.getName().contains(".sw.")) && (!localMediaCodecInfo.getName().contains(".SW.")) && (!localMediaCodecInfo.getName().contains("google")) && (!localMediaCodecInfo.getName().contains("Google")) && (!localMediaCodecInfo.getName().contains("GOOGLE")))
        {
          String[] arrayOfString = localMediaCodecInfo.getSupportedTypes();
          int j = 0;
          while (j < arrayOfString.length)
          {
            if (arrayOfString[j].equalsIgnoreCase(paramString)) {
              localArrayList.add(localMediaCodecInfo);
            }
            j += 1;
          }
        }
      }
    }
    return localArrayList;
  }
  
  public static List<MediaCodecInfo> getEndoderInfos(String paramString)
  {
    ArrayList localArrayList = new ArrayList();
    int k = MediaCodecList.getCodecCount();
    int i = 0;
    if (i < k)
    {
      MediaCodecInfo localMediaCodecInfo = MediaCodecList.getCodecInfoAt(i);
      if (!localMediaCodecInfo.isEncoder()) {}
      for (;;)
      {
        i += 1;
        break;
        if ((!localMediaCodecInfo.getName().contains(".sw.")) && (!localMediaCodecInfo.getName().contains(".SW.")) && (!localMediaCodecInfo.getName().contains("google")) && (!localMediaCodecInfo.getName().contains("Google")) && (!localMediaCodecInfo.getName().contains("GOOGLE")))
        {
          String[] arrayOfString = localMediaCodecInfo.getSupportedTypes();
          int j = 0;
          while (j < arrayOfString.length)
          {
            if (arrayOfString[j].equalsIgnoreCase(paramString)) {
              localArrayList.add(localMediaCodecInfo);
            }
            j += 1;
          }
        }
      }
    }
    return localArrayList;
  }
  
  public static void loadCodecLibrarys()
  {
    if (!gfLoaded) {}
    try
    {
      System.loadLibrary("stlport_shared");
      System.loadLibrary("hwcodec");
      int i = NativeCodec.getVersion();
      if ((QLog.isColorLevel()) || (i > 0)) {
        QLog.d(TAG, 0, "Native so version = " + i);
      }
      gfLoaded = true;
      return;
    }
    catch (UnsatisfiedLinkError localUnsatisfiedLinkError)
    {
      localUnsatisfiedLinkError.printStackTrace();
      gfLoaded = false;
    }
  }
  
  private void setCallback(IMediaCodecCallback paramIMediaCodecCallback)
  {
    if (QLog.isColorLevel()) {
      QLog.d(TAG, 0, "setCallback");
    }
    if (Build.VERSION.SDK_INT < 21)
    {
      if (QLog.isColorLevel()) {
        QLog.e(TAG, 0, "setCallback api level lower 21.");
      }
      return;
    }
    this.mMediaCodec.setCallback(new AndroidCodec.1(this, paramIMediaCodecCallback));
  }
  
  public static void setDeviceInfos(Context paramContext)
  {
    if (!new File(paramContext.getApplicationInfo().nativeLibraryDir + "/libhwcodec.so").exists()) {}
    do
    {
      do
      {
        return;
      } while (gfLoaded);
      loadCodecLibrarys();
    } while (!gfLoaded);
    String str = "PRODUCT=" + Build.PRODUCT.toLowerCase() + ";";
    str = str + "MODEL=" + Build.MODEL.toLowerCase() + ";";
    str = str + "SDK=" + Build.VERSION.SDK_INT + ";";
    str = str + "FINGERPRINT=" + Build.FINGERPRINT.toLowerCase() + ";";
    str = str + "MANUFACTURER=" + Build.MANUFACTURER.toLowerCase() + ";";
    paramContext = paramContext.getApplicationInfo();
    str = str + "DATADIR=" + paramContext.dataDir + ";";
    if (Build.VERSION.SDK_INT >= 9) {}
    for (paramContext = str + "LIBDIR=" + paramContext.nativeLibraryDir + ";";; paramContext = str + "LIBDIR=" + paramContext.dataDir + "/lib" + ";")
    {
      NativeCodec.set_device_infos(paramContext);
      return;
    }
  }
  
  public AndroidCodec.BufferData dequeueOutputBuffer()
  {
    for (;;)
    {
      AndroidCodec.BufferData localBufferData;
      int i;
      try
      {
        Object localObject1 = this.mMediaCodec;
        if (localObject1 == null)
        {
          localObject1 = null;
          return (AndroidCodec.BufferData)localObject1;
        }
        localBufferData = new AndroidCodec.BufferData(this);
        i = this.mMediaCodec.dequeueOutputBuffer(localBufferData.info, TIMEOUT_US);
        switch (i)
        {
        case -3: 
          if (i < 0) {
            break label371;
          }
          if (Build.VERSION.SDK_INT > 20) {
            break label322;
          }
          localBufferData.buffer = this.outputBuffers[i];
          localBufferData.index = i;
          localBufferData.format = this.mOutputFormat;
          localObject1 = localBufferData;
          continue;
          if (!QLog.isColorLevel()) {
            break label129;
          }
        }
      }
      finally {}
      QLog.e(TAG, 0, "INFO_OUTPUT_BUFFERS_CHANGED");
      label129:
      this.outputBuffers = this.mMediaCodec.getOutputBuffers();
      localBufferData.index = -3;
      Object localObject3 = localBufferData;
      continue;
      if (QLog.isColorLevel()) {
        QLog.e(TAG, 0, "INFO_OUTPUT_FORMAT_CHANGED");
      }
      localBufferData.index = -2;
      this.mOutputFormat = this.mMediaCodec.getOutputFormat();
      localObject3 = localBufferData;
      if (this.mOutputFormat != null) {
        if (this.mCodecType == DEC_CODEC)
        {
          i = this.mOutputFormat.getInteger("color-format");
          localObject3 = localBufferData;
          if (QLog.isColorLevel())
          {
            QLog.e(TAG, 0, "New color format: " + i + "[0x" + Integer.toHexString(i) + "]");
            localObject3 = localBufferData;
          }
        }
        else
        {
          localObject3 = localBufferData;
          if (QLog.isColorLevel())
          {
            QLog.e(TAG, 0, "EncCodec, INFO_OUTPUT_FORMAT_CHANGED");
            localObject3 = localBufferData;
            continue;
            if (QLog.isColorLevel()) {
              QLog.e(TAG, 0, "dequeueOutputBuffer timed out!");
            }
            localBufferData.index = -1;
            localObject3 = localBufferData;
            continue;
            label322:
            localBufferData.index = i;
            try
            {
              localBufferData.format = this.mMediaCodec.getOutputFormat(i);
              localBufferData.buffer = this.mMediaCodec.getOutputBuffer(i);
              localObject3 = localBufferData;
            }
            catch (IllegalStateException localIllegalStateException)
            {
              localIllegalStateException.printStackTrace();
              localBufferData.success = false;
              localObject4 = localBufferData;
            }
            continue;
            label371:
            localBufferData.index = i;
            localBufferData.success = false;
            Object localObject4 = localBufferData;
          }
        }
      }
    }
  }
  
  public void flush()
  {
    if (this.mMediaCodec != null) {
      this.mMediaCodec.flush();
    }
  }
  
  /* Error */
  public AndroidCodec.BufferData getInputBuffer()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 237	com/tencent/av/mediacodec/AndroidCodec:mMediaCodec	Landroid/media/MediaCodec;
    //   4: ifnonnull +5 -> 9
    //   7: aconst_null
    //   8: areturn
    //   9: new 316	com/tencent/av/mediacodec/AndroidCodec$BufferData
    //   12: dup
    //   13: aload_0
    //   14: invokespecial 319	com/tencent/av/mediacodec/AndroidCodec$BufferData:<init>	(Lcom/tencent/av/mediacodec/AndroidCodec;)V
    //   17: astore_1
    //   18: aload_0
    //   19: getfield 237	com/tencent/av/mediacodec/AndroidCodec:mMediaCodec	Landroid/media/MediaCodec;
    //   22: getstatic 56	com/tencent/av/mediacodec/AndroidCodec:TIMEOUT_US	I
    //   25: i2l
    //   26: invokevirtual 395	android/media/MediaCodec:dequeueInputBuffer	(J)I
    //   29: istore_3
    //   30: iload_3
    //   31: iflt -24 -> 7
    //   34: getstatic 72	android/os/Build$VERSION:SDK_INT	I
    //   37: bipush 20
    //   39: if_icmpgt +29 -> 68
    //   42: aload_0
    //   43: monitorenter
    //   44: aload_1
    //   45: iload_3
    //   46: putfield 335	com/tencent/av/mediacodec/AndroidCodec$BufferData:index	I
    //   49: aload_1
    //   50: aload_0
    //   51: getfield 397	com/tencent/av/mediacodec/AndroidCodec:inputBuffers	[Ljava/nio/ByteBuffer;
    //   54: iload_3
    //   55: aaload
    //   56: putfield 332	com/tencent/av/mediacodec/AndroidCodec$BufferData:buffer	Ljava/nio/ByteBuffer;
    //   59: aload_0
    //   60: monitorexit
    //   61: aload_1
    //   62: areturn
    //   63: astore_1
    //   64: aload_0
    //   65: monitorexit
    //   66: aload_1
    //   67: athrow
    //   68: aload_0
    //   69: monitorenter
    //   70: aload_1
    //   71: iload_3
    //   72: putfield 335	com/tencent/av/mediacodec/AndroidCodec$BufferData:index	I
    //   75: aload_1
    //   76: aload_0
    //   77: getfield 237	com/tencent/av/mediacodec/AndroidCodec:mMediaCodec	Landroid/media/MediaCodec;
    //   80: iload_3
    //   81: invokevirtual 399	android/media/MediaCodec:getInputBuffer	(I)Ljava/nio/ByteBuffer;
    //   84: putfield 332	com/tencent/av/mediacodec/AndroidCodec$BufferData:buffer	Ljava/nio/ByteBuffer;
    //   87: aload_0
    //   88: monitorexit
    //   89: aload_1
    //   90: areturn
    //   91: astore_2
    //   92: aload_2
    //   93: invokevirtual 384	java/lang/IllegalStateException:printStackTrace	()V
    //   96: aload_1
    //   97: iconst_0
    //   98: putfield 387	com/tencent/av/mediacodec/AndroidCodec$BufferData:success	Z
    //   101: goto -14 -> 87
    //   104: astore_1
    //   105: aload_0
    //   106: monitorexit
    //   107: aload_1
    //   108: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	109	0	this	AndroidCodec
    //   17	45	1	localBufferData1	AndroidCodec.BufferData
    //   63	34	1	localBufferData2	AndroidCodec.BufferData
    //   104	4	1	localObject	Object
    //   91	2	2	localIllegalStateException	IllegalStateException
    //   29	52	3	i	int
    // Exception table:
    //   from	to	target	type
    //   44	61	63	finally
    //   64	66	63	finally
    //   75	87	91	java/lang/IllegalStateException
    //   70	75	104	finally
    //   75	87	104	finally
    //   87	89	104	finally
    //   92	101	104	finally
    //   105	107	104	finally
  }
  
  public ByteBuffer getInputBuffer(int paramInt)
  {
    try
    {
      ByteBuffer localByteBuffer = this.mMediaCodec.getInputBuffer(paramInt);
      return localByteBuffer;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      if (QLog.isColorLevel()) {
        QLog.e(TAG, 0, "invoke getInputBuffer exception", localException);
      }
    }
    return null;
  }
  
  public ByteBuffer getOutputBuffer(int paramInt)
  {
    try
    {
      ByteBuffer localByteBuffer = this.mMediaCodec.getOutputBuffer(paramInt);
      return localByteBuffer;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      if (QLog.isColorLevel()) {
        QLog.e(TAG, 0, "invoke getOutputBuffer exception", localException);
      }
    }
    return null;
  }
  
  public MediaFormat getOutputFormat(int paramInt)
  {
    try
    {
      MediaFormat localMediaFormat = this.mMediaCodec.getOutputFormat(paramInt);
      return localMediaFormat;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
      if (QLog.isColorLevel()) {
        QLog.e(TAG, 0, "invoke getOutputFormat exception", localException);
      }
    }
    return null;
  }
  
  public boolean init(MediaFormat paramMediaFormat, int paramInt, IMediaCodecCallback paramIMediaCodecCallback)
  {
    boolean bool = false;
    if (QLog.isColorLevel()) {
      QLog.e(TAG, 0, "init codecType: " + paramInt);
    }
    this.mFormat = paramMediaFormat;
    if (paramInt == DEC_CODEC) {}
    for (;;)
    {
      try
      {
        this.mMediaCodec = MediaCodec.createDecoderByType(this.mFormat.getString("mime"));
        this.mCodecType = paramInt;
      }
      catch (Exception paramMediaFormat)
      {
        paramMediaFormat.printStackTrace();
        if (!QLog.isColorLevel()) {
          continue;
        }
        QLog.e(TAG, 0, "init exception", paramMediaFormat);
        return false;
      }
      try
      {
        if (this.mMediaCodec != null)
        {
          if (paramInt != ENC_CODEC) {
            break label220;
          }
          paramInt = 1;
          if ((paramIMediaCodecCallback != null) && (DeviceCheck.isSupportAsyncAPI())) {
            setCallback(paramIMediaCodecCallback);
          }
          this.mMediaCodec.configure(this.mFormat, null, null, paramInt);
        }
        if (this.mMediaCodec != null) {
          bool = true;
        }
      }
      catch (Exception paramMediaFormat)
      {
        paramMediaFormat.printStackTrace();
        if (!QLog.isColorLevel()) {
          continue;
        }
        QLog.e(TAG, 0, "init exception", paramMediaFormat);
        return false;
      }
      return bool;
      try
      {
        this.mMediaCodec = MediaCodec.createEncoderByType(this.mFormat.getString("mime"));
      }
      catch (Exception paramMediaFormat)
      {
        paramMediaFormat.printStackTrace();
      }
      if (QLog.isColorLevel())
      {
        QLog.e(TAG, 0, "init exception", paramMediaFormat);
        return false;
        label220:
        paramInt = 0;
      }
    }
  }
  
  public boolean init(MediaFormat paramMediaFormat, String paramString, Surface paramSurface, IMediaCodecCallback paramIMediaCodecCallback)
  {
    if (QLog.isColorLevel()) {
      QLog.e(TAG, 0, "init name: " + paramString);
    }
    this.mFormat = paramMediaFormat;
    for (;;)
    {
      try
      {
        this.mMediaCodec = MediaCodec.createByCodecName(paramString);
        paramMediaFormat = getCodecInfo(paramString);
        if ((paramMediaFormat != null) && (paramMediaFormat.isEncoder()))
        {
          this.mCodecType = ENC_CODEC;
          i = 1;
          return false;
        }
      }
      catch (Exception paramMediaFormat)
      {
        try
        {
          if (this.mMediaCodec != null)
          {
            if ((paramIMediaCodecCallback != null) && (DeviceCheck.isSupportAsyncAPI())) {
              setCallback(paramIMediaCodecCallback);
            }
            this.mMediaCodec.configure(this.mFormat, paramSurface, null, i);
          }
          if (this.mMediaCodec == null) {
            break label168;
          }
          return true;
        }
        catch (Exception paramMediaFormat)
        {
          paramMediaFormat.printStackTrace();
          if (!QLog.isColorLevel()) {
            break label166;
          }
          QLog.e(TAG, 0, "init exception", paramMediaFormat);
          return false;
        }
        paramMediaFormat = paramMediaFormat;
        paramMediaFormat.printStackTrace();
        if (QLog.isColorLevel()) {
          QLog.e(TAG, 0, "init exception", paramMediaFormat);
        }
        return false;
      }
      label166:
      label168:
      int i = 0;
    }
  }
  
  public boolean init(MediaFormat paramMediaFormat, String paramString, IMediaCodecCallback paramIMediaCodecCallback)
  {
    if (QLog.isColorLevel()) {
      QLog.e(TAG, 0, "init name: " + paramString);
    }
    this.mFormat = paramMediaFormat;
    paramMediaFormat = getCodecInfo(paramString);
    if ((paramMediaFormat != null) && (paramMediaFormat.isEncoder())) {
      this.mCodecType = ENC_CODEC;
    }
    for (int i = 1;; i = 0) {
      try
      {
        this.mMediaCodec = MediaCodec.createByCodecName(paramString);
        return false;
      }
      catch (Exception paramMediaFormat)
      {
        try
        {
          if (this.mMediaCodec != null)
          {
            if ((paramIMediaCodecCallback != null) && (DeviceCheck.isSupportAsyncAPI())) {
              setCallback(paramIMediaCodecCallback);
            }
            this.mMediaCodec.configure(this.mFormat, null, null, i);
          }
          if (this.mMediaCodec == null) {
            continue;
          }
          return true;
        }
        catch (Exception paramMediaFormat)
        {
          paramMediaFormat.printStackTrace();
          if (!QLog.isColorLevel()) {
            continue;
          }
          QLog.e(TAG, 0, "init exception", paramMediaFormat);
          return false;
        }
        paramMediaFormat = paramMediaFormat;
        paramMediaFormat.printStackTrace();
        if (QLog.isColorLevel()) {
          QLog.e(TAG, 0, "init exception", paramMediaFormat);
        }
        return false;
      }
    }
  }
  
  /* Error */
  public void queueInputBuffer(int paramInt1, int paramInt2, long paramLong, int paramInt3)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 237	com/tencent/av/mediacodec/AndroidCodec:mMediaCodec	Landroid/media/MediaCodec;
    //   6: astore 6
    //   8: aload 6
    //   10: ifnonnull +6 -> 16
    //   13: aload_0
    //   14: monitorexit
    //   15: return
    //   16: aload_0
    //   17: getfield 237	com/tencent/av/mediacodec/AndroidCodec:mMediaCodec	Landroid/media/MediaCodec;
    //   20: iload_1
    //   21: iconst_0
    //   22: iload_2
    //   23: lload_3
    //   24: iload 5
    //   26: invokevirtual 455	android/media/MediaCodec:queueInputBuffer	(IIIJI)V
    //   29: goto -16 -> 13
    //   32: astore 6
    //   34: invokestatic 83	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   37: ifeq -24 -> 13
    //   40: getstatic 53	com/tencent/av/mediacodec/AndroidCodec:TAG	Ljava/lang/String;
    //   43: iconst_0
    //   44: ldc_w 457
    //   47: aload 6
    //   49: invokestatic 407	com/tencent/av/utils/QLog:e	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Exception;)V
    //   52: goto -39 -> 13
    //   55: astore 6
    //   57: aload_0
    //   58: monitorexit
    //   59: aload 6
    //   61: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	62	0	this	AndroidCodec
    //   0	62	1	paramInt1	int
    //   0	62	2	paramInt2	int
    //   0	62	3	paramLong	long
    //   0	62	5	paramInt3	int
    //   6	3	6	localMediaCodec	MediaCodec
    //   32	16	6	localException	Exception
    //   55	5	6	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   16	29	32	java/lang/Exception
    //   2	8	55	finally
    //   16	29	55	finally
    //   34	52	55	finally
  }
  
  public void release()
  {
    try
    {
      this.inputBuffers = null;
      this.outputBuffers = null;
      if (this.mMediaCodec != null)
      {
        this.mMediaCodec.release();
        this.mMediaCodec = null;
      }
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  /* Error */
  public void releaseOutputBuffer(int paramInt)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 237	com/tencent/av/mediacodec/AndroidCodec:mMediaCodec	Landroid/media/MediaCodec;
    //   6: astore_2
    //   7: aload_2
    //   8: ifnonnull +6 -> 14
    //   11: aload_0
    //   12: monitorexit
    //   13: return
    //   14: aload_0
    //   15: getfield 237	com/tencent/av/mediacodec/AndroidCodec:mMediaCodec	Landroid/media/MediaCodec;
    //   18: iload_1
    //   19: iconst_0
    //   20: invokevirtual 465	android/media/MediaCodec:releaseOutputBuffer	(IZ)V
    //   23: goto -12 -> 11
    //   26: astore_2
    //   27: aload_0
    //   28: monitorexit
    //   29: aload_2
    //   30: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	31	0	this	AndroidCodec
    //   0	31	1	paramInt	int
    //   6	2	2	localMediaCodec	MediaCodec
    //   26	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   2	7	26	finally
    //   14	23	26	finally
  }
  
  public void reset() {}
  
  public void setParameters(Bundle paramBundle)
  {
    if (Build.VERSION.SDK_INT < 19) {}
    while (this.mMediaCodec == null) {
      return;
    }
    try
    {
      this.mMediaCodec.setParameters(paramBundle);
      return;
    }
    catch (IllegalStateException paramBundle)
    {
      paramBundle.printStackTrace();
    }
  }
  
  public void setSurface(Surface paramSurface) {}
  
  public boolean start()
  {
    try
    {
      if (this.mMediaCodec != null)
      {
        this.mMediaCodec.start();
        if (Build.VERSION.SDK_INT <= 20) {
          try
          {
            this.inputBuffers = this.mMediaCodec.getInputBuffers();
            this.outputBuffers = this.mMediaCodec.getOutputBuffers();
          }
          finally {}
        }
      }
      else
      {
        return false;
      }
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
    return true;
  }
  
  public void stop()
  {
    if (this.mMediaCodec != null) {
      this.mMediaCodec.stop();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\mediacodec\AndroidCodec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */