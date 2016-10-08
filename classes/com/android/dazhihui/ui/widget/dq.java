package com.android.dazhihui.ui.widget;

import android.os.Handler;
import android.os.Message;

class dq
  extends Handler
{
  dq(FundLineView paramFundLineView) {}
  
  public void handleMessage(Message paramMessage)
  {
    if (paramMessage.what == 1000)
    {
      this.a.setIndex(-1);
      this.a.invalidate();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\dq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */