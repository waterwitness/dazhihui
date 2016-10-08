package com.tencent.avsdkhost.widget;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;

class AboveVideoBottomViewHost$14
  implements View.OnClickListener
{
  AboveVideoBottomViewHost$14(AboveVideoBottomViewHost paramAboveVideoBottomViewHost) {}
  
  public void onClick(View paramView)
  {
    if ((AboveVideoBottomViewHost.access$1400(this.this$0) != null) && (AboveVideoBottomViewHost.access$1400(this.this$0).isShowing())) {
      AboveVideoBottomViewHost.access$1400(this.this$0).dismiss();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\widget\AboveVideoBottomViewHost$14.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */