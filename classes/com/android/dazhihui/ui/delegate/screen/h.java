package com.android.dazhihui.ui.delegate.screen;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

class h
  implements View.OnClickListener
{
  h(BargainTable_history paramBargainTable_history) {}
  
  public void onClick(View paramView)
  {
    if ((this.a.f.getText().toString().length() == 0) || (this.a.g.getText().toString().length() == 0))
    {
      this.a.a(0);
      return;
    }
    if ((this.a.f.getText().toString().length() != 8) || (this.a.g.getText().toString().length() != 8))
    {
      this.a.a(1);
      return;
    }
    if (this.a.f.getText().toString().compareTo(this.a.g.getText().toString()) > 0)
    {
      this.a.a(2);
      return;
    }
    this.a.a(true);
    BargainTable_history.b(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */