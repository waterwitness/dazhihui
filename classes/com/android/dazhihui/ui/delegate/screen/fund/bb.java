package com.android.dazhihui.ui.delegate.screen.fund;

import android.text.Editable;
import android.text.TextWatcher;

class bb
  implements TextWatcher
{
  bb(FundMutualAIPOpen paramFundMutualAIPOpen) {}
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    FundMutualAIPOpen.a(this.a, "0");
    if (paramCharSequence.length() == 6)
    {
      this.a.b();
      return;
    }
    FundMutualAIPOpen.a(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\bb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */