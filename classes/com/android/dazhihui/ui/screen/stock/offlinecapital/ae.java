package com.android.dazhihui.ui.screen.stock.offlinecapital;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;

class ae
  implements View.OnFocusChangeListener
{
  ae(ab paramab) {}
  
  public void onFocusChange(View paramView, boolean paramBoolean)
  {
    paramView = (EditText)paramView;
    if (ab.b(this.a) == null) {
      ab.b(this.a, new aa(this.a.a, paramView));
    }
    if (paramBoolean)
    {
      ab.b(this.a).a(paramView);
      paramView.addTextChangedListener(ab.b(this.a));
      return;
    }
    paramView.removeTextChangedListener(ab.b(this.a));
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\offlinecapital\ae.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */