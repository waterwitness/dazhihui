package org.apache.cordova;

import android.app.Activity;
import java.util.concurrent.atomic.AtomicInteger;

class PluginManager$PluginManagerService
  extends CordovaPlugin
{
  private PluginManager$PluginManagerService(PluginManager paramPluginManager) {}
  
  public boolean execute(String paramString, CordovaArgs paramCordovaArgs, CallbackContext paramCallbackContext)
  {
    if ("startup".equals(paramString))
    {
      PluginManager.access$0(this.this$0).getAndIncrement();
      PluginManager.access$1(this.this$0).getActivity().runOnUiThread(new PluginManager.PluginManagerService.1(this));
      return true;
    }
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\cordova\PluginManager$PluginManagerService.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */