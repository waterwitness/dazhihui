package com.android.dazhihui.ui.screen.stock;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import com.android.dazhihui.ui.widget.CustomImgview;

class h
  implements View.OnFocusChangeListener
{
  h(AddWarningActivity paramAddWarningActivity) {}
  
  public void onFocusChange(View paramView, boolean paramBoolean)
  {
    paramView = ((EditText)paramView).getText().toString();
    if (paramBoolean) {
      AddWarningActivity.d(this.a).setChecked(true);
    }
    for (;;)
    {
      AddWarningActivity.b(this.a);
      return;
      if ((paramView == null) || ("".equals(paramView))) {
        AddWarningActivity.d(this.a).setChecked(false);
      } else {
        AddWarningActivity.d(this.a).setChecked(true);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */