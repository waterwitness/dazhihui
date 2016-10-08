package com.android.dazhihui.ui.screen.stock;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.ImageView;

class hb
  implements TextWatcher
{
  hb(LoginScreen paramLoginScreen) {}
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramCharSequence.length() > 0)
    {
      LoginScreen.a(this.a).setVisibility(0);
      return;
    }
    LoginScreen.a(this.a).setVisibility(8);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\hb.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */