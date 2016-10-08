package com.android.dazhihui.ui.delegate.screen;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;

class cv
  implements View.OnClickListener
{
  cv(MobileLoginHS paramMobileLoginHS) {}
  
  public void onClick(View paramView)
  {
    ((InputMethodManager)this.a.getSystemService("input_method")).hideSoftInputFromWindow(MobileLoginHS.b(this.a).getWindowToken(), 0);
    this.a.a();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\cv.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */