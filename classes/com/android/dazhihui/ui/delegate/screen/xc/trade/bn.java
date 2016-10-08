package com.android.dazhihui.ui.delegate.screen.xc.trade;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import com.android.dazhihui.ui.delegate.b.o;
import java.math.BigDecimal;

class bn
  implements TextWatcher
{
  bn(ax paramax) {}
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramCharSequence.length() != 0) && (ax.j(this.a).length() != 0) && (!paramCharSequence.toString().equals(".")))
    {
      paramCharSequence = ax.a(this.a, paramCharSequence.toString(), ax.j(this.a).getText().toString()).toString();
      ax.k(this.a).setVisibility(0);
      ax.k(this.a).setText("￥" + paramCharSequence);
      if (!ax.l(this.a)) {
        break label169;
      }
      if (!o.l()) {
        break label144;
      }
      this.a.e();
    }
    label144:
    label169:
    while (ax.d(this.a) != 0)
    {
      return;
      ax.k(this.a).setVisibility(4);
      break;
      if (o.m())
      {
        this.a.e(o.g);
        return;
      }
      this.a.d();
      return;
    }
    ax.m(this.a).a = 0;
    ax.m(this.a).b = true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\bn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */