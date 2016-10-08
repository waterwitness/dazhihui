package com.android.dazhihui.ui.delegate.screen;

import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;

class s
  implements View.OnClickListener
{
  s(CapitalandHoldingTable paramCapitalandHoldingTable) {}
  
  public void onClick(View paramView)
  {
    CapitalandHoldingTable.a(this.a, 1);
    this.a.a();
    CapitalandHoldingTable.e(this.a).setTextColor(CapitalandHoldingTable.a(this.a));
    CapitalandHoldingTable.b(this.a).setTextColor(CapitalandHoldingTable.d(this.a));
    CapitalandHoldingTable.g(this.a).setTextColor(CapitalandHoldingTable.d(this.a));
    CapitalandHoldingTable.c(this.a).setBackgroundColor(-1);
    CapitalandHoldingTable.f(this.a).setBackgroundResource(2130838694);
    CapitalandHoldingTable.h(this.a).setBackgroundColor(-1);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\s.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */