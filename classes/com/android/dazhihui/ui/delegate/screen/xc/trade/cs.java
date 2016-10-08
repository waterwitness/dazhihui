package com.android.dazhihui.ui.delegate.screen.xc.trade;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.android.dazhihui.d.n;

class cs
  implements View.OnClickListener
{
  cs(cr paramcr) {}
  
  public void onClick(View paramView)
  {
    int i = paramView.getId();
    paramView = new Bundle();
    switch (i)
    {
    case 2131560965: 
    case 2131560967: 
    case 2131560970: 
    case 2131560973: 
    case 2131560974: 
    default: 
      return;
    case 2131560966: 
      paramView.putInt("category", 11134);
      this.a.a(TradeQuery.class, paramView);
      n.a("", 1355);
      return;
    case 2131560964: 
      paramView.putInt("category", 11140);
      this.a.a(TradeQuery.class, paramView);
      n.a("", 1354);
      return;
    case 2131560969: 
      paramView.putInt("category", 11136);
      this.a.a(TradeQuery.class, paramView);
      n.a("", 20046);
      return;
    case 2131560968: 
      paramView.putInt("category", 11142);
      this.a.a(TradeQuery.class, paramView);
      n.a("", 1356);
      return;
    case 2131560971: 
      paramView.putInt("category", 11148);
      this.a.a(TradeQuery.class, paramView);
      n.a("", 1357);
      return;
    case 2131560972: 
      paramView.putInt("category", 12024);
      this.a.a(TradeQuery.class, paramView);
      n.a("", 20047);
      return;
    }
    paramView.putInt("category", 11152);
    this.a.a(TradeQuery.class, paramView);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\cs.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */