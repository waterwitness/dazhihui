package com.android.dazhihui.ui.delegate.screen.setplan;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

class ag
  implements View.OnClickListener
{
  ag(SetPlanQuery paramSetPlanQuery) {}
  
  public void onClick(View paramView)
  {
    if ((SetPlanQuery.b(this.a).getText().toString().length() == 0) || (SetPlanQuery.c(this.a).getText().toString().length() == 0))
    {
      this.a.a(0);
      return;
    }
    if ((SetPlanQuery.b(this.a).getText().toString().length() != 8) || (SetPlanQuery.c(this.a).getText().toString().length() != 8))
    {
      this.a.a(1);
      return;
    }
    if (SetPlanQuery.b(this.a).getText().toString().compareTo(SetPlanQuery.c(this.a).getText().toString()) > 0)
    {
      this.a.a(2);
      return;
    }
    this.a.a();
    SetPlanQuery.d(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\setplan\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */