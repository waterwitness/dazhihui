package com.tencent.avsdk.widget;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;

class AboveVideoBottomView$15
  implements View.OnClickListener
{
  AboveVideoBottomView$15(AboveVideoBottomView paramAboveVideoBottomView) {}
  
  public void onClick(View paramView)
  {
    if ((AboveVideoBottomView.access$1200(this.this$0) != null) && (AboveVideoBottomView.access$1200(this.this$0).isShowing())) {
      AboveVideoBottomView.access$1200(this.this$0).dismiss();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\AboveVideoBottomView$15.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */