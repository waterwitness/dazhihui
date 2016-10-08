package com.cairh.app.sjkh;

import java.util.Map;

class MainActivity$WebviewClick$10
  implements Runnable
{
  MainActivity$WebviewClick$10(MainActivity.WebviewClick paramWebviewClick, String paramString, Map paramMap) {}
  
  public void run()
  {
    try
    {
      MainActivity.WebviewClick.access$0(this.this$1).callJSFunc(this.val$callback + "('" + (String)this.val$info.get("type") + "','" + (String)this.val$info.get("typeName") + "','" + (String)this.val$info.get("state") + "','" + (String)this.val$info.get("isConnectedOrConnecting") + "','" + (String)this.val$info.get("isAvailable") + "')");
      return;
    }
    catch (Exception localException)
    {
      localException.printStackTrace();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\MainActivity$WebviewClick$10.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */