package org.apache.http;

public abstract interface StatusLine
{
  public abstract ProtocolVersion getProtocolVersion();
  
  public abstract String getReasonPhrase();
  
  public abstract int getStatusCode();
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\org\apache\http\StatusLine.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */