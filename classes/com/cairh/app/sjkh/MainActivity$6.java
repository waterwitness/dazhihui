package com.cairh.app.sjkh;

import android.webkit.WebView;
import java.io.PrintStream;

class MainActivity$6
  implements Runnable
{
  MainActivity$6(MainActivity paramMainActivity, StringBuffer paramStringBuffer) {}
  
  public void run()
  {
    try
    {
      System.out.println("运行" + this.val$sb.toString() + "方法");
      MainActivity.access$0(this.this$0).loadUrl(this.val$sb.toString());
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\MainActivity$6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */