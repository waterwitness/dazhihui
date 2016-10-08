package org.apache.http;

public abstract interface RequestLine
{
  public abstract String getMethod();
  
  public abstract ProtocolVersion getProtocolVersion();
  
  public abstract String getUri();
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\RequestLine.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */