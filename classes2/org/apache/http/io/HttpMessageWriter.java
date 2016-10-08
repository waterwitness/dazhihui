package org.apache.http.io;

import org.apache.http.HttpMessage;

public abstract interface HttpMessageWriter<T extends HttpMessage>
{
  public abstract void write(T paramT);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\io\HttpMessageWriter.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */