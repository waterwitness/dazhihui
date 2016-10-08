package com.tencent.avsdk.widget;

import android.os.Handler;

class VideoParaDebugView$1
  implements Runnable
{
  VideoParaDebugView$1(VideoParaDebugView paramVideoParaDebugView) {}
  
  public void run()
  {
    if ((VideoParaDebugView.access$000(this.this$0) != null) && (VideoParaDebugView.access$100(this.this$0)))
    {
      VideoParaDebugView.access$300(this.this$0).removeCallbacks(VideoParaDebugView.access$200(this.this$0));
      VideoParaDebugView.access$300(this.this$0).postDelayed(VideoParaDebugView.access$200(this.this$0), 1000L);
      VideoParaDebugView.access$400(this.this$0);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\VideoParaDebugView$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */