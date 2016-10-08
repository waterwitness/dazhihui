package com.android.dazhihui.ui.screen.stock.a;

import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.PopupWindow;

class g
  implements AdapterView.OnItemClickListener
{
  g(f paramf) {}
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    this.a.c.dismiss();
    this.a.a(paramInt);
  }
}


/* Location:              E:\apk\dazhihui2\classes-dex2jar.jar!\com\android\dazhihui\ui\screen\stock\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */