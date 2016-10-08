package com.android.dazhihui.ui.delegate.screen.trade;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import com.android.dazhihui.ui.delegate.b.o;
import com.android.dazhihui.ui.delegate.c.d;

class a
  implements View.OnClickListener
{
  a(AccountPass paramAccountPass) {}
  
  public void onClick(View paramView)
  {
    if (AccountPass.a(this.a).getText().toString().length() == 0)
    {
      this.a.b(0);
      return;
    }
    if (AccountPass.b(this.a).getText().toString().length() == 0)
    {
      this.a.b(1);
      return;
    }
    if (AccountPass.c(this.a).getText().toString().length() == 0)
    {
      this.a.b(2);
      return;
    }
    if (!d.b.equals(AccountPass.a(this.a).getText().toString()))
    {
      this.a.b(3);
      return;
    }
    if (!AccountPass.b(this.a).getText().toString().equals(AccountPass.c(this.a).getText().toString()))
    {
      this.a.b(4);
      return;
    }
    this.a.b(5);
    if (o.l())
    {
      this.a.b();
      return;
    }
    this.a.a();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\trade\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */