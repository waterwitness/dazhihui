package com.iflytek.thirdparty;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.security.spec.AlgorithmParameterSpec;
import java.util.zip.GZIPOutputStream;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

final class g
{
  private static g a = new g();
  private SecretKeySpec b;
  
  public static g a()
  {
    return a;
  }
  
  private static byte[] b(String paramString)
  {
    if ((paramString == null) || (paramString.length() == 0)) {
      return null;
    }
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    try
    {
      GZIPOutputStream localGZIPOutputStream = new GZIPOutputStream(localByteArrayOutputStream);
      localGZIPOutputStream.write(paramString.getBytes("utf-8"));
      localGZIPOutputStream.close();
      return localByteArrayOutputStream.toByteArray();
    }
    catch (IOException paramString)
    {
      for (;;)
      {
        paramString.printStackTrace();
      }
    }
  }
  
  public final byte[] a(String paramString)
  {
    Object localObject1;
    Object localObject2;
    int i;
    if (this.b == null)
    {
      localObject1 = "134e3265829ff82daf16e7b740a600b5".getBytes();
      localObject2 = new byte[16];
      i = 0;
    }
    for (;;)
    {
      if ((i >= localObject1.length) || (i >= localObject2.length))
      {
        this.b = new SecretKeySpec((byte[])localObject2, "AES");
        localObject1 = Cipher.getInstance("AES/CBC/PKCS5Padding");
        localObject2 = new IvParameterSpec("0102030405060708".getBytes());
        ((Cipher)localObject1).init(1, this.b, (AlgorithmParameterSpec)localObject2);
        paramString = ((Cipher)localObject1).doFinal(paramString.getBytes());
        return b(new e().a(paramString));
      }
      localObject2[i] = localObject1[i];
      i += 1;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */