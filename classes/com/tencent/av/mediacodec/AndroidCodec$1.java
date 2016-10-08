package com.tencent.av.mediacodec;

import android.media.MediaCodec;
import android.media.MediaCodec.BufferInfo;
import android.media.MediaCodec.Callback;
import android.media.MediaCodec.CodecException;
import android.media.MediaFormat;

class AndroidCodec$1
  extends MediaCodec.Callback
{
  AndroidCodec$1(AndroidCodec paramAndroidCodec, IMediaCodecCallback paramIMediaCodecCallback) {}
  
  public void onError(MediaCodec paramMediaCodec, MediaCodec.CodecException paramCodecException)
  {
    if (this.val$cb != null) {
      this.val$cb.onError(paramMediaCodec, paramCodecException);
    }
  }
  
  public void onInputBufferAvailable(MediaCodec paramMediaCodec, int paramInt)
  {
    if (this.val$cb != null) {
      this.val$cb.onInputBufferAvailable(paramMediaCodec, paramInt);
    }
  }
  
  public void onOutputBufferAvailable(MediaCodec paramMediaCodec, int paramInt, MediaCodec.BufferInfo paramBufferInfo)
  {
    if (this.val$cb != null) {
      this.val$cb.onOutputBufferAvailable(paramMediaCodec, paramInt, paramBufferInfo);
    }
  }
  
  public void onOutputFormatChanged(MediaCodec paramMediaCodec, MediaFormat paramMediaFormat)
  {
    if (this.val$cb != null) {
      this.val$cb.onOutputFormatChanged(paramMediaCodec, paramMediaFormat);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\mediacodec\AndroidCodec$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */