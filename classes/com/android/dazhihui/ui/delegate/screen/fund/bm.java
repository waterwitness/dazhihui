package com.android.dazhihui.ui.delegate.screen.fund;

import android.view.KeyEvent;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.TextView.OnEditorActionListener;

class bm
  implements TextView.OnEditorActionListener
{
  bm(FundOpenForm paramFundOpenForm) {}
  
  public boolean onEditorAction(TextView paramTextView, int paramInt, KeyEvent paramKeyEvent)
  {
    ((InputMethodManager)this.a.getSystemService("input_method")).hideSoftInputFromWindow(FundOpenForm.a(this.a).getWindowToken(), 0);
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\fund\bm.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */