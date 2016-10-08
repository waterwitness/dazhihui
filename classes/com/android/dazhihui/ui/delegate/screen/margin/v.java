package com.android.dazhihui.ui.delegate.screen.margin;

import android.text.Editable;
import android.text.TextWatcher;

class v
  implements TextWatcher
{
  v(t paramt) {}
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramCharSequence.length() == 6)
    {
      t.a(this.a, paramCharSequence.toString());
      t.b(this.a);
      return;
    }
    t.c(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\margin\v.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */