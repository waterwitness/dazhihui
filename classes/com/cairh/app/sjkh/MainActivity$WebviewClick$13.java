package com.cairh.app.sjkh;

class MainActivity$WebviewClick$13
  implements Runnable
{
  MainActivity$WebviewClick$13(MainActivity.WebviewClick paramWebviewClick, String paramString) {}
  
  public void run()
  {
    if ((this.val$callbackFunc == null) || ("".equals(this.val$callbackFunc)))
    {
      MainActivity.WebviewClick.access$0(this.this$1).callJSFunc("checkSJKHSDKVersionCallBack('1','5012210')");
      return;
    }
    MainActivity.WebviewClick.access$0(this.this$1).callJSFunc(this.val$callbackFunc + "('" + "1" + "','" + 5012210 + "')");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\MainActivity$WebviewClick$13.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */