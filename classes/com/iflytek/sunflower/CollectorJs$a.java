package com.iflytek.sunflower;

import android.graphics.Bitmap;
import android.os.Message;
import android.webkit.JsPromptResult;
import android.webkit.JsResult;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import com.iflytek.sunflower.c.g;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONObject;

class CollectorJs$a
  extends WebChromeClient
{
  WebChromeClient a;
  
  public CollectorJs$a(CollectorJs paramCollectorJs, WebChromeClient paramWebChromeClient)
  {
    if (paramWebChromeClient == null)
    {
      this.a = new WebChromeClient();
      return;
    }
    this.a = paramWebChromeClient;
  }
  
  public void onCloseWindow(WebView paramWebView)
  {
    this.a.onCloseWindow(paramWebView);
  }
  
  public boolean onCreateWindow(WebView paramWebView, boolean paramBoolean1, boolean paramBoolean2, Message paramMessage)
  {
    return this.a.onCreateWindow(paramWebView, paramBoolean1, paramBoolean2, paramMessage);
  }
  
  public boolean onJsAlert(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    return this.a.onJsAlert(paramWebView, paramString1, paramString2, paramJsResult);
  }
  
  public boolean onJsBeforeUnload(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    return this.a.onJsBeforeUnload(paramWebView, paramString1, paramString2, paramJsResult);
  }
  
  public boolean onJsConfirm(WebView paramWebView, String paramString1, String paramString2, JsResult paramJsResult)
  {
    return this.a.onJsConfirm(paramWebView, paramString1, paramString2, paramJsResult);
  }
  
  public boolean onJsPrompt(WebView paramWebView, String paramString1, String paramString2, String paramString3, JsPromptResult paramJsPromptResult)
  {
    long l1 = System.currentTimeMillis();
    g.a("Collector", "onJsPrompt:" + paramString2 + " value:" + paramString3);
    if ("event".equals(paramString2))
    {
      long l2;
      try
      {
        paramString1 = new JSONObject(paramString3);
        paramString2 = paramString1.optString("id");
        paramString3 = paramString1.optString("label");
        l2 = paramString1.optLong("duration");
        paramWebView = null;
        JSONObject localJSONObject = paramString1.optJSONObject("map");
        if (localJSONObject != null)
        {
          paramString1 = new HashMap();
          Iterator localIterator = localJSONObject.keys();
          for (;;)
          {
            paramWebView = paramString1;
            if (!localIterator.hasNext()) {
              break;
            }
            paramWebView = (String)localIterator.next();
            paramString1.put(paramWebView, localJSONObject.getString(paramWebView));
          }
          paramJsPromptResult.confirm();
        }
      }
      catch (Exception paramWebView)
      {
        g.d("Collector", "onEvent error.", paramWebView);
      }
      for (;;)
      {
        return true;
        a.a(CollectorJs.access$000(this.b)).a(paramString2, paramString3, paramWebView, l2);
        g.a("Collector", "timecost-Prompt " + String.valueOf(System.currentTimeMillis() - l1));
      }
    }
    return this.a.onJsPrompt(paramWebView, paramString1, paramString2, paramString3, paramJsPromptResult);
  }
  
  public void onProgressChanged(WebView paramWebView, int paramInt)
  {
    this.a.onProgressChanged(paramWebView, paramInt);
  }
  
  public void onReceivedIcon(WebView paramWebView, Bitmap paramBitmap)
  {
    this.a.onReceivedIcon(paramWebView, paramBitmap);
  }
  
  public void onReceivedTitle(WebView paramWebView, String paramString)
  {
    this.a.onReceivedTitle(paramWebView, paramString);
  }
  
  public void onRequestFocus(WebView paramWebView)
  {
    this.a.onRequestFocus(paramWebView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\iflytek\sunflower\CollectorJs$a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */