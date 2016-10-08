package com.android.dazhihui.ui.delegate.screen;

import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.Toast;

class cp
  implements View.OnClickListener
{
  cp(MobileLogin paramMobileLogin) {}
  
  public void onClick(View paramView)
  {
    ((InputMethodManager)this.a.getSystemService("input_method")).hideSoftInputFromWindow(MobileLogin.b(this.a).getWindowToken(), 0);
    if (!MobileLogin.c(this.a)) {
      Toast.makeText(this.a.getApplicationContext(), "网络不给力请重试！", 1).show();
    }
    this.a.a();
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\cp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */