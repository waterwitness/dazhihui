package com.android.dazhihui.ui.delegate.screen.hk;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import java.util.Vector;

class v
  implements DialogInterface.OnClickListener
{
  v(q paramq) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    q.a(this.a).removeAllElements();
    q.g(this.a).removeAllElements();
    q.j(this.a).removeAllElements();
    q.d(this.a).removeAllElements();
    q.e(this.a).notifyDataSetInvalidated();
    q.a(this.a, true);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */