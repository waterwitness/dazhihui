package org.apache.cordova;

import org.json.JSONArray;
import org.json.JSONObject;

public class CallbackContext
{
  private static final String LOG_TAG = "CordovaPlugin";
  private String callbackId;
  private int changingThreads;
  private boolean finished;
  private CordovaWebView webView;
  
  public CallbackContext(String paramString, CordovaWebView paramCordovaWebView)
  {
    this.callbackId = paramString;
    this.webView = paramCordovaWebView;
  }
  
  public void error(int paramInt)
  {
    sendPluginResult(new PluginResult(PluginResult.Status.ERROR, paramInt));
  }
  
  public void error(String paramString)
  {
    sendPluginResult(new PluginResult(PluginResult.Status.ERROR, paramString));
  }
  
  public void error(JSONObject paramJSONObject)
  {
    sendPluginResult(new PluginResult(PluginResult.Status.ERROR, paramJSONObject));
  }
  
  public String getCallbackId()
  {
    return this.callbackId;
  }
  
  public boolean isChangingThreads()
  {
    return this.changingThreads > 0;
  }
  
  public boolean isFinished()
  {
    return this.finished;
  }
  
  /* Error */
  public void sendPluginResult(PluginResult paramPluginResult)
  {
    // Byte code:
    //   0: aload_0
    //   1: monitorenter
    //   2: aload_0
    //   3: getfield 59	org/apache/cordova/CallbackContext:finished	Z
    //   6: ifeq +43 -> 49
    //   9: ldc 8
    //   11: new 61	java/lang/StringBuilder
    //   14: dup
    //   15: ldc 63
    //   17: invokespecial 65	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   20: aload_0
    //   21: getfield 22	org/apache/cordova/CallbackContext:callbackId	Ljava/lang/String;
    //   24: invokevirtual 69	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   27: ldc 71
    //   29: invokevirtual 69	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   32: aload_1
    //   33: invokevirtual 74	org/apache/cordova/PluginResult:getMessage	()Ljava/lang/String;
    //   36: invokevirtual 69	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   39: invokevirtual 77	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   42: invokestatic 83	android/util/Log:w	(Ljava/lang/String;Ljava/lang/String;)I
    //   45: pop
    //   46: aload_0
    //   47: monitorexit
    //   48: return
    //   49: aload_1
    //   50: invokevirtual 86	org/apache/cordova/PluginResult:getKeepCallback	()Z
    //   53: ifeq +25 -> 78
    //   56: iconst_0
    //   57: istore_2
    //   58: aload_0
    //   59: iload_2
    //   60: putfield 59	org/apache/cordova/CallbackContext:finished	Z
    //   63: aload_0
    //   64: monitorexit
    //   65: aload_0
    //   66: getfield 24	org/apache/cordova/CallbackContext:webView	Lorg/apache/cordova/CordovaWebView;
    //   69: aload_1
    //   70: aload_0
    //   71: getfield 22	org/apache/cordova/CallbackContext:callbackId	Ljava/lang/String;
    //   74: invokevirtual 91	org/apache/cordova/CordovaWebView:sendPluginResult	(Lorg/apache/cordova/PluginResult;Ljava/lang/String;)V
    //   77: return
    //   78: iconst_1
    //   79: istore_2
    //   80: goto -22 -> 58
    //   83: astore_1
    //   84: aload_0
    //   85: monitorexit
    //   86: aload_1
    //   87: athrow
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	88	0	this	CallbackContext
    //   0	88	1	paramPluginResult	PluginResult
    //   57	23	2	bool	boolean
    // Exception table:
    //   from	to	target	type
    //   2	48	83	finally
    //   49	56	83	finally
    //   58	65	83	finally
    //   84	86	83	finally
  }
  
  public void success()
  {
    sendPluginResult(new PluginResult(PluginResult.Status.OK));
  }
  
  public void success(int paramInt)
  {
    sendPluginResult(new PluginResult(PluginResult.Status.OK, paramInt));
  }
  
  public void success(String paramString)
  {
    sendPluginResult(new PluginResult(PluginResult.Status.OK, paramString));
  }
  
  public void success(JSONArray paramJSONArray)
  {
    sendPluginResult(new PluginResult(PluginResult.Status.OK, paramJSONArray));
  }
  
  public void success(JSONObject paramJSONObject)
  {
    sendPluginResult(new PluginResult(PluginResult.Status.OK, paramJSONObject));
  }
  
  public void success(byte[] paramArrayOfByte)
  {
    sendPluginResult(new PluginResult(PluginResult.Status.OK, paramArrayOfByte));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\org\apache\cordova\CallbackContext.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */