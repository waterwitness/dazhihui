package com.android.dazhihui.ui.delegate.screen;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.android.dazhihui.b.b;
import com.android.dazhihui.ui.delegate.b.o;

class ey
  implements DialogInterface.OnCancelListener
{
  ey(dy paramdy) {}
  
  public void onCancel(DialogInterface paramDialogInterface)
  {
    ((gc)this.a.getParentFragment()).h();
    o.a(b.a().f());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\ey.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */