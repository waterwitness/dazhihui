package com.tencent.avsdkhost.widget;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.widget.PopupWindow;
import android.widget.RelativeLayout.LayoutParams;

class AboveVideoBottomViewHost$9
  implements ChatInputViewHost.SizeChange
{
  AboveVideoBottomViewHost$9(AboveVideoBottomViewHost paramAboveVideoBottomViewHost) {}
  
  public void onSizeChange(boolean paramBoolean, int paramInt)
  {
    if (this.this$0.getResources().getConfiguration().orientation == 1)
    {
      if (paramBoolean)
      {
        RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, 1300);
        localLayoutParams.addRule(10);
        localLayoutParams.height = (this.this$0.getMeasuredHeight() - paramInt);
        this.this$0.setLayoutParams(localLayoutParams);
      }
    }
    else {
      return;
    }
    this.this$0.inputPopupWindow.dismiss();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\tencent\avsdkhost\widget\AboveVideoBottomViewHost$9.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */