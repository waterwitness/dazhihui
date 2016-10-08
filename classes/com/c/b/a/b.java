package com.c.b.a;

public final class b
{
  private final byte[] a;
  private int b;
  private int c;
  
  public b(byte[] paramArrayOfByte)
  {
    this.a = paramArrayOfByte;
  }
  
  public int a()
  {
    return (this.a.length - this.b) * 8 - this.c;
  }
  
  public int a(int paramInt)
  {
    if ((paramInt < 1) || (paramInt > 32) || (paramInt > a())) {
      throw new IllegalArgumentException(String.valueOf(paramInt));
    }
    int j;
    int i;
    int k;
    if (this.c > 0)
    {
      j = 8 - this.c;
      if (paramInt < j)
      {
        i = paramInt;
        j -= i;
        k = this.a[this.b];
        this.c = (i + this.c);
        if (this.c == 8)
        {
          this.c = 0;
          this.b += 1;
        }
        k = (255 >> 8 - i << j & k) >> j;
        j = paramInt - i;
      }
    }
    for (paramInt = k;; paramInt = i)
    {
      i = paramInt;
      if (j > 0)
      {
        for (;;)
        {
          if (j >= 8)
          {
            paramInt = paramInt << 8 | this.a[this.b] & 0xFF;
            this.b += 1;
            j -= 8;
            continue;
            i = j;
            break;
          }
        }
        i = paramInt;
        if (j > 0)
        {
          i = 8 - j;
          i = paramInt << j | (255 >> i << i & this.a[this.b]) >> i;
          this.c = (j + this.c);
        }
      }
      return i;
      i = 0;
      j = paramInt;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\c\b\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */