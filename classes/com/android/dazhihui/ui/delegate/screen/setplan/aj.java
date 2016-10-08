package com.android.dazhihui.ui.delegate.screen.setplan;

import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import com.android.dazhihui.ui.widget.TableLayoutGroup;

class aj
  implements DialogInterface.OnCancelListener
{
  aj(SetPlanQuery paramSetPlanQuery) {}
  
  public void onCancel(DialogInterface paramDialogInterface)
  {
    SetPlanQuery.a(this.a, true);
    SetPlanQuery.b(this.a, 0);
    SetPlanQuery.a(this.a).a();
    SetPlanQuery.a(this.a, null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\setplan\aj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */