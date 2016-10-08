package com.android.dazhihui.ui.delegate.screen.structuredfund;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;

class av
  implements View.OnClickListener
{
  av(StructuredFundSplitOrMerge paramStructuredFundSplitOrMerge) {}
  
  public void onClick(View paramView)
  {
    StructuredFundSplitOrMerge.c(this.a, true);
    this.a.f();
    StructuredFundSplitOrMerge.j(this.a).dismiss();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\structuredfund\av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */