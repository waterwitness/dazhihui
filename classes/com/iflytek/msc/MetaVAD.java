package com.iflytek.msc;

public class MetaVAD
{
  public static native int VADAppendPCM(MetaVAD.Instance paramInstance, byte[] paramArrayOfByte, int paramInt1, int paramInt2);
  
  public static native int VADCreateSession(MetaVAD.Instance paramInstance);
  
  public static native int VADDelResource(int paramInt);
  
  public static native int VADDestroySession(MetaVAD.Instance paramInstance);
  
  public static native int VADGetSeg(MetaVAD.Instance paramInstance);
  
  public static native int VADInitialize(byte[] paramArrayOfByte);
  
  public static native int VADLoadResource(int paramInt, byte[] paramArrayOfByte);
  
  public static native int VADResetSession(MetaVAD.Instance paramInstance);
  
  public static native int VADSetParam(MetaVAD.Instance paramInstance, byte[] paramArrayOfByte1, byte[] paramArrayOfByte2);
  
  public static native int VADUninitialize();
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\msc\MetaVAD.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */