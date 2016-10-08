package com.android.dazhihui.ui.delegate.screen.fund;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

class u
  implements TextWatcher
{
  u(FundAtone paramFundAtone) {}
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramCharSequence.length() == 6)
    {
      FundAtone.a(this.a, paramCharSequence.toString());
      this.a.a();
      return;
    }
    FundAtone.a(this.a).setText("");
    FundAtone.b(this.a).setText("");
    FundAtone.c(this.a).setText("");
    FundAtone.d(this.a).setText("");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */