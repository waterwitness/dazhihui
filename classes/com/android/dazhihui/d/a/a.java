package com.android.dazhihui.d.a;

import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.NoSuchPaddingException;
import javax.crypto.spec.SecretKeySpec;

public class a
{
  private static String a = null;
  private static int b = 62;
  private static byte[] c = { 65, 115, 38, 77, 111, 98, 105, 108, 101, 67, 108, 105, 101, 110, 116, 42 };
  private static byte[] d = { 100, 122, 104, 46, 119, 97, 112, 46, 108, 111, 116, 116, 101, 114, 121, 46 };
  
  public static String a(String paramString)
  {
    String str = null;
    if (paramString != null) {
      str = org.apache.a.a.a.a.c(paramString);
    }
    return str;
  }
  
  public static byte[] a(byte[] paramArrayOfByte)
  {
    try
    {
      paramArrayOfByte = com.a.a.a.a.a.d(paramArrayOfByte);
      SecretKeySpec localSecretKeySpec = new SecretKeySpec(c, "AES");
      Cipher localCipher = Cipher.getInstance("AES/ECB/PKCS5Padding");
      localCipher.init(2, localSecretKeySpec);
      paramArrayOfByte = localCipher.doFinal(paramArrayOfByte);
      return paramArrayOfByte;
    }
    catch (NoSuchAlgorithmException paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
      return null;
    }
    catch (NoSuchPaddingException paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
      return null;
    }
    catch (InvalidKeyException paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
      return null;
    }
    catch (IllegalBlockSizeException paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
      return null;
    }
    catch (BadPaddingException paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
    }
    return null;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\d\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */