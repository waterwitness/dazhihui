package org.apache.http.io;

import org.apache.http.HttpMessage;

public abstract interface HttpMessageParser<T extends HttpMessage>
{
  public abstract T parse();
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\io\HttpMessageParser.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */