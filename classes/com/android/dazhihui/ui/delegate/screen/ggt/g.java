package com.android.dazhihui.ui.delegate.screen.ggt;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

class g
  implements TextWatcher
{
  g(GgtEntrust paramGgtEntrust) {}
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramCharSequence.length() == 5)
    {
      GgtEntrust.a(this.a, paramCharSequence.toString());
      ((InputMethodManager)this.a.getSystemService("input_method")).hideSoftInputFromWindow(GgtEntrust.a(this.a).getWindowToken(), 0);
      this.a.a(false);
      return;
    }
    GgtEntrust.a(this.a, null);
    GgtEntrust.b(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\ggt\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */