package com.android.dazhihui.ui.delegate.screen;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.android.dazhihui.b.b;
import com.android.dazhihui.ui.delegate.b.o;

class ez
  implements DialogInterface.OnClickListener
{
  ez(dy paramdy) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    ((gc)this.a.getParentFragment()).h();
    o.a(b.a().f());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\ez.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */