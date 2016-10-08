package com.android.dazhihui.ui.delegate.screen;

import android.text.Editable;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

class bb
  implements View.OnClickListener
{
  bb(EntrustNew paramEntrustNew) {}
  
  public void onClick(View paramView)
  {
    if ((EntrustNew.b(this.a).getText().length() == 0) || (EntrustNew.c(this.a).getText().length() == 0) || (EntrustNew.d(this.a).getText().length() == 0))
    {
      this.a.a(0);
      return;
    }
    if (EntrustNew.b(this.a).getText().length() != 6)
    {
      this.a.a(1);
      return;
    }
    EntrustNew.e(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */