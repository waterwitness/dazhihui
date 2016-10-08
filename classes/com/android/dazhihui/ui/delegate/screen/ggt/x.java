package com.android.dazhihui.ui.delegate.screen.ggt;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

class x
  implements View.OnClickListener
{
  x(GgtQuiry paramGgtQuiry) {}
  
  public void onClick(View paramView)
  {
    if ((GgtQuiry.b(this.a).getText().toString().length() == 0) || (GgtQuiry.c(this.a).getText().toString().length() == 0))
    {
      this.a.a(0);
      return;
    }
    if ((GgtQuiry.b(this.a).getText().toString().length() != 8) || (GgtQuiry.c(this.a).getText().toString().length() != 8))
    {
      this.a.a(1);
      return;
    }
    if (GgtQuiry.b(this.a).getText().toString().compareTo(GgtQuiry.c(this.a).getText().toString()) > 0)
    {
      this.a.a(2);
      return;
    }
    this.a.b();
    GgtQuiry.d(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\ggt\x.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */