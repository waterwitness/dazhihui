package com.android.dazhihui.ui.delegate.screen.structuredfund;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class ap
  implements DialogInterface.OnClickListener
{
  ap(StructuredFundShengouOrShuhui paramStructuredFundShengouOrShuhui) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    paramInt = Integer.parseInt(StructuredFundShengouOrShuhui.b(this.a));
    StructuredFundShengouOrShuhui.a(this.a, String.valueOf(paramInt + 1));
    StructuredFundShengouOrShuhui.a(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\structuredfund\ap.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */