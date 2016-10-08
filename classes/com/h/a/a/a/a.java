package com.h.a.a.a;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public class a
{
  public static byte[] a = { 48, 48, 49, 55, 68, 67, 49, 66, 69, 50, 50, 53, 56, 53, 53, 52, 67, 70, 48, 50, 67, 53, 55, 66, 55, 56, 69, 55, 52, 48, 65, 53 };
  
  public static String a(String paramString1, String paramString2)
  {
    Object localObject = null;
    try
    {
      paramString1 = a(b(paramString1.getBytes()), paramString2.getBytes());
      paramString2 = (String)localObject;
      if (paramString1 != null) {
        paramString2 = a(paramString1);
      }
      return paramString2;
    }
    catch (Exception paramString1)
    {
      for (;;)
      {
        paramString1 = null;
      }
    }
  }
  
  public static String a(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return "";
    }
    StringBuffer localStringBuffer = new StringBuffer(paramArrayOfByte.length * 2);
    int i = 0;
    for (;;)
    {
      if (i >= paramArrayOfByte.length) {
        return localStringBuffer.toString();
      }
      a(localStringBuffer, paramArrayOfByte[i]);
      i += 1;
    }
  }
  
  private static void a(StringBuffer paramStringBuffer, byte paramByte)
  {
    paramStringBuffer.append("0123456789ABCDEF".charAt(paramByte >> 4 & 0xF)).append("0123456789ABCDEF".charAt(paramByte & 0xF));
  }
  
  public static byte[] a(String paramString)
  {
    int j = paramString.length() / 2;
    byte[] arrayOfByte = new byte[j];
    int i = 0;
    for (;;)
    {
      if (i >= j) {
        return arrayOfByte;
      }
      arrayOfByte[i] = Integer.valueOf(paramString.substring(i * 2, i * 2 + 2), 16).byteValue();
      i += 1;
    }
  }
  
  private static byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    paramArrayOfByte1 = new SecretKeySpec(paramArrayOfByte1, "AES");
    Cipher localCipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
    localCipher.init(1, paramArrayOfByte1, new IvParameterSpec(new byte[localCipher.getBlockSize()]));
    return localCipher.doFinal(paramArrayOfByte2);
  }
  
  public static String b(String paramString1, String paramString2)
  {
    try
    {
      paramString1 = new String(b(b(paramString1.getBytes()), a(paramString2)));
      return paramString1;
    }
    catch (Exception paramString1) {}
    return null;
  }
  
  private static byte[] b(byte[] paramArrayOfByte)
  {
    return a(new String(a, 0, 32));
  }
  
  private static byte[] b(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    paramArrayOfByte1 = new SecretKeySpec(paramArrayOfByte1, "AES");
    Cipher localCipher = Cipher.getInstance("AES/CBC/PKCS5Padding");
    localCipher.init(2, paramArrayOfByte1, new IvParameterSpec(new byte[localCipher.getBlockSize()]));
    return localCipher.doFinal(paramArrayOfByte2);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\h\a\a\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */