package com.android.dazhihui.ui.delegate.screen.structuredfund;

import android.text.Editable;
import android.text.TextWatcher;

class s
  implements TextWatcher
{
  s(i parami) {}
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramCharSequence.toString().length() == 6)
    {
      i.a(this.a, paramCharSequence.toString());
      i.e(this.a);
      return;
    }
    i.c(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\structuredfund\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */