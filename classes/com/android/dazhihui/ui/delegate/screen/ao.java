package com.android.dazhihui.ui.delegate.screen;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;

class ao
  implements View.OnClickListener
{
  ao(EntrustNew paramEntrustNew) {}
  
  public void onClick(View paramView)
  {
    EntrustNew.c(this.a).setText(EntrustNew.w(this.a).getText().toString());
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\ao.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */