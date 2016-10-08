package com.android.dazhihui.ui.delegate.screen.margin;

import android.text.Editable;
import android.text.TextWatcher;

class ak
  implements TextWatcher
{
  ak(aa paramaa) {}
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramCharSequence.toString().length() == 6)
    {
      aa.d(this.a, paramCharSequence.toString());
      aa.w(this.a);
      return;
    }
    aa.c(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\margin\ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */