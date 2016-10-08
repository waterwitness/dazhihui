package com.android.dazhihui.ui.delegate.screen.structuredfund;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import java.math.BigDecimal;

class u
  implements TextWatcher
{
  u(i parami) {}
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramCharSequence.length() != 0) && (i.k(this.a).length() != 0))
    {
      paramCharSequence = i.a(this.a, i.k(this.a).getText().toString(), paramCharSequence.toString()).toString();
      i.g(this.a).setVisibility(0);
      i.g(this.a).setText("￥" + paramCharSequence);
      return;
    }
    i.g(this.a).setVisibility(4);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\structuredfund\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */