package com.android.volley;

class ExecutorDelivery$ResponseDeliveryRunnable
  implements Runnable
{
  private final Request mRequest;
  private final Response mResponse;
  private final Runnable mRunnable;
  
  public ExecutorDelivery$ResponseDeliveryRunnable(ExecutorDelivery paramExecutorDelivery, Request paramRequest, Response paramResponse, Runnable paramRunnable)
  {
    this.mRequest = paramRequest;
    this.mResponse = paramResponse;
    this.mRunnable = paramRunnable;
  }
  
  public void run()
  {
    if (this.mRequest.isCanceled()) {
      this.mRequest.finish("canceled-at-delivery");
    }
    label97:
    label107:
    for (;;)
    {
      return;
      if (this.mResponse.isSuccess())
      {
        this.mRequest.deliverResponse(this.mResponse.result);
        if (!this.mResponse.intermediate) {
          break label97;
        }
        this.mRequest.addMarker("intermediate-response");
      }
      for (;;)
      {
        if (this.mRunnable == null) {
          break label107;
        }
        this.mRunnable.run();
        return;
        this.mRequest.deliverError(this.mResponse.error);
        break;
        this.mRequest.finish("done");
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\volley\ExecutorDelivery$ResponseDeliveryRunnable.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */