package com.android.dazhihui.ui.delegate.screen.structuredfund;

import android.text.Editable;
import android.text.TextWatcher;

class an
  implements TextWatcher
{
  an(StructuredFundShengouOrShuhui paramStructuredFundShengouOrShuhui) {}
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramCharSequence.length() == 6) {
      StructuredFundShengouOrShuhui.a(this.a, true);
    }
    while (paramCharSequence.length() != 0) {
      return;
    }
    this.a.g();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\structuredfund\an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */