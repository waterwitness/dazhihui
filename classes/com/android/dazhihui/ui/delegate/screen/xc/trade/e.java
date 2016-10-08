package com.android.dazhihui.ui.delegate.screen.xc.trade;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.model.stock.StockVo;

class e
  implements View.OnClickListener
{
  e(a parama, String paramString1, String paramString2, String paramString3) {}
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
    case 2131560711: 
    case 2131560712: 
      for (;;)
      {
        if (a.e(this.d) != null) {
          a.e(this.d).dismiss();
        }
        return;
        ((TradeCommonStock)this.d.getActivity()).b = this.a;
        ((TradeCommonStock)this.d.getActivity()).a(0);
        continue;
        ((TradeCommonStock)this.d.getActivity()).b = this.a;
        ((TradeCommonStock)this.d.getActivity()).c = this.b;
        ((TradeCommonStock)this.d.getActivity()).a(1);
      }
    }
    Bundle localBundle = new Bundle();
    if ((this.a.startsWith("0")) || (this.a.startsWith("1")) || (this.a.startsWith("2")) || (this.a.startsWith("3")) || (this.a.startsWith("4"))) {}
    for (paramView = "SZ" + this.a;; paramView = "SH" + this.a)
    {
      paramView = new StockVo(this.c, paramView, 1, false);
      localBundle.putParcelable("stock_vo", paramView);
      r.a(this.d.getActivity(), paramView, localBundle);
      break;
    }
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\xc\trade\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */