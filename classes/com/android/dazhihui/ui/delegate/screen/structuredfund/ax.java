package com.android.dazhihui.ui.delegate.screen.structuredfund;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class ax
  implements DialogInterface.OnClickListener
{
  ax(StructuredFundSplitOrMerge paramStructuredFundSplitOrMerge) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramInt = Integer.parseInt(StructuredFundSplitOrMerge.q(this.a));
    StructuredFundSplitOrMerge.a(this.a, String.valueOf(paramInt + 1));
    StructuredFundSplitOrMerge.c(this.a, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\structuredfund\ax.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */