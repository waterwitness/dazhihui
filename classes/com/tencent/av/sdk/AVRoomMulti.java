package com.tencent.av.sdk;

public class AVRoomMulti
  extends AVRoom
{
  static final String TAG = "SdkJni";
  
  public native int changeAVControlRole(String paramString, AVRoomMulti.ChangeAVControlRoleCompleteCallback paramChangeAVControlRoleCompleteCallback);
  
  public native boolean changeAuthority(long paramLong, byte[] paramArrayOfByte, int paramInt, AVRoomMulti.ChangeAuthorityCallback paramChangeAuthorityCallback);
  
  public native AVEndpoint getEndpointById(String paramString);
  
  public native int getEndpointCount();
  
  public native void setNetType(int paramInt);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\av\sdk\AVRoomMulti.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */