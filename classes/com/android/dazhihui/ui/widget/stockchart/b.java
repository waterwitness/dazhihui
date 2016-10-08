package com.android.dazhihui.ui.widget.stockchart;

import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.EditText;

class b
  implements View.OnFocusChangeListener
{
  b(FastDealsView paramFastDealsView) {}
  
  public void onFocusChange(View paramView, boolean paramBoolean)
  {
    if (paramBoolean)
    {
      FastDealsView.a(this.a, (EditText)paramView);
      FastDealsView.h(this.a).setVisibility(0);
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\widget\stockchart\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */