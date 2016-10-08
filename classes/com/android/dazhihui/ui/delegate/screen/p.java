package com.android.dazhihui.ui.delegate.screen;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.android.dazhihui.ui.widget.TableLayoutGroup;

class p
  implements DialogInterface.OnClickListener
{
  p(CancelTable paramCancelTable) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    this.a.e();
    CancelTable.a(this.a).a();
    this.a.a(false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\p.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */