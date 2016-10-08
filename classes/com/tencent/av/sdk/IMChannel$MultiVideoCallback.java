package com.tencent.av.sdk;

import com.tencent.TIMValueCallBack;

public class IMChannel$MultiVideoCallback
  implements TIMValueCallBack<byte[]>
{
  private int mNativeCallback;
  
  public IMChannel$MultiVideoCallback(IMChannel paramIMChannel, int paramInt)
  {
    this.mNativeCallback = paramInt;
  }
  
  public void onError(int paramInt, String paramString)
  {
    IMChannel.MultiVideoResult localMultiVideoResult = new IMChannel.MultiVideoResult(this.this$0);
    localMultiVideoResult.result = paramInt;
    localMultiVideoResult.errorInfo = paramString;
    this.this$0.nativeMultiVideoCallback(this.mNativeCallback, localMultiVideoResult);
    this.mNativeCallback = 0;
  }
  
  public void onSuccess(byte[] paramArrayOfByte)
  {
    IMChannel.MultiVideoResult localMultiVideoResult = new IMChannel.MultiVideoResult(this.this$0);
    localMultiVideoResult.result = 0;
    localMultiVideoResult.response = paramArrayOfByte;
    this.this$0.nativeMultiVideoCallback(this.mNativeCallback, localMultiVideoResult);
    this.mNativeCallback = 0;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\sdk\IMChannel$MultiVideoCallback.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */