package com.tencent.avsdk.widget;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.view.View;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.RelativeLayout.LayoutParams;

class AboveVideoBottomView$10
  implements PopupWindow.OnDismissListener
{
  AboveVideoBottomView$10(AboveVideoBottomView paramAboveVideoBottomView) {}
  
  public void onDismiss()
  {
    if ((this.this$0.getResources().getConfiguration().orientation == 1) && (this.this$0.mParent != null)) {
      this.this$0.mParent.setTopViewVisiable(0);
    }
    RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -1);
    localLayoutParams.addRule(10);
    this.this$0.setLayoutParams(localLayoutParams);
    AboveVideoBottomView.access$400(this.this$0).setVisibility(0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\AboveVideoBottomView$10.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */