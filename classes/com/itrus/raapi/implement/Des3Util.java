package com.itrus.raapi.implement;

import java.io.UnsupportedEncodingException;
import java.security.InvalidKeyException;
import java.security.Key;
import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.KeyGenerator;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESedeKeySpec;
import org.kobjects.base64.Base64;

public class Des3Util
{
  static String UTF8 = "UTF-8";
  
  public static Key getKey()
  {
    try
    {
      Object localObject = new SecureRandom();
      KeyGenerator localKeyGenerator = KeyGenerator.getInstance("DESEDE");
      localKeyGenerator.init((SecureRandom)localObject);
      localObject = localKeyGenerator.generateKey();
      return (Key)localObject;
    }
    catch (NoSuchAlgorithmException localNoSuchAlgorithmException)
    {
      localNoSuchAlgorithmException.printStackTrace();
    }
    return null;
  }
  
  public static Key getKey(String paramString)
  {
    try
    {
      paramString = new DESedeKeySpec(paramString.getBytes());
      paramString = SecretKeyFactory.getInstance("DESEDE").generateSecret(paramString);
      return paramString;
    }
    catch (InvalidKeyException paramString)
    {
      paramString.printStackTrace();
      return null;
    }
    catch (NoSuchAlgorithmException paramString)
    {
      paramString.printStackTrace();
      return null;
    }
    catch (InvalidKeySpecException paramString)
    {
      paramString.printStackTrace();
    }
    return null;
  }
  
  public static String getStrKey()
  {
    byte[] arrayOfByte = getKey().getEncoded();
    StringBuffer localStringBuffer = new StringBuffer();
    char[] arrayOfChar = new char[26];
    char[] tmp23_22 = arrayOfChar;
    tmp23_22[0] = 97;
    char[] tmp28_23 = tmp23_22;
    tmp28_23[1] = 98;
    char[] tmp33_28 = tmp28_23;
    tmp33_28[2] = 99;
    char[] tmp38_33 = tmp33_28;
    tmp38_33[3] = 100;
    char[] tmp43_38 = tmp38_33;
    tmp43_38[4] = 101;
    char[] tmp48_43 = tmp43_38;
    tmp48_43[5] = 102;
    char[] tmp53_48 = tmp48_43;
    tmp53_48[6] = 103;
    char[] tmp59_53 = tmp53_48;
    tmp59_53[7] = 104;
    char[] tmp65_59 = tmp59_53;
    tmp65_59[8] = 105;
    char[] tmp71_65 = tmp65_59;
    tmp71_65[9] = 106;
    char[] tmp77_71 = tmp71_65;
    tmp77_71[10] = 107;
    char[] tmp83_77 = tmp77_71;
    tmp83_77[11] = 108;
    char[] tmp89_83 = tmp83_77;
    tmp89_83[12] = 109;
    char[] tmp95_89 = tmp89_83;
    tmp95_89[13] = 110;
    char[] tmp101_95 = tmp95_89;
    tmp101_95[14] = 111;
    char[] tmp107_101 = tmp101_95;
    tmp107_101[15] = 112;
    char[] tmp113_107 = tmp107_101;
    tmp113_107[16] = 113;
    char[] tmp119_113 = tmp113_107;
    tmp119_113[17] = 114;
    char[] tmp125_119 = tmp119_113;
    tmp125_119[18] = 115;
    char[] tmp131_125 = tmp125_119;
    tmp131_125[19] = 116;
    char[] tmp137_131 = tmp131_125;
    tmp137_131[20] = 117;
    char[] tmp143_137 = tmp137_131;
    tmp143_137[21] = 118;
    char[] tmp149_143 = tmp143_137;
    tmp149_143[22] = 119;
    char[] tmp155_149 = tmp149_143;
    tmp155_149[23] = 120;
    char[] tmp161_155 = tmp155_149;
    tmp161_155[24] = 121;
    char[] tmp167_161 = tmp161_155;
    tmp167_161[25] = 122;
    tmp167_161;
    int i = 0;
    if (i >= 24) {
      return localStringBuffer.toString();
    }
    int j = Integer.valueOf(arrayOfByte[i]).intValue() % 26;
    if (j >= 0) {
      localStringBuffer.append(arrayOfChar[j]);
    }
    for (;;)
    {
      i += 1;
      break;
      localStringBuffer.append(arrayOfChar[(j * -1)]);
    }
  }
  
  public static String symmetricDecry(Key paramKey, String paramString)
  {
    try
    {
      Cipher localCipher = Cipher.getInstance("DESEDE/ECB/PKCS7Padding");
      localCipher.init(2, paramKey);
      paramKey = new String(localCipher.doFinal(Base64.decode(paramString)), UTF8);
      return paramKey;
    }
    catch (NoSuchAlgorithmException paramKey)
    {
      paramKey.printStackTrace();
      return null;
    }
    catch (NoSuchPaddingException paramKey)
    {
      paramKey.printStackTrace();
      return null;
    }
    catch (InvalidKeyException paramKey)
    {
      paramKey.printStackTrace();
      return null;
    }
    catch (IllegalBlockSizeException paramKey)
    {
      paramKey.printStackTrace();
      return null;
    }
    catch (BadPaddingException paramKey)
    {
      paramKey.printStackTrace();
      return null;
    }
    catch (UnsupportedEncodingException paramKey)
    {
      paramKey.printStackTrace();
    }
    return null;
  }
  
  public static String symmetricEncry(Key paramKey, String paramString)
  {
    try
    {
      Cipher localCipher = Cipher.getInstance("DESEDE/ECB/PKCS7Padding");
      localCipher.init(1, paramKey);
      paramKey = localCipher.doFinal(paramString.getBytes(UTF8));
      if (paramKey == null) {
        return null;
      }
    }
    catch (NoSuchAlgorithmException paramKey)
    {
      for (;;)
      {
        paramKey.printStackTrace();
        paramKey = null;
      }
    }
    catch (NoSuchPaddingException paramKey)
    {
      for (;;)
      {
        paramKey.printStackTrace();
        paramKey = null;
      }
    }
    catch (IllegalBlockSizeException paramKey)
    {
      for (;;)
      {
        paramKey.printStackTrace();
        paramKey = null;
      }
    }
    catch (BadPaddingException paramKey)
    {
      for (;;)
      {
        paramKey.printStackTrace();
        paramKey = null;
      }
    }
    catch (UnsupportedEncodingException paramKey)
    {
      for (;;)
      {
        paramKey.printStackTrace();
        paramKey = null;
      }
    }
    catch (InvalidKeyException paramKey)
    {
      for (;;)
      {
        paramKey.printStackTrace();
        paramKey = null;
      }
    }
    return new String(Base64.encode(paramKey));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\itrus\raapi\implement\Des3Util.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */