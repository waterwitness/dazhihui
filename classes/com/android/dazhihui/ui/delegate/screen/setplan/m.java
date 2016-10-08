package com.android.dazhihui.ui.delegate.screen.setplan;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;

class m
  implements DialogInterface.OnClickListener
{
  m(SetPlanEntrust paramSetPlanEntrust) {}
  
  public void onClick(DialogInterface paramDialogInterface, int paramInt)
  {
    if ((SetPlanEntrust.d(this.a) == 20481) || (SetPlanEntrust.d(this.a) == 20482) || (SetPlanEntrust.d(this.a) == 20483))
    {
      SetPlanEntrust.r(this.a);
      SetPlanEntrust.e(this.a);
    }
    if (SetPlanEntrust.d(this.a) == 20486)
    {
      SetPlanEntrust.r(this.a);
      this.a.a();
    }
    if (SetPlanEntrust.d(this.a) == 20485) {
      this.a.d();
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\setplan\m.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */