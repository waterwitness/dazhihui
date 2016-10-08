package org.a.e.a;

import java.io.OutputStream;

public class b
  implements c
{
  protected final byte[] a = { 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78, 79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 97, 98, 99, 100, 101, 102, 103, 104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 43, 47 };
  protected byte b = 61;
  protected final byte[] c = new byte[''];
  
  public b()
  {
    a();
  }
  
  private int a(OutputStream paramOutputStream, char paramChar1, char paramChar2, char paramChar3, char paramChar4)
  {
    if (paramChar3 == this.b)
    {
      paramOutputStream.write(this.c[paramChar1] << 2 | this.c[paramChar2] >> 4);
      return 1;
    }
    if (paramChar4 == this.b)
    {
      paramChar1 = this.c[paramChar1];
      paramChar2 = this.c[paramChar2];
      paramChar3 = this.c[paramChar3];
      paramOutputStream.write(paramChar1 << '\002' | paramChar2 >> '\004');
      paramOutputStream.write(paramChar2 << '\004' | paramChar3 >> '\002');
      return 2;
    }
    paramChar1 = this.c[paramChar1];
    paramChar2 = this.c[paramChar2];
    paramChar3 = this.c[paramChar3];
    paramChar4 = this.c[paramChar4];
    paramOutputStream.write(paramChar1 << '\002' | paramChar2 >> '\004');
    paramOutputStream.write(paramChar2 << '\004' | paramChar3 >> '\002');
    paramOutputStream.write(paramChar3 << '\006' | paramChar4);
    return 3;
  }
  
  private int a(String paramString, int paramInt1, int paramInt2)
  {
    while ((paramInt1 < paramInt2) && (a(paramString.charAt(paramInt1)))) {
      paramInt1 += 1;
    }
    return paramInt1;
  }
  
  private int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2)
  {
    while ((paramInt1 < paramInt2) && (a((char)paramArrayOfByte[paramInt1]))) {
      paramInt1 += 1;
    }
    return paramInt1;
  }
  
  private boolean a(char paramChar)
  {
    return (paramChar == '\n') || (paramChar == '\r') || (paramChar == '\t') || (paramChar == ' ');
  }
  
  public int a(String paramString, OutputStream paramOutputStream)
  {
    int i = paramString.length();
    int j;
    for (;;)
    {
      if ((i <= 0) || (!a(paramString.charAt(i - 1))))
      {
        int m = i - 4;
        int k = a(paramString, 0, m);
        j = 0;
        while (k < m)
        {
          int n = this.c[paramString.charAt(k)];
          int i1 = a(paramString, k + 1, m);
          k = this.c[paramString.charAt(i1)];
          int i2 = a(paramString, i1 + 1, m);
          i1 = this.c[paramString.charAt(i2)];
          i2 = a(paramString, i2 + 1, m);
          int i3 = this.c[paramString.charAt(i2)];
          paramOutputStream.write(n << 2 | k >> 4);
          paramOutputStream.write(k << 4 | i1 >> 2);
          paramOutputStream.write(i1 << 6 | i3);
          k = a(paramString, i2 + 1, m);
          j += 3;
        }
      }
      i -= 1;
    }
    return a(paramOutputStream, paramString.charAt(i - 4), paramString.charAt(i - 3), paramString.charAt(i - 2), paramString.charAt(i - 1)) + j;
  }
  
  public int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, OutputStream paramOutputStream)
  {
    int i = paramInt2 % 3;
    int j = paramInt2 - i;
    paramInt2 = paramInt1;
    while (paramInt2 < paramInt1 + j)
    {
      int k = paramArrayOfByte[paramInt2] & 0xFF;
      int m = paramArrayOfByte[(paramInt2 + 1)] & 0xFF;
      int n = paramArrayOfByte[(paramInt2 + 2)] & 0xFF;
      paramOutputStream.write(this.a[(k >>> 2 & 0x3F)]);
      paramOutputStream.write(this.a[((k << 4 | m >>> 4) & 0x3F)]);
      paramOutputStream.write(this.a[((m << 2 | n >>> 6) & 0x3F)]);
      paramOutputStream.write(this.a[(n & 0x3F)]);
      paramInt2 += 3;
    }
    switch (i)
    {
    case 0: 
    default: 
      paramInt2 = j / 3;
      if (i != 0) {
        break;
      }
    }
    for (paramInt1 = 0;; paramInt1 = 4)
    {
      return paramInt1 + paramInt2 * 4;
      paramInt1 = paramArrayOfByte[(paramInt1 + j)] & 0xFF;
      paramOutputStream.write(this.a[(paramInt1 >>> 2 & 0x3F)]);
      paramOutputStream.write(this.a[(paramInt1 << 4 & 0x3F)]);
      paramOutputStream.write(this.b);
      paramOutputStream.write(this.b);
      break;
      paramInt2 = paramArrayOfByte[(paramInt1 + j)] & 0xFF;
      paramInt1 = paramArrayOfByte[(paramInt1 + j + 1)] & 0xFF;
      paramOutputStream.write(this.a[(paramInt2 >>> 2 & 0x3F)]);
      paramOutputStream.write(this.a[((paramInt2 << 4 | paramInt1 >>> 4) & 0x3F)]);
      paramOutputStream.write(this.a[(paramInt1 << 2 & 0x3F)]);
      paramOutputStream.write(this.b);
      break;
    }
  }
  
  protected void a()
  {
    int i = 0;
    while (i < this.a.length)
    {
      this.c[this.a[i]] = ((byte)i);
      i += 1;
    }
  }
  
  public int b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, OutputStream paramOutputStream)
  {
    paramInt2 = paramInt1 + paramInt2;
    for (;;)
    {
      if ((paramInt2 <= paramInt1) || (!a((char)paramArrayOfByte[(paramInt2 - 1)])))
      {
        int j = paramInt2 - 4;
        int i = a(paramArrayOfByte, paramInt1, j);
        paramInt1 = 0;
        while (i < j)
        {
          int k = this.c[paramArrayOfByte[i]];
          int m = a(paramArrayOfByte, i + 1, j);
          i = this.c[paramArrayOfByte[m]];
          int n = a(paramArrayOfByte, m + 1, j);
          m = this.c[paramArrayOfByte[n]];
          n = a(paramArrayOfByte, n + 1, j);
          int i1 = this.c[paramArrayOfByte[n]];
          paramOutputStream.write(k << 2 | i >> 4);
          paramOutputStream.write(i << 4 | m >> 2);
          paramOutputStream.write(m << 6 | i1);
          i = a(paramArrayOfByte, n + 1, j);
          paramInt1 += 3;
        }
      }
      paramInt2 -= 1;
    }
    return a(paramOutputStream, (char)paramArrayOfByte[(paramInt2 - 4)], (char)paramArrayOfByte[(paramInt2 - 3)], (char)paramArrayOfByte[(paramInt2 - 2)], (char)paramArrayOfByte[(paramInt2 - 1)]) + paramInt1;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\e\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */