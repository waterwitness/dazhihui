package com.alipay.d.a.a.a.a;

import java.lang.reflect.Method;
import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

public final class c
{
  private static String a = new String("idnjfhncnsfuobcnt847y929o449u474w7j3h22aoddc98euk#%&&)*&^%#");
  
  public static String a()
  {
    String str = new String();
    int i = 0;
    while (i < a.length() - 1)
    {
      str = str + a.charAt(i);
      i += 4;
    }
    return str;
  }
  
  public static String a(String paramString1, String paramString2)
  {
    Object localObject1 = null;
    try
    {
      Object localObject2 = a(paramString1.getBytes());
      paramString1 = paramString2.getBytes();
      paramString2 = new SecretKeySpec((byte[])localObject2, "AES");
      localObject2 = Cipher.getInstance("AES/CBC/PKCS5Padding");
      ((Cipher)localObject2).init(1, paramString2, new IvParameterSpec(new byte[((Cipher)localObject2).getBlockSize()]));
      paramString1 = ((Cipher)localObject2).doFinal(paramString1);
      return b(paramString1);
    }
    catch (Exception paramString1)
    {
      for (;;)
      {
        paramString1 = (String)localObject1;
      }
    }
  }
  
  private static byte[] a(byte[] paramArrayOfByte)
  {
    KeyGenerator localKeyGenerator = KeyGenerator.getInstance("AES");
    SecureRandom localSecureRandom = SecureRandom.getInstance("SHA1PRNG", "Crypto");
    Method localMethod = SecureRandom.class.getMethod("setSeed", new Class[] { paramArrayOfByte.getClass() });
    localMethod.setAccessible(true);
    localMethod.invoke(localSecureRandom, new Object[] { paramArrayOfByte });
    localKeyGenerator.init(128, localSecureRandom);
    return localKeyGenerator.generateKey().getEncoded();
  }
  
  public static String b(String paramString1, String paramString2)
  {
    try
    {
      Object localObject = a(paramString1.getBytes());
      int j = paramString2.length() / 2;
      paramString1 = new byte[j];
      int i = 0;
      while (i < j)
      {
        paramString1[i] = Integer.valueOf(paramString2.substring(i * 2, i * 2 + 2), 16).byteValue();
        i += 1;
      }
      paramString2 = new SecretKeySpec((byte[])localObject, "AES");
      localObject = Cipher.getInstance("AES/CBC/PKCS5Padding");
      ((Cipher)localObject).init(2, paramString2, new IvParameterSpec(new byte[((Cipher)localObject).getBlockSize()]));
      paramString1 = new String(((Cipher)localObject).doFinal(paramString1));
      return paramString1;
    }
    catch (Exception paramString1) {}
    return null;
  }
  
  private static String b(byte[] paramArrayOfByte)
  {
    if (paramArrayOfByte == null) {
      return "";
    }
    StringBuffer localStringBuffer = new StringBuffer(paramArrayOfByte.length * 2);
    int i = 0;
    while (i < paramArrayOfByte.length)
    {
      int j = paramArrayOfByte[i];
      localStringBuffer.append("0123456789ABCDEF".charAt(j >> 4 & 0xF)).append("0123456789ABCDEF".charAt(j & 0xF));
      i += 1;
    }
    return localStringBuffer.toString();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\d\a\a\a\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */