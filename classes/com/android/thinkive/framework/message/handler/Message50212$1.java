package com.android.thinkive.framework.message.handler;

import android.webkit.WebView;
import com.android.thinkive.framework.message.AppMessage;
import com.android.thinkive.framework.util.Log;
import org.json.JSONException;
import org.json.JSONObject;

class Message50212$1
  implements Runnable
{
  Message50212$1(Message50212 paramMessage50212, AppMessage paramAppMessage, long paramLong, WebView paramWebView) {}
  
  public void run()
  {
    JSONObject localJSONObject = this.val$appMessage.getContent();
    if (localJSONObject == null) {
      return;
    }
    try
    {
      localJSONObject.put("funcNo", this.val$appMessage.getMsgId());
      long l = System.currentTimeMillis();
      Log.i("50212 send use time = " + (l - this.val$startTime));
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\thinkive\framework\message\handler\Message50212$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */