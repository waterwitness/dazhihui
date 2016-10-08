package org.a.e.a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class a
{
  private static final c a = new b();
  
  public static byte[] a(byte[] paramArrayOfByte)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream((paramArrayOfByte.length + 2) / 3 * 4);
    try
    {
      a.a(paramArrayOfByte, 0, paramArrayOfByte.length, localByteArrayOutputStream);
      return localByteArrayOutputStream.toByteArray();
    }
    catch (IOException paramArrayOfByte)
    {
      throw new RuntimeException("exception encoding base64 string: " + paramArrayOfByte);
    }
  }
  
  public static byte[] b(byte[] paramArrayOfByte)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream(paramArrayOfByte.length / 4 * 3);
    try
    {
      a.b(paramArrayOfByte, 0, paramArrayOfByte.length, localByteArrayOutputStream);
      return localByteArrayOutputStream.toByteArray();
    }
    catch (IOException paramArrayOfByte)
    {
      throw new RuntimeException("exception decoding base64 string: " + paramArrayOfByte);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\e\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */