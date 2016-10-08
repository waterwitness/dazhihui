package com.payeco.android.plugin.http.encryption;

import android.text.TextUtils;

public class PinBlockUtil
{
  public static byte[] X98GetPinBlock(String paramString1, String paramString2)
  {
    if ((paramString1 == null) || (paramString2 == null)) {}
    int i;
    do
    {
      return null;
      i = paramString2.length();
    } while ((i <= 12) || (paramString1.length() != 6));
    paramString2 = "0000" + paramString2.substring(i - 13, i - 1);
    paramString1 = "06" + paramString1 + "FFFFFFFF";
    return a(hexStringToBytes(paramString2), hexStringToBytes(paramString1));
  }
  
  private static byte[] a(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    byte[] arrayOfByte2 = new byte[8];
    byte[] arrayOfByte1;
    if ((paramArrayOfByte1.length != 8) || (paramArrayOfByte2.length != 8))
    {
      arrayOfByte1 = null;
      return arrayOfByte1;
    }
    int i = 0;
    for (;;)
    {
      arrayOfByte1 = arrayOfByte2;
      if (i >= 8) {
        break;
      }
      arrayOfByte2[i] = ((byte)(paramArrayOfByte1[i] ^ paramArrayOfByte2[i]));
      i += 1;
    }
  }
  
  private static byte[] c(String paramString)
  {
    int i = paramString.length();
    byte[] arrayOfByte = new byte[8];
    int j = i - 13;
    arrayOfByte[0] = 0;
    arrayOfByte[1] = 0;
    i = 2;
    while (i < 8) {
      try
      {
        arrayOfByte[i] = ((byte)Integer.parseInt(paramString.substring(j, j + 2), 16));
        j += 2;
        i += 1;
      }
      catch (Exception paramString)
      {
        return arrayOfByte;
      }
    }
    return arrayOfByte;
  }
  
  private static byte[] d(String paramString)
  {
    int m = paramString.length();
    byte[] arrayOfByte = new byte[8];
    int j;
    int i;
    try
    {
      arrayOfByte[0] = ((byte)Integer.parseInt(new Integer(m).toString(), 10));
      if (m % 2 != 0) {
        break label228;
      }
      j = 1;
      i = 0;
    }
    catch (Exception paramString)
    {
      label85:
      return arrayOfByte;
    }
    arrayOfByte[j] = ((byte)Integer.parseInt(paramString.substring(i, i + 2), 16));
    int k;
    if ((i == m - 2) && (j < 7)) {
      k = j + 1;
    }
    for (;;)
    {
      if (i < m - 1)
      {
        arrayOfByte[j] = ((byte)Integer.parseInt(paramString.substring(i, i + 2), 16));
        if (i == m - 3)
        {
          arrayOfByte[(j + 1)] = ((byte)Integer.parseInt(paramString.substring(m - 1) + "F", 16));
          if (j + 1 < 7) {
            k = j + 2;
          }
        }
      }
      else
      {
        label188:
        label228:
        while (k < 8)
        {
          arrayOfByte[k] = -1;
          k += 1;
          continue;
          if (i >= m) {
            return arrayOfByte;
          }
          for (;;)
          {
            if (k >= 8)
            {
              j += 1;
              i += 2;
              break label188;
              break;
            }
            arrayOfByte[k] = -1;
            k += 1;
          }
          j = 1;
          i = 0;
          break label85;
        }
      }
      j += 1;
      i += 2;
    }
  }
  
  public static byte[] hexStringToBytes(String paramString)
  {
    if ((paramString == null) || (paramString.equals("")))
    {
      paramString = null;
      return paramString;
    }
    paramString = paramString.toUpperCase();
    int j = paramString.length() / 2;
    char[] arrayOfChar = paramString.toCharArray();
    byte[] arrayOfByte = new byte[j];
    int i = 0;
    for (;;)
    {
      paramString = arrayOfByte;
      if (i >= j) {
        break;
      }
      int k = i * 2;
      int m = (byte)"0123456789ABCDEF".indexOf(arrayOfChar[k]);
      arrayOfByte[i] = ((byte)((byte)"0123456789ABCDEF".indexOf(arrayOfChar[(k + 1)]) | m << 4));
      i += 1;
    }
  }
  
  public String encryptedPin(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    if ((TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2)) || (TextUtils.isEmpty(paramString3)) || (TextUtils.isEmpty(paramString4))) {}
    for (;;)
    {
      return null;
      try
      {
        paramString1 = X98GetPinBlock(paramString2, paramString1);
        if (paramString1 == null) {
          continue;
        }
        paramString1 = RSA.encryptForConfig(paramString1, paramString3, paramString4);
        return paramString1;
      }
      catch (Exception paramString1)
      {
        throw new Exception("加密转PIN失败", paramString1);
      }
    }
  }
  
  public byte[] pin2PinBlockWithCardNO(String paramString1, String paramString2)
  {
    byte[] arrayOfByte = d(paramString2);
    int i;
    if (paramString1.length() == 11)
    {
      paramString2 = "00" + paramString1;
      paramString1 = c(paramString2);
      paramString2 = new byte[8];
      i = 0;
    }
    for (;;)
    {
      if (i >= 8)
      {
        return paramString2;
        paramString2 = paramString1;
        if (paramString1.length() != 12) {
          break;
        }
        paramString2 = "0" + paramString1;
        break;
      }
      paramString2[i] = ((byte)(arrayOfByte[i] ^ paramString1[i]));
      i += 1;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\http\encryption\PinBlockUtil.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */