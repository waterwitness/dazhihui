package com.f.a.a;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ce
{
  private static final k a = new da();
  
  public static byte[] a(String paramString)
  {
    ByteArrayOutputStream localByteArrayOutputStream = new ByteArrayOutputStream();
    try
    {
      a.a(paramString, localByteArrayOutputStream);
      return localByteArrayOutputStream.toByteArray();
    }
    catch (IOException paramString)
    {
      throw new RuntimeException("exception decoding Hex string: " + paramString);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\f\a\a\ce.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */