package com.android.dazhihui.ui.delegate.screen;

import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import com.android.dazhihui.ui.widget.bq;

class hn
  implements bq
{
  hn(TransferMenuNew paramTransferMenuNew) {}
  
  public void a()
  {
    InputMethodManager localInputMethodManager = (InputMethodManager)this.a.getSystemService("input_method");
    localInputMethodManager.hideSoftInputFromWindow(TransferMenuNew.i(this.a).getWindowToken(), 0);
    localInputMethodManager.hideSoftInputFromWindow(TransferMenuNew.j(this.a).getWindowToken(), 0);
    localInputMethodManager.hideSoftInputFromWindow(TransferMenuNew.k(this.a).getWindowToken(), 0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\hn.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */