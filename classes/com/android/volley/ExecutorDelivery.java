package com.android.volley;

import android.os.Handler;
import java.util.concurrent.Executor;

public class ExecutorDelivery
  implements ResponseDelivery
{
  private final Executor mResponsePoster;
  
  public ExecutorDelivery(Handler paramHandler)
  {
    this.mResponsePoster = new ExecutorDelivery.1(this, paramHandler);
  }
  
  public ExecutorDelivery(Executor paramExecutor)
  {
    this.mResponsePoster = paramExecutor;
  }
  
  public void postError(Request<?> paramRequest, VolleyError paramVolleyError)
  {
    paramRequest.addMarker("post-error");
    paramVolleyError = Response.error(paramVolleyError);
    this.mResponsePoster.execute(new ExecutorDelivery.ResponseDeliveryRunnable(this, paramRequest, paramVolleyError, null));
  }
  
  public void postResponse(Request<?> paramRequest, Response<?> paramResponse)
  {
    postResponse(paramRequest, paramResponse, null);
  }
  
  public void postResponse(Request<?> paramRequest, Response<?> paramResponse, Runnable paramRunnable)
  {
    paramRequest.markDelivered();
    paramRequest.addMarker("post-response");
    this.mResponsePoster.execute(new ExecutorDelivery.ResponseDeliveryRunnable(this, paramRequest, paramResponse, paramRunnable));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\volley\ExecutorDelivery.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */