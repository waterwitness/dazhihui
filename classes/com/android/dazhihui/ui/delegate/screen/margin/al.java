package com.android.dazhihui.ui.delegate.screen.margin;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import java.math.BigDecimal;

class al
  implements TextWatcher
{
  al(aa paramaa) {}
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramCharSequence.length() != 0) && (aa.x(this.a).length() != 0) && (!paramCharSequence.toString().equals(".")))
    {
      paramCharSequence = aa.a(this.a, paramCharSequence.toString(), aa.x(this.a).getText().toString()).toString();
      aa.y(this.a).setVisibility(0);
      aa.y(this.a).setText("￥" + paramCharSequence);
      if (!aa.z(this.a)) {
        break label138;
      }
      this.a.d();
    }
    label138:
    while ((aa.d(this.a) != 0) && (aa.d(this.a) != 2) && (aa.d(this.a) != 3) && (aa.d(this.a) != 4))
    {
      return;
      aa.y(this.a).setVisibility(4);
      break;
    }
    aa.A(this.a).a = 0;
    aa.A(this.a).b = true;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\margin\al.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */