package com.cairh.app.sjkh;

import android.os.Handler;

class MainActivity$WebviewClick$12
  implements Runnable
{
  MainActivity$WebviewClick$12(MainActivity.WebviewClick paramWebviewClick) {}
  
  public void run()
  {
    try
    {
      MainActivity.WebviewClick.access$0(this.this$1).isLoading = true;
      MainActivity.WebviewClick.access$0(this.this$1).mHandler.sendEmptyMessage(102);
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\MainActivity$WebviewClick$12.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */