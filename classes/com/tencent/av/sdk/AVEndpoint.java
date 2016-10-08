package com.tencent.av.sdk;

public class AVEndpoint
{
  public int nativeObj = 0;
  
  public static native int cancelAllView(AVEndpoint.CancelAllViewCompleteCallback paramCancelAllViewCompleteCallback);
  
  public static native int requestViewList(String[] paramArrayOfString, AVView[] paramArrayOfAVView, int paramInt, AVEndpoint.RequestViewListCompleteCallback paramRequestViewListCompleteCallback);
  
  public native String getId();
  
  public native AVEndpoint.Info getInfo();
  
  public native long getLastAudioStampRecv();
  
  public native long getLastAudioStampSend();
  
  public native long getLastVideoStampRecv();
  
  public native long getLastVideoStampSend();
  
  public native boolean hasAudio();
  
  public native boolean hasCameraVideo();
  
  public native boolean hasScreenVideo();
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\sdk\AVEndpoint.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */