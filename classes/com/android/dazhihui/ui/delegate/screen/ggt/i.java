package com.android.dazhihui.ui.delegate.screen.ggt;

import android.text.Editable;
import android.text.TextWatcher;

class i
  implements TextWatcher
{
  i(GgtEntrust paramGgtEntrust) {}
  
  public void afterTextChanged(Editable paramEditable)
  {
    GgtEntrust.k(this.a);
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\ggt\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */