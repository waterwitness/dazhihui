package com.tencent.av.sdk;

public abstract interface AVRoom$Delegate
{
  public abstract void OnPrivilegeDiffNotify(int paramInt);
  
  public abstract void OnSemiAutoRecvCameraVideo(String[] paramArrayOfString);
  
  public abstract void onEndpointsUpdateInfo(int paramInt, String[] paramArrayOfString);
  
  public abstract void onEnterRoomComplete(int paramInt);
  
  public abstract void onExitRoomComplete(int paramInt);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\sdk\AVRoom$Delegate.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */