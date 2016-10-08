package com.android.thinkive.framework.util;

import java.math.BigInteger;
import java.security.PrivateKey;
import java.security.Provider;
import java.security.PublicKey;
import javax.crypto.Cipher;
import org.a.c.b.a;

public class RSAUtil
{
  public static final String PKCS1Padding = "RSA/ECB/PKCS1Padding";
  public static final String RSAPadding = "RSA";
  public static final Provider pro = new a();
  
  public static byte[] decrypt(PrivateKey paramPrivateKey, byte[] paramArrayOfByte, String paramString)
  {
    paramString = Cipher.getInstance(paramString, pro);
    paramString.init(2, paramPrivateKey);
    return paramString.doFinal(paramArrayOfByte);
  }
  
  private static byte[] encrypt(PublicKey paramPublicKey, byte[] paramArrayOfByte, String paramString)
  {
    try
    {
      paramString = Cipher.getInstance(paramString, pro);
      paramString.init(1, paramPublicKey);
      paramPublicKey = paramString.doFinal(paramArrayOfByte);
      return paramPublicKey;
    }
    catch (Exception paramPublicKey)
    {
      throw new Exception(paramPublicKey.getMessage());
    }
  }
  
  public static byte[] encryptByPublicKey(String paramString1, String paramString2, String paramString3)
  {
    return encrypt(generateRSAPublicKey(new BigInteger(paramString1, 16).toByteArray(), new BigInteger(paramString2, 16).toByteArray()), paramString3.getBytes(), "RSA");
  }
  
  public static byte[] encryptByPublicKey(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    return encrypt(generateRSAPublicKey(new BigInteger(paramString1, 16).toByteArray(), new BigInteger(paramString2, 16).toByteArray()), paramString3.getBytes(), paramString4);
  }
  
  /* Error */
  public static java.security.interfaces.RSAPrivateKey generateRSAPrivateKey(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    // Byte code:
    //   0: ldc 11
    //   2: getstatic 22	com/android/thinkive/framework/util/RSAUtil:pro	Ljava/security/Provider;
    //   5: invokestatic 85	java/security/KeyFactory:getInstance	(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/KeyFactory;
    //   8: astore_2
    //   9: new 87	java/security/spec/RSAPrivateKeySpec
    //   12: dup
    //   13: new 55	java/math/BigInteger
    //   16: dup
    //   17: aload_0
    //   18: invokespecial 90	java/math/BigInteger:<init>	([B)V
    //   21: new 55	java/math/BigInteger
    //   24: dup
    //   25: aload_1
    //   26: invokespecial 90	java/math/BigInteger:<init>	([B)V
    //   29: invokespecial 93	java/security/spec/RSAPrivateKeySpec:<init>	(Ljava/math/BigInteger;Ljava/math/BigInteger;)V
    //   32: astore_0
    //   33: aload_2
    //   34: aload_0
    //   35: invokevirtual 97	java/security/KeyFactory:generatePrivate	(Ljava/security/spec/KeySpec;)Ljava/security/PrivateKey;
    //   38: checkcast 99	java/security/interfaces/RSAPrivateKey
    //   41: astore_0
    //   42: aload_0
    //   43: areturn
    //   44: astore_0
    //   45: new 44	java/lang/Exception
    //   48: dup
    //   49: aload_0
    //   50: invokevirtual 100	java/security/NoSuchAlgorithmException:getMessage	()Ljava/lang/String;
    //   53: invokespecial 51	java/lang/Exception:<init>	(Ljava/lang/String;)V
    //   56: athrow
    //   57: astore_0
    //   58: new 44	java/lang/Exception
    //   61: dup
    //   62: aload_0
    //   63: invokevirtual 101	java/security/spec/InvalidKeySpecException:getMessage	()Ljava/lang/String;
    //   66: invokespecial 51	java/lang/Exception:<init>	(Ljava/lang/String;)V
    //   69: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	70	0	paramArrayOfByte1	byte[]
    //   0	70	1	paramArrayOfByte2	byte[]
    //   8	26	2	localKeyFactory	java.security.KeyFactory
    // Exception table:
    //   from	to	target	type
    //   0	9	44	java/security/NoSuchAlgorithmException
    //   33	42	57	java/security/spec/InvalidKeySpecException
  }
  
  /* Error */
  public static java.security.interfaces.RSAPublicKey generateRSAPublicKey(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    // Byte code:
    //   0: ldc 11
    //   2: getstatic 22	com/android/thinkive/framework/util/RSAUtil:pro	Ljava/security/Provider;
    //   5: invokestatic 85	java/security/KeyFactory:getInstance	(Ljava/lang/String;Ljava/security/Provider;)Ljava/security/KeyFactory;
    //   8: astore_2
    //   9: new 103	java/security/spec/RSAPublicKeySpec
    //   12: dup
    //   13: new 55	java/math/BigInteger
    //   16: dup
    //   17: aload_0
    //   18: invokespecial 90	java/math/BigInteger:<init>	([B)V
    //   21: new 55	java/math/BigInteger
    //   24: dup
    //   25: aload_1
    //   26: invokespecial 90	java/math/BigInteger:<init>	([B)V
    //   29: invokespecial 104	java/security/spec/RSAPublicKeySpec:<init>	(Ljava/math/BigInteger;Ljava/math/BigInteger;)V
    //   32: astore_0
    //   33: aload_2
    //   34: aload_0
    //   35: invokevirtual 108	java/security/KeyFactory:generatePublic	(Ljava/security/spec/KeySpec;)Ljava/security/PublicKey;
    //   38: checkcast 110	java/security/interfaces/RSAPublicKey
    //   41: astore_0
    //   42: aload_0
    //   43: areturn
    //   44: astore_0
    //   45: new 44	java/lang/Exception
    //   48: dup
    //   49: aload_0
    //   50: invokevirtual 100	java/security/NoSuchAlgorithmException:getMessage	()Ljava/lang/String;
    //   53: invokespecial 51	java/lang/Exception:<init>	(Ljava/lang/String;)V
    //   56: athrow
    //   57: astore_0
    //   58: new 44	java/lang/Exception
    //   61: dup
    //   62: aload_0
    //   63: invokevirtual 101	java/security/spec/InvalidKeySpecException:getMessage	()Ljava/lang/String;
    //   66: invokespecial 51	java/lang/Exception:<init>	(Ljava/lang/String;)V
    //   69: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	70	0	paramArrayOfByte1	byte[]
    //   0	70	1	paramArrayOfByte2	byte[]
    //   8	26	2	localKeyFactory	java.security.KeyFactory
    // Exception table:
    //   from	to	target	type
    //   0	9	44	java/security/NoSuchAlgorithmException
    //   33	42	57	java/security/spec/InvalidKeySpecException
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\util\RSAUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */