package com.android.dazhihui.ui.delegate.screen.fund;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;

class am
  implements TextWatcher
{
  am(FundEntrust paramFundEntrust) {}
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramCharSequence.length() == 6)
    {
      FundEntrust.a(this.a, "0");
      FundEntrust.b(this.a, paramCharSequence.toString());
      FundEntrust.a(this.a);
      return;
    }
    FundEntrust.b(this.a).setText("");
    FundEntrust.c(this.a).setText("");
    FundEntrust.d(this.a).setText("");
    FundEntrust.e(this.a).setText("");
    FundEntrust.f(this.a).setText("");
    FundEntrust.a(this.a, new String[0]);
    FundEntrust.b(this.a, new String[0]);
    if (FundEntrust.g(this.a) != null)
    {
      FundEntrust.a(this.a, new ArrayAdapter(this.a, 17367048, FundEntrust.h(this.a)));
      FundEntrust.g(this.a).setDropDownViewResource(17367049);
      FundEntrust.i(this.a).setAdapter(FundEntrust.g(this.a));
    }
    FundEntrust.i(this.a).setEnabled(false);
    FundEntrust.a(this.a, "0");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */