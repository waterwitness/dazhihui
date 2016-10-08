package com.cairh.app.sjkh;

class MainActivity$WebviewClick$5
  implements Runnable
{
  MainActivity$WebviewClick$5(MainActivity.WebviewClick paramWebviewClick) {}
  
  public void run()
  {
    try
    {
      MainActivity.WebviewClick.access$0(this.this$1).callJSFunc("APP_cert.downInstalCertCallBack(0)");
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\MainActivity$WebviewClick$5.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */