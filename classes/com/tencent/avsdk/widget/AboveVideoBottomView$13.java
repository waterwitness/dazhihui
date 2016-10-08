package com.tencent.avsdk.widget;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;
import com.android.dazhihui.d.n;

class AboveVideoBottomView$13
  implements View.OnClickListener
{
  AboveVideoBottomView$13(AboveVideoBottomView paramAboveVideoBottomView) {}
  
  public void onClick(View paramView)
  {
    AboveVideoBottomView.access$1000(this.this$0).dismiss();
    n.a("", 20242);
    this.this$0.sharePopWinItemSelected(paramView.getId());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdk\widget\AboveVideoBottomView$13.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */