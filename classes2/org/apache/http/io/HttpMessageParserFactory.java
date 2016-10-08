package org.apache.http.io;

import org.apache.http.HttpMessage;
import org.apache.http.config.MessageConstraints;

public abstract interface HttpMessageParserFactory<T extends HttpMessage>
{
  public abstract HttpMessageParser<T> create(SessionInputBuffer paramSessionInputBuffer, MessageConstraints paramMessageConstraints);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\io\HttpMessageParserFactory.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */