package com.alipay.sdk.d;

public final class a
{
  private static final byte[] a;
  private static final char[] b;
  
  static
  {
    int k = 0;
    a = new byte[''];
    b = new char[64];
    int i = 0;
    while (i < 128)
    {
      a[i] = -1;
      i += 1;
    }
    i = 90;
    while (i >= 65)
    {
      a[i] = ((byte)(i - 65));
      i -= 1;
    }
    i = 122;
    while (i >= 97)
    {
      a[i] = ((byte)(i - 97 + 26));
      i -= 1;
    }
    i = 57;
    while (i >= 48)
    {
      a[i] = ((byte)(i - 48 + 52));
      i -= 1;
    }
    a[43] = 62;
    a[47] = 63;
    i = 0;
    while (i <= 25)
    {
      b[i] = ((char)(i + 65));
      i += 1;
    }
    int j = 26;
    i = 0;
    while (j <= 51)
    {
      b[j] = ((char)(i + 97));
      j += 1;
      i += 1;
    }
    j = 52;
    i = k;
    while (j <= 61)
    {
      b[j] = ((char)(i + 48));
      j += 1;
      i += 1;
    }
    b[62] = '+';
    b[63] = '/';
  }
  
  public static String a(byte[] paramArrayOfByte)
  {
    int k = 0;
    if (paramArrayOfByte == null) {
      return null;
    }
    int i = paramArrayOfByte.length * 8;
    if (i == 0) {
      return "";
    }
    int i2 = i % 24;
    int i1 = i / 24;
    char[] arrayOfChar;
    label54:
    int i3;
    int i4;
    int i5;
    int i6;
    if (i2 != 0)
    {
      i = i1 + 1;
      arrayOfChar = new char[i * 4];
      j = 0;
      i = 0;
      if (j >= i1) {
        break label284;
      }
      m = k + 1;
      k = paramArrayOfByte[k];
      i3 = m + 1;
      m = paramArrayOfByte[m];
      i4 = paramArrayOfByte[i3];
      i5 = (byte)(m & 0xF);
      i6 = (byte)(k & 0x3);
      if ((k & 0xFFFFFF80) != 0) {
        break label241;
      }
      k = (byte)(k >> 2);
      label120:
      if ((m & 0xFFFFFF80) != 0) {
        break label255;
      }
      m = (byte)(m >> 4);
      label135:
      if ((i4 & 0xFFFFFF80) != 0) {
        break label269;
      }
    }
    label241:
    label255:
    label269:
    for (int n = (byte)(i4 >> 6);; n = (byte)(i4 >> 6 ^ 0xFC))
    {
      int i7 = i + 1;
      arrayOfChar[i] = b[k];
      i = i7 + 1;
      arrayOfChar[i7] = b[(m | i6 << 4)];
      k = i + 1;
      arrayOfChar[i] = b[(n | i5 << 2)];
      arrayOfChar[k] = b[(i4 & 0x3F)];
      j += 1;
      i = k + 1;
      k = i3 + 1;
      break label54;
      i = i1;
      break;
      k = (byte)(k >> 2 ^ 0xC0);
      break label120;
      m = (byte)(m >> 4 ^ 0xF0);
      break label135;
    }
    label284:
    if (i2 == 8)
    {
      j = paramArrayOfByte[k];
      k = (byte)(j & 0x3);
      if ((j & 0xFFFFFF80) == 0)
      {
        j = (byte)(j >> 2);
        m = i + 1;
        arrayOfChar[i] = b[j];
        i = m + 1;
        arrayOfChar[m] = b[(k << 4)];
        arrayOfChar[i] = '=';
        arrayOfChar[(i + 1)] = '=';
      }
    }
    while (i2 != 16) {
      for (;;)
      {
        return new String(arrayOfChar);
        j = (byte)(j >> 2 ^ 0xC0);
      }
    }
    int j = paramArrayOfByte[k];
    k = paramArrayOfByte[(k + 1)];
    int m = (byte)(k & 0xF);
    n = (byte)(j & 0x3);
    if ((j & 0xFFFFFF80) == 0)
    {
      j = (byte)(j >> 2);
      label423:
      if ((k & 0xFFFFFF80) != 0) {
        break label504;
      }
    }
    label504:
    for (k = (byte)(k >> 4);; k = (byte)(k >> 4 ^ 0xF0))
    {
      i1 = i + 1;
      arrayOfChar[i] = b[j];
      i = i1 + 1;
      arrayOfChar[i1] = b[(k | n << 4)];
      arrayOfChar[i] = b[(m << 2)];
      arrayOfChar[(i + 1)] = '=';
      break;
      j = (byte)(j >> 2 ^ 0xC0);
      break label423;
    }
  }
  
  private static boolean a(char paramChar)
  {
    return paramChar == '=';
  }
  
  public static byte[] a(String paramString)
  {
    if (paramString == null) {
      return null;
    }
    Object localObject = paramString.toCharArray();
    int k;
    if (localObject == null) {
      k = 0;
    }
    int m;
    int j;
    int i;
    for (;;)
    {
      if (k % 4 != 0)
      {
        return null;
        m = localObject.length;
        j = 0;
        i = 0;
        k = i;
        if (j < m)
        {
          k = localObject[j];
          if ((k == 32) || (k == 13) || (k == 10) || (k == 9))
          {
            k = 1;
            label89:
            if (k != 0) {
              break label664;
            }
            k = i + 1;
            localObject[i] = localObject[j];
            i = k;
          }
        }
      }
    }
    label249:
    label664:
    for (;;)
    {
      j += 1;
      break;
      k = 0;
      break label89;
      m = k / 4;
      if (m == 0) {
        return new byte[0];
      }
      paramString = new byte[m * 3];
      k = 0;
      i = 0;
      j = 0;
      while (j < m - 1)
      {
        n = k + 1;
        c1 = localObject[k];
        char c3;
        char c4;
        if (b(c1))
        {
          k = n + 1;
          c2 = localObject[n];
          if (b(c2))
          {
            n = k + 1;
            c3 = localObject[k];
            if (b(c3))
            {
              k = n + 1;
              c4 = localObject[n];
              if (b(c4)) {
                break label249;
              }
            }
          }
        }
        return null;
        int i4 = a[c1];
        int i2 = a[c2];
        n = a[c3];
        i1 = a[c4];
        int i3 = i + 1;
        paramString[i] = ((byte)(i4 << 2 | i2 >> 4));
        i4 = i3 + 1;
        paramString[i3] = ((byte)((i2 & 0xF) << 4 | n >> 2 & 0xF));
        i = i4 + 1;
        paramString[i4] = ((byte)(n << 6 | i1));
        j += 1;
      }
      m = k + 1;
      char c1 = localObject[k];
      if (b(c1))
      {
        n = m + 1;
        c2 = localObject[m];
        if (b(c2)) {}
      }
      else
      {
        return null;
      }
      k = a[c1];
      m = a[c2];
      c1 = localObject[n];
      char c2 = localObject[(n + 1)];
      if ((!b(c1)) || (!b(c2)))
      {
        if ((a(c1)) && (a(c2)))
        {
          if ((m & 0xF) != 0) {
            return null;
          }
          localObject = new byte[j * 3 + 1];
          System.arraycopy(paramString, 0, localObject, 0, j * 3);
          localObject[i] = ((byte)(k << 2 | m >> 4));
          return (byte[])localObject;
        }
        if ((!a(c1)) && (a(c2)))
        {
          n = a[c1];
          if ((n & 0x3) != 0) {
            return null;
          }
          localObject = new byte[j * 3 + 2];
          System.arraycopy(paramString, 0, localObject, 0, j * 3);
          localObject[i] = ((byte)(k << 2 | m >> 4));
          localObject[(i + 1)] = ((byte)((m & 0xF) << 4 | n >> 2 & 0xF));
          return (byte[])localObject;
        }
        return null;
      }
      j = a[c1];
      int n = a[c2];
      int i1 = i + 1;
      paramString[i] = ((byte)(k << 2 | m >> 4));
      paramString[i1] = ((byte)((m & 0xF) << 4 | j >> 2 & 0xF));
      paramString[(i1 + 1)] = ((byte)(n | j << 6));
      return paramString;
    }
  }
  
  private static boolean b(char paramChar)
  {
    return (paramChar < '') && (a[paramChar] != -1);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\alipay\sdk\d\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */