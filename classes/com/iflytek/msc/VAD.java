package com.iflytek.msc;

public class VAD
{
  public static native int AppendData(long paramLong, byte[] paramArrayOfByte, int paramInt);
  
  public static native int CalcVolumLevel(long paramLong, byte[] paramArrayOfByte, int paramInt, VAD.VadData paramVadData);
  
  public static native int EndAudioData(long paramLong);
  
  public static native int FetchData(long paramLong, VAD.VadData paramVadData);
  
  public static native int GetLastSpeechPos(long paramLong, VAD.VadData paramVadData);
  
  public static native long Initialize(int paramInt);
  
  public static native void Reset(long paramLong);
  
  public static native int SetParam(long paramLong, int paramInt1, int paramInt2);
  
  public static native void Uninitialize(long paramLong);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\msc\VAD.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */