package com.android.dazhihui.ui.delegate.screen.setplan;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import com.android.dazhihui.ui.widget.TableLayoutGroup;

class ak
  implements DialogInterface.OnClickListener
{
  ak(SetPlanQuery paramSetPlanQuery) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    SetPlanQuery.a(this.a, true);
    SetPlanQuery.b(this.a, 0);
    SetPlanQuery.a(this.a).a();
    SetPlanQuery.a(this.a, null);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\setplan\ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */