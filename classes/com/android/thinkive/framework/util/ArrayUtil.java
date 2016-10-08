package com.android.thinkive.framework.util;

public class ArrayUtil
{
  public static byte[] addArray(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    byte[] arrayOfByte = new byte[paramArrayOfByte1.length + paramArrayOfByte2.length];
    System.arraycopy(paramArrayOfByte1, 0, arrayOfByte, 0, paramArrayOfByte1.length);
    System.arraycopy(paramArrayOfByte2, 0, arrayOfByte, paramArrayOfByte1.length, paramArrayOfByte2.length);
    return arrayOfByte;
  }
  
  public static byte[] cutArray(byte[] paramArrayOfByte, int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt];
    System.arraycopy(paramArrayOfByte, 0, arrayOfByte, 0, paramInt);
    return arrayOfByte;
  }
  
  public static byte[] cutArray(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = new byte[paramInt2 - paramInt1];
    System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte, 0, arrayOfByte.length);
    return arrayOfByte;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\util\ArrayUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */