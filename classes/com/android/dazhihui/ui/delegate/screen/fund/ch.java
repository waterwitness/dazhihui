package com.android.dazhihui.ui.delegate.screen.fund;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

class ch
  implements TextWatcher
{
  ch(IFundEntrust paramIFundEntrust) {}
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramCharSequence.length() == 6)
    {
      IFundEntrust.a(this.a, paramCharSequence.toString());
      this.a.a();
      return;
    }
    IFundEntrust.a(this.a).setText("");
    IFundEntrust.b(this.a).setText("");
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\ch.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */