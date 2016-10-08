package com.android.dazhihui.ui.screen.stock;

import android.text.TextUtils;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;

class np
  implements View.OnFocusChangeListener
{
  np(NormalRegisterScreen paramNormalRegisterScreen) {}
  
  public void onFocusChange(View paramView, boolean paramBoolean)
  {
    if ((!paramBoolean) && (NormalRegisterScreen.e(this.a)) && (NormalRegisterScreen.f(this.a) != null))
    {
      paramView = NormalRegisterScreen.f(this.a).getText().toString();
      if (!TextUtils.isEmpty(paramView)) {
        NormalRegisterScreen.a(this.a, paramView);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\np.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */