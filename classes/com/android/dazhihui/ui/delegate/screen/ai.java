package com.android.dazhihui.ui.delegate.screen;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.dazhihui.ui.widget.TableLayoutGroup;

class ai
  implements TextWatcher
{
  ai(EntrustNew paramEntrustNew) {}
  
  public void afterTextChanged(Editable paramEditable) {}
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3)
  {
    if (paramCharSequence.length() == 6)
    {
      EntrustNew.a(this.a, paramCharSequence.toString());
      if (EntrustNew.k(this.a) == 1)
      {
        EntrustNew.l(this.a).setVisibility(0);
        EntrustNew.m(this.a).setVisibility(0);
        EntrustNew.g(this.a).setVisibility(8);
      }
      this.a.b();
      ((InputMethodManager)this.a.getSystemService("input_method")).hideSoftInputFromWindow(EntrustNew.b(this.a).getWindowToken(), 0);
    }
    do
    {
      return;
      EntrustNew.b(this.a, null);
      EntrustNew.c(this.a, null);
      EntrustNew.d(this.a, null);
      EntrustNew.e(this.a, null);
      EntrustNew.c(this.a).setText("");
      EntrustNew.h(this.a).setText("");
      EntrustNew.n(this.a).setText("---");
      EntrustNew.j(this.a).setText("---股");
      EntrustNew.o(this.a).setText("");
      EntrustNew.p(this.a).setText("");
      EntrustNew.e(this.a, 0);
    } while (EntrustNew.k(this.a) != 1);
    EntrustNew.l(this.a).setVisibility(8);
    EntrustNew.m(this.a).setVisibility(8);
    EntrustNew.g(this.a).setVisibility(0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\ai.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */