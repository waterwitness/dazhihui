package com.android.dazhihui.ui.delegate.screen.ggt;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.android.dazhihui.ui.widget.TableLayoutGroup;

class aa
  implements DialogInterface.OnCancelListener
{
  aa(GgtQuiry paramGgtQuiry) {}
  
  public void onCancel(DialogInterface paramDialogInterface)
  {
    GgtQuiry.a(this.a, true);
    GgtQuiry.b(this.a, 0);
    GgtQuiry.a(this.a).a();
    GgtQuiry.a(this.a, null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\ggt\aa.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */