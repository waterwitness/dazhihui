package com.android.dazhihui.ui.screen.stock;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.android.dazhihui.b.b;

class pu
  implements DialogInterface.OnClickListener
{
  pu(PublicMessageDialog paramPublicMessageDialog) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    PublicMessageDialog.a(this.a).e(0);
    this.a.finish();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\pu.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */