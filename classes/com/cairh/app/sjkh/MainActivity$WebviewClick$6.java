package com.cairh.app.sjkh;

class MainActivity$WebviewClick$6
  implements Runnable
{
  MainActivity$WebviewClick$6(MainActivity.WebviewClick paramWebviewClick, String paramString1, String paramString2) {}
  
  public void run()
  {
    try
    {
      MainActivity.WebviewClick.access$0(this.this$1).callJSFunc(this.val$callback + "('" + this.val$res + "')");
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\MainActivity$WebviewClick$6.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */