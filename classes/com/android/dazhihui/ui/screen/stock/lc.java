package com.android.dazhihui.ui.screen.stock;

import android.widget.LinearLayout;
import android.widget.SearchView.OnCloseListener;

class lc
  implements SearchView.OnCloseListener
{
  lc(kz paramkz) {}
  
  public boolean onClose()
  {
    this.a.n.setVisibility(8);
    this.a.a(Boolean.valueOf(false), this.a.k);
    return false;
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\lc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */