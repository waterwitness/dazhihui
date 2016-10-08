package com.android.dazhihui.ui.delegate.screen.otc;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

class ag
  implements View.OnClickListener
{
  ag(OtcQuery paramOtcQuery) {}
  
  public void onClick(View paramView)
  {
    if ((OtcQuery.b(this.a).getText().toString().length() == 0) || (OtcQuery.c(this.a).getText().toString().length() == 0))
    {
      this.a.a(0);
      return;
    }
    if ((OtcQuery.b(this.a).getText().toString().length() != 8) || (OtcQuery.c(this.a).getText().toString().length() != 8))
    {
      this.a.a(1);
      return;
    }
    if (OtcQuery.b(this.a).getText().toString().compareTo(OtcQuery.c(this.a).getText().toString()) > 0)
    {
      this.a.a(2);
      return;
    }
    this.a.a();
    OtcQuery.d(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\otc\ag.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */