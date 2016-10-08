package com.android.dazhihui.ui.screen.stock;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.android.dazhihui.b.b;

class pt
  implements DialogInterface.OnCancelListener
{
  pt(PublicMessageDialog paramPublicMessageDialog) {}
  
  public void onCancel(DialogInterface paramDialogInterface)
  {
    PublicMessageDialog.a(this.a).e(0);
    this.a.finish();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\pt.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */