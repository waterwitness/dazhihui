package com.android.dazhihui.ui.screen.stock;

import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;

class z
  implements TextWatcher
{
  z(v paramv) {}
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if ((paramCharSequence != null) && (paramCharSequence.length() > 0))
    {
      v.g(this.a).setTextColor(this.a.getResources().getColor(2131493017));
      v.g(this.a).setBackgroundResource(2130837557);
      return;
    }
    v.g(this.a).setTextColor(this.a.getResources().getColor(2131493018));
    v.g(this.a).setBackgroundResource(2130837560);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\z.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */