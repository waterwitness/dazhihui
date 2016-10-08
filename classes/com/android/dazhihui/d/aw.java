package com.android.dazhihui.d;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

class aw
  extends Handler
{
  aw(av paramav) {}
  
  public void handleMessage(Message paramMessage)
  {
    int i;
    if (paramMessage.what == this.a.b)
    {
      i = paramMessage.arg1;
      if ((i <= 45) || (i >= 135)) {
        break label33;
      }
    }
    label33:
    do
    {
      do
      {
        do
        {
          return;
        } while ((i > 135) && (i < 225));
        if ((i <= 225) || (i >= 315)) {
          break;
        }
      } while (!av.a(this.a));
      av.b(this.a).setRequestedOrientation(0);
      av.a(this.a, false);
      Log.d("SenserUtil", "land----->" + i);
      return;
    } while (((i <= 315) || (i >= 360)) && ((i <= 0) || (i >= 45) || (av.a(this.a))));
    av.b(this.a).setRequestedOrientation(1);
    av.a(this.a, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\d\aw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */