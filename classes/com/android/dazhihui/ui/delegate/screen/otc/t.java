package com.android.dazhihui.ui.delegate.screen.otc;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.EditText;

class t
  implements View.OnClickListener
{
  t(OtcEntrust paramOtcEntrust) {}
  
  public void onClick(View paramView)
  {
    if (OtcEntrust.a(this.a) == 16387) {
      OtcEntrust.i(this.a).setText(OtcEntrust.h(this.a).getText().toString());
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\otc\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */