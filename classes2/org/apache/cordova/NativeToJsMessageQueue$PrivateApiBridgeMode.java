package org.apache.cordova;

import android.os.Message;
import android.util.Log;
import android.webkit.WebView;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

class NativeToJsMessageQueue$PrivateApiBridgeMode
  extends NativeToJsMessageQueue.BridgeMode
{
  private static final int EXECUTE_JS = 194;
  boolean initFailed;
  Method sendMessageMethod;
  Object webViewCore;
  
  private NativeToJsMessageQueue$PrivateApiBridgeMode(NativeToJsMessageQueue paramNativeToJsMessageQueue)
  {
    super(paramNativeToJsMessageQueue, null);
  }
  
  private void initReflection()
  {
    Object localObject2 = NativeToJsMessageQueue.access$1(this.this$0);
    Object localObject1 = localObject2;
    try
    {
      Object localObject3 = WebView.class.getDeclaredField("mProvider");
      localObject1 = localObject2;
      ((Field)localObject3).setAccessible(true);
      localObject1 = localObject2;
      localObject2 = ((Field)localObject3).get(NativeToJsMessageQueue.access$1(this.this$0));
      localObject1 = localObject2;
      localObject3 = localObject2.getClass();
      localObject1 = localObject2;
      localObject2 = localObject3;
      Class localClass;
      return;
    }
    catch (Throwable localThrowable2)
    {
      for (;;)
      {
        try
        {
          localObject2 = ((Class)localObject2).getDeclaredField("mWebViewCore");
          ((Field)localObject2).setAccessible(true);
          this.webViewCore = ((Field)localObject2).get(localObject1);
          if (this.webViewCore != null)
          {
            this.sendMessageMethod = this.webViewCore.getClass().getDeclaredMethod("sendMessage", new Class[] { Message.class });
            this.sendMessageMethod.setAccessible(true);
          }
          return;
        }
        catch (Throwable localThrowable1)
        {
          this.initFailed = true;
          Log.e("JsMessageQueue", "PrivateApiBridgeMode failed to find the expected APIs.", localThrowable1);
        }
        localThrowable2 = localThrowable2;
        localClass = WebView.class;
      }
    }
  }
  
  void onNativeToJsMessageAvailable()
  {
    if ((this.sendMessageMethod == null) && (!this.initFailed)) {
      initReflection();
    }
    Message localMessage;
    if (this.sendMessageMethod != null) {
      localMessage = Message.obtain(null, 194, NativeToJsMessageQueue.access$0(this.this$0));
    }
    try
    {
      this.sendMessageMethod.invoke(this.webViewCore, new Object[] { localMessage });
      return;
    }
    catch (Throwable localThrowable)
    {
      Log.e("JsMessageQueue", "Reflection message bridge failed.", localThrowable);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\cordova\NativeToJsMessageQueue$PrivateApiBridgeMode.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */