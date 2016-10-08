package org.apache.http;

import org.apache.http.util.CharArrayBuffer;

public abstract interface FormattedHeader
  extends Header
{
  public abstract CharArrayBuffer getBuffer();
  
  public abstract int getValuePos();
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\FormattedHeader.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */