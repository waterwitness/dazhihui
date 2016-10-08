package com.kingdom.mt.jni.kdencode;

public class KDEnCode
{
  static
  {
    System.loadLibrary("kdencode");
  }
  
  public native String KDEncode(int paramInt, String paramString1, String paramString2);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kingdom\mt\jni\kdencode\KDEnCode.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */