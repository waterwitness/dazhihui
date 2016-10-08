package com.android.dazhihui.ui.screen.stock;

import android.content.res.Resources;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

class nn
  implements TextWatcher
{
  nn(NormalRegisterScreen paramNormalRegisterScreen) {}
  
  public void afterTextChanged(Editable paramEditable)
  {
    NormalRegisterScreen.a(this.a, true);
    if (NormalRegisterScreen.a(this.a).getVisibility() == 0)
    {
      NormalRegisterScreen.a(this.a).setVisibility(4);
      NormalRegisterScreen.b(this.a).setBackgroundResource(2130838337);
      NormalRegisterScreen.b(this.a).setTextColor(this.a.getResources().getColor(2131492903));
    }
    if ((paramEditable != null) && (paramEditable.length() > 0))
    {
      NormalRegisterScreen.c(this.a).setVisibility(0);
      return;
    }
    NormalRegisterScreen.c(this.a).setVisibility(8);
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\nn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */