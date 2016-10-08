package com.android.dazhihui.ui.delegate.screen.setplan;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class o
  implements DialogInterface.OnClickListener
{
  o(SetPlanEntrust paramSetPlanEntrust) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if (SetPlanEntrust.d(this.a) == 20483)
    {
      SetPlanEntrust.e(this.a);
      return;
    }
    if (SetPlanEntrust.d(this.a) == 20486)
    {
      this.a.a();
      return;
    }
    if (SetPlanEntrust.d(this.a) == 20485)
    {
      this.a.b();
      return;
    }
    if (SetPlanEntrust.f(this.a))
    {
      SetPlanEntrust.e(this.a);
      return;
    }
    SetPlanEntrust.g(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\setplan\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */