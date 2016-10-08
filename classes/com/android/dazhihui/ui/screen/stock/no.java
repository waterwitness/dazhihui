package com.android.dazhihui.ui.screen.stock;

import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.TextView;

class no
  implements TextWatcher
{
  no(NormalRegisterScreen paramNormalRegisterScreen) {}
  
  public void afterTextChanged(Editable paramEditable)
  {
    if (NormalRegisterScreen.d(this.a).getVisibility() == 0)
    {
      NormalRegisterScreen.d(this.a).setVisibility(4);
      NormalRegisterScreen.b(this.a).setBackgroundResource(2130838337);
      NormalRegisterScreen.b(this.a).setTextColor(this.a.getResources().getColor(2131492903));
    }
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\no.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */