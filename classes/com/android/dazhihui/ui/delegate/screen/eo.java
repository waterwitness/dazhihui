package com.android.dazhihui.ui.delegate.screen;

import android.support.v4.app.FragmentActivity;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.inputmethod.InputMethodManager;

class eo
  implements View.OnClickListener
{
  eo(dy paramdy) {}
  
  public void onClick(View paramView)
  {
    dy.a(this.a, dy.b(this.a));
    ((InputMethodManager)this.a.getActivity().getSystemService("input_method")).hideSoftInputFromWindow(dy.a(this.a).getWindowToken(), 0);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\eo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */