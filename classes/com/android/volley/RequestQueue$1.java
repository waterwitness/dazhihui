package com.android.volley;

class RequestQueue$1
  implements RequestQueue.RequestFilter
{
  RequestQueue$1(RequestQueue paramRequestQueue, Object paramObject) {}
  
  public boolean apply(Request<?> paramRequest)
  {
    return paramRequest.getTag() == this.val$tag;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\volley\RequestQueue$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */