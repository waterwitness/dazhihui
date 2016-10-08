package org.apache.http;

public abstract interface HttpServerConnection
  extends HttpConnection
{
  public abstract void flush();
  
  public abstract void receiveRequestEntity(HttpEntityEnclosingRequest paramHttpEntityEnclosingRequest);
  
  public abstract HttpRequest receiveRequestHeader();
  
  public abstract void sendResponseEntity(HttpResponse paramHttpResponse);
  
  public abstract void sendResponseHeader(HttpResponse paramHttpResponse);
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\HttpServerConnection.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */