package com.android.dazhihui.ui.delegate.screen.structuredfund;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.widget.EditText;

class ay
  implements DialogInterface.OnClickListener
{
  ay(StructuredFundSplitOrMerge paramStructuredFundSplitOrMerge) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (StructuredFundSplitOrMerge.g(this.a).equals("chaifen")) {
      StructuredFundSplitOrMerge.r(this.a).setText("1.2");
    }
    this.a.f();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\structuredfund\ay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */