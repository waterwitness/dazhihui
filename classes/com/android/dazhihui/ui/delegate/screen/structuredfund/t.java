package com.android.dazhihui.ui.delegate.screen.structuredfund;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import java.math.BigDecimal;

class t
  implements TextWatcher
{
  t(i parami) {}
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramCharSequence.length() != 0) && (i.f(this.a).length() != 0))
    {
      paramCharSequence = i.a(this.a, paramCharSequence.toString(), i.f(this.a).getText().toString()).toString();
      i.g(this.a).setVisibility(0);
      i.g(this.a).setText("￥" + paramCharSequence);
      if (!i.h(this.a)) {
        break label124;
      }
      this.a.e();
    }
    label124:
    while (i.i(this.a) != 0)
    {
      return;
      i.g(this.a).setVisibility(4);
      break;
    }
    i.j(this.a).a = 0;
    i.j(this.a).b = true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\structuredfund\t.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */