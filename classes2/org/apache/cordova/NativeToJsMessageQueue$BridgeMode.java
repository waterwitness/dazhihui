package org.apache.cordova;

abstract class NativeToJsMessageQueue$BridgeMode
{
  private NativeToJsMessageQueue$BridgeMode(NativeToJsMessageQueue paramNativeToJsMessageQueue) {}
  
  void notifyOfFlush(boolean paramBoolean) {}
  
  abstract void onNativeToJsMessageAvailable();
  
  void reset() {}
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\cordova\NativeToJsMessageQueue$BridgeMode.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */