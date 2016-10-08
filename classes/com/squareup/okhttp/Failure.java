package com.squareup.okhttp;

class Failure
{
  private final Throwable exception;
  private final Request request;
  
  private Failure(Failure.Builder paramBuilder)
  {
    this.request = Failure.Builder.access$0(paramBuilder);
    this.exception = Failure.Builder.access$1(paramBuilder);
  }
  
  public Throwable exception()
  {
    return this.exception;
  }
  
  public Request request()
  {
    return this.request;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\Failure.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */