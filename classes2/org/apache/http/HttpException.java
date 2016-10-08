package org.apache.http;

public class HttpException
  extends Exception
{
  private static final long serialVersionUID = -5437299376222011036L;
  
  public HttpException() {}
  
  public HttpException(String paramString)
  {
    super(paramString);
  }
  
  public HttpException(String paramString, Throwable paramThrowable)
  {
    super(paramString);
    initCause(paramThrowable);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\http\HttpException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */