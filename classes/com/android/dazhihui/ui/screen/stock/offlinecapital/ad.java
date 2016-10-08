package com.android.dazhihui.ui.screen.stock.offlinecapital;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;

class ad
  implements View.OnFocusChangeListener
{
  ad(ab paramab) {}
  
  public void onFocusChange(View paramView, boolean paramBoolean)
  {
    paramView = (EditText)paramView;
    if (ab.a(this.a) == null) {
      ab.a(this.a, new aa(this.a.a, paramView));
    }
    if (paramBoolean)
    {
      ab.a(this.a).a(paramView);
      paramView.addTextChangedListener(ab.a(this.a));
      return;
    }
    paramView.removeTextChangedListener(ab.a(this.a));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\offlinecapital\ad.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */