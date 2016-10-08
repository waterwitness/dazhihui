package com.android.dazhihui.ui.delegate.screen.setplan;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import java.math.BigDecimal;

class i
  implements TextWatcher
{
  i(SetPlanEntrust paramSetPlanEntrust) {}
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (SetPlanEntrust.d(this.a) == 20483)
    {
      if ((!SetPlanEntrust.m(this.a).getText().toString().equals("")) && (!SetPlanEntrust.n(this.a).getText().toString().equals("")))
      {
        SetPlanEntrust.o(this.a).setVisibility(0);
        SetPlanEntrust.o(this.a).setText(this.a.a(SetPlanEntrust.m(this.a).getText().toString(), SetPlanEntrust.n(this.a).getText().toString()).toString() + "元");
      }
    }
    else {
      return;
    }
    SetPlanEntrust.o(this.a).setVisibility(8);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\setplan\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */