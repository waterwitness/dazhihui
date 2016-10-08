package com.tencent.Util;

import android.app.Activity;
import android.os.Handler;
import android.os.Message;
import android.util.Log;

class SenserHelper$1
  extends Handler
{
  SenserHelper$1(SenserHelper paramSenserHelper) {}
  
  public void handleMessage(Message paramMessage)
  {
    int i;
    if (paramMessage.what == this.this$0.CHANGEORIENTATION)
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
      } while (!SenserHelper.access$000(this.this$0));
      SenserHelper.access$100(this.this$0).setRequestedOrientation(0);
      SenserHelper.access$002(this.this$0, false);
      Log.d("SenserUtil", "land----->" + i);
      return;
    } while (((i <= 315) || (i >= 360)) && ((i <= 0) || (i >= 45) || (SenserHelper.access$000(this.this$0))));
    SenserHelper.access$100(this.this$0).setRequestedOrientation(1);
    SenserHelper.access$002(this.this$0, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\Util\SenserHelper$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */