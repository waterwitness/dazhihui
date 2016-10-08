package com.kwl.common.utils;

import java.math.BigInteger;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.interfaces.RSAPrivateKey;
import java.security.interfaces.RSAPublicKey;
import java.security.spec.RSAPrivateKeySpec;
import java.security.spec.RSAPublicKeySpec;
import java.util.HashMap;
import javax.crypto.Cipher;

public class RSAUtils
{
  private static final String RSA_EXPONENT = "10001";
  private static final String RSA_MODULUS = "B0597B68DC7BE64940673E81E0FA6A6FDB3D0C8637D08CE21909DFD70718B490440C15F9B7E821824DDE595B83D1F317C3E0D2FEFB4A309CBB21E7C17F81828BF90A682A762338F03224D528DB83867DD33F59934FF469AAE89E38CDA63A7EBE3832D09CC26535F5A3B8C9B59DB5A656B408692F0098129E113D0C77A19D234D";
  private static final int RSA_RADIX = 16;
  private static String RSA_TYPE = "RSA/ECB/PKCS1Padding";
  
  public static byte[] ASCII_To_BCD(byte[] paramArrayOfByte, int paramInt)
  {
    byte[] arrayOfByte = new byte[paramInt / 2];
    int j = 0;
    int i = 0;
    if (j >= (paramInt + 1) / 2) {
      return arrayOfByte;
    }
    int m = i + 1;
    arrayOfByte[j] = asc_to_bcd(paramArrayOfByte[i]);
    int k;
    if (m >= paramInt)
    {
      i = m;
      k = 0;
    }
    for (;;)
    {
      arrayOfByte[j] = ((byte)(k + (arrayOfByte[j] << 4)));
      j += 1;
      break;
      k = asc_to_bcd(paramArrayOfByte[m]);
      i = m + 1;
    }
  }
  
  public static byte asc_to_bcd(byte paramByte)
  {
    if ((paramByte >= 48) && (paramByte <= 57)) {
      return (byte)(paramByte - 48);
    }
    if ((paramByte >= 65) && (paramByte <= 70)) {
      return (byte)(paramByte - 65 + 10);
    }
    if ((paramByte >= 97) && (paramByte <= 102)) {
      return (byte)(paramByte - 97 + 10);
    }
    return (byte)(paramByte - 48);
  }
  
  public static String bcd2Str(byte[] paramArrayOfByte)
  {
    char[] arrayOfChar = new char[paramArrayOfByte.length * 2];
    int i = 0;
    if (i >= paramArrayOfByte.length) {
      return new String(arrayOfChar);
    }
    int j = (char)((paramArrayOfByte[i] & 0xF0) >> 4 & 0xF);
    if (j > 9)
    {
      j = j + 65 - 10;
      label52:
      arrayOfChar[(i * 2)] = ((char)j);
      j = (char)(paramArrayOfByte[i] & 0xF);
      if (j <= 9) {
        break label105;
      }
      j = j + 65 - 10;
    }
    for (;;)
    {
      arrayOfChar[(i * 2 + 1)] = ((char)j);
      i += 1;
      break;
      j += 48;
      break label52;
      label105:
      j += 48;
    }
  }
  
  public static String decryptByPrivateKey(String paramString, RSAPrivateKey paramRSAPrivateKey)
  {
    Cipher localCipher = Cipher.getInstance(RSA_TYPE);
    localCipher.init(2, paramRSAPrivateKey);
    int i = paramRSAPrivateKey.getModulus().bitLength() / 8;
    paramString = paramString.getBytes();
    paramRSAPrivateKey = ASCII_To_BCD(paramString, paramString.length);
    paramString = "";
    paramRSAPrivateKey = splitArray(paramRSAPrivateKey, i);
    int j = paramRSAPrivateKey.length;
    i = 0;
    for (;;)
    {
      if (i >= j) {
        return paramString;
      }
      byte[] arrayOfByte = paramRSAPrivateKey[i];
      paramString = paramString + new String(localCipher.doFinal(arrayOfByte));
      i += 1;
    }
  }
  
  public static String encryptByPublicKey(String paramString, RSAPublicKey paramRSAPublicKey)
  {
    Cipher localCipher = Cipher.getInstance(RSA_TYPE);
    localCipher.init(1, paramRSAPublicKey);
    paramRSAPublicKey = splitString(paramString, paramRSAPublicKey.getModulus().bitLength() / 8 - 11);
    paramString = "";
    int j = paramRSAPublicKey.length;
    int i = 0;
    for (;;)
    {
      if (i >= j) {
        return paramString;
      }
      Object localObject = paramRSAPublicKey[i];
      paramString = paramString + bcd2Str(localCipher.doFinal(((String)localObject).getBytes()));
      i += 1;
    }
  }
  
  public static HashMap<String, Object> getKeys()
  {
    HashMap localHashMap = new HashMap();
    Object localObject1 = KeyPairGenerator.getInstance("RSA");
    ((KeyPairGenerator)localObject1).initialize(1024);
    Object localObject2 = ((KeyPairGenerator)localObject1).generateKeyPair();
    localObject1 = (RSAPublicKey)((KeyPair)localObject2).getPublic();
    localObject2 = (RSAPrivateKey)((KeyPair)localObject2).getPrivate();
    localHashMap.put("public", localObject1);
    localHashMap.put("private", localObject2);
    return localHashMap;
  }
  
  public static RSAPrivateKey getPrivateKey(String paramString1, String paramString2, int paramInt)
  {
    try
    {
      paramString1 = new BigInteger(paramString1, paramInt);
      paramString2 = new BigInteger(paramString2, paramInt);
      paramString1 = (RSAPrivateKey)KeyFactory.getInstance("RSA").generatePrivate(new RSAPrivateKeySpec(paramString1, paramString2));
      return paramString1;
    }
    catch (Exception paramString1)
    {
      paramString1.printStackTrace();
    }
    return null;
  }
  
  public static RSAPublicKey getPublicKey(String paramString1, String paramString2, int paramInt)
  {
    try
    {
      paramString1 = new BigInteger(paramString1, paramInt);
      paramString2 = new BigInteger(paramString2, paramInt);
      paramString1 = (RSAPublicKey)KeyFactory.getInstance("RSA").generatePublic(new RSAPublicKeySpec(paramString1, paramString2));
      return paramString1;
    }
    catch (Exception paramString1)
    {
      paramString1.printStackTrace();
    }
    return null;
  }
  
  public static String getRSADecryptValue(String paramString)
  {
    try
    {
      paramString = decryptByPrivateKey(paramString, getPrivateKey("B0597B68DC7BE64940673E81E0FA6A6FDB3D0C8637D08CE21909DFD70718B490440C15F9B7E821824DDE595B83D1F317C3E0D2FEFB4A309CBB21E7C17F81828BF90A682A762338F03224D528DB83867DD33F59934FF469AAE89E38CDA63A7EBE3832D09CC26535F5A3B8C9B59DB5A656B408692F0098129E113D0C77A19D234D", "10001", 16));
      return paramString;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
    return null;
  }
  
  public static String getRSAEncryptValue(String paramString)
  {
    try
    {
      paramString = encryptByPublicKey(paramString, getPublicKey("B0597B68DC7BE64940673E81E0FA6A6FDB3D0C8637D08CE21909DFD70718B490440C15F9B7E821824DDE595B83D1F317C3E0D2FEFB4A309CBB21E7C17F81828BF90A682A762338F03224D528DB83867DD33F59934FF469AAE89E38CDA63A7EBE3832D09CC26535F5A3B8C9B59DB5A656B408692F0098129E113D0C77A19D234D", "10001", 16));
      return paramString;
    }
    catch (Exception paramString)
    {
      paramString.printStackTrace();
    }
    return null;
  }
  
  public static byte[][] splitArray(byte[] paramArrayOfByte, int paramInt)
  {
    int k = paramArrayOfByte.length / paramInt;
    int m = paramArrayOfByte.length % paramInt;
    if (m != 0) {}
    for (int i = 1;; i = 0)
    {
      byte[][] arrayOfByte = new byte[k + i][];
      int j = 0;
      if (j >= k + i) {
        return arrayOfByte;
      }
      byte[] arrayOfByte1 = new byte[paramInt];
      if ((j == k + i - 1) && (m != 0)) {
        System.arraycopy(paramArrayOfByte, j * paramInt, arrayOfByte1, 0, m);
      }
      for (;;)
      {
        arrayOfByte[j] = arrayOfByte1;
        j += 1;
        break;
        System.arraycopy(paramArrayOfByte, j * paramInt, arrayOfByte1, 0, paramInt);
      }
    }
  }
  
  public static String[] splitString(String paramString, int paramInt)
  {
    int k = paramString.length() / paramInt;
    int m = paramString.length() % paramInt;
    if (m != 0) {}
    for (int i = 1;; i = 0)
    {
      String[] arrayOfString = new String[k + i];
      int j = 0;
      if (j >= k + i) {
        return arrayOfString;
      }
      if ((j == k + i - 1) && (m != 0)) {}
      for (String str = paramString.substring(j * paramInt, j * paramInt + m);; str = paramString.substring(j * paramInt, j * paramInt + paramInt))
      {
        arrayOfString[j] = str;
        j += 1;
        break;
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\kwl\common\utils\RSAUtils.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */