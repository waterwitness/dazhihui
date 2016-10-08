package com.android.dazhihui.ui.delegate.screen.ggt;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class k
  implements DialogInterface.OnClickListener
{
  k(GgtEntrust paramGgtEntrust) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    GgtEntrust.s(this.a);
    paramInt = GgtEntrust.t(this.a);
    GgtEntrust.q(this.a);
    GgtEntrust.b(this.a, paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\ggt\k.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */