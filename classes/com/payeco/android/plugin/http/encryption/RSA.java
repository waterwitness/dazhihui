package com.payeco.android.plugin.http.encryption;

import java.io.FileInputStream;
import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.PublicKey;
import java.security.cert.Certificate;
import java.security.cert.CertificateFactory;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPublicKeySpec;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

public class RSA
{
  public static String encrypt(byte[] paramArrayOfByte, String paramString)
  {
    try
    {
      Object localObject = CertificateFactory.getInstance("X.509");
      paramString = new FileInputStream(paramString);
      localObject = ((CertificateFactory)localObject).generateCertificate(paramString);
      paramString.close();
      paramString = (RSAPublicKey)((Certificate)localObject).getPublicKey();
      localObject = Cipher.getInstance("RSA/ECB/PKCS1PADDING");
      ((Cipher)localObject).init(1, paramString);
      paramArrayOfByte = Base64.encodeLines(((Cipher)localObject).doFinal(paramArrayOfByte));
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
    }
    return "";
  }
  
  public static String encryptForConfig(String paramString1, String paramString2)
  {
    try
    {
      paramString2 = Base64.decodeLines(paramString2);
      paramString2 = (RSAPublicKey)KeyFactory.getInstance("RSA").generatePublic(new X509EncodedKeySpec(paramString2));
      Cipher localCipher = Cipher.getInstance("RSA/ECB/PKCS1PADDING");
      localCipher.init(1, paramString2);
      paramString1 = Base64.encodeLines(localCipher.doFinal(paramString1.getBytes()));
      return paramString1;
    }
    catch (Exception paramString1)
    {
      paramString1.printStackTrace();
    }
    return "";
  }
  
  public static String encryptForConfig(String paramString1, String paramString2, String paramString3)
  {
    try
    {
      paramString2 = getPublicKey(paramString2, paramString3);
      paramString3 = Cipher.getInstance("RSA/ECB/PKCS1PADDING");
      paramString3.init(1, paramString2);
      paramString1 = Base64.encodeLines(paramString3.doFinal(paramString1.getBytes())).replaceAll("\t|\r|\n", "");
      return paramString1;
    }
    catch (Exception paramString1)
    {
      paramString1.printStackTrace();
    }
    return "";
  }
  
  public static String encryptForConfig(byte[] paramArrayOfByte, String paramString1, String paramString2)
  {
    try
    {
      paramString1 = getPublicKey(paramString1, paramString2);
      paramString2 = Cipher.getInstance("RSA/ECB/PKCS1PADDING");
      paramString2.init(1, paramString1);
      paramArrayOfByte = Base64.encodeLines(paramString2.doFinal(paramArrayOfByte)).replaceAll("\t|\r|\n", "");
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
    }
    return "";
  }
  
  public static PublicKey getPublicKey(String paramString1, String paramString2)
  {
    paramString1 = new RSAPublicKeySpec(new BigInteger(paramString1, 16), new BigInteger(paramString2, 16));
    return KeyFactory.getInstance("RSA").generatePublic(paramString1);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\http\encryption\RSA.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */