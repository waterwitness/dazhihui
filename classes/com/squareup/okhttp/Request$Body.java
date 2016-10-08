package com.squareup.okhttp;

import java.io.File;
import java.io.OutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;

public abstract class Request$Body
{
  public static Body create(MediaType paramMediaType, File paramFile)
  {
    if (paramMediaType == null) {
      throw new NullPointerException("contentType == null");
    }
    if (paramFile == null) {
      throw new NullPointerException("content == null");
    }
    return new Request.Body.2(paramMediaType, paramFile);
  }
  
  public static Body create(MediaType paramMediaType, String paramString)
  {
    if (paramMediaType.charset() != null) {}
    for (;;)
    {
      try
      {
        paramMediaType = create(paramMediaType, paramString.getBytes(paramMediaType.charset().name()));
        return paramMediaType;
      }
      catch (UnsupportedEncodingException paramMediaType)
      {
        throw new AssertionError();
      }
      paramMediaType = MediaType.parse(paramMediaType + "; charset=utf-8");
    }
  }
  
  public static Body create(MediaType paramMediaType, byte[] paramArrayOfByte)
  {
    if (paramMediaType == null) {
      throw new NullPointerException("contentType == null");
    }
    if (paramArrayOfByte == null) {
      throw new NullPointerException("content == null");
    }
    return new Request.Body.1(paramMediaType, paramArrayOfByte);
  }
  
  public long contentLength()
  {
    return -1L;
  }
  
  public abstract MediaType contentType();
  
  public abstract void writeTo(OutputStream paramOutputStream);
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\Request$Body.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */