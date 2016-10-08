package com.cairh.app.sjkh;

import android.util.Log;
import com.cairh.app.sjkh.common.WriteLogFile;

class MainActivity$WebviewClick$7
  implements Runnable
{
  MainActivity$WebviewClick$7(MainActivity.WebviewClick paramWebviewClick, String paramString1, String paramString2) {}
  
  public void run()
  {
    try
    {
      String str = "MainActivity 生成签名 JS 方法：" + this.val$callback + "(0,'','" + this.val$signValue + "')";
      WriteLogFile.witeLog(str);
      Log.i("CRH_MainActivity", str);
      MainActivity.WebviewClick.access$0(this.this$1).callJSFunc(this.val$callback + "(0,'','" + this.val$signValue + "')");
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\MainActivity$WebviewClick$7.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */