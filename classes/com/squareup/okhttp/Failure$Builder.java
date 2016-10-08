package com.squareup.okhttp;

public class Failure$Builder
{
  private Throwable exception;
  private Request request;
  
  public Failure build()
  {
    return new Failure(this, null);
  }
  
  public Builder exception(Throwable paramThrowable)
  {
    this.exception = paramThrowable;
    return this;
  }
  
  public Builder request(Request paramRequest)
  {
    this.request = paramRequest;
    return this;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\squareup\okhttp\Failure$Builder.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */