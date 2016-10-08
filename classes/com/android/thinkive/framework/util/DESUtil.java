package com.android.thinkive.framework.util;

import java.security.SecureRandom;
import javax.crypto.Cipher;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;
import org.apache.commons.codec.binary.Base64;

public class DESUtil
{
  private static final String DES = "DES";
  
  public static String decrypt(String paramString1, String paramString2)
  {
    if (paramString1 == null) {
      return null;
    }
    return new String(decrypt(new Base64().decode(paramString1.getBytes()), paramString2.getBytes()));
  }
  
  private static byte[] decrypt(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    SecureRandom localSecureRandom = new SecureRandom();
    paramArrayOfByte2 = new DESKeySpec(paramArrayOfByte2);
    paramArrayOfByte2 = SecretKeyFactory.getInstance("DES").generateSecret(paramArrayOfByte2);
    Cipher localCipher = Cipher.getInstance("DES");
    localCipher.init(2, paramArrayOfByte2, localSecureRandom);
    return localCipher.doFinal(paramArrayOfByte1);
  }
  
  public static String encrypt(String paramString1, String paramString2)
  {
    paramString1 = encrypt(paramString1.getBytes(), paramString2.getBytes());
    return new String(new Base64().encode(paramString1));
  }
  
  public static byte[] encrypt(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    SecureRandom localSecureRandom = new SecureRandom();
    paramArrayOfByte2 = new DESKeySpec(paramArrayOfByte2);
    paramArrayOfByte2 = SecretKeyFactory.getInstance("DES").generateSecret(paramArrayOfByte2);
    Cipher localCipher = Cipher.getInstance("DES");
    localCipher.init(1, paramArrayOfByte2, localSecureRandom);
    return localCipher.doFinal(paramArrayOfByte1);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\util\DESUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */