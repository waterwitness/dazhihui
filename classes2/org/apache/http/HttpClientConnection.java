package org.apache.http;

public abstract interface HttpClientConnection
  extends HttpConnection
{
  public abstract void flush();
  
  public abstract boolean isResponseAvailable(int paramInt);
  
  public abstract void receiveResponseEntity(HttpResponse paramHttpResponse);
  
  public abstract HttpResponse receiveResponseHeader();
  
  public abstract void sendRequestEntity(HttpEntityEnclosingRequest paramHttpEntityEnclosingRequest);
  
  public abstract void sendRequestHeader(HttpRequest paramHttpRequest);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\HttpClientConnection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */