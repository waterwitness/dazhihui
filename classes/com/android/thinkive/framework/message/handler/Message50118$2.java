package com.android.thinkive.framework.message.handler;

import com.android.thinkive.framework.view.MyWebView;
import org.json.JSONException;
import org.json.JSONObject;

class Message50118$2
  implements Runnable
{
  Message50118$2(Message50118 paramMessage50118, JSONObject paramJSONObject, int paramInt, String paramString) {}
  
  public void run()
  {
    JSONObject localJSONObject = new JSONObject();
    if (this.val$jsonObject != null) {
      localJSONObject = this.val$jsonObject;
    }
    for (;;)
    {
      Message50118.access$3(this.this$0).loadUrl("javascript:httpsCallback('" + Message50118.access$4(this.this$0) + "'" + "," + localJSONObject.toString() + ")");
      return;
      try
      {
        localJSONObject.put("results", this.val$jsonObject);
        localJSONObject.put("error_no", this.val$errorNo);
        localJSONObject.put("error_info", this.val$errorMsg);
      }
      catch (JSONException localJSONException)
      {
        localJSONException.printStackTrace();
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\message\handler\Message50118$2.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */