package com.android.thinkive.framework.message.handler;

import android.webkit.WebView;
import com.android.thinkive.framework.message.AppMessage;
import org.json.JSONException;
import org.json.JSONObject;

class Message50272$1
  implements Runnable
{
  Message50272$1(Message50272 paramMessage50272, AppMessage paramAppMessage, WebView paramWebView) {}
  
  public void run()
  {
    JSONObject localJSONObject = this.val$appMessage.getContent();
    if (localJSONObject == null) {
      return;
    }
    try
    {
      localJSONObject.put("funcNo", this.val$appMessage.getMsgId());
      this.val$webView.loadUrl("javascript:callMessage(" + localJSONObject.toString() + ")");
      return;
    }
    catch (JSONException localJSONException)
    {
      for (;;)
      {
        localJSONException.printStackTrace();
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\message\handler\Message50272$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */