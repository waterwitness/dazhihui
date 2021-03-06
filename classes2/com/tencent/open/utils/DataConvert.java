package com.tencent.open.utils;

public class DataConvert
{
  public static byte[] intToBytes2(int paramInt)
  {
    byte[] arrayOfByte = new byte[4];
    int i = 0;
    while (i < 4)
    {
      arrayOfByte[i] = ((byte)(paramInt >> 24 - i * 8));
      i += 1;
    }
    return arrayOfByte;
  }
  
  public static int putBytes2Bytes(byte[] paramArrayOfByte1, int paramInt1, byte[] paramArrayOfByte2, int paramInt2)
  {
    int i = 0;
    while (i < paramInt1)
    {
      paramArrayOfByte2[(paramInt2 + i)] = paramArrayOfByte1[i];
      i += 1;
    }
    return paramArrayOfByte1.length;
  }
  
  public static int putBytes2Bytes(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2, int paramInt)
  {
    int i = 0;
    while (i < paramArrayOfByte1.length)
    {
      paramArrayOfByte2[(paramInt + i)] = paramArrayOfByte1[i];
      i += 1;
    }
    return paramArrayOfByte1.length;
  }
  
  public static int putInt2Bytes(int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    byte[] arrayOfByte = intToBytes2(paramInt1);
    paramInt1 = 0;
    while (paramInt1 < arrayOfByte.length)
    {
      paramArrayOfByte[(paramInt2 + paramInt1)] = arrayOfByte[paramInt1];
      paramInt1 += 1;
    }
    return arrayOfByte.length;
  }
  
  public static int putShort2Bytes(int paramInt1, byte[] paramArrayOfByte, int paramInt2)
  {
    byte[] arrayOfByte = intToBytes2(paramInt1);
    paramArrayOfByte[(paramInt2 + 0)] = arrayOfByte[2];
    paramArrayOfByte[(paramInt2 + 1)] = arrayOfByte[3];
    return 2;
  }
  
  public static int putString2Bytes(String paramString, byte[] paramArrayOfByte, int paramInt)
  {
    paramString = string2bytes(paramString);
    int i = 0;
    while (i < paramString.length)
    {
      paramArrayOfByte[(paramInt + i)] = paramString[i];
      i += 1;
    }
    return paramString.length;
  }
  
  public static byte[] string2bytes(String paramString)
  {
    Object localObject = paramString.replace(" ", "");
    int k = ((String)localObject).length();
    int j = k / 2;
    int i = j;
    paramString = (String)localObject;
    if (k % 2 == 1)
    {
      paramString = "0" + (String)localObject;
      i = j + 1;
    }
    localObject = new byte[i];
    j = 0;
    while (j < i)
    {
      localObject[j] = ((byte)Integer.parseInt(paramString.substring(j * 2, j * 2 + 2), 16));
      j += 1;
    }
    return (byte[])localObject;
  }
  
  public static String toHexString(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    StringBuilder localStringBuilder = new StringBuilder(paramArrayOfByte.length * 2);
    int i = 0;
    while (i < paramArrayOfByte.length)
    {
      String str2 = Integer.toString(paramArrayOfByte[i] & 0xFF, 16);
      String str1 = str2;
      if (str2.length() == 1) {
        str1 = "0" + str2;
      }
      localStringBuilder.append(str1);
      i += 1;
    }
    return localStringBuilder.toString();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\open\utils\DataConvert.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */