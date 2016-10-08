package org.a.e.a;

import java.io.OutputStream;

public class e
  implements c
{
  protected final byte[] a = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
  protected final byte[] b = new byte[''];
  
  public e()
  {
    a();
  }
  
  private boolean a(char paramChar)
  {
    return (paramChar == '\n') || (paramChar == '\r') || (paramChar == '\t') || (paramChar == ' ');
  }
  
  public int a(String paramString, OutputStream paramOutputStream)
  {
    int i = 0;
    int j = paramString.length();
    int k;
    if ((j <= 0) || (!a(paramString.charAt(j - 1)))) {
      k = 0;
    }
    for (;;)
    {
      if (i >= j) {
        break label166;
      }
      for (;;)
      {
        if ((i < j) && (a(paramString.charAt(i))))
        {
          i += 1;
          continue;
          j -= 1;
          break;
        }
      }
      byte[] arrayOfByte = this.b;
      int m = i + 1;
      int n = arrayOfByte[paramString.charAt(i)];
      i = m;
      while ((i < j) && (a(paramString.charAt(i)))) {
        i += 1;
      }
      paramOutputStream.write(this.b[paramString.charAt(i)] | n << 4);
      k += 1;
      i += 1;
    }
    label166:
    return k;
  }
  
  public int a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, OutputStream paramOutputStream)
  {
    int i = paramInt1;
    while (i < paramInt1 + paramInt2)
    {
      int j = paramArrayOfByte[i] & 0xFF;
      paramOutputStream.write(this.a[(j >>> 4)]);
      paramOutputStream.write(this.a[(j & 0xF)]);
      i += 1;
    }
    return paramInt2 * 2;
  }
  
  protected void a()
  {
    int i = 0;
    while (i < this.a.length)
    {
      this.b[this.a[i]] = ((byte)i);
      i += 1;
    }
    this.b[65] = this.b[97];
    this.b[66] = this.b[98];
    this.b[67] = this.b[99];
    this.b[68] = this.b[100];
    this.b[69] = this.b[101];
    this.b[70] = this.b[102];
  }
  
  public int b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, OutputStream paramOutputStream)
  {
    paramInt2 = paramInt1 + paramInt2;
    int i;
    if ((paramInt2 <= paramInt1) || (!a((char)paramArrayOfByte[(paramInt2 - 1)]))) {
      i = 0;
    }
    for (;;)
    {
      if (paramInt1 >= paramInt2) {
        break label136;
      }
      for (;;)
      {
        if ((paramInt1 < paramInt2) && (a((char)paramArrayOfByte[paramInt1])))
        {
          paramInt1 += 1;
          continue;
          paramInt2 -= 1;
          break;
        }
      }
      byte[] arrayOfByte = this.b;
      int j = paramInt1 + 1;
      int k = arrayOfByte[paramArrayOfByte[paramInt1]];
      paramInt1 = j;
      while ((paramInt1 < paramInt2) && (a((char)paramArrayOfByte[paramInt1]))) {
        paramInt1 += 1;
      }
      paramOutputStream.write(this.b[paramArrayOfByte[paramInt1]] | k << 4);
      i += 1;
      paramInt1 += 1;
    }
    label136:
    return i;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\a\e\a\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */