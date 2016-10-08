package com.android.dazhihui.ui.delegate.screen.ggt;

import android.os.Handler;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;

class h
  implements TextWatcher
{
  h(GgtEntrust paramGgtEntrust) {}
  
  public void afterTextChanged(Editable paramEditable)
  {
    if (GgtEntrust.c(this.a).getText().toString().length() == 0) {
      GgtEntrust.d(this.a).removeMessages(0);
    }
    if ((GgtEntrust.a(this.a).getText().toString().length() == 5) && (!GgtEntrust.e(this.a).getText().equals("")))
    {
      if ((!GgtEntrust.f(this.a)) && (!GgtEntrust.g(this.a).equals(GgtEntrust.c(this.a).getText().toString()))) {
        GgtEntrust.a(this.a, true);
      }
      GgtEntrust.b(this.a, GgtEntrust.c(this.a).getText().toString());
      GgtEntrust.a(this.a, 0);
      if (!GgtEntrust.h(this.a).equals("0")) {
        break label208;
      }
      GgtEntrust.i(this.a).setText(" ");
      if (!GgtEntrust.j(this.a)) {
        break label228;
      }
      GgtEntrust.d(this.a).sendEmptyMessage(0);
      GgtEntrust.b(this.a, false);
    }
    for (;;)
    {
      GgtEntrust.k(this.a);
      return;
      label208:
      GgtEntrust.i(this.a).setText(GgtEntrust.h(this.a));
      break;
      label228:
      GgtEntrust.d(this.a).removeMessages(0);
      GgtEntrust.d(this.a).sendEmptyMessageDelayed(0, 2000L);
    }
  }
  
  public void beforeTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
  
  public void onTextChanged(CharSequence paramCharSequence, int paramInt1, int paramInt2, int paramInt3) {}
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\ggt\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */