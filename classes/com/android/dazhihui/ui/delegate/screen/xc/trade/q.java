package com.android.dazhihui.ui.delegate.screen.xc.trade;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;

class q
  implements TextWatcher
{
  q(DailyEarning paramDailyEarning) {}
  
  public void afterTextChanged(Editable paramEditable)
  {
    DailyEarning.a(this.a, DailyEarning.a(this.a).getText().toString());
    if ((DailyEarning.b(this.a) == null) || (DailyEarning.b(this.a).equals("")))
    {
      DailyEarning.a(this.a, "0");
      this.a.b();
    }
    if (DailyEarning.b(this.a).length() < 4)
    {
      this.a.b();
      return;
    }
    DailyEarning.c(this.a).setClickable(true);
    this.a.a();
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\q.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */