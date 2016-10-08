package com.itrus.raapi.implement;

import android.os.Handler;

class ClientForAndroid$1
  implements Runnable
{
  ClientForAndroid$1(ClientForAndroid paramClientForAndroid) {}
  
  public void run()
  {
    try
    {
      this.this$0.handler.postDelayed(this, ClientForAndroid.access$0(this.this$0));
      if (this.this$0.activity != null) {
        ClientForAndroid.access$1(this.this$0, this.this$0.activity);
      }
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\itrus\raapi\implement\ClientForAndroid$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */