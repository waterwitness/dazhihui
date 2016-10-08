package org.apache.cordova;

import android.webkit.JavascriptInterface;

class ExposedJsApi
{
  private NativeToJsMessageQueue jsMessageQueue;
  private PluginManager pluginManager;
  
  public ExposedJsApi(PluginManager paramPluginManager, NativeToJsMessageQueue paramNativeToJsMessageQueue)
  {
    this.pluginManager = paramPluginManager;
    this.jsMessageQueue = paramNativeToJsMessageQueue;
  }
  
  @JavascriptInterface
  public String exec(String paramString1, String paramString2, String paramString3, String paramString4)
  {
    if (paramString4 == null) {
      return "@Null arguments.";
    }
    this.jsMessageQueue.setPaused(true);
    try
    {
      CordovaResourceApi.jsThread = Thread.currentThread();
      this.pluginManager.exec(paramString1, paramString2, paramString3, paramString4);
      paramString1 = this.jsMessageQueue.popAndEncode(false);
      return paramString1;
    }
    catch (Throwable paramString1)
    {
      paramString1.printStackTrace();
      return "";
    }
    finally
    {
      this.jsMessageQueue.setPaused(false);
    }
  }
  
  @JavascriptInterface
  public String retrieveJsMessages(boolean paramBoolean)
  {
    return this.jsMessageQueue.popAndEncode(paramBoolean);
  }
  
  @JavascriptInterface
  public void setNativeToJsBridgeMode(int paramInt)
  {
    this.jsMessageQueue.setBridgeMode(paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\org\apache\cordova\ExposedJsApi.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */