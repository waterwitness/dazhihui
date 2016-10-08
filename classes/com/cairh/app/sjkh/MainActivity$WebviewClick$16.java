package com.cairh.app.sjkh;

import org.json.JSONException;
import org.json.JSONObject;

class MainActivity$WebviewClick$16
  implements Runnable
{
  MainActivity$WebviewClick$16(MainActivity.WebviewClick paramWebviewClick, String paramString1, String paramString2, String paramString3) {}
  
  public void run()
  {
    JSONObject localJSONObject = new JSONObject();
    try
    {
      localJSONObject.put("model", this.val$model);
      localJSONObject.put("osVersion", "Android " + this.val$osVersion);
      if ((this.val$callbackFunc == null) || ("".equals(this.val$callbackFunc)))
      {
        MainActivity.WebviewClick.access$0(this.this$1).callJSFunc("getDeviceModelCallback('" + localJSONObject.toString() + "')");
        return;
      }
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        localJSONException.printStackTrace();
      }
      MainActivity.WebviewClick.access$0(this.this$1).callJSFunc(this.val$callbackFunc + "('" + localJSONObject.toString() + "')");
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\cairh\app\sjkh\MainActivity$WebviewClick$16.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */