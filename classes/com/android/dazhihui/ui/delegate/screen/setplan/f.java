package com.android.dazhihui.ui.delegate.screen.setplan;

import android.view.ViewGroup.LayoutParams;
import android.widget.ScrollView;

class f
  implements Runnable
{
  f(SetPlanEntrust paramSetPlanEntrust) {}
  
  public void run()
  {
    SetPlanEntrust.a(this.a, SetPlanEntrust.a(this.a).getHeight());
    if (SetPlanEntrust.b(this.a) > SetPlanEntrust.c(this.a))
    {
      ViewGroup.LayoutParams localLayoutParams = SetPlanEntrust.a(this.a).getLayoutParams();
      localLayoutParams.height = SetPlanEntrust.c(this.a);
      SetPlanEntrust.a(this.a).setLayoutParams(localLayoutParams);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\setplan\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */