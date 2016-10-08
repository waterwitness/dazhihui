package com.tencent.avsdk.widget;

import android.os.Handler;
import java.util.List;

class DanMuContainView$1
  implements Runnable
{
  DanMuContainView$1(DanMuContainView paramDanMuContainView) {}
  
  public void run()
  {
    if (DanMuContainView.access$000(this.this$0) != null)
    {
      DanMuContainView.access$200(this.this$0).removeCallbacks(DanMuContainView.access$100(this.this$0));
      if ((DanMuContainView.access$300(this.this$0) != null) && (DanMuContainView.access$300(this.this$0).size() > 0)) {
        this.this$0.refreshDanMu();
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\DanMuContainView$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */