package com.android.dazhihui.ui.delegate.screen.newstock;

import android.text.Editable;
import android.text.TextWatcher;

class u
  implements TextWatcher
{
  u(p paramp) {}
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramCharSequence.length() == 6)
    {
      p.d(this.a, paramCharSequence.toString());
      if (p.j(this.a))
      {
        p.a(this.a, false);
        return;
      }
      p.k(this.a);
      return;
    }
    p.l(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\newstock\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */