package com.android.dazhihui.ui.widget;

import android.os.Handler;
import android.os.Message;

class h
  extends Handler
{
  h(ArcProgressBar paramArcProgressBar) {}
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      return;
    }
    if (ArcProgressBar.a(this.a) >= ArcProgressBar.b(this.a))
    {
      ArcProgressBar.a(this.a, ArcProgressBar.b(this.a));
      removeMessages(1000);
      return;
    }
    float f = ArcProgressBar.b(this.a) / 10.0F;
    ArcProgressBar.b(this.a, f);
    paramMessage = this.a;
    if (ArcProgressBar.a(this.a) > ArcProgressBar.b(this.a)) {}
    for (f = ArcProgressBar.b(this.a);; f = ArcProgressBar.a(this.a))
    {
      ArcProgressBar.a(paramMessage, f);
      this.a.postInvalidate();
      sendMessageDelayed(obtainMessage(1000), 50L);
      return;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */