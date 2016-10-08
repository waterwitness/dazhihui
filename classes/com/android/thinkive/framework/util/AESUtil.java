package com.android.thinkive.framework.util;

import java.security.Key;
import java.security.Provider;
import javax.crypto.Cipher;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;
import org.a.c.b.a;

public class AESUtil
{
  public static final String CIPHER_ALGORITHM = "AES/ECB/PKCS7Padding";
  public static final String KEY_ALGORITHM = "AES";
  public static final Provider pro = new a();
  
  public static byte[] decrypt(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    paramArrayOfByte2 = toKey(paramArrayOfByte2);
    Cipher localCipher = Cipher.getInstance("AES/ECB/PKCS7Padding", pro);
    localCipher.init(2, paramArrayOfByte2);
    return localCipher.doFinal(paramArrayOfByte1);
  }
  
  public static byte[] encrypt(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    paramArrayOfByte2 = toKey(paramArrayOfByte2);
    Cipher localCipher = Cipher.getInstance("AES/ECB/PKCS7Padding", pro);
    localCipher.init(1, paramArrayOfByte2);
    return localCipher.doFinal(paramArrayOfByte1);
  }
  
  public static byte[] initkey()
  {
    KeyGenerator localKeyGenerator = KeyGenerator.getInstance("AES", pro);
    localKeyGenerator.init(256);
    return localKeyGenerator.generateKey().getEncoded();
  }
  
  public static Key toKey(byte[] paramArrayOfByte)
  {
    return new SecretKeySpec(paramArrayOfByte, "AES");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\util\AESUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */