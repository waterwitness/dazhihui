package com.tencent.avsdkhost.widget;

import android.os.Handler;
import java.util.List;

class DanMuContainViewHost$1
  implements Runnable
{
  DanMuContainViewHost$1(DanMuContainViewHost paramDanMuContainViewHost) {}
  
  public void run()
  {
    if (DanMuContainViewHost.access$000(this.this$0) != null)
    {
      DanMuContainViewHost.access$200(this.this$0).removeCallbacks(DanMuContainViewHost.access$100(this.this$0));
      if ((DanMuContainViewHost.access$300(this.this$0) != null) && (DanMuContainViewHost.access$300(this.this$0).size() > 0)) {
        this.this$0.refreshDanMu();
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\widget\DanMuContainViewHost$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */