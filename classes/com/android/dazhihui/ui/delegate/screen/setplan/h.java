package com.android.dazhihui.ui.delegate.screen.setplan;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

class h
  implements View.OnClickListener
{
  h(SetPlanEntrust paramSetPlanEntrust) {}
  
  public void onClick(View paramView)
  {
    if (SetPlanEntrust.d(this.a) == 20483) {
      SetPlanEntrust.m(this.a).setText(SetPlanEntrust.l(this.a).getText().toString());
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\setplan\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */