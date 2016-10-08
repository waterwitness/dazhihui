package com.h.a.a.a;

import java.io.UnsupportedEncodingException;

public class b
{
  static
  {
    if (!b.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      a = bool;
      return;
    }
  }
  
  public static byte[] a(String paramString, int paramInt)
  {
    return a(paramString.getBytes(), paramInt);
  }
  
  public static byte[] a(byte[] paramArrayOfByte, int paramInt)
  {
    return a(paramArrayOfByte, 0, paramArrayOfByte.length, paramInt);
  }
  
  public static byte[] a(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    d locald = new d(paramInt3, new byte[paramInt2 * 3 / 4]);
    if (!locald.a(paramArrayOfByte, paramInt1, paramInt2, true)) {
      throw new IllegalArgumentException("bad base-64");
    }
    if (locald.b == locald.a.length) {
      return locald.a;
    }
    paramArrayOfByte = new byte[locald.b];
    System.arraycopy(locald.a, 0, paramArrayOfByte, 0, locald.b);
    return paramArrayOfByte;
  }
  
  public static String b(byte[] paramArrayOfByte, int paramInt)
  {
    try
    {
      paramArrayOfByte = new String(c(paramArrayOfByte, paramInt), "US-ASCII");
      return paramArrayOfByte;
    }
    catch (UnsupportedEncodingException paramArrayOfByte)
    {
      throw new AssertionError(paramArrayOfByte);
    }
  }
  
  public static byte[] b(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    e locale = new e(paramInt3, null);
    int i = paramInt2 / 3 * 4;
    int j;
    if (locale.d)
    {
      paramInt3 = i;
      if (paramInt2 % 3 > 0) {
        paramInt3 = i + 4;
      }
      i = paramInt3;
      if (locale.e)
      {
        i = paramInt3;
        if (paramInt2 > 0)
        {
          j = (paramInt2 - 1) / 57;
          if (!locale.f) {
            break label186;
          }
        }
      }
    }
    label186:
    for (i = 2;; i = 1)
    {
      i = paramInt3 + i * (j + 1);
      locale.a = new byte[i];
      locale.a(paramArrayOfByte, paramInt1, paramInt2, true);
      if ((a) || (locale.b == i)) {
        break label192;
      }
      throw new AssertionError();
      paramInt3 = i;
      switch (paramInt2 % 3)
      {
      case 0: 
      default: 
        paramInt3 = i;
        break;
      case 1: 
        paramInt3 = i + 2;
        break;
      case 2: 
        paramInt3 = i + 3;
        break;
      }
    }
    label192:
    return locale.a;
  }
  
  public static byte[] c(byte[] paramArrayOfByte, int paramInt)
  {
    return b(paramArrayOfByte, 0, paramArrayOfByte.length, paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\h\a\a\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */