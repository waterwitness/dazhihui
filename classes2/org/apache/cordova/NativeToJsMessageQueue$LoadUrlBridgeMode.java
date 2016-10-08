package org.apache.cordova;

import android.app.Activity;

class NativeToJsMessageQueue$LoadUrlBridgeMode
  extends NativeToJsMessageQueue.BridgeMode
{
  final Runnable runnable = new NativeToJsMessageQueue.LoadUrlBridgeMode.1(this);
  
  private NativeToJsMessageQueue$LoadUrlBridgeMode(NativeToJsMessageQueue paramNativeToJsMessageQueue)
  {
    super(paramNativeToJsMessageQueue, null);
  }
  
  void onNativeToJsMessageAvailable()
  {
    NativeToJsMessageQueue.access$2(this.this$0).getActivity().runOnUiThread(this.runnable);
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\cordova\NativeToJsMessageQueue$LoadUrlBridgeMode.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */