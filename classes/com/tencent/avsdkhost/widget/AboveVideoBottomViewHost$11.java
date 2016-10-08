package com.tencent.avsdkhost.widget;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;
import com.android.dazhihui.d.n;

class AboveVideoBottomViewHost$11
  implements View.OnClickListener
{
  AboveVideoBottomViewHost$11(AboveVideoBottomViewHost paramAboveVideoBottomViewHost) {}
  
  public void onClick(View paramView)
  {
    AboveVideoBottomViewHost.access$1200(this.this$0).dismiss();
    n.a("", 20242);
    this.this$0.sharePopWinItemSelected(paramView.getId());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\widget\AboveVideoBottomViewHost$11.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */