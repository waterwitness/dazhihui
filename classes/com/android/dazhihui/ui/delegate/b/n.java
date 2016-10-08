package com.android.dazhihui.ui.delegate.b;

import java.io.ByteArrayOutputStream;
import java.security.KeyFactory;
import java.security.spec.X509EncodedKeySpec;
import javax.crypto.Cipher;

public class n
{
  public static byte[] a(byte[] paramArrayOfByte, String paramString)
  {
    paramString = new X509EncodedKeySpec(b.a(paramString));
    paramString = KeyFactory.getInstance("RSA").generatePublic(paramString);
    Cipher localCipher = Cipher.getInstance("RSA/ECB/PKCS1Padding");
    localCipher.init(1, paramString);
    int k = paramArrayOfByte.length;
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    int j = 0;
    int i = 0;
    if (k - i > 0)
    {
      if (k - i > 117) {}
      for (paramString = localCipher.doFinal(paramArrayOfByte, i, 117);; paramString = localCipher.doFinal(paramArrayOfByte, i, k - i))
      {
        localByteArrayOutputStream.write(paramString, 0, paramString.length);
        j += 1;
        i = j * 117;
        break;
      }
    }
    paramArrayOfByte = localByteArrayOutputStream.toByteArray();
    localByteArrayOutputStream.close();
    return paramArrayOfByte;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\b\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */