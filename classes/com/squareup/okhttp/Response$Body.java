package com.squareup.okhttp;

import com.squareup.okhttp.internal.Util;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Reader;
import java.nio.charset.Charset;

public abstract class Response$Body
{
  private Reader reader;
  
  private Charset charset()
  {
    MediaType localMediaType = contentType();
    if (localMediaType != null) {
      return localMediaType.charset(Util.UTF_8);
    }
    return Util.UTF_8;
  }
  
  public abstract InputStream byteStream();
  
  public final byte[] bytes()
  {
    long l = contentLength();
    if (l > 2147483647L) {
      throw new IOException("Cannot buffer entire body for content length: " + l);
    }
    Object localObject;
    if (l != -1L)
    {
      localObject = new byte[(int)l];
      InputStream localInputStream = byteStream();
      Util.readFully(localInputStream, (byte[])localObject);
      if (localInputStream.read() != -1) {
        throw new IOException("Content-Length and stream length disagree");
      }
    }
    else
    {
      localObject = new ByteArrayOutputStream();
      Util.copy(byteStream(), (OutputStream)localObject);
      localObject = ((ByteArrayOutputStream)localObject).toByteArray();
    }
    return (byte[])localObject;
  }
  
  public final Reader charStream()
  {
    if (this.reader == null) {
      this.reader = new InputStreamReader(byteStream(), charset());
    }
    return this.reader;
  }
  
  public abstract long contentLength();
  
  public abstract MediaType contentType();
  
  public abstract boolean ready();
  
  public final String string()
  {
    return new String(bytes(), charset().name());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\Response$Body.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */