package com.android.dazhihui.ui.delegate.screen.xc.trade;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import java.math.BigDecimal;

class bo
  implements TextWatcher
{
  bo(ax paramax) {}
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramCharSequence.length() != 0) && (ax.n(this.a).length() != 0) && (!ax.n(this.a).equals(".")))
    {
      paramCharSequence = ax.a(this.a, ax.n(this.a).getText().toString(), paramCharSequence.toString()).toString();
      ax.k(this.a).setVisibility(0);
      ax.k(this.a).setText("￥" + paramCharSequence);
      return;
    }
    ax.k(this.a).setVisibility(4);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\bo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */