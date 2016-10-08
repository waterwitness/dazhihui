package com.android.dazhihui.ui.model;

import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import com.android.dazhihui.a.b.m;

class RequestAdapter$1
  extends Handler
{
  RequestAdapter$1(RequestAdapter paramRequestAdapter, Looper paramLooper)
  {
    super(paramLooper);
  }
  
  public void handleMessage(Message paramMessage)
  {
    super.handleMessage(paramMessage);
    switch (paramMessage.what)
    {
    }
    do
    {
      return;
      RequestAdapter.access$000(this.this$0).removeMessages(0);
    } while ((!RequestAdapter.access$100(this.this$0)) || (RequestAdapter.access$200(this.this$0) == null));
    RequestAdapter.access$000(this.this$0).sendEmptyMessageDelayed(0, RequestAdapter.access$300(this.this$0));
    if ((RequestAdapter.access$200(this.this$0) instanceof m)) {
      ((m)RequestAdapter.access$200(this.this$0)).o();
    }
    this.this$0.sendRequest(RequestAdapter.access$200(this.this$0));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\model\RequestAdapter$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */