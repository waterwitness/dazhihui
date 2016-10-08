package com.alipay.sdk.d;

import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class e
{
  private static String a = "DESede/CBC/PKCS5Padding";
  
  public static String a(String paramString1, String paramString2)
  {
    try
    {
      paramString1 = a.a(a(paramString1, paramString2.getBytes()));
      return paramString1;
    }
    catch (Exception paramString1) {}
    return null;
  }
  
  public static byte[] a(String paramString, byte[] paramArrayOfByte)
  {
    try
    {
      paramString = new SecretKeySpec(paramString.getBytes(), "DESede");
      IvParameterSpec localIvParameterSpec = new IvParameterSpec(new byte[8]);
      Cipher localCipher = Cipher.getInstance(a);
      localCipher.init(1, paramString, localIvParameterSpec);
      paramString = localCipher.doFinal(paramArrayOfByte);
      return paramString;
    }
    catch (Exception paramString) {}
    return null;
  }
  
  public static String b(String paramString1, String paramString2)
  {
    try
    {
      paramString1 = new String(b(paramString1, a.a(paramString2)));
      return paramString1;
    }
    catch (Exception paramString1) {}
    return null;
  }
  
  public static byte[] b(String paramString, byte[] paramArrayOfByte)
  {
    try
    {
      paramString = new SecretKeySpec(paramString.getBytes(), "DESede");
      IvParameterSpec localIvParameterSpec = new IvParameterSpec(new byte[8]);
      Cipher localCipher = Cipher.getInstance(a);
      localCipher.init(2, paramString, localIvParameterSpec);
      paramString = localCipher.doFinal(paramArrayOfByte);
      return paramString;
    }
    catch (Exception paramString) {}
    return null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\sdk\d\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */