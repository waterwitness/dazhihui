package com.android.dazhihui.ui.delegate.screen.otc;

import android.text.Editable;
import android.text.TextWatcher;

class o
  implements TextWatcher
{
  o(OtcEntrust paramOtcEntrust) {}
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramCharSequence.length() == 6)
    {
      if (this.a.g == null)
      {
        OtcEntrust.d(this.a);
        OtcEntrust.a(this.a, paramCharSequence.toString());
        return;
      }
      OtcEntrust.b(this.a, paramCharSequence.toString());
      return;
    }
    OtcEntrust.e(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\otc\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */