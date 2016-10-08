package com.android.dazhihui.ui.delegate.screen.setplan;

import android.text.Editable;
import android.text.TextWatcher;

class q
  implements TextWatcher
{
  q(SetPlanEntrust paramSetPlanEntrust) {}
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramCharSequence.length() == 6)
    {
      if (this.a.h == null)
      {
        SetPlanEntrust.h(this.a);
        SetPlanEntrust.a(this.a, paramCharSequence.toString());
        return;
      }
      SetPlanEntrust.b(this.a, paramCharSequence.toString());
      return;
    }
    SetPlanEntrust.i(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\setplan\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */