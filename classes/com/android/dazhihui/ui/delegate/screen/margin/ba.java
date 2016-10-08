package com.android.dazhihui.ui.delegate.screen.margin;

import android.text.Editable;
import android.text.TextWatcher;

class ba
  implements TextWatcher
{
  ba(ax paramax) {}
  
  public void afterTextChanged(Editable paramEditable)
  {
    if (paramEditable.length() == 6)
    {
      ax.a(this.a, paramEditable.toString());
      this.a.c();
      return;
    }
    ax.d(this.a);
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\margin\ba.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */