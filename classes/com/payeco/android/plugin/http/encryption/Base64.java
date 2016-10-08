package com.payeco.android.plugin.http.encryption;

import java.io.UnsupportedEncodingException;

public class Base64
{
  public static final int CRLF = 4;
  public static final int DEFAULT = 0;
  public static final int NO_CLOSE = 16;
  public static final int NO_PADDING = 1;
  public static final int NO_WRAP = 2;
  public static final int URL_SAFE = 8;
  
  static
  {
    if (!Base64.class.desiredAssertionStatus()) {}
    for (boolean bool = true;; bool = false)
    {
      bD = bool;
      return;
    }
  }
  
  private static byte[] b(String paramString)
  {
    return decode(paramString.getBytes(), 0);
  }
  
  public static byte[] decode(byte[] paramArrayOfByte, int paramInt)
  {
    return decode(paramArrayOfByte, 0, paramArrayOfByte.length, paramInt);
  }
  
  public static byte[] decode(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    b localb = new b(paramInt3, new byte[paramInt2 * 3 / 4]);
    if (!localb.a(paramArrayOfByte, paramInt1, paramInt2)) {
      throw new IllegalArgumentException("bad base-64");
    }
    if (localb.bF == localb.bE.length) {
      return localb.bE;
    }
    paramArrayOfByte = new byte[localb.bF];
    System.arraycopy(localb.bE, 0, paramArrayOfByte, 0, localb.bF);
    return paramArrayOfByte;
  }
  
  public static byte[] decodeLines(String paramString)
  {
    return b(paramString);
  }
  
  public static String decodeString(String paramString)
  {
    return new String(b(paramString));
  }
  
  private static byte[] encode(byte[] paramArrayOfByte, int paramInt)
  {
    return encode(paramArrayOfByte, 0, paramArrayOfByte.length, paramInt);
  }
  
  public static byte[] encode(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    c localc = new c(paramInt3);
    int i = paramInt2 / 3 * 4;
    int j;
    if (localc.bN)
    {
      paramInt3 = i;
      if (paramInt2 % 3 > 0) {
        paramInt3 = i + 4;
      }
      i = paramInt3;
      if (localc.bO)
      {
        i = paramInt3;
        if (paramInt2 > 0)
        {
          j = (paramInt2 - 1) / 57;
          if (!localc.bP) {
            break label182;
          }
        }
      }
    }
    label182:
    for (i = 2;; i = 1)
    {
      i = paramInt3 + i * (j + 1);
      localc.bE = new byte[i];
      localc.a(paramArrayOfByte, paramInt1, paramInt2);
      if ((bD) || (localc.bF == i)) {
        break label188;
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
    label188:
    return localc.bE;
  }
  
  public static String encodeLines(byte[] paramArrayOfByte)
  {
    return new String(encode(paramArrayOfByte, 0));
  }
  
  public static String encodeString(String paramString)
  {
    return new String(encode(paramString.getBytes(), 0));
  }
  
  public static String encodeToString(byte[] paramArrayOfByte, int paramInt)
  {
    try
    {
      paramArrayOfByte = new String(encode(paramArrayOfByte, paramInt), "US-ASCII");
      return paramArrayOfByte;
    }
    catch (UnsupportedEncodingException paramArrayOfByte)
    {
      throw new AssertionError(paramArrayOfByte);
    }
  }
  
  public static String encodeToString(byte[] paramArrayOfByte, int paramInt1, int paramInt2, int paramInt3)
  {
    try
    {
      paramArrayOfByte = new String(encode(paramArrayOfByte, paramInt1, paramInt2, paramInt3), "US-ASCII");
      return paramArrayOfByte;
    }
    catch (UnsupportedEncodingException paramArrayOfByte)
    {
      throw new AssertionError(paramArrayOfByte);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\payeco\android\plugin\http\encryption\Base64.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */