package com.android.dazhihui.ui.delegate.screen;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;

class at
  implements View.OnClickListener
{
  at(EntrustNew paramEntrustNew) {}
  
  public void onClick(View paramView)
  {
    EntrustNew.c(this.a).setText(EntrustNew.A(this.a).getText().toString());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\at.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */