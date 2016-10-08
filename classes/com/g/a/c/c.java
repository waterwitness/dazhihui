package com.g.a.c;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public final class c
{
  public static void a(Closeable paramCloseable)
  {
    if (paramCloseable != null) {}
    try
    {
      paramCloseable.close();
      return;
    }
    catch (Exception paramCloseable) {}
  }
  
  public static void a(InputStream paramInputStream)
  {
    byte[] arrayOfByte = new byte[32768];
    try
    {
      int i;
      do
      {
        i = paramInputStream.read(arrayOfByte, 0, 32768);
      } while (i != -1);
      a(paramInputStream);
      return;
    }
    catch (IOException localIOException)
    {
      localIOException = localIOException;
      a(paramInputStream);
      return;
    }
    finally
    {
      localObject = finally;
      a(paramInputStream);
      throw ((Throwable)localObject);
    }
  }
  
  private static boolean a(d paramd, int paramInt1, int paramInt2)
  {
    return (paramd != null) && (!paramd.a(paramInt1, paramInt2)) && (paramInt1 * 100 / paramInt2 < 75);
  }
  
  public static boolean a(InputStream paramInputStream, OutputStream paramOutputStream, d paramd, int paramInt)
  {
    int j = paramInputStream.available();
    int i = j;
    if (j <= 0) {
      i = 512000;
    }
    byte[] arrayOfByte = new byte[paramInt];
    if (a(paramd, 0, i)) {
      return false;
    }
    j = 0;
    int k;
    do
    {
      k = paramInputStream.read(arrayOfByte, 0, paramInt);
      if (k == -1) {
        break;
      }
      paramOutputStream.write(arrayOfByte, 0, k);
      k = j + k;
      j = k;
    } while (!a(paramd, k, i));
    return false;
    paramOutputStream.flush();
    return true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\g\a\c\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */