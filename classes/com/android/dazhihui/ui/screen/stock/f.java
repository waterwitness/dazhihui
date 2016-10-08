package com.android.dazhihui.ui.screen.stock;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import com.android.dazhihui.ui.widget.CustomImgview;

class f
  implements View.OnFocusChangeListener
{
  f(AddWarningActivity paramAddWarningActivity) {}
  
  public void onFocusChange(View paramView, boolean paramBoolean)
  {
    paramView = ((EditText)paramView).getText().toString();
    if (paramBoolean) {
      AddWarningActivity.c(this.a).setChecked(true);
    }
    while ((paramView != null) && (!"".equals(paramView))) {
      return;
    }
    AddWarningActivity.c(this.a).setChecked(false);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */