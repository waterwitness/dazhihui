package com.android.dazhihui.ui.screen.stock;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;
import com.android.dazhihui.ui.widget.CustomImgview;

class d
  implements View.OnFocusChangeListener
{
  d(AddWarningActivity paramAddWarningActivity) {}
  
  public void onFocusChange(View paramView, boolean paramBoolean)
  {
    String str = ((EditText)paramView).getText().toString();
    if (paramBoolean) {
      AddWarningActivity.a(this.a).setChecked(true);
    }
    for (;;)
    {
      paramView.postDelayed(new e(this), 100L);
      return;
      if ((str == null) || ("".equals(str))) {
        AddWarningActivity.a(this.a).setChecked(false);
      }
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */