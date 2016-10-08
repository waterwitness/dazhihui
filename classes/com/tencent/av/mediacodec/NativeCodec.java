package com.tencent.av.mediacodec;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodecInfo;
import android.media.MediaCodecInfo.CodecCapabilities;
import android.media.MediaCodecInfo.CodecProfileLevel;
import android.media.MediaFormat;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.v4.c.f;
import com.tencent.av.utils.ArrayUtils;
import com.tencent.av.utils.QLog;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

@TargetApi(16)
public class NativeCodec
  implements IMediaCodecCallback
{
  public static String BOTTOM;
  public static String LEFT;
  public static String PPS = "csd-1";
  public static String RIGHT;
  public static String SLICEHEIGHT = "slice-height";
  public static String SPS;
  public static String STRIDE;
  private static final String TAG = "NativeCodec";
  public static String TOP;
  static NativeCodec.AVCCaps gAVCDecoderCaps;
  static NativeCodec.AVCCaps gAVCEncoderCaps;
  public static boolean mUseAsyncAPI = false;
  int mBitRate;
  AndroidCodec mCodec;
  AtomicBoolean mCodersExit = new AtomicBoolean(false);
  int mColorFormat;
  boolean mDebugDelay = false;
  f<Long> mDebugDelayMap = null;
  f<Long> mDebugDelayMap2 = null;
  f<Long> mDebugIndexMap = null;
  String mDebugTag = null;
  MediaFormat mFormat = null;
  int mFrameInverval = 40000;
  int mFrameRate = 20;
  int mHeight = 240;
  long mLastEncFrameTime = 0L;
  String mMime;
  private int mNativeContext = 0;
  List<AndroidCodec.InputBufferData> mPendingInputBuffers = new ArrayList();
  long mTimeStamp = 0L;
  int mTryAgainLaterCount = 0;
  int mTryAgainLaterCount2 = 0;
  int mWidth = 320;
  boolean misdecoder;
  int setBitRatePending = 0;
  boolean setIFramePending = false;
  
  static
  {
    LEFT = "crop-left";
    TOP = "crop-top";
    RIGHT = "crop-right";
    BOTTOM = "crop-bottom";
    STRIDE = "stride";
    SPS = "csd-0";
  }
  
  public NativeCodec() {}
  
  @SuppressLint({"NewApi"})
  @TargetApi(16)
  public NativeCodec(String paramString, Map<String, Object> paramMap, boolean paramBoolean)
  {
    this.mMime = paramString;
    this.misdecoder = paramBoolean;
    this.mWidth = ((Integer)paramMap.get("width")).intValue();
    this.mHeight = ((Integer)paramMap.get("height")).intValue();
    if (this.misdecoder)
    {
      try
      {
        int i = this.mWidth;
        int j = this.mHeight;
        this.mFormat = MediaFormat.createVideoFormat(paramString, i, j);
        this.mFormat.setInteger("max-input-size", i * j);
        this.mFormat.setInteger("color-format", 21);
        this.mFormat.setInteger("frame-rate", 25);
        if (paramString.contains(AndroidCodec.AVC_CODEC_MIME))
        {
          paramString = (ByteBuffer)paramMap.get(SPS);
          paramMap = (ByteBuffer)paramMap.get(PPS);
          this.mFormat.setByteBuffer(SPS, paramString);
          this.mFormat.setByteBuffer(PPS, paramMap);
        }
        if (QLog.isColorLevel()) {
          QLog.d("NativeCodec", 0, "width =" + i + ", height =" + j);
        }
        createDecCodec();
      }
      catch (Exception paramString)
      {
        for (;;)
        {
          label384:
          paramString.printStackTrace();
          if (QLog.isColorLevel()) {
            QLog.e("NativeCodec", 0, "NativeCodec", paramString);
          }
          this.mCodec = null;
        }
      }
      if (this.mDebugDelay)
      {
        this.mDebugDelayMap = new f();
        this.mDebugDelayMap2 = new f();
        this.mDebugIndexMap = new f();
        if (!mUseAsyncAPI) {
          break label526;
        }
        paramString = "Async";
        this.mDebugTag = paramString;
        paramMap = new StringBuilder().append(this.mDebugTag);
        if (!this.misdecoder) {
          break label533;
        }
      }
    }
    label526:
    label533:
    for (paramString = "DEC";; paramString = "ENC")
    {
      this.mDebugTag = paramString;
      return;
      try
      {
        this.mBitRate = ((Integer)paramMap.get("bitrate")).intValue();
        this.mFrameRate = ((Integer)paramMap.get("frame-rate")).intValue();
        createEncCodec();
      }
      catch (Exception paramString)
      {
        paramString.printStackTrace();
        if (QLog.isColorLevel()) {
          QLog.e("NativeCodec", 0, "NativeCodec", paramString);
        }
        this.mCodec = null;
      }
      break;
      paramString = " Sync";
      break label384;
    }
  }
  
  private void createDecCodec()
  {
    this.mCodec = new AndroidCodec();
    List localList;
    MediaCodecInfo localMediaCodecInfo;
    int i;
    if (this.misdecoder)
    {
      localList = AndroidCodec.getDecoderInfos(this.mMime);
      localMediaCodecInfo = (MediaCodecInfo)localList.get(0);
      i = 0;
    }
    for (;;)
    {
      Object localObject = localMediaCodecInfo;
      if (i < localList.size())
      {
        localObject = AndroidCodec.getCodecCapabilities((MediaCodecInfo)localList.get(i), this.mMime);
        if (!ArrayUtils.contains(((MediaCodecInfo.CodecCapabilities)localObject).colorFormats, 19)) {
          break label132;
        }
        localObject = (MediaCodecInfo)localList.get(i);
        this.mFormat.setInteger("color-format", 19);
      }
      for (;;)
      {
        if (!this.mCodec.init(this.mFormat, ((MediaCodecInfo)localObject).getName(), this)) {
          this.mCodec = null;
        }
        return;
        label132:
        if (!ArrayUtils.contains(((MediaCodecInfo.CodecCapabilities)localObject).colorFormats, 21)) {
          break;
        }
        localObject = (MediaCodecInfo)localList.get(i);
        this.mFormat.setInteger("color-format", 21);
      }
      i += 1;
    }
  }
  
  private static int getIntValues(String paramString1, String paramString2, boolean paramBoolean)
  {
    if (QLog.isColorLevel()) {
      QLog.d("NativeCodec", 0, "getIntValues mime: " + paramString1 + ", key: " + paramString2);
    }
    if (Build.VERSION.SDK_INT < 16) {}
    do
    {
      do
      {
        do
        {
          return 0;
          if (!"supportAsync".equalsIgnoreCase(paramString2)) {
            break;
          }
          mUseAsyncAPI = DeviceCheck.isSupportAsyncAPI();
        } while (!mUseAsyncAPI);
        return 1;
        if ((!paramString1.equalsIgnoreCase(AndroidCodec.AVC_CODEC_MIME)) || (!paramBoolean)) {
          break;
        }
        if (gAVCDecoderCaps == null) {
          initAVCDecoderCaps();
        }
        if (paramString2.equalsIgnoreCase("width")) {
          return gAVCDecoderCaps.width;
        }
        if (paramString2.equalsIgnoreCase("height")) {
          return gAVCDecoderCaps.height;
        }
      } while (!paramString2.equalsIgnoreCase("profile"));
      return gAVCDecoderCaps.profile;
      if (gAVCEncoderCaps == null) {
        initAVCEncoderCaps();
      }
      if (paramString2.equalsIgnoreCase("width")) {
        return gAVCEncoderCaps.width;
      }
      if (paramString2.equalsIgnoreCase("height")) {
        return gAVCEncoderCaps.height;
      }
    } while (!paramString2.equalsIgnoreCase("profile"));
    return gAVCEncoderCaps.profile;
  }
  
  public static native int getVersion();
  
  private static void initAVCDecoderCaps()
  {
    MediaCodecInfo.CodecCapabilities localCodecCapabilities = AndroidCodec.getCodecCapabilities((MediaCodecInfo)AndroidCodec.getDecoderInfos(AndroidCodec.AVC_CODEC_MIME).get(0), AndroidCodec.AVC_CODEC_MIME);
    gAVCDecoderCaps = new NativeCodec.AVCCaps();
    int i = 0;
    if (i < localCodecCapabilities.profileLevels.length)
    {
      switch (localCodecCapabilities.profileLevels[i].profile)
      {
      default: 
        label120:
        switch (localCodecCapabilities.profileLevels[i].level)
        {
        }
        break;
      }
      for (;;)
      {
        i += 1;
        break;
        if (gAVCDecoderCaps.profile > 3) {
          break label120;
        }
        gAVCDecoderCaps.profile = 3;
        break label120;
        if (gAVCDecoderCaps.profile > 5) {
          break label120;
        }
        gAVCDecoderCaps.profile = 5;
        break label120;
        if (gAVCDecoderCaps.profile > 5) {
          break label120;
        }
        gAVCDecoderCaps.profile = 5;
        break label120;
        if (gAVCDecoderCaps.profile > 5) {
          break label120;
        }
        gAVCDecoderCaps.profile = 5;
        break label120;
        if (gAVCDecoderCaps.profile > 5) {
          break label120;
        }
        gAVCDecoderCaps.profile = 5;
        break label120;
        if (gAVCDecoderCaps.profile > 5) {
          break label120;
        }
        gAVCDecoderCaps.profile = 5;
        break label120;
        if (gAVCDecoderCaps.profile > 4) {
          break label120;
        }
        gAVCDecoderCaps.profile = 4;
        break label120;
        if ((gAVCDecoderCaps.width < 176) || (gAVCDecoderCaps.height < 144))
        {
          gAVCDecoderCaps.width = 176;
          gAVCDecoderCaps.height = 144;
          continue;
          if ((gAVCDecoderCaps.width < 352) || (gAVCDecoderCaps.height < 288))
          {
            gAVCDecoderCaps.width = 352;
            gAVCDecoderCaps.height = 288;
            continue;
            if ((gAVCDecoderCaps.width < 352) || (gAVCDecoderCaps.height < 288))
            {
              gAVCDecoderCaps.width = 352;
              gAVCDecoderCaps.height = 288;
              continue;
              if ((gAVCDecoderCaps.width < 352) || (gAVCDecoderCaps.height < 288))
              {
                gAVCDecoderCaps.width = 352;
                gAVCDecoderCaps.height = 288;
                continue;
                if ((gAVCDecoderCaps.width < 352) || (gAVCDecoderCaps.height < 288))
                {
                  gAVCDecoderCaps.width = 352;
                  gAVCDecoderCaps.height = 288;
                  continue;
                  if ((gAVCDecoderCaps.width < 352) || (gAVCDecoderCaps.height < 288))
                  {
                    gAVCDecoderCaps.width = 352;
                    gAVCDecoderCaps.height = 288;
                    continue;
                    if ((gAVCDecoderCaps.width < 352) || (gAVCDecoderCaps.height < 576))
                    {
                      gAVCDecoderCaps.width = 352;
                      gAVCDecoderCaps.height = 576;
                      continue;
                      if ((gAVCDecoderCaps.width < 720) || (gAVCDecoderCaps.height < 576))
                      {
                        gAVCDecoderCaps.width = 720;
                        gAVCDecoderCaps.height = 576;
                        continue;
                        if ((gAVCDecoderCaps.width < 720) || (gAVCDecoderCaps.height < 576))
                        {
                          gAVCDecoderCaps.width = 720;
                          gAVCDecoderCaps.height = 576;
                          continue;
                          if ((gAVCDecoderCaps.width < 1280) || (gAVCDecoderCaps.height < 720))
                          {
                            gAVCDecoderCaps.width = 1280;
                            gAVCDecoderCaps.height = 720;
                            continue;
                            if ((gAVCDecoderCaps.width < 1280) || (gAVCDecoderCaps.height < 1024))
                            {
                              gAVCDecoderCaps.width = 1280;
                              gAVCDecoderCaps.height = 1024;
                              continue;
                              if ((gAVCDecoderCaps.width < 2048) || (gAVCDecoderCaps.height < 1024))
                              {
                                gAVCDecoderCaps.width = 2048;
                                gAVCDecoderCaps.height = 1024;
                                continue;
                                if ((gAVCDecoderCaps.width < 2048) || (gAVCDecoderCaps.height < 1024))
                                {
                                  gAVCDecoderCaps.width = 2048;
                                  gAVCDecoderCaps.height = 1024;
                                  continue;
                                  if ((gAVCDecoderCaps.width < 2048) || (gAVCDecoderCaps.height < 1088))
                                  {
                                    gAVCDecoderCaps.width = 2048;
                                    gAVCDecoderCaps.height = 1088;
                                    continue;
                                    if ((gAVCDecoderCaps.width < 3680) || (gAVCDecoderCaps.height < 1536))
                                    {
                                      gAVCDecoderCaps.width = 3680;
                                      gAVCDecoderCaps.height = 1536;
                                      continue;
                                      if ((gAVCDecoderCaps.width < 4096) || (gAVCDecoderCaps.height < 2304))
                                      {
                                        gAVCDecoderCaps.width = 4096;
                                        gAVCDecoderCaps.height = 2304;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
      }
    }
  }
  
  private static void initAVCEncoderCaps()
  {
    MediaCodecInfo.CodecCapabilities localCodecCapabilities = AndroidCodec.getCodecCapabilities((MediaCodecInfo)AndroidCodec.getDecoderInfos(AndroidCodec.AVC_CODEC_MIME).get(0), AndroidCodec.AVC_CODEC_MIME);
    gAVCEncoderCaps = new NativeCodec.AVCCaps();
    int i = 0;
    if (i < localCodecCapabilities.profileLevels.length)
    {
      switch (localCodecCapabilities.profileLevels[i].profile)
      {
      }
      for (;;)
      {
        i += 1;
        break;
        gAVCEncoderCaps.profile = 3;
        setLevel(localCodecCapabilities.profileLevels[i], gAVCEncoderCaps);
      }
    }
  }
  
  private static boolean onAttach(String paramString, int paramInt, boolean paramBoolean, Map<String, Object> paramMap)
  {
    if (QLog.isColorLevel()) {
      QLog.d("NativeCodec", 0, "onAttach");
    }
    if (Build.VERSION.SDK_INT < 16) {}
    do
    {
      return false;
      paramString = new NativeCodec(paramString, paramMap, paramBoolean);
    } while (paramString.mCodec == null);
    paramString.mNativeContext = paramInt;
    paramString.attachCodec(paramString);
    paramString.mTimeStamp = 0L;
    paramString.mTryAgainLaterCount = 0;
    paramString.mLastEncFrameTime = 0L;
    return paramString.mCodec.start();
  }
  
  private boolean onCalcDelay(int paramInt)
  {
    if (this.mDebugDelay)
    {
      if (QLog.isColorLevel()) {
        QLog.d("NativeCodec", 0, this.mDebugTag + " frameIndex:" + paramInt);
      }
      this.mDebugDelayMap2.b(paramInt, Long.valueOf(System.currentTimeMillis()));
    }
    return true;
  }
  
  private static void onDetach(Object arg0)
  {
    if (QLog.isColorLevel()) {
      QLog.d("NativeCodec", 0, "onDetach");
    }
    if (Build.VERSION.SDK_INT < 16) {}
    NativeCodec localNativeCodec;
    do
    {
      return;
      localNativeCodec = (NativeCodec)???;
    } while (localNativeCodec == null);
    localNativeCodec.detachCodec();
    localNativeCodec.mTryAgainLaterCount = 0;
    localNativeCodec.mTimeStamp = 0L;
    localNativeCodec.mFormat = null;
    localNativeCodec.mLastEncFrameTime = 0L;
    synchronized (localNativeCodec.mPendingInputBuffers)
    {
      localNativeCodec.mCodersExit.set(true);
      localNativeCodec.mPendingInputBuffers.clear();
      if (localNativeCodec.mDebugDelay)
      {
        localNativeCodec.mDebugDelayMap.c();
        localNativeCodec.mDebugDelayMap2.c();
        localNativeCodec.mDebugIndexMap.c();
      }
      AndroidCodec localAndroidCodec = localNativeCodec.mCodec;
      if (localAndroidCodec == null) {}
    }
    try
    {
      localNativeCodec.mCodec.stop();
      localNativeCodec.mCodec.release();
      localNativeCodec.mCodec = null;
      return;
      localObject = finally;
      throw ((Throwable)localObject);
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  private boolean onDoCodec(int paramInt1, int paramInt2)
  {
    if (this.mCodec == null) {
      return false;
    }
    if (this.mTryAgainLaterCount >= 10)
    {
      if (QLog.isColorLevel()) {
        QLog.e("NativeCodec", 0, "try too many times!");
      }
      return false;
    }
    label300:
    for (;;)
    {
      try
      {
        Object localObject1 = this.mCodec.getInputBuffer();
        paramInt1 = 0;
        Object localObject3 = localObject1;
        int j;
        Object localObject4;
        if (localObject1 == null)
        {
          if (QLog.isColorLevel()) {
            QLog.e("NativeCodec", 0, "inputbuffer not available");
          }
          j = paramInt1;
          localObject4 = localObject1;
        }
        try
        {
          Thread.sleep(50L);
          j = paramInt1;
          localObject4 = localObject1;
          localObject3 = this.mCodec.getInputBuffer();
          int i = paramInt1 + 1;
          if (localObject3 != null)
          {
            if (!this.misdecoder) {
              break label300;
            }
            paramInt1 = writeInputData(((AndroidCodec.BufferData)localObject3).buffer, false);
            if (paramInt1 >= 0) {
              break;
            }
            if (QLog.isColorLevel()) {
              QLog.e("NativeCodec", 0, "writeInputData, sampleSize < 0");
            }
            return false;
          }
          j = i;
          localObject4 = localObject3;
          if (QLog.isColorLevel())
          {
            j = i;
            localObject4 = localObject3;
            QLog.e("NativeCodec", 0, "inputbuffer not available");
          }
          paramInt1 = i;
          localObject1 = localObject3;
          if (i <= 8) {
            continue;
          }
          j = i;
          localObject4 = localObject3;
          if (QLog.isColorLevel())
          {
            j = i;
            localObject4 = localObject3;
            QLog.e("NativeCodec", 0, "inputbuffer not available, try count = " + i);
          }
          return false;
        }
        catch (InterruptedException localInterruptedException)
        {
          localInterruptedException.printStackTrace();
          paramInt1 = j;
          localObject1 = localObject4;
        }
        if (QLog.isColorLevel())
        {
          QLog.e("NativeCodec", 0, "onDoCodec InterruptedException", localInterruptedException);
          paramInt1 = j;
          localObject1 = localObject4;
          continue;
          paramInt1 = writeInputData2(localInterruptedException.buffer, this.mColorFormat, false);
        }
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        if (QLog.isColorLevel()) {
          QLog.e("NativeCodec", 0, "onDoCodec Exception!", localException);
        }
        return false;
      }
    }
    this.mLastEncFrameTime += this.mFrameInverval;
    if (this.mDebugDelay)
    {
      this.mDebugDelayMap.b(this.mLastEncFrameTime, Long.valueOf(System.currentTimeMillis()));
      this.mDebugIndexMap.b(this.mLastEncFrameTime, Long.valueOf(paramInt2));
    }
    this.mCodec.queueInputBuffer(localInterruptedException.index, paramInt1, this.mLastEncFrameTime, 0);
    Object localObject2 = this.mCodec.dequeueOutputBuffer();
    if (localObject2 != null)
    {
      if (((AndroidCodec.BufferData)localObject2).index < 0)
      {
        this.mTryAgainLaterCount += 1;
        if (QLog.isColorLevel()) {
          QLog.e("NativeCodec", 0, "dequeueOutputBuffer, try again later, count = " + this.mTryAgainLaterCount);
        }
        if (this.mTryAgainLaterCount >= 10) {
          return false;
        }
      }
      else
      {
        this.mTryAgainLaterCount = 0;
        if (!((AndroidCodec.BufferData)localObject2).success)
        {
          if (!QLog.isColorLevel()) {
            break label889;
          }
          QLog.e("NativeCodec", 0, "onDoCodec err!");
          break label889;
        }
        if ((((AndroidCodec.BufferData)localObject2).format == null) || (((AndroidCodec.BufferData)localObject2).buffer == null))
        {
          this.mCodec.releaseOutputBuffer(((AndroidCodec.BufferData)localObject2).index);
          return false;
        }
        if (this.misdecoder)
        {
          if (!HWColorFormat.isSupportedDecodeFormats(((AndroidCodec.BufferData)localObject2).format.getInteger("color-format")))
          {
            if (!QLog.isColorLevel()) {
              break label891;
            }
            QLog.e("NativeCodec", 0, "onDoCodec don't support format!");
            break label891;
          }
          calcDelay(true, ((AndroidCodec.BufferData)localObject2).info);
          setFrame(((AndroidCodec.BufferData)localObject2).buffer, ((AndroidCodec.BufferData)localObject2).info.size, ((AndroidCodec.BufferData)localObject2).format);
          this.mCodec.releaseOutputBuffer(((AndroidCodec.BufferData)localObject2).index);
          break label893;
        }
        if ((((AndroidCodec.BufferData)localObject2).info.flags != 1) || (((AndroidCodec.BufferData)localObject2).info.flags == 2))
        {
          this.mCodec.releaseOutputBuffer(((AndroidCodec.BufferData)localObject2).index);
          readOutputStream(((AndroidCodec.BufferData)localObject2).buffer, ((AndroidCodec.BufferData)localObject2).info.presentationTimeUs, ((AndroidCodec.BufferData)localObject2).info.offset, ((AndroidCodec.BufferData)localObject2).info.size, ((AndroidCodec.BufferData)localObject2).info.flags);
          AndroidCodec.BufferData localBufferData = this.mCodec.dequeueOutputBuffer();
          if (localBufferData != null)
          {
            if (localBufferData.index < 0)
            {
              this.mTryAgainLaterCount2 += 1;
              if (QLog.isColorLevel()) {
                QLog.e("NativeCodec", 0, "re-dequeue dequeueOutputBuffer, try again later, count = " + this.mTryAgainLaterCount2);
              }
              if (this.mTryAgainLaterCount2 < 10) {
                break label895;
              }
              return false;
            }
            this.mTryAgainLaterCount2 = 0;
            if (!localBufferData.success)
            {
              if (!QLog.isColorLevel()) {
                break label897;
              }
              QLog.e("NativeCodec", 0, "re-dequeue onDoCodec err!");
              break label897;
            }
            if ((localBufferData.format == null) || (localBufferData.buffer == null))
            {
              this.mCodec.releaseOutputBuffer(localBufferData.index);
              return false;
            }
          }
          localObject2 = localBufferData;
          if (QLog.isColorLevel())
          {
            QLog.d("NativeCodec", 0, "re-dequeue success");
            localObject2 = localBufferData;
          }
        }
        for (;;)
        {
          calcDelay(true, ((AndroidCodec.BufferData)localObject2).info);
          readOutputStream(((AndroidCodec.BufferData)localObject2).buffer, ((AndroidCodec.BufferData)localObject2).info.presentationTimeUs, ((AndroidCodec.BufferData)localObject2).info.offset, ((AndroidCodec.BufferData)localObject2).info.size, ((AndroidCodec.BufferData)localObject2).info.flags);
          break;
        }
      }
      return true;
      label889:
      return false;
      label891:
      return false;
    }
    label893:
    return true;
    label895:
    return true;
    label897:
    return false;
  }
  
  private int onDoCodecAsync(int paramInt1, int paramInt2)
  {
    if (!mUseAsyncAPI)
    {
      if (QLog.isColorLevel()) {
        QLog.e("NativeCodec", 0, "NOT in async mode.");
      }
      return -1;
    }
    for (;;)
    {
      synchronized (this.mPendingInputBuffers)
      {
        if (this.mCodersExit.get())
        {
          if (QLog.isColorLevel()) {
            QLog.e("NativeCodec", 0, "hardware coders exit, return.");
          }
          return 2;
        }
        if (this.mPendingInputBuffers.size() <= 0) {
          break;
        }
        if (QLog.isColorLevel()) {
          QLog.d("NativeCodec", 0, "InputData pendingInputBuffers exist, size: " + this.mPendingInputBuffers.size());
        }
        AndroidCodec.InputBufferData localInputBufferData = (AndroidCodec.InputBufferData)this.mPendingInputBuffers.get(0);
        if (localInputBufferData == null) {
          return 2;
        }
        if (localInputBufferData.buffer == null)
        {
          if (QLog.isColorLevel()) {
            QLog.e("NativeCodec", 0, "inputbuffer null, return");
          }
          return -1;
        }
        if (localInputBufferData.processing)
        {
          if (QLog.isColorLevel()) {
            QLog.e("NativeCodec", 0, "curr buffer is being processed by other thread, return");
          }
          return 2;
        }
        if (this.misdecoder)
        {
          paramInt1 = writeInputData(localInputBufferData.buffer, false);
          if (paramInt1 <= 0) {
            break label350;
          }
          this.mLastEncFrameTime += this.mFrameInverval;
          this.mPendingInputBuffers.remove(0);
          if (this.mDebugDelay)
          {
            this.mDebugDelayMap.b(this.mLastEncFrameTime, Long.valueOf(System.currentTimeMillis()));
            this.mDebugIndexMap.b(this.mLastEncFrameTime, Long.valueOf(paramInt2));
          }
          this.mCodec.queueInputBuffer(localInputBufferData.index, paramInt1, this.mLastEncFrameTime, 0);
          return 1;
        }
      }
      if (QLog.isColorLevel()) {
        QLog.d("NativeCodec", 0, "call writeInputData2 in onDoCodec");
      }
      paramInt1 = writeInputData2(((AndroidCodec.InputBufferData)localObject).buffer, this.mColorFormat, false);
    }
    for (;;)
    {
      return 0;
      label350:
      do
      {
        return -1;
        return 2;
        if (paramInt1 == 0) {
          break;
        }
      } while (paramInt1 != -1);
    }
  }
  
  public static native boolean putByteArray2ByteBuffer(ByteBuffer paramByteBuffer, int paramInt1, byte[] paramArrayOfByte, int paramInt2, int paramInt3, int paramInt4, int paramInt5);
  
  /* Error */
  private void resetCodec()
  {
    // Byte code:
    //   0: aload_0
    //   1: getfield 251	com/tencent/av/mediacodec/NativeCodec:mCodec	Lcom/tencent/av/mediacodec/AndroidCodec;
    //   4: ifnull +76 -> 80
    //   7: aload_0
    //   8: getfield 125	com/tencent/av/mediacodec/NativeCodec:mPendingInputBuffers	Ljava/util/List;
    //   11: astore_1
    //   12: aload_1
    //   13: monitorenter
    //   14: aload_0
    //   15: getfield 132	com/tencent/av/mediacodec/NativeCodec:mCodersExit	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   18: iconst_1
    //   19: invokevirtual 402	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   22: aload_0
    //   23: getfield 125	com/tencent/av/mediacodec/NativeCodec:mPendingInputBuffers	Ljava/util/List;
    //   26: invokeinterface 405 1 0
    //   31: aload_0
    //   32: getfield 134	com/tencent/av/mediacodec/NativeCodec:mDebugDelay	Z
    //   35: ifeq +24 -> 59
    //   38: aload_0
    //   39: getfield 136	com/tencent/av/mediacodec/NativeCodec:mDebugDelayMap	Landroid/support/v4/c/f;
    //   42: invokevirtual 408	android/support/v4/c/f:c	()V
    //   45: aload_0
    //   46: getfield 138	com/tencent/av/mediacodec/NativeCodec:mDebugDelayMap2	Landroid/support/v4/c/f;
    //   49: invokevirtual 408	android/support/v4/c/f:c	()V
    //   52: aload_0
    //   53: getfield 140	com/tencent/av/mediacodec/NativeCodec:mDebugIndexMap	Landroid/support/v4/c/f;
    //   56: invokevirtual 408	android/support/v4/c/f:c	()V
    //   59: aload_0
    //   60: getfield 251	com/tencent/av/mediacodec/NativeCodec:mCodec	Lcom/tencent/av/mediacodec/AndroidCodec;
    //   63: invokevirtual 411	com/tencent/av/mediacodec/AndroidCodec:stop	()V
    //   66: aload_0
    //   67: getfield 251	com/tencent/av/mediacodec/NativeCodec:mCodec	Lcom/tencent/av/mediacodec/AndroidCodec;
    //   70: invokevirtual 414	com/tencent/av/mediacodec/AndroidCodec:release	()V
    //   73: aload_0
    //   74: aconst_null
    //   75: putfield 251	com/tencent/av/mediacodec/NativeCodec:mCodec	Lcom/tencent/av/mediacodec/AndroidCodec;
    //   78: aload_1
    //   79: monitorexit
    //   80: aload_0
    //   81: getfield 155	com/tencent/av/mediacodec/NativeCodec:misdecoder	Z
    //   84: ifeq +68 -> 152
    //   87: aload_0
    //   88: invokespecial 235	com/tencent/av/mediacodec/NativeCodec:createDecCodec	()V
    //   91: aload_0
    //   92: lconst_0
    //   93: putfield 103	com/tencent/av/mediacodec/NativeCodec:mTimeStamp	J
    //   96: aload_0
    //   97: lconst_0
    //   98: putfield 105	com/tencent/av/mediacodec/NativeCodec:mLastEncFrameTime	J
    //   101: aload_0
    //   102: getfield 251	com/tencent/av/mediacodec/NativeCodec:mCodec	Lcom/tencent/av/mediacodec/AndroidCodec;
    //   105: invokevirtual 372	com/tencent/av/mediacodec/AndroidCodec:start	()Z
    //   108: pop
    //   109: aload_0
    //   110: getfield 132	com/tencent/av/mediacodec/NativeCodec:mCodersExit	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   113: iconst_0
    //   114: invokevirtual 402	java/util/concurrent/atomic/AtomicBoolean:set	(Z)V
    //   117: return
    //   118: astore_2
    //   119: aload_1
    //   120: monitorexit
    //   121: aload_2
    //   122: athrow
    //   123: astore_1
    //   124: aload_1
    //   125: invokevirtual 245	java/lang/Exception:printStackTrace	()V
    //   128: invokestatic 210	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   131: ifeq +13 -> 144
    //   134: ldc 20
    //   136: iconst_0
    //   137: ldc_w 561
    //   140: aload_1
    //   141: invokestatic 249	com/tencent/av/utils/QLog:e	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Exception;)V
    //   144: aload_0
    //   145: aconst_null
    //   146: putfield 251	com/tencent/av/mediacodec/NativeCodec:mCodec	Lcom/tencent/av/mediacodec/AndroidCodec;
    //   149: goto -69 -> 80
    //   152: aload_0
    //   153: invokevirtual 258	com/tencent/av/mediacodec/NativeCodec:createEncCodec	()V
    //   156: goto -65 -> 91
    //   159: astore_1
    //   160: aload_1
    //   161: invokevirtual 245	java/lang/Exception:printStackTrace	()V
    //   164: invokestatic 210	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   167: ifeq -50 -> 117
    //   170: ldc 20
    //   172: iconst_0
    //   173: ldc_w 561
    //   176: aload_1
    //   177: invokestatic 249	com/tencent/av/utils/QLog:e	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Exception;)V
    //   180: return
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	181	0	this	NativeCodec
    //   123	18	1	localException1	Exception
    //   159	18	1	localException2	Exception
    //   118	4	2	localObject	Object
    // Exception table:
    //   from	to	target	type
    //   14	59	118	finally
    //   59	80	118	finally
    //   119	121	118	finally
    //   7	14	123	java/lang/Exception
    //   121	123	123	java/lang/Exception
    //   80	91	159	java/lang/Exception
    //   91	117	159	java/lang/Exception
    //   152	156	159	java/lang/Exception
  }
  
  private boolean setFrame(ByteBuffer paramByteBuffer, int paramInt, MediaFormat paramMediaFormat)
  {
    int i1 = paramMediaFormat.getInteger("width");
    int i2 = paramMediaFormat.getInteger("height");
    int m = paramMediaFormat.getInteger(LEFT);
    int i4 = paramMediaFormat.getInteger(RIGHT);
    int i5 = paramMediaFormat.getInteger(TOP);
    int i3 = paramMediaFormat.getInteger(BOTTOM);
    int k = paramMediaFormat.getInteger(STRIDE);
    int j = paramMediaFormat.getInteger(SLICEHEIGHT);
    int i6 = paramMediaFormat.getInteger("color-format");
    int i = j;
    if (j < i2) {
      i = i2;
    }
    j = k;
    if (k < i1) {
      j = i1;
    }
    int n = i;
    k = i5;
    if (i6 == 2130706688)
    {
      n = i - i5 / 2;
      k = 0;
      m = 0;
    }
    i = j;
    if (j < i1) {
      i = i1;
    }
    if (((2141391876 == i6) || (2130706433 == i6) || (2130706944 == i6)) && (i2 < n)) {}
    for (j = n;; j = i2)
    {
      if (m + i4 + k + i3 == 0)
      {
        m = 0;
        i2 -= 1;
        k = 0;
        i3 = i1 - 1;
        i1 = j;
        n = i;
        j = i3;
        i = i2;
        if ((n <= 0) || (i1 <= 0) || (j <= 0) || (i <= 0))
        {
          if (QLog.isColorLevel()) {
            QLog.e("NativeCodec", 0, "error decoderInfomations.");
          }
          return false;
        }
      }
      else
      {
        i2 = i4 - m + 1;
        i1 = i3 - k + 1;
        n = i;
        if (i < i2) {
          n = i2;
        }
        if (j >= i1) {
          break label380;
        }
      }
      label380:
      for (i = i1;; i = j)
      {
        j = i4;
        i1 = i;
        i = i3;
        break;
        SystemClock.elapsedRealtime();
        paramInt = readOutputDataEx(paramByteBuffer, paramInt, n, i1, m, k, j - m + 1, i - k + 1, i6);
        SystemClock.elapsedRealtime();
        return paramInt > 0;
      }
    }
  }
  
  private static void setLevel(MediaCodecInfo.CodecProfileLevel paramCodecProfileLevel, NativeCodec.AVCCaps paramAVCCaps)
  {
    switch (paramCodecProfileLevel.level)
    {
    }
    do
    {
      do
      {
        do
        {
          do
          {
            do
            {
              do
              {
                do
                {
                  do
                  {
                    do
                    {
                      do
                      {
                        do
                        {
                          do
                          {
                            do
                            {
                              do
                              {
                                do
                                {
                                  do
                                  {
                                    return;
                                  } while ((paramAVCCaps.width >= 176) && (paramAVCCaps.height >= 144));
                                  paramAVCCaps.width = 176;
                                  paramAVCCaps.height = 144;
                                  return;
                                } while ((paramAVCCaps.width >= 352) && (paramAVCCaps.height >= 288));
                                paramAVCCaps.width = 352;
                                paramAVCCaps.height = 288;
                                return;
                              } while ((paramAVCCaps.width >= 352) && (paramAVCCaps.height >= 288));
                              paramAVCCaps.width = 352;
                              paramAVCCaps.height = 288;
                              return;
                            } while ((paramAVCCaps.width >= 352) && (paramAVCCaps.height >= 288));
                            paramAVCCaps.width = 352;
                            paramAVCCaps.height = 288;
                            return;
                          } while ((paramAVCCaps.width >= 352) && (paramAVCCaps.height >= 288));
                          paramAVCCaps.width = 352;
                          paramAVCCaps.height = 288;
                          return;
                        } while ((paramAVCCaps.width >= 352) && (paramAVCCaps.height >= 288));
                        paramAVCCaps.width = 352;
                        paramAVCCaps.height = 288;
                        return;
                      } while ((paramAVCCaps.width >= 352) && (paramAVCCaps.height >= 576));
                      paramAVCCaps.width = 352;
                      paramAVCCaps.height = 576;
                      return;
                    } while ((paramAVCCaps.width >= 720) && (paramAVCCaps.height >= 576));
                    paramAVCCaps.width = 720;
                    paramAVCCaps.height = 576;
                    return;
                  } while ((paramAVCCaps.width >= 720) && (paramAVCCaps.height >= 576));
                  paramAVCCaps.width = 720;
                  paramAVCCaps.height = 576;
                  return;
                } while ((paramAVCCaps.width >= 1280) && (paramAVCCaps.height >= 720));
                paramAVCCaps.width = 1280;
                paramAVCCaps.height = 720;
                return;
              } while ((paramAVCCaps.width >= 1280) && (paramAVCCaps.height >= 1024));
              paramAVCCaps.width = 1280;
              paramAVCCaps.height = 1024;
              return;
            } while ((paramAVCCaps.width >= 2048) && (paramAVCCaps.height >= 1024));
            paramAVCCaps.width = 2048;
            paramAVCCaps.height = 1024;
            return;
          } while ((paramAVCCaps.width >= 2048) && (paramAVCCaps.height >= 1024));
          paramAVCCaps.width = 2048;
          paramAVCCaps.height = 1024;
          return;
        } while ((paramAVCCaps.width >= 2048) && (paramAVCCaps.height >= 1088));
        paramAVCCaps.width = 2048;
        paramAVCCaps.height = 1088;
        return;
      } while ((paramAVCCaps.width >= 3680) && (paramAVCCaps.height >= 1536));
      paramAVCCaps.width = 3680;
      paramAVCCaps.height = 1536;
      return;
    } while ((paramAVCCaps.width >= 4096) && (paramAVCCaps.height >= 2304));
    paramAVCCaps.width = 4096;
    paramAVCCaps.height = 2304;
  }
  
  private void setParameters(String paramString, int paramInt)
  {
    if (this.mCodec == null) {}
    do
    {
      do
      {
        do
        {
          return;
        } while (paramString == null);
        if (!paramString.equalsIgnoreCase("frame-rate")) {
          break;
        }
      } while (paramInt <= 0);
      this.mFrameRate = paramInt;
      this.mFrameInverval = (1000000 / this.mFrameRate);
      resetCodec();
      if (QLog.isColorLevel()) {
        QLog.d("NativeCodec", 0, "HWENC setParameters mFrameRate = " + this.mFrameRate);
      }
    } while (Build.VERSION.SDK_INT < 19);
    Bundle localBundle = new Bundle();
    localBundle.putInt(paramString, paramInt);
    this.mCodec.setParameters(localBundle);
  }
  
  public static native void set_device_infos(String paramString);
  
  public native boolean attachCodec(Object paramObject);
  
  void calcDelay(boolean paramBoolean, MediaCodec.BufferInfo paramBufferInfo)
  {
    if (this.mDebugDelay)
    {
      Long localLong1 = (Long)this.mDebugDelayMap.a(paramBufferInfo.presentationTimeUs);
      if (localLong1 != null)
      {
        if (QLog.isColorLevel()) {
          QLog.d("NativeCodec", 0, this.mDebugTag + "small, " + paramBufferInfo.presentationTimeUs + ", takes:" + (System.currentTimeMillis() - localLong1.longValue()));
        }
        this.mDebugDelayMap.c(paramBufferInfo.presentationTimeUs);
      }
      localLong1 = (Long)this.mDebugIndexMap.a(paramBufferInfo.presentationTimeUs);
      if (localLong1 != null)
      {
        Long localLong2 = (Long)this.mDebugDelayMap2.a(localLong1.longValue());
        if (localLong2 != null)
        {
          if (QLog.isColorLevel()) {
            QLog.d("NativeCodec", 0, this.mDebugTag + "big, " + paramBufferInfo.presentationTimeUs + ", takes:" + (System.currentTimeMillis() - localLong2.longValue()));
          }
          this.mDebugDelayMap2.c(localLong1.longValue());
        }
        this.mDebugIndexMap.c(paramBufferInfo.presentationTimeUs);
      }
    }
  }
  
  void createEncCodec()
  {
    if (this.mCodec == null) {}
    for (;;)
    {
      Object localObject;
      MediaCodecInfo.CodecCapabilities localCodecCapabilities;
      int m;
      try
      {
        List localList = AndroidCodec.getEndoderInfos(this.mMime);
        this.mColorFormat = 21;
        i = 0;
        if (i >= localList.size()) {
          break label460;
        }
        localObject = AndroidCodec.getCodecCapabilities((MediaCodecInfo)localList.get(i), AndroidCodec.AVC_CODEC_MIME);
        if (ArrayUtils.contains(((MediaCodecInfo.CodecCapabilities)localObject).colorFormats, 21))
        {
          this.mColorFormat = 21;
          this.mCodec = new AndroidCodec();
          localObject = MediaFormat.createVideoFormat(this.mMime, this.mWidth, this.mHeight);
          ((MediaFormat)localObject).setInteger("color-format", this.mColorFormat);
          ((MediaFormat)localObject).setInteger("frame-rate", this.mFrameRate);
          ((MediaFormat)localObject).setInteger("bitrate", this.mBitRate);
          j = 30;
          if (this.mFrameRate * 30 > 255) {
            j = 255 / this.mFrameRate;
          }
          if (QLog.isColorLevel()) {
            QLog.d("NativeCodec", 0, "KEY_I_FRAME_INTERVAL = " + j + ", mFrameRate = " + this.mFrameRate);
          }
          if (Build.VERSION.SDK_INT >= 19) {
            continue;
          }
          ((MediaFormat)localObject).setInteger("i-frame-interval", j);
          localCodecCapabilities = AndroidCodec.getCodecCapabilities((MediaCodecInfo)localList.get(i), this.mMime);
          j = 16;
          m = 0;
          if (m >= localCodecCapabilities.profileLevels.length) {
            break label399;
          }
        }
        switch (localCodecCapabilities.profileLevels[m].profile)
        {
        case 1: 
          if (!ArrayUtils.contains(((MediaCodecInfo.CodecCapabilities)localObject).colorFormats, 19)) {
            break label475;
          }
          this.mColorFormat = 19;
          continue;
          ((MediaFormat)localObject).setInteger("i-frame-interval", j);
          continue;
          return;
        }
      }
      catch (Exception localException)
      {
        localException.printStackTrace();
        if (QLog.isColorLevel()) {
          QLog.e("NativeCodec", 0, "createEncCodec", localException);
        }
        this.mCodec = null;
      }
      ((MediaFormat)localObject).setInteger("profile", 1);
      int k = j;
      if (j < localCodecCapabilities.profileLevels[m].level) {
        k = localCodecCapabilities.profileLevels[m].level;
      }
      ((MediaFormat)localObject).setInteger("level", k);
      int j = k;
      break label466;
      label399:
      this.mFormat = ((MediaFormat)localObject);
      if (this.mFrameRate > 0) {}
      for (this.mFrameInverval = (1000000 / this.mFrameRate);; this.mFrameInverval = 40000)
      {
        this.mCodec.init(this.mFormat, ((MediaCodecInfo)localException.get(i)).getName(), this);
        return;
      }
      label460:
      int i = 0;
      continue;
      label466:
      m += 1;
      continue;
      label475:
      i += 1;
    }
  }
  
  public native void detachCodec();
  
  public void onError(MediaCodec paramMediaCodec, Exception paramException)
  {
    if (QLog.isColorLevel()) {
      QLog.d("NativeCodec", 0, "onError", paramException);
    }
    if ((this.mCodersExit.get()) && (QLog.isColorLevel())) {
      QLog.e("NativeCodec", 0, "codec exit, return onError");
    }
  }
  
  /* Error */
  public void onInputBufferAvailable(MediaCodec arg1, int paramInt)
  {
    // Byte code:
    //   0: iconst_0
    //   1: istore 7
    //   3: iconst_0
    //   4: istore 6
    //   6: aload_0
    //   7: getfield 251	com/tencent/av/mediacodec/NativeCodec:mCodec	Lcom/tencent/av/mediacodec/AndroidCodec;
    //   10: iload_2
    //   11: invokevirtual 634	com/tencent/av/mediacodec/AndroidCodec:getInputBuffer	(I)Ljava/nio/ByteBuffer;
    //   14: astore_3
    //   15: aload_3
    //   16: ifnonnull +36 -> 52
    //   19: invokestatic 210	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   22: ifeq +29 -> 51
    //   25: ldc 20
    //   27: iconst_0
    //   28: new 212	java/lang/StringBuilder
    //   31: dup
    //   32: invokespecial 213	java/lang/StringBuilder:<init>	()V
    //   35: ldc_w 636
    //   38: invokevirtual 219	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   41: iload_2
    //   42: invokevirtual 222	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   45: invokevirtual 228	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   48: invokestatic 422	com/tencent/av/utils/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   51: return
    //   52: iload 7
    //   54: istore 5
    //   56: aload_0
    //   57: getfield 125	com/tencent/av/mediacodec/NativeCodec:mPendingInputBuffers	Ljava/util/List;
    //   60: astore_1
    //   61: iload 7
    //   63: istore 5
    //   65: aload_1
    //   66: monitorenter
    //   67: aload_0
    //   68: getfield 132	com/tencent/av/mediacodec/NativeCodec:mCodersExit	Ljava/util/concurrent/atomic/AtomicBoolean;
    //   71: invokevirtual 537	java/util/concurrent/atomic/AtomicBoolean:get	()Z
    //   74: ifeq +76 -> 150
    //   77: invokestatic 210	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   80: ifeq +12 -> 92
    //   83: ldc 20
    //   85: iconst_0
    //   86: ldc_w 638
    //   89: invokestatic 422	com/tencent/av/utils/QLog:e	(Ljava/lang/String;ILjava/lang/String;)V
    //   92: aload_1
    //   93: monitorexit
    //   94: aload_0
    //   95: getfield 125	com/tencent/av/mediacodec/NativeCodec:mPendingInputBuffers	Ljava/util/List;
    //   98: astore_1
    //   99: aload_1
    //   100: monitorenter
    //   101: aload_0
    //   102: getfield 125	com/tencent/av/mediacodec/NativeCodec:mPendingInputBuffers	Ljava/util/List;
    //   105: iconst_0
    //   106: invokeinterface 275 2 0
    //   111: checkcast 543	com/tencent/av/mediacodec/AndroidCodec$InputBufferData
    //   114: iconst_0
    //   115: putfield 549	com/tencent/av/mediacodec/AndroidCodec$InputBufferData:processing	Z
    //   118: aload_1
    //   119: monitorexit
    //   120: return
    //   121: astore_3
    //   122: aload_1
    //   123: monitorexit
    //   124: aload_3
    //   125: athrow
    //   126: astore_3
    //   127: aload_3
    //   128: invokevirtual 245	java/lang/Exception:printStackTrace	()V
    //   131: invokestatic 210	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   134: ifeq -16 -> 118
    //   137: ldc 20
    //   139: iconst_0
    //   140: ldc_w 640
    //   143: aload_3
    //   144: invokestatic 249	com/tencent/av/utils/QLog:e	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Exception;)V
    //   147: goto -29 -> 118
    //   150: aload_0
    //   151: getfield 125	com/tencent/av/mediacodec/NativeCodec:mPendingInputBuffers	Ljava/util/List;
    //   154: new 543	com/tencent/av/mediacodec/AndroidCodec$InputBufferData
    //   157: dup
    //   158: aload_3
    //   159: iload_2
    //   160: invokespecial 643	com/tencent/av/mediacodec/AndroidCodec$InputBufferData:<init>	(Ljava/nio/ByteBuffer;I)V
    //   163: invokeinterface 646 2 0
    //   168: pop
    //   169: aload_0
    //   170: getfield 125	com/tencent/av/mediacodec/NativeCodec:mPendingInputBuffers	Ljava/util/List;
    //   173: iconst_0
    //   174: invokeinterface 275 2 0
    //   179: checkcast 543	com/tencent/av/mediacodec/AndroidCodec$InputBufferData
    //   182: iconst_1
    //   183: putfield 549	com/tencent/av/mediacodec/AndroidCodec$InputBufferData:processing	Z
    //   186: aload_1
    //   187: monitorexit
    //   188: iload 7
    //   190: istore 5
    //   192: aload_0
    //   193: getfield 155	com/tencent/av/mediacodec/NativeCodec:misdecoder	Z
    //   196: ifeq +251 -> 447
    //   199: iload 7
    //   201: istore 5
    //   203: aload_0
    //   204: aload_0
    //   205: getfield 125	com/tencent/av/mediacodec/NativeCodec:mPendingInputBuffers	Ljava/util/List;
    //   208: iconst_0
    //   209: invokeinterface 275 2 0
    //   214: checkcast 543	com/tencent/av/mediacodec/AndroidCodec$InputBufferData
    //   217: getfield 544	com/tencent/av/mediacodec/AndroidCodec$InputBufferData:buffer	Ljava/nio/ByteBuffer;
    //   220: iconst_1
    //   221: invokevirtual 446	com/tencent/av/mediacodec/NativeCodec:writeInputData	(Ljava/nio/ByteBuffer;Z)I
    //   224: istore_2
    //   225: iload_2
    //   226: ifle +120 -> 346
    //   229: iload_2
    //   230: istore 5
    //   232: invokestatic 210	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   235: ifeq +32 -> 267
    //   238: iload_2
    //   239: istore 5
    //   241: ldc 20
    //   243: iconst_0
    //   244: new 212	java/lang/StringBuilder
    //   247: dup
    //   248: invokespecial 213	java/lang/StringBuilder:<init>	()V
    //   251: ldc_w 648
    //   254: invokevirtual 219	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   257: iload_2
    //   258: invokevirtual 222	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   261: invokevirtual 228	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   264: invokestatic 232	com/tencent/av/utils/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   267: iload_2
    //   268: istore 5
    //   270: aload_0
    //   271: aload_0
    //   272: getfield 105	com/tencent/av/mediacodec/NativeCodec:mLastEncFrameTime	J
    //   275: aload_0
    //   276: getfield 120	com/tencent/av/mediacodec/NativeCodec:mFrameInverval	I
    //   279: i2l
    //   280: ladd
    //   281: putfield 105	com/tencent/av/mediacodec/NativeCodec:mLastEncFrameTime	J
    //   284: iload_2
    //   285: istore 5
    //   287: aload_0
    //   288: getfield 134	com/tencent/av/mediacodec/NativeCodec:mDebugDelay	Z
    //   291: ifeq +23 -> 314
    //   294: iload_2
    //   295: istore 5
    //   297: aload_0
    //   298: getfield 136	com/tencent/av/mediacodec/NativeCodec:mDebugDelayMap	Landroid/support/v4/c/f;
    //   301: aload_0
    //   302: getfield 105	com/tencent/av/mediacodec/NativeCodec:mLastEncFrameTime	J
    //   305: invokestatic 383	java/lang/System:currentTimeMillis	()J
    //   308: invokestatic 389	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   311: invokevirtual 393	android/support/v4/c/f:b	(JLjava/lang/Object;)V
    //   314: iload_2
    //   315: istore 5
    //   317: aload_0
    //   318: getfield 251	com/tencent/av/mediacodec/NativeCodec:mCodec	Lcom/tencent/av/mediacodec/AndroidCodec;
    //   321: aload_0
    //   322: getfield 125	com/tencent/av/mediacodec/NativeCodec:mPendingInputBuffers	Ljava/util/List;
    //   325: iconst_0
    //   326: invokeinterface 275 2 0
    //   331: checkcast 543	com/tencent/av/mediacodec/AndroidCodec$InputBufferData
    //   334: getfield 555	com/tencent/av/mediacodec/AndroidCodec$InputBufferData:index	I
    //   337: iload_2
    //   338: aload_0
    //   339: getfield 105	com/tencent/av/mediacodec/NativeCodec:mLastEncFrameTime	J
    //   342: iconst_0
    //   343: invokevirtual 468	com/tencent/av/mediacodec/AndroidCodec:queueInputBuffer	(IIJI)V
    //   346: aload_0
    //   347: getfield 125	com/tencent/av/mediacodec/NativeCodec:mPendingInputBuffers	Ljava/util/List;
    //   350: astore_1
    //   351: aload_1
    //   352: monitorenter
    //   353: aload_0
    //   354: getfield 125	com/tencent/av/mediacodec/NativeCodec:mPendingInputBuffers	Ljava/util/List;
    //   357: iconst_0
    //   358: invokeinterface 275 2 0
    //   363: checkcast 543	com/tencent/av/mediacodec/AndroidCodec$InputBufferData
    //   366: iconst_0
    //   367: putfield 549	com/tencent/av/mediacodec/AndroidCodec$InputBufferData:processing	Z
    //   370: iload_2
    //   371: ifle +14 -> 385
    //   374: aload_0
    //   375: getfield 125	com/tencent/av/mediacodec/NativeCodec:mPendingInputBuffers	Ljava/util/List;
    //   378: iconst_0
    //   379: invokeinterface 554 2 0
    //   384: pop
    //   385: aload_1
    //   386: monitorexit
    //   387: return
    //   388: astore_3
    //   389: aload_1
    //   390: monitorexit
    //   391: aload_3
    //   392: athrow
    //   393: astore_3
    //   394: aload_1
    //   395: monitorexit
    //   396: iload 7
    //   398: istore 5
    //   400: aload_3
    //   401: athrow
    //   402: astore_3
    //   403: aload_0
    //   404: getfield 125	com/tencent/av/mediacodec/NativeCodec:mPendingInputBuffers	Ljava/util/List;
    //   407: astore_1
    //   408: aload_1
    //   409: monitorenter
    //   410: aload_0
    //   411: getfield 125	com/tencent/av/mediacodec/NativeCodec:mPendingInputBuffers	Ljava/util/List;
    //   414: iconst_0
    //   415: invokeinterface 275 2 0
    //   420: checkcast 543	com/tencent/av/mediacodec/AndroidCodec$InputBufferData
    //   423: iconst_0
    //   424: putfield 549	com/tencent/av/mediacodec/AndroidCodec$InputBufferData:processing	Z
    //   427: iload 5
    //   429: ifle +14 -> 443
    //   432: aload_0
    //   433: getfield 125	com/tencent/av/mediacodec/NativeCodec:mPendingInputBuffers	Ljava/util/List;
    //   436: iconst_0
    //   437: invokeinterface 554 2 0
    //   442: pop
    //   443: aload_1
    //   444: monitorexit
    //   445: aload_3
    //   446: athrow
    //   447: iload 7
    //   449: istore 5
    //   451: invokestatic 210	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   454: ifeq +16 -> 470
    //   457: iload 7
    //   459: istore 5
    //   461: ldc 20
    //   463: iconst_0
    //   464: ldc_w 650
    //   467: invokestatic 232	com/tencent/av/utils/QLog:d	(Ljava/lang/String;ILjava/lang/String;)V
    //   470: iload 7
    //   472: istore 5
    //   474: aload_0
    //   475: aload_0
    //   476: getfield 125	com/tencent/av/mediacodec/NativeCodec:mPendingInputBuffers	Ljava/util/List;
    //   479: iconst_0
    //   480: invokeinterface 275 2 0
    //   485: checkcast 543	com/tencent/av/mediacodec/AndroidCodec$InputBufferData
    //   488: getfield 544	com/tencent/av/mediacodec/AndroidCodec$InputBufferData:buffer	Ljava/nio/ByteBuffer;
    //   491: aload_0
    //   492: getfield 457	com/tencent/av/mediacodec/NativeCodec:mColorFormat	I
    //   495: iconst_1
    //   496: invokevirtual 461	com/tencent/av/mediacodec/NativeCodec:writeInputData2	(Ljava/nio/ByteBuffer;IZ)I
    //   499: istore_2
    //   500: goto -275 -> 225
    //   503: astore_1
    //   504: iload 7
    //   506: istore 5
    //   508: aload_1
    //   509: invokevirtual 245	java/lang/Exception:printStackTrace	()V
    //   512: iload 6
    //   514: istore_2
    //   515: iload 7
    //   517: istore 5
    //   519: invokestatic 210	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   522: ifeq -297 -> 225
    //   525: iload 7
    //   527: istore 5
    //   529: ldc 20
    //   531: iconst_0
    //   532: ldc_w 652
    //   535: aload_1
    //   536: invokestatic 249	com/tencent/av/utils/QLog:e	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Exception;)V
    //   539: iload 6
    //   541: istore_2
    //   542: goto -317 -> 225
    //   545: astore_1
    //   546: iload_2
    //   547: istore 5
    //   549: aload_1
    //   550: invokevirtual 245	java/lang/Exception:printStackTrace	()V
    //   553: iload_2
    //   554: istore 5
    //   556: invokestatic 210	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   559: ifeq -213 -> 346
    //   562: iload_2
    //   563: istore 5
    //   565: ldc 20
    //   567: iconst_0
    //   568: ldc_w 654
    //   571: aload_1
    //   572: invokestatic 249	com/tencent/av/utils/QLog:e	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Exception;)V
    //   575: goto -229 -> 346
    //   578: astore_3
    //   579: aload_3
    //   580: invokevirtual 245	java/lang/Exception:printStackTrace	()V
    //   583: invokestatic 210	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   586: ifeq -201 -> 385
    //   589: ldc 20
    //   591: iconst_0
    //   592: ldc_w 640
    //   595: aload_3
    //   596: invokestatic 249	com/tencent/av/utils/QLog:e	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Exception;)V
    //   599: goto -214 -> 385
    //   602: astore 4
    //   604: aload 4
    //   606: invokevirtual 245	java/lang/Exception:printStackTrace	()V
    //   609: invokestatic 210	com/tencent/av/utils/QLog:isColorLevel	()Z
    //   612: ifeq -169 -> 443
    //   615: ldc 20
    //   617: iconst_0
    //   618: ldc_w 640
    //   621: aload 4
    //   623: invokestatic 249	com/tencent/av/utils/QLog:e	(Ljava/lang/String;ILjava/lang/String;Ljava/lang/Exception;)V
    //   626: goto -183 -> 443
    //   629: astore_3
    //   630: aload_1
    //   631: monitorexit
    //   632: aload_3
    //   633: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	634	0	this	NativeCodec
    //   0	634	2	paramInt	int
    //   14	2	3	localByteBuffer	ByteBuffer
    //   121	4	3	localObject1	Object
    //   126	33	3	localException1	Exception
    //   388	4	3	localObject2	Object
    //   393	8	3	localObject3	Object
    //   402	44	3	localObject4	Object
    //   578	18	3	localException2	Exception
    //   629	4	3	localObject5	Object
    //   602	20	4	localException3	Exception
    //   54	510	5	i	int
    //   4	536	6	j	int
    //   1	525	7	k	int
    // Exception table:
    //   from	to	target	type
    //   101	118	121	finally
    //   118	120	121	finally
    //   122	124	121	finally
    //   127	147	121	finally
    //   101	118	126	java/lang/Exception
    //   353	370	388	finally
    //   374	385	388	finally
    //   385	387	388	finally
    //   389	391	388	finally
    //   579	599	388	finally
    //   67	92	393	finally
    //   92	94	393	finally
    //   150	188	393	finally
    //   394	396	393	finally
    //   56	61	402	finally
    //   65	67	402	finally
    //   192	199	402	finally
    //   203	225	402	finally
    //   232	238	402	finally
    //   241	267	402	finally
    //   270	284	402	finally
    //   287	294	402	finally
    //   297	314	402	finally
    //   317	346	402	finally
    //   400	402	402	finally
    //   451	457	402	finally
    //   461	470	402	finally
    //   474	500	402	finally
    //   508	512	402	finally
    //   519	525	402	finally
    //   529	539	402	finally
    //   549	553	402	finally
    //   556	562	402	finally
    //   565	575	402	finally
    //   192	199	503	java/lang/Exception
    //   203	225	503	java/lang/Exception
    //   451	457	503	java/lang/Exception
    //   461	470	503	java/lang/Exception
    //   474	500	503	java/lang/Exception
    //   317	346	545	java/lang/Exception
    //   353	370	578	java/lang/Exception
    //   374	385	578	java/lang/Exception
    //   410	427	602	java/lang/Exception
    //   432	443	602	java/lang/Exception
    //   410	427	629	finally
    //   432	443	629	finally
    //   443	445	629	finally
    //   604	626	629	finally
    //   630	632	629	finally
  }
  
  public void onOutputBufferAvailable(MediaCodec paramMediaCodec, int paramInt, MediaCodec.BufferInfo paramBufferInfo)
  {
    if (this.mCodersExit.get()) {
      if (QLog.isColorLevel()) {
        QLog.e("NativeCodec", 0, "codec exit, return onOutputBufferAvailable");
      }
    }
    do
    {
      return;
      paramMediaCodec = this.mCodec.getOutputBuffer(paramInt);
    } while ((paramMediaCodec == null) || (paramBufferInfo == null));
    if (this.misdecoder)
    {
      MediaFormat localMediaFormat = this.mCodec.getOutputFormat(paramInt);
      if (localMediaFormat != null)
      {
        calcDelay(false, paramBufferInfo);
        setFrame(paramMediaCodec, paramBufferInfo.size, localMediaFormat);
      }
    }
    for (;;)
    {
      this.mCodec.releaseOutputBuffer(paramInt);
      return;
      if (QLog.isColorLevel())
      {
        QLog.e("NativeCodec", 0, "getOutputFormat null");
        continue;
        if (paramBufferInfo.flags == 1) {}
        calcDelay(false, paramBufferInfo);
        readOutputStream(paramMediaCodec, paramBufferInfo.presentationTimeUs, paramBufferInfo.offset, paramBufferInfo.size, paramBufferInfo.flags);
      }
    }
  }
  
  public void onOutputFormatChanged(MediaCodec paramMediaCodec, MediaFormat paramMediaFormat)
  {
    if (QLog.isColorLevel()) {
      QLog.d("NativeCodec", 0, "onOutputFormatChanged");
    }
    if ((this.mCodersExit.get()) && (QLog.isColorLevel())) {
      QLog.e("NativeCodec", 0, "codec exit, return onOutputFormatChanged");
    }
  }
  
  public native int readOutputData(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8, int paramInt9, int paramInt10);
  
  public native int readOutputDataEx(ByteBuffer paramByteBuffer, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5, int paramInt6, int paramInt7, int paramInt8);
  
  public native int readOutputStream(ByteBuffer paramByteBuffer, long paramLong, int paramInt1, int paramInt2, int paramInt3);
  
  public native int setAVCParams(ByteBuffer paramByteBuffer1, ByteBuffer paramByteBuffer2);
  
  void setParams_impl()
  {
    if (QLog.isColorLevel()) {
      QLog.d("NativeCodec", 0, "setParams_impl");
    }
    Bundle localBundle;
    if (this.setIFramePending)
    {
      localBundle = new Bundle();
      localBundle.putInt(AndroidCodec.ForceIFrame, 1);
      this.setIFramePending = false;
      if (this.setBitRatePending > 0) {
        localBundle.putInt("bitrate", this.setBitRatePending);
      }
      this.mCodec.setParameters(localBundle);
      this.setBitRatePending = 0;
    }
    if (this.setBitRatePending > 0)
    {
      localBundle = new Bundle();
      localBundle.putInt("bitrate", this.setBitRatePending);
      if (this.setIFramePending) {
        localBundle.putInt(AndroidCodec.ForceIFrame, 1);
      }
      this.mCodec.setParameters(localBundle);
      this.setBitRatePending = 0;
      this.setIFramePending = false;
    }
  }
  
  public native int writeInputData(ByteBuffer paramByteBuffer, boolean paramBoolean);
  
  public native int writeInputData2(ByteBuffer paramByteBuffer, int paramInt, boolean paramBoolean);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\mediacodec\NativeCodec.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */