package com.android.thinkive.framework.util;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

public class ByteUtil
{
  public static String byteArrayToHexStringWithSpace(byte[] paramArrayOfByte)
  {
    StringBuilder localStringBuilder = new StringBuilder();
    int j = paramArrayOfByte.length;
    int i = 0;
    for (;;)
    {
      if (i >= j) {
        return localStringBuilder.toString();
      }
      String str2 = Integer.toHexString(paramArrayOfByte[i] & 0xFF);
      String str1 = str2;
      if (str2.length() < 2) {
        str1 = "0" + str2;
      }
      localStringBuilder.append(str1);
      localStringBuilder.append(" ");
      i += 1;
    }
  }
  
  public static String byteToBit(byte paramByte)
  {
    return (byte)(paramByte >> 7 & 0x1) + (byte)(paramByte >> 6 & 0x1) + (byte)(paramByte >> 5 & 0x1) + (byte)(paramByte >> 4 & 0x1) + (byte)(paramByte >> 3 & 0x1) + (byte)(paramByte >> 2 & 0x1) + (byte)(paramByte >> 1 & 0x1) + (byte)(paramByte >> 0 & 0x1);
  }
  
  public static char bytesToChar(byte[] paramArrayOfByte)
  {
    return (char)paramArrayOfByte[0];
  }
  
  public static double bytesToDouble(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = ByteBuffer.wrap(paramArrayOfByte);
    paramArrayOfByte.order(ByteOrder.LITTLE_ENDIAN);
    return paramArrayOfByte.getDouble();
  }
  
  public static float bytesToFloat(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = ByteBuffer.wrap(paramArrayOfByte);
    paramArrayOfByte.order(ByteOrder.LITTLE_ENDIAN);
    return paramArrayOfByte.getFloat();
  }
  
  public static String bytesToHexString(byte[] paramArrayOfByte)
  {
    String str1 = "";
    int i = 0;
    for (;;)
    {
      if (i >= paramArrayOfByte.length) {
        return str1;
      }
      String str3 = Integer.toHexString(paramArrayOfByte[i] & 0xFF);
      String str2 = str3;
      if (str3.length() == 1) {
        str2 = '0' + str3;
      }
      str1 = str1 + str2.toUpperCase();
      i += 1;
    }
  }
  
  public static int bytesToInt(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = ByteBuffer.wrap(paramArrayOfByte);
    paramArrayOfByte.order(ByteOrder.LITTLE_ENDIAN);
    return paramArrayOfByte.getInt();
  }
  
  public static long bytesToLong(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = ByteBuffer.wrap(paramArrayOfByte);
    paramArrayOfByte.order(ByteOrder.LITTLE_ENDIAN);
    return paramArrayOfByte.getLong();
  }
  
  public static short bytesToShort(byte[] paramArrayOfByte)
  {
    paramArrayOfByte = ByteBuffer.wrap(paramArrayOfByte);
    paramArrayOfByte.order(ByteOrder.LITTLE_ENDIAN);
    return paramArrayOfByte.getShort();
  }
  
  public static byte[] charToBytes(char paramChar)
  {
    return new byte[] { (byte)paramChar };
  }
  
  public static byte[] doubleToBytes(double paramDouble)
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(8);
    localByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    localByteBuffer.putDouble(paramDouble);
    return localByteBuffer.array();
  }
  
  public static byte[] floatToBytes(float paramFloat)
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(4);
    localByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    localByteBuffer.putFloat(paramFloat);
    return localByteBuffer.array();
  }
  
  public static String getHexString(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = new byte[paramInt2 - paramInt1 + 1];
    System.arraycopy(paramArrayOfByte, paramInt1, arrayOfByte, 0, arrayOfByte.length);
    return byteArrayToHexStringWithSpace(arrayOfByte);
  }
  
  public static byte hexCharToByte(char paramChar)
  {
    if ((paramChar >= '0') && (paramChar <= '9')) {
      return (byte)(paramChar - '0');
    }
    if ((paramChar >= 'a') && (paramChar <= 'f')) {
      return (byte)(paramChar - 'a' + 10);
    }
    if ((paramChar >= 'A') && (paramChar <= 'F')) {
      return (byte)(paramChar - 'A' + 10);
    }
    return -1;
  }
  
  public static byte[] hexStringToByteArray(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    if (paramString.length() % 2 != 0) {
      return null;
    }
    byte[] arrayOfByte = new byte[paramString.length() / 2];
    int i = 0;
    for (;;)
    {
      if (i >= paramString.length() / 2) {
        return arrayOfByte;
      }
      char c1 = paramString.charAt(i * 2);
      char c2 = paramString.charAt(i * 2 + 1);
      int j = hexCharToByte(c1);
      int k = hexCharToByte(c2);
      if ((j < 0) || (k < 0)) {
        return null;
      }
      arrayOfByte[i] = ((byte)((j << 4) + k));
      i += 1;
    }
  }
  
  public static byte[] intToBytes(int paramInt)
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(4);
    localByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    localByteBuffer.putInt(paramInt);
    return localByteBuffer.array();
  }
  
  public static byte[] longToBytes(long paramLong)
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(8);
    localByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    localByteBuffer.putLong(paramLong);
    return localByteBuffer.array();
  }
  
  public static byte[] shortToBytes(short paramShort)
  {
    ByteBuffer localByteBuffer = ByteBuffer.allocate(2);
    localByteBuffer.order(ByteOrder.LITTLE_ENDIAN);
    localByteBuffer.putShort(paramShort);
    return localByteBuffer.array();
  }
  
  public static short[] stringToShortArray(String paramString)
  {
    int i = 0;
    char[] arrayOfChar = new char[paramString.length()];
    short[] arrayOfShort = new short[paramString.length()];
    paramString.getChars(0, paramString.length(), arrayOfChar, 0);
    for (;;)
    {
      if (i >= arrayOfChar.length) {
        return arrayOfShort;
      }
      arrayOfShort[i] = ((short)arrayOfChar[i]);
      i += 1;
    }
  }
  
  public static String toHex(Integer paramInteger)
  {
    return Integer.toHexString(paramInteger.intValue() & 0xFF | 0xFF00).substring(6).toUpperCase();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\util\ByteUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */