package com.payeco.android.plugin.http.encryption;

import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

public class ThreeDES
{
  public static byte[] decryptMode(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    try
    {
      paramArrayOfByte1 = new SecretKeySpec(paramArrayOfByte1, "DESede");
      Cipher localCipher = Cipher.getInstance("DESede/ECB/PKCS5Padding");
      localCipher.init(2, paramArrayOfByte1);
      paramArrayOfByte1 = localCipher.doFinal(paramArrayOfByte2);
      return paramArrayOfByte1;
    }
    catch (NoSuchAlgorithmException paramArrayOfByte1)
    {
      paramArrayOfByte1.printStackTrace();
      return null;
    }
    catch (NoSuchPaddingException paramArrayOfByte1)
    {
      for (;;)
      {
        paramArrayOfByte1.printStackTrace();
      }
    }
    catch (Exception paramArrayOfByte1)
    {
      for (;;)
      {
        paramArrayOfByte1.printStackTrace();
      }
    }
  }
  
  public static byte[] encryptMode(byte[] paramArrayOfByte1, byte[] paramArrayOfByte2)
  {
    try
    {
      paramArrayOfByte1 = new SecretKeySpec(paramArrayOfByte1, "DESede");
      Cipher localCipher = Cipher.getInstance("DESede/ECB/PKCS5Padding");
      localCipher.init(1, paramArrayOfByte1);
      paramArrayOfByte1 = localCipher.doFinal(paramArrayOfByte2);
      return paramArrayOfByte1;
    }
    catch (NoSuchAlgorithmException paramArrayOfByte1)
    {
      paramArrayOfByte1.printStackTrace();
      return null;
    }
    catch (NoSuchPaddingException paramArrayOfByte1)
    {
      for (;;)
      {
        paramArrayOfByte1.printStackTrace();
      }
    }
    catch (Exception paramArrayOfByte1)
    {
      for (;;)
      {
        paramArrayOfByte1.printStackTrace();
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\http\encryption\ThreeDES.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */