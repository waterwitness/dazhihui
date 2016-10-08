package com.squareup.okhttp;

import java.io.OutputStream;

class Request$Body$1
  extends Request.Body
{
  Request$Body$1(MediaType paramMediaType, byte[] paramArrayOfByte) {}
  
  public long contentLength()
  {
    return this.val$content.length;
  }
  
  public MediaType contentType()
  {
    return this.val$contentType;
  }
  
  public void writeTo(OutputStream paramOutputStream)
  {
    paramOutputStream.write(this.val$content);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\Request$Body$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */