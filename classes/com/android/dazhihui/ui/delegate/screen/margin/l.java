package com.android.dazhihui.ui.delegate.screen.margin;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.PopupWindow;
import com.android.dazhihui.d.r;
import com.android.dazhihui.ui.model.stock.StockVo;

class l
  implements View.OnClickListener
{
  l(h paramh, String paramString1, String paramString2, String paramString3) {}
  
  public void onClick(View paramView)
  {
    switch (paramView.getId())
    {
    default: 
    case 2131560711: 
    case 2131560712: 
      for (;;)
      {
        if (h.e(this.d) != null) {
          h.e(this.d).dismiss();
        }
        return;
        ((MarginCommonScreen)this.d.getActivity()).b = this.a;
        ((MarginCommonScreen)this.d.getActivity()).a(0);
        continue;
        ((MarginCommonScreen)this.d.getActivity()).b = this.a;
        ((MarginCommonScreen)this.d.getActivity()).c = this.b;
        ((MarginCommonScreen)this.d.getActivity()).a(1);
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


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\delegate\screen\margin\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */