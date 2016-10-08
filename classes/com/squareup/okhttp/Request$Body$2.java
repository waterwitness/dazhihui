package com.squareup.okhttp;

import com.squareup.okhttp.internal.Util;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

class Request$Body$2
  extends Request.Body
{
  Request$Body$2(MediaType paramMediaType, File paramFile) {}
  
  public long contentLength()
  {
    return this.val$file.length();
  }
  
  public MediaType contentType()
  {
    return this.val$contentType;
  }
  
  public void writeTo(OutputStream paramOutputStream)
  {
    long l = contentLength();
    if (l == 0L) {
      return;
    }
    try
    {
      localFileInputStream = new FileInputStream(this.val$file);
      try
      {
        byte[] arrayOfByte = new byte[(int)Math.min(8192L, l)];
        for (;;)
        {
          int i = localFileInputStream.read(arrayOfByte);
          if (i == -1)
          {
            Util.closeQuietly(localFileInputStream);
            return;
          }
          paramOutputStream.write(arrayOfByte, 0, i);
        }
        Util.closeQuietly(localFileInputStream);
      }
      finally {}
    }
    finally
    {
      FileInputStream localFileInputStream = null;
    }
    throw paramOutputStream;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\Request$Body$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */