package com.android.volley;

class Request$1
  implements Runnable
{
  Request$1(Request paramRequest, String paramString, long paramLong) {}
  
  public void run()
  {
    Request.access$1(this.this$0).add(this.val$tag, this.val$threadId);
    Request.access$1(this.this$0).finish(toString());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\volley\Request$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */