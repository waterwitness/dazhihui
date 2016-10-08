package com.android.dazhihui.ui.delegate.screen.hk;

import android.text.Editable;
import android.text.InputFilter;
import android.text.InputFilter.LengthFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.widget.EditText;

class ai
  implements TextWatcher
{
  ai(HKEntrust paramHKEntrust) {}
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (HKEntrust.a(this.a))
    {
      paramCharSequence = HKEntrust.b(this.a).getText().toString().toUpperCase();
      if (!TextUtils.isEmpty(paramCharSequence)) {
        HKEntrust.a(this.a, paramCharSequence);
      }
      this.a.a(true, true);
      HKEntrust.a(this.a, false);
      return;
    }
    if (((bk.i(paramCharSequence.toString())) && (paramCharSequence.length() >= 5) && (paramCharSequence.length() <= 6)) || ((paramCharSequence.length() > 0) && (bk.g(paramCharSequence.toString()))))
    {
      HKEntrust.c(this.a).a = 0;
      HKEntrust.c(this.a).b = true;
      return;
    }
    if (bk.i(paramCharSequence.toString()))
    {
      HKEntrust.b(this.a).setFilters(new InputFilter[] { new InputFilter.LengthFilter(6) });
      return;
    }
    HKEntrust.b(this.a).setFilters(new InputFilter[] { new InputFilter.LengthFilter(100) });
    HKEntrust.d(this.a);
    HKEntrust.e(this.a);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hk\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */