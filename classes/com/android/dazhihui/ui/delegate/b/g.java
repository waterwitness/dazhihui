package com.android.dazhihui.ui.delegate.b;

import java.io.UnsupportedEncodingException;

public class g
{
  private static boolean a = false;
  private byte[] b;
  private int c;
  private int d;
  private boolean e = a;
  
  public g()
  {
    this(256);
  }
  
  public g(int paramInt)
  {
    this.b = new byte[paramInt];
    this.c = 0;
    this.d = 0;
  }
  
  public g(byte[] paramArrayOfByte)
  {
    this.b = paramArrayOfByte;
    this.c = 0;
    this.d = paramArrayOfByte.length;
  }
  
  public static String b(byte[] paramArrayOfByte)
  {
    try
    {
      paramArrayOfByte = new String(paramArrayOfByte, "GBK");
      return paramArrayOfByte;
    }
    catch (UnsupportedEncodingException paramArrayOfByte)
    {
      paramArrayOfByte.printStackTrace();
    }
    return "";
  }
  
  public static byte[] b(String paramString)
  {
    int k = 0;
    int m = paramString.length();
    char[] arrayOfChar = new char[m];
    paramString.getChars(0, m, arrayOfChar, 0);
    int j = 0;
    int i = 0;
    int n;
    if (j < m)
    {
      n = arrayOfChar[j];
      if ((n >= 1) && (n <= 127)) {
        i += 1;
      }
      for (;;)
      {
        j += 1;
        break;
        if (n > 2047) {
          i += 3;
        } else {
          i += 2;
        }
      }
    }
    if (i > 32767) {
      throw new RuntimeException();
    }
    paramString = new byte[i];
    i = 0;
    j = k;
    if (j < m)
    {
      n = arrayOfChar[j];
      if ((n >= 1) && (n <= 127))
      {
        k = i + 1;
        paramString[i] = ((byte)n);
        i = k;
      }
      for (;;)
      {
        j += 1;
        break;
        if (n > 2047)
        {
          k = i + 1;
          paramString[i] = ((byte)(n >> 12 & 0xF | 0xE0));
          int i1 = k + 1;
          paramString[k] = ((byte)(n >> 6 & 0x3F | 0x80));
          i = i1 + 1;
          paramString[i1] = ((byte)(n >> 0 & 0x3F | 0x80));
        }
        else
        {
          k = i + 1;
          paramString[i] = ((byte)(n >> 6 & 0x1F | 0xC0));
          i = k + 1;
          paramString[k] = ((byte)(n >> 0 & 0x3F | 0x80));
        }
      }
    }
    return paramString;
  }
  
  public static String c(byte[] paramArrayOfByte)
  {
    int k = 0;
    if (o.a) {
      try
      {
        paramArrayOfByte = new String(paramArrayOfByte, "GBK");
        return paramArrayOfByte;
      }
      catch (UnsupportedEncodingException paramArrayOfByte)
      {
        paramArrayOfByte.printStackTrace();
        return "";
      }
    }
    int m = paramArrayOfByte.length;
    int j = 0;
    int i = 0;
    int n;
    while (j < m)
    {
      n = (paramArrayOfByte[j] & 0xFF) >> 4;
      if ((n >= 0) && (n <= 7))
      {
        j += 1;
        i += 1;
      }
      else if ((n >= 12) && (n <= 13))
      {
        j += 2;
        i += 1;
      }
      else if (n == 14)
      {
        j += 3;
        i += 1;
      }
      else
      {
        throw new RuntimeException();
      }
    }
    char[] arrayOfChar = new char[i];
    i = 0;
    j = k;
    while (j < m)
    {
      k = paramArrayOfByte[j] & 0xFF;
      n = k >> 4;
      if ((n >= 0) && (n <= 7))
      {
        j += 1;
        arrayOfChar[i] = ((char)k);
        i += 1;
      }
      else if ((n >= 12) && (n <= 13))
      {
        j += 2;
        n = paramArrayOfByte[(j - 1)];
        if ((n & 0xC0) != 128) {
          throw new RuntimeException();
        }
        arrayOfChar[i] = ((char)((k & 0x1F) << 6 | n & 0x3F));
        i += 1;
      }
      else if (n == 14)
      {
        j += 3;
        n = paramArrayOfByte[(j - 2)];
        int i1 = paramArrayOfByte[(j - 1)];
        if (((n & 0xC0) != 128) || ((i1 & 0xC0) != 128)) {
          throw new RuntimeException();
        }
        arrayOfChar[i] = ((char)((k & 0xF) << 12 | (n & 0x3F) << 6 | (i1 & 0x3F) << 0));
        i += 1;
      }
    }
    return new String(arrayOfChar);
  }
  
  private void i(int paramInt)
  {
    if (this.c + paramInt > this.d) {
      this.d = (this.c + paramInt);
    }
    if (this.c + paramInt <= this.b.length) {
      return;
    }
    byte[] arrayOfByte = new byte[this.b.length + paramInt + 256];
    System.arraycopy(this.b, 0, arrayOfByte, 0, this.b.length);
    this.b = arrayOfByte;
  }
  
  private void j(int paramInt)
  {
    if (this.c + paramInt > this.d) {
      throw new RuntimeException("Out of DataBuffer's Length");
    }
  }
  
  public void a(int paramInt)
  {
    this.c = paramInt;
  }
  
  public void a(int paramInt, byte[] paramArrayOfByte)
  {
    int i = this.c;
    this.c = paramInt;
    a(paramArrayOfByte);
    this.c = i;
  }
  
  public void a(String paramString)
  {
    paramString = b(paramString);
    f(paramString.length);
    a(paramString);
  }
  
  public void a(boolean paramBoolean)
  {
    this.e = paramBoolean;
  }
  
  public void a(byte[] paramArrayOfByte)
  {
    i(paramArrayOfByte.length);
    System.arraycopy(paramArrayOfByte, 0, this.b, this.c, paramArrayOfByte.length);
    this.c += paramArrayOfByte.length;
  }
  
  public void a(int[] paramArrayOfInt)
  {
    f(paramArrayOfInt.length);
    int i = 0;
    while (i < paramArrayOfInt.length)
    {
      e(paramArrayOfInt[i]);
      i += 1;
    }
  }
  
  public void a(String[] paramArrayOfString)
  {
    f(paramArrayOfString.length);
    int i = 0;
    while (i < paramArrayOfString.length)
    {
      a(paramArrayOfString[i]);
      i += 1;
    }
  }
  
  public void a(int[][] paramArrayOfInt)
  {
    if (paramArrayOfInt == null) {}
    for (int i = -1;; i = paramArrayOfInt.length)
    {
      f(i);
      if (paramArrayOfInt == null) {
        break;
      }
      i = 0;
      while (i < paramArrayOfInt.length)
      {
        a(paramArrayOfInt[i]);
        i += 1;
      }
    }
  }
  
  public void a(String[][] paramArrayOfString)
  {
    if (paramArrayOfString == null) {}
    for (int i = -1;; i = paramArrayOfString.length)
    {
      f(i);
      if (paramArrayOfString == null) {
        break;
      }
      i = 0;
      while (i < paramArrayOfString.length)
      {
        a(paramArrayOfString[i]);
        i += 1;
      }
    }
  }
  
  public byte[] a()
  {
    return a(0, this.d);
  }
  
  public byte[] a(int paramInt1, int paramInt2)
  {
    byte[] arrayOfByte = new byte[paramInt2];
    System.arraycopy(this.b, paramInt1, arrayOfByte, 0, paramInt2);
    return arrayOfByte;
  }
  
  public int b()
  {
    return this.c;
  }
  
  public void b(int paramInt1, int paramInt2)
  {
    int i = this.c;
    this.c = paramInt1;
    g(paramInt2);
    this.c = i;
  }
  
  public void b(int[] paramArrayOfInt)
  {
    f(paramArrayOfInt.length);
    int i = 0;
    while (i < paramArrayOfInt.length)
    {
      f(paramArrayOfInt[i]);
      i += 1;
    }
  }
  
  public byte[] b(int paramInt)
  {
    return a(paramInt, this.d - paramInt);
  }
  
  public boolean c()
  {
    return this.c < this.d;
  }
  
  public boolean c(int paramInt)
  {
    return this.c + paramInt <= this.d;
  }
  
  public int d()
  {
    j(1);
    byte[] arrayOfByte = this.b;
    int i = this.c;
    this.c = (i + 1);
    return arrayOfByte[i];
  }
  
  public void d(int paramInt)
  {
    i(paramInt);
    this.c += paramInt;
  }
  
  public int e()
  {
    j(2);
    if (this.e)
    {
      arrayOfByte = this.b;
      i = this.c;
      this.c = (i + 1);
      i = arrayOfByte[i];
      arrayOfByte = this.b;
      j = this.c;
      this.c = (j + 1);
      return (short)((i & 0xFF) << 8 | (arrayOfByte[j] & 0xFF) << 0);
    }
    byte[] arrayOfByte = this.b;
    int i = this.c;
    this.c = (i + 1);
    i = arrayOfByte[i];
    arrayOfByte = this.b;
    int j = this.c;
    this.c = (j + 1);
    return (short)((i & 0xFF) << 0 | (arrayOfByte[j] & 0xFF) << 8);
  }
  
  public void e(int paramInt)
  {
    i(1);
    byte[] arrayOfByte = this.b;
    int i = this.c;
    this.c = (i + 1);
    arrayOfByte[i] = ((byte)(paramInt & 0xFF));
  }
  
  public int f()
  {
    j(4);
    if (this.e)
    {
      arrayOfByte = this.b;
      i = this.c;
      this.c = (i + 1);
      i = arrayOfByte[i];
      arrayOfByte = this.b;
      j = this.c;
      this.c = (j + 1);
      j = arrayOfByte[j];
      arrayOfByte = this.b;
      k = this.c;
      this.c = (k + 1);
      k = arrayOfByte[k];
      arrayOfByte = this.b;
      m = this.c;
      this.c = (m + 1);
      return (i & 0xFF) << 24 | (j & 0xFF) << 16 | (k & 0xFF) << 8 | (arrayOfByte[m] & 0xFF) << 0;
    }
    byte[] arrayOfByte = this.b;
    int i = this.c;
    this.c = (i + 1);
    i = arrayOfByte[i];
    arrayOfByte = this.b;
    int j = this.c;
    this.c = (j + 1);
    j = arrayOfByte[j];
    arrayOfByte = this.b;
    int k = this.c;
    this.c = (k + 1);
    k = arrayOfByte[k];
    arrayOfByte = this.b;
    int m = this.c;
    this.c = (m + 1);
    return (i & 0xFF) << 0 | (j & 0xFF) << 8 | (k & 0xFF) << 16 | (arrayOfByte[m] & 0xFF) << 24;
  }
  
  public void f(int paramInt)
  {
    i(2);
    if (this.e)
    {
      arrayOfByte = this.b;
      i = this.c;
      this.c = (i + 1);
      arrayOfByte[i] = ((byte)(paramInt >>> 8 & 0xFF));
      arrayOfByte = this.b;
      i = this.c;
      this.c = (i + 1);
      arrayOfByte[i] = ((byte)(paramInt >>> 0 & 0xFF));
      return;
    }
    byte[] arrayOfByte = this.b;
    int i = this.c;
    this.c = (i + 1);
    arrayOfByte[i] = ((byte)(paramInt >>> 0 & 0xFF));
    arrayOfByte = this.b;
    i = this.c;
    this.c = (i + 1);
    arrayOfByte[i] = ((byte)(paramInt >>> 8 & 0xFF));
  }
  
  public void g(int paramInt)
  {
    i(4);
    if (this.e)
    {
      arrayOfByte = this.b;
      i = this.c;
      this.c = (i + 1);
      arrayOfByte[i] = ((byte)(paramInt >>> 24 & 0xFF));
      arrayOfByte = this.b;
      i = this.c;
      this.c = (i + 1);
      arrayOfByte[i] = ((byte)(paramInt >>> 16 & 0xFF));
      arrayOfByte = this.b;
      i = this.c;
      this.c = (i + 1);
      arrayOfByte[i] = ((byte)(paramInt >>> 8 & 0xFF));
      arrayOfByte = this.b;
      i = this.c;
      this.c = (i + 1);
      arrayOfByte[i] = ((byte)(paramInt >>> 0 & 0xFF));
      return;
    }
    byte[] arrayOfByte = this.b;
    int i = this.c;
    this.c = (i + 1);
    arrayOfByte[i] = ((byte)(paramInt >>> 0 & 0xFF));
    arrayOfByte = this.b;
    i = this.c;
    this.c = (i + 1);
    arrayOfByte[i] = ((byte)(paramInt >>> 8 & 0xFF));
    arrayOfByte = this.b;
    i = this.c;
    this.c = (i + 1);
    arrayOfByte[i] = ((byte)(paramInt >>> 16 & 0xFF));
    arrayOfByte = this.b;
    i = this.c;
    this.c = (i + 1);
    arrayOfByte[i] = ((byte)(paramInt >>> 24 & 0xFF));
  }
  
  public boolean g()
  {
    return d() != 0;
  }
  
  public String h()
  {
    return c(h(e()));
  }
  
  public byte[] h(int paramInt)
  {
    j(paramInt);
    byte[] arrayOfByte = new byte[paramInt];
    System.arraycopy(this.b, this.c, arrayOfByte, 0, paramInt);
    this.c += paramInt;
    return arrayOfByte;
  }
  
  public int[] i()
  {
    int[] arrayOfInt = new int[e()];
    int i = 0;
    while (i < arrayOfInt.length)
    {
      arrayOfInt[i] = d();
      i += 1;
    }
    return arrayOfInt;
  }
  
  public int[][] j()
  {
    int i = e();
    if (i == -1) {
      return (int[][])null;
    }
    int[][] arrayOfInt = new int[i][];
    i = 0;
    while (i < arrayOfInt.length)
    {
      arrayOfInt[i] = i();
      i += 1;
    }
    return arrayOfInt;
  }
  
  public int[] k()
  {
    int[] arrayOfInt = new int[e()];
    int i = 0;
    while (i < arrayOfInt.length)
    {
      arrayOfInt[i] = e();
      i += 1;
    }
    return arrayOfInt;
  }
  
  public String[] l()
  {
    String[] arrayOfString = new String[e()];
    int i = 0;
    while (i < arrayOfString.length)
    {
      arrayOfString[i] = h();
      i += 1;
    }
    return arrayOfString;
  }
  
  public String[][] m()
  {
    int i = e();
    if (i == -1) {
      return (String[][])null;
    }
    String[][] arrayOfString = new String[i][];
    i = 0;
    while (i < arrayOfString.length)
    {
      arrayOfString[i] = l();
      i += 1;
    }
    return arrayOfString;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\b\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */