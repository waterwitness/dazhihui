package com.android.thinkive.framework.util;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public class EncryptUtil
{
  public static String bytesToHex(byte[] paramArrayOfByte)
  {
    String str1 = "";
    int i = 0;
    if (i >= paramArrayOfByte.length) {
      return str1;
    }
    String str2 = Integer.toHexString(paramArrayOfByte[i] & 0xFF);
    if (str2.length() == 1) {}
    for (str1 = str1 + "0" + str2;; str1 = str1 + str2)
    {
      i += 1;
      break;
    }
  }
  
  public static String encryptPwd(String paramString1, String paramString2, String paramString3)
  {
    return encryptToMD5(exchangeString(encryptToMD5(paramString1 + paramString2 + paramString3))).substring(0, 8);
  }
  
  public static String encryptToMD5(String paramString)
  {
    Object localObject = null;
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("MD5");
      localMessageDigest.update(paramString.getBytes());
      paramString = localMessageDigest.digest();
      return bytesToHex(paramString);
    }
    catch (NoSuchAlgorithmException paramString)
    {
      for (;;)
      {
        paramString.printStackTrace();
        paramString = (String)localObject;
      }
    }
  }
  
  public static String encryptToSHA(String paramString)
  {
    Object localObject = null;
    try
    {
      MessageDigest localMessageDigest = MessageDigest.getInstance("SHA-1");
      localMessageDigest.update(paramString.getBytes());
      paramString = localMessageDigest.digest();
      return bytesToHex(paramString);
    }
    catch (NoSuchAlgorithmException paramString)
    {
      for (;;)
      {
        paramString.printStackTrace();
        paramString = (String)localObject;
      }
    }
  }
  
  public static String exchangeString(String paramString)
  {
    String str = paramString.substring(0, paramString.length() / 2);
    return paramString.substring(paramString.length() / 2, paramString.length()) + str;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\util\EncryptUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */