package com.android.dazhihui.ui.widget;

import android.os.CountDownTimer;
import android.widget.Toast;

final class mq
  extends CountDownTimer
{
  mq(long paramLong1, long paramLong2)
  {
    super(paramLong1, paramLong2);
  }
  
  public void onFinish()
  {
    if (ToastMaker.a() != null)
    {
      ToastMaker.a().cancel();
      ToastMaker.a(null);
    }
  }
  
  public void onTick(long paramLong)
  {
    if (ToastMaker.a() != null) {
      ToastMaker.a().show();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\mq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */