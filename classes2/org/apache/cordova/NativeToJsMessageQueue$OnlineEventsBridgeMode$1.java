package org.apache.cordova;

import java.util.LinkedList;

class NativeToJsMessageQueue$OnlineEventsBridgeMode$1
  implements Runnable
{
  NativeToJsMessageQueue$OnlineEventsBridgeMode$1(NativeToJsMessageQueue.OnlineEventsBridgeMode paramOnlineEventsBridgeMode) {}
  
  public void run()
  {
    if (!NativeToJsMessageQueue.access$3(NativeToJsMessageQueue.OnlineEventsBridgeMode.access$2(this.this$1)).isEmpty()) {
      NativeToJsMessageQueue.access$1(NativeToJsMessageQueue.OnlineEventsBridgeMode.access$2(this.this$1)).setNetworkAvailable(NativeToJsMessageQueue.OnlineEventsBridgeMode.access$0(this.this$1));
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\cordova\NativeToJsMessageQueue$OnlineEventsBridgeMode$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */