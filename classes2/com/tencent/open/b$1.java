package com.tencent.open;

import android.os.Build.VERSION;
import android.webkit.ConsoleMessage;
import android.webkit.WebChromeClient;
import com.tencent.open.a.f;

class b$1
  extends WebChromeClient
{
  b$1(b paramb) {}
  
  public void onConsoleMessage(String paramString1, int paramInt, String paramString2)
  {
    f.c("openSDK_LOG.JsDialog", "WebChromeClient onConsoleMessage" + paramString1 + " -- From 222 line " + paramInt + " of " + paramString2);
    if (Build.VERSION.SDK_INT == 7) {
      this.a.onConsoleMessage(paramString1);
    }
  }
  
  public boolean onConsoleMessage(ConsoleMessage paramConsoleMessage)
  {
    if (paramConsoleMessage == null) {
      return false;
    }
    f.c("openSDK_LOG.JsDialog", "WebChromeClient onConsoleMessage" + paramConsoleMessage.message() + " -- From  111 line " + paramConsoleMessage.lineNumber() + " of " + paramConsoleMessage.sourceId());
    b localb;
    if (Build.VERSION.SDK_INT > 7)
    {
      localb = this.a;
      if (paramConsoleMessage != null) {
        break label84;
      }
    }
    label84:
    for (paramConsoleMessage = "";; paramConsoleMessage = paramConsoleMessage.message())
    {
      localb.onConsoleMessage(paramConsoleMessage);
      return true;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\com\tencent\open\b$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */