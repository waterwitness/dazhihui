package com.a.a.a.a;

import java.io.UnsupportedEncodingException;

public class d
{
  private static IllegalStateException a(String paramString, UnsupportedEncodingException paramUnsupportedEncodingException)
  {
    return new IllegalStateException(paramString + ": " + paramUnsupportedEncodingException);
  }
  
  public static String a(byte[] paramArrayOfByte)
  {
    return a(paramArrayOfByte, "UTF-8");
  }
  
  public static String a(byte[] paramArrayOfByte, String paramString)
  {
    if (paramArrayOfByte == null) {
      return null;
    }
    try
    {
      paramArrayOfByte = new String(paramArrayOfByte, paramString);
      return paramArrayOfByte;
    }
    catch (UnsupportedEncodingException paramArrayOfByte)
    {
      throw a(paramString, paramArrayOfByte);
    }
  }
  
  public static byte[] a(String paramString)
  {
    return a(paramString, "UTF-8");
  }
  
  public static byte[] a(String paramString1, String paramString2)
  {
    if (paramString1 == null) {
      return null;
    }
    try
    {
      paramString1 = paramString1.getBytes(paramString2);
      return paramString1;
    }
    catch (UnsupportedEncodingException paramString1)
    {
      throw a(paramString2, paramString1);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\a\a\a\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */