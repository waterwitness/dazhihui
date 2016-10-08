package com.android.dazhihui.ui.delegate.screen;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;
import android.widget.TextView;
import com.android.dazhihui.d.a;

class bj
  implements View.OnClickListener
{
  bj(EntrustNew paramEntrustNew) {}
  
  public void onClick(View paramView)
  {
    if ((EntrustNew.h(this.a).getText().toString() != null) && (!EntrustNew.h(this.a).getText().toString().equals("")))
    {
      if ((EntrustNew.d(this.a).getText().toString() != null) && (!EntrustNew.d(this.a).getText().toString().equals("")))
      {
        int i = a.c(EntrustNew.d(this.a).getText().toString());
        EntrustNew.d(this.a).setText(i + 100 + "");
      }
    }
    else {
      return;
    }
    EntrustNew.d(this.a).setText("100");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\bj.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */