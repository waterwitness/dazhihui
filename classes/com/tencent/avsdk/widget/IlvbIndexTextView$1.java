package com.tencent.avsdk.widget;

import android.os.Handler;
import android.text.TextUtils;

class IlvbIndexTextView$1
  implements Runnable
{
  IlvbIndexTextView$1(IlvbIndexTextView paramIlvbIndexTextView) {}
  
  public void run()
  {
    if (IlvbIndexTextView.access$000(this.this$0))
    {
      IlvbIndexTextView.access$002(this.this$0, false);
      if (!TextUtils.isEmpty(IlvbIndexTextView.access$100(this.this$0))) {
        this.this$0.setText(IlvbIndexTextView.access$100(this.this$0));
      }
      if ((IlvbIndexTextView.access$200(this.this$0) != null) && (IlvbIndexTextView.access$300(this.this$0) != null)) {
        this.this$0.sendRequest(IlvbIndexTextView.access$300(this.this$0));
      }
    }
    for (;;)
    {
      IlvbIndexTextView.access$600(this.this$0).removeCallbacks(IlvbIndexTextView.access$500(this.this$0));
      IlvbIndexTextView.access$600(this.this$0).postDelayed(IlvbIndexTextView.access$500(this.this$0), IlvbIndexTextView.access$700(this.this$0));
      return;
      IlvbIndexTextView.access$002(this.this$0, true);
      if (!TextUtils.isEmpty(IlvbIndexTextView.access$400(this.this$0))) {
        this.this$0.setText(IlvbIndexTextView.access$400(this.this$0));
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\IlvbIndexTextView$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */