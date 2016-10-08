package com.android.thinkive.framework.network.socket;

public class SocketException
  extends Exception
{
  private SocketException.ExceptionType mExceptionType;
  private int responseCode = -1;
  
  public SocketException(String paramString)
  {
    super(paramString);
  }
  
  public SocketException(String paramString, SocketException.ExceptionType paramExceptionType)
  {
    super(paramString);
    this.mExceptionType = paramExceptionType;
  }
  
  public SocketException(String paramString, Throwable paramThrowable)
  {
    super(paramString, paramThrowable);
  }
  
  public SocketException(Throwable paramThrowable)
  {
    super(paramThrowable);
  }
  
  public SocketException.ExceptionType getExceptionType()
  {
    return this.mExceptionType;
  }
  
  public int getResponseCode()
  {
    return this.responseCode;
  }
  
  public void setResponseCode(int paramInt)
  {
    this.responseCode = paramInt;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\network\socket\SocketException.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */