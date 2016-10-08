package org.a.e.a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class d
{
  private static final c a = new e();
  
  public static byte[] a(String paramString)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    try
    {
      a.a(paramString, localByteArrayOutputStream);
      return localByteArrayOutputStream.toByteArray();
    }
    catch (IOException paramString)
    {
      throw new RuntimeException("exception decoding Hex string: " + paramString);
    }
  }
  
  public static byte[] a(byte[] paramArrayOfByte)
  {
    return a(paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static byte[] a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    try
    {
      a.a(paramArrayOfByte, paramInt1, paramInt2, localByteArrayOutputStream);
      return localByteArrayOutputStream.toByteArray();
    }
    catch (IOException paramArrayOfByte)
    {
      throw new RuntimeException("exception encoding Hex string: " + paramArrayOfByte);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\e\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */