package com.iflytek.thirdparty;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;

public final class e
{
  private static final char[] b = { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47 };
  private PrintStream a;
  
  private static int a(InputStream paramInputStream, byte[] paramArrayOfByte)
  {
    int i = 0;
    for (;;)
    {
      int j;
      if (i >= paramArrayOfByte.length) {
        j = paramArrayOfByte.length;
      }
      int k;
      do
      {
        return j;
        k = paramInputStream.read();
        j = i;
      } while (k == -1);
      paramArrayOfByte[i] = ((byte)k);
      i += 1;
    }
  }
  
  private void a(InputStream paramInputStream, OutputStream paramOutputStream)
  {
    byte[] arrayOfByte = new byte[57];
    this.a = new PrintStream(paramOutputStream);
    int j;
    int i;
    for (;;)
    {
      j = a(paramInputStream, arrayOfByte);
      if (j == 0) {
        return;
      }
      i = 0;
      if (i < j) {
        break;
      }
      if (j < 57) {
        return;
      }
      this.a.println();
    }
    if (i + 3 <= j) {
      a(paramOutputStream, arrayOfByte, i, 3);
    }
    for (;;)
    {
      i += 3;
      break;
      a(paramOutputStream, arrayOfByte, i, j - i);
    }
  }
  
  private static void a(OutputStream paramOutputStream, byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    if (paramInt2 == 1)
    {
      paramInt1 = paramArrayOfByte[paramInt1];
      paramOutputStream.write(b[(paramInt1 >>> 2 & 0x3F)]);
      paramOutputStream.write(b[(paramInt1 << 4 & 0x30)]);
      paramOutputStream.write(61);
      paramOutputStream.write(61);
      return;
    }
    if (paramInt2 == 2)
    {
      paramInt2 = paramArrayOfByte[paramInt1];
      paramInt1 = paramArrayOfByte[(paramInt1 + 1)];
      paramOutputStream.write(b[(paramInt2 >>> 2 & 0x3F)]);
      paramOutputStream.write(b[((paramInt2 << 4 & 0x30) + (paramInt1 >>> 4 & 0xF))]);
      paramOutputStream.write(b[(paramInt1 << 2 & 0x3C)]);
      paramOutputStream.write(61);
      return;
    }
    paramInt2 = paramArrayOfByte[paramInt1];
    int i = paramArrayOfByte[(paramInt1 + 1)];
    paramInt1 = paramArrayOfByte[(paramInt1 + 2)];
    paramOutputStream.write(b[(paramInt2 >>> 2 & 0x3F)]);
    paramOutputStream.write(b[((paramInt2 << 4 & 0x30) + (i >>> 4 & 0xF))]);
    paramOutputStream.write(b[((i << 2 & 0x3C) + (paramInt1 >>> 6 & 0x3))]);
    paramOutputStream.write(b[(paramInt1 & 0x3F)]);
  }
  
  public final String a(byte[] paramArrayOfByte)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    paramArrayOfByte = new ByteArrayInputStream(paramArrayOfByte);
    try
    {
      a(paramArrayOfByte, localByteArrayOutputStream);
      paramArrayOfByte = localByteArrayOutputStream.toString("8859_1");
      return paramArrayOfByte;
    }
    catch (Exception paramArrayOfByte)
    {
      throw new Error("CharacterEncoder.encode internal error");
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\thirdparty\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */