package org.a.e.b;

import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public final class a
{
  private static int a = 512;
  
  public static int a(InputStream paramInputStream, byte[] paramArrayOfByte)
  {
    return a(paramInputStream, paramArrayOfByte, 0, paramArrayOfByte.length);
  }
  
  public static int a(InputStream paramInputStream, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    int i = 0;
    for (;;)
    {
      int j;
      if (i < paramInt2)
      {
        j = paramInputStream.read(paramArrayOfByte, paramInt1 + i, paramInt2 - i);
        if (j >= 0) {}
      }
      else
      {
        return i;
      }
      i += j;
    }
  }
  
  public static void a(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    byte[] arrayOfByte = new byte[a];
    for (;;)
    {
      int i = paramInputStream.read(arrayOfByte, 0, arrayOfByte.length);
      if (i < 0) {
        break;
      }
      paramOutputStream.write(arrayOfByte, 0, i);
    }
  }
  
  public static byte[] a(InputStream paramInputStream)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    a(paramInputStream, localByteArrayOutputStream);
    return localByteArrayOutputStream.toByteArray();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\e\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */