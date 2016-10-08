package com.tencent.avsdk.widget;

import android.view.ViewGroup;
import android.widget.TextView;

class GiftView$ViewFlowAdapter$1
  implements Runnable
{
  GiftView$ViewFlowAdapter$1(GiftView.ViewFlowAdapter paramViewFlowAdapter) {}
  
  public void run()
  {
    GiftView.access$002(this.this$1.this$0, GiftView.access$000(this.this$1.this$0) - 1);
    if (GiftView.access$000(this.this$1.this$0) < 0)
    {
      ((ViewGroup)this.this$1.this$0.continuousBtn.getParent()).setVisibility(8);
      this.this$1.this$0.commitBtn.setVisibility(0);
      return;
    }
    this.this$1.this$0.continuousBtn.setText("连发\n" + GiftView.access$000(this.this$1.this$0));
    this.this$1.this$0.continuousBtn.postDelayed(this, 300L);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\GiftView$ViewFlowAdapter$1.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */