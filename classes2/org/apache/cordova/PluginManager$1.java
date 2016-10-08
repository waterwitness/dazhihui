package org.apache.cordova;

import java.util.concurrent.atomic.AtomicInteger;

class PluginManager$1
  implements Runnable
{
  PluginManager$1(PluginManager paramPluginManager, String paramString1, String paramString2, String paramString3, String paramString4) {}
  
  public void run()
  {
    PluginManager.access$2(this.this$0, this.val$service, this.val$action, this.val$callbackId, this.val$rawArgs);
    PluginManager.access$0(this.this$0).getAndDecrement();
  }
}


/* Location:              E:\apk\dazhihui2\classes2-dex2jar.jar!\org\apache\cordova\PluginManager$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */