package com.android.dazhihui.ui.delegate.screen.margin;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import java.math.BigDecimal;

class am
  implements TextWatcher
{
  am(aa paramaa) {}
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramCharSequence.length() != 0) && (aa.g(this.a).length() != 0) && (!aa.g(this.a).toString().equals(".")))
    {
      paramCharSequence = aa.a(this.a, aa.g(this.a).getText().toString(), paramCharSequence.toString()).toString();
      aa.y(this.a).setVisibility(0);
      aa.y(this.a).setText("￥" + paramCharSequence);
      return;
    }
    aa.y(this.a).setVisibility(4);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\margin\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */