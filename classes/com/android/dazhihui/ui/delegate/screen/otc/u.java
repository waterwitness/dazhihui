package com.android.dazhihui.ui.delegate.screen.otc;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import java.math.BigDecimal;

class u
  implements TextWatcher
{
  u(OtcEntrust paramOtcEntrust) {}
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (OtcEntrust.a(this.a) == 16387)
    {
      if ((!OtcEntrust.i(this.a).getText().toString().equals("")) && (!OtcEntrust.j(this.a).getText().toString().equals("")))
      {
        OtcEntrust.k(this.a).setVisibility(0);
        OtcEntrust.k(this.a).setText(this.a.a(OtcEntrust.i(this.a).getText().toString(), OtcEntrust.j(this.a).getText().toString()).toString() + "元");
      }
    }
    else {
      return;
    }
    OtcEntrust.k(this.a).setVisibility(8);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\otc\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */