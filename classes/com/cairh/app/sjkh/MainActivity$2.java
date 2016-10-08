package com.cairh.app.sjkh;

import android.os.Handler;
import android.os.Message;
import android.webkit.WebView;

class MainActivity$2
  extends Handler
{
  MainActivity$2(MainActivity paramMainActivity) {}
  
  public void handleMessage(Message paramMessage)
  {
    switch (paramMessage.what)
    {
    default: 
      return;
    case -100: 
      this.this$0.updateAlpha();
      return;
    }
    if ((this.this$0.isLoading) && (this.this$0.logoShowed))
    {
      MainActivity.access$0(this.this$0).setVisibility(0);
      return;
    }
    this.this$0.mHandler.sendEmptyMessageDelayed(102, 200L);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\MainActivity$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */