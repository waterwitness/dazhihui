package com.android.dazhihui.ui.delegate.screen;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;

class co
  implements TextWatcher
{
  co(MobileLogin paramMobileLogin) {}
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramCharSequence.length() == 0)
    {
      MobileLogin.a(this.a).setBackgroundResource(2130837588);
      MobileLogin.a(this.a).setTextColor(-16777216);
      MobileLogin.a(this.a).setEnabled(false);
      return;
    }
    MobileLogin.a(this.a).setBackgroundResource(2130837584);
    MobileLogin.a(this.a).setTextColor(-1);
    MobileLogin.a(this.a).setEnabled(true);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\co.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */