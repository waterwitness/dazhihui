package com.f.a.a;

import java.io.OutputStream;

public class da
  implements k
{
  protected final byte[] a = { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 97, 98, 99, 100, 101, 102 };
  protected final byte[] b = new byte[''];
  
  public da()
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
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\da.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */