package org.apache.cordova;

import android.app.Activity;

class NativeToJsMessageQueue$OnlineEventsBridgeMode
  extends NativeToJsMessageQueue.BridgeMode
{
  private boolean online;
  final Runnable runnable = new NativeToJsMessageQueue.OnlineEventsBridgeMode.1(this);
  
  private NativeToJsMessageQueue$OnlineEventsBridgeMode(NativeToJsMessageQueue paramNativeToJsMessageQueue)
  {
    super(paramNativeToJsMessageQueue, null);
  }
  
  void notifyOfFlush(boolean paramBoolean)
  {
    if (paramBoolean) {
      if (!this.online) {
        break label19;
      }
    }
    label19:
    for (paramBoolean = false;; paramBoolean = true)
    {
      this.online = paramBoolean;
      return;
    }
  }
  
  void onNativeToJsMessageAvailable()
  {
    NativeToJsMessageQueue.access$2(this.this$0).getActivity().runOnUiThread(this.runnable);
  }
  
  void reset()
  {
    this.online = false;
    NativeToJsMessageQueue.access$1(this.this$0).setNetworkAvailable(true);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\cordova\NativeToJsMessageQueue$OnlineEventsBridgeMode.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */