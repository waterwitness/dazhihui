package com.tencent.avsdk.widget;

import android.os.Handler;

class IlvbIndexTopLayout$1
  implements Runnable
{
  IlvbIndexTopLayout$1(IlvbIndexTopLayout paramIlvbIndexTopLayout) {}
  
  public void run()
  {
    if ((IlvbIndexTopLayout.access$000(this.this$0) != null) && (IlvbIndexTopLayout.access$100(this.this$0) != null))
    {
      this.this$0.sendRequest(IlvbIndexTopLayout.access$100(this.this$0));
      IlvbIndexTopLayout.access$300(this.this$0).removeCallbacks(IlvbIndexTopLayout.access$200(this.this$0));
      IlvbIndexTopLayout.access$300(this.this$0).postDelayed(IlvbIndexTopLayout.access$200(this.this$0), IlvbIndexTopLayout.access$400(this.this$0));
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\IlvbIndexTopLayout$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */